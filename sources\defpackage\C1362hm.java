package defpackage;

import com.comscore.streaming.ContentType;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.soundcloud.flippernative.AndroidPlatformDecoder;
import java.nio.ByteBuffer;

/* renamed from: hm reason: default package and case insensitive filesystem */
/* compiled from: Ac3Util */
public final class C1362hm {
    private static final int[] a = {1, 2, 3, 6};
    private static final int[] b = {AndroidPlatformDecoder.AAC_SAMPLE_RATE, 44100, 32000};
    private static final int[] c = {24000, 22050, 16000};
    private static final int[] d = {2, 1, 2, 3, 3, 4, 4, 5};
    private static final int[] e = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384, 448, 512, 576, 640};
    private static final int[] f = {69, 87, 104, ContentType.USER_GENERATED_SHORT_FORM_ON_DEMAND, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    /* renamed from: hm$a */
    /* compiled from: Ac3Util */
    public static final class a {
        public final String a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;
        public final int f;

        private a(String str, int i, int i2, int i3, int i4, int i5) {
            this.a = str;
            this.b = i;
            this.d = i2;
            this.c = i3;
            this.e = i4;
            this.f = i5;
        }
    }

    public static int a() {
        return 1536;
    }

    public static Format a(Pq pq, String str, String str2, DrmInitData drmInitData) {
        int i = b[(pq.t() & 192) >> 6];
        int t = pq.t();
        int i2 = d[(t & 56) >> 3];
        if ((t & 4) != 0) {
            i2++;
        }
        return Format.a(str, "audio/ac3", null, -1, -1, i2, i, null, drmInitData, 0, str2);
    }

    public static Format b(Pq pq, String str, String str2, DrmInitData drmInitData) {
        Pq pq2 = pq;
        pq.f(2);
        int i = b[(pq.t() & 192) >> 6];
        int t = pq.t();
        int i2 = d[(t & 14) >> 1];
        if ((t & 1) != 0) {
            i2++;
        }
        if (((pq.t() & 30) >> 1) > 0 && (2 & pq.t()) != 0) {
            i2 += 2;
        }
        return Format.a(str, (pq.a() <= 0 || (pq.t() & 1) == 0) ? "audio/eac3" : "audio/eac3-joc", null, -1, -1, i2, i, null, drmInitData, 0, str2);
    }

    public static a a(Oq oq) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        String str;
        int i6;
        int i7;
        int i8;
        int i9;
        Oq oq2 = oq;
        int d2 = oq.d();
        oq2.c(40);
        boolean z = oq2.a(5) == 16;
        oq2.b(d2);
        int i10 = -1;
        if (z) {
            oq2.c(16);
            int a2 = oq2.a(2);
            if (a2 == 0) {
                i10 = 0;
            } else if (a2 == 1) {
                i10 = 1;
            } else if (a2 == 2) {
                i10 = 2;
            }
            oq2.c(3);
            int a3 = (oq2.a(11) + 1) * 2;
            int a4 = oq2.a(2);
            if (a4 == 3) {
                i6 = c[oq2.a(2)];
                i8 = 3;
                i7 = 6;
            } else {
                i8 = oq2.a(2);
                i7 = a[i8];
                i6 = b[a4];
            }
            int i11 = i7 * 256;
            int a5 = oq2.a(3);
            boolean e2 = oq.e();
            int i12 = d[a5] + (e2 ? 1 : 0);
            oq2.c(10);
            if (oq.e()) {
                oq2.c(8);
            }
            if (a5 == 0) {
                oq2.c(5);
                if (oq.e()) {
                    oq2.c(8);
                }
            }
            if (i10 == 1 && oq.e()) {
                oq2.c(16);
            }
            if (oq.e()) {
                if (a5 > 2) {
                    oq2.c(2);
                }
                if ((a5 & 1) != 0 && a5 > 2) {
                    oq2.c(6);
                }
                if ((a5 & 4) != 0) {
                    oq2.c(6);
                }
                if (e2 && oq.e()) {
                    oq2.c(5);
                }
                if (i10 == 0) {
                    if (oq.e()) {
                        oq2.c(6);
                    }
                    if (a5 == 0 && oq.e()) {
                        oq2.c(6);
                    }
                    if (oq.e()) {
                        oq2.c(6);
                    }
                    int a6 = oq2.a(2);
                    if (a6 == 1) {
                        oq2.c(5);
                    } else if (a6 == 2) {
                        oq2.c(12);
                    } else if (a6 == 3) {
                        int a7 = oq2.a(5);
                        if (oq.e()) {
                            oq2.c(5);
                            if (oq.e()) {
                                oq2.c(4);
                            }
                            if (oq.e()) {
                                oq2.c(4);
                            }
                            if (oq.e()) {
                                oq2.c(4);
                            }
                            if (oq.e()) {
                                oq2.c(4);
                            }
                            if (oq.e()) {
                                oq2.c(4);
                            }
                            if (oq.e()) {
                                oq2.c(4);
                            }
                            if (oq.e()) {
                                oq2.c(4);
                            }
                            if (oq.e()) {
                                if (oq.e()) {
                                    oq2.c(4);
                                }
                                if (oq.e()) {
                                    oq2.c(4);
                                }
                            }
                        }
                        if (oq.e()) {
                            oq2.c(5);
                            if (oq.e()) {
                                oq2.c(7);
                                if (oq.e()) {
                                    oq2.c(8);
                                }
                            }
                        }
                        oq2.c((a7 + 2) * 8);
                        oq.b();
                    }
                    if (a5 < 2) {
                        if (oq.e()) {
                            oq2.c(14);
                        }
                        if (a5 == 0 && oq.e()) {
                            oq2.c(14);
                        }
                    }
                    if (oq.e()) {
                        if (i8 == 0) {
                            oq2.c(5);
                        } else {
                            for (int i13 = 0; i13 < i7; i13++) {
                                if (oq.e()) {
                                    oq2.c(5);
                                }
                            }
                        }
                    }
                }
            }
            if (oq.e()) {
                oq2.c(5);
                if (a5 == 2) {
                    oq2.c(4);
                }
                if (a5 >= 6) {
                    oq2.c(2);
                }
                if (oq.e()) {
                    oq2.c(8);
                }
                if (a5 == 0 && oq.e()) {
                    oq2.c(8);
                }
                i9 = 3;
                if (a4 < 3) {
                    oq.f();
                }
            } else {
                i9 = 3;
            }
            if (i10 == 0 && i8 != i9) {
                oq.f();
            }
            if (i10 == 2 && (i8 == i9 || oq.e())) {
                oq2.c(6);
            }
            str = (oq.e() && oq2.a(6) == 1 && oq2.a(8) == 1) ? "audio/eac3-joc" : "audio/eac3";
            i5 = i10;
            i2 = a3;
            i3 = i6;
            i = i11;
            i4 = i12;
        } else {
            oq2.c(32);
            int a8 = oq2.a(2);
            String str2 = a8 == 3 ? null : "audio/ac3";
            int a9 = a(a8, oq2.a(6));
            oq2.c(8);
            int a10 = oq2.a(3);
            if (!((a10 & 1) == 0 || a10 == 1)) {
                oq2.c(2);
            }
            if ((a10 & 4) != 0) {
                oq2.c(2);
            }
            if (a10 == 2) {
                oq2.c(2);
            }
            int[] iArr = b;
            str = str2;
            i2 = a9;
            i3 = a8 < iArr.length ? iArr[a8] : -1;
            i4 = d[a10] + (oq.e() ? 1 : 0);
            i5 = -1;
            i = 1536;
        }
        a aVar = new a(str, i5, i4, i3, i2, i);
        return aVar;
    }

    public static int b(ByteBuffer byteBuffer) {
        int i = 6;
        if (((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3) {
            i = a[(byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4];
        }
        return i * 256;
    }

    public static int b(byte[] bArr) {
        boolean z = false;
        if (bArr[4] != -8 || bArr[5] != 114 || bArr[6] != 111 || (bArr[7] & 254) != 186) {
            return 0;
        }
        if ((bArr[7] & 255) == 187) {
            z = true;
        }
        return 40 << ((bArr[z ? (char) 9 : 8] >> 4) & 7);
    }

    public static int a(byte[] bArr) {
        if (bArr.length < 6) {
            return -1;
        }
        if (!(((bArr[5] & 255) >> 3) == 16)) {
            return a((bArr[4] & 192) >> 6, (int) bArr[4] & 63);
        }
        return (((bArr[3] & 255) | ((bArr[2] & 7) << 8)) + 1) * 2;
    }

    public static int a(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit() - 10;
        for (int i = position; i <= limit; i++) {
            if ((byteBuffer.getInt(i + 4) & -16777217) == -1167101192) {
                return i - position;
            }
        }
        return -1;
    }

    public static int a(ByteBuffer byteBuffer, int i) {
        return 40 << ((byteBuffer.get((byteBuffer.position() + i) + ((byteBuffer.get((byteBuffer.position() + i) + 7) & 255) == 187 ? 9 : 8)) >> 4) & 7);
    }

    private static int a(int i, int i2) {
        int i3 = i2 / 2;
        if (i >= 0) {
            int[] iArr = b;
            if (i < iArr.length && i2 >= 0) {
                int[] iArr2 = f;
                if (i3 < iArr2.length) {
                    int i4 = iArr[i];
                    if (i4 == 44100) {
                        return (iArr2[i3] + (i2 % 2)) * 2;
                    }
                    int i5 = e[i3];
                    return i4 == 32000 ? i5 * 6 : i5 * 4;
                }
            }
        }
        return -1;
    }
}
