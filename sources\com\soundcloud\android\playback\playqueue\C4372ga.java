package com.soundcloud.android.playback.playqueue;

import java.util.List;

/* renamed from: com.soundcloud.android.playback.playqueue.ga reason: case insensitive filesystem */
/* compiled from: AutoValue_PlayQueueUIItemsUpdate */
final class C4372ga extends Za {
    private final List<Va> a;
    private final int b;

    C4372ga(List<Va> list, int i) {
        if (list != null) {
            this.a = list;
            this.b = i;
            return;
        }
        throw new NullPointerException("Null items");
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Za)) {
            return false;
        }
        Za za = (Za) obj;
        if (!this.a.equals(za.f()) || this.b != za.g()) {
            z = false;
        }
        return z;
    }

    public List<Va> f() {
        return this.a;
    }

    public int g() {
        return this.b;
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PlayQueueUIItemsUpdate{items=");
        sb.append(this.a);
        sb.append(", kind=");
        sb.append(this.b);
        sb.append("}");
        return sb.toString();
    }
}
