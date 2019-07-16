package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.Gb.c;
import java.util.Collections;
import java.util.List;

public final class S extends Gb<S, a> implements C1037sc {
    private static volatile C1073yc<S> zzuo;
    /* access modifiers changed from: private */
    public static final S zzwo = new S();
    private int zzue;
    private Ob<U> zzwj = Gb.o();
    private String zzwk = "";
    private long zzwl;
    private long zzwm;
    private int zzwn;

    public static final class a extends com.google.android.gms.internal.measurement.Gb.a<S, a> implements C1037sc {
        private a() {
            super(S.zzwo);
        }

        public final U a(int i) {
            return ((S) this.b).b(i);
        }

        public final a b(int i) {
            g();
            ((S) this.b).c(i);
            return this;
        }

        public final String k() {
            return ((S) this.b).q();
        }

        public final long l() {
            return ((S) this.b).r();
        }

        public final List<U> m() {
            return Collections.unmodifiableList(((S) this.b).s());
        }

        public final int n() {
            return ((S) this.b).t();
        }

        public final long o() {
            return ((S) this.b).x();
        }

        /* synthetic */ a(O o) {
            this();
        }

        public final a a(int i, U u) {
            g();
            ((S) this.b).a(i, u);
            return this;
        }

        public final a b(long j) {
            g();
            ((S) this.b).b(j);
            return this;
        }

        public final a a(int i, com.google.android.gms.internal.measurement.U.a aVar) {
            g();
            ((S) this.b).a(i, aVar);
            return this;
        }

        public final a a(U u) {
            g();
            ((S) this.b).a(u);
            return this;
        }

        public final a a(com.google.android.gms.internal.measurement.U.a aVar) {
            g();
            ((S) this.b).a(aVar);
            return this;
        }

        public final a a(String str) {
            g();
            ((S) this.b).a(str);
            return this;
        }

        public final a a(long j) {
            g();
            ((S) this.b).a(j);
            return this;
        }
    }

    static {
        Gb.a(S.class, zzwo);
    }

    private S() {
    }

    public static a A() {
        return (a) zzwo.k();
    }

    private final void C() {
        if (!this.zzwj.K()) {
            this.zzwj = Gb.a(this.zzwj);
        }
    }

    /* access modifiers changed from: private */
    public final void a(int i, U u) {
        if (u != null) {
            C();
            this.zzwj.set(i, u);
            return;
        }
        throw new NullPointerException();
    }

    /* access modifiers changed from: private */
    public final void c(int i) {
        C();
        this.zzwj.remove(i);
    }

    public final U b(int i) {
        return (U) this.zzwj.get(i);
    }

    public final int p() {
        return this.zzwn;
    }

    public final String q() {
        return this.zzwk;
    }

    public final long r() {
        return this.zzwl;
    }

    public final List<U> s() {
        return this.zzwj;
    }

    public final int t() {
        return this.zzwj.size();
    }

    public final boolean u() {
        return (this.zzue & 2) != 0;
    }

    public final long x() {
        return this.zzwm;
    }

    public final boolean y() {
        return (this.zzue & 4) != 0;
    }

    public final boolean z() {
        return (this.zzue & 8) != 0;
    }

    /* access modifiers changed from: private */
    public final void b(long j) {
        this.zzue |= 4;
        this.zzwm = j;
    }

    /* access modifiers changed from: private */
    public final void a(int i, com.google.android.gms.internal.measurement.U.a aVar) {
        C();
        this.zzwj.set(i, (U) aVar.w());
    }

    /* access modifiers changed from: private */
    public final void a(U u) {
        if (u != null) {
            C();
            this.zzwj.add(u);
            return;
        }
        throw new NullPointerException();
    }

    /* access modifiers changed from: private */
    public final void a(com.google.android.gms.internal.measurement.U.a aVar) {
        C();
        this.zzwj.add((U) aVar.w());
    }

    /* access modifiers changed from: private */
    public final void a(String str) {
        if (str != null) {
            this.zzue |= 1;
            this.zzwk = str;
            return;
        }
        throw new NullPointerException();
    }

    /* access modifiers changed from: private */
    public final void a(long j) {
        this.zzue |= 2;
        this.zzwl = j;
    }

    public static S a(byte[] bArr, C1042tb tbVar) throws Rb {
        return (S) Gb.a(zzwo, bArr, tbVar);
    }

    /* access modifiers changed from: protected */
    public final Object a(int i, Object obj, Object obj2) {
        switch (O.a[i - 1]) {
            case 1:
                return new S();
            case 2:
                return new a(null);
            case 3:
                return Gb.a((C1026qc) zzwo, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u001b\u0002\b\u0000\u0003\u0002\u0001\u0004\u0002\u0002\u0005\u0004\u0003", new Object[]{"zzue", "zzwj", U.class, "zzwk", "zzwl", "zzwm", "zzwn"});
            case 4:
                return zzwo;
            case 5:
                C1073yc<S> ycVar = zzuo;
                if (ycVar == null) {
                    synchronized (S.class) {
                        ycVar = zzuo;
                        if (ycVar == null) {
                            ycVar = new c<>(zzwo);
                            zzuo = ycVar;
                        }
                    }
                }
                return ycVar;
            case 6:
                return Byte.valueOf(1);
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
