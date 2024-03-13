package entities;

import Exceptions.CPFExceptions;
import Interfaces.ValidationMethods;

import java.util.ArrayList;

public class ParserBuilder implements ValidationMethods {

    @Override
    public void validateCep(String Cep) throws Exception {
        CepParser cepParser = new CepParser(Cep);
        cepParser.validateCEP();
    }
    public String validateCepQuery(String Cep) throws Exception {
        CepParser cepParser = new CepParser(Cep);
        return cepParser.validateCEP();
    }

    @Override
    public void validateCPF(String cpf) throws Exception {

        CPFParser cpfValidator = new CPFParser(cpf);

        boolean results = cpfValidator.validateCPF();

        if(!results)CPFExceptions.InvalidateCPF();

    }

    @Override
    public PhoneParser validatePhone(String number) throws Exception {
        return new PhoneParser(number);
    }
    public void validatePhone(String [] number) throws Exception {
        PhoneParser validator = new PhoneParser(number);
        var invalidPhonesArray = validator.validateArrayPhones();

        if (!invalidPhonesArray.isEmpty()) {
            for (String s : invalidPhonesArray) {
                System.out.println("Numero de telefone invalido: " + s);
            }
            throw new ReturnStatement("há emails invalidos", 401);
        }
    }
    public void validatePhone(ArrayList<String> number) throws Exception {
        PhoneParser validator = new PhoneParser(number);
        var invalidPhonesArray = validator.validateArrayPhones();

        if (!invalidPhonesArray.isEmpty()) {
            for (String s : invalidPhonesArray) {
                System.out.println("Numero de telefone invalido: " + s);
            }
            throw new ReturnStatement("há emails invalidos", 401);
        }
    }

    @Override
    public void validateEmail(String email) throws Exception {
        EmailParser emailParser = new EmailParser(email);

        String response = emailParser.validateEmail();

        System.out.println(response); //only for see the data
    }

    public void validatePassword(){}
    public void validatePasswordList(){}
}
