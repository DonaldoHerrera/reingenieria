package defpackage;

import android.text.Layout.Alignment;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import com.comscore.streaming.AdType;
import com.comscore.streaming.ContentType;
import com.google.common.base.Ascii;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: fp reason: default package and case insensitive filesystem */
/* compiled from: Cea608Decoder */
public final class C1303fp extends C1457kp {
    private static final int[] g = {11, 1, 3, 12, 14, 5, 7, 9};
    private static final int[] h = {0, 4, 8, 12, 16, 20, 24, 28};
    /* access modifiers changed from: private */
    public static final int[] i = {-1, -16711936, -16776961, -16711681, -65536, -256, -65281};
    private static final int[] j = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, AdType.BRANDED_ON_DEMAND_POST_ROLL, 93, 237, 243, 250, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, ContentType.USER_GENERATED_SHORT_FORM_ON_DEMAND, ContentType.USER_GENERATED_LONG_FORM_ON_DEMAND, AdType.BRANDED_ON_DEMAND_PRE_ROLL, 247, 209, 241, 9632};
    private static final int[] k = {174, 176, 189, 191, 8482, 162, 163, 9834, 224, 32, AdType.BRANDED_ON_DEMAND_MID_ROLL, 226, AdType.BRANDED_ON_DEMAND_CONTENT, 238, 244, 251};
    private static final int[] l = {193, 201, AdType.LINEAR_ON_DEMAND_PRE_ROLL, 218, 220, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, 192, 194, ContentType.BUMPER, 200, 202, 203, AdType.BRANDED_ON_DEMAND_LIVE, 206, 207, 239, AdType.LINEAR_ON_DEMAND_MID_ROLL, 217, 249, 219, 171, 187};
    private static final int[] m = {195, 227, 205, 204, 236, 210, 242, AdType.LINEAR_ON_DEMAND_POST_ROLL, 245, ContentType.USER_GENERATED_LIVE, 125, 92, 94, 95, 124, 126, 196, 228, 214, 246, 223, 165, 164, 9474, 197, 229, 216, 248, 9484, 9488, 9492, 9496};
    private static final boolean[] n = {false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};
    private byte A;
    private byte B;
    private int C = 0;
    private final Pq o = new Pq();
    private final int p;
    private final int q;
    private final int r;
    private final ArrayList<a> s = new ArrayList<>();
    private a t = new a(0, 4);
    private List<Uo> u;
    private List<Uo> v;
    private int w;
    private int x;
    private boolean y;
    private boolean z;

    /* renamed from: fp$a */
    /* compiled from: Cea608Decoder */
    private static class a {
        private final List<C0048a> a = new ArrayList();
        private final List<SpannableString> b = new ArrayList();
        private final StringBuilder c = new StringBuilder();
        /* access modifiers changed from: private */
        public int d;
        /* access modifiers changed from: private */
        public int e;
        /* access modifiers changed from: private */
        public int f;
        private int g;
        private int h;

        /* renamed from: fp$a$a reason: collision with other inner class name */
        /* compiled from: Cea608Decoder */
        private static class C0048a {
            public final int a;
            public final boolean b;
            public int c;

            public C0048a(int i, boolean z, int i2) {
                this.a = i;
                this.b = z;
                this.c = i2;
            }
        }

        public a(int i, int i2) {
            b(i);
            d(i2);
        }

        public void d(int i) {
            this.h = i;
        }

        private SpannableString d() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.c);
            int length = spannableStringBuilder.length();
            int i = 0;
            int i2 = -1;
            int i3 = -1;
            int i4 = 0;
            int i5 = -1;
            int i6 = -1;
            boolean z = false;
            while (i < this.a.size()) {
                C0048a aVar = (C0048a) this.a.get(i);
                boolean z2 = aVar.b;
                int i7 = aVar.a;
                if (i7 != 8) {
                    boolean z3 = i7 == 7;
                    if (i7 != 7) {
                        i6 = C1303fp.i[i7];
                    }
                    z = z3;
                }
                int i8 = aVar.c;
                i++;
                if (i8 != (i < this.a.size() ? ((C0048a) this.a.get(i)).c : length)) {
                    if (i2 != -1 && !z2) {
                        b(spannableStringBuilder, i2, i8);
                        i2 = -1;
                    } else if (i2 == -1 && z2) {
                        i2 = i8;
                    }
                    if (i3 != -1 && !z) {
                        a(spannableStringBuilder, i3, i8);
                        i3 = -1;
                    } else if (i3 == -1 && z) {
                        i3 = i8;
                    }
                    if (i6 != i5) {
                        a(spannableStringBuilder, i4, i8, i5);
                        i5 = i6;
                        i4 = i8;
                    }
                }
            }
            if (!(i2 == -1 || i2 == length)) {
                b(spannableStringBuilder, i2, length);
            }
            if (!(i3 == -1 || i3 == length)) {
                a(spannableStringBuilder, i3, length);
            }
            if (i4 != length) {
                a(spannableStringBuilder, i4, length, i5);
            }
            return new SpannableString(spannableStringBuilder);
        }

        public void b(int i) {
            this.g = i;
            this.a.clear();
            this.b.clear();
            this.c.setLength(0);
            this.d = 15;
            this.e = 0;
            this.f = 0;
        }

        public void c(int i) {
            this.g = i;
        }

        public void a(int i, boolean z) {
            this.a.add(new C0048a(i, z, this.c.length()));
        }

        public void c() {
            this.b.add(d());
            this.c.setLength(0);
            this.a.clear();
            int min = Math.min(this.h, this.d);
            while (this.b.size() >= min) {
                this.b.remove(0);
            }
        }

        public void a() {
            int length = this.c.length();
            if (length > 0) {
                this.c.delete(length - 1, length);
                int size = this.a.size() - 1;
                while (size >= 0) {
                    C0048a aVar = (C0048a) this.a.get(size);
                    int i = aVar.c;
                    if (i == length) {
                        aVar.c = i - 1;
                        size--;
                    } else {
                        return;
                    }
                }
            }
        }

        public boolean b() {
            return this.a.isEmpty() && this.b.isEmpty() && this.c.length() == 0;
        }

        public void a(char c2) {
            this.c.append(c2);
        }

        public Uo a(int i) {
            float f2;
            int i2;
            int i3;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            for (int i4 = 0; i4 < this.b.size(); i4++) {
                spannableStringBuilder.append((CharSequence) this.b.get(i4));
                spannableStringBuilder.append(10);
            }
            spannableStringBuilder.append(d());
            if (spannableStringBuilder.length() == 0) {
                return null;
            }
            int i5 = this.e + this.f;
            int length = (32 - i5) - spannableStringBuilder.length();
            int i6 = i5 - length;
            if (i == Integer.MIN_VALUE) {
                i = (this.g != 2 || (Math.abs(i6) >= 3 && length >= 0)) ? (this.g != 2 || i6 <= 0) ? 0 : 2 : 1;
            }
            if (i != 1) {
                if (i == 2) {
                    i5 = 32 - length;
                }
                f2 = ((((float) i5) / 32.0f) * 0.8f) + 0.1f;
            } else {
                f2 = 0.5f;
            }
            if (this.g != 1) {
                i3 = this.d;
                if (i3 <= 7) {
                    i2 = 0;
                    Uo uo = new Uo(spannableStringBuilder, Alignment.ALIGN_NORMAL, (float) i3, 1, i2, f2, i, Float.MIN_VALUE);
                    return uo;
                }
            }
            i3 = (this.d - 15) - 2;
            i2 = 2;
            Uo uo2 = new Uo(spannableStringBuilder, Alignment.ALIGN_NORMAL, (float) i3, 1, i2, f2, i, Float.MIN_VALUE);
            return uo2;
        }

        private static void b(SpannableStringBuilder spannableStringBuilder, int i, int i2) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i, i2, 33);
        }

        private static void a(SpannableStringBuilder spannableStringBuilder, int i, int i2) {
            spannableStringBuilder.setSpan(new StyleSpan(2), i, i2, 33);
        }

        private static void a(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3) {
            if (i3 != -1) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(i3), i, i2, 33);
            }
        }
    }

    public C1303fp(String str, int i2) {
        this.p = "application/x-mp4-cea-608".equals(str) ? 2 : 3;
        if (i2 == 1) {
            this.r = 0;
            this.q = 0;
        } else if (i2 == 2) {
            this.r = 1;
            this.q = 0;
        } else if (i2 == 3) {
            this.r = 0;
            this.q = 1;
        } else if (i2 != 4) {
            Iq.d("Cea608Decoder", "Invalid channel. Defaulting to CC1.");
            this.r = 0;
            this.q = 0;
        } else {
            this.r = 1;
            this.q = 1;
        }
        a(0);
        g();
    }

    private static int a(byte b) {
        return (b >> 3) & 1;
    }

    private static boolean b(byte b, byte b2) {
        return (b & 247) == 17 && (b2 & 240) == 32;
    }

    private static boolean c(byte b, byte b2) {
        return (b & 246) == 20 && (b2 & 240) == 32;
    }

    private static boolean d(byte b, byte b2) {
        return (b & 240) == 16 && (b2 & 192) == 64;
    }

    private static boolean e(byte b, byte b2) {
        return (b & 247) == 23 && b2 >= 33 && b2 <= 35;
    }

    private void f(byte b) {
        this.t.a(' ');
        this.t.a((b >> 1) & 7, (b & 1) == 1);
    }

    private void g(byte b) {
        if (b == 32) {
            a(2);
        } else if (b != 41) {
            switch (b) {
                case 37:
                    a(1);
                    b(2);
                    return;
                case 38:
                    a(1);
                    b(3);
                    return;
                case 39:
                    a(1);
                    b(4);
                    return;
                default:
                    int i2 = this.w;
                    if (i2 != 0) {
                        if (b != 33) {
                            if (b != 36) {
                                switch (b) {
                                    case 44:
                                        this.u = Collections.emptyList();
                                        int i3 = this.w;
                                        if (i3 == 1 || i3 == 3) {
                                            g();
                                            break;
                                        }
                                    case 45:
                                        if (i2 == 1 && !this.t.b()) {
                                            this.t.c();
                                            break;
                                        }
                                    case 46:
                                        g();
                                        break;
                                    case 47:
                                        this.u = f();
                                        g();
                                        break;
                                }
                            }
                        } else {
                            this.t.a();
                        }
                        return;
                    }
                    return;
            }
        } else {
            a(3);
        }
    }

    private static boolean h(byte b) {
        return (b & 240) == 16;
    }

    public /* bridge */ /* synthetic */ C1211cp a() throws Zo {
        return super.a();
    }

    public /* bridge */ /* synthetic */ C0500bp b() throws Zo {
        return super.b();
    }

    /* access modifiers changed from: protected */
    public Xo c() {
        List<Uo> list = this.u;
        this.v = list;
        return new C1488lp(list);
    }

    /* access modifiers changed from: protected */
    public boolean d() {
        return this.u != this.v;
    }

    public void flush() {
        super.flush();
        this.u = null;
        this.v = null;
        a(0);
        b(4);
        g();
        this.y = false;
        this.z = false;
        this.A = 0;
        this.B = 0;
        this.C = 0;
    }

    public void release() {
    }

    private static char d(byte b) {
        return (char) m[b & Ascii.US];
    }

    private static char e(byte b) {
        return (char) k[b & Ascii.SI];
    }

    public /* bridge */ /* synthetic */ void a(long j2) {
        super.a(j2);
    }

    public /* bridge */ /* synthetic */ void b(C0500bp bpVar) throws Zo {
        super.a(bpVar);
    }

    private void b(int i2) {
        this.x = i2;
        this.t.d(i2);
    }

    private static char c(byte b) {
        return (char) l[b & Ascii.US];
    }

    private List<Uo> f() {
        int size = this.s.size();
        ArrayList arrayList = new ArrayList(size);
        int i2 = 2;
        for (int i3 = 0; i3 < size; i3++) {
            Uo a2 = ((a) this.s.get(i3)).a(Integer.MIN_VALUE);
            arrayList.add(a2);
            if (a2 != null) {
                i2 = Math.min(i2, a2.h);
            }
        }
        ArrayList arrayList2 = new ArrayList(size);
        for (int i4 = 0; i4 < size; i4++) {
            Uo uo = (Uo) arrayList.get(i4);
            if (uo != null) {
                if (uo.h != i2) {
                    uo = ((a) this.s.get(i4)).a(i2);
                }
                arrayList2.add(uo);
            }
        }
        return arrayList2;
    }

    /* access modifiers changed from: protected */
    public void a(C0500bp bpVar) {
        byte b;
        this.o.a(bpVar.c.array(), bpVar.c.limit());
        boolean z2 = false;
        while (true) {
            int a2 = this.o.a();
            int i2 = this.p;
            if (a2 < i2) {
                break;
            }
            if (i2 == 2) {
                b = -4;
            } else {
                b = (byte) this.o.t();
            }
            int t2 = this.o.t();
            int t3 = this.o.t();
            if ((b & 2) == 0 && (b & 1) == this.q) {
                byte b2 = (byte) (t2 & 127);
                byte b3 = (byte) (t3 & 127);
                if (b2 != 0 || b3 != 0) {
                    boolean z3 = this.z;
                    this.z = false;
                    boolean z4 = this.y;
                    this.y = (b & 4) == 4;
                    if (this.y) {
                        boolean[] zArr = n;
                        if (!zArr[t2] || !zArr[t3]) {
                            g();
                        } else if ((b2 & 247) == 17 && (b3 & 240) == 48) {
                            if (a(b2) == this.r) {
                                this.t.a(e(b3));
                            }
                        } else if ((b2 & 246) == 18 && (b3 & 224) == 32) {
                            if (a(b2) == this.r) {
                                this.t.a();
                                if ((b2 & 1) == 0) {
                                    this.t.a(c(b3));
                                } else {
                                    this.t.a(d(b3));
                                }
                            }
                        } else if ((b2 & 224) == 0) {
                            a(b2, b3, z3);
                        } else if (this.C == this.r) {
                            this.t.a(b(b2));
                            if ((b3 & 224) != 0) {
                                this.t.a(b(b3));
                            }
                        }
                    } else if (z4) {
                        g();
                    }
                    z2 = true;
                }
            }
        }
        if (z2) {
            int i3 = this.w;
            if (i3 == 1 || i3 == 3) {
                this.u = f();
            }
        }
    }

    private static char b(byte b) {
        return (char) j[(b & Ascii.DEL) - 32];
    }

    private void g() {
        this.t.b(this.w);
        this.s.clear();
        this.s.add(this.t);
    }

    private void a(byte b, byte b2, boolean z2) {
        this.C = a(b);
        if (h(b)) {
            if (!z2 || this.A != b || this.B != b2) {
                this.z = true;
                this.A = b;
                this.B = b2;
            } else {
                return;
            }
        }
        if (this.C == this.r) {
            if (b(b, b2)) {
                f(b2);
            } else if (d(b, b2)) {
                a(b, b2);
            } else if (e(b, b2)) {
                this.t.f = b2 - 32;
            } else if (c(b, b2)) {
                g(b2);
            }
        }
    }

    private void a(byte b, byte b2) {
        int i2 = g[b & 7];
        boolean z2 = false;
        if ((b2 & 32) != 0) {
            i2++;
        }
        if (i2 != this.t.d) {
            if (this.w != 1 && !this.t.b()) {
                this.t = new a(this.w, this.x);
                this.s.add(this.t);
            }
            this.t.d = i2;
        }
        boolean z3 = (b2 & Ascii.DLE) == 16;
        if ((b2 & 1) == 1) {
            z2 = true;
        }
        int i3 = (b2 >> 1) & 7;
        this.t.a(z3 ? 8 : i3, z2);
        if (z3) {
            this.t.e = h[i3];
        }
    }

    private void a(int i2) {
        int i3 = this.w;
        if (i3 != i2) {
            this.w = i2;
            if (i2 == 3) {
                for (int i4 = 0; i4 < this.s.size(); i4++) {
                    ((a) this.s.get(i4)).c(i2);
                }
                return;
            }
            g();
            if (i3 == 3 || i2 == 1 || i2 == 0) {
                this.u = Collections.emptyList();
            }
        }
    }
}
