package errorhandler;

public class ErrorHandler {
    public static boolean hasError = false;

    public static void printError(String msg) {
        hasError = true;
        System.out.println(msg);
    }
}
