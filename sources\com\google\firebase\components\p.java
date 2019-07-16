package com.google.firebase.components;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: com.google.firebase:firebase-common@@17.0.0 */
class p {

    /* compiled from: com.google.firebase:firebase-common@@17.0.0 */
    private static class a {
        private final e<?> a;
        private final Set<a> b = new HashSet();
        private final Set<a> c = new HashSet();

        a(e<?> eVar) {
            this.a = eVar;
        }

        /* access modifiers changed from: 0000 */
        public void a(a aVar) {
            this.b.add(aVar);
        }

        /* access modifiers changed from: 0000 */
        public void b(a aVar) {
            this.c.add(aVar);
        }

        /* access modifiers changed from: 0000 */
        public void c(a aVar) {
            this.c.remove(aVar);
        }

        /* access modifiers changed from: 0000 */
        public boolean d() {
            return this.c.isEmpty();
        }

        /* access modifiers changed from: 0000 */
        public e<?> a() {
            return this.a;
        }

        /* access modifiers changed from: 0000 */
        public Set<a> b() {
            return this.b;
        }

        /* access modifiers changed from: 0000 */
        public boolean c() {
            return this.b.isEmpty();
        }
    }

    /* compiled from: com.google.firebase:firebase-common@@17.0.0 */
    private static class b {
        private final Class<?> a;
        /* access modifiers changed from: private */
        public final boolean b;

        public boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (!bVar.a.equals(this.a) || bVar.b != this.b) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return ((this.a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.b).hashCode();
        }

        private b(Class<?> cls, boolean z) {
            this.a = cls;
            this.b = z;
        }
    }

    static void a(List<e<?>> list) {
        Set<a> b2 = b(list);
        Set a2 = a(b2);
        int i = 0;
        while (!a2.isEmpty()) {
            a aVar = (a) a2.iterator().next();
            a2.remove(aVar);
            i++;
            for (a aVar2 : aVar.b()) {
                aVar2.c(aVar);
                if (aVar2.d()) {
                    a2.add(aVar2);
                }
            }
        }
        if (i != list.size()) {
            ArrayList arrayList = new ArrayList();
            for (a aVar3 : b2) {
                if (!aVar3.d() && !aVar3.c()) {
                    arrayList.add(aVar3.a());
                }
            }
            throw new r(arrayList);
        }
    }

    private static Set<a> b(List<e<?>> list) {
        HashMap hashMap = new HashMap(list.size());
        for (e eVar : list) {
            a aVar = new a(eVar);
            Iterator it = eVar.c().iterator();
            while (true) {
                if (it.hasNext()) {
                    Class cls = (Class) it.next();
                    b bVar = new b(cls, !eVar.g());
                    if (!hashMap.containsKey(bVar)) {
                        hashMap.put(bVar, new HashSet());
                    }
                    Set set = (Set) hashMap.get(bVar);
                    if (set.isEmpty() || bVar.b) {
                        set.add(aVar);
                    } else {
                        throw new IllegalArgumentException(String.format("Multiple components provide %s.", new Object[]{cls}));
                    }
                }
            }
        }
        for (Set<a> it2 : hashMap.values()) {
            for (a aVar2 : it2) {
                for (q qVar : aVar2.a().a()) {
                    if (qVar.b()) {
                        Set<a> set2 = (Set) hashMap.get(new b(qVar.a(), qVar.d()));
                        if (set2 != null) {
                            for (a aVar3 : set2) {
                                aVar2.a(aVar3);
                                aVar3.b(aVar2);
                            }
                        }
                    }
                }
            }
        }
        HashSet hashSet = new HashSet();
        for (Set addAll : hashMap.values()) {
            hashSet.addAll(addAll);
        }
        return hashSet;
    }

    private static Set<a> a(Set<a> set) {
        HashSet hashSet = new HashSet();
        for (a aVar : set) {
            if (aVar.d()) {
                hashSet.add(aVar);
            }
        }
        return hashSet;
    }
}
