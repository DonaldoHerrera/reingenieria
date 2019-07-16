package defpackage;

/* renamed from: Fo reason: default package */
/* compiled from: TsUtil */
public final class Fo {
    public static int a(byte[] bArr, int i, int i2) {
        while (i < i2 && bArr[i] != 71) {
            i++;
        }
        return i;
    }

    public static long a(Pq pq, int i, int i2) {
        pq.e(i);
        if (pq.a() < 5) {
            return -9223372036854775807L;
        }
        int h = pq.h();
        if ((8388608 & h) != 0 || ((2096896 & h) >> 8) != i2) {
            return -9223372036854775807L;
        }
        boolean z = true;
        if (((h & 32) != 0) && pq.t() >= 7 && pq.a() >= 7) {
            if ((pq.t() & 16) != 16) {
                z = false;
            }
            if (z) {
                byte[] bArr = new byte[6];
                pq.a(bArr, 0, bArr.length);
                return a(bArr);
            }
        }
        return -9223372036854775807L;
    }

    private static long a(byte[] bArr) {
        return ((((long) bArr[0]) & 255) << 25) | ((((long) bArr[1]) & 255) << 17) | ((((long) bArr[2]) & 255) << 9) | ((((long) bArr[3]) & 255) << 1) | ((255 & ((long) bArr[4])) >> 7);
    }
}
