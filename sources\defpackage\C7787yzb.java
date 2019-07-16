package defpackage;

import com.adjust.sdk.Constants;
import com.google.android.gms.common.api.Api.BaseClientBuilder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* renamed from: yzb reason: default package and case insensitive filesystem */
/* compiled from: Hpack */
final class C7787yzb {
    static final C7718xzb[] a;
    static final Map<C7030oAb, Integer> b = a();

    /* renamed from: yzb$a */
    /* compiled from: Hpack */
    static final class a {
        private final List<C7718xzb> a;
        private final C6961nAb b;
        private final int c;
        private int d;
        C7718xzb[] e;
        int f;
        int g;
        int h;

        a(int i, HAb hAb) {
            this(i, i, hAb);
        }

        private int b(int i) {
            int i2 = 0;
            if (i > 0) {
                int length = this.e.length;
                while (true) {
                    length--;
                    if (length < this.f || i <= 0) {
                        C7718xzb[] xzbArr = this.e;
                        int i3 = this.f;
                        System.arraycopy(xzbArr, i3 + 1, xzbArr, i3 + 1 + i2, this.g);
                        this.f += i2;
                    } else {
                        C7718xzb[] xzbArr2 = this.e;
                        i -= xzbArr2[length].i;
                        this.h -= xzbArr2[length].i;
                        this.g--;
                        i2++;
                    }
                }
                C7718xzb[] xzbArr3 = this.e;
                int i32 = this.f;
                System.arraycopy(xzbArr3, i32 + 1, xzbArr3, i32 + 1 + i2, this.g);
                this.f += i2;
            }
            return i2;
        }

        private void d() {
            int i = this.d;
            int i2 = this.h;
            if (i >= i2) {
                return;
            }
            if (i == 0) {
                e();
            } else {
                b(i2 - i);
            }
        }

        private void e() {
            Arrays.fill(this.e, null);
            this.f = this.e.length - 1;
            this.g = 0;
            this.h = 0;
        }

        private void f(int i) throws IOException {
            a(-1, new C7718xzb(c(i), b()));
        }

        private void g(int i) throws IOException {
            this.a.add(new C7718xzb(c(i), b()));
        }

        private void h() throws IOException {
            C7030oAb b2 = b();
            C7787yzb.a(b2);
            this.a.add(new C7718xzb(b2, b()));
        }

        public List<C7718xzb> a() {
            ArrayList arrayList = new ArrayList(this.a);
            this.a.clear();
            return arrayList;
        }

        /* access modifiers changed from: 0000 */
        public void c() throws IOException {
            while (!this.b.p()) {
                byte readByte = this.b.readByte() & 255;
                if (readByte == 128) {
                    throw new IOException("index == 0");
                } else if ((readByte & 128) == 128) {
                    e(a((int) readByte, 127) - 1);
                } else if (readByte == 64) {
                    g();
                } else if ((readByte & 64) == 64) {
                    f(a((int) readByte, 63) - 1);
                } else if ((readByte & 32) == 32) {
                    this.d = a((int) readByte, 31);
                    int i = this.d;
                    if (i < 0 || i > this.c) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Invalid dynamic table size update ");
                        sb.append(this.d);
                        throw new IOException(sb.toString());
                    }
                    d();
                } else if (readByte == 16 || readByte == 0) {
                    h();
                } else {
                    g(a((int) readByte, 15) - 1);
                }
            }
        }

        a(int i, int i2, HAb hAb) {
            this.a = new ArrayList();
            this.e = new C7718xzb[8];
            this.f = this.e.length - 1;
            this.g = 0;
            this.h = 0;
            this.c = i;
            this.d = i2;
            this.b = C7720yAb.a(hAb);
        }

        private int a(int i) {
            return this.f + 1 + i;
        }

