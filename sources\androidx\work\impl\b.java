package androidx.work.impl;

import androidx.lifecycle.o;
import androidx.work.m;
import androidx.work.m.a;
import androidx.work.m.a.C0028a;
import androidx.work.m.a.c;

/* compiled from: OperationImpl */
public class b implements m {
    private final o<a> a = new o<>();
    private final C1781vf<c> b = C1781vf.d();

    public b() {
        a(m.b);
    }

    public void a(a aVar) {
        this.a.a(aVar);
        if (aVar instanceof c) {
            this.b.b((c) aVar);
        } else if (aVar instanceof C0028a) {
            this.b.a(((C0028a) aVar).a());
        }
    }
}
