package task_6;

public class IllegalTableNumber extends Exception{
    private String details;
    public IllegalTableNumber(String detail, String message) {
        super(message);
        this.details = detail;
    }

    @Override
    public String toString() {
        return "MyException{"
                + "detail=" + details
                + ", message=" + getMessage()
                + "} ";
    }
}
