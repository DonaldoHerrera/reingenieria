package defpackage;

import android.util.Pair;
import android.util.SparseArray;
import com.comscore.streaming.AdType;
import com.google.android.exoplayer2.C0615o;
import com.google.android.exoplayer2.H;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.drm.DrmInitData.SchemeData;
import com.google.android.exoplayer2.video.ColorInfo;
import com.google.android.exoplayer2.video.h;
import com.google.android.exoplayer2.video.l;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.UUID;

/* renamed from: yn reason: default package and case insensitive filesystem */
/* compiled from: MatroskaExtractor */
public class C1879yn implements _m {
    public static final C0529cn a = C1699sn.a;
    private static final byte[] b = {Framer.STDOUT_FRAME_PREFIX, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, Framer.STDIN_FRAME_PREFIX, Framer.STDIN_FRAME_PREFIX, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
    private static final byte[] c = {32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32};
    /* access modifiers changed from: private */
    public static final byte[] d = C0471ar.c("Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text");
    private static final byte[] e = {68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
    private static final byte[] f = {32, 32, 32, 32, 32, 32, 32, 32, 32, 32};
    /* access modifiers changed from: private */
    public static final UUID g = new UUID(72057594037932032L, -9223371306706625679L);
    private b A;
    private boolean B;
    private int C;
    private long D;
    private boolean E;
    private long F;
    private long G;
    private long H;
    private Jq I;
    private Jq J;
    private boolean K;
    private int L;
    private long M;
    private long N;
    private int O;
    private int P;
    private int[] Q;
    private int R;
    private int S;
    private int T;
    private int U;
    private boolean V;
    private boolean W;
    private boolean X;
    private boolean Y;
    private byte Z;
    private int aa;
    private int ba;
    private int ca;
    private boolean da;
    private boolean ea;
    private C0498bn fa;
    private final C1819wn h;
    private final An i;
    private final SparseArray<b> j;
    private final boolean k;
    private final Pq l;
    private final Pq m;
    private final Pq n;
    private final Pq o;
    private final Pq p;
    private final Pq q;
    private final Pq r;
    private final Pq s;
    private final Pq t;
    private ByteBuffer u;
    private long v;
    private long w;
    private long x;
    private long y;
    private long z;

    /* renamed from: yn$a */
    /* compiled from: MatroskaExtractor */
    private final class a implements C1789vn {
        private a() {
        }

        public void a(int i, long j, long j2) throws H {
            C1879yn.this.a(i, j, j2);
        }

        public int b(int i) {
            return C1879yn.this.b(i);
        }

        public boolean c(int i) {
            return C1879yn.this.c(i);
        }

        public void a(int i) throws H {
            C1879yn.this.a(i);
        }

        public void a(int i, long j) throws H {
            C1879yn.this.a(i, j);
        }

        public void a(int i, double d) throws H {
            C1879yn.this.a(i, d);
        }

        public void a(int i, String str) throws H {
            C1879yn.this.a(i, str);
        }

        public void a(int i, int i2, C0313an anVar) throws IOException, InterruptedException {
            C1879yn.this.a(i, i2, anVar);
        }
    }

    /* renamed from: yn$b */
    /* compiled from: MatroskaExtractor */
    private static final class b {
        public int A;
        public float B;
        public float C;
        public float D;
        public float E;
        public float F;
        public float G;
        public float H;
        public float I;
        public float J;
        public float K;
        public int L;
        public int M;
        public int N;
        public long O;
        public long P;
        public c Q;
        public boolean R;
        public boolean S;
        /* access modifiers changed from: private */
        public String T;
        public C1424jn U;
        public int V;
        public String a;
        public String b;
        public int c;
        public int d;
        public int e;
        public boolean f;
        public byte[] g;
        public defpackage.C1424jn.a h;
        public byte[] i;
        public DrmInitData j;
        public int k;
        public int l;
        public int m;
        public int n;
        public int o;
        public int p;
        public float q;
        public float r;
        public float s;
        public byte[] t;
        public int u;
        public boolean v;
        public int w;
        public int x;
        public int y;
        public int z;

        private b() {
            this.k = -1;
            this.l = -1;
            this.m = -1;
            this.n = -1;
            this.o = 0;
            this.p = -1;
            this.q = 0.0f;
            this.r = 0.0f;
            this.s = 0.0f;
            this.t = null;
            this.u = -1;
            this.v = false;
            this.w = -1;
            this.x = -1;
            this.y = -1;
            this.z = 1000;
            this.A = 200;
            this.B = -1.0f;
            this.C = -1.0f;
            this.D = -1.0f;
            this.E = -1.0f;
            this.F = -1.0f;
            this.G = -1.0f;
            this.H = -1.0f;
            this.I = -1.0f;
            this.J = -1.0f;
            this.K = -1.0f;
            this.L = 1;
            this.M = -1;
            this.N = 8000;
            this.O = 0;
            this.P = 0;
            this.S = true;
            this.T = "eng";
        }

        private byte[] c() {
            if (this.B == -1.0f || this.C == -1.0f || this.D == -1.0f || this.E == -1.0f || this.F == -1.0f || this.G == -1.0f || this.H == -1.0f || this.I == -1.0f || this.J == -1.0f || this.K == -1.0f) {
                return null;
            }
            byte[] bArr = new byte[25];
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            wrap.put(0);
            wrap.putShort((short) ((int) ((this.B * 50000.0f) + 0.5f)));
            wrap.putShort((short) ((int) ((this.C * 50000.0f) + 0.5f)));
            wrap.putShort((short) ((int) ((this.D * 50000.0f) + 0.5f)));
            wrap.putShort((short) ((int) ((this.E * 50000.0f) + 0.5f)));
            wrap.putShort((short) ((int) ((this.F * 50000.0f) + 0.5f)));
            wrap.putShort((short) ((int) ((this.G * 50000.0f) + 0.5f)));
            wrap.putShort((short) ((int) ((this.H * 50000.0f) + 0.5f)));
            wrap.putShort((short) ((int) ((this.I * 50000.0f) + 0.5f)));
            wrap.putShort((short) ((int) (this.J + 0.5f)));
            wrap.putShort((short) ((int) (this.K + 0.5f)));
            wrap.putShort((short) this.z);
            wrap.putShort((short) this.A);
            return bArr;
        }

        public void b() {
            c cVar = this.Q;
            if (cVar != null) {
                cVar.a();
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:105:0x01de, code lost:
            r23 = r1;
            r1 = r11;
            r3 = null;
            r20 = -1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:112:0x022e, code lost:
            r1 = r14;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:121:0x025b, code lost:
            r3 = null;
            r20 = 4096;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:127:0x02d4, code lost:
            r20 = -1;
            r23 = -1;
            r31 = r3;
            r3 = r1;
            r1 = r31;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:139:0x031e, code lost:
            r3 = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:140:0x031f, code lost:
            r20 = -1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:141:0x0321, code lost:
            r23 = -1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:142:0x0323, code lost:
            r11 = r0.S | false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:143:0x0328, code lost:
            if (r0.R == false) goto L_0x032c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:144:0x032a, code lost:
            r12 = 2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:145:0x032c, code lost:
            r12 = 0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:146:0x032d, code lost:
            r11 = r11 | r12;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:147:0x0332, code lost:
            if (defpackage.Lq.d(r1) == false) goto L_0x0359;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:148:0x0334, code lost:
            r1 = com.google.android.exoplayer2.Format.a(java.lang.Integer.toString(r34), r1, (java.lang.String) null, -1, r20, r0.L, r0.N, r23, r3, r0.j, r11 ? 1 : 0, r0.T);
            r7 = 1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:150:0x035d, code lost:
            if (defpackage.Lq.f(r1) == false) goto L_0x0459;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:152:0x0361, code lost:
            if (r0.o != 0) goto L_0x0373;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:153:0x0363, code lost:
            r2 = r0.m;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:154:0x0365, code lost:
            if (r2 != -1) goto L_0x0369;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:155:0x0367, code lost:
            r2 = r0.k;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:156:0x0369, code lost:
            r0.m = r2;
            r2 = r0.n;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:157:0x036d, code lost:
            if (r2 != -1) goto L_0x0371;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:158:0x036f, code lost:
            r2 = r0.l;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:159:0x0371, code lost:
            r0.n = r2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:160:0x0373, code lost:
            r4 = r0.m;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:161:0x0377, code lost:
            if (r4 == -1) goto L_0x038b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:162:0x0379, code lost:
            r7 = r0.n;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:163:0x037b, code lost:
            if (r7 == -1) goto L_0x038b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:164:0x037d, code lost:
            r26 = ((float) (r0.l * r4)) / ((float) (r0.k * r7));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:165:0x038b, code lost:
            r26 = -1.0f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:167:0x038f, code lost:
            if (r0.v == false) goto L_0x03a0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:168:0x0391, code lost:
            r15 = new com.google.android.exoplayer2.video.ColorInfo(r0.w, r0.y, r0.x, c());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:169:0x03a0, code lost:
            r29 = r15;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:170:0x03aa, code lost:
            if ("htc_video_rotA-000".equals(r0.a) == false) goto L_0x03ae;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:171:0x03ac, code lost:
            r2 = 0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:173:0x03b6, code lost:
            if ("htc_video_rotA-090".equals(r0.a) == false) goto L_0x03bb;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:174:0x03b8, code lost:
            r2 = 90;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:176:0x03c3, code lost:
            if ("htc_video_rotA-180".equals(r0.a) == false) goto L_0x03c8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:177:0x03c5, code lost:
            r2 = 180;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:179:0x03d0, code lost:
            if ("htc_video_rotA-270".equals(r0.a) == false) goto L_0x03d5;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:180:0x03d2, code lost:
            r2 = 270;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:181:0x03d5, code lost:
            r2 = -1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:183:0x03d8, code lost:
            if (r0.p != 0) goto L_0x042e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:185:0x03e1, code lost:
            if (java.lang.Float.compare(r0.q, 0.0f) != 0) goto L_0x042e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:187:0x03e9, code lost:
            if (java.lang.Float.compare(r0.r, 0.0f) != 0) goto L_0x042e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:189:0x03f1, code lost:
            if (java.lang.Float.compare(r0.s, 0.0f) != 0) goto L_0x03f6;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:190:0x03f3, code lost:
            r25 = 0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:192:0x03fe, code lost:
            if (java.lang.Float.compare(r0.r, 90.0f) != 0) goto L_0x0405;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:193:0x0400, code lost:
            r25 = 90;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:195:0x040d, code lost:
            if (java.lang.Float.compare(r0.r, -180.0f) == 0) goto L_0x0429;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:197:0x0417, code lost:
            if (java.lang.Float.compare(r0.r, 180.0f) != 0) goto L_0x041a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:199:0x0422, code lost:
            if (java.lang.Float.compare(r0.r, -90.0f) != 0) goto L_0x042e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:200:0x0424, code lost:
            r25 = 270;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:201:0x0429, code lost:
            r25 = 180;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:202:0x042e, code lost:
            r25 = r2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:203:0x0430, code lost:
            r1 = com.google.android.exoplayer2.Format.a(java.lang.Integer.toString(r34), r1, (java.lang.String) null, -1, r20, r0.k, r0.l, -1.0f, r3, r25, r26, r0.t, r0.u, r29, r0.j);
            r7 = 2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:205:0x045d, code lost:
            if (r10.equals(r1) == false) goto L_0x046d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:206:0x045f, code lost:
            r1 = com.google.android.exoplayer2.Format.a(java.lang.Integer.toString(r34), r1, r11 ? 1 : 0, r0.T, r0.j);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:208:0x0471, code lost:
            if (r9.equals(r1) == false) goto L_0x04a6;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:209:0x0473, code lost:
            r2 = new java.util.ArrayList(2);
            r2.add(defpackage.C1879yn.a());
            r2.add(r0.i);
            r1 = com.google.android.exoplayer2.Format.a(java.lang.Integer.toString(r34), r1, null, -1, r11 ? 1 : 0, r0.T, -1, r0.j, Long.MAX_VALUE, r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:211:0x04aa, code lost:
            if (r2.equals(r1) != false) goto L_0x04c5;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:213:0x04b2, code lost:
            if ("application/pgs".equals(r1) != false) goto L_0x04c5;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:215:0x04ba, code lost:
            if ("application/dvbsubs".equals(r1) == false) goto L_0x04bd;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:217:0x04c4, code lost:
            throw new com.google.android.exoplayer2.H("Unexpected MIME type.");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:218:0x04c5, code lost:
            r1 = com.google.android.exoplayer2.Format.a(java.lang.Integer.toString(r34), r1, null, -1, r11 ? 1 : 0, r3, r0.T, r0.j);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:219:0x04df, code lost:
            r0.U = r33.a(r0.c, r7);
            r0.U.a(r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:220:0x04ee, code lost:
            return;
         */
        public void a(C0498bn bnVar, int i2) throws H {
            char c2;
            int i3;
            List list;
            String str;
            String str2;
            List list2;
            String str3;
            int c3;
            String str4 = this.b;
            int i4 = 3;
            switch (str4.hashCode()) {
                case -2095576542:
                    if (str4.equals("V_MPEG4/ISO/AP")) {
                        c2 = 6;
                        break;
                    }
                case -2095575984:
                    if (str4.equals("V_MPEG4/ISO/SP")) {
                        c2 = 4;
                        break;
                    }
                case -1985379776:
                    if (str4.equals("A_MS/ACM")) {
                        c2 = 23;
                        break;
                    }
                case -1784763192:
                    if (str4.equals("A_TRUEHD")) {
                        c2 = 18;
                        break;
                    }
                case -1730367663:
                    if (str4.equals("A_VORBIS")) {
                        c2 = 11;
                        break;
                    }
                case -1482641358:
                    if (str4.equals("A_MPEG/L2")) {
                        c2 = 14;
                        break;
                    }
                case -1482641357:
                    if (str4.equals("A_MPEG/L3")) {
                        c2 = 15;
                        break;
                    }
                case -1373388978:
                    if (str4.equals("V_MS/VFW/FOURCC")) {
                        c2 = 9;
                        break;
                    }
                case -933872740:
                    if (str4.equals("S_DVBSUB")) {
                        c2 = 29;
                        break;
                    }
                case -538363189:
                    if (str4.equals("V_MPEG4/ISO/ASP")) {
                        c2 = 5;
                        break;
                    }
                case -538363109:
                    if (str4.equals("V_MPEG4/ISO/AVC")) {
                        c2 = 7;
                        break;
                    }
                case -425012669:
                    if (str4.equals("S_VOBSUB")) {
                        c2 = 27;
                        break;
                    }
                case -356037306:
                    if (str4.equals("A_DTS/LOSSLESS")) {
                        c2 = 21;
                        break;
                    }
                case 62923557:
                    if (str4.equals("A_AAC")) {
                        c2 = 13;
                        break;
                    }
                case 62923603:
                    if (str4.equals("A_AC3")) {
                        c2 = 16;
                        break;
                    }
                case 62927045:
                    if (str4.equals("A_DTS")) {
                        c2 = 19;
                        break;
                    }
                case 82318131:
                    if (str4.equals("V_AV1")) {
                        c2 = 2;
                        break;
                    }
                case 82338133:
                    if (str4.equals("V_VP8")) {
                        c2 = 0;
                        break;
                    }
                case 82338134:
                    if (str4.equals("V_VP9")) {
                        c2 = 1;
                        break;
                    }
                case 99146302:
                    if (str4.equals("S_HDMV/PGS")) {
                        c2 = 28;
                        break;
                    }
                case 444813526:
                    if (str4.equals("V_THEORA")) {
                        c2 = 10;
                        break;
                    }
                case 542569478:
                    if (str4.equals("A_DTS/EXPRESS")) {
                        c2 = 20;
                        break;
                    }
                case 725957860:
                    if (str4.equals("A_PCM/INT/LIT")) {
                        c2 = 24;
                        break;
                    }
                case 738597099:
                    if (str4.equals("S_TEXT/ASS")) {
                        c2 = 26;
                        break;
                    }
                case 855502857:
                    if (str4.equals("V_MPEGH/ISO/HEVC")) {
                        c2 = 8;
                        break;
                    }
                case 1422270023:
                    if (str4.equals("S_TEXT/UTF8")) {
                        c2 = 25;
                        break;
                    }
                case 1809237540:
                    if (str4.equals("V_MPEG2")) {
                        c2 = 3;
                        break;
                    }
                case 1950749482:
                    if (str4.equals("A_EAC3")) {
                        c2 = 17;
                        break;
                    }
                case 1950789798:
                    if (str4.equals("A_FLAC")) {
                        c2 = 22;
                        break;
                    }
                case 1951062397:
                    if (str4.equals("A_OPUS")) {
                        c2 = 12;
                        break;
                    }
                default:
                    c2 = 65535;
                    break;
            }
            String str5 = "application/vobsub";
            String str6 = "text/x-ssa";
            String str7 = "application/x-subrip";
            String str8 = "audio/raw";
            String str9 = "MatroskaExtractor";
            String str10 = "audio/x-unknown";
            ColorInfo colorInfo = null;
            switch (c2) {
                case 0:
                    str2 = "video/x-vnd.on2.vp8";
                    break;
                case 1:
                    str2 = "video/x-vnd.on2.vp9";
                    break;
                case 2:
                    str2 = "video/av01";
                    break;
                case 3:
                    str2 = "video/mpeg2";
                    break;
                case 4:
                case 5:
                case 6:
                    byte[] bArr = this.i;
                    if (bArr == null) {
                        list2 = null;
                    } else {
                        list2 = Collections.singletonList(bArr);
                    }
                    str3 = "video/mp4v-es";
                    break;
                case 7:
                    h a2 = h.a(new Pq(this.i));
                    list = a2.a;
                    this.V = a2.b;
                    str2 = "video/avc";
                    break;
                case 8:
                    l a3 = l.a(new Pq(this.i));
                    list = a3.a;
                    this.V = a3.b;
                    str2 = "video/hevc";
                    break;
                case 9:
                    Pair a4 = a(new Pq(this.i));
                    str3 = (String) a4.first;
                    list2 = (List) a4.second;
                    break;
                case 10:
                    str2 = "video/x-unknown";
                    break;
                case 11:
                    list = a(this.i);
                    str = "audio/vorbis";
                    i3 = 8192;
                    break;
                case 12:
                    List arrayList = new ArrayList(3);
                    arrayList.add(this.i);
                    arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(this.O).array());
                    arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(this.P).array());
                    str = "audio/opus";
                    list = arrayList;
                    i3 = 5760;
                    break;
                case 13:
                    list2 = Collections.singletonList(this.i);
                    str3 = "audio/mp4a-latm";
                    break;
                case 14:
                    str = "audio/mpeg-L2";
                    break;
                case 15:
                    str = "audio/mpeg";
                    break;
                case 16:
                    str2 = "audio/ac3";
                    break;
                case 17:
                    str2 = "audio/eac3";
                    break;
                case 18:
                    this.Q = new c();
                    str2 = "audio/true-hd";
                    break;
                case 19:
                case 20:
                    str2 = "audio/vnd.dts";
                    break;
                case 21:
                    str2 = "audio/vnd.dts.hd";
                    break;
                case 22:
                    list2 = Collections.singletonList(this.i);
                    str3 = "audio/flac";
                    break;
                case 23:
                    if (!b(new Pq(this.i))) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Non-PCM MS/ACM is unsupported. Setting mimeType to ");
                        sb.append(str10);
                        Iq.d(str9, sb.toString());
                        break;
                    } else {
                        c3 = C0471ar.c(this.M);
                        if (c3 == 0) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("Unsupported PCM bit depth: ");
                            sb2.append(this.M);
                            sb2.append(". Setting mimeType to ");
                            sb2.append(str10);
                            Iq.d(str9, sb2.toString());
                            break;
                        }
                    }
                    break;
                case 24:
                    c3 = C0471ar.c(this.M);
                    if (c3 == 0) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("Unsupported PCM bit depth: ");
                        sb3.append(this.M);
                        sb3.append(". Setting mimeType to ");
                        sb3.append(str10);
                        Iq.d(str9, sb3.toString());
                        break;
                    }
                    break;
                case 25:
                    str2 = str7;
                    break;
                case 26:
                    str2 = str6;
                    break;
                case 27:
                    list = Collections.singletonList(this.i);
                    str2 = str5;
                    break;
                case 28:
                    str2 = "application/pgs";
                    break;
                case 29:
                    byte[] bArr2 = this.i;
                    list2 = Collections.singletonList(new byte[]{bArr2[0], bArr2[1], bArr2[2], bArr2[3]});
                    str3 = "application/dvbsubs";
                    break;
                default:
                    throw new H("Unrecognized codec identifier.");
            }
        }

        private static boolean b(Pq pq) throws H {
            try {
                int o2 = pq.o();
                boolean z2 = true;
                if (o2 == 1) {
                    return true;
                }
                if (o2 != 65534) {
                    return false;
                }
                pq.e(24);
                if (!(pq.p() == C1879yn.g.getMostSignificantBits() && pq.p() == C1879yn.g.getLeastSignificantBits())) {
                    z2 = false;
                }
                return z2;
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw new H("Error parsing MS/ACM codec private");
            }
        }

        public void a() {
            c cVar = this.Q;
            if (cVar != null) {
                cVar.a(this);
            }
        }

        private static Pair<String, List<byte[]>> a(Pq pq) throws H {
            try {
                pq.f(16);
                long m2 = pq.m();
                if (m2 == 1482049860) {
                    return new Pair<>("video/divx", null);
                }
                if (m2 == 859189832) {
                    return new Pair<>("video/3gpp", null);
                }
                if (m2 == 826496599) {
                    byte[] bArr = pq.a;
                    for (int c2 = pq.c() + 20; c2 < bArr.length - 4; c2++) {
                        if (bArr[c2] == 0 && bArr[c2 + 1] == 0 && bArr[c2 + 2] == 1 && bArr[c2 + 3] == 15) {
                            return new Pair<>("video/wvc1", Collections.singletonList(Arrays.copyOfRange(bArr, c2, bArr.length)));
                        }
                    }
                    throw new H("Failed to find FourCC VC1 initialization data");
                }
                Iq.d("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
                return new Pair<>("video/x-unknown", null);
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw new H("Error parsing FourCC private data");
            }
        }

        private static List<byte[]> a(byte[] bArr) throws H {
            String str = "Error parsing vorbis codec private";
            try {
                if (bArr[0] == 2) {
                    int i2 = 1;
                    int i3 = 0;
                    while (bArr[i2] == -1) {
                        i3 += 255;
                        i2++;
                    }
                    int i4 = i2 + 1;
                    int i5 = i3 + bArr[i2];
                    int i6 = 0;
                    while (bArr[i4] == -1) {
                        i6 += 255;
                        i4++;
                    }
                    int i7 = i4 + 1;
                    int i8 = i6 + bArr[i4];
                    if (bArr[i7] == 1) {
                        byte[] bArr2 = new byte[i5];
                        System.arraycopy(bArr, i7, bArr2, 0, i5);
                        int i9 = i7 + i5;
                        if (bArr[i9] == 3) {
                            int i10 = i9 + i8;
                            if (bArr[i10] == 5) {
                                byte[] bArr3 = new byte[(bArr.length - i10)];
                                System.arraycopy(bArr, i10, bArr3, 0, bArr.length - i10);
                                ArrayList arrayList = new ArrayList(2);
                                arrayList.add(bArr2);
                                arrayList.add(bArr3);
                                return arrayList;
                            }
                            throw new H(str);
                        }
                        throw new H(str);
                    }
                    throw new H(str);
                }
                throw new H(str);
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw new H(str);
            }
        }
    }

    /* renamed from: yn$c */
    /* compiled from: MatroskaExtractor */
    private static final class c {
        private final byte[] a = new byte[10];
        private boolean b;
        private int c;
        private int d;
        private long e;
        private int f;

        public void a() {
            this.b = false;
        }

        public void a(C0313an anVar, int i, int i2) throws IOException, InterruptedException {
            if (!this.b) {
                anVar.a(this.a, 0, 10);
                anVar.a();
                if (C1362hm.b(this.a) != 0) {
                    this.b = true;
                    this.c = 0;
                } else {
                    return;
                }
            }
            if (this.c == 0) {
                this.f = i;
                this.d = 0;
            }
            this.d += i2;
        }

        public void a(b bVar, long j) {
            if (this.b) {
                int i = this.c;
                this.c = i + 1;
                if (i == 0) {
                    this.e = j;
                }
                if (this.c >= 16) {
                    bVar.U.a(this.e, this.f, this.d, 0, bVar.h);
                    this.c = 0;
                }
            }
        }

        public void a(b bVar) {
            if (this.b && this.c > 0) {
                bVar.U.a(this.e, this.f, this.d, 0, bVar.h);
                this.c = 0;
            }
        }
    }

    public C1879yn() {
        this(0);
    }

    static /* synthetic */ _m[] c() {
        return new _m[]{new C1879yn()};
    }

    private C1363hn d() {
        if (!(this.w == -1 || this.z == -9223372036854775807L)) {
            Jq jq = this.I;
            if (!(jq == null || jq.a() == 0)) {
                Jq jq2 = this.J;
                if (jq2 != null && jq2.a() == this.I.a()) {
                    int a2 = this.I.a();
                    int[] iArr = new int[a2];
                    long[] jArr = new long[a2];
                    long[] jArr2 = new long[a2];
                    long[] jArr3 = new long[a2];
                    int i2 = 0;
                    for (int i3 = 0; i3 < a2; i3++) {
                        jArr3[i3] = this.I.a(i3);
                        jArr[i3] = this.w + this.J.a(i3);
                    }
                    while (true) {
                        int i4 = a2 - 1;
                        if (i2 < i4) {
                            int i5 = i2 + 1;
                            iArr[i2] = (int) (jArr[i5] - jArr[i2]);
                            jArr2[i2] = jArr3[i5] - jArr3[i2];
                            i2 = i5;
                        } else {
                            iArr[i4] = (int) ((this.w + this.v) - jArr[i4]);
                            jArr2[i4] = this.z - jArr3[i4];
                            this.I = null;
                            this.J = null;
                            return new Vm(iArr, jArr, jArr2, jArr3);
                        }
                    }
                }
            }
        }
        this.I = null;
        this.J = null;
        return new defpackage.C1363hn.b(this.z);
    }

    private void e() {
        this.U = 0;
        this.ca = 0;
        this.ba = 0;
        this.V = false;
        this.W = false;
        this.Y = false;
        this.aa = 0;
        this.Z = 0;
        this.X = false;
        this.q.B();
    }

    /* access modifiers changed from: protected */
    public int b(int i2) {
        switch (i2) {
            case 131:
            case 136:
            case 155:
            case 159:
            case 176:
            case 179:
            case 186:
            case 215:
            case AdType.BRANDED_ON_DEMAND_PRE_ROLL /*231*/:
            case 241:
            case 251:
            case 16980:
            case 17029:
            case 17143:
            case 18401:
            case 18408:
            case 20529:
            case 20530:
            case 21420:
            case 21432:
            case 21680:
            case 21682:
            case 21690:
            case 21930:
            case 21945:
            case 21946:
            case 21947:
            case 21948:
            case 21949:
            case 22186:
            case 22203:
            case 25188:
            case 30321:
            case 2352003:
            case 2807729:
                return 2;
            case 134:
            case 17026:
            case 21358:
            case 2274716:
                return 3;
            case 160:
            case 174:
            case 183:
            case 187:
            case 224:
            case 225:
            case 18407:
            case 19899:
            case 20532:
            case 20533:
            case 21936:
            case 21968:
            case 25152:
            case 28032:
            case 30320:
            case 290298740:
            case 357149030:
            case 374648427:
            case 408125543:
            case 440786851:
            case 475249515:
            case 524531317:
                return 1;
            case 161:
            case 163:
            case 16981:
            case 18402:
            case 21419:
            case 25506:
            case 30322:
                return 4;
            case 181:
            case 17545:
            case 21969:
            case 21970:
            case 21971:
            case 21972:
            case 21973:
            case 21974:
            case 21975:
            case 21976:
            case 21977:
            case 21978:
            case 30323:
            case 30324:
            case 30325:
                return 5;
            default:
                return 0;
        }
    }

    /* access modifiers changed from: protected */
    public boolean c(int i2) {
        return i2 == 357149030 || i2 == 524531317 || i2 == 475249515 || i2 == 374648427;
    }

    public final void release() {
    }

    public C1879yn(int i2) {
        this(new C1759un(), i2);
    }

    public final boolean a(C0313an anVar) throws IOException, InterruptedException {
        return new C1909zn().a(anVar);
    }

    C1879yn(C1819wn wnVar, int i2) {
        this.w = -1;
        this.x = -9223372036854775807L;
        this.y = -9223372036854775807L;
        this.z = -9223372036854775807L;
        this.F = -1;
        this.G = -1;
        this.H = -9223372036854775807L;
        this.h = wnVar;
        this.h.a((C1789vn) new a());
        boolean z2 = true;
        if ((i2 & 1) != 0) {
            z2 = false;
        }
        this.k = z2;
        this.i = new An();
        this.j = new SparseArray<>();
        this.n = new Pq(4);
        this.o = new Pq(ByteBuffer.allocate(4).putInt(-1).array());
        this.p = new Pq(4);
        this.l = new Pq(Mq.a);
        this.m = new Pq(4);
        this.q = new Pq();
        this.r = new Pq();
        this.s = new Pq(8);
        this.t = new Pq();
    }

    public final void a(C0498bn bnVar) {
        this.fa = bnVar;
    }

    public void a(long j2, long j3) {
        this.H = -9223372036854775807L;
        this.L = 0;
        this.h.reset();
        this.i.b();
        e();
        for (int i2 = 0; i2 < this.j.size(); i2++) {
            ((b) this.j.valueAt(i2)).b();
        }
    }

    public final int a(C0313an anVar, C1332gn gnVar) throws IOException, InterruptedException {
        this.da = false;
        boolean z2 = true;
        while (z2 && !this.da) {
            z2 = this.h.a(anVar);
            if (z2 && a(gnVar, anVar.getPosition())) {
                return 1;
            }
        }
        if (z2) {
            return 0;
        }
        for (int i2 = 0; i2 < this.j.size(); i2++) {
            ((b) this.j.valueAt(i2)).a();
        }
        return -1;
    }

    /* access modifiers changed from: protected */
    public void a(int i2, long j2, long j3) throws H {
        if (i2 == 160) {
            this.ea = false;
        } else if (i2 == 174) {
            this.A = new b();
        } else if (i2 == 187) {
            this.K = false;
        } else if (i2 == 19899) {
            this.C = -1;
            this.D = -1;
        } else if (i2 == 20533) {
            this.A.f = true;
        } else if (i2 == 21968) {
            this.A.v = true;
        } else if (i2 == 25152) {
        } else {
            if (i2 == 408125543) {
                long j4 = this.w;
                if (j4 == -1 || j4 == j2) {
                    this.w = j2;
                    this.v = j3;
                    return;
                }
                throw new H("Multiple Segment elements not supported");
            } else if (i2 == 475249515) {
                this.I = new Jq();
                this.J = new Jq();
            } else if (i2 != 524531317 || this.B) {
            } else {
                if (!this.k || this.F == -1) {
                    this.fa.a(new defpackage.C1363hn.b(this.z));
                    this.B = true;
                    return;
                }
                this.E = true;
            }
        }
    }

    /* access modifiers changed from: protected */
    public void a(int i2) throws H {
        if (i2 != 160) {
            if (i2 == 174) {
                if (a(this.A.b)) {
                    b bVar = this.A;
                    bVar.a(this.fa, bVar.c);
                    SparseArray<b> sparseArray = this.j;
                    b bVar2 = this.A;
                    sparseArray.put(bVar2.c, bVar2);
                }
                this.A = null;
            } else if (i2 == 19899) {
                int i3 = this.C;
                if (i3 != -1) {
                    long j2 = this.D;
                    if (j2 != -1) {
                        if (i3 == 475249515) {
                            this.F = j2;
                        }
                    }
                }
                throw new H("Mandatory element SeekID or SeekPosition not found");
            } else if (i2 == 25152) {
                b bVar3 = this.A;
                if (bVar3.f) {
                    defpackage.C1424jn.a aVar = bVar3.h;
                    if (aVar != null) {
                        bVar3.j = new DrmInitData(new SchemeData(C0615o.a, "video/webm", aVar.b));
                    } else {
                        throw new H("Encrypted Track found but ContentEncKeyID was not found");
                    }
                }
            } else if (i2 == 28032) {
                b bVar4 = this.A;
                if (bVar4.f && bVar4.g != null) {
                    throw new H("Combining encryption and compression is not supported");
                }
            } else if (i2 == 357149030) {
                if (this.x == -9223372036854775807L) {
                    this.x = 1000000;
                }
                long j3 = this.y;
                if (j3 != -9223372036854775807L) {
                    this.z = a(j3);
                }
            } else if (i2 != 374648427) {
                if (i2 == 475249515 && !this.B) {
                    this.fa.a(d());
                    this.B = true;
                }
            } else if (this.j.size() != 0) {
                this.fa.g();
            } else {
                throw new H("No valid tracks were found");
            }
        } else if (this.L == 2) {
            if (!this.ea) {
                this.T |= 1;
            }
            a((b) this.j.get(this.R), this.M);
            this.L = 0;
        }
    }

    /* access modifiers changed from: protected */
    public void a(int i2, long j2) throws H {
        String str = " not supported";
        if (i2 != 20529) {
            if (i2 != 20530) {
                boolean z2 = false;
                switch (i2) {
                    case 131:
                        this.A.d = (int) j2;
                        return;
                    case 136:
                        b bVar = this.A;
                        if (j2 == 1) {
                            z2 = true;
                        }
                        bVar.S = z2;
                        return;
                    case 155:
                        this.N = a(j2);
                        return;
                    case 159:
                        this.A.L = (int) j2;
                        return;
                    case 176:
                        this.A.k = (int) j2;
                        return;
                    case 179:
                        this.I.a(a(j2));
                        return;
                    case 186:
                        this.A.l = (int) j2;
                        return;
                    case 215:
                        this.A.c = (int) j2;
                        return;
                    case AdType.BRANDED_ON_DEMAND_PRE_ROLL /*231*/:
                        this.H = a(j2);
                        return;
                    case 241:
                        if (!this.K) {
                            this.J.a(j2);
                            this.K = true;
                            return;
                        }
                        return;
                    case 251:
                        this.ea = true;
                        return;
                    case 16980:
                        if (j2 != 3) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("ContentCompAlgo ");
                            sb.append(j2);
                            sb.append(str);
                            throw new H(sb.toString());
                        }
                        return;
                    case 17029:
                        if (j2 < 1 || j2 > 2) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("DocTypeReadVersion ");
                            sb2.append(j2);
                            sb2.append(str);
                            throw new H(sb2.toString());
                        }
                        return;
                    case 17143:
                        if (j2 != 1) {
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append("EBMLReadVersion ");
                            sb3.append(j2);
                            sb3.append(str);
                            throw new H(sb3.toString());
                        }
                        return;
                    case 18401:
                        if (j2 != 5) {
                            StringBuilder sb4 = new StringBuilder();
                            sb4.append("ContentEncAlgo ");
                            sb4.append(j2);
                            sb4.append(str);
                            throw new H(sb4.toString());
                        }
                        return;
                    case 18408:
                        if (j2 != 1) {
                            StringBuilder sb5 = new StringBuilder();
                            sb5.append("AESSettingsCipherMode ");
                            sb5.append(j2);
                            sb5.append(str);
                            throw new H(sb5.toString());
                        }
                        return;
                    case 21420:
                        this.D = j2 + this.w;
                        return;
                    case 21432:
                        int i3 = (int) j2;
                        if (i3 == 0) {
                            this.A.u = 0;
                            return;
                        } else if (i3 == 1) {
                            this.A.u = 2;
                            return;
                        } else if (i3 == 3) {
                            this.A.u = 1;
                            return;
                        } else if (i3 == 15) {
                            this.A.u = 3;
                            return;
                        } else {
                            return;
                        }
                    case 21680:
                        this.A.m = (int) j2;
                        return;
                    case 21682:
                        this.A.o = (int) j2;
                        return;
                    case 21690:
                        this.A.n = (int) j2;
                        return;
                    case 21930:
                        b bVar2 = this.A;
                        if (j2 == 1) {
                            z2 = true;
                        }
                        bVar2.R = z2;
                        return;
                    case 22186:
                        this.A.O = j2;
                        return;
                    case 22203:
                        this.A.P = j2;
                        return;
                    case 25188:
                        this.A.M = (int) j2;
                        return;
                    case 30321:
                        int i4 = (int) j2;
                        if (i4 == 0) {
                            this.A.p = 0;
                            return;
                        } else if (i4 == 1) {
                            this.A.p = 1;
                            return;
                        } else if (i4 == 2) {
                            this.A.p = 2;
                            return;
                        } else if (i4 == 3) {
                            this.A.p = 3;
                            return;
                        } else {
                            return;
                        }
                    case 2352003:
                        this.A.e = (int) j2;
                        return;
                    case 2807729:
                        this.x = j2;
                        return;
                    default:
                        switch (i2) {
                            case 21945:
                                int i5 = (int) j2;
                                if (i5 == 1) {
                                    this.A.y = 2;
                                    return;
                                } else if (i5 == 2) {
                                    this.A.y = 1;
                                    return;
                                } else {
                                    return;
                                }
                            case 21946:
                                int i6 = (int) j2;
                                if (i6 != 1) {
                                    if (i6 == 16) {
                                        this.A.x = 6;
                                        return;
                                    } else if (i6 == 18) {
                                        this.A.x = 7;
                                        return;
                                    } else if (!(i6 == 6 || i6 == 7)) {
                                        return;
                                    }
                                }
                                this.A.x = 3;
                                return;
                            case 21947:
                                b bVar3 = this.A;
                                bVar3.v = true;
                                int i7 = (int) j2;
                                if (i7 == 1) {
                                    bVar3.w = 1;
                                    return;
                                } else if (i7 == 9) {
                                    bVar3.w = 6;
                                    return;
                                } else if (i7 == 4 || i7 == 5 || i7 == 6 || i7 == 7) {
                                    this.A.w = 2;
                                    return;
                                } else {
                                    return;
                                }
                            case 21948:
                                this.A.z = (int) j2;
                                return;
                            case 21949:
                                this.A.A = (int) j2;
                                return;
                            default:
                                return;
                        }
                }
            } else if (j2 != 1) {
                StringBuilder sb6 = new StringBuilder();
                sb6.append("ContentEncodingScope ");
                sb6.append(j2);
                sb6.append(str);
                throw new H(sb6.toString());
            }
        } else if (j2 != 0) {
            StringBuilder sb7 = new StringBuilder();
            sb7.append("ContentEncodingOrder ");
            sb7.append(j2);
            sb7.append(str);
            throw new H(sb7.toString());
        }
    }

