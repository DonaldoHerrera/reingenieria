package defpackage;

import com.google.common.base.Function;
import java.util.Iterator;

/* renamed from: AD reason: default package and case insensitive filesystem */
/* compiled from: Iterables */
class C1923AD extends C3226rD<T> {
    final /* synthetic */ Iterable b;
    final /* synthetic */ Function c;

    C1923AD(Iterable iterable, Function function) {
        this.b = iterable;
        this.c = function;
    }

    public Iterator<T> iterator() {
        return C2023FD.a(this.b.iterator(), this.c);
    }
}
