package defpackage;

/* renamed from: RDb reason: default package */
/* compiled from: Timber */
class RDb extends b {
    RDb() {
    }

    public void a(String str, Object... objArr) {
        for (b a : SDb.c) {
            a.a(str, objArr);
        }
    }

    public void b(Throwable th, String str, Object... objArr) {
        for (b b : SDb.c) {
            b.b(th, str, objArr);
        }
    }

    public void d(String str, Object... objArr) {
        for (b d : SDb.c) {
            d.d(str, objArr);
        }
    }

    public void e(String str, Object... objArr) {
        for (b e : SDb.c) {
            e.e(str, objArr);
        }
    }

    public void f(String str, Object... objArr) {
        for (b f : SDb.c) {
            f.f(str, objArr);
        }
    }

    public void a(Throwable th, String str, Object... objArr) {
        for (b a : SDb.c) {
            a.a(th, str, objArr);
        }
    }

    public void b(String str, Object... objArr) {
        for (b b : SDb.c) {
            b.b(str, objArr);
        }
    }

    public void a(Throwable th) {
        for (b a : SDb.c) {
            a.a(th);
        }
    }

    public void a(int i, String str, Object... objArr) {
        for (b a : SDb.c) {
            a.a(i, str, objArr);
        }
    }

    /* access modifiers changed from: protected */
    public void a(int i, String str, String str2, Throwable th) {
        throw new AssertionError("Missing override for log method.");
    }
}
