package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.concurrent.Callable;

/* renamed from: tV reason: default package and case insensitive filesystem */
/* compiled from: CryptoOperations */
public class C3284tV {
    private final C2001DV a;
    private final C1961BV b;
    private final C3404zV c;
    private final SecureRandom d;
    private final HPa e;
    private final C3469VY f;
    private VPa g = WPa.a();

    public C3284tV(C2001DV dv, C1961BV bv, C3404zV zVVar, HPa hPa, C3469VY vy) {
        this.b = bv;
        this.d = new SecureRandom();
        this.c = zVVar;
        this.a = dv;
        this.e = hPa;
        this.f = vy;
    }

    static /* synthetic */ void e() throws Exception {
    }

    private void f() {
        try {
            byte[] bArr = new byte[16];
            this.d.nextBytes(bArr);
            this.a.a(new C3344wV("device_key", this.b.a(this.d), bArr));
        } catch (NoSuchAlgorithmException e2) {
            this.f.a(e2, new HVa[0]);
        }
    }

    public byte[] a(String str) {
        if (this.a.a(str)) {
            return this.a.b(str).b();
        }
        C3344wV b2 = b(str);
        this.a.a(b2);
        return b2.b();
    }

    public synchronized C3344wV b() {
        if (!this.a.a("device_key")) {
            f();
        }
        return this.a.b("device_key");
    }

    public boolean c() {
        return this.a.a("device_key");
    }

    public void d() {
        C6979nPa b2 = C6979nPa.a((Callable<?>) new C3224qV<Object>(this)).b(this.e);
        C3185oV oVVar = C3185oV.a;
        C3469VY vy = this.f;
        vy.getClass();
        this.g = b2.a(oVVar, new C3204pV(vy));
    }

    private C3344wV b(String str) {
        byte[] bArr = new byte[16];
        this.d.nextBytes(bArr);
        return new C3344wV(str, bArr);
    }

    public String a(C3508cda cda) throws C3364xV {
        return this.c.a(cda);
    }

    public void a(InputStream inputStream, OutputStream outputStream, a aVar) throws IOException, C3364xV {
        try {
            this.c.a(inputStream, outputStream, b(), aVar);
        } catch (C3364xV e2) {
            this.f.a(e2, new HVa[0]);
            throw e2;
        }
    }

    public void a() {
        this.c.a();
    }
}
