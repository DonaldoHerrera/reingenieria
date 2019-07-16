package defpackage;

/* renamed from: Isb reason: default package */
/* compiled from: LockBasedStorageManager */
class Isb extends f<T> {
    final /* synthetic */ _Xa d;
    final /* synthetic */ _Xa e;
    final /* synthetic */ Jsb f;

    Isb(Jsb jsb, Jsb jsb2, PXa pXa, _Xa _xa, _Xa _xa2) {
        this.f = jsb;
        this.d = _xa;
        this.e = _xa2;
        super(jsb2, pXa);
    }

    private static /* synthetic */ void c(int i) {
        String str = i != 2 ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i != 2 ? 2 : 3)];
        String str2 = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$3";
        if (i != 2) {
            objArr[0] = str2;
        } else {
            objArr[0] = "value";
        }
        if (i != 2) {
            objArr[1] = "recursionDetected";
        } else {
            objArr[1] = str2;
        }
        if (i == 2) {
            objArr[2] = "postCompute";
        }
        String format = String.format(str, objArr);
        throw (i != 2 ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    /* access modifiers changed from: protected */
    public j<T> a(boolean z) {
        _Xa _xa = this.d;
        if (_xa == null) {
            j<T> a = super.a(z);
            if (a != null) {
                return a;
            }
            c(0);
            throw null;
        }
        j<T> a2 = j.a(_xa.invoke(Boolean.valueOf(z)));
        if (a2 != null) {
            return a2;
        }
        c(1);
        throw null;
    }

    /* access modifiers changed from: protected */
    public void a(T t) {
        if (t != null) {
            this.e.invoke(t);
        } else {
            c(2);
            throw null;
        }
    }
}
