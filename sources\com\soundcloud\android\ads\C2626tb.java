package com.soundcloud.android.ads;

import com.soundcloud.android.foundation.ads.aa;

/* renamed from: com.soundcloud.android.ads.tb reason: case insensitive filesystem */
/* compiled from: AutoValue_InlayAdHelper_VideoOnScreen */
final class C2626tb extends b {
    private final int a;
    private final float b;
    private final aa c;

    C2626tb(int i, float f, aa aaVar) {
        this.a = i;
        this.b = f;
        if (aaVar != null) {
            this.c = aaVar;
            return;
        }
        throw new NullPointerException("Null adData");
    }

    /* access modifiers changed from: 0000 */
    public aa a() {
        return this.c;
    }

    /* access modifiers changed from: 0000 */
    public int b() {
        return this.a;
    }

    /* access modifiers changed from: 0000 */
    public float c() {
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
        if (!(this.a == bVar.b() && Float.floatToIntBits(this.b) == Float.floatToIntBits(bVar.c()) && this.c.equals(bVar.a()))) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return ((((this.a ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.b)) * 1000003) ^ this.c.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("VideoOnScreen{position=");
        sb.append(this.a);
        sb.append(", viewablePercentage=");
        sb.append(this.b);
        sb.append(", adData=");
        sb.append(this.c);
        sb.append("}");
        return sb.toString();
    }
}
