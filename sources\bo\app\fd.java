package bo.app;

public class fd extends fi implements fb {
    private String a;
    private String b;

    public fd(String str) {
        this.a = a(str);
    }

    public String a() {
        return this.a;
    }

    public String b() {
        return "iam_click";
    }

    public String f() {
        return this.b;
    }

    public fd(String str, String str2) {
        this(str);
        this.b = str2;
    }
}
