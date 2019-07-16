package defpackage;

/* renamed from: IMa reason: default package and case insensitive filesystem */
/* compiled from: InstanceFactory */
public final class C4992IMa<T> implements C4961HMa<T>, C4806CMa<T> {
    private static final C4992IMa<Object> a = new C4992IMa<>(null);
    private final T b;

    private C4992IMa(T t) {
        this.b = t;
    }

    public static <T> C4961HMa<T> a(T t) {
        C5023JMa.a(t, "instance cannot be null");
        return new C4992IMa(t);
    }

    public T get() {
        return this.b;
    }
}
