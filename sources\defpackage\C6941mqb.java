package defpackage;

import java.util.Collection;

/* renamed from: mqb reason: default package and case insensitive filesystem */
/* compiled from: DescriptorUtils.kt */
final class C6941mqb<N> implements b<N> {
    final /* synthetic */ boolean a;

    C6941mqb(boolean z) {
        this.a = z;
    }

    public final Iterable<C4935Gcb> a(C4935Gcb gcb) {
        if (this.a) {
            gcb = gcb != null ? gcb.getOriginal() : null;
        }
        if (gcb != null) {
            Collection j = gcb.j();
            if (j != null) {
                return j;
            }
        }
        return C6918mWa.a();
    }
}
