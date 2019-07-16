package defpackage;

import java.util.Iterator;

/* renamed from: FKa reason: default package and case insensitive filesystem */
/* compiled from: Optional */
final class C4897FKa implements Iterable<T> {
    final /* synthetic */ Iterable a;

    public Iterator<T> iterator() {
        Iterator it = this.a.iterator();
        if (it != null) {
            return new C4866EKa(this, it);
        }
        throw new NullPointerException();
    }
}
