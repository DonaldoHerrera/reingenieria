package defpackage;

/* renamed from: mXa reason: default package and case insensitive filesystem */
/* compiled from: ContinuationImpl.kt */
public abstract class C6919mXa extends C6783kXa {
    private transient C5575aXa<Object> b;
    private final C5711cXa c;

    public C6919mXa(C5575aXa<Object> axa, C5711cXa cxa) {
        super(axa);
        this.c = cxa;
    }

    /* access modifiers changed from: protected */
    public void c() {
        C5575aXa<Object> axa = this.b;
        if (!(axa == null || axa == this)) {
            a a = getContext().a(C5643bXa.c);
            if (a != null) {
                ((C5643bXa) a).a(axa);
            } else {
                C7471uYa.a();
                throw null;
            }
        }
        this.b = C6851lXa.a;
    }

    public C5711cXa getContext() {
        C5711cXa cxa = this.c;
        if (cxa != null) {
            return cxa;
        }
        C7471uYa.a();
        throw null;
    }
}
