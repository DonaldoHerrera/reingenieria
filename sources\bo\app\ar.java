package bo.app;

public class ar extends Exception {
    public ar(String str, Throwable th) {
        super(str, th);
    }

    public ar(String str) {
        super(str);
    }
}
