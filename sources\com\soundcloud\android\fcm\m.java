package com.soundcloud.android.fcm;

import android.util.Base64;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

@EVa(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0016\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/soundcloud/android/fcm/FcmDecryptor;", "", "cipherWrapper", "Lcom/soundcloud/android/crypto/CipherWrapper;", "(Lcom/soundcloud/android/crypto/CipherWrapper;)V", "ivParam", "Ljavax/crypto/spec/IvParameterSpec;", "skeySpec", "Ljavax/crypto/spec/SecretKeySpec;", "decrypt", "", "payload", "Companion", "fcm_release"}, mv = {1, 1, 15})
/* compiled from: FcmDecryptor.kt */
public class m {
    private static final byte[] a;
    private static final byte[] b = c.a("1111111111ABCDEF1111111111ABCDEF");
    public static final a c = new a(null);
    private final IvParameterSpec d = new IvParameterSpec(b);
    private final SecretKeySpec e = new SecretKeySpec(a, "AES");
    private final C3244rV f;

    /* compiled from: FcmDecryptor.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }

        /* access modifiers changed from: private */
        public final byte[] a(String str) {
            int length = str.length();
            byte[] bArr = new byte[(length / 2)];
            for (int i = 0; i < length; i += 2) {
                bArr[i / 2] = (byte) ((Character.digit(str.charAt(i), 16) << 4) + Character.digit(str.charAt(i + 1), 16));
            }
            return bArr;
        }
    }

    static {
        a aVar = c;
        byte[] decode = Base64.decode("MDEyMzQ1Njc4OUFCQ0RFRjAxMjM0NTY3ODlBQkNERUY=", 0);
        C7471uYa.a((Object) decode, "Base64.decode(KEY_DATA, Base64.DEFAULT)");
        a = aVar.a(new String(decode, C6411exb.a));
    }

    public m(C3244rV rVVar) {
        C7471uYa.b(rVVar, "cipherWrapper");
        this.f = rVVar;
    }

    public String a(String str) throws C3364xV, UnsupportedEncodingException {
        C7471uYa.b(str, "payload");
        this.f.a("AES/CBC/PKCS7Padding", 2, this.d, (SecretKey) this.e);
        byte[] a2 = this.f.a(Base64.decode(str, 0));
        C7471uYa.a((Object) a2, "decryptedBytes");
        Charset charset = C5053KKa.c;
        C7471uYa.a((Object) charset, "Charsets.UTF_8");
        return new String(a2, charset);
    }
}
