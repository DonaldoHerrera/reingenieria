package defpackage;

import android.util.Pair;
import com.google.android.exoplayer2.C0615o;
import com.google.android.exoplayer2.metadata.id3.MlltFrame;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;

/* renamed from: En reason: default package */
/* compiled from: MlltSeeker */
final class En implements a {
    private final long[] a;
    private final long[] b;
    private final long c;

    private En(long[] jArr, long[] jArr2) {
        this.a = jArr;
        this.b = jArr2;
        this.c = C0615o.a(jArr2[jArr2.length - 1]);
    }

    public static En a(long j, MlltFrame mlltFrame) {
        int length = mlltFrame.e.length;
        int i = length + 1;
        long[] jArr = new long[i];
        long[] jArr2 = new long[i];
        jArr[0] = j;
        long j2 = 0;
        jArr2[0] = 0;
        for (int i2 = 1; i2 <= length; i2++) {
            int i3 = i2 - 1;
            j += (long) (mlltFrame.c + mlltFrame.e[i3]);
            j2 += (long) (mlltFrame.d + mlltFrame.f[i3]);
            jArr[i2] = j;
            jArr2[i2] = j2;
        }
        return new En(jArr, jArr2);
    }

    public long a() {
        return -1;
    }

    public long b(long j) {
        return C0615o.a(((Long) a(j, this.a, this.b).second).longValue());
    }

    public boolean b() {
        return true;
    }

    public long c() {
        return this.c;
    }

    public a a(long j) {
        Pair a2 = a(C0615o.b(C0471ar.b(j, 0, this.c)), this.b, this.a);
        return new a(new C1393in(C0615o.a(((Long) a2.first).longValue()), ((Long) a2.second).longValue()));
    }

    private static Pair<Long, Long> a(long j, long[] jArr, long[] jArr2) {
        int b2 = C0471ar.b(jArr, j, true, true);
        long j2 = jArr[b2];
        long j3 = jArr2[b2];
        int i = b2 + 1;
        if (i == jArr.length) {
            return Pair.create(Long.valueOf(j2), Long.valueOf(j3));
        }
        long j4 = jArr[i];
        return Pair.create(Long.valueOf(j), Long.valueOf(((long) ((j4 == j2 ? FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE : (((double) j) - ((double) j2)) / ((double) (j4 - j2))) * ((double) (jArr2[i] - j3)))) + j3));
    }
}
