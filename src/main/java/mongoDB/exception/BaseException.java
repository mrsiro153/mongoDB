package mongoDB.exception;

public class BaseException {
    public static class InvalidType extends RuntimeException{
        public InvalidType(String message) {
            super(message);
        }

        public InvalidType(String message, Throwable cause) {
            super(message, cause);
        }
    }
    public static class UnknownError extends RuntimeException{
        public UnknownError(String message) {
            super(message);
        }

        public UnknownError(String message, Throwable cause) {
            super(message, cause);
        }
    }
}
