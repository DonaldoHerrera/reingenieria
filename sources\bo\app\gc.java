package bo.app;

import com.adjust.sdk.Constants;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class gc implements ga {
    public String a(String str) {
        return new BigInteger(a(str.getBytes())).abs().toString(36);
    }

    private byte[] a(byte[] bArr) {
        try {
            MessageDigest instance = MessageDigest.getInstance(Constants.MD5);
            instance.update(bArr);
            return instance.digest();
        } catch (NoSuchAlgorithmException e) {
            hr.a((Throwable) e);
            return null;
        }
    }
}
