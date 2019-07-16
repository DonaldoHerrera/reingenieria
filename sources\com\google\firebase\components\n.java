package com.google.firebase.components;

import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: com.google.firebase:firebase-common@@17.0.0 */
public class n extends a {
    private static final C2273SE<Set<Object>> a = m.a();
    private final Map<e<?>, v<?>> b = new HashMap();
    private final Map<Class<?>, v<?>> c = new HashMap();
    private final Map<Class<?>, v<Set<?>>> d = new HashMap();
    private final u e;

    public n(Executor executor, Iterable<j> iterable, e<?>... eVarArr) {
        this.e = new u(executor);
        ArrayList<e> arrayList = new ArrayList<>();
        arrayList.add(e.a(this.e, u.class, C2235QE.class, C2216PE.class));
        for (j components : iterable) {
            arrayList.addAll(components.getComponents());
        }
        Collections.addAll(arrayList, eVarArr);
        p.a((List<e<?>>) arrayList);
        for (e eVar : arrayList) {
            this.b.put(eVar, new v(k.a(this, eVar)));
        }
        a();
        b();
    }

    public /* bridge */ /* synthetic */ Set b(Class cls) {
        return super.b(cls);
    }

    public <T> C2273SE<T> c(Class<T> cls) {
        Preconditions.checkNotNull(cls, "Null interface requested.");
        return (C2273SE) this.c.get(cls);
    }

    public /* bridge */ /* synthetic */ Object get(Class cls) {
        return super.get(cls);
    }

    private void a() {
        for (Entry entry : this.b.entrySet()) {
            e eVar = (e) entry.getKey();
            if (eVar.g()) {
                v vVar = (v) entry.getValue();
                for (Class put : eVar.c()) {
                    this.c.put(put, vVar);
                }
            }
        }
        c();
    }

    private void b() {
        HashMap hashMap = new HashMap();
        for (Entry entry : this.b.entrySet()) {
            e eVar = (e) entry.getKey();
            if (!eVar.g()) {
                v vVar = (v) entry.getValue();
                for (Class cls : eVar.c()) {
                    if (!hashMap.containsKey(cls)) {
                        hashMap.put(cls, new HashSet());
                    }
                    ((Set) hashMap.get(cls)).add(vVar);
                }
            }
        }
        for (Entry entry2 : hashMap.entrySet()) {
            this.d.put((Class) entry2.getKey(), new v(l.a((Set) entry2.getValue())));
        }
    }

    private void c() {
        for (e eVar : this.b.keySet()) {
            Iterator it = eVar.a().iterator();
            while (true) {
                if (it.hasNext()) {
                    q qVar = (q) it.next();
                    if (qVar.c() && !this.c.containsKey(qVar.a())) {
                        throw new w(String.format("Unsatisfied dependency for component %s: %s", new Object[]{eVar, qVar.a()}));
                    }
                }
            }
        }
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.Set, code=java.util.Set<com.google.firebase.components.v>, for r2v0, types: [java.util.Set, java.util.Set<com.google.firebase.components.v>] */
    static /* synthetic */ Set a(Set<v> set) {
        HashSet hashSet = new HashSet();
        for (v vVar : set) {
            hashSet.add(vVar.get());
        }
        return Collections.unmodifiableSet(hashSet);
    }

    public <T> C2273SE<Set<T>> a(Class<T> cls) {
        v vVar = (v) this.d.get(cls);
        if (vVar != null) {
            return vVar;
        }
        return a;
    }

    public void a(boolean z) {
        for (Entry entry : this.b.entrySet()) {
            e eVar = (e) entry.getKey();
            v vVar = (v) entry.getValue();
            if (eVar.e() || (eVar.f() && z)) {
                vVar.get();
            }
        }
        this.e.a();
    }
}
