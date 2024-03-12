package Interfaces;

public interface ValidationMethods {
    public void validateCep (String Cep) throws Exception;
    public void validateCPF(String cpf) throws Exception;
    public void validatePhone(String number);
    public void validateEmail(String email) throws Exception;

}
