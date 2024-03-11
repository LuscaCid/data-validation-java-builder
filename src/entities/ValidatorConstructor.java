package entities;

import Interfaces.ValidationMethods;

public class ValidatorConstructor implements ValidationMethods {

    @Override
    public String validateCPF(String cpf){
        CPFValidator cpfValidator = new CPFValidator(cpf);
        boolean results = cpfValidator.validateCPF();
        if(!results) return  "Cpf Invalido";
        return "Cpf valido";
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
