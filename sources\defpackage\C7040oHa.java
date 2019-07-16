package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: oHa reason: default package and case insensitive filesystem */
/* compiled from: DiffUtils */
public class C7040oHa {
    public static List<C3508cda> a(Collection<C3508cda> collection, Collection<C3508cda> collection2) {
        ArrayList arrayList = new ArrayList(collection);
        arrayList.removeAll(collection2);
        return arrayList;
    }
}
