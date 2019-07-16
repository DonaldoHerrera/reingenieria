package defpackage;

/* renamed from: lXa reason: default package and case insensitive filesystem */
/* compiled from: ContinuationImpl.kt */
public final class C6851lXa implements C5575aXa<Object> {
    public static final C6851lXa a = new C6851lXa();

    private C6851lXa() {
    }

    public void b(Object obj) {
        throw new IllegalStateException("This continuation is already complete");
    }

    public C5711cXa getContext() {
        throw new IllegalStateException("This continuation is already complete");
    }

    public String toString() {
        return "This continuation is already complete";
    }
}
