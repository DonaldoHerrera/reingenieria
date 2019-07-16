package defpackage;

import android.util.Pair;
import com.google.android.exoplayer2.H;
import com.soundcloud.flippernative.AndroidPlatformDecoder;

/* renamed from: zq reason: default package and case insensitive filesystem */
/* compiled from: CodecSpecificDataUtil */
public final class C1912zq {
    private static final byte[] a = {0, 0, 0, 1};
    private static final int[] b = {96000, 88200, 64000, AndroidPlatformDecoder.AAC_SAMPLE_RATE, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};
    private static final int[] c = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    public static Pair<Integer, Integer> a(byte[] bArr) throws H {
        return a(new Oq(bArr), false);
    }

    public static String b(int i, int i2, int i3) {
        return String.format("avc1.%02X%02X%02X", new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)});
    }

    public static Pair<Integer, Integer> a(Oq oq, boolean z) throws H {
        int a2 = a(oq);
        int b2 = b(oq);
        int a3 = oq.a(4);
        if (a2 == 5 || a2 == 29) {
            b2 = b(oq);
            a2 = a(oq);
            if (a2 == 22) {
                a3 = oq.a(4);
            }
        }
        boolean z2 = true;
        if (z) {
            if (!(a2 == 1 || a2 == 2 || a2 == 3 || a2 == 4 || a2 == 6 || a2 == 7 || a2 == 17)) {
                switch (a2) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        break;
                    default:
                        StringBuilder sb = new StringBuilder();
                        sb.append("Unsupported audio object type: ");
                        sb.append(a2);
                        throw new H(sb.toString());
                }
            }
            a(oq, a2, a3);
            switch (a2) {
                case 17:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    int a4 = oq.a(2);
                    if (a4 == 2 || a4 == 3) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Unsupported epConfig: ");
                        sb2.append(a4);
                        throw new H(sb2.toString());
                    }
            }
        }
        int i = c[a3];
        if (i == -1) {
            z2 = false;
        }
        C1852xq.a(z2);
        return Pair.create(Integer.valueOf(b2), Integer.valueOf(i));
    }

    private static int b(Oq oq) {
        int a2 = oq.a(4);
        if (a2 == 15) {
            return oq.a(24);
        }
        C1852xq.a(a2 < 13);
        return b[a2];
    }

    public static byte[] a(int i, int i2, int i3) {
        return new byte[]{(byte) (((i << 3) & 248) | ((i2 >> 1) & 7)), (byte) (((i2 << 7) & 128) | ((i3 << 3) & 120))};
    }

    public static byte[] a(byte[] bArr, int i, int i2) {
        byte[] bArr2 = a;
        byte[] bArr3 = new byte[(bArr2.length + i2)];
        System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
        System.arraycopy(bArr, i, bArr3, a.length, i2);
        return bArr3;
    }

    private static int a(Oq oq) {
        int a2 = oq.a(5);
        return a2 == 31 ? oq.a(6) + 32 : a2;
    }

    private static void a(Oq oq, int i, int i2) {
        oq.c(1);
        if (oq.e()) {
            oq.c(14);
        }
        boolean e = oq.e();
        if (i2 != 0) {
            if (i == 6 || i == 20) {
                oq.c(3);
            }
            if (e) {
                if (i == 22) {
                    oq.c(16);
                }
                if (i == 17 || i == 19 || i == 20 || i == 23) {
                    oq.c(3);
                }
                oq.c(1);
                return;
            }
            return;
        }
        throw new UnsupportedOperationException();
    }
}
