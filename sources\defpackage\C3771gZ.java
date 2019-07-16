package defpackage;

import java.util.List;

/* renamed from: gZ reason: default package and case insensitive filesystem */
/* compiled from: $AutoValue_InlayAdImpressionEvent */
abstract class C3771gZ extends C3916yaa {
    private final String b;
    private final long c;
    private final C3508cda d;
    private final int e;
    private final List<String> f;

    C3771gZ(String str, long j, C3508cda cda, int i, List<String> list) {
        if (str != null) {
            this.b = str;
            this.c = j;
            if (cda != null) {
                this.d = cda;
                this.e = i;
                if (list != null) {
                    this.f = list;
                    return;
                }
                throw new NullPointerException("Null impressionUrls");
            }
            throw new NullPointerException("Null ad");
        }
        throw new NullPointerException("Null id");
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3916yaa)) {
            return false;
        }
        C3916yaa yaa = (C3916yaa) obj;
        if (!this.b.equals(yaa.f()) || this.c != yaa.g() || !this.d.equals(yaa.h()) || this.e != yaa.i() || !this.f.equals(yaa.j())) {
            z = false;
        }
        return z;
    }

    @C3783hda
    public String f() {
        return this.b;
    }

    @C3783hda
    public long g() {
        return this.c;
    }

    public C3508cda h() {
        return this.d;
    }

    public int hashCode() {
        int hashCode = (this.b.hashCode() ^ 1000003) * 1000003;
        long j = this.c;
        return ((((((hashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e) * 1000003) ^ this.f.hashCode();
    }

    public int i() {
        return this.e;
    }

    public List<String> j() {
        return this.f;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("InlayAdImpressionEvent{id=");
        sb.append(this.b);
        sb.append(", timestamp=");
        sb.append(this.c);
        sb.append(", ad=");
        sb.append(this.d);
        sb.append(", contextPosition=");
        sb.append(this.e);
        sb.append(", impressionUrls=");
        sb.append(this.f);
        sb.append("}");
        return sb.toString();
    }
}
