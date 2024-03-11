import entities.ValidatorConstructor;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //testing library
        ValidatorConstructor validator = new ValidatorConstructor();

        String results = validator.validateCPF("12345678910");

        System.out.println(results);
    }
}