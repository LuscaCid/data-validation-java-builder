package Exceptions;

import entities.ReturnStatement;

public class EmailExceptions extends Throwable {

    public static void WithoutAtSign(String ErrorMessageOrEmpty) throws Exception {
        throw new Exception(ErrorMessageOrEmpty);

    }
    public static void WithoutAtSign() throws Exception {
        throw new ReturnStatement("Must have inside email the at Sign.",400);

    }
    public static void WithoutDotCom(String message)throws Exception {
        throw new ReturnStatement(message,400);
    }
    public static void WithoutDotCom()throws Exception {
        throw new ReturnStatement("Must have an final domain in email.", 403);
    }

    public static void containsWhiteSpaces(String message) throws Exception {
        throw new ReturnStatement(message, 400);
    }
    public static void containsWhiteSpaces() throws  Exception {
        throw new ReturnStatement("Invalid email cuz has white spaces", 400);
    }
}
