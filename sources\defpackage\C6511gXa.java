package defpackage;

/* renamed from: gXa reason: default package and case insensitive filesystem */
/* compiled from: IntrinsicsJvm.kt */
public final class C6511gXa extends C7332sXa {
    private int b;
    final /* synthetic */ C5575aXa c;
    final /* synthetic */ C6308dYa d;
    final /* synthetic */ Object e;

    public C6511gXa(C5575aXa axa, C5575aXa axa2, C6308dYa dya, Object obj) {
        this.c = axa;
        this.d = dya;
        this.e = obj;
        super(axa2);
    }

    /* access modifiers changed from: protected */
    public Object a(Object obj) {
        int i = this.b;
        if (i == 0) {
            this.b = 1;
            JVa.a(obj);
            C6308dYa dya = this.d;
            if (dya != null) {
                LYa.a((Object) dya, 2);
                return dya.invoke(this.e, this);
            }
            throw new OVa("null cannot be cast to non-null type (R, kotlin.coroutines.Continuation<T>) -> kotlin.Any?");
        } else if (i == 1) {
            this.b = 2;
            JVa.a(obj);
            return obj;
        } else {
            throw new IllegalStateException("This coroutine had already completed");
        }
    }
}
