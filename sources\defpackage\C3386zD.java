package defpackage;

import com.google.common.base.Predicate;
import java.util.Iterator;

/* renamed from: zD reason: default package and case insensitive filesystem */
/* compiled from: Iterables */
class C3386zD extends C3226rD<T> {
    final /* synthetic */ Iterable b;
    final /* synthetic */ Predicate c;

    C3386zD(Iterable iterable, Predicate predicate) {
        this.b = iterable;
        this.c = predicate;
    }

    public Iterator<T> iterator() {
        return C2023FD.b(this.b.iterator(), this.c);
    }
}
