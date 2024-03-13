package Exceptions;

import entities.ReturnStatement;

public class PhoneExceptions {
    public static void invalidateLen() throws Exception{
        throw new ReturnStatement("it cannot have less then 9 chars or more", 500);
    }
    public static void invalidateLen(String ErrorMessage) throws Exception{
        throw new ReturnStatement(ErrorMessage, 500);
    }
}
