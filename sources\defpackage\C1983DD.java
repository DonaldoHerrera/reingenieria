package defpackage;

import com.google.common.base.Function;
import java.util.Iterator;

/* renamed from: DD reason: default package and case insensitive filesystem */
/* compiled from: Iterators */
class C1983DD extends C2950dE<F, T> {
    final /* synthetic */ Function b;

    C1983DD(Iterator it, Function function) {
        this.b = function;
        super(it);
    }

    /* access modifiers changed from: 0000 */
    public T a(F f) {
        return this.b.apply(f);
    }
}
