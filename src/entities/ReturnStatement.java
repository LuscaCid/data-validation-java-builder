package entities;

public class ReturnStatement extends Exception{
    private String ErrorMessage;
    private int StatusCode = 401;
    private String successMessage;

    public ReturnStatement(String ErrorMessage, int StatusCode) {
        this.ErrorMessage = ErrorMessage;
        this.StatusCode = StatusCode;
        this.successMessage = null;

    }
    public ReturnStatement(String successMessage) {
        this.successMessage = successMessage;
    }
    private String objectToString(){
        return this.toString();
    }


}
