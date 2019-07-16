package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

/* renamed from: Oeb reason: default package */
/* compiled from: CompositePackageFragmentProvider.kt */
public final class Oeb implements C6858ldb {
    private final List<C6858ldb> a;

    public Oeb(List<? extends C6858ldb> list) {
        C7471uYa.b(list, "providers");
        this.a = list;
    }

    public List<C6790kdb> a(C7349snb snb) {
        C7471uYa.b(snb, "fqName");
        ArrayList arrayList = new ArrayList();
        for (C6858ldb a2 : this.a) {
            arrayList.addAll(a2.a(snb));
        }
        return C7676xWa.q(arrayList);
    }

    public Collection<C7349snb> a(C7349snb snb, _Xa<? super C7694xnb, Boolean> _xa) {
        C7471uYa.b(snb, "fqName");
        C7471uYa.b(_xa, "nameFilter");
        HashSet hashSet = new HashSet();
        for (C6858ldb a2 : this.a) {
            hashSet.addAll(a2.a(snb, _xa));
        }
        return hashSet;
    }
}
