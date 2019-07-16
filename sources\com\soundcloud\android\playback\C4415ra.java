package com.soundcloud.android.playback;

/* renamed from: com.soundcloud.android.playback.ra reason: case insensitive filesystem */
/* compiled from: AudioPortTracker.kt */
public final class C4415ra {
    static final /* synthetic */ DZa[] a = {HYa.a((DYa) new EYa(HYa.a(C4415ra.class), "name", "getName()Ljava/lang/String;"))};
    private final C7744yVa b = BVa.a(new C4411qa(this));
    /* access modifiers changed from: private */
    public final int c;

    public C4415ra(int i) {
        this.c = i;
    }

    public final String a() {
        C7744yVa yva = this.b;
        DZa dZa = a[0];
        return (String) yva.getValue();
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C4415ra) {
                if (this.c == ((C4415ra) obj).c) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DeviceSink(audioDeviceType=");
        sb.append(this.c);
        sb.append(")");
        return sb.toString();
    }
}
