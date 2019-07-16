package defpackage;

/* renamed from: FMa reason: default package and case insensitive filesystem */
/* compiled from: DelegateFactory */
public final class C4899FMa<T> implements C4961HMa<T> {
    private C7054oVa<T> a;

    public static <T> void a(C7054oVa<T> ova, C7054oVa<T> ova2) {
        C5023JMa.a(ova2);
        C4899FMa fMa = (C4899FMa) ova;
        if (fMa.a == null) {
            fMa.a = ova2;
            return;
        }
        throw new IllegalStateException();
    }

    public T get() {
        C7054oVa<T> ova = this.a;
        if (ova != null) {
            return ova.get();
        }
        throw new IllegalStateException();
    }
}
