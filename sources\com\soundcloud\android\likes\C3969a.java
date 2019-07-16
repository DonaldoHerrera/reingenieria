package com.soundcloud.android.likes;

import com.soundcloud.android.collections.data.C2862s;
import com.soundcloud.android.tracks.C6185ma;

/* renamed from: com.soundcloud.android.likes.a reason: case insensitive filesystem */
/* compiled from: AutoValue_LikeWithTrack */
final class C3969a extends C3987k {
    private final C2862s a;
    private final C6185ma b;

    C3969a(C2862s sVar, C6185ma maVar) {
        if (sVar != null) {
            this.a = sVar;
            if (maVar != null) {
                this.b = maVar;
                return;
            }
            throw new NullPointerException("Null trackItem");
        }
        throw new NullPointerException("Null like");
    }

    public C2862s a() {
        return this.a;
    }

    public C6185ma b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3987k)) {
            return false;
        }
        C3987k kVar = (C3987k) obj;
        if (!this.a.equals(kVar.a()) || !this.b.equals(kVar.b())) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("LikeWithTrack{like=");
        sb.append(this.a);
        sb.append(", trackItem=");
        sb.append(this.b);
        sb.append("}");
        return sb.toString();
    }
}
