package Exceptions;

import entities.ReturnStatement;

public class CepException{
    public static void InvalidateLength(String message) throws ReturnStatement {
        throw new ReturnStatement(message, 401);
    }
}
