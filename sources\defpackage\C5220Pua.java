package defpackage;

@Deprecated
/* renamed from: Pua reason: default package and case insensitive filesystem */
/* compiled from: LambdaObserver */
public final class C5220Pua<T> extends C5037Jua<T> {
    private final C6776kQa<T> d;

    private C5220Pua(C6776kQa<T> kqa) {
        this.d = kqa;
    }

    public static <T> C5220Pua<T> a(C6776kQa<T> kqa) {
        return new C5220Pua<>(kqa);
    }

    public void a(T t) {
        try {
            this.d.accept(t);
        } catch (Exception e) {
            a((Throwable) e);
        }
    }
}
