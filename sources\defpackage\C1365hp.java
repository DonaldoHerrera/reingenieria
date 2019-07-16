package defpackage;

import android.graphics.Color;
import android.text.Layout.Alignment;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import com.comscore.streaming.ContentType;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: hp reason: default package and case insensitive filesystem */
/* compiled from: Cea708Decoder */
public final class C1365hp extends C1457kp {
    private final Pq g = new Pq();
    private final Oq h = new Oq();
    private final int i;
    private final a[] j;
    private a k;
    private List<Uo> l;
    private List<Uo> m;
    private b n;
    private int o;

    /* renamed from: hp$a */
    /* compiled from: Cea708Decoder */
    private static final class a {
        public static final int a = a(2, 2, 2, 0);
        public static final int b = a(0, 0, 0, 0);
        public static final int c = a(0, 0, 0, 3);
        private static final int[] d = {0, 0, 0, 0, 0, 2, 0};
        private static final int[] e = {0, 0, 0, 0, 0, 0, 2};
        private static final int[] f = {3, 3, 3, 3, 3, 3, 1};
        private static final boolean[] g = {false, false, false, true, true, true, false};
        private static final int[] h;
        private static final int[] i = {0, 1, 2, 3, 4, 3, 4};
        private static final int[] j = {0, 0, 0, 0, 0, 3, 3};
        private static final int[] k;
        private int A;
        private int B;
        private int C;
        private int D;
        private int E;
        private int F;
        private int G;
        private final List<SpannableString> l = new ArrayList();
        private final SpannableStringBuilder m = new SpannableStringBuilder();
        private boolean n;
        private boolean o;
        private int p;
        private boolean q;
        private int r;
        private int s;
        private int t;
        private int u;
        private boolean v;
        private int w;
        private int x;
        private int y;
        private int z;

        static {
            int i2 = b;
            int i3 = c;
            h = new int[]{i2, i3, i2, i2, i3, i2, i2};
            k = new int[]{i2, i2, i2, i2, i2, i3, i3};
        }

        public a() {
            h();
        }

        public void a(boolean z2) {
            this.o = z2;
        }

        public void b(int i2, int i3, int i4) {
            if (this.C != -1) {
                int i5 = this.D;
                if (i5 != i2) {
                    this.m.setSpan(new ForegroundColorSpan(i5), this.C, this.m.length(), 33);
                }
            }
            if (i2 != a) {
                this.C = this.m.length();
                this.D = i2;
            }
            if (this.E != -1) {
                int i6 = this.F;
                if (i6 != i3) {
                    this.m.setSpan(new BackgroundColorSpan(i6), this.E, this.m.length(), 33);
                }
            }
            if (i3 != b) {
                this.E = this.m.length();
                this.F = i3;
            }
        }

