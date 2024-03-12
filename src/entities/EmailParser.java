package entities;
import Exceptions.EmailExceptions;
import Interfaces.IEmailValidator;
import Returns.GenericReturn;

public class EmailParser implements IEmailValidator {
    private final String email;
    public EmailParser(String email) {
        this.email = email;
    }

    public String validateEmail() throws Exception {
        this.containsDotCom();
        this.containsAtSign();
        this.containsSpaces();
        return new ReturnStatement("Success validating email").toString();
    }
    @Override
    public GenericReturn<Object, String> containsDotCom() throws Exception {

        boolean contains =
            this.email.contains(".com") ||
            this.email.contains(".net") ||
            this.email.contains(".gov") ||
            this.email.contains(".app") ||
            this.email.contains(".ba") ||
            this.email.contains(".io") ||
            this.email.contains(".br");

        if(!contains)EmailExceptions.WithoutDotCom("o E-mail falta com um dominio correto");
        return new GenericReturn<>(this.email);
    }

    @Override
    public GenericReturn<Object, String> containsAtSign() throws Exception{
        boolean contains = this.email.contains("@");
        if(!contains) EmailExceptions.WithoutAtSign();

        return new GenericReturn<>(this.email);
    }

    @Override
    public GenericReturn<Object, String> containsSpaces()throws Exception {
        if(this.email.contains(" "))EmailExceptions.containsWhiteSpaces("O email nao pode ter espacos em branco");
        return new GenericReturn<>("que delicia");

    }

}
