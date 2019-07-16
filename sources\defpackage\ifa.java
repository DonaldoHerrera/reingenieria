package defpackage;

import java.io.IOException;

/* renamed from: ifa reason: default package */
/* compiled from: ApiRequestException */
public final class ifa extends Exception {
    private final a a;
    private final String b;

    /* renamed from: ifa$a */
    /* compiled from: ApiRequestException */
    public enum a {
        AUTH_ERROR,
        NETWORK_ERROR,
        NOT_FOUND,
        NOT_ALLOWED,
        RATE_LIMITED,
        UNEXPECTED_RESPONSE,
        BAD_REQUEST,
        VALIDATION_ERROR,
        MALFORMED_INPUT,
        PRECONDITION_REQUIRED,
        SERVER_ERROR
    }

    private ifa(a aVar, hfa hfa, jfa jfa) {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("Request failed with reason ");
        sb.append(aVar);
        sb.append("; request = ");
        sb.append(hfa);
        sb.append("; body = ");
        if (jfa == null) {
            str = "<no response>";
        } else {
            str = jfa.b();
        }
        sb.append(str);
        super(sb.toString());
        this.a = aVar;
        this.b = "unknown";
    }

    public static ifa a(hfa hfa, jfa jfa, String str) {
        return new ifa(a.BAD_REQUEST, hfa, jfa, str);
    }

    public static ifa b(hfa hfa, jfa jfa) {
        return new ifa(a.NOT_ALLOWED, hfa, jfa);
    }

    public static ifa c(hfa hfa, jfa jfa) {
        return new ifa(a.NOT_FOUND, hfa, jfa);
    }

    public static ifa d(hfa hfa, jfa jfa) {
        return new ifa(a.PRECONDITION_REQUIRED, hfa, jfa);
    }

    public static ifa e(hfa hfa, jfa jfa) {
        return new ifa(a.SERVER_ERROR, hfa, jfa);
    }

    public static ifa f(hfa hfa, jfa jfa) {
        int d = jfa.d();
        if (d < 200 || (d < 500 && d >= 400)) {
            a aVar = a.UNEXPECTED_RESPONSE;
            StringBuilder sb = new StringBuilder();
            sb.append("HTTP ");
            sb.append(d);
            return new ifa(aVar, hfa, jfa, sb.toString());
        }
        throw new IllegalArgumentException("Status code must be < 200 or between 400 and 500");
    }

    public boolean g() {
        return this.a == a.SERVER_ERROR;
    }

    public boolean h() {
        return this.a == a.VALIDATION_ERROR;
    }

    public boolean i() {
        a aVar = this.a;
        return aVar == a.UNEXPECTED_RESPONSE || aVar == a.MALFORMED_INPUT;
    }

    public a j() {
        return this.a;
    }

    public static ifa a(hfa hfa, IOException iOException) {
        return new ifa(a.NETWORK_ERROR, hfa, (Exception) iOException);
    }

    public static ifa b(hfa hfa, jfa jfa, String str) {
        return new ifa(a.RATE_LIMITED, hfa, jfa, str);
    }

    public boolean c() {
        return this.a == a.NETWORK_ERROR;
    }

    public boolean d() {
        return this.a == a.NOT_ALLOWED;
    }

    public boolean e() {
        return this.a == a.NOT_FOUND;
    }

    public static ifa a(hfa hfa, jfa jfa) {
        return new ifa(a.AUTH_ERROR, hfa, jfa);
    }

    public boolean b() {
        return this.a == a.AUTH_ERROR;
    }

    public static ifa a(hfa hfa, Lea lea) {
        return new ifa(a.MALFORMED_INPUT, hfa, (Exception) lea);
    }

    public boolean f() {
        return this.a == a.RATE_LIMITED;
    }

    public static ifa a(hfa hfa, jfa jfa, String str, int i) {
        ifa ifa = new ifa(a.VALIDATION_ERROR, hfa, jfa, str, i);
        return ifa;
    }

    private ifa(a aVar, hfa hfa, Exception exc) {
        StringBuilder sb = new StringBuilder();
        sb.append("Request failed with reason ");
        sb.append(aVar);
        sb.append("; request = ");
        sb.append(hfa);
        super(sb.toString(), exc);
        this.a = aVar;
        this.b = "unknown";
    }

    public String a() {
        return this.b;
    }

    private ifa(a aVar, hfa hfa, jfa jfa, String str) {
        String str2;
        StringBuilder sb = new StringBuilder();
        sb.append("Request failed with reason ");
        sb.append(aVar);
        sb.append("; errorKey = ");
        sb.append(str);
        sb.append("; request = ");
        sb.append(hfa);
        sb.append("; body = ");
        if (jfa == null) {
            str2 = "<no response>";
        } else {
            str2 = jfa.b();
        }
        sb.append(str2);
        super(sb.toString());
        this.a = aVar;
        this.b = str;
    }

    private ifa(a aVar, hfa hfa, jfa jfa, String str, int i) {
        String str2;
        StringBuilder sb = new StringBuilder();
        sb.append("Request failed with reason ");
        sb.append(aVar);
        sb.append("; errorKey = ");
        sb.append(str);
        sb.append("; errorCode = ");
        sb.append(i);
        sb.append("; request = ");
        sb.append(hfa);
        sb.append("; body = ");
        if (jfa == null) {
            str2 = "<no response>";
        } else {
            str2 = jfa.b();
        }
        sb.append(str2);
        super(sb.toString());
        this.a = aVar;
        this.b = str;
    }
}
