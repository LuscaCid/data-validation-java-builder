package Interfaces;

public interface ValidationMethods {
    public void validateCPF(String cpf) throws Exception;
    public Object validatePhone(String number);
    public Object validateEmail(String email);

}
