package bo.app;

public enum s {
    SHORT("yyyy-MM-dd"),
    LONG("yyyy-MM-dd kk:mm:ss");
    
    private final String c;

    private s(String str) {
        this.c = str;
    }

    public String a() {
        return this.c;
    }
}
