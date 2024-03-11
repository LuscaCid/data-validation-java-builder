package entities;

import Interfaces.ValidationMethods;

public class ParserBuilder implements ValidationMethods {

    @Override
    public void validateCPF(String cpf) throws Exception {

        CPFParser cpfValidator = new CPFParser(cpf);

        boolean results = cpfValidator.validateCPF();

        if(!results) throw new Exception("invalid CPF");
    }


    @Override
    public Object validatePhone(String number) {
        return null;
    }

    @Override
    public Object validateEmail(String email) {
        return null;
    }
}
