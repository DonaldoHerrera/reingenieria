package defpackage;

/* renamed from: Dka reason: default package */
/* compiled from: AuthTaskException */
public class Dka extends Exception {
    private final String[] a;

    public Dka(String... strArr) {
        this.a = strArr;
    }

    public String a() {
        String[] strArr = this.a;
        return (strArr == null || strArr.length == 0) ? "" : strArr[0];
    }
}
