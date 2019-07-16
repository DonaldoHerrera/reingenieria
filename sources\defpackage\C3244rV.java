package defpackage;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: rV reason: default package and case insensitive filesystem */
/* compiled from: CipherWrapper */
public class C3244rV {
    private Cipher a;

    public int a(int i) {
        a();
        return this.a.getOutputSize(i);
    }

    public int a(byte[] bArr, int i, int i2, byte[] bArr2) throws C3364xV {
        a();
        try {
            return this.a.update(bArr, i, i2, bArr2);
        } catch (ShortBufferException e) {
            throw new C3364xV("Failed to call cipher.update", e);
        }
    }

    public int a(byte[] bArr, int i) throws C3364xV {
        a();
        try {
            return this.a.doFinal(bArr, i);
        } catch (GeneralSecurityException e) {
            throw new C3364xV("Failed to call finish encryption", e);
        }
    }

    public byte[] a(byte[] bArr) throws C3364xV {
        a();
        try {
            return this.a.doFinal(bArr);
        } catch (GeneralSecurityException e) {
            throw new C3364xV("Failed to call finish decryption", e);
        }
    }

    public void a(String str, int i, C3344wV wVVar, String str2) throws C3364xV {
        a(str, i, new IvParameterSpec(wVVar.a()), (SecretKey) new SecretKeySpec(wVVar.b(), 0, wVVar.b().length, str2));
    }

    public void a(String str, int i, IvParameterSpec ivParameterSpec, SecretKey secretKey) throws C3364xV {
        try {
            a(str).init(i, secretKey, ivParameterSpec);
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e) {
            throw new C3364xV("Failed to get cipher instance", e);
        } catch (InvalidAlgorithmParameterException | InvalidKeyException e2) {
            throw new C3364xV("Failed to init cipher with given key and iv", e2);
        }
    }

    private void a() {
        if (this.a == null) {
            throw new IllegalStateException("Cipher must be initialized before usage, call init first!");
        }
    }

    private Cipher a(String str) throws NoSuchPaddingException, NoSuchAlgorithmException {
        if (this.a == null) {
            this.a = Cipher.getInstance(str);
        }
        return this.a;
    }
}