        public SpannableString c() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.m);
            int length = spannableStringBuilder.length();
            if (length > 0) {
                if (this.A != -1) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), this.A, length, 33);
                }
                if (this.B != -1) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), this.B, length, 33);
                }
                if (this.C != -1) {
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(this.D), this.C, length, 33);
                }
                if (this.E != -1) {
                    spannableStringBuilder.setSpan(new BackgroundColorSpan(this.F), this.E, length, 33);
                }
            }
            return new SpannableString(spannableStringBuilder);
        }

        public void d() {
            this.l.clear();
            this.m.clear();
            this.A = -1;
            this.B = -1;
            this.C = -1;
            this.E = -1;
            this.G = 0;
        }

        public boolean e() {
            return this.n;
        }

        public boolean f() {
            return !e() || (this.l.isEmpty() && this.m.length() == 0);
        }

        public boolean g() {
            return this.o;
        }

        public void h() {
            d();
            this.n = false;
            this.o = false;
            this.p = 4;
            this.q = false;
            this.r = 0;
            this.s = 0;
            this.t = 0;
            this.u = 15;
            this.v = true;
            this.w = 0;
            this.x = 0;
            this.y = 0;
            int i2 = b;
            this.z = i2;
            this.D = a;
            this.F = i2;
        }

        public void a(boolean z2, boolean z3, boolean z4, int i2, boolean z5, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
            boolean z6 = z3;
            int i10 = i8;
            int i11 = i9;
            this.n = true;
            this.o = z2;
            this.v = z6;
            this.p = i2;
            this.q = z5;
            this.r = i3;
            this.s = i4;
            this.t = i7;
            int i12 = i5 + 1;
            if (this.u != i12) {
                this.u = i12;
                while (true) {
                    if ((!z6 || this.l.size() < this.u) && this.l.size() < 15) {
                        break;
                    }
                    this.l.remove(0);
                }
            }
            if (!(i10 == 0 || this.x == i10)) {
                this.x = i10;
                int i13 = i10 - 1;
                a(h[i13], c, g[i13], 0, e[i13], f[i13], d[i13]);
            }
            if (i11 != 0 && this.y != i11) {
                this.y = i11;
                int i14 = i11 - 1;
                a(0, 1, 1, false, false, j[i14], i[i14]);
                b(a, k[i14], b);
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:20:0x0065  */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x0070  */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x0091  */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x0093  */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x009f  */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x00a1  */
        /* JADX WARNING: Removed duplicated region for block: B:38:0x00ad  */
        public C1334gp b() {
            Alignment alignment;
            float f2;
            float f3;
            if (f()) {
                return null;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            boolean z2 = false;
            for (int i2 = 0; i2 < this.l.size(); i2++) {
                spannableStringBuilder.append((CharSequence) this.l.get(i2));
                spannableStringBuilder.append(10);
            }
            spannableStringBuilder.append(c());
            int i3 = this.w;
            if (i3 != 0) {
                if (i3 == 1) {
                    alignment = Alignment.ALIGN_OPPOSITE;
                } else if (i3 == 2) {
                    alignment = Alignment.ALIGN_CENTER;
                } else if (i3 != 3) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Unexpected justification value: ");
                    sb.append(this.w);
                    throw new IllegalArgumentException(sb.toString());
                }
                Alignment alignment2 = alignment;
                if (!this.q) {
                    f3 = ((float) this.s) / 99.0f;
                    f2 = ((float) this.r) / 99.0f;
                } else {
                    f3 = ((float) this.s) / 209.0f;
                    f2 = ((float) this.r) / 74.0f;
                }
                float f4 = (f3 * 0.9f) + 0.05f;
                float f5 = (f2 * 0.9f) + 0.05f;
                int i4 = this.t;
                int i5 = i4 % 3 != 0 ? 0 : i4 % 3 == 1 ? 1 : 2;
                int i6 = this.t;
                int i7 = i6 / 3 != 0 ? 0 : i6 / 3 == 1 ? 1 : 2;
                if (this.z != b) {
                    z2 = true;
                }
                C1334gp gpVar = new C1334gp(spannableStringBuilder, alignment2, f5, 0, i5, f4, i7, Float.MIN_VALUE, z2, this.z, this.p);
                return gpVar;
            }
            alignment = Alignment.ALIGN_NORMAL;
            Alignment alignment22 = alignment;
            if (!this.q) {
            }
            float f42 = (f3 * 0.9f) + 0.05f;
            float f52 = (f2 * 0.9f) + 0.05f;
            int i42 = this.t;
            if (i42 % 3 != 0) {
            }
            int i62 = this.t;
            if (i62 / 3 != 0) {
            }
            if (this.z != b) {
            }
            C1334gp gpVar2 = new C1334gp(spannableStringBuilder, alignment22, f52, 0, i5, f42, i7, Float.MIN_VALUE, z2, this.z, this.p);
            return gpVar2;
        }

        public void a(int i2, int i3, boolean z2, int i4, int i5, int i6, int i7) {
            this.z = i2;
            this.w = i7;
        }

        public void a(int i2, int i3, int i4, boolean z2, boolean z3, int i5, int i6) {
            if (this.A != -1) {
                if (!z2) {
                    this.m.setSpan(new StyleSpan(2), this.A, this.m.length(), 33);
                    this.A = -1;
                }
            } else if (z2) {
                this.A = this.m.length();
            }
            if (this.B != -1) {
                if (!z3) {
                    this.m.setSpan(new UnderlineSpan(), this.B, this.m.length(), 33);
                    this.B = -1;
                }
            } else if (z3) {
                this.B = this.m.length();
            }
        }

        public void a(int i2, int i3) {
            if (this.G != i2) {
                a(10);
            }
            this.G = i2;
        }

        public void a() {
            int length = this.m.length();
            if (length > 0) {
                this.m.delete(length - 1, length);
            }
        }

        public void a(char c2) {
            if (c2 == 10) {
                this.l.add(c());
                this.m.clear();
                if (this.A != -1) {
                    this.A = 0;
                }
                if (this.B != -1) {
                    this.B = 0;
                }
                if (this.C != -1) {
                    this.C = 0;
                }
                if (this.E != -1) {
                    this.E = 0;
                }
                while (true) {
                    if ((this.v && this.l.size() >= this.u) || this.l.size() >= 15) {
                        this.l.remove(0);
                    } else {
                        return;
                    }
                }
            } else {
                this.m.append(c2);
            }
        }

        public static int a(int i2, int i3, int i4) {
            return a(i2, i3, i4, 0);
        }

        /* JADX WARNING: Removed duplicated region for block: B:11:0x0024  */
        /* JADX WARNING: Removed duplicated region for block: B:12:0x0027  */
        /* JADX WARNING: Removed duplicated region for block: B:14:0x002a  */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x002d  */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x0030  */
        public static int a(int i2, int i3, int i4, int i5) {
            int i6;
            int i7 = 0;
            C1852xq.a(i2, 0, 4);
            C1852xq.a(i3, 0, 4);
            C1852xq.a(i4, 0, 4);
            C1852xq.a(i5, 0, 4);
            if (!(i5 == 0 || i5 == 1)) {
                if (i5 == 2) {
                    i6 = 127;
                } else if (i5 == 3) {
                    i6 = 0;
                }
                int i8 = i2 <= 1 ? 255 : 0;
                int i9 = i3 <= 1 ? 255 : 0;
                if (i4 > 1) {
                    i7 = 255;
                }
                return Color.argb(i6, i8, i9, i7);
            }
            i6 = 255;
            if (i2 <= 1) {
            }
            if (i3 <= 1) {
            }
            if (i4 > 1) {
            }
            return Color.argb(i6, i8, i9, i7);
        }
    }

    /* renamed from: hp$b */
    /* compiled from: Cea708Decoder */
    private static final class b {
        public final int a;
        public final int b;
        public final byte[] c;
        int d = 0;

        public b(int i, int i2) {
            this.a = i;
            this.b = i2;
            this.c = new byte[((i2 * 2) - 1)];
        }
    }

    public C1365hp(int i2, List<byte[]> list) {
        if (i2 == -1) {
            i2 = 1;
        }
        this.i = i2;
        this.j = new a[8];
        for (int i3 = 0; i3 < 8; i3++) {
            this.j[i3] = new a();
        }
        this.k = this.j[0];
        l();
    }

    private void e() {
        if (this.n != null) {
            k();
            this.n = null;
        }
    }

    private void f(int i2) {
        if (i2 == 127) {
            this.k.a(9835);
        } else {
            this.k.a((char) (i2 & 255));
        }
    }

    private void g(int i2) {
        this.k.a((char) (i2 & 255));
    }

    private void h(int i2) {
        if (i2 == 32) {
            this.k.a(' ');
        } else if (i2 == 33) {
            this.k.a(160);
        } else if (i2 == 37) {
            this.k.a(8230);
        } else if (i2 == 42) {
            this.k.a(352);
        } else if (i2 == 44) {
            this.k.a(338);
        } else if (i2 == 63) {
            this.k.a(376);
        } else if (i2 == 57) {
            this.k.a(8482);
        } else if (i2 == 58) {
            this.k.a(353);
        } else if (i2 == 60) {
            this.k.a(339);
        } else if (i2 != 61) {
            switch (i2) {
                case 48:
                    this.k.a(9608);
                    return;
                case 49:
                    this.k.a(8216);
                    return;
                case 50:
                    this.k.a(8217);
                    return;
                case 51:
                    this.k.a(8220);
                    return;
                case 52:
                    this.k.a(8221);
                    return;
                case 53:
                    this.k.a(8226);
                    return;
                default:
                    switch (i2) {
                        case 118:
                            this.k.a(8539);
                            return;
                        case 119:
                            this.k.a(8540);
                            return;
                        case 120:
                            this.k.a(8541);
                            return;
                        case ContentType.USER_GENERATED_SHORT_FORM_ON_DEMAND /*121*/:
                            this.k.a(8542);
                            return;
                        case ContentType.USER_GENERATED_LONG_FORM_ON_DEMAND /*122*/:
                            this.k.a(9474);
                            return;
                        case ContentType.USER_GENERATED_LIVE /*123*/:
                            this.k.a(9488);
                            return;
                        case 124:
                            this.k.a(9492);
                            return;
                        case 125:
                            this.k.a(9472);
                            return;
                        case 126:
                            this.k.a(9496);
                            return;
                        case 127:
                            this.k.a(9484);
                            return;
                        default:
                            StringBuilder sb = new StringBuilder();
                            sb.append("Invalid G2 character: ");
                            sb.append(i2);
                            Iq.d("Cea708Decoder", sb.toString());
                            return;
                    }
            }
        } else {
            this.k.a(8480);
        }
    }

    private void i(int i2) {
        if (i2 == 160) {
            this.k.a(13252);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Invalid G3 character: ");
        sb.append(i2);
        Iq.d("Cea708Decoder", sb.toString());
        this.k.a('_');
    }

    private void j() {
        int a2 = a.a(this.h.a(2), this.h.a(2), this.h.a(2), this.h.a(2));
        int a3 = this.h.a(2);
        int a4 = a.a(this.h.a(2), this.h.a(2), this.h.a(2));
        if (this.h.e()) {
            a3 |= 4;
        }
        int i2 = a3;
        boolean e = this.h.e();
        int a5 = this.h.a(2);
        int a6 = this.h.a(2);
        int a7 = this.h.a(2);
        this.h.c(8);
        this.k.a(a2, a4, e, i2, a5, a6, a7);
    }

    private void k() {
        b bVar = this.n;
        int i2 = bVar.d;
        String str = "Cea708Decoder";
        if (i2 != (bVar.b * 2) - 1) {
            StringBuilder sb = new StringBuilder();
            sb.append("DtvCcPacket ended prematurely; size is ");
            sb.append((this.n.b * 2) - 1);
            sb.append(", but current index is ");
            sb.append(this.n.d);
            sb.append(" (sequence number ");
            sb.append(this.n.a);
            sb.append("); ignoring packet");
            Iq.d(str, sb.toString());
            return;
        }
        this.h.a(bVar.c, i2);
        int a2 = this.h.a(3);
        int a3 = this.h.a(5);
        if (a2 == 7) {
            this.h.c(2);
            a2 = this.h.a(6);
            if (a2 < 7) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Invalid extended service number: ");
                sb2.append(a2);
                Iq.d(str, sb2.toString());
            }
        }
        if (a3 == 0) {
            if (a2 != 0) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("serviceNumber is non-zero (");
                sb3.append(a2);
                sb3.append(") when blockSize is 0");
                Iq.d(str, sb3.toString());
            }
        } else if (a2 == this.i) {
            boolean z = false;
            while (this.h.a() > 0) {
                int a4 = this.h.a(8);
                if (a4 == 16) {
                    int a5 = this.h.a(8);
                    if (a5 <= 31) {
                        c(a5);
                    } else if (a5 <= 127) {
                        h(a5);
                    } else if (a5 <= 159) {
                        d(a5);
                    } else if (a5 <= 255) {
                        i(a5);
                    } else {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("Invalid extended command: ");
                        sb4.append(a5);
                        Iq.d(str, sb4.toString());
                    }
                } else if (a4 <= 31) {
                    a(a4);
                } else if (a4 <= 127) {
                    f(a4);
                } else if (a4 <= 159) {
                    b(a4);
                } else if (a4 <= 255) {
                    g(a4);
                } else {
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append("Invalid base command: ");
                    sb5.append(a4);
                    Iq.d(str, sb5.toString());
                }
                z = true;
            }
            if (z) {
                this.l = f();
            }
        }
    }

    private void l() {
        for (int i2 = 0; i2 < 8; i2++) {
            this.j[i2].h();
        }
    }

    public /* bridge */ /* synthetic */ C1211cp a() throws Zo {
        return super.a();
    }

    public /* bridge */ /* synthetic */ C0500bp b() throws Zo {
        return super.b();
    }

    /* access modifiers changed from: protected */
    public Xo c() {
        List<Uo> list = this.l;
        this.m = list;
        return new C1488lp(list);
    }

    /* access modifiers changed from: protected */
    public boolean d() {
        return this.l != this.m;
    }

    public void flush() {
        super.flush();
        this.l = null;
        this.m = null;
        this.o = 0;
        this.k = this.j[this.o];
        l();
        this.n = null;
    }

    public /* bridge */ /* synthetic */ void release() {
        super.release();
    }

    private void d(int i2) {
        if (i2 <= 135) {
            this.h.c(32);
        } else if (i2 <= 143) {
            this.h.c(40);
        } else if (i2 <= 159) {
            this.h.c(2);
            this.h.c(this.h.a(6) * 8);
        }
    }

    private void g() {
        this.k.a(this.h.a(4), this.h.a(2), this.h.a(2), this.h.e(), this.h.e(), this.h.a(3), this.h.a(3));
    }

    public /* bridge */ /* synthetic */ void a(long j2) {
        super.a(j2);
    }

    public /* bridge */ /* synthetic */ void b(C0500bp bpVar) throws Zo {
        super.a(bpVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0093, code lost:
        if (r2 > 8) goto L_0x0117;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x009b, code lost:
        if (r4.h.e() == false) goto L_0x00a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x009d, code lost:
        r4.j[8 - r2].h();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00a6, code lost:
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00c5, code lost:
        if (r2 > 8) goto L_0x0117;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00cd, code lost:
        if (r4.h.e() == false) goto L_0x00d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00cf, code lost:
        r4.j[8 - r2].a(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00d9, code lost:
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00f3, code lost:
        if (r2 > 8) goto L_0x0117;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00fb, code lost:
        if (r4.h.e() == false) goto L_0x0106;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00fd, code lost:
        r4.j[8 - r2].d();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0106, code lost:
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:?, code lost:
        return;
     */
    private void b(int i2) {
        int i3 = 1;
        switch (i2) {
            case 128:
            case 129:
            case 130:
            case 131:
            case 132:
            case 133:
            case 134:
            case 135:
                int i4 = i2 - 128;
                if (this.o != i4) {
                    this.o = i4;
                    this.k = this.j[i4];
                    return;
                }
                return;
            case 136:
                break;
            case 137:
                for (int i5 = 1; i5 <= 8; i5++) {
                    if (this.h.e()) {
                        this.j[8 - i5].a(true);
                    }
                }
                return;
            case 138:
                break;
            case 139:
                for (int i6 = 1; i6 <= 8; i6++) {
                    if (this.h.e()) {
                        a aVar = this.j[8 - i6];
                        aVar.a(!aVar.g());
                    }
                }
                return;
            case 140:
                break;
            case 141:
                this.h.c(8);
                return;
            case 142:
                return;
            case 143:
                l();
                return;
            case 144:
                if (!this.k.e()) {
                    this.h.c(16);
                    return;
                } else {
                    g();
                    return;
                }
            case 145:
                if (!this.k.e()) {
                    this.h.c(24);
                    return;
                } else {
                    h();
                    return;
                }
            case 146:
                if (!this.k.e()) {
                    this.h.c(16);
                    return;
                } else {
                    i();
                    return;
                }
            case 151:
                if (!this.k.e()) {
                    this.h.c(32);
                    return;
                } else {
                    j();
                    return;
                }
            case 152:
            case 153:
            case 154:
            case 155:
            case 156:
            case 157:
            case 158:
            case 159:
                int i7 = i2 - 152;
                e(i7);
                if (this.o != i7) {
                    this.o = i7;
                    this.k = this.j[i7];
                    return;
                }
                return;
            default:
                StringBuilder sb = new StringBuilder();
                sb.append("Invalid C1 command: ");
                sb.append(i2);
                Iq.d("Cea708Decoder", sb.toString());
                return;
        }
    }

    private void c(int i2) {
        if (i2 > 7) {
            if (i2 <= 15) {
                this.h.c(8);
            } else if (i2 <= 23) {
                this.h.c(16);
            } else if (i2 <= 31) {
                this.h.c(24);
            }
        }
    }

    private List<Uo> f() {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < 8; i2++) {
            if (!this.j[i2].f() && this.j[i2].g()) {
                arrayList.add(this.j[i2].b());
            }
        }
        Collections.sort(arrayList);
        return Collections.unmodifiableList(arrayList);
    }

    /* access modifiers changed from: protected */
    public void a(C0500bp bpVar) {
        this.g.a(bpVar.c.array(), bpVar.c.limit());
        while (this.g.a() >= 3) {
            int t = this.g.t() & 7;
            int i2 = t & 3;
            boolean z = false;
            boolean z2 = (t & 4) == 4;
            byte t2 = (byte) this.g.t();
            byte t3 = (byte) this.g.t();
            if ((i2 == 2 || i2 == 3) && z2) {
                if (i2 == 3) {
                    e();
                    int i3 = (t2 & 192) >> 6;
                    byte b2 = t2 & 63;
                    if (b2 == 0) {
                        b2 = 64;
                    }
                    this.n = new b(i3, b2);
                    b bVar = this.n;
                    byte[] bArr = bVar.c;
                    int i4 = bVar.d;
                    bVar.d = i4 + 1;
                    bArr[i4] = t3;
                } else {
                    if (i2 == 2) {
                        z = true;
                    }
                    C1852xq.a(z);
                    b bVar2 = this.n;
                    if (bVar2 == null) {
                        Iq.b("Cea708Decoder", "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                    } else {
                        byte[] bArr2 = bVar2.c;
                        int i5 = bVar2.d;
                        bVar2.d = i5 + 1;
                        bArr2[i5] = t2;
                        int i6 = bVar2.d;
                        bVar2.d = i6 + 1;
                        bArr2[i6] = t3;
                    }
                }
                b bVar3 = this.n;
                if (bVar3.d == (bVar3.b * 2) - 1) {
                    e();
                }
            }
        }
    }

    private void e(int i2) {
        a aVar = this.j[i2];
        this.h.c(2);
        boolean e = this.h.e();
        boolean e2 = this.h.e();
        boolean e3 = this.h.e();
        int a2 = this.h.a(3);
        boolean e4 = this.h.e();
        int a3 = this.h.a(7);
        int a4 = this.h.a(8);
        int a5 = this.h.a(4);
        int a6 = this.h.a(4);
        this.h.c(2);
        int a7 = this.h.a(6);
        this.h.c(2);
        aVar.a(e, e2, e3, a2, e4, a3, a4, a6, a7, a5, this.h.a(3), this.h.a(3));
    }

    private void i() {
        this.h.c(4);
        int a2 = this.h.a(4);
        this.h.c(2);
        this.k.a(a2, this.h.a(6));
    }

    private void a(int i2) {
        if (i2 == 0) {
            return;
        }
        if (i2 == 3) {
            this.l = f();
        } else if (i2 != 8) {
            switch (i2) {
                case 12:
                    l();
                    return;
                case 13:
                    this.k.a(10);
                    return;
                case 14:
                    return;
                default:
                    String str = "Cea708Decoder";
                    if (i2 >= 17 && i2 <= 23) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Currently unsupported COMMAND_EXT1 Command: ");
                        sb.append(i2);
                        Iq.d(str, sb.toString());
                        this.h.c(8);
                        return;
                    } else if (i2 < 24 || i2 > 31) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Invalid C0 command: ");
                        sb2.append(i2);
                        Iq.d(str, sb2.toString());
                        return;
                    } else {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("Currently unsupported COMMAND_P16 Command: ");
                        sb3.append(i2);
                        Iq.d(str, sb3.toString());
                        this.h.c(16);
                        return;
                    }
            }
        } else {
            this.k.a();
        }
    }

    private void h() {
        int a2 = a.a(this.h.a(2), this.h.a(2), this.h.a(2), this.h.a(2));
        int a3 = a.a(this.h.a(2), this.h.a(2), this.h.a(2), this.h.a(2));
        this.h.c(2);
        this.k.b(a2, a3, a.a(this.h.a(2), this.h.a(2), this.h.a(2)));
    }
}
