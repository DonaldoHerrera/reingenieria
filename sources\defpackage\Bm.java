package defpackage;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.common.base.Ascii;
import com.soundcloud.flippernative.AndroidPlatformDecoder;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* renamed from: Bm reason: default package */
/* compiled from: DtsUtil */
public final class Bm {
    private static final int[] a = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};
    private static final int[] b = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, AndroidPlatformDecoder.AAC_SAMPLE_RATE, -1, -1};
    private static final int[] c = {64, 112, 128, 192, 224, 256, 384, 448, 512, 640, 768, 896, 1024, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};

    public static Format a(byte[] bArr, String str, String str2, DrmInitData drmInitData) {
        Oq c2 = c(bArr);
        c2.c(60);
        int i = a[c2.a(6)];
        int i2 = b[c2.a(4)];
        int a2 = c2.a(5);
        int[] iArr = c;
        int i3 = a2 >= iArr.length ? -1 : (iArr[a2] * 1000) / 2;
        c2.c(10);
        return Format.a(str, "audio/vnd.dts", null, i3, -1, i + (c2.a(2) > 0 ? 1 : 0), i2, null, drmInitData, 0, str2);
    }

    public static boolean a(int i) {
        return i == 2147385345 || i == -25230976 || i == 536864768 || i == -14745368;
    }

    public static int b(byte[] bArr) {
        int i;
        byte b2;
        byte b3;
        int i2;
        byte b4;
        byte b5 = bArr[0];
        if (b5 != -2) {
            if (b5 == -1) {
                i2 = (bArr[4] & 7) << 4;
                b4 = bArr[7];
            } else if (b5 != 31) {
                i = (bArr[4] & 1) << 6;
                b2 = bArr[5];
            } else {
                i2 = (bArr[5] & 7) << 4;
                b4 = bArr[6];
            }
            b3 = b4 & 60;
            return (((b3 >> 2) | i2) + 1) * 32;
        }
        i = (bArr[5] & 1) << 6;
        b2 = bArr[4];
        b3 = b2 & 252;
        return (((b3 >> 2) | i2) + 1) * 32;
    }

    private static Oq c(byte[] bArr) {
        if (bArr[0] == Byte.MAX_VALUE) {
            return new Oq(bArr);
        }
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        if (d(copyOf)) {
            for (int i = 0; i < copyOf.length - 1; i += 2) {
                byte b2 = copyOf[i];
                int i2 = i + 1;
                copyOf[i] = copyOf[i2];
                copyOf[i2] = b2;
            }
        }
        Oq oq = new Oq(copyOf);
        if (copyOf[0] == 31) {
            Oq oq2 = new Oq(copyOf);
            while (oq2.a() >= 16) {
                oq2.c(2);
                oq.a(oq2.a(14), 14);
            }
        }
        oq.a(copyOf);
        return oq;
    }

    private static boolean d(byte[] bArr) {
        return bArr[0] == -2 || bArr[0] == -1;
    }

    public static int a(ByteBuffer byteBuffer) {
        int i;
        byte b2;
        byte b3;
        int i2;
        byte b4;
        int position = byteBuffer.position();
        byte b5 = byteBuffer.get(position);
        if (b5 != -2) {
            if (b5 == -1) {
                i2 = (byteBuffer.get(position + 4) & 7) << 4;
                b4 = byteBuffer.get(position + 7);
            } else if (b5 != 31) {
                i = (byteBuffer.get(position + 4) & 1) << 6;
                b2 = byteBuffer.get(position + 5);
            } else {
                i2 = (byteBuffer.get(position + 5) & 7) << 4;
                b4 = byteBuffer.get(position + 6);
            }
            b3 = b4 & 60;
            return (((b3 >> 2) | i2) + 1) * 32;
        }
        i = (byteBuffer.get(position + 5) & 1) << 6;
        b2 = byteBuffer.get(position + 4);
        b3 = b2 & 252;
        return (((b3 >> 2) | i2) + 1) * 32;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    public static int a(byte[] bArr) {
        int i;
        int i2;
        byte b2;
        byte b3;
        int i3;
        boolean z = false;
        byte b4 = bArr[0];
        if (b4 != -2) {
            if (b4 == -1) {
                i3 = ((bArr[7] & 3) << Ascii.FF) | ((bArr[6] & 255) << 4);
                b3 = bArr[9];
            } else if (b4 != 31) {
                i2 = ((bArr[5] & 3) << Ascii.FF) | ((bArr[6] & 255) << 4);
                b2 = bArr[7];
            } else {
                i3 = ((bArr[6] & 3) << Ascii.FF) | ((bArr[7] & 255) << 4);
                b3 = bArr[8];
            }
            i = (((b3 & 60) >> 2) | i3) + 1;
            z = true;
            return !z ? (i * 16) / 14 : i;
        }
        i2 = ((bArr[4] & 3) << Ascii.FF) | ((bArr[7] & 255) << 4);
        b2 = bArr[6];
        i = (((b2 & 240) >> 4) | i2) + 1;
        if (!z) {
        }
    }
}
