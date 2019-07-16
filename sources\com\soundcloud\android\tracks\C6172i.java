package com.soundcloud.android.tracks;

/* renamed from: com.soundcloud.android.tracks.i reason: case insensitive filesystem */
/* compiled from: AutoValue_TrackArtwork */
final class C6172i extends C6161ea {
    private final C3508cda a;
    private final C4928GKa<String> b;

    public C3508cda a() {
        return this.a;
    }

    public C4928GKa<String> b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6161ea)) {
            return false;
        }
        C6161ea eaVar = (C6161ea) obj;
        if (!this.a.equals(eaVar.a()) || !this.b.equals(eaVar.b())) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("TrackArtwork{urn=");
        sb.append(this.a);
        sb.append(", imageUrlTemplate=");
        sb.append(this.b);
        sb.append("}");
        return sb.toString();
    }
}
