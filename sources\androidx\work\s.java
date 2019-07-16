package androidx.work;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

/* compiled from: WorkRequest */
public abstract class s {
    private UUID a;
    private _e b;
    private Set<String> c;

    /* compiled from: WorkRequest */
    public static abstract class a<B extends a, W extends s> {
        boolean a = false;
        UUID b = UUID.randomUUID();
        _e c;
        Set<String> d = new HashSet();

        a(Class<? extends ListenableWorker> cls) {
            this.c = new _e(this.b.toString(), cls.getName());
            a(cls.getName());
        }

        public final B a(c cVar) {
            this.c.l = cVar;
            return c();
        }

        /* access modifiers changed from: 0000 */
        public abstract W b();

        /* access modifiers changed from: 0000 */
        public abstract B c();

        public final B a(String str) {
            this.d.add(str);
            return c();
        }

        public final W a() {
            W b2 = b();
            this.b = UUID.randomUUID();
            this.c = new _e(this.c);
            this.c.c = this.b.toString();
            return b2;
        }
    }

    protected s(UUID uuid, _e _eVar, Set<String> set) {
        this.a = uuid;
        this.b = _eVar;
        this.c = set;
    }

    public String a() {
        return this.a.toString();
    }

    public Set<String> b() {
        return this.c;
    }

    public _e c() {
        return this.b;
    }
}
