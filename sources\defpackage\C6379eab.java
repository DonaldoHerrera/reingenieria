package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: eab reason: default package and case insensitive filesystem */
/* compiled from: KPackageImpl.kt */
final class C6379eab extends C7540vYa implements PXa<List<? extends C6922m_a<?>>> {
    final /* synthetic */ a a;

    C6379eab(a aVar) {
        this.a = aVar;
        super(0);
    }

    public final List<C6922m_a<?>> d() {
        C6583hab hab = C6583hab.this;
        Collection a2 = hab.a(hab.f(), c.DECLARED);
        ArrayList arrayList = new ArrayList();
        for (Object next : a2) {
            C4935Gcb i = ((C6922m_a) next).i();
            if (i != null) {
                Yrb yrb = (Yrb) i;
                C5272Rcb e = yrb.e();
                if (e != null) {
                    C6790kdb kdb = (C6790kdb) e;
                    Class cls = null;
                    if (!(kdb instanceof Rhb)) {
                        kdb = null;
                    }
                    Rhb rhb = (Rhb) kdb;
                    C7822zdb source = rhb != null ? rhb.getSource() : null;
                    if (!(source instanceof Ekb)) {
                        source = null;
                    }
                    Ekb ekb = (Ekb) source;
                    Dkb a3 = ekb != null ? ekb.a(yrb) : null;
                    if (!(a3 instanceof C7751ybb)) {
                        a3 = null;
                    }
                    C7751ybb ybb = (C7751ybb) a3;
                    if (ybb != null) {
                        cls = ybb.b();
                    }
                    if (C7471uYa.a((Object) cls, (Object) C6583hab.this.a())) {
                        arrayList.add(next);
                    }
                } else {
                    throw new OVa("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.PackageFragmentDescriptor");
                }
            } else {
                throw new OVa("null cannot be cast to non-null type org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedCallableMemberDescriptor");
            }
        }
        return arrayList;
    }
}
