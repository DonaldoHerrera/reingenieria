package com.soundcloud.android.collections.data;

/* compiled from: LikeEntity.kt */
public final class I {
    private final C3508cda a;
    private final ea b;
    private final long c;
    private final Long d;
    private final Long e;

    public I(C3508cda cda, ea eaVar, long j, Long l, Long l2) {
        C7471uYa.b(cda, "urn");
        C7471uYa.b(eaVar, C1325gg.TYPE);
        this.a = cda;
        this.b = eaVar;
        this.c = j;
        this.d = l;
        this.e = l2;
    }

    public final Long a() {
        return this.d;
    }

    public final long b() {
        return this.c;
    }

    public final Long c() {
        return this.e;
    }

    public final ea d() {
        return this.b;
    }

    public final C3508cda e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof I) {
                I i = (I) obj;
                if (C7471uYa.a((Object) this.a, (Object) i.a) && C7471uYa.a((Object) this.b, (Object) i.b)) {
                    if (!(this.c == i.c) || !C7471uYa.a((Object) this.d, (Object) i.d) || !C7471uYa.a((Object) this.e, (Object) i.e)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        C3508cda cda = this.a;
        int i = 0;
        int hashCode = (cda != null ? cda.hashCode() : 0) * 31;
        ea eaVar = this.b;
        int hashCode2 = (hashCode + (eaVar != null ? eaVar.hashCode() : 0)) * 31;
        long j = this.c;
        int i2 = (hashCode2 + ((int) (j ^ (j >>> 32)))) * 31;
        Long l = this.d;
        int hashCode3 = (i2 + (l != null ? l.hashCode() : 0)) * 31;
        Long l2 = this.e;
        if (l2 != null) {
            i = l2.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("LikeEntity(urn=");
        sb.append(this.a);
        sb.append(", type=");
        sb.append(this.b);
        sb.append(", createdAt=");
        sb.append(this.c);
        sb.append(", addedAt=");
        sb.append(this.d);
        sb.append(", removedAt=");
        sb.append(this.e);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ I(C3508cda cda, ea eaVar, long j, Long l, Long l2, int i, C7264rYa rya) {
        this(cda, eaVar, j, (i & 8) != 0 ? null : l, (i & 16) != 0 ? null : l2);
    }
}
