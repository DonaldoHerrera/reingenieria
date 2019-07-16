package defpackage;

import com.adjust.sdk.Constants;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: zKa reason: default package and case insensitive filesystem */
/* compiled from: Hashing */
public final class C7802zKa {
    private C7802zKa() {
    }

    public static String a(String str) {
        try {
            MessageDigest instance = MessageDigest.getInstance(Constants.MD5);
            instance.update(str.getBytes(C5053KKa.c));
            return C5206PKa.a(instance.digest());
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }
}
