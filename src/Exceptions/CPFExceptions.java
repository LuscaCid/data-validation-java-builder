package Exceptions;

public class CPFExceptions {

    public static void MustHave11Chars(String message) throws Exception{
        throw new Exception(message);
    }
    public static void fewChars() throws Exception{
        throw new Exception("Few Chars passed to validate cpf.");
    }
    public static void InvalidateCPF()throws  Exception {
        throw  new Exception("CPF invalido!");
    }
}
