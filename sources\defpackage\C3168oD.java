package defpackage;

import com.google.common.base.Preconditions;
import java.io.Serializable;
import java.util.Comparator;

/* renamed from: oD reason: default package and case insensitive filesystem */
/* compiled from: ComparatorOrdering */
final class C3168oD<T> extends C2291TD<T> implements Serializable {
    final Comparator<T> a;

    C3168oD(Comparator<T> comparator) {
        Preconditions.checkNotNull(comparator);
        this.a = comparator;
    }

    public int compare(T t, T t2) {
        return this.a.compare(t, t2);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3168oD)) {
            return false;
        }
        return this.a.equals(((C3168oD) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return this.a.toString();
    }
}
