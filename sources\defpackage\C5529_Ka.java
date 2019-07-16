package defpackage;

/* renamed from: _Ka reason: default package and case insensitive filesystem */
/* compiled from: PropellerWriteException */
public class C5529_Ka extends RuntimeException {
    public C5529_Ka(String str, Throwable th, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("; values = ");
        sb.append(str2);
        super(sb.toString(), th);
    }

    public C5529_Ka(Throwable th, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("Database write failed; values = ");
        sb.append(str);
        super(sb.toString(), th);
    }

    public C5529_Ka(String str, Throwable th) {
        super(str, th);
    }
}
