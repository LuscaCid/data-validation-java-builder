package entities;

import Exceptions.CPFExceptions;
import Interfaces.ValidationMethods;

import java.util.ArrayList;

public class ParserBuilder implements ValidationMethods {
    //cep validation 
    @Override
    public void validateCep(String Cep) throws Exception {
        CepParser cepParser = new CepParser(Cep);
        cepParser.validateCEP();
    }

    //cepquery validation
    public String validateCepQuery(String Cep) throws Exception {
        CepParser cepParser = new CepParser(Cep);
        return cepParser.validateCEP();
    }
    // cpf validation
    @Override
    public void validateCPF(String cpf) throws Exception {

        CPFParser cpfValidator = new CPFParser(cpf);

        boolean results = cpfValidator.validateCPF();

        if(!results)CPFExceptions.InvalidateCPF();

    }


    //phone validation
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

    //email validation
    @Override
    public void validateEmail(String email) throws Exception {
        EmailParser emailParser = new EmailParser(email);

        String response = emailParser.validateEmail();

        System.out.println(response); //only for see the data
    }


    //password validation
    public void validatePassword(String password){
        PasswordParser passwordParser = new PasswordParser(password);
        var weak = passwordParser.getWeakMediator();
        System.out.println(weak.isOkWithLen);
        System.out.println(weak.isOkWithSpecialChars);
    }
    public void validatePassword(String[] password){
        PasswordParser passwordParser = new PasswordParser(password);
        var weak = passwordParser.getWeakMediator();
        System.out.println(weak.isOkWithLen);
        System.out.println(weak.isOkWithSpecialChars);
    }
}
