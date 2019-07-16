package defpackage;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.Random;

/* renamed from: sh reason: default package and case insensitive filesystem */
/* compiled from: RandomBackoff */
class C1693sh implements C6570hOa {
    final C6570hOa a;
    final Random b;
    final double c;

    public C1693sh(C6570hOa hoa, double d) {
        this(hoa, d, new Random());
    }

    public long a(int i) {
        return (long) (a() * ((double) this.a.a(i)));
    }

    public C1693sh(C6570hOa hoa, double d, Random random) {
        if (d < FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE || d > 1.0d) {
            throw new IllegalArgumentException("jitterPercent must be between 0.0 and 1.0");
        } else if (hoa == null) {
            throw new NullPointerException("backoff must not be null");
        } else if (random != null) {
            this.a = hoa;
            this.c = d;
            this.b = random;
        } else {
            throw new NullPointerException("random must not be null");
        }
    }

    /* access modifiers changed from: 0000 */
    public double a() {
        double d = this.c;
        double d2 = 1.0d - d;
        return d2 + (((d + 1.0d) - d2) * this.b.nextDouble());
    }
}
