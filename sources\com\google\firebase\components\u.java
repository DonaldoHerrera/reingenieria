package com.google.firebase.components;

import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* compiled from: com.google.firebase:firebase-common@@17.0.0 */
class u implements C2235QE, C2216PE {
    private final Map<Class<?>, ConcurrentHashMap<C2197OE<Object>, Executor>> a = new HashMap();
    private Queue<C2178NE<?>> b = new ArrayDeque();
    private final Executor c;

    u(Executor executor) {
        this.c = executor;
    }

    private synchronized Set<Entry<C2197OE<Object>, Executor>> b(C2178NE<?> ne) {
        Map map;
        map = (Map) this.a.get(ne.b());
        return map == null ? Collections.emptySet() : map.entrySet();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001c, code lost:
        if (r0.hasNext() == false) goto L_0x0032;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001e, code lost:
        r1 = (java.util.Map.Entry) r0.next();
        ((java.util.concurrent.Executor) r1.getValue()).execute(com.google.firebase.components.t.a(r1, r4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0032, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0010, code lost:
        r0 = b(r4).iterator();
     */
    public void a(C2178NE<?> ne) {
        Preconditions.checkNotNull(ne);
        synchronized (this) {
            if (this.b != null) {
                this.b.add(ne);
            }
        }
    }

    public synchronized <T> void a(Class<T> cls, Executor executor, C2197OE<? super T> oe) {
        Preconditions.checkNotNull(cls);
        Preconditions.checkNotNull(oe);
        Preconditions.checkNotNull(executor);
        if (!this.a.containsKey(cls)) {
            this.a.put(cls, new ConcurrentHashMap());
        }
        ((ConcurrentHashMap) this.a.get(cls)).put(oe, executor);
    }

    public <T> void a(Class<T> cls, C2197OE<? super T> oe) {
        a(cls, this.c, oe);
    }

    /* access modifiers changed from: 0000 */
    public void a() {
        Queue<C2178NE> queue;
        synchronized (this) {
            if (this.b != null) {
                queue = this.b;
                this.b = null;
            } else {
                queue = null;
            }
        }
        if (queue != null) {
            for (C2178NE a2 : queue) {
                a(a2);
            }
        }
    }
}
