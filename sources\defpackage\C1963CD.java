package defpackage;

import com.google.common.base.Predicate;
import java.util.Iterator;

/* renamed from: CD reason: default package and case insensitive filesystem */
/* compiled from: Iterators */
class C1963CD extends C2400ZC<T> {
    final /* synthetic */ Iterator c;
    final /* synthetic */ Predicate d;

    C1963CD(Iterator it, Predicate predicate) {
        this.c = it;
        this.d = predicate;
    }

    /* access modifiers changed from: protected */
    public T a() {
        while (this.c.hasNext()) {
            T next = this.c.next();
            if (this.d.apply(next)) {
                return next;
            }
        }
        return b();
    }
}
