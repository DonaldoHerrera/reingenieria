package defpackage;

import com.google.common.base.Function;
import java.io.Serializable;

/* renamed from: GKa reason: default package and case insensitive filesystem */
/* compiled from: Optional */
public abstract class C4928GKa<T> implements Serializable {
    C4928GKa() {
    }

    public static <T> C4928GKa<T> a() {
        return C4835DKa.e();
    }

    public static <T> C4928GKa<T> b(T t) {
        return t == null ? a() : new C4959HKa(t);
    }

    public static <T> C4928GKa<T> c(T t) {
        if (t != null) {
            return new C4959HKa(t);
        }
        throw new IllegalArgumentException("Optional reference cannot be null");
    }

    public abstract C4928GKa<T> a(C4928GKa<? extends T> gKa);

    public abstract <V> C4928GKa<V> b(Function<? super T, V> function);

    public abstract T b();

    public abstract boolean c();

    public abstract T d();

    public abstract T d(T t);

    public abstract boolean equals(Object obj);

    public abstract int hashCode();

    public C4928GKa<T> a(Function<? super T, Boolean> function) {
        if (c()) {
            Boolean bool = (Boolean) function.apply(b());
            if (bool == null) {
                throw new NullPointerException();
            } else if (bool.booleanValue()) {
                return this;
            }
        }
        return a();
    }

    public void a(C7733yKa<? super T> yka) {
        if (c()) {
            yka.accept(b());
        }
    }

    public boolean a(T t) {
        return c() && b().equals(t);
    }
}
