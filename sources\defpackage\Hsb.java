package defpackage;

/* renamed from: Hsb reason: default package */
/* compiled from: LockBasedStorageManager */
class Hsb extends f<T> {
    final /* synthetic */ Object d;
    final /* synthetic */ Jsb e;

    Hsb(Jsb jsb, Jsb jsb2, PXa pXa, Object obj) {
        this.e = jsb;
        this.d = obj;
        super(jsb2, pXa);
    }

    private static /* synthetic */ void c(int i) {
        throw new IllegalStateException(String.format("@NotNull method %s.%s must not return null", new Object[]{"kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$2", "recursionDetected"}));
    }

    /* access modifiers changed from: protected */
    public j<T> a(boolean z) {
        j<T> a = j.a(this.d);
        if (a != null) {
            return a;
        }
        c(0);
        throw null;
    }
}
