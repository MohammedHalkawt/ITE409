public class CoordinatesException extends RuntimeException {
    public CoordinatesException() {
        super("Coordinates should not be the same");
    }
}