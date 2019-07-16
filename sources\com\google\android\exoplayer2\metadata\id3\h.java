package com.google.android.exoplayer2.metadata.id3;

import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.Metadata.Entry;
import com.google.android.exoplayer2.metadata.e;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* compiled from: Id3Decoder */
public final class h implements com.google.android.exoplayer2.metadata.b {
    public static final a a = a.a;
    public static final int b = C0471ar.b("ID3");
    private final a c;

    /* compiled from: Id3Decoder */
    public interface a {
        boolean a(int i, int i2, int i3, int i4, int i5);
    }

    /* compiled from: Id3Decoder */
    private static final class b {
        /* access modifiers changed from: private */
        public final int a;
        /* access modifiers changed from: private */
        public final boolean b;
        /* access modifiers changed from: private */
        public final int c;

        public b(int i, boolean z, int i2) {
            this.a = i;
            this.b = z;
            this.c = i2;
        }
    }

    public h() {
        this(null);
    }

    private static int a(int i) {
        return (i == 0 || i == 3) ? 1 : 2;
    }

    static /* synthetic */ boolean a(int i, int i2, int i3, int i4, int i5) {
        return false;
    }

    private static TextInformationFrame b(Pq pq, int i, String str) throws UnsupportedEncodingException {
        if (i < 1) {
            return null;
        }
        int t = pq.t();
        String b2 = b(t);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        pq.a(bArr, 0, i2);
        return new TextInformationFrame(str, null, new String(bArr, 0, b(bArr, 0, t), b2));
    }

    private static String b(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "ISO-8859-1" : "UTF-8" : "UTF-16BE" : "UTF-16";
    }

    private static UrlLinkFrame c(Pq pq, int i, String str) throws UnsupportedEncodingException {
        byte[] bArr = new byte[i];
        pq.a(bArr, 0, i);
        return new UrlLinkFrame(str, null, new String(bArr, 0, b(bArr, 0), "ISO-8859-1"));
    }

    private static PrivFrame d(Pq pq, int i) throws UnsupportedEncodingException {
        byte[] bArr = new byte[i];
        pq.a(bArr, 0, i);
        int b2 = b(bArr, 0);
        return new PrivFrame(new String(bArr, 0, b2, "ISO-8859-1"), a(bArr, b2 + 1, bArr.length));
    }

    private static TextInformationFrame e(Pq pq, int i) throws UnsupportedEncodingException {
        if (i < 1) {
            return null;
        }
        int t = pq.t();
        String b2 = b(t);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        pq.a(bArr, 0, i2);
        int b3 = b(bArr, 0, t);
        String str = new String(bArr, 0, b3, b2);
        int a2 = b3 + a(t);
        return new TextInformationFrame("TXXX", str, a(bArr, a2, b(bArr, a2, t), b2));
    }

    private static UrlLinkFrame f(Pq pq, int i) throws UnsupportedEncodingException {
        if (i < 1) {
            return null;
        }
        int t = pq.t();
        String b2 = b(t);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        pq.a(bArr, 0, i2);
        int b3 = b(bArr, 0, t);
        String str = new String(bArr, 0, b3, b2);
        int a2 = b3 + a(t);
        return new UrlLinkFrame("WXXX", str, a(bArr, a2, b(bArr, a2), "ISO-8859-1"));
    }

    private static int g(Pq pq, int i) {
        byte[] bArr = pq.a;
        int c2 = pq.c();
        int i2 = i;
        int i3 = c2;
        while (true) {
            int i4 = i3 + 1;
            if (i4 >= c2 + i2) {
                return i2;
            }
            if ((bArr[i3] & 255) == 255 && bArr[i4] == 0) {
                System.arraycopy(bArr, i3 + 2, bArr, i4, (i2 - (i3 - c2)) - 2);
                i2--;
            }
            i3 = i4;
        }
    }

    public Metadata a(e eVar) {
        ByteBuffer byteBuffer = eVar.c;
        return a(byteBuffer.array(), byteBuffer.limit());
    }

    public h(a aVar) {
        this.c = aVar;
    }

