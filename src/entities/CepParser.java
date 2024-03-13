package entities;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.concurrent.CompletableFuture;

import Exceptions.CepException;
import Returns.RequestObjects;
import Interfaces.ICep;

public class CepParser implements ICep {
    private final String cep;
    public String fetchResponse;
    
    public CepParser(String Cep) {
        this.cep = Cep;
    }

    public void fetchCep() {
        String endPoint = "https://viacep.com.br/ws/" + this.cep + "/json/";
       // create a client
        HttpClient client = HttpClient.newHttpClient();

        // create a request
        var request = HttpRequest.newBuilder(
            URI.create(endPoint))
        .header("accept", "application/json")
        .build();

        // use the client to send the request
        CompletableFuture<String> responseFuture = client.sendAsync(request, HttpResponse.BodyHandlers.ofString())
        .thenApply(HttpResponse::body);

        responseFuture.thenAccept(responseBody ->  {
            this.fetchResponse = responseBody;
        });

        responseFuture.join();
    }
    public String validateCEP() throws Exception {
        parseLength(); //validates cep len
        this.fetchCep(); // validate if is real

        if(this.fetchResponse.contains("erro")){
            CepException.cepNotFound("Cep enviado nao encontrado");
            //CepException.cepNotFound() without a message works too
        };
        return this.fetchResponse;
    }
    @Override
    public void parseLength() throws Exception{
        if(this.cep.length() < 7)CepException.InvalidateLength("A quantidade caracteres nao pode ser inferior a 7.");
        else if(this.cep.length() > 9)CepException.InvalidateLength("A quantidade caracteres nao pode ser maior que 9.");
    }
}
