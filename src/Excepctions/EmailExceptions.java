package Excepctions;

public class EmailExceptions {

    public static void WithoutAtSign(String ErrorMessageOrEmpty) throws Exception {
        throw new Exception(ErrorMessageOrEmpty);

    }
    public static void WithoutAtSign() throws Exception {
        throw new Exception("Must have inside email the at Sign.");

    }
    public static void WithoutDotCom(String message)throws Exception {
        throw new Exception(message);
    }
    public static void WithoutDotCom()throws Exception {
        throw new Exception("Must have an final domain in email.");
    }
}
