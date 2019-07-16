package androidx.lifecycle;

import androidx.lifecycle.f.a;

class FullLifecycleObserverAdapter implements e {
    private final b a;

    FullLifecycleObserverAdapter(b bVar) {
        this.a = bVar;
    }

    public void a(h hVar, a aVar) {
        switch (c.a[aVar.ordinal()]) {
            case 1:
                this.a.a(hVar);
                return;
            case 2:
                this.a.f(hVar);
                return;
            case 3:
                this.a.b(hVar);
                return;
            case 4:
                this.a.c(hVar);
                return;
            case 5:
                this.a.d(hVar);
                return;
            case 6:
                this.a.e(hVar);
                return;
            case 7:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
            default:
                return;
        }
    }
}
