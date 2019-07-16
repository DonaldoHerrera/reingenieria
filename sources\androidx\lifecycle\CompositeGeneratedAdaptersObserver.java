package androidx.lifecycle;

import androidx.lifecycle.f.a;

public class CompositeGeneratedAdaptersObserver implements e {
    private final d[] a;

    CompositeGeneratedAdaptersObserver(d[] dVarArr) {
        this.a = dVarArr;
    }

    public void a(h hVar, a aVar) {
        n nVar = new n();
        for (d a2 : this.a) {
            a2.a(hVar, aVar, false, nVar);
        }
        for (d a3 : this.a) {
            a3.a(hVar, aVar, true, nVar);
        }
    }
}
