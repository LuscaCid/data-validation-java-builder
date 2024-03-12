package entities;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.concurrent.CompletableFuture;

import Returns.RequestObjects;
import Interfaces.ICep;

public class CepParser implements ICep {
    private String cep;
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
        CompletableFuture<String> responseFutere = client.sendAsync(request, HttpResponse.BodyHandlers.ofString())
        .thenApply(HttpResponse::body);

        responseFutere.thenAccept(responseBody ->  {
            this.fetchResponse = responseBody;
        });

        
        responseFutere.join();
    }
    public String validateCEP() throws Exception {
        
        parseLength(); //validates cep len
        this.fetchCep(); // validate if is real

        if(this.fetchResponse.contains("erro")){
            throw new ReturnStatement("Cep enviado nao encontrado", 404);
        };
        return this.fetchResponse;
    }
    @Override
    public void parseLength() throws Exception{
        if(this.cep.length() < 7)throw new ReturnStatement("O Cep deve conter 7 caracteres.", 401);
        
    }
}