        private void a(int i, C7718xzb xzb) {
            this.a.add(xzb);
            int i2 = xzb.i;
            if (i != -1) {
                i2 -= this.e[a(i)].i;
            }
            int i3 = this.d;
            if (i2 > i3) {
                e();
                return;
            }
            int b2 = b((this.h + i2) - i3);
            if (i == -1) {
                int i4 = this.g + 1;
                C7718xzb[] xzbArr = this.e;
                if (i4 > xzbArr.length) {
                    C7718xzb[] xzbArr2 = new C7718xzb[(xzbArr.length * 2)];
                    System.arraycopy(xzbArr, 0, xzbArr2, xzbArr.length, xzbArr.length);
                    this.f = this.e.length - 1;
                    this.e = xzbArr2;
                }
                int i5 = this.f;
                this.f = i5 - 1;
                this.e[i5] = xzb;
                this.g++;
            } else {
                this.e[i + a(i) + b2] = xzb;
            }
            this.h += i2;
        }

        private boolean d(int i) {
            return i >= 0 && i <= C7787yzb.a.length - 1;
        }

        private int f() throws IOException {
            return this.b.readByte() & 255;
        }

        private void g() throws IOException {
            C7030oAb b2 = b();
            C7787yzb.a(b2);
            a(-1, new C7718xzb(b2, b()));
        }

