package defpackage;

import com.comscore.android.ConnectivityType;
import com.soundcloud.flippernative.AndroidPlatformDecoder;

/* renamed from: fn reason: default package and case insensitive filesystem */
/* compiled from: MpegAudioHeader */
public final class C1301fn {
    private static final String[] a = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};
    private static final int[] b = {44100, AndroidPlatformDecoder.AAC_SAMPLE_RATE, 32000};
    private static final int[] c = {32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};
    private static final int[] d = {32000, AndroidPlatformDecoder.AAC_SAMPLE_RATE, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};
    private static final int[] e = {32000, AndroidPlatformDecoder.AAC_SAMPLE_RATE, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};
    private static final int[] f = {32000, ConnectivityType.UNKNOWN, AndroidPlatformDecoder.AAC_SAMPLE_RATE, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};
    private static final int[] g = {8000, 16000, 24000, 32000, ConnectivityType.UNKNOWN, AndroidPlatformDecoder.AAC_SAMPLE_RATE, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};
    public int h;
    public String i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;

    public static int a(int i2) {
        if ((i2 & -2097152) != -2097152) {
            return -1;
        }
        int i3 = (i2 >>> 19) & 3;
        if (i3 == 1) {
            return -1;
        }
        int i4 = (i2 >>> 17) & 3;
        if (i4 == 0) {
            return -1;
        }
        int i5 = (i2 >>> 12) & 15;
        if (i5 == 0 || i5 == 15) {
            return -1;
        }
        int i6 = (i2 >>> 10) & 3;
        if (i6 == 3) {
            return -1;
        }
        int i7 = b[i6];
        if (i3 == 2) {
            i7 /= 2;
        } else if (i3 == 0) {
            i7 /= 4;
        }
        int i8 = (i2 >>> 9) & 1;
        if (i4 == 3) {
            return ((((i3 == 3 ? c[i5 - 1] : d[i5 - 1]) * 12) / i7) + i8) * 4;
        }
        int i9 = i3 == 3 ? i4 == 2 ? e[i5 - 1] : f[i5 - 1] : g[i5 - 1];
        int i10 = 144;
        if (i3 == 3) {
            return ((i9 * 144) / i7) + i8;
        }
        if (i4 == 1) {
            i10 = 72;
        }
        return ((i10 * i9) / i7) + i8;
    }

    public static boolean a(int i2, C1301fn fnVar) {
        int i3;
        int i4;
        if ((i2 & -2097152) != -2097152) {
            return false;
        }
        int i5 = (i2 >>> 19) & 3;
        if (i5 == 1) {
            return false;
        }
        int i6 = (i2 >>> 17) & 3;
        if (i6 == 0) {
            return false;
        }
        int i7 = (i2 >>> 12) & 15;
        if (i7 == 0 || i7 == 15) {
            return false;
        }
        int i8 = (i2 >>> 10) & 3;
        if (i8 == 3) {
            return false;
        }
        int i9 = b[i8];
        if (i5 == 2) {
            i9 /= 2;
        } else if (i5 == 0) {
            i9 /= 4;
        }
        int i10 = i9;
        int i11 = (i2 >>> 9) & 1;
        int i12 = 1152;
        if (i6 == 3) {
            i4 = ((((i5 == 3 ? c[i7 - 1] : d[i7 - 1]) * 12) / i10) + i11) * 4;
            i3 = 384;
        } else {
            int i13 = 144;
            if (i5 == 3) {
                i4 = (((i6 == 2 ? e[i7 - 1] : f[i7 - 1]) * 144) / i10) + i11;
                i3 = 1152;
            } else {
                int i14 = g[i7 - 1];
                if (i6 == 1) {
                    i12 = 576;
                }
                if (i6 == 1) {
                    i13 = 72;
                }
                i4 = ((i13 * i14) / i10) + i11;
                i3 = i12;
            }
        }
        fnVar.a(i5, a[3 - i6], i4, i10, ((i2 >> 6) & 3) == 3 ? 1 : 2, ((i4 * 8) * i10) / i3, i3);
        return true;
    }

    private void a(int i2, String str, int i3, int i4, int i5, int i6, int i7) {
        this.h = i2;
        this.i = str;
        this.j = i3;
        this.k = i4;
        this.l = i5;
        this.m = i6;
        this.n = i7;
    }
}
