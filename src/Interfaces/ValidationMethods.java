package Interfaces;

import entities.PhoneParser;

public interface ValidationMethods {
    public void validateCep (String Cep) throws Exception;
    public void validateCPF(String cpf) throws Exception;
    public PhoneParser validatePhone(String number) throws Exception;
    public void validateEmail(String email) throws Exception;

}
