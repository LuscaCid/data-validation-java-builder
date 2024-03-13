package entities;

import java.util.ArrayList;

public class PasswordParser {

    private final String password;
    private String [] passwordList;
    private WeakMediator weakMediator;

    private ArrayList<String> invalidSpecialCharsPasswords ;
    private ArrayList<String> invalidLenPasswords ;

    public PasswordParser (String password){
        this.password = password;
        this.passwordList = null;
        boolean specialChars = this.validateSpecialChars();
        boolean lessLenThanNormal = this.validateLen();
        this.weakMediator = new WeakMediator(lessLenThanNormal, specialChars);

    }

    public PasswordParser (String [] passwordList ) {
        this.password = null;
        this.passwordList = passwordList ;
        
        boolean specialChars = this.validateSpecialCharsOfList();
        boolean lessLenThanNormal = this.validateLenOfList();
        
        this.weakMediator = new WeakMediator(lessLenThanNormal, specialChars);

    }

    private boolean validateSpecialChars() {
        if(!(
            this.password.contains("!") 
            || password.contains("@")
            || password.contains("#")
            || password.contains("%")
            || password.contains("&")
            || password.contains("*")
            || password.contains("(")
            || password.contains(")")
            || password.contains("_")
            || password.contains("-")
            || password.contains("+")
        )) {
            return false;
        }
        return true;
    }
    private boolean validateLen(){
        return this.password.length() < 8; 
    }
    private boolean validateLenOfList() {
        
        for(String password : this.passwordList) {
            if(password.length() < 8){
                this.invalidLenPasswords.add(password);
            }
        }
        return this.invalidLenPasswords.size() > 0;
    }

    private boolean validateSpecialCharsOfList() {
        for(String password : this.passwordList) {
            if(!(
                password.contains("!") 
                || password.contains("@")
                || password.contains("#")
                || password.contains("%")
                || password.contains("&")
                || password.contains("*")
                || password.contains("(")
                || password.contains(")")
                || password.contains("_")
                || password.contains("-")
                || password.contains("+")
            )) {
                this.invalidSpecialCharsPasswords.add(password);
            }
        }
        return this.invalidSpecialCharsPasswords.size() > 0;
    }
    
}
