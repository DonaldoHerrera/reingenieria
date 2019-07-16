package com.soundcloud.android.playback;

import com.soundcloud.android.playback.C4536zc.a;

/* compiled from: AutoValue_PlaybackResult */
final class H extends C4536zc {
    private final boolean a;
    private final a b;

    H(boolean z, a aVar) {
        this.a = z;
        if (aVar != null) {
            this.b = aVar;
            return;
        }
        throw new NullPointerException("Null errorReason");
    }

    public a a() {
        return this.b;
    }

    public boolean b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4536zc)) {
            return false;
        }
        C4536zc zcVar = (C4536zc) obj;
        if (this.a != zcVar.b() || !this.b.equals(zcVar.a())) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return (((this.a ? 1231 : 1237) ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PlaybackResult{success=");
        sb.append(this.a);
        sb.append(", errorReason=");
        sb.append(this.b);
        sb.append("}");
        return sb.toString();
    }
}
