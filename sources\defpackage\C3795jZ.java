package defpackage;

/* renamed from: jZ reason: default package and case insensitive filesystem */
/* compiled from: $AutoValue_OfflinePerformanceEvent */
abstract class C3795jZ extends Aaa {
    private final String a;
    private final long b;
    private final a c;
    private final C3508cda d;
    private final C3508cda e;
    private final boolean f;
    private final boolean g;

    C3795jZ(String str, long j, a aVar, C3508cda cda, C3508cda cda2, boolean z, boolean z2) {
        if (str != null) {
            this.a = str;
            this.b = j;
            if (aVar != null) {
                this.c = aVar;
                if (cda != null) {
                    this.d = cda;
                    if (cda2 != null) {
                        this.e = cda2;
                        this.f = z;
                        this.g = z2;
                        return;
                    }
                    throw new NullPointerException("Null trackOwner");
                }
                throw new NullPointerException("Null trackUrn");
            }
            throw new NullPointerException("Null kind");
        }
        throw new NullPointerException("Null id");
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Aaa)) {
            return false;
        }
        Aaa aaa = (Aaa) obj;
        if (!this.a.equals(aaa.f()) || this.b != aaa.g() || !this.c.equals(aaa.i()) || !this.d.equals(aaa.l()) || !this.e.equals(aaa.k()) || this.f != aaa.j() || this.g != aaa.h()) {
            z = false;
        }
        return z;
    }

    @C3783hda
    public String f() {
        return this.a;
    }

    @C3783hda
    public long g() {
        return this.b;
    }

    public boolean h() {
        return this.g;
    }

    public int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        long j = this.b;
        int i = 1231;
        int hashCode2 = (((((((((hashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ (this.f ? 1231 : 1237)) * 1000003;
        if (!this.g) {
            i = 1237;
        }
        return hashCode2 ^ i;
    }

    public a i() {
        return this.c;
    }

    public boolean j() {
        return this.f;
    }

    public C3508cda k() {
        return this.e;
    }

    public C3508cda l() {
        return this.d;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("OfflinePerformanceEvent{id=");
        sb.append(this.a);
        sb.append(", timestamp=");
        sb.append(this.b);
        sb.append(", kind=");
        sb.append(this.c);
        sb.append(", trackUrn=");
        sb.append(this.d);
        sb.append(", trackOwner=");
        sb.append(this.e);
        sb.append(", partOfPlaylist=");
        sb.append(this.f);
        sb.append(", isFromLikes=");
        sb.append(this.g);
        sb.append("}");
        return sb.toString();
    }
}
