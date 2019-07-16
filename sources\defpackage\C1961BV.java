package defpackage;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import javax.crypto.KeyGenerator;

/* renamed from: BV reason: default package and case insensitive filesystem */
/* compiled from: KeyGeneratorWrapper */
public class C1961BV {
    public byte[] a(SecureRandom secureRandom) throws NoSuchAlgorithmException {
        KeyGenerator instance = KeyGenerator.getInstance("AES");
        instance.init(128, secureRandom);
        return instance.generateKey().getEncoded();
    }
}
