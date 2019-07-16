package defpackage;

import java.util.Iterator;
import java.util.List;

/* renamed from: Xrb reason: default package */
/* compiled from: DeserializedAnnotations.kt */
public class Xrb implements C6723jeb {
    static final /* synthetic */ DZa[] a = {HYa.a((DYa) new EYa(HYa.a(Xrb.class), "annotations", "getAnnotations()Ljava/util/List;"))};
    private final Psb b;

    public Xrb(Ssb ssb, PXa<? extends List<? extends C6315deb>> pXa) {
        C7471uYa.b(ssb, "storageManager");
        C7471uYa.b(pXa, "compute");
        this.b = ssb.a(pXa);
    }

    private final List<C6315deb> a() {
        return (List) Rsb.a(this.b, (Object) this, a[0]);
    }

    public C6315deb a(C7349snb snb) {
        C7471uYa.b(snb, "fqName");
        return b.a(this, snb);
    }

    public boolean b(C7349snb snb) {
        C7471uYa.b(snb, "fqName");
        return b.b(this, snb);
    }

    public boolean isEmpty() {
        return a().isEmpty();
    }

    public Iterator<C6315deb> iterator() {
        return a().iterator();
    }
}
