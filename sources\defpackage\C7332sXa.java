package defpackage;

/* renamed from: sXa reason: default package and case insensitive filesystem */
/* compiled from: ContinuationImpl.kt */
public abstract class C7332sXa extends C6783kXa {
    public C7332sXa(C5575aXa<Object> axa) {
        super(axa);
        if (axa != null) {
            if (!(axa.getContext() == C6307dXa.a)) {
                throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext");
            }
        }
    }

    public C5711cXa getContext() {
        return C6307dXa.a;
    }
}
