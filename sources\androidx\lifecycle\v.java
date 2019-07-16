package androidx.lifecycle;

import java.util.HashMap;

/* compiled from: ViewModelStore */
public class v {
    private final HashMap<String, t> a = new HashMap<>();

    /* access modifiers changed from: 0000 */
    public final void a(String str, t tVar) {
        t tVar2 = (t) this.a.put(str, tVar);
        if (tVar2 != null) {
            tVar2.a();
        }
    }

    /* access modifiers changed from: 0000 */
    public final t a(String str) {
        return (t) this.a.get(str);
    }

    public final void a() {
        for (t a2 : this.a.values()) {
            a2.a();
        }
        this.a.clear();
    }
}
