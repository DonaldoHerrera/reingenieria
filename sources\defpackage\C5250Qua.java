package defpackage;

@Deprecated
/* renamed from: Qua reason: default package and case insensitive filesystem */
/* compiled from: LambdaSingleObserver */
public final class C5250Qua<T> extends C5068Kua<T> {
    private final C6776kQa<T> d;

    private C5250Qua(C6776kQa<T> kqa) {
        this.d = kqa;
    }

    public static <T> C5250Qua<T> a(C6776kQa<T> kqa) {
        return new C5250Qua<>(kqa);
    }

    public void onSuccess(T t) {
        try {
            this.d.accept(t);
            super.onSuccess(t);
        } catch (Exception e) {
            a(e);
        }
    }
}
