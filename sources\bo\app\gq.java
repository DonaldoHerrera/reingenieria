package bo.app;

public class gq {
    private final a a;
    private final Throwable b;

    public enum a {
        IO_ERROR,
        DECODING_ERROR,
        NETWORK_DENIED,
        OUT_OF_MEMORY,
        UNKNOWN
    }

    public gq(a aVar, Throwable th) {
        this.a = aVar;
        this.b = th;
    }
}
