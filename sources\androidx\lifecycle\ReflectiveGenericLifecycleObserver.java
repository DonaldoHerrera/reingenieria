package androidx.lifecycle;

import androidx.lifecycle.f.a;

class ReflectiveGenericLifecycleObserver implements e {
    private final Object a;
    private final C0009a b = a.a.a(this.a.getClass());

    ReflectiveGenericLifecycleObserver(Object obj) {
        this.a = obj;
    }

    public void a(h hVar, a aVar) {
        this.b.a(hVar, aVar, this.a);
    }
}
