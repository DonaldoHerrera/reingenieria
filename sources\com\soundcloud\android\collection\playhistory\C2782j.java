package com.soundcloud.android.collection.playhistory;

/* renamed from: com.soundcloud.android.collection.playhistory.j reason: case insensitive filesystem */
/* compiled from: AutoValue_PlayHistoryRecord */
final class C2782j extends ua {
    private final long b;
    private final C3508cda c;
    private final C3508cda d;

    /* renamed from: com.soundcloud.android.collection.playhistory.j$a */
    /* compiled from: AutoValue_PlayHistoryRecord */
    static final class a extends com.soundcloud.android.collection.playhistory.ua.a {
        private Long a;
        private C3508cda b;
        private C3508cda c;

        a() {
        }

        public com.soundcloud.android.collection.playhistory.ua.a a(long j) {
            this.a = Long.valueOf(j);
            return this;
        }

        public com.soundcloud.android.collection.playhistory.ua.a b(C3508cda cda) {
            if (cda != null) {
                this.b = cda;
                return this;
            }
            throw new NullPointerException("Null trackUrn");
        }

        public com.soundcloud.android.collection.playhistory.ua.a a(C3508cda cda) {
            if (cda != null) {
                this.c = cda;
                return this;
            }
            throw new NullPointerException("Null contextUrn");
        }

        public ua a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" timestamp");
                str = sb.toString();
            }
            if (this.b == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" trackUrn");
                str = sb2.toString();
            }
            if (this.c == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" contextUrn");
                str = sb3.toString();
            }
            if (str.isEmpty()) {
                C2782j jVar = new C2782j(this.a.longValue(), this.b, this.c);
                return jVar;
            }
            StringBuilder sb4 = new StringBuilder();
            sb4.append("Missing required properties:");
            sb4.append(str);
            throw new IllegalStateException(sb4.toString());
        }
    }

    public C3508cda b() {
        return this.d;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ua)) {
            return false;
        }
        ua uaVar = (ua) obj;
        if (this.b != uaVar.h() || !this.c.equals(uaVar.i()) || !this.d.equals(uaVar.b())) {
            z = false;
        }
        return z;
    }

    public long h() {
        return this.b;
    }

    public int hashCode() {
        long j = this.b;
        return this.d.hashCode() ^ ((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003);
    }

    public C3508cda i() {
        return this.c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PlayHistoryRecord{timestamp=");
        sb.append(this.b);
        sb.append(", trackUrn=");
        sb.append(this.c);
        sb.append(", contextUrn=");
        sb.append(this.d);
        sb.append("}");
        return sb.toString();
    }

    private C2782j(long j, C3508cda cda, C3508cda cda2) {
        this.b = j;
        this.c = cda;
        this.d = cda2;
    }
}
