package defpackage;

/* renamed from: hXa reason: default package and case insensitive filesystem */
/* compiled from: IntrinsicsJvm.kt */
public final class C6579hXa extends C6919mXa {
    private int d;
    final /* synthetic */ C5575aXa e;
    final /* synthetic */ C5711cXa f;
    final /* synthetic */ C6308dYa g;
    final /* synthetic */ Object h;

    public C6579hXa(C5575aXa axa, C5711cXa cxa, C5575aXa axa2, C5711cXa cxa2, C6308dYa dya, Object obj) {
        this.e = axa;
        this.f = cxa;
        this.g = dya;
        this.h = obj;
        super(axa2, cxa2);
    }

    /* access modifiers changed from: protected */
    public Object a(Object obj) {
        int i = this.d;
        if (i == 0) {
            this.d = 1;
            JVa.a(obj);
            C6308dYa dya = this.g;
            if (dya != null) {
                LYa.a((Object) dya, 2);
                return dya.invoke(this.h, this);
            }
            throw new OVa("null cannot be cast to non-null type (R, kotlin.coroutines.Continuation<T>) -> kotlin.Any?");
        } else if (i == 1) {
            this.d = 2;
            JVa.a(obj);
            return obj;
        } else {
            throw new IllegalStateException("This coroutine had already completed");
        }
    }
}
