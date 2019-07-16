package com.soundcloud.android.stations;

import java.util.List;

/* renamed from: com.soundcloud.android.stations.w reason: case insensitive filesystem */
/* compiled from: AutoValue_StationInfoHeader */
final class C6055w extends Wa {
    private final C3508cda b;
    private final String c;
    private final String d;
    private final List<String> e;
    private final C4928GKa<String> f;
    private final boolean g;

    C6055w(C3508cda cda, String str, String str2, List<String> list, C4928GKa<String> gKa, boolean z) {
        if (cda != null) {
            this.b = cda;
            if (str != null) {
                this.c = str;
                if (str2 != null) {
                    this.d = str2;
                    if (list != null) {
                        this.e = list;
                        if (gKa != null) {
                            this.f = gKa;
                            this.g = z;
                            return;
                        }
                        throw new NullPointerException("Null imageUrlTemplate");
                    }
                    throw new NullPointerException("Null mostPlayedArtists");
                }
                throw new NullPointerException("Null title");
            }
            throw new NullPointerException("Null type");
        }
        throw new NullPointerException("Null urn");
    }

    public C3508cda a() {
        return this.b;
    }

    public C4928GKa<String> b() {
        return this.f;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Wa)) {
            return false;
        }
        Wa wa = (Wa) obj;
        if (!this.b.equals(wa.a()) || !this.c.equals(wa.getType()) || !this.d.equals(wa.getTitle()) || !this.e.equals(wa.g()) || !this.f.equals(wa.b()) || this.g != wa.h()) {
            z = false;
        }
        return z;
    }

    public List<String> g() {
        return this.e;
    }

    public String getTitle() {
        return this.d;
    }

    public String getType() {
        return this.c;
    }

    public boolean h() {
        return this.g;
    }

    public int hashCode() {
        return ((((((((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ (this.g ? 1231 : 1237);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("StationInfoHeader{urn=");
        sb.append(this.b);
        sb.append(", type=");
        sb.append(this.c);
        sb.append(", title=");
        sb.append(this.d);
        sb.append(", mostPlayedArtists=");
        sb.append(this.e);
        sb.append(", imageUrlTemplate=");
        sb.append(this.f);
        sb.append(", liked=");
        sb.append(this.g);
        sb.append("}");
        return sb.toString();
    }
}
