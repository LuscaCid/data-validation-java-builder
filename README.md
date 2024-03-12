# Validating data project

### this module was though by developer to developers

parsing data and validating some types and formats passed by params like an constructor, an builder

usage 
````java
import Exceptions.EmailExceptions;
import entities.EmailParser;
import entities.ParserBuilder;

public class Main {
    public static void main(String[] args) throws Exception {

        //testing library bellow, what have to do is basic instantiate a validator
        ParserBuilder validator = new ParserBuilder();
        String fakeCPF = "12345978910";
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
````
it is necessary to instantiate de validator and call the function related as the data that is passed in params
it is completely simple to use and only needs to treatment the possible error that outcomes inside function called with a try catch block


inside de code...

``````java
    
