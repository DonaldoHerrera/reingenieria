package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: sz reason: default package and case insensitive filesystem */
final class C1711sz implements Py<Void, Wy<List<Wy<?>>>> {
    private final /* synthetic */ Collection a;

    C1711sz(Collection collection) {
        this.a = collection;
    }

    public final /* synthetic */ Object then(Wy wy) throws Exception {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.a);
        return Zy.a(arrayList);
    }
}