    public Metadata a(byte[] bArr, int i) {
        ArrayList arrayList = new ArrayList();
        Pq pq = new Pq(bArr, i);
        b a2 = a(pq);
        if (a2 == null) {
            return null;
        }
        int c2 = pq.c();
        int i2 = a2.a == 2 ? 6 : 10;
        int b2 = a2.c;
        if (a2.b) {
            b2 = g(pq, a2.c);
        }
        pq.d(c2 + b2);
        boolean z = false;
        if (!a(pq, a2.a, i2, false)) {
            if (a2.a != 4 || !a(pq, 4, i2, true)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Failed to validate ID3 tag with majorVersion=");
                sb.append(a2.a);
                Iq.d("Id3Decoder", sb.toString());
                return null;
            }
            z = true;
        }
        while (pq.a() >= i2) {
            Id3Frame a3 = a(a2.a, pq, z, i2, this.c);
            if (a3 != null) {
                arrayList.add(a3);
            }
        }
        return new Metadata((List<? extends Entry>) arrayList);
    }

    private static MlltFrame c(Pq pq, int i) {
        int z = pq.z();
        int w = pq.w();
        int w2 = pq.w();
        int t = pq.t();
        int t2 = pq.t();
        Oq oq = new Oq();
        oq.a(pq);
        int i2 = ((i - 10) * 8) / (t + t2);
        int[] iArr = new int[i2];
        int[] iArr2 = new int[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            int a2 = oq.a(t);
            int a3 = oq.a(t2);
            iArr[i3] = a2;
            iArr2[i3] = a3;
        }
        MlltFrame mlltFrame = new MlltFrame(z, w, w2, iArr, iArr2);
        return mlltFrame;
    }

    private static GeobFrame b(Pq pq, int i) throws UnsupportedEncodingException {
        int t = pq.t();
        String b2 = b(t);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        pq.a(bArr, 0, i2);
        int b3 = b(bArr, 0);
        String str = new String(bArr, 0, b3, "ISO-8859-1");
        int i3 = b3 + 1;
        int b4 = b(bArr, i3, t);
        String a2 = a(bArr, i3, b4, b2);
        int a3 = b4 + a(t);
        int b5 = b(bArr, a3, t);
        return new GeobFrame(str, a2, a(bArr, a3, b5, b2), a(bArr, b5 + a(t), bArr.length));
    }

    private static b a(Pq pq) {
        String str = "Id3Decoder";
        if (pq.a() < 10) {
            Iq.d(str, "Data too short to be an ID3 tag");
            return null;
        }
        int w = pq.w();
        if (w != b) {
            StringBuilder sb = new StringBuilder();
            sb.append("Unexpected first three bytes of ID3 tag header: ");
            sb.append(w);
            Iq.d(str, sb.toString());
            return null;
        }
        int t = pq.t();
        boolean z = true;
        pq.f(1);
        int t2 = pq.t();
        int s = pq.s();
        if (t == 2) {
            if ((t2 & 64) != 0) {
                Iq.d(str, "Skipped ID3 tag with majorVersion=2 and undefined compression scheme");
                return null;
            }
        } else if (t == 3) {
            if ((t2 & 64) != 0) {
                int h = pq.h();
                pq.f(h);
                s -= h + 4;
            }
        } else if (t == 4) {
            if ((t2 & 64) != 0) {
                int s2 = pq.s();
                pq.f(s2 - 4);
                s -= s2;
            }
            if ((t2 & 16) != 0) {
                s -= 10;
            }
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Skipped ID3 tag with unsupported majorVersion=");
            sb2.append(t);
            Iq.d(str, sb2.toString());
            return null;
        }
        if (t >= 4 || (t2 & 128) == 0) {
            z = false;
        }
        return new b(t, z, s);
    }

