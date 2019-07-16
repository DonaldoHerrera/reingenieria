package com.soundcloud.android.likes;

/* compiled from: TrackLikesUniflowPresenter.kt */
public final class U {
    private final boolean a;

    public U() {
        this(false, 1, null);
    }

    public U(boolean z) {
        this.a = z;
    }

    public final boolean a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof U) {
                if (this.a == ((U) obj).a) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        boolean z = this.a;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("TrackLikesParams(autoplay=");
        sb.append(this.a);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ U(boolean z, int i, C7264rYa rya) {
        if ((i & 1) != 0) {
            z = false;
        }
        this(z);
    }
}
