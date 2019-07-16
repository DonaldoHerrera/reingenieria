package defpackage;

@Deprecated
/* renamed from: Oua reason: default package and case insensitive filesystem */
/* compiled from: LambdaMaybeObserver */
public final class C5190Oua<T> extends C5005Iua<T> {
    private final C6776kQa<T> d;

    private C5190Oua(C6776kQa<T> kqa) {
        this.d = kqa;
    }

    public static <T> C5190Oua<T> a(C6776kQa<T> kqa) {
        return new C5190Oua<>(kqa);
    }

    public void onSuccess(T t) {
        try {
            this.d.accept(t);
        } catch (Exception e) {
            a(e);
        }
    }
}
