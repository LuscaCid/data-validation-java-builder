package Exceptions;

import entities.ReturnStatement;

public class CepException{
    public static void InvalidateLength(String message) throws ReturnStatement {
        throw new ReturnStatement(message, 401);
    }

    public static void cepNotFound(String message)throws Exception{
        throw new ReturnStatement(message, 404);
    }
    public static void cepNotFound()throws Exception{
        throw new ReturnStatement("CEP not found", 404);
    }
}
