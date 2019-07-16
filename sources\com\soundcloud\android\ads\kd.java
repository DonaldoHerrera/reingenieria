package com.soundcloud.android.ads;

import com.soundcloud.android.foundation.ads.C3676c;

/* compiled from: AdOverlayImpressionState.kt */
public final class kd {
    private final boolean a;
    private final C3676c b;
    private final boolean c;
    private final boolean d;
    private final boolean e;

    public kd(boolean z, C3676c cVar, boolean z2, boolean z3, boolean z4) {
        this.a = z;
        this.b = cVar;
        this.c = z2;
        this.d = z3;
        this.e = z4;
    }

    public final C3676c a() {
        return this.b;
    }

    public final boolean b() {
        return this.c;
    }

    public final boolean c() {
        return this.a;
    }

    public final boolean d() {
        return this.e;
    }

    public final boolean e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof kd) {
                kd kdVar = (kd) obj;
                if ((this.a == kdVar.a) && C7471uYa.a((Object) this.b, (Object) kdVar.b)) {
                    if (this.c == kdVar.c) {
                        if (this.d == kdVar.d) {
                            if (this.e == kdVar.e) {
                                return true;
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        boolean z = this.a;
        int i = 1;
        if (z) {
            z = true;
        }
        int i2 = (z ? 1 : 0) * true;
        C3676c cVar = this.b;
        int hashCode = (i2 + (cVar != null ? cVar.hashCode() : 0)) * 31;
        boolean z2 = this.c;
        if (z2) {
            z2 = true;
        }
        int i3 = (hashCode + (z2 ? 1 : 0)) * 31;
        boolean z3 = this.d;
        if (z3) {
            z3 = true;
        }
        int i4 = (i3 + (z3 ? 1 : 0)) * 31;
        boolean z4 = this.e;
        if (!z4) {
            i = z4;
        }
        return i4 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("VisualAdImpressionState(isAudioAd=");
        sb.append(this.a);
        sb.append(", adData=");
        sb.append(this.b);
        sb.append(", isAppInForeground=");
        sb.append(this.c);
        sb.append(", isPlayerExpanding=");
        sb.append(this.d);
        sb.append(", isCommentsOpen=");
        sb.append(this.e);
        sb.append(")");
        return sb.toString();
    }
}
