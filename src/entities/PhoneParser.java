package entities;

import Exceptions.PhoneExceptions;

import java.util.ArrayList;
import java.util.Arrays;

public class PhoneParser {
    private final String phone;
    private final String [] listPhones;
    private final ArrayList<String> phones;

    private final ArrayList<String> invalidatedPhones = new ArrayList<>();

    private final ArrayList<String> invalidateList = new ArrayList<>();
    public PhoneParser(String phone) throws Exception{
        this.phone = phone;
        this.phones = null;
        this.listPhones = null;
        this.validateSingletonPhone();
    }
    public PhoneParser(String [] phones) {
        this.listPhones = phones;
        this.phone = null;
        this.phones = null;
    }
    public PhoneParser(ArrayList<String> phones) {
        this.phones = phones;
        this.phone = null;
        this.listPhones = null;
    }

    public ArrayList<String> validateArrayPhones() {
        for (String s : this.listPhones) {
            if (s.length() != 11) {
                this.invalidateList.add(s);
            }
        }
        return this.invalidateList;
    }

    public ArrayList<String> validateManyPhones(){
        for (String s : this.phones) {
            if (s.length() != 11) {
                this.invalidatedPhones.add(s);
            }
        }
        return this.invalidatedPhones;
    }

    private void validateSingletonPhone() throws Exception{

        if(this.phone.length() < 11) PhoneExceptions.invalidateLen("o numero de celular nao pode possuir menos que 11 caracteres");
        if(this.phone.length() > 11) PhoneExceptions.invalidateLen("O numero de celular nao pode pussuir mais que 11 caracteres.");

        }

    public static void phoneParse(String onlyOnePhone) throws Exception {
        if(onlyOnePhone.length() < 11) PhoneExceptions.invalidateLen("o numero de celular nao pode possuir menos que 11 caracteres");
        if(onlyOnePhone.length() > 11) PhoneExceptions.invalidateLen("O numero de celular nao pode pussuir mais que 11 caracteres.");
    }
}
