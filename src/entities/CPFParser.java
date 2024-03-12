package entities;

import Exceptions.CPFExceptions;

public class CPFParser {
    private String newCpf;
    String [] Validators = new String[2];
    public CPFParser(String newCpf) {
        this.newCpf = newCpf;
        this.Validators[0] = String.valueOf(this.newCpf.charAt(9));
        this.Validators[1] = String.valueOf(this.newCpf.charAt(10));
    }

    private int calculates (int maxValueAtLoop) {
        //at the first validation its passed only 9 positions, but at second, its passed 10
        int amount = 0;
        int maxValueMul = 10; // < 10
        if(maxValueAtLoop == 11)maxValueMul = maxValueAtLoop;
        int i = 0;
        while(maxValueMul >= 2){
            char ch = this.newCpf.charAt(i);
            amount += Integer.parseInt(String.valueOf(ch)) * maxValueMul;
            i++;
            maxValueMul--;
        }
        return (amount * 10) % 11;
    }

    public boolean validateCPF() throws Exception{

        if(newCpf.length() > 11) CPFExceptions.MustHave11Chars("Acima de 11 caracteres.");
        if(newCpf.length() <11)CPFExceptions.fewChars();

        int rest1 = calculates(10);
        int rest2 = calculates(11);

        boolean validation1 = false;
        boolean validation2 = false;

        if(Integer.parseInt(this.Validators[0])== rest1)validation1 = true;
        if(Integer.parseInt(this.Validators[1])== rest2)validation2 = true;

        return (validation1 && validation2);
    }

    public boolean parseShorthand(String cpf) throws Exception {
        if(cpf.length() != 11) CPFExceptions.MustHave11Chars("");

        this.newCpf = cpf;
        return this.validateCPF();
    }
}
