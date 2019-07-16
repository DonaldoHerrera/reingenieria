package defpackage;

import java.util.Collection;

/* renamed from: Zeb reason: default package */
/* compiled from: FunctionDescriptorImpl */
class Zeb implements PXa<Collection<C5582adb>> {
    final /* synthetic */ _tb a;
    final /* synthetic */ _eb b;

    Zeb(_eb _eb, _tb _tb) {
        this.b = _eb;
        this.a = _tb;
    }

    public Collection<C5582adb> d() {
        Fvb fvb = new Fvb();
        for (C5582adb a2 : this.b.j()) {
            fvb.add(a2.a(this.a));
        }
        return fvb;
    }
}
