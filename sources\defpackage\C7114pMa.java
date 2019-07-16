package defpackage;

import java.io.File;

/* renamed from: pMa reason: default package and case insensitive filesystem */
/* compiled from: Builder */
public class C7114pMa<T> {
    private String a;
    private int b;
    private boolean c = false;
    private int d;
    private C7528vMa e = null;
    private C7183qMa<T> f;
    private C4744AMa<T> g;
    private int h;
    private C7390tMa i = null;
    private C7183qMa<T> j;
    private File k;

    public C7114pMa(String str, int i2) {
        this.a = str;
        this.b = i2;
    }

    public C7321sMa<T> a() {
        if (this.e == null) {
            throw new IllegalStateException("No ram mode set");
        } else if (this.i != null) {
            C7321sMa sma = new C7321sMa(this.b, new C7597wMa(this.c), this.e, this.f, this.d, this.g, this.i, this.j, this.h, this.k);
            boolean equals = sma.b().equals(C7528vMa.DISABLE);
            boolean equals2 = sma.a().equals(C7390tMa.DISABLE);
            if (!equals || !equals2) {
                return sma;
            }
            throw new IllegalStateException("The ram cache layer and the disk cache layer are disable. You have to use at least one of those layers.");
        } else {
            throw new IllegalStateException("No disk mode set");
        }
    }

    public C7114pMa<T> b() {
        this.c = true;
        return this;
    }

    public C7114pMa<T> c() {
        this.i = C7390tMa.DISABLE;
        return this;
    }

    public C7114pMa<T> a(int i2, C7183qMa<T> qma) {
        this.e = C7528vMa.ENABLE_WITH_SPECIFIC_SERIALIZER;
        this.d = i2;
        this.f = qma;
        return this;
    }

    public C7114pMa<T> a(int i2, File file, C7183qMa<T> qma) {
        this.k = file;
        this.i = C7390tMa.ENABLE_WITH_SPECIFIC_SERIALIZER;
        this.h = i2;
        this.j = qma;
        return this;
    }
}
