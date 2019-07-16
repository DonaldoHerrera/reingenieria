package com.facebook;

/* compiled from: FacebookServiceException */
public class D extends C0594t {
    private final FacebookRequestError a;

    public D(FacebookRequestError facebookRequestError, String str) {
        super(str);
        this.a = facebookRequestError;
    }

    public final FacebookRequestError a() {
        return this.a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{FacebookServiceException: ");
        sb.append("httpResponseCode: ");
        sb.append(this.a.g());
        sb.append(", facebookErrorCode: ");
        sb.append(this.a.b());
        sb.append(", facebookErrorType: ");
        sb.append(this.a.d());
        sb.append(", message: ");
        sb.append(this.a.c());
        sb.append("}");
        return sb.toString();
    }
}
