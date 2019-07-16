package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: zV reason: default package and case insensitive filesystem */
/* compiled from: Encryptor */
public class C3404zV {
    private final C3244rV a;
    private final AtomicBoolean b = new AtomicBoolean();

    /* renamed from: zV$a */
    /* compiled from: Encryptor */
    public interface a {
        void a(long j);
    }

    public C3404zV(C3244rV rVVar) {
        this.a = rVVar;
    }

    public void a(InputStream inputStream, OutputStream outputStream, C3344wV wVVar, a aVar) throws C3364xV, IOException {
        a(inputStream, outputStream, wVVar, 1, aVar);
    }

    public void a() {
        this.b.set(true);
    }

    private void a(InputStream inputStream, OutputStream outputStream, C3344wV wVVar, int i, a aVar) throws C3364xV, IOException {
        a(wVVar, i);
        byte[] bArr = new byte[8192];
        byte[] bArr2 = new byte[this.a.a(bArr.length)];
        long j = 0;
        while (!this.b.get()) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                break;
            }
            outputStream.write(bArr2, 0, this.a.a(bArr, 0, read, bArr2));
            j += (long) read;
            if (aVar != null && (j / ((long) bArr.length)) % 20 == 0) {
                aVar.a(j);
            }
        }
        if (!this.b.getAndSet(false)) {
            if (aVar != null) {
                aVar.a(j);
            }
            outputStream.write(bArr2, 0, this.a.a(bArr2, 0));
            return;
        }
        throw new C3384yV("File encryption cancelled");
    }

    private void a(C3344wV wVVar, int i) throws C3364xV {
        this.a.a("AES/CBC/PKCS7Padding", i, wVVar, "AES");
    }

    /* access modifiers changed from: protected */
    public String a(C3508cda cda, MessageDigest messageDigest) {
        return C5206PKa.a(messageDigest.digest(cda.M().getBytes(C5053KKa.c)));
    }

    public String a(C3508cda cda) throws C3364xV {
        try {
            return a(cda, MessageDigest.getInstance("sha1"));
        } catch (NoSuchAlgorithmException e) {
            throw new C3364xV("No provider found for sha1 digest", e);
        }
    }
}
