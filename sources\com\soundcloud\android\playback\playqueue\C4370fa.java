package com.soundcloud.android.playback.playqueue;

/* renamed from: com.soundcloud.android.playback.playqueue.fa reason: case insensitive filesystem */
/* compiled from: AutoValue_PlayQueueUIEvent */
final class C4370fa extends Ua {
    private final int a;

    C4370fa(int i) {
        this.a = i;
    }

    public int c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Ua)) {
            return false;
        }
        if (this.a != ((Ua) obj).c()) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return this.a ^ 1000003;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PlayQueueUIEvent{kind=");
        sb.append(this.a);
        sb.append("}");
        return sb.toString();
    }
}
