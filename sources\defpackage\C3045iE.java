package defpackage;

import com.google.android.gms.common.api.Api.BaseClientBuilder;
import com.google.common.base.Preconditions;
import java.math.RoundingMode;

/* renamed from: iE reason: default package and case insensitive filesystem */
/* compiled from: IntMath */
public final class C3045iE {
    static final byte[] a = {9, 9, 9, 8, 8, 8, 7, 7, 7, 6, 6, 6, 6, 5, 5, 5, 4, 4, 4, 3, 3, 3, 3, 2, 2, 2, 1, 1, 1, 0, 0, 0, 0};
    static final int[] b = {1, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000};
    static final int[] c = {3, 31, 316, 3162, 31622, 316227, 3162277, 31622776, 316227766, BaseClientBuilder.API_PRIORITY_OTHER};
    private static final int[] d = {1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880, 3628800, 39916800, 479001600};
    static int[] e = {BaseClientBuilder.API_PRIORITY_OTHER, BaseClientBuilder.API_PRIORITY_OTHER, 65536, 2345, 477, 193, 110, 75, 58, 49, 43, 39, 37, 35, 34, 34, 33};

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0044, code lost:
        if (((r7 == java.math.RoundingMode.HALF_EVEN) & ((r0 & 1) != 0)) != false) goto L_0x0058;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0047, code lost:
        if (r1 > 0) goto L_0x0058;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x004a, code lost:
        if (r5 > 0) goto L_0x0058;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x004d, code lost:
        if (r5 < 0) goto L_0x0058;
     */
    public static int a(int i, int i2, RoundingMode roundingMode) {
        Preconditions.checkNotNull(roundingMode);
        if (i2 != 0) {
            int i3 = i / i2;
            int i4 = i - (i2 * i3);
            if (i4 == 0) {
                return i3;
            }
            boolean z = true;
            int i5 = ((i ^ i2) >> 31) | 1;
            switch (C3026hE.a[roundingMode.ordinal()]) {
                case 1:
                    if (i4 != 0) {
                        z = false;
                    }
                    C3064jE.a(z);
                case 3:
                    break;
                case 5:
                    break;
                case 2:
                    z = false;
                    break;
                case 4:
                    break;
                case 6:
                case 7:
                case 8:
                    int abs = Math.abs(i4);
                    int abs2 = abs - (Math.abs(i2) - abs);
                    if (abs2 == 0) {
                        if (roundingMode != RoundingMode.HALF_UP) {
                            break;
                        }
                    }
                    break;
                default:
                    throw new AssertionError();
            }
            z = false;
            if (z) {
                i3 += i5;
            }
            return i3;
        }
        throw new ArithmeticException("/ by zero");
    }
}