        private void e(int i) throws IOException {
            if (d(i)) {
                this.a.add(C7787yzb.a[i]);
                return;
            }
            int a2 = a(i - C7787yzb.a.length);
            if (a2 >= 0) {
                C7718xzb[] xzbArr = this.e;
                if (a2 < xzbArr.length) {
                    this.a.add(xzbArr[a2]);
                    return;
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Header index too large ");
            sb.append(i + 1);
            throw new IOException(sb.toString());
        }

        /* access modifiers changed from: 0000 */
        public C7030oAb b() throws IOException {
            int f2 = f();
            boolean z = (f2 & 128) == 128;
            int a2 = a(f2, 127);
            if (z) {
                return C7030oAb.a(Pzb.a().a(this.b.d((long) a2)));
            }
            return this.b.f((long) a2);
        }

        private C7030oAb c(int i) throws IOException {
            if (d(i)) {
                return C7787yzb.a[i].g;
            }
            int a2 = a(i - C7787yzb.a.length);
            if (a2 >= 0) {
                C7718xzb[] xzbArr = this.e;
                if (a2 < xzbArr.length) {
                    return xzbArr[a2].g;
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Header index too large ");
            sb.append(i + 1);
            throw new IOException(sb.toString());
        }

        /* access modifiers changed from: 0000 */
        public int a(int i, int i2) throws IOException {
            int i3 = i & i2;
            if (i3 < i2) {
                return i3;
            }
            int i4 = 0;
            while (true) {
                int f2 = f();
                if ((f2 & 128) == 0) {
                    return i2 + (f2 << i4);
                }
                i2 += (f2 & 127) << i4;
                i4 += 7;
            }
        }
    }

    /* renamed from: yzb$b */
    /* compiled from: Hpack */
    static final class b {
        private final C6825lAb a;
        private final boolean b;
        private int c;
        private boolean d;
        int e;
        int f;
        C7718xzb[] g;
        int h;
        int i;
        int j;

        b(C6825lAb lab) {
            this(4096, true, lab);
        }

        private void a(C7718xzb xzb) {
            int i2 = xzb.i;
            int i3 = this.f;
            if (i2 > i3) {
                b();
                return;
            }
            b((this.j + i2) - i3);
            int i4 = this.i + 1;
            C7718xzb[] xzbArr = this.g;
            if (i4 > xzbArr.length) {
                C7718xzb[] xzbArr2 = new C7718xzb[(xzbArr.length * 2)];
                System.arraycopy(xzbArr, 0, xzbArr2, xzbArr.length, xzbArr.length);
                this.h = this.g.length - 1;
                this.g = xzbArr2;
            }
            int i5 = this.h;
            this.h = i5 - 1;
            this.g[i5] = xzb;
            this.i++;
            this.j += i2;
        }

        private void b() {
            Arrays.fill(this.g, null);
            this.h = this.g.length - 1;
            this.i = 0;
            this.j = 0;
        }

        b(int i2, boolean z, C6825lAb lab) {
            this.c = BaseClientBuilder.API_PRIORITY_OTHER;
            this.g = new C7718xzb[8];
            this.h = this.g.length - 1;
            this.i = 0;
            this.j = 0;
            this.e = i2;
            this.f = i2;
            this.b = z;
            this.a = lab;
        }

        private int b(int i2) {
            int i3 = 0;
            if (i2 > 0) {
                int length = this.g.length;
                while (true) {
                    length--;
                    if (length < this.h || i2 <= 0) {
                        C7718xzb[] xzbArr = this.g;
                        int i4 = this.h;
                        System.arraycopy(xzbArr, i4 + 1, xzbArr, i4 + 1 + i3, this.i);
                        C7718xzb[] xzbArr2 = this.g;
                        int i5 = this.h;
                        Arrays.fill(xzbArr2, i5 + 1, i5 + 1 + i3, null);
                        this.h += i3;
                    } else {
                        C7718xzb[] xzbArr3 = this.g;
                        i2 -= xzbArr3[length].i;
                        this.j -= xzbArr3[length].i;
                        this.i--;
                        i3++;
                    }
                }
                C7718xzb[] xzbArr4 = this.g;
                int i42 = this.h;
                System.arraycopy(xzbArr4, i42 + 1, xzbArr4, i42 + 1 + i3, this.i);
                C7718xzb[] xzbArr22 = this.g;
                int i52 = this.h;
                Arrays.fill(xzbArr22, i52 + 1, i52 + 1 + i3, null);
                this.h += i3;
            }
            return i3;
        }

        /* access modifiers changed from: 0000 */
        public void a(List<C7718xzb> list) throws IOException {
            int i2;
            int i3;
            if (this.d) {
                int i4 = this.c;
                if (i4 < this.f) {
                    a(i4, 31, 32);
                }
                this.d = false;
                this.c = BaseClientBuilder.API_PRIORITY_OTHER;
                a(this.f, 31, 32);
            }
            int size = list.size();
            for (int i5 = 0; i5 < size; i5++) {
                C7718xzb xzb = (C7718xzb) list.get(i5);
                C7030oAb g2 = xzb.g.g();
                C7030oAb oab = xzb.h;
                Integer num = (Integer) C7787yzb.b.get(g2);
                if (num != null) {
                    i3 = num.intValue() + 1;
                    if (i3 > 1 && i3 < 8) {
                        if (Objects.equals(C7787yzb.a[i3 - 1].h, oab)) {
                            i2 = i3;
                        } else if (Objects.equals(C7787yzb.a[i3].h, oab)) {
                            i2 = i3;
                            i3++;
                        }
                    }
                    i2 = i3;
                    i3 = -1;
                } else {
                    i3 = -1;
                    i2 = -1;
                }
                if (i3 == -1) {
                    int i6 = this.h + 1;
                    int length = this.g.length;
                    while (true) {
                        if (i6 >= length) {
                            break;
                        }
                        if (Objects.equals(this.g[i6].g, g2)) {
                            if (Objects.equals(this.g[i6].h, oab)) {
                                i3 = C7787yzb.a.length + (i6 - this.h);
                                break;
                            } else if (i2 == -1) {
                                i2 = (i6 - this.h) + C7787yzb.a.length;
                            }
                        }
                        i6++;
                    }
                }
                if (i3 != -1) {
                    a(i3, 127, 128);
                } else if (i2 == -1) {
                    this.a.writeByte(64);
                    a(g2);
                    a(oab);
                    a(xzb);
                } else if (!g2.b(C7718xzb.a) || C7718xzb.f.equals(g2)) {
                    a(i2, 63, 64);
                    a(oab);
                    a(xzb);
                } else {
                    a(i2, 15, 0);
                    a(oab);
                }
            }
        }

        /* access modifiers changed from: 0000 */
        public void a(int i2, int i3, int i4) {
            if (i2 < i3) {
                this.a.writeByte(i2 | i4);
                return;
            }
            this.a.writeByte(i4 | i3);
            int i5 = i2 - i3;
            while (i5 >= 128) {
                this.a.writeByte(128 | (i5 & 127));
                i5 >>>= 7;
            }
            this.a.writeByte(i5);
        }

        /* access modifiers changed from: 0000 */
        public void a(C7030oAb oab) throws IOException {
            if (!this.b || Pzb.a().a(oab) >= oab.f()) {
                a(oab.f(), 127, 0);
                this.a.a(oab);
                return;
            }
            C6825lAb lab = new C6825lAb();
            Pzb.a().a(oab, lab);
            C7030oAb A = lab.A();
            a(A.f(), 127, 128);
            this.a.a(A);
        }

        /* access modifiers changed from: 0000 */
        public void a(int i2) {
            this.e = i2;
            int min = Math.min(i2, 16384);
            int i3 = this.f;
            if (i3 != min) {
                if (min < i3) {
                    this.c = Math.min(this.c, min);
                }
                this.d = true;
                this.f = min;
                a();
            }
        }

        private void a() {
            int i2 = this.f;
            int i3 = this.j;
            if (i2 >= i3) {
                return;
            }
            if (i2 == 0) {
                b();
            } else {
                b(i3 - i2);
            }
        }
    }

    static {
        String str = "";
        a = new C7718xzb[]{new C7718xzb(C7718xzb.f, str), new C7718xzb(C7718xzb.c, "GET"), new C7718xzb(C7718xzb.c, "POST"), new C7718xzb(C7718xzb.d, "/"), new C7718xzb(C7718xzb.d, "/index.html"), new C7718xzb(C7718xzb.e, "http"), new C7718xzb(C7718xzb.e, Constants.SCHEME), new C7718xzb(C7718xzb.b, "200"), new C7718xzb(C7718xzb.b, "204"), new C7718xzb(C7718xzb.b, "206"), new C7718xzb(C7718xzb.b, "304"), new C7718xzb(C7718xzb.b, "400"), new C7718xzb(C7718xzb.b, "404"), new C7718xzb(C7718xzb.b, "500"), new C7718xzb("accept-charset", str), new C7718xzb("accept-encoding", "gzip, deflate"), new C7718xzb("accept-language", str), new C7718xzb("accept-ranges", str), new C7718xzb("accept", str), new C7718xzb("access-control-allow-origin", str), new C7718xzb("age", str), new C7718xzb("allow", str), new C7718xzb("authorization", str), new C7718xzb("cache-control", str), new C7718xzb("content-disposition", str), new C7718xzb("content-encoding", str), new C7718xzb("content-language", str), new C7718xzb("content-length", str), new C7718xzb("content-location", str), new C7718xzb("content-range", str), new C7718xzb("content-type", str), new C7718xzb("cookie", str), new C7718xzb("date", str), new C7718xzb("etag", str), new C7718xzb("expect", str), new C7718xzb("expires", str), new C7718xzb("from", str), new C7718xzb("host", str), new C7718xzb("if-match", str), new C7718xzb("if-modified-since", str), new C7718xzb("if-none-match", str), new C7718xzb("if-range", str), new C7718xzb("if-unmodified-since", str), new C7718xzb("last-modified", str), new C7718xzb("link", str), new C7718xzb("location", str), new C7718xzb("max-forwards", str), new C7718xzb("proxy-authenticate", str), new C7718xzb("proxy-authorization", str), new C7718xzb("range", str), new C7718xzb("referer", str), new C7718xzb("refresh", str), new C7718xzb("retry-after", str), new C7718xzb("server", str), new C7718xzb("set-cookie", str), new C7718xzb("strict-transport-security", str), new C7718xzb("transfer-encoding", str), new C7718xzb("user-agent", str), new C7718xzb("vary", str), new C7718xzb("via", str), new C7718xzb("www-authenticate", str)};
    }

    private static Map<C7030oAb, Integer> a() {
        LinkedHashMap linkedHashMap = new LinkedHashMap(a.length);
        int i = 0;
        while (true) {
            C7718xzb[] xzbArr = a;
            if (i >= xzbArr.length) {
                return Collections.unmodifiableMap(linkedHashMap);
            }
            if (!linkedHashMap.containsKey(xzbArr[i].g)) {
                linkedHashMap.put(a[i].g, Integer.valueOf(i));
            }
            i++;
        }
    }

    static C7030oAb a(C7030oAb oab) throws IOException {
        int f = oab.f();
        int i = 0;
        while (i < f) {
            byte a2 = oab.a(i);
            if (a2 < 65 || a2 > 90) {
                i++;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("PROTOCOL_ERROR response malformed: mixed case name: ");
                sb.append(oab.v());
                throw new IOException(sb.toString());
            }
        }
        return oab;
    }
}
