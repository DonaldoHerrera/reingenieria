package com.soundcloud.android.signupsignature;

@EVa(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\bJ!\u0010\f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\bH R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\r"}, d2 = {"Lcom/soundcloud/android/signupsignature/SignupSignature;", "", "()V", "initializationSucceeded", "", "getInitializationSucceeded", "()Z", "getSignupSignature", "", "userIdentifier", "clientId", "secret", "nativeGetSignature", "signupsignature_release"}, mv = {1, 1, 15})
/* compiled from: SignupSignature.kt */
public final class SignupSignature {
    private static final boolean a;
    public static final SignupSignature b = new SignupSignature();

    static {
        boolean z;
        try {
            System.loadLibrary("signup-signature-lib");
            z = true;
        } catch (UnsatisfiedLinkError unused) {
            z = false;
        }
        a = z;
    }

    private SignupSignature() {
    }

    private final native String nativeGetSignature(String str, String str2, String str3);

    public final boolean a() {
        return a;
    }

    public final String a(String str, String str2, String str3) {
        C7471uYa.b(str, "userIdentifier");
        C7471uYa.b(str2, "clientId");
        C7471uYa.b(str3, "secret");
        return nativeGetSignature(str, str2, str3);
    }
}
