package defpackage;

import java.io.File;
import java.io.IOException;

/* renamed from: sMa reason: default package and case insensitive filesystem */
/* compiled from: DualCache */
public class C7321sMa<T> {
    private final C7735yMa a;
    private C2047GH b;
    private final int c;
    private final File d;
    private final int e;
    private final C7528vMa f;
    private final C7390tMa g;
    private final C7183qMa<T> h;
    private final C7183qMa<T> i;
    private final C7459uMa j = new C7459uMa();
    private final C7597wMa k;
    private final C7666xMa l;

    C7321sMa(int i2, C7597wMa wma, C7528vMa vma, C7183qMa<T> qma, int i3, C4744AMa<T> aMa, C7390tMa tma, C7183qMa<T> qma2, int i4, File file) {
        this.e = i2;
        this.f = vma;
        this.i = qma;
        this.g = tma;
        this.h = qma2;
        this.d = file;
        this.k = wma;
        this.l = new C7666xMa(wma);
        int i5 = C7252rMa.a[vma.ordinal()];
        if (i5 == 1) {
            this.a = new C4775BMa(i3);
        } else if (i5 != 2) {
            this.a = null;
        } else {
            this.a = new C7804zMa(i3, aMa);
        }
        if (C7252rMa.b[tma.ordinal()] != 1) {
            this.c = 0;
            return;
        }
        this.c = i4;
        try {
            a(file);
        } catch (IOException e2) {
            wma.a((Throwable) e2);
        }
    }

    private void a(File file) throws IOException {
        this.b = C2047GH.a(file, this.e, 1, (long) this.c);
    }

    public C7528vMa b() {
        return this.f;
    }

    public void c() {
        d();
        e();
    }

    public void d() {
        if (!this.g.equals(C7390tMa.DISABLE)) {
            try {
                this.j.a();
                this.b.b();
                a(this.d);
            } catch (IOException e2) {
                this.k.a((Throwable) e2);
            } catch (Throwable th) {
                this.j.b();
                throw th;
            }
            this.j.b();
        }
    }

    public void e() {
        if (!this.f.equals(C7528vMa.DISABLE)) {
            this.a.a();
        }
    }

    public C7390tMa a() {
        return this.g;
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0071  */
    public T b(String str) {
        T t;
        String str2;
        c cVar;
        boolean equals = this.f.equals(C7528vMa.ENABLE_WITH_SPECIFIC_SERIALIZER);
        boolean equals2 = this.f.equals(C7528vMa.ENABLE_WITH_REFERENCE);
        if (equals || equals2) {
            t = this.a.b(str);
        } else {
            t = null;
        }
        if (t == null) {
            this.l.b(str);
            if (this.g.equals(C7390tMa.ENABLE_WITH_SPECIFIC_SERIALIZER)) {
                try {
                    this.j.a(str);
                    cVar = this.b.b(str);
                    this.j.b(str);
                } catch (IOException e2) {
                    this.k.a((Throwable) e2);
                    this.j.b(str);
                    cVar = null;
                } catch (Throwable th) {
                    this.j.b(str);
                    throw th;
                }
                if (cVar != null) {
                    this.l.d(str);
                    try {
                        str2 = cVar.getString(0);
                    } catch (IOException e3) {
                        this.k.a((Throwable) e3);
                    }
                    if (str2 != null) {
                        T a2 = this.h.a(str2);
                        if (this.f.equals(C7528vMa.ENABLE_WITH_REFERENCE)) {
                            if (this.g.equals(C7390tMa.ENABLE_WITH_SPECIFIC_SERIALIZER)) {
                                this.a.a(str, a2);
                            }
                        } else if (this.f.equals(C7528vMa.ENABLE_WITH_SPECIFIC_SERIALIZER)) {
                            C7183qMa<T> qma = this.h;
                            C7183qMa<T> qma2 = this.i;
                            if (qma == qma2) {
                                this.a.a(str, str2);
                            } else {
                                this.a.a(str, qma2.a(a2));
                            }
                        }
                        return a2;
                    }
                } else {
                    this.l.c(str);
                }
            }
            str2 = null;
            if (str2 != null) {
            }
        } else {
            this.l.a(str);
            if (this.f.equals(C7528vMa.ENABLE_WITH_REFERENCE)) {
                return t;
            }
            if (this.f.equals(C7528vMa.ENABLE_WITH_SPECIFIC_SERIALIZER)) {
                return this.i.a((String) t);
            }
        }
        return null;
    }

    public void a(String str, T t) {
        if (this.f.equals(C7528vMa.ENABLE_WITH_REFERENCE)) {
            this.a.a(str, t);
        }
        String str2 = null;
        if (this.f.equals(C7528vMa.ENABLE_WITH_SPECIFIC_SERIALIZER)) {
            str2 = this.i.a(t);
            this.a.a(str, str2);
        }
        if (this.g.equals(C7390tMa.ENABLE_WITH_SPECIFIC_SERIALIZER)) {
            try {
                this.j.a(str);
                a a2 = this.b.a(str);
                if (this.i == this.h) {
                    a2.a(0, str2);
                } else {
                    a2.a(0, this.h.a(t));
                }
                a2.b();
            } catch (IOException e2) {
                this.k.a((Throwable) e2);
            } catch (Throwable th) {
                this.j.b(str);
                throw th;
            }
            this.j.b(str);
        }
    }

    public boolean a(String str) {
        if (!this.f.equals(C7528vMa.DISABLE) && this.a.b().containsKey(str)) {
            return true;
        }
        try {
            this.j.a(str);
            if (!this.g.equals(C7390tMa.DISABLE) && this.b.b(str) != null) {
                this.j.b(str);
                return true;
            }
        } catch (IOException e2) {
            this.k.a((Throwable) e2);
        } catch (Throwable th) {
            this.j.b(str);
            throw th;
        }
        this.j.b(str);
        return false;
    }
}
