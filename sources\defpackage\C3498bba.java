package defpackage;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: bba reason: default package and case insensitive filesystem */
/* compiled from: UserChangedEvent */
public abstract class C3498bba {
    public static C3498bba a(C3784hea hea) {
        return new C3828naa(Collections.singletonMap(hea.a, hea));
    }

    public abstract Map<C3508cda, C3784hea> a();

    public static C3498bba a(Collection<C3784hea> collection) {
        HashMap hashMap = new HashMap(collection.size());
        for (C3784hea hea : collection) {
            hashMap.put(hea.a, hea);
        }
        return new C3828naa(hashMap);
    }
}
