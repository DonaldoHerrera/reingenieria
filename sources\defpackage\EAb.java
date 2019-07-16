package defpackage;

import android.support.v4.media.session.PlaybackStateCompat;

/* renamed from: EAb reason: default package */
/* compiled from: SegmentPool */
final class EAb {
    static DAb a;
    static long b;

    private EAb() {
    }

    static DAb a() {
        synchronized (EAb.class) {
            if (a == null) {
                return new DAb();
            }
            DAb dAb = a;
            a = dAb.f;
            dAb.f = null;
            b -= PlaybackStateCompat.ACTION_PLAY_FROM_URI;
            return dAb;
        }
    }

    static void a(DAb dAb) {
        if (dAb.f != null || dAb.g != null) {
            throw new IllegalArgumentException();
        } else if (!dAb.d) {
            synchronized (EAb.class) {
                if (b + PlaybackStateCompat.ACTION_PLAY_FROM_URI <= PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH) {
                    b += PlaybackStateCompat.ACTION_PLAY_FROM_URI;
                    dAb.f = a;
                    dAb.c = 0;
                    dAb.b = 0;
                    a = dAb;
                }
            }
        }
    }
}
