package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: Iqb reason: default package */
/* compiled from: StaticScopeForKotlinEnum.kt */
public final class Iqb extends Fqb {
    static final /* synthetic */ DZa[] a = {HYa.a((DYa) new EYa(HYa.a(Iqb.class), "functions", "getFunctions()Ljava/util/List;"))};
    private final Psb b;
    /* access modifiers changed from: private */
    public final C5029Jcb c;

    public Iqb(Ssb ssb, C5029Jcb jcb) {
        C7471uYa.b(ssb, "storageManager");
        C7471uYa.b(jcb, "containingClass");
        this.c = jcb;
        boolean z = this.c.g() == C5060Kcb.ENUM_CLASS;
        if (!TVa.a || z) {
            this.b = ssb.a((PXa<? extends T>) new Hqb<Object>(this));
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Class should be an enum: ");
        sb.append(this.c);
        throw new AssertionError(sb.toString());
    }

    private final List<C7684xdb> c() {
        return (List) Rsb.a(this.b, (Object) this, a[0]);
    }

    public Void b(C7694xnb xnb, Dfb dfb) {
        C7471uYa.b(xnb, "name");
        C7471uYa.b(dfb, "location");
        return null;
    }

    public List<C7684xdb> a(C7700xqb xqb, _Xa<? super C7694xnb, Boolean> _xa) {
        C7471uYa.b(xqb, "kindFilter");
        C7471uYa.b(_xa, "nameFilter");
        return c();
    }

    public ArrayList<C7684xdb> a(C7694xnb xnb, Dfb dfb) {
        C7471uYa.b(xnb, "name");
        C7471uYa.b(dfb, "location");
        List c2 = c();
        ArrayList<C7684xdb> arrayList = new ArrayList<>(1);
        for (Object next : c2) {
            if (C7471uYa.a((Object) ((C7684xdb) next).getName(), (Object) xnb)) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }
}
