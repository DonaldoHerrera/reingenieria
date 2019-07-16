package com.soundcloud.android.features.library.likes;

/* compiled from: TrackLikesPresenter.kt */
public final class y {
    private final boolean a;

    private /* synthetic */ y(boolean z) {
        this.a = z;
    }

    public static final /* synthetic */ y a(boolean z) {
        return new y(z);
    }

    public static boolean a(boolean z, Object obj) {
        if (obj instanceof y) {
            if (z == ((y) obj).a()) {
                return true;
            }
        }
        return false;
    }

    public static boolean b(boolean z) {
        return z;
    }

    public static int c(boolean z) {
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public static String d(boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("TrackLikesParams(autoplay=");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }

    public final /* synthetic */ boolean a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        return a(this.a, obj);
    }

    public int hashCode() {
        return c(this.a);
    }

    public String toString() {
        return d(this.a);
    }
}
