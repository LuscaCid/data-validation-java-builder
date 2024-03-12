package entities;

import Interfaces.ICep;

public class CepParser implements ICep {
    private String cep;
    public CepParser(String Cep) {
        this.cep = Cep;

    }


    @Override
    public void parseLength() throws Exception{
        if(this.cep.length() < 7)throw new ReturnStatement("O Cep deve conter 7 caracteres.", 401);

    }
}
