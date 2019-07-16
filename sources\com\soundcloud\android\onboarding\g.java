package com.soundcloud.android.onboarding;

import com.soundcloud.android.signupsignature.SignupSignature;
import java.nio.charset.Charset;

/* compiled from: AuthSignature.kt */
public class g {
    private final String a = "MFx5XmsCEHtBCjMNFVV6AGUhUBVHWxYIBTU3AGxaXzg=";
    private final C2041FV b;

    public g(C2041FV fv) {
        C7471uYa.b(fv, "obfuscator");
        this.b = fv;
    }

    public C2041FV a() {
        return this.b;
    }

    public String b(String str, String str2) {
        C7471uYa.b(str, "userIdentifier");
        C7471uYa.b(str2, "clientId");
        Integer valueOf = Integer.valueOf(1);
        String a2 = C7676xWa.a(C6918mWa.b(str, str2, a().b(this.a), valueOf), ":", null, null, 0, null, null, 62, null);
        Charset charset = C6411exb.a;
        if (a2 != null) {
            byte[] bytes = a2.getBytes(charset);
            C7471uYa.a((Object) bytes, "(this as java.lang.String).getBytes(charset)");
            int i = 0;
            int i2 = 1;
            for (byte b2 : bytes) {
                i2 = (i2 + b2) % 55439;
                i = (i + i2) % 55439;
            }
            return C7676xWa.a(C6918mWa.b(valueOf, Integer.toHexString(~((i << 16) | i2))), ":", null, null, 0, null, null, 62, null);
        }
        throw new OVa("null cannot be cast to non-null type java.lang.String");
    }

    public String a(String str, String str2) {
        C7471uYa.b(str, "userIdentifier");
        C7471uYa.b(str2, "clientId");
        if (SignupSignature.b.a()) {
            SignupSignature signupSignature = SignupSignature.b;
            String b2 = a().b(this.a);
            C7471uYa.a((Object) b2, "obfuscator.deobfuscateString(secret)");
            return signupSignature.a(str, str2, b2);
        }
        C7316sHa.a((Throwable) new IllegalStateException("Failed to load signup signature library."), "Supported ABIs", C5111MGa.a());
        return b(str, str2);
    }
}
