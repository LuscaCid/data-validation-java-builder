package entities;

public class ReturnStatement extends Exception{
    private String ErrorMessage;
    private int StatusCode = 401;
    private final String successMessage;

    public ReturnStatement(String ErrorMessage, int StatusCode) {
        super(ErrorMessage);
        this.ErrorMessage = ErrorMessage;
        this.StatusCode = StatusCode;
        this.successMessage = null;

    }
    public ReturnStatement(String successMessage) {
        this.successMessage = successMessage;
    }
    @Override
    public String toString(){
        return this.successMessage;
    }
}