    private static ChapterTocFrame b(Pq pq, int i, int i2, boolean z, int i3, a aVar) throws UnsupportedEncodingException {
        Pq pq2 = pq;
        int c2 = pq.c();
        int b2 = b(pq2.a, c2);
        String str = "ISO-8859-1";
        String str2 = new String(pq2.a, c2, b2 - c2, str);
        pq.e(b2 + 1);
        int t = pq.t();
        boolean z2 = (t & 2) != 0;
        boolean z3 = (t & 1) != 0;
        int t2 = pq.t();
        String[] strArr = new String[t2];
        for (int i4 = 0; i4 < t2; i4++) {
            int c3 = pq.c();
            int b3 = b(pq2.a, c3);
            strArr[i4] = new String(pq2.a, c3, b3 - c3, str);
            pq.e(b3 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i5 = c2 + i;
        while (pq.c() < i5) {
            Id3Frame a2 = a(i2, pq, z, i3, aVar);
            if (a2 != null) {
                arrayList.add(a2);
            }
        }
        Id3Frame[] id3FrameArr = new Id3Frame[arrayList.size()];
        arrayList.toArray(id3FrameArr);
        ChapterTocFrame chapterTocFrame = new ChapterTocFrame(str2, z2, z3, strArr, id3FrameArr);
        return chapterTocFrame;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0076, code lost:
        if ((r10 & 1) != 0) goto L_0x0078;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0085, code lost:
        if ((r10 & 128) != 0) goto L_0x0078;
     */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x009b A[SYNTHETIC, Splitter:B:49:0x009b] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0097 A[SYNTHETIC] */
    private static boolean a(Pq pq, int i, int i2, boolean z) {
        int i3;
        long j;
        int i4;
        boolean z2;
        boolean z3;
        Pq pq2 = pq;
        int i5 = i;
        int c2 = pq.c();
        while (true) {
            try {
                int i6 = 1;
                if (pq.a() >= i2) {
                    if (i5 >= 3) {
                        i4 = pq.h();
                        j = pq.v();
                        i3 = pq.z();
                    } else {
                        i4 = pq.w();
                        j = (long) pq.w();
                        i3 = 0;
                    }
                    if (i4 == 0 && j == 0 && i3 == 0) {
                        pq2.e(c2);
                        return true;
                    }
                    if (i5 == 4 && !z) {
                        if ((8421504 & j) != 0) {
                            pq2.e(c2);
                            return false;
                        }
                        j = (((j >> 24) & 255) << 21) | (j & 255) | (((j >> 8) & 255) << 7) | (((j >> 16) & 255) << 14);
                    }
                    if (i5 == 4) {
                        z3 = (i3 & 64) != 0;
                    } else {
                        if (i5 == 3) {
                            z3 = (i3 & 32) != 0;
                        } else {
                            z3 = false;
                        }
                        z2 = false;
                        if (!z3) {
                            i6 = 0;
                        }
                        if (z2) {
                            i6 += 4;
                        }
                        if (j >= ((long) i6)) {
                            pq2.e(c2);
                            return false;
                        } else if (((long) pq.a()) < j) {
                            return false;
                        } else {
                            pq2.f((int) j);
                        }
                    }
                    z2 = true;
                    if (!z3) {
                    }
                    if (z2) {
                    }
                    if (j >= ((long) i6)) {
                    }
                } else {
                    pq2.e(c2);
                    return true;
                }
            } finally {
                pq2.e(c2);
            }
        }
    }

    private static String b(int i, int i2, int i3, int i4, int i5) {
        if (i == 2) {
            return String.format(Locale.US, "%c%c%c", new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)});
        }
        return String.format(Locale.US, "%c%c%c%c", new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)});
    }

    private static int b(byte[] bArr, int i, int i2) {
        int b2 = b(bArr, i);
        if (i2 == 0 || i2 == 3) {
            return b2;
        }
        while (b2 < bArr.length - 1) {
            if (b2 % 2 == 0 && bArr[b2 + 1] == 0) {
                return b2;
            }
            b2 = b(bArr, b2 + 1);
        }
        return bArr.length;
    }

    private static int b(byte[] bArr, int i) {
        while (i < bArr.length) {
            if (bArr[i] == 0) {
                return i;
            }
            i++;
        }
        return bArr.length;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:131:0x0193, code lost:
        if (r13 == 67) goto L_0x0195;
     */
    private static Id3Frame a(int i, Pq pq, boolean z, int i2, a aVar) {
        int w;
        int i3;
        int i4;
        String str;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        Id3Frame id3Frame;
        int i5 = i;
        Pq pq2 = pq;
        int t = pq.t();
        int t2 = pq.t();
        int t3 = pq.t();
        int t4 = i5 >= 3 ? pq.t() : 0;
        if (i5 == 4) {
            w = pq.x();
            if (!z) {
                w = (((w >> 24) & 255) << 21) | (w & 255) | (((w >> 8) & 255) << 7) | (((w >> 16) & 255) << 14);
            }
        } else {
            w = i5 == 3 ? pq.x() : pq.w();
        }
        int i6 = w;
        int z7 = i5 >= 3 ? pq.z() : 0;
        if (t == 0 && t2 == 0 && t3 == 0 && t4 == 0 && i6 == 0 && z7 == 0) {
            pq2.e(pq.d());
            return null;
        }
        int c2 = pq.c() + i6;
        String str2 = "Id3Decoder";
        if (c2 > pq.d()) {
            Iq.d(str2, "Frame size exceeds remaining tag data");
            pq2.e(pq.d());
            return null;
        }
        if (aVar != null) {
            str = str2;
            i4 = c2;
            i3 = z7;
            if (!aVar.a(i, t, t2, t3, t4)) {
                pq2.e(i4);
                return null;
            }
        } else {
            str = str2;
            i4 = c2;
            i3 = z7;
        }
        if (i5 == 3) {
            int i7 = i3;
            z5 = (i7 & 128) != 0;
            z4 = (i7 & 64) != 0;
            z6 = (i7 & 32) != 0;
            z2 = z5;
            z3 = false;
        } else {
            int i8 = i3;
            if (i5 == 4) {
                boolean z8 = (i8 & 64) != 0;
                boolean z9 = (i8 & 8) != 0;
                boolean z10 = (i8 & 4) != 0;
                z3 = (i8 & 2) != 0;
                boolean z11 = (i8 & 1) != 0;
                z6 = z8;
                z5 = z11;
                z2 = z9;
                z4 = z10;
            } else {
                z6 = false;
                z5 = false;
                z4 = false;
                z3 = false;
                z2 = false;
            }
        }
        if (z2 || z4) {
            Iq.d(str, "Skipping unsupported compressed or encrypted frame");
            pq2.e(i4);
            return null;
        }
        if (z6) {
            i6--;
            pq2.f(1);
        }
        if (z5) {
            i6 -= 4;
            pq2.f(4);
        }
        if (z3) {
            i6 = g(pq2, i6);
        }
        if (t == 84 && t2 == 88 && t3 == 88 && (i5 == 2 || t4 == 88)) {
            try {
                id3Frame = e(pq2, i6);
            } catch (UnsupportedEncodingException unused) {
                Iq.d(str, "Unsupported character encoding");
                pq2.e(i4);
                return null;
            } catch (Throwable th) {
                pq2.e(i4);
                throw th;
            }
        } else if (t == 84) {
            id3Frame = b(pq2, i6, b(i5, t, t2, t3, t4));
        } else if (t == 87 && t2 == 88 && t3 == 88 && (i5 == 2 || t4 == 88)) {
            id3Frame = f(pq2, i6);
        } else if (t == 87) {
            id3Frame = c(pq2, i6, b(i5, t, t2, t3, t4));
        } else if (t == 80 && t2 == 82 && t3 == 73 && t4 == 86) {
            id3Frame = d(pq2, i6);
        } else if (t == 71 && t2 == 69 && t3 == 79 && (t4 == 66 || i5 == 2)) {
            id3Frame = b(pq2, i6);
        } else {
            if (i5 == 2) {
                if (t == 80 && t2 == 73 && t3 == 67) {
                }
                if (t != 67 && t2 == 79 && t3 == 77 && (t4 == 77 || i5 == 2)) {
                    id3Frame = a(pq2, i6);
                } else if (t != 67 && t2 == 72 && t3 == 65 && t4 == 80) {
                    id3Frame = a(pq, i6, i, z, i2, aVar);
                } else if (t != 67 && t2 == 84 && t3 == 79 && t4 == 67) {
                    id3Frame = b(pq, i6, i, z, i2, aVar);
                } else if (t != 77 && t2 == 76 && t3 == 76 && t4 == 84) {
                    id3Frame = c(pq2, i6);
                } else {
                    id3Frame = a(pq2, i6, b(i5, t, t2, t3, t4));
                }
            } else {
                if (t == 65) {
                    if (t2 == 80) {
                        if (t3 == 73) {
                        }
                    }
                }
                if (t != 67) {
                }
                if (t != 67) {
                }
                if (t != 67) {
                }
                if (t != 77) {
                }
                id3Frame = a(pq2, i6, b(i5, t, t2, t3, t4));
            }
            id3Frame = a(pq2, i6, i5);
        }
        if (id3Frame == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to decode frame: id=");
            sb.append(b(i5, t, t2, t3, t4));
            sb.append(", frameSize=");
            sb.append(i6);
            Iq.d(str, sb.toString());
        }
        pq2.e(i4);
        return id3Frame;
    }

    private static ApicFrame a(Pq pq, int i, int i2) throws UnsupportedEncodingException {
        int i3;
        String str;
        int t = pq.t();
        String b2 = b(t);
        int i4 = i - 1;
        byte[] bArr = new byte[i4];
        pq.a(bArr, 0, i4);
        String str2 = "image/";
        String str3 = "ISO-8859-1";
        if (i2 == 2) {
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append(C0471ar.g(new String(bArr, 0, 3, str3)));
            str = sb.toString();
            if ("image/jpg".equals(str)) {
                str = "image/jpeg";
            }
            i3 = 2;
        } else {
            i3 = b(bArr, 0);
            String g = C0471ar.g(new String(bArr, 0, i3, str3));
            if (g.indexOf(47) == -1) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str2);
                sb2.append(g);
                str = sb2.toString();
            } else {
                str = g;
            }
        }
        byte b3 = bArr[i3 + 1] & 255;
        int i5 = i3 + 2;
        int b4 = b(bArr, i5, t);
        return new ApicFrame(str, new String(bArr, i5, b4 - i5, b2), b3, a(bArr, b4 + a(t), bArr.length));
    }

    private static CommentFrame a(Pq pq, int i) throws UnsupportedEncodingException {
        if (i < 4) {
            return null;
        }
        int t = pq.t();
        String b2 = b(t);
        byte[] bArr = new byte[3];
        pq.a(bArr, 0, 3);
        String str = new String(bArr, 0, 3);
        int i2 = i - 4;
        byte[] bArr2 = new byte[i2];
        pq.a(bArr2, 0, i2);
        int b3 = b(bArr2, 0, t);
        String str2 = new String(bArr2, 0, b3, b2);
        int a2 = b3 + a(t);
        return new CommentFrame(str, str2, a(bArr2, a2, b(bArr2, a2, t), b2));
    }

    private static ChapterFrame a(Pq pq, int i, int i2, boolean z, int i3, a aVar) throws UnsupportedEncodingException {
        Pq pq2 = pq;
        int c2 = pq.c();
        int b2 = b(pq2.a, c2);
        String str = new String(pq2.a, c2, b2 - c2, "ISO-8859-1");
        pq.e(b2 + 1);
        int h = pq.h();
        int h2 = pq.h();
        long v = pq.v();
        long j = v == 4294967295L ? -1 : v;
        long v2 = pq.v();
        long j2 = v2 == 4294967295L ? -1 : v2;
        ArrayList arrayList = new ArrayList();
        int i4 = c2 + i;
        while (pq.c() < i4) {
            Id3Frame a2 = a(i2, pq, z, i3, aVar);
            if (a2 != null) {
                arrayList.add(a2);
            }
        }
        Id3Frame[] id3FrameArr = new Id3Frame[arrayList.size()];
        arrayList.toArray(id3FrameArr);
        ChapterFrame chapterFrame = new ChapterFrame(str, h, h2, j, j2, id3FrameArr);
        return chapterFrame;
    }

    private static BinaryFrame a(Pq pq, int i, String str) {
        byte[] bArr = new byte[i];
        pq.a(bArr, 0, i);
        return new BinaryFrame(str, bArr);
    }

    private static byte[] a(byte[] bArr, int i, int i2) {
        if (i2 <= i) {
            return C0471ar.f;
        }
        return Arrays.copyOfRange(bArr, i, i2);
    }

    private static String a(byte[] bArr, int i, int i2, String str) throws UnsupportedEncodingException {
        return (i2 <= i || i2 > bArr.length) ? "" : new String(bArr, i, i2 - i, str);
    }
}
