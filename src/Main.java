import Exceptions.EmailExceptions;
import entities.EmailParser;
import entities.ParserBuilder;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws Exception {

        //testing library bellow, what have to do is basic instantiate a validator
        ParserBuilder validator = new ParserBuilder();
        String fakeCPF = "12345678910";
        try {
            validator.validateCPF(fakeCPF);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            validator.validateEmail("lucasgmail.com");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}