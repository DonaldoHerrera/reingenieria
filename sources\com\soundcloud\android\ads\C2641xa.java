package com.soundcloud.android.ads;

import com.soundcloud.android.foundation.ads.ca;
import com.soundcloud.android.foundation.events.I;

/* renamed from: com.soundcloud.android.ads.xa reason: case insensitive filesystem */
/* compiled from: AdOverlayImpressionState.kt */
public final class C2641xa {
    private final boolean a;
    private final boolean b;
    private final boolean c;
    private final C3508cda d;
    private final ca e;
    private final I f;
    private final boolean g;

    public C2641xa(boolean z, boolean z2, boolean z3, C3508cda cda, ca caVar, I i, boolean z4) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = cda;
        this.e = caVar;
        this.f = i;
        this.g = z4;
    }

    public final ca a() {
        return this.e;
    }

    public final C3508cda b() {
        return this.d;
    }

    public final I c() {
        return this.f;
    }

    public final boolean d() {
        return this.a;
    }

    public final boolean e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C2641xa) {
                C2641xa xaVar = (C2641xa) obj;
                if (this.a == xaVar.a) {
                    if (this.b == xaVar.b) {
                        if ((this.c == xaVar.c) && C7471uYa.a((Object) this.d, (Object) xaVar.d) && C7471uYa.a((Object) this.e, (Object) xaVar.e) && C7471uYa.a((Object) this.f, (Object) xaVar.f)) {
                            if (this.g == xaVar.g) {
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

    public final boolean f() {
        return this.g;
    }

    public final boolean g() {
        return this.c;
    }

    public int hashCode() {
        boolean z = this.a;
        int i = 1;
        if (z) {
            z = true;
        }
        int i2 = (z ? 1 : 0) * true;
        boolean z2 = this.b;
        if (z2) {
            z2 = true;
        }
        int i3 = (i2 + (z2 ? 1 : 0)) * 31;
        boolean z3 = this.c;
        if (z3) {
            z3 = true;
        }
        int i4 = (i3 + (z3 ? 1 : 0)) * 31;
        C3508cda cda = this.d;
        int i5 = 0;
        int hashCode = (i4 + (cda != null ? cda.hashCode() : 0)) * 31;
        ca caVar = this.e;
        int hashCode2 = (hashCode + (caVar != null ? caVar.hashCode() : 0)) * 31;
        I i6 = this.f;
        if (i6 != null) {
            i5 = i6.hashCode();
        }
        int i7 = (hashCode2 + i5) * 31;
        boolean z4 = this.g;
        if (!z4) {
            i = z4;
        }
        return i7 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AdOverlayImpressionState(isAdOverlayVisible=");
        sb.append(this.a);
        sb.append(", isAppInForeground=");
        sb.append(this.b);
        sb.append(", isPlayerExpanding=");
        sb.append(this.c);
        sb.append(", currentPlayingUrn=");
        sb.append(this.d);
        sb.append(", adData=");
        sb.append(this.e);
        sb.append(", trackSourceInfo=");
        sb.append(this.f);
        sb.append(", isCommentsOpen=");
        sb.append(this.g);
        sb.append(")");
        return sb.toString();
    }
}
