package defpackage;

import java.io.IOException;
import java.util.Iterator;

/* renamed from: MKa reason: default package and case insensitive filesystem */
/* compiled from: Joiner */
class C5115MKa extends C5176OKa {
    final /* synthetic */ C5176OKa b;

    public <A extends Appendable> A a(A a, Iterator<?> it) throws IOException {
        if (a == null) {
            throw new NullPointerException("appendable");
        } else if (it != null) {
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (next != null) {
                    a.append(this.b.a(next));
                    break;
                }
            }
            while (it.hasNext()) {
                Object next2 = it.next();
                if (next2 != null) {
                    a.append(this.b.a);
                    a.append(this.b.a(next2));
                }
            }
            return a;
        } else {
            throw new NullPointerException("parts");
        }
    }
}
