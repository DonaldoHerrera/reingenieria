package defpackage;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: Pd reason: default package */
/* compiled from: AbstractSavedStateRegistry */
public abstract class Pd<S> implements Qd<S> {
    private J<String, a<S>> a = new J<>();
    private Map<String, S> b;
    private boolean c;

    /* access modifiers changed from: protected */
    public final void a(Map<String, S> map) {
        if (map != null) {
            this.b = new HashMap(map);
        }
        this.c = true;
    }

    /* access modifiers changed from: protected */
    public final Map<String, S> a() {
        HashMap hashMap = new HashMap();
        Map<String, S> map = this.b;
        if (map != null) {
            hashMap.putAll(map);
        }
        d g = this.a.g();
        while (g.hasNext()) {
            Entry entry = (Entry) g.next();
            hashMap.put(entry.getKey(), ((a) entry.getValue()).a());
        }
        return hashMap;
    }
}
