package com.facebook;

/* renamed from: com.facebook.u reason: case insensitive filesystem */
/* compiled from: FacebookGraphResponseException */
public class C0595u extends C0594t {
    private final L a;

    public C0595u(L l, String str) {
        super(str);
        this.a = l;
    }

    public final String toString() {
        L l = this.a;
        FacebookRequestError a2 = l != null ? l.a() : null;
        StringBuilder sb = new StringBuilder();
        sb.append("{FacebookGraphResponseException: ");
        String message = getMessage();
        if (message != null) {
            sb.append(message);
            sb.append(" ");
        }
        if (a2 != null) {
            sb.append("httpResponseCode: ");
            sb.append(a2.g());
            sb.append(", facebookErrorCode: ");
            sb.append(a2.b());
            sb.append(", facebookErrorType: ");
            sb.append(a2.d());
            sb.append(", message: ");
            sb.append(a2.c());
            sb.append("}");
        }
        return sb.toString();
    }
}