    /* access modifiers changed from: protected */
    public void a(int i2, double d2) throws H {
        if (i2 == 181) {
            this.A.N = (int) d2;
        } else if (i2 != 17545) {
            switch (i2) {
                case 21969:
                    this.A.B = (float) d2;
                    return;
                case 21970:
                    this.A.C = (float) d2;
                    return;
                case 21971:
                    this.A.D = (float) d2;
                    return;
                case 21972:
                    this.A.E = (float) d2;
                    return;
                case 21973:
                    this.A.F = (float) d2;
                    return;
                case 21974:
                    this.A.G = (float) d2;
                    return;
                case 21975:
                    this.A.H = (float) d2;
                    return;
                case 21976:
                    this.A.I = (float) d2;
                    return;
                case 21977:
                    this.A.J = (float) d2;
                    return;
                case 21978:
                    this.A.K = (float) d2;
                    return;
                default:
                    switch (i2) {
                        case 30323:
                            this.A.q = (float) d2;
                            return;
                        case 30324:
                            this.A.r = (float) d2;
                            return;
                        case 30325:
                            this.A.s = (float) d2;
                            return;
                        default:
                            return;
                    }
            }
        } else {
            this.y = (long) d2;
        }
    }

    /* access modifiers changed from: protected */
    public void a(int i2, String str) throws H {
        if (i2 == 134) {
            this.A.b = str;
        } else if (i2 != 17026) {
            if (i2 == 21358) {
                this.A.a = str;
            } else if (i2 == 2274716) {
                this.A.T = str;
            }
        } else if (!"webm".equals(str) && !"matroska".equals(str)) {
            StringBuilder sb = new StringBuilder();
            sb.append("DocType ");
            sb.append(str);
            sb.append(" not supported");
            throw new H(sb.toString());
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x01fd, code lost:
        throw new com.google.android.exoplayer2.H("EBML lacing sample size out of range.");
     */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0234  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0236  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0250  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0253  */
    public void a(int i2, int i3, C0313an anVar) throws IOException, InterruptedException {
        char c2;
        int i4;
        byte b2;
        int[] iArr;
        int i5 = i2;
        int i6 = i3;
        C0313an anVar2 = anVar;
        int i7 = 0;
        int i8 = 1;
        if (i5 == 161 || i5 == 163) {
            if (this.L == 0) {
                this.R = (int) this.i.a(anVar2, false, true, 8);
                this.S = this.i.a();
                this.N = -9223372036854775807L;
                this.L = 1;
                this.n.B();
            }
            b bVar = (b) this.j.get(this.R);
            if (bVar == null) {
                anVar2.c(i6 - this.S);
                this.L = 0;
                return;
            }
            if (this.L == 1) {
                a(anVar2, 3);
                int i9 = (this.n.a[2] & 6) >> 1;
                byte b3 = 255;
                if (i9 == 0) {
                    this.P = 1;
                    this.Q = a(this.Q, 1);
                    this.Q[0] = (i6 - this.S) - 3;
                } else if (i5 == 163) {
                    a(anVar2, 4);
                    this.P = (this.n.a[3] & 255) + 1;
                    this.Q = a(this.Q, this.P);
                    if (i9 == 2) {
                        int i10 = (i6 - this.S) - 4;
                        int i11 = this.P;
                        Arrays.fill(this.Q, 0, i11, i10 / i11);
                    } else if (i9 == 1) {
                        int i12 = 0;
                        int i13 = 4;
                        int i14 = 0;
                        while (true) {
                            i4 = this.P;
                            if (i12 >= i4 - 1) {
                                break;
                            }
                            this.Q[i12] = 0;
                            do {
                                i13++;
                                a(anVar2, i13);
                                b2 = this.n.a[i13 - 1] & 255;
                                iArr = this.Q;
                                iArr[i12] = iArr[i12] + b2;
                            } while (b2 == 255);
                            i14 += iArr[i12];
                            i12++;
                        }
                        this.Q[i4 - 1] = ((i6 - this.S) - i13) - i14;
                    } else if (i9 == 3) {
                        int i15 = 0;
                        int i16 = 4;
                        int i17 = 0;
                        while (true) {
                            int i18 = this.P;
                            if (i15 >= i18 - 1) {
                                c2 = 1;
                                this.Q[i18 - 1] = ((i6 - this.S) - i16) - i17;
                                break;
                            }
                            this.Q[i15] = i7;
                            i16++;
                            a(anVar2, i16);
                            int i19 = i16 - 1;
                            if (this.n.a[i19] != 0) {
                                long j2 = 0;
                                int i20 = 0;
                                while (true) {
                                    if (i20 >= 8) {
                                        break;
                                    }
                                    int i21 = i8 << (7 - i20);
                                    if ((this.n.a[i19] & i21) != 0) {
                                        i16 += i20;
                                        a(anVar2, i16);
                                        long j3 = (long) ((~i21) & this.n.a[i19] & b3);
                                        int i22 = i19 + 1;
                                        while (true) {
                                            j2 = j3;
                                            if (i22 >= i16) {
                                                break;
                                            }
                                            j3 = (j2 << 8) | ((long) (this.n.a[i22] & b3));
                                            i22++;
                                            b3 = 255;
                                        }
                                        if (i15 > 0) {
                                            j2 -= (1 << ((i20 * 7) + 6)) - 1;
                                        }
                                    } else {
                                        i20++;
                                        i8 = 1;
                                        b3 = 255;
                                    }
                                }
                                long j4 = j2;
                                if (j4 >= -2147483648L && j4 <= 2147483647L) {
                                    int i23 = (int) j4;
                                    int[] iArr2 = this.Q;
                                    if (i15 != 0) {
                                        i23 += iArr2[i15 - 1];
                                    }
                                    iArr2[i15] = i23;
                                    i17 += this.Q[i15];
                                    i15++;
                                    i7 = 0;
                                    i8 = 1;
                                    b3 = 255;
                                }
                            } else {
                                throw new H("No valid varint length mask found");
                            }
                        }
                        byte[] bArr = this.n.a;
                        this.M = this.H + a((long) ((bArr[c2] & 255) | (bArr[0] << 8)));
                        this.T = ((bVar.d != 2 || (i5 == 163 && (this.n.a[2] & 128) == 128)) ? 1 : 0) | (!((this.n.a[2] & 8) != 8) ? Integer.MIN_VALUE : 0);
                        this.L = 2;
                        this.O = 0;
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Unexpected lacing value: ");
                        sb.append(i9);
                        throw new H(sb.toString());
                    }
                } else {
                    throw new H("Lacing only supported in SimpleBlocks.");
                }
                c2 = 1;
                byte[] bArr2 = this.n.a;
                this.M = this.H + a((long) ((bArr2[c2] & 255) | (bArr2[0] << 8)));
                if ((this.n.a[2] & 8) != 8) {
                }
                this.T = ((bVar.d != 2 || (i5 == 163 && (this.n.a[2] & 128) == 128)) ? 1 : 0) | (!((this.n.a[2] & 8) != 8) ? Integer.MIN_VALUE : 0);
                this.L = 2;
                this.O = 0;
            }
            if (i5 == 163) {
                while (true) {
                    int i24 = this.O;
                    if (i24 >= this.P) {
                        break;
                    }
                    a(anVar2, bVar, this.Q[i24]);
                    a(bVar, this.M + ((long) ((this.O * bVar.e) / 1000)));
                    this.O++;
                }
                this.L = 0;
            } else {
                a(anVar2, bVar, this.Q[0]);
            }
        } else if (i5 == 16981) {
            b bVar2 = this.A;
            bVar2.g = new byte[i6];
            anVar2.readFully(bVar2.g, 0, i6);
        } else if (i5 == 18402) {
            byte[] bArr3 = new byte[i6];
            anVar2.readFully(bArr3, 0, i6);
            this.A.h = new defpackage.C1424jn.a(1, bArr3, 0, 0);
        } else if (i5 == 21419) {
            Arrays.fill(this.p.a, 0);
            anVar2.readFully(this.p.a, 4 - i6, i6);
            this.p.e(0);
            this.C = (int) this.p.v();
        } else if (i5 == 25506) {
            b bVar3 = this.A;
            bVar3.i = new byte[i6];
            anVar2.readFully(bVar3.i, 0, i6);
        } else if (i5 == 30322) {
            b bVar4 = this.A;
            bVar4.t = new byte[i6];
            anVar2.readFully(bVar4.t, 0, i6);
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Unexpected id: ");
            sb2.append(i5);
            throw new H(sb2.toString());
        }
    }

    private void a(b bVar, long j2) {
        b bVar2 = bVar;
        c cVar = bVar2.Q;
        if (cVar != null) {
            cVar.a(bVar2, j2);
        } else {
            long j3 = j2;
            if ("S_TEXT/UTF8".equals(bVar2.b)) {
                b bVar3 = bVar;
                a(bVar3, "%02d:%02d:%02d,%03d", 19, 1000, c);
            } else {
                if ("S_TEXT/ASS".equals(bVar2.b)) {
                    b bVar4 = bVar;
                    a(bVar4, "%01d:%02d:%02d:%02d", 21, 10000, f);
                }
            }
            bVar2.U.a(j2, this.T, this.ca, 0, bVar2.h);
        }
        this.da = true;
        e();
    }

    private void a(C0313an anVar, int i2) throws IOException, InterruptedException {
        if (this.n.d() < i2) {
            if (this.n.b() < i2) {
                Pq pq = this.n;
                byte[] bArr = pq.a;
                pq.a(Arrays.copyOf(bArr, Math.max(bArr.length * 2, i2)), this.n.d());
            }
            Pq pq2 = this.n;
            anVar.readFully(pq2.a, pq2.d(), i2 - this.n.d());
            this.n.d(i2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:82:0x01f4  */
    private void a(C0313an anVar, b bVar, int i2) throws IOException, InterruptedException {
        int i3;
        if ("S_TEXT/UTF8".equals(bVar.b)) {
            a(anVar, b, i2);
            return;
        }
        if ("S_TEXT/ASS".equals(bVar.b)) {
            a(anVar, e, i2);
            return;
        }
        C1424jn jnVar = bVar.U;
        boolean z2 = true;
        if (!this.V) {
            if (bVar.f) {
                this.T &= -1073741825;
                int i4 = 128;
                if (!this.W) {
                    anVar.readFully(this.n.a, 0, 1);
                    this.U++;
                    byte[] bArr = this.n.a;
                    if ((bArr[0] & 128) != 128) {
                        this.Z = bArr[0];
                        this.W = true;
                    } else {
                        throw new H("Extension bit is set in signal byte");
                    }
                }
                if ((this.Z & 1) == 1) {
                    boolean z3 = (this.Z & 2) == 2;
                    this.T |= 1073741824;
                    if (!this.X) {
                        anVar.readFully(this.s.a, 0, 8);
                        this.U += 8;
                        this.X = true;
                        byte[] bArr2 = this.n.a;
                        if (!z3) {
                            i4 = 0;
                        }
                        bArr2[0] = (byte) (i4 | 8);
                        this.n.e(0);
                        jnVar.a(this.n, 1);
                        this.ca++;
                        this.s.e(0);
                        jnVar.a(this.s, 8);
                        this.ca += 8;
                    }
                    if (z3) {
                        if (!this.Y) {
                            anVar.readFully(this.n.a, 0, 1);
                            this.U++;
                            this.n.e(0);
                            this.aa = this.n.t();
                            this.Y = true;
                        }
                        int i5 = this.aa * 4;
                        this.n.c(i5);
                        anVar.readFully(this.n.a, 0, i5);
                        this.U += i5;
                        short s2 = (short) ((this.aa / 2) + 1);
                        int i6 = (s2 * 6) + 2;
                        ByteBuffer byteBuffer = this.u;
                        if (byteBuffer == null || byteBuffer.capacity() < i6) {
                            this.u = ByteBuffer.allocate(i6);
                        }
                        this.u.position(0);
                        this.u.putShort(s2);
                        int i7 = 0;
                        int i8 = 0;
                        while (true) {
                            i3 = this.aa;
                            if (i7 >= i3) {
                                break;
                            }
                            int x2 = this.n.x();
                            if (i7 % 2 == 0) {
                                this.u.putShort((short) (x2 - i8));
                            } else {
                                this.u.putInt(x2 - i8);
                            }
                            i7++;
                            i8 = x2;
                        }
                        int i9 = (i2 - this.U) - i8;
                        if (i3 % 2 == 1) {
                            this.u.putInt(i9);
                        } else {
                            this.u.putShort((short) i9);
                            this.u.putInt(0);
                        }
                        this.t.a(this.u.array(), i6);
                        jnVar.a(this.t, i6);
                        this.ca += i6;
                    }
                }
            } else {
                byte[] bArr3 = bVar.g;
                if (bArr3 != null) {
                    this.q.a(bArr3, bArr3.length);
                }
            }
            this.V = true;
        }
        int d2 = i2 + this.q.d();
        if (!"V_MPEG4/ISO/AVC".equals(bVar.b)) {
            if (!"V_MPEGH/ISO/HEVC".equals(bVar.b)) {
                if (bVar.Q != null) {
                    if (this.q.d() != 0) {
                        z2 = false;
                    }
                    C1852xq.b(z2);
                    bVar.Q.a(anVar, this.T, d2);
                }
                while (true) {
                    int i10 = this.U;
                    if (i10 >= d2) {
                        break;
                    }
                    a(anVar, jnVar, d2 - i10);
                }
                if ("A_VORBIS".equals(bVar.b)) {
                    this.o.e(0);
                    jnVar.a(this.o, 4);
                    this.ca += 4;
                }
            }
        }
        byte[] bArr4 = this.m.a;
        bArr4[0] = 0;
        bArr4[1] = 0;
        bArr4[2] = 0;
        int i11 = bVar.V;
        int i12 = 4 - i11;
        while (this.U < d2) {
            int i13 = this.ba;
            if (i13 == 0) {
                a(anVar, bArr4, i12, i11);
                this.m.e(0);
                this.ba = this.m.x();
                this.l.e(0);
                jnVar.a(this.l, 4);
                this.ca += 4;
            } else {
                this.ba = i13 - a(anVar, jnVar, i13);
            }
        }
        if ("A_VORBIS".equals(bVar.b)) {
        }
    }

    private void a(C0313an anVar, byte[] bArr, int i2) throws IOException, InterruptedException {
        int length = bArr.length + i2;
        if (this.r.b() < length) {
            this.r.a = Arrays.copyOf(bArr, length + i2);
        } else {
            System.arraycopy(bArr, 0, this.r.a, 0, bArr.length);
        }
        anVar.readFully(this.r.a, bArr.length, i2);
        this.r.c(length);
    }

    private void a(b bVar, String str, int i2, long j2, byte[] bArr) {
        a(this.r.a, this.N, str, i2, j2, bArr);
        C1424jn jnVar = bVar.U;
        Pq pq = this.r;
        jnVar.a(pq, pq.d());
        this.ca += this.r.d();
    }

    private static void a(byte[] bArr, long j2, String str, int i2, long j3, byte[] bArr2) {
        byte[] bArr3;
        byte[] bArr4;
        if (j2 == -9223372036854775807L) {
            bArr4 = bArr2;
            bArr3 = bArr4;
        } else {
            int i3 = (int) (j2 / 3600000000L);
            long j4 = j2 - (((long) (i3 * 3600)) * 1000000);
            int i4 = (int) (j4 / 60000000);
            long j5 = j4 - (((long) (i4 * 60)) * 1000000);
            int i5 = (int) (j5 / 1000000);
            int i6 = (int) ((j5 - (((long) i5) * 1000000)) / j3);
            Object[] objArr = {Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6)};
            String str2 = str;
            bArr3 = C0471ar.c(String.format(Locale.US, str, objArr));
            bArr4 = bArr2;
        }
        byte[] bArr5 = bArr;
        int i7 = i2;
        System.arraycopy(bArr3, 0, bArr, i2, bArr4.length);
    }

    private void a(C0313an anVar, byte[] bArr, int i2, int i3) throws IOException, InterruptedException {
        int min = Math.min(i3, this.q.a());
        anVar.readFully(bArr, i2 + min, i3 - min);
        if (min > 0) {
            this.q.a(bArr, i2, min);
        }
        this.U += i3;
    }

    private int a(C0313an anVar, C1424jn jnVar, int i2) throws IOException, InterruptedException {
        int i3;
        int a2 = this.q.a();
        if (a2 > 0) {
            i3 = Math.min(i2, a2);
            jnVar.a(this.q, i3);
        } else {
            i3 = jnVar.a(anVar, i2, false);
        }
        this.U += i3;
        this.ca += i3;
        return i3;
    }

    private boolean a(C1332gn gnVar, long j2) {
        if (this.E) {
            this.G = j2;
            gnVar.a = this.F;
            this.E = false;
            return true;
        }
        if (this.B) {
            long j3 = this.G;
            if (j3 != -1) {
                gnVar.a = j3;
                this.G = -1;
                return true;
            }
        }
        return false;
    }

    private long a(long j2) throws H {
        long j3 = this.x;
        if (j3 != -9223372036854775807L) {
            return C0471ar.c(j2, j3, 1000);
        }
        throw new H("Can't scale timecode prior to timecodeScale being set.");
    }

    private static boolean a(String str) {
        return "V_VP8".equals(str) || "V_VP9".equals(str) || "V_AV1".equals(str) || "V_MPEG2".equals(str) || "V_MPEG4/ISO/SP".equals(str) || "V_MPEG4/ISO/ASP".equals(str) || "V_MPEG4/ISO/AP".equals(str) || "V_MPEG4/ISO/AVC".equals(str) || "V_MPEGH/ISO/HEVC".equals(str) || "V_MS/VFW/FOURCC".equals(str) || "V_THEORA".equals(str) || "A_OPUS".equals(str) || "A_VORBIS".equals(str) || "A_AAC".equals(str) || "A_MPEG/L2".equals(str) || "A_MPEG/L3".equals(str) || "A_AC3".equals(str) || "A_EAC3".equals(str) || "A_TRUEHD".equals(str) || "A_DTS".equals(str) || "A_DTS/EXPRESS".equals(str) || "A_DTS/LOSSLESS".equals(str) || "A_FLAC".equals(str) || "A_MS/ACM".equals(str) || "A_PCM/INT/LIT".equals(str) || "S_TEXT/UTF8".equals(str) || "S_TEXT/ASS".equals(str) || "S_VOBSUB".equals(str) || "S_HDMV/PGS".equals(str) || "S_DVBSUB".equals(str);
    }

    private static int[] a(int[] iArr, int i2) {
        if (iArr == null) {
            return new int[i2];
        }
        if (iArr.length >= i2) {
            return iArr;
        }
        return new int[Math.max(iArr.length * 2, i2)];
    }
}
