package defpackage;

import java.lang.reflect.Type;

/* renamed from: IKa reason: default package and case insensitive filesystem */
/* compiled from: TypeToken */
public class C4990IKa<T> {
    private final Class<? super T> a;
    private final Type b;
    private final int c;

    protected C4990IKa() {
        this.b = C5021JKa.a(getClass());
        this.a = C5021JKa.c(this.b);
        this.c = this.b.hashCode();
    }

    public static <T> C4990IKa<T> a(Class<T> cls) {
        return new C4990IKa<>(cls);
    }

    public final Type b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C4990IKa) && C5021JKa.a(this.b, ((C4990IKa) obj).b);
    }

    public final int hashCode() {
        return this.c;
    }

    public final String toString() {
        return C5021JKa.d(this.b);
    }

    public final Class<? super T> a() {
        return this.a;
    }

    C4990IKa(Type type) {
        if (type != null) {
            this.b = C5021JKa.b(type);
            this.a = C5021JKa.c(this.b);
            this.c = this.b.hashCode();
            return;
        }
        throw new NullPointerException();
    }
}
