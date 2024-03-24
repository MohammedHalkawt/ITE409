public class EmptyColorException extends Exception {
    public EmptyColorException(){
        super("Color should not be empty");
    }
}