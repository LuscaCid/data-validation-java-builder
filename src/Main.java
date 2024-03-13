import entities.ParserBuilder;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
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
        try {
            //validator.validateCep("40334410"); // without returns and throws an exception
            String res = validator.validateCepQuery("40330410"); //return fetch response
            System.out.println(res + " with returns");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            String [] arrayPhones = new String[4];
            arrayPhones[1] = "91922334455";
            arrayPhones[0] = "32922323235";
            arrayPhones[3] = "23922334455";
            arrayPhones[2] = "1192233445";
            validator.validatePhone(arrayPhones);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


        try {
            String password = "dakjsda2321dsfasdas";
            validator.validatePassword(password);
        } catch (Exception e) {

        }

    }
}