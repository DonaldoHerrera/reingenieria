package defpackage;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

/* renamed from: mk reason: default package and case insensitive filesystem */
/* compiled from: PersistedEvents */
class C1514mk implements Serializable {
    private HashMap<Qj, List<Uj>> a = new HashMap<>();

    /* renamed from: mk$a */
    /* compiled from: PersistedEvents */
    static class a implements Serializable {
        private final HashMap<Qj, List<Uj>> a;

        private Object readResolve() {
            return new C1514mk(this.a);
        }

        private a(HashMap<Qj, List<Uj>> hashMap) {
            this.a = hashMap;
        }
    }

    public C1514mk() {
    }

    private Object writeReplace() {
        return new a(this.a);
    }

    public Set<Qj> a() {
        return this.a.keySet();
    }

    public List<Uj> b(Qj qj) {
        return (List) this.a.get(qj);
    }

    public boolean a(Qj qj) {
        return this.a.containsKey(qj);
    }

    public C1514mk(HashMap<Qj, List<Uj>> hashMap) {
        this.a.putAll(hashMap);
    }

    public void a(Qj qj, List<Uj> list) {
        if (!this.a.containsKey(qj)) {
            this.a.put(qj, list);
        } else {
            ((List) this.a.get(qj)).addAll(list);
        }
    }
}
