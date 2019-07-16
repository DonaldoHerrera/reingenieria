package defpackage;

import com.google.android.exoplayer2.H;
import java.io.IOException;
import java.util.ArrayDeque;

/* renamed from: un reason: default package and case insensitive filesystem */
/* compiled from: DefaultEbmlReader */
final class C1759un implements C1819wn {
    private final byte[] a = new byte[8];
    private final ArrayDeque<a> b = new ArrayDeque<>();
    private final An c = new An();
    private C1789vn d;
    private int e;
    private int f;
    private long g;

    /* renamed from: un$a */
    /* compiled from: DefaultEbmlReader */
    private static final class a {
        /* access modifiers changed from: private */
        public final int a;
        /* access modifiers changed from: private */
        public final long b;

        private a(int i, long j) {
            this.a = i;
            this.b = j;
        }
    }

    private long b(C0313an anVar) throws IOException, InterruptedException {
        anVar.a();
        while (true) {
            anVar.a(this.a, 0, 4);
            int a2 = An.a(this.a[0]);
            if (a2 != -1 && a2 <= 4) {
                int a3 = (int) An.a(this.a, a2, false);
                if (this.d.c(a3)) {
                    anVar.c(a2);
                    return (long) a3;
                }
            }
            anVar.c(1);
        }
    }

    private String c(C0313an anVar, int i) throws IOException, InterruptedException {
        if (i == 0) {
            return "";
        }
        byte[] bArr = new byte[i];
        anVar.readFully(bArr, 0, i);
        while (i > 0 && bArr[i - 1] == 0) {
            i--;
        }
        return new String(bArr, 0, i);
    }

    public void a(C1789vn vnVar) {
        this.d = vnVar;
    }

    public void reset() {
        this.e = 0;
        this.b.clear();
        this.c.b();
    }

    public boolean a(C0313an anVar) throws IOException, InterruptedException {
        C1852xq.a(this.d);
        while (true) {
            if (this.b.isEmpty() || anVar.getPosition() < ((a) this.b.peek()).b) {
                if (this.e == 0) {
                    long a2 = this.c.a(anVar, true, false, 4);
                    if (a2 == -2) {
                        a2 = b(anVar);
                    }
                    if (a2 == -1) {
                        return false;
                    }
                    this.f = (int) a2;
                    this.e = 1;
                }
                if (this.e == 1) {
                    this.g = this.c.a(anVar, false, true, 8);
                    this.e = 2;
                }
                int b2 = this.d.b(this.f);
                if (b2 == 0) {
                    anVar.c((int) this.g);
                    this.e = 0;
                } else if (b2 == 1) {
                    long position = anVar.getPosition();
                    this.b.push(new a(this.f, this.g + position));
                    this.d.a(this.f, position, this.g);
                    this.e = 0;
                    return true;
                } else if (b2 == 2) {
                    long j = this.g;
                    if (j <= 8) {
                        this.d.a(this.f, b(anVar, (int) j));
                        this.e = 0;
                        return true;
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append("Invalid integer size: ");
                    sb.append(this.g);
                    throw new H(sb.toString());
                } else if (b2 == 3) {
                    long j2 = this.g;
                    if (j2 <= 2147483647L) {
                        this.d.a(this.f, c(anVar, (int) j2));
                        this.e = 0;
                        return true;
                    }
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("String element size: ");
                    sb2.append(this.g);
                    throw new H(sb2.toString());
                } else if (b2 == 4) {
                    this.d.a(this.f, (int) this.g, anVar);
                    this.e = 0;
                    return true;
                } else if (b2 == 5) {
                    long j3 = this.g;
                    if (j3 == 4 || j3 == 8) {
                        this.d.a(this.f, a(anVar, (int) this.g));
                        this.e = 0;
                        return true;
                    }
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("Invalid float size: ");
                    sb3.append(this.g);
                    throw new H(sb3.toString());
                } else {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("Invalid element type ");
                    sb4.append(b2);
                    throw new H(sb4.toString());
                }
            } else {
                this.d.a(((a) this.b.pop()).a);
                return true;
            }
        }
    }

    private long b(C0313an anVar, int i) throws IOException, InterruptedException {
        anVar.readFully(this.a, 0, i);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j = (j << 8) | ((long) (this.a[i2] & 255));
        }
        return j;
    }

    private double a(C0313an anVar, int i) throws IOException, InterruptedException {
        long b2 = b(anVar, i);
        if (i == 4) {
            return (double) Float.intBitsToFloat((int) b2);
        }
        return Double.longBitsToDouble(b2);
    }
}
