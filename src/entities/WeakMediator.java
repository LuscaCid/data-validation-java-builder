package entities;

public class WeakMediator {
    public boolean isOkWithLen;
    public boolean isOkWithSpecialChars;

    public WeakMediator (boolean isOkWithLen, boolean isOkWithSpecialChars) {
        this.isOkWithLen = isOkWithLen;
        this.isOkWithSpecialChars = isOkWithSpecialChars;

    }
    private String returnsAllTrue() {
        return this.toString();
    }
     

}
