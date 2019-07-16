package com.soundcloud.android.offline;

/* renamed from: com.soundcloud.android.offline.ob reason: case insensitive filesystem */
/* compiled from: AutoValue_DownloadRequest */
final class C4139ob extends C4146pc {
    private final C3508cda b;
    private final C4928GKa<String> c;
    private final long d;
    private final String e;
    private final boolean f;
    private final boolean g;
    private final long h;
    private final Ue i;

    C4139ob(C3508cda cda, C4928GKa<String> gKa, long j, String str, boolean z, boolean z2, long j2, Ue ue) {
        if (cda != null) {
            this.b = cda;
            if (gKa != null) {
                this.c = gKa;
                this.d = j;
                if (str != null) {
                    this.e = str;
                    this.f = z;
                    this.g = z2;
                    this.h = j2;
                    if (ue != null) {
                        this.i = ue;
                        return;
                    }
                    throw new NullPointerException("Null trackingData");
                }
                throw new NullPointerException("Null waveformUrl");
            }
            throw new NullPointerException("Null imageUrlTemplate");
        }
        throw new NullPointerException("Null urn");
    }

    public C3508cda a() {
        return this.b;
    }

    public C4928GKa<String> b() {
        return this.c;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4146pc)) {
            return false;
        }
        C4146pc pcVar = (C4146pc) obj;
        if (!this.b.equals(pcVar.a()) || !this.c.equals(pcVar.b()) || this.d != pcVar.f() || !this.e.equals(pcVar.i()) || this.f != pcVar.k() || this.g != pcVar.j() || this.h != pcVar.g() || !this.i.equals(pcVar.h())) {
            z = false;
        }
        return z;
    }

    public long f() {
        return this.d;
    }

    public long g() {
        return this.h;
    }

    public Ue h() {
        return this.i;
    }

    public int hashCode() {
        int hashCode = (((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003;
        long j = this.d;
        int i2 = 1231;
        int hashCode2 = (((((hashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.e.hashCode()) * 1000003) ^ (this.f ? 1231 : 1237)) * 1000003;
        if (!this.g) {
            i2 = 1237;
        }
        int i3 = (hashCode2 ^ i2) * 1000003;
        long j2 = this.h;
        return ((i3 ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ this.i.hashCode();
    }

    public String i() {
        return this.e;
    }

    public boolean j() {
        return this.g;
    }

    public boolean k() {
        return this.f;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DownloadRequest{urn=");
        sb.append(this.b);
        sb.append(", imageUrlTemplate=");
        sb.append(this.c);
        sb.append(", duration=");
        sb.append(this.d);
        sb.append(", waveformUrl=");
        sb.append(this.e);
        sb.append(", syncable=");
        sb.append(this.f);
        sb.append(", snipped=");
        sb.append(this.g);
        sb.append(", estimatedFileSizeInBytes=");
        sb.append(this.h);
        sb.append(", trackingData=");
        sb.append(this.i);
        sb.append("}");
        return sb.toString();
    }
}
