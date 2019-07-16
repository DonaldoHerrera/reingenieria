package defpackage;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.common.base.Ascii;
import com.soundcloud.flippernative.AndroidPlatformDecoder;
import java.nio.ByteBuffer;

/* renamed from: jm reason: default package and case insensitive filesystem */
/* compiled from: Ac4Util */
public final class C1423jm {
    private static final int[] a = {2002, 2000, 1920, 1601, 1600, 1001, 1000, 960, 800, 800, 480, 400, 400, 2048};

    /* renamed from: jm$a */
    /* compiled from: Ac4Util */
    public static final class a {
        public final int a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;

        private a(int i, int i2, int i3, int i4, int i5) {
            this.a = i;
            this.c = i2;
            this.b = i3;
            this.d = i4;
            this.e = i5;
        }
    }

    public static Format a(Pq pq, String str, String str2, DrmInitData drmInitData) {
        pq.f(1);
        return Format.a(str, "audio/ac4", null, -1, -1, 2, ((pq.t() & 32) >> 5) == 1 ? AndroidPlatformDecoder.AAC_SAMPLE_RATE : 44100, null, drmInitData, 0, str2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0086, code lost:
        if (r10 != 11) goto L_0x0093;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x008b, code lost:
        if (r10 != 11) goto L_0x0093;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0090, code lost:
        if (r10 != 8) goto L_0x0093;
     */
    public static a a(Oq oq) {
        int i;
        int i2;
        int a2 = oq.a(16);
        int a3 = oq.a(16);
        if (a3 == 65535) {
            a3 = oq.a(24);
            i = 7;
        } else {
            i = 4;
        }
        int i3 = a3 + i;
        if (a2 == 44097) {
            i3 += 2;
        }
        int i4 = i3;
        int a4 = oq.a(2);
        if (a4 == 3) {
            a4 += a(oq, 2);
        }
        int i5 = a4;
        int a5 = oq.a(10);
        if (oq.e() && oq.a(3) > 0) {
            oq.c(2);
        }
        int i6 = oq.e() ? AndroidPlatformDecoder.AAC_SAMPLE_RATE : 44100;
        int a6 = oq.a(4);
        if (i6 == 44100 && a6 == 13) {
            i2 = a[a6];
        } else {
            if (i6 == 48000) {
                int[] iArr = a;
                if (a6 < iArr.length) {
                    int i7 = iArr[a6];
                    int i8 = a5 % 5;
                    if (i8 != 1) {
                        if (i8 == 2) {
                            if (a6 != 8) {
                            }
                            i7++;
                            i2 = i7;
                        } else if (i8 != 3) {
                            if (i8 == 4) {
                                if (a6 != 3) {
                                    if (a6 != 8) {
                                    }
                                }
                                i7++;
                            }
                            i2 = i7;
                        }
                    }
                    if (a6 != 3) {
                    }
                    i7++;
                    i2 = i7;
                }
            }
            i2 = 0;
        }
        a aVar = new a(i5, 2, i6, i4, i2);
        return aVar;
    }

    public static int a(byte[] bArr, int i) {
        int i2 = 7;
        if (bArr.length < 7) {
            return -1;
        }
        byte b = ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        if (b == 65535) {
            b = ((bArr[4] & 255) << Ascii.DLE) | ((bArr[5] & 255) << 8) | (bArr[6] & 255);
        } else {
            i2 = 4;
        }
        if (i == 44097) {
            i2 += 2;
        }
        return b + i2;
    }

    public static int a(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[16];
        int position = byteBuffer.position();
        byteBuffer.get(bArr);
        byteBuffer.position(position);
        return a(new Oq(bArr)).e;
    }

    public static void a(int i, Pq pq) {
        pq.c(7);
        byte[] bArr = pq.a;
        bArr[0] = -84;
        bArr[1] = 64;
        bArr[2] = -1;
        bArr[3] = -1;
        bArr[4] = (byte) ((i >> 16) & 255);
        bArr[5] = (byte) ((i >> 8) & 255);
        bArr[6] = (byte) (i & 255);
    }

    private static int a(Oq oq, int i) {
        int i2 = 0;
        while (true) {
            int a2 = i2 + oq.a(i);
            if (!oq.e()) {
                return a2;
            }
            i2 = (a2 + 1) << i;
        }
    }
}
