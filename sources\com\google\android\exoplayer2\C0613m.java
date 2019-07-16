package com.google.android.exoplayer2;

/* renamed from: com.google.android.exoplayer2.m reason: case insensitive filesystem */
/* compiled from: BasePlayer */
public abstract class C0613m implements K {
    protected final com.google.android.exoplayer2.X.b a = new com.google.android.exoplayer2.X.b();

    /* renamed from: com.google.android.exoplayer2.m$a */
    /* compiled from: BasePlayer */
    protected static final class a {
        public final com.google.android.exoplayer2.K.b a;
        private boolean b;

        public a(com.google.android.exoplayer2.K.b bVar) {
            this.a = bVar;
        }

        public void a() {
            this.b = true;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            return this.a.equals(((a) obj).a);
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public void a(b bVar) {
            if (!this.b) {
                bVar.a(this.a);
            }
        }
    }

    /* renamed from: com.google.android.exoplayer2.m$b */
    /* compiled from: BasePlayer */
    protected interface b {
        void a(com.google.android.exoplayer2.K.b bVar);
    }

    public final void a(long j) {
        a(b(), j);
    }

    public final long g() {
        X d = d();
        if (d.c()) {
            return -9223372036854775807L;
        }
        return d.a(b(), this.a).c();
    }

    public final boolean h() {
        X d = d();
        return !d.c() && d.a(b(), this.a).d;
    }

    public final void i() {
        a(false);
    }
}
