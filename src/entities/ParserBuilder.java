package entities;

import Exceptions.CPFExceptions;
import Interfaces.ValidationMethods;

public class ParserBuilder implements ValidationMethods {

    @Override
    public void validateCPF(String cpf) throws Exception {

        CPFParser cpfValidator = new CPFParser(cpf);

        boolean results = cpfValidator.validateCPF();

        if(!results)CPFExceptions.InvalidateCPF();

    }

    @Override
    public void validatePhone(String number) {
    }
    @Override
    public void validateEmail(String email) throws Exception {
        EmailParser emailParser = new EmailParser(email);
        String response = emailParser.validateEmail();
        System.out.println(response);
    }
}
