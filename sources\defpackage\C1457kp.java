package defpackage;

import java.util.ArrayDeque;
import java.util.PriorityQueue;

/* renamed from: kp reason: default package and case insensitive filesystem */
/* compiled from: CeaDecoder */
abstract class C1457kp implements Yo {
    private final ArrayDeque<a> a = new ArrayDeque<>();
    private final ArrayDeque<C1211cp> b;
    private final PriorityQueue<a> c;
    private a d;
    private long e;
    private long f;

    /* renamed from: kp$a */
    /* compiled from: CeaDecoder */
    private static final class a extends C0500bp implements Comparable<a> {
        /* access modifiers changed from: private */
        public long g;

        private a() {
        }

        /* renamed from: a */
        public int compareTo(a aVar) {
            int i = 1;
            if (d() != aVar.d()) {
                if (!d()) {
                    i = -1;
                }
                return i;
            }
            long j = this.d - aVar.d;
            if (j == 0) {
                j = this.g - aVar.g;
                if (j == 0) {
                    return 0;
                }
            }
            if (j <= 0) {
                i = -1;
            }
            return i;
        }
    }

    /* renamed from: kp$b */
    /* compiled from: CeaDecoder */
    private final class b extends C1211cp {
        private b() {
        }

        public final void f() {
            C1457kp.this.a((C1211cp) this);
        }
    }

    public C1457kp() {
        for (int i = 0; i < 10; i++) {
            this.a.add(new a());
        }
        this.b = new ArrayDeque<>();
        for (int i2 = 0; i2 < 2; i2++) {
            this.b.add(new b());
        }
        this.c = new PriorityQueue<>();
    }

    /* access modifiers changed from: protected */
    public abstract void a(C0500bp bpVar);

    /* access modifiers changed from: protected */
    public abstract Xo c();

    /* access modifiers changed from: protected */
    public abstract boolean d();

    public void flush() {
        this.f = 0;
        this.e = 0;
        while (!this.c.isEmpty()) {
            a((a) this.c.poll());
        }
        a aVar = this.d;
        if (aVar != null) {
            a(aVar);
            this.d = null;
        }
    }

    public void release() {
    }

    public C0500bp b() throws Zo {
        C1852xq.b(this.d == null);
        if (this.a.isEmpty()) {
            return null;
        }
        this.d = (a) this.a.pollFirst();
        return this.d;
    }

    public void a(long j) {
        this.e = j;
    }

    public C1211cp a() throws Zo {
        if (this.b.isEmpty()) {
            return null;
        }
        while (!this.c.isEmpty() && ((a) this.c.peek()).d <= this.e) {
            a aVar = (a) this.c.poll();
            if (aVar.d()) {
                C1211cp cpVar = (C1211cp) this.b.pollFirst();
                cpVar.b(4);
                a(aVar);
                return cpVar;
            }
            a((C0500bp) aVar);
            if (d()) {
                Xo c2 = c();
                if (!aVar.c()) {
                    C1211cp cpVar2 = (C1211cp) this.b.pollFirst();
                    cpVar2.a(aVar.d, c2, Long.MAX_VALUE);
                    a(aVar);
                    return cpVar2;
                }
            }
            a(aVar);
        }
        return null;
    }

    /* renamed from: b */
    public void a(C0500bp bpVar) throws Zo {
        C1852xq.a(bpVar == this.d);
        if (bpVar.c()) {
            a(this.d);
        } else {
            a aVar = this.d;
            long j = this.f;
            this.f = 1 + j;
            aVar.g = j;
            this.c.add(this.d);
        }
        this.d = null;
    }

    private void a(a aVar) {
        aVar.b();
        this.a.add(aVar);
    }

    /* access modifiers changed from: protected */
    public void a(C1211cp cpVar) {
        cpVar.b();
        this.b.add(cpVar);
    }
}
