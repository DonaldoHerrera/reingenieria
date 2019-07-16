package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: odb reason: default package and case insensitive filesystem */
/* compiled from: PackageFragmentProviderImpl.kt */
public final class C7063odb implements C6858ldb {
    private final Collection<C6790kdb> a;

    public C7063odb(Collection<? extends C6790kdb> collection) {
        C7471uYa.b(collection, "packageFragments");
        this.a = collection;
    }

    public List<C6790kdb> a(C7349snb snb) {
        C7471uYa.b(snb, "fqName");
        Collection<C6790kdb> collection = this.a;
        ArrayList arrayList = new ArrayList();
        for (Object next : collection) {
            if (C7471uYa.a((Object) ((C6790kdb) next).q(), (Object) snb)) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public Collection<C7349snb> a(C7349snb snb, _Xa<? super C7694xnb, Boolean> _xa) {
        C7471uYa.b(snb, "fqName");
        C7471uYa.b(_xa, "nameFilter");
        return Ywb.g(Ywb.a(Ywb.d(C7676xWa.d(this.a), C6926mdb.a), (_Xa<? super T, Boolean>) new C6994ndb<Object,Boolean>(snb)));
    }
}
