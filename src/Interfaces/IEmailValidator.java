package Interfaces;

import Returns.GenericReturn;
import entities.ReturnStatement;

public interface IEmailValidator {
    public GenericReturn<Object, String> containsDotCom()throws Exception;
    public GenericReturn<Object, String> containsAtSign() throws Exception;
    public GenericReturn<Object, String> containsSpaces() throws Exception;


}
