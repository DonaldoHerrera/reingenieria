package defpackage;

import com.google.common.base.Function;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import java.io.Serializable;

/* renamed from: hD reason: default package and case insensitive filesystem */
/* compiled from: ByFunctionOrdering */
final class C3025hD<F, T> extends C2291TD<F> implements Serializable {
    final Function<F, ? extends T> a;
    final C2291TD<T> b;

    C3025hD(Function<F, ? extends T> function, C2291TD<T> td) {
        Preconditions.checkNotNull(function);
        this.a = function;
        Preconditions.checkNotNull(td);
        this.b = td;
    }

    public int compare(F f, F f2) {
        return this.b.compare(this.a.apply(f), this.a.apply(f2));
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3025hD)) {
            return false;
        }
        C3025hD hDVar = (C3025hD) obj;
        if (!this.a.equals(hDVar.a) || !this.b.equals(hDVar.b)) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return Objects.hashCode(this.a, this.b);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.b);
        sb.append(".onResultOf(");
        sb.append(this.a);
        sb.append(")");
        return sb.toString();
    }
}
