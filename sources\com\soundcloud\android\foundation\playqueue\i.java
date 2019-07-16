package com.soundcloud.android.foundation.playqueue;

import com.soundcloud.android.foundation.playqueue.v.b;

/* compiled from: AutoValue_PlaybackContext */
final class i extends v {
    private final com.soundcloud.android.foundation.playqueue.v.a a;
    private final C4928GKa<C3508cda> b;
    private final C4928GKa<String> c;

    /* compiled from: AutoValue_PlaybackContext */
    static final class a extends b {
        private com.soundcloud.android.foundation.playqueue.v.a a;
        private C4928GKa<C3508cda> b;
        private C4928GKa<String> c;

        a() {
        }

        public b a(com.soundcloud.android.foundation.playqueue.v.a aVar) {
            if (aVar != null) {
                this.a = aVar;
                return this;
            }
            throw new NullPointerException("Null bucket");
        }

        public b b(C4928GKa<C3508cda> gKa) {
            if (gKa != null) {
                this.b = gKa;
                return this;
            }
            throw new NullPointerException("Null urn");
        }

        public b a(C4928GKa<String> gKa) {
            if (gKa != null) {
                this.c = gKa;
                return this;
            }
            throw new NullPointerException("Null query");
        }

        public v a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" bucket");
                str = sb.toString();
            }
            if (this.b == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" urn");
                str = sb2.toString();
            }
            if (this.c == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" query");
                str = sb3.toString();
            }
            if (str.isEmpty()) {
                return new i(this.a, this.b, this.c);
            }
            StringBuilder sb4 = new StringBuilder();
            sb4.append("Missing required properties:");
            sb4.append(str);
            throw new IllegalStateException(sb4.toString());
        }
    }

    public com.soundcloud.android.foundation.playqueue.v.a a() {
        return this.a;
    }

    public C4928GKa<String> c() {
        return this.c;
    }

    public C4928GKa<C3508cda> d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        if (!this.a.equals(vVar.a()) || !this.b.equals(vVar.d()) || !this.c.equals(vVar.c())) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PlaybackContext{bucket=");
        sb.append(this.a);
        sb.append(", urn=");
        sb.append(this.b);
        sb.append(", query=");
        sb.append(this.c);
        sb.append("}");
        return sb.toString();
    }

    private i(com.soundcloud.android.foundation.playqueue.v.a aVar, C4928GKa<C3508cda> gKa, C4928GKa<String> gKa2) {
        this.a = aVar;
        this.b = gKa;
        this.c = gKa2;
    }
}
