package com.soundcloud.android.foundation.ads;

import java.util.Date;

/* renamed from: com.soundcloud.android.foundation.ads.y reason: case insensitive filesystem */
/* compiled from: AutoValue_AppInstallAd_State */
final class C3697y extends b {
    private final C4928GKa<Date> a;
    private final boolean b;

    C3697y(C4928GKa<Date> gKa, boolean z) {
        if (gKa != null) {
            this.a = gKa;
            this.b = z;
            return;
        }
        throw new NullPointerException("Null getImageLoadTime");
    }

    public C4928GKa<Date> a() {
        return this.a;
    }

    public boolean b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (!this.a.equals(bVar.a()) || this.b != bVar.b()) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ (this.b ? 1231 : 1237);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("State{getImageLoadTime=");
        sb.append(this.a);
        sb.append(", hasReportedImpression=");
        sb.append(this.b);
        sb.append("}");
        return sb.toString();
    }
}
