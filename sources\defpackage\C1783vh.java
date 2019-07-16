package defpackage;

import java.util.Set;

/* renamed from: vh reason: default package and case insensitive filesystem */
/* compiled from: SamplingEventFilter */
class C1783vh implements C1480lh {
    static final Set<b> a = new C1753uh();
    final int b;

    public C1783vh(int i) {
        this.b = i;
    }

    public boolean a(Bh bh) {
        boolean z = a.contains(bh.c) && bh.a.e == null;
        boolean z2 = Math.abs(bh.a.c.hashCode() % this.b) != 0;
        if (!z || !z2) {
            return false;
        }
        return true;
    }
}
