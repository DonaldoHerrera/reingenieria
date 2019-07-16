package defpackage;

import com.google.android.gms.common.api.Api.BaseClientBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Stack;

/* renamed from: aob reason: default package and case insensitive filesystem */
/* compiled from: RopeByteString */
class C5593aob extends Fnb {
    /* access modifiers changed from: private */
    public static final int[] b;
    private final int c;
    /* access modifiers changed from: private */
    public final Fnb d;
    /* access modifiers changed from: private */
    public final Fnb e;
    private final int f;
    private final int g;
    private int h;

    /* renamed from: aob$a */
    /* compiled from: RopeByteString */
    private static class a {
        private final Stack<Fnb> a;

        private a() {
            this.a = new Stack<>();
        }

        private void b(Fnb fnb) {
            int a2 = a(fnb.size());
            int i = C5593aob.b[a2 + 1];
            if (this.a.isEmpty() || ((Fnb) this.a.peek()).size() >= i) {
                this.a.push(fnb);
                return;
            }
            int i2 = C5593aob.b[a2];
            Fnb fnb2 = (Fnb) this.a.pop();
            while (!this.a.isEmpty() && ((Fnb) this.a.peek()).size() < i2) {
                fnb2 = new C5593aob((Fnb) this.a.pop(), fnb2);
            }
            C5593aob aob = new C5593aob(fnb2, fnb);
            while (!this.a.isEmpty()) {
                if (((Fnb) this.a.peek()).size() >= C5593aob.b[a(aob.size()) + 1]) {
                    break;
                }
                aob = new C5593aob((Fnb) this.a.pop(), aob);
            }
            this.a.push(aob);
        }

        /* access modifiers changed from: private */
        public Fnb a(Fnb fnb, Fnb fnb2) {
            a(fnb);
            a(fnb2);
            Fnb fnb3 = (Fnb) this.a.pop();
            while (!this.a.isEmpty()) {
                fnb3 = new C5593aob((Fnb) this.a.pop(), fnb3);
            }
            return fnb3;
        }

        private void a(Fnb fnb) {
            if (fnb.g()) {
                b(fnb);
            } else if (fnb instanceof C5593aob) {
                C5593aob aob = (C5593aob) fnb;
                a(aob.d);
                a(aob.e);
            } else {
                String valueOf = String.valueOf(String.valueOf(fnb.getClass()));
                StringBuilder sb = new StringBuilder(valueOf.length() + 49);
                sb.append("Has a new type of ByteString been created? Found ");
                sb.append(valueOf);
                throw new IllegalArgumentException(sb.toString());
            }
        }

        private int a(int i) {
            int binarySearch = Arrays.binarySearch(C5593aob.b, i);
            return binarySearch < 0 ? (-(binarySearch + 1)) - 1 : binarySearch;
        }
    }

    /* renamed from: aob$b */
    /* compiled from: RopeByteString */
    private static class b implements Iterator<Vnb> {
        private final Stack<C5593aob> a;
        private Vnb b;

        private Vnb a(Fnb fnb) {
            while (fnb instanceof C5593aob) {
                C5593aob aob = (C5593aob) fnb;
                this.a.push(aob);
                fnb = aob.d;
            }
            return (Vnb) fnb;
        }

        public boolean hasNext() {
            return this.b != null;
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }

        private b(Fnb fnb) {
            this.a = new Stack<>();
            this.b = a(fnb);
        }

        public Vnb next() {
            Vnb vnb = this.b;
            if (vnb != null) {
                this.b = a();
                return vnb;
            }
            throw new NoSuchElementException();
        }

        private Vnb a() {
            while (!this.a.isEmpty()) {
                Vnb a2 = a(((C5593aob) this.a.pop()).e);
                if (!a2.isEmpty()) {
                    return a2;
                }
            }
            return null;
        }
    }

    /* renamed from: aob$c */
    /* compiled from: RopeByteString */
    private class c implements defpackage.Fnb.a {
        private final b a;
        private defpackage.Fnb.a b;
        int c;

        public boolean hasNext() {
            return this.c > 0;
        }

        public byte nextByte() {
            if (!this.b.hasNext()) {
                this.b = this.a.next().iterator();
            }
            this.c--;
            return this.b.nextByte();
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }

        private c() {
            this.a = new b(C5593aob.this);
            this.b = this.a.next().iterator();
            this.c = C5593aob.this.size();
        }

        public Byte next() {
            return Byte.valueOf(nextByte());
        }
    }

    /* renamed from: aob$d */
    /* compiled from: RopeByteString */
    private class d extends InputStream {
        private b a;
        private Vnb b;
        private int c;
        private int d;
        private int e;
        private int f;

        public d() {
            b();
        }

        private int a(byte[] bArr, int i, int i2) {
            int i3 = i;
            int i4 = i2;
            while (true) {
                if (i4 <= 0) {
                    break;
                }
                a();
                if (this.b != null) {
                    int min = Math.min(this.c - this.d, i4);
                    if (bArr != null) {
                        this.b.a(bArr, this.d, i3, min);
                        i3 += min;
                    }
                    this.d += min;
                    i4 -= min;
                } else if (i4 == i2) {
                    return -1;
                }
            }
            return i2 - i4;
        }

        private void b() {
            this.a = new b(C5593aob.this);
            this.b = this.a.next();
            this.c = this.b.size();
            this.d = 0;
            this.e = 0;
        }

        public int available() throws IOException {
            return C5593aob.this.size() - (this.e + this.d);
        }

        public void mark(int i) {
            this.f = this.e + this.d;
        }

        public boolean markSupported() {
            return true;
        }

        public int read(byte[] bArr, int i, int i2) {
            if (bArr == null) {
                throw new NullPointerException();
            } else if (i >= 0 && i2 >= 0 && i2 <= bArr.length - i) {
                return a(bArr, i, i2);
            } else {
                throw new IndexOutOfBoundsException();
            }
        }

        public synchronized void reset() {
            b();
            a(null, 0, this.f);
        }

        public long skip(long j) {
            if (j >= 0) {
                if (j > 2147483647L) {
                    j = 2147483647L;
                }
                return (long) a(null, 0, (int) j);
            }
            throw new IndexOutOfBoundsException();
        }

        public int read() throws IOException {
            a();
            Vnb vnb = this.b;
            if (vnb == null) {
                return -1;
            }
            int i = this.d;
            this.d = i + 1;
            return vnb.c(i) & 255;
        }

        private void a() {
            if (this.b != null) {
                int i = this.d;
                int i2 = this.c;
                if (i == i2) {
                    this.e += i2;
                    this.d = 0;
                    if (this.a.hasNext()) {
                        this.b = this.a.next();
                        this.c = this.b.size();
                        return;
                    }
                    this.b = null;
                    this.c = 0;
                }
            }
        }
    }

    static {
        ArrayList arrayList = new ArrayList();
        int i = 1;
        int i2 = 1;
        while (i > 0) {
            arrayList.add(Integer.valueOf(i));
            int i3 = i2 + i;
            i2 = i;
            i = i3;
        }
        arrayList.add(Integer.valueOf(BaseClientBuilder.API_PRIORITY_OTHER));
        b = new int[arrayList.size()];
        int i4 = 0;
        while (true) {
            int[] iArr = b;
            if (i4 < iArr.length) {
                iArr[i4] = ((Integer) arrayList.get(i4)).intValue();
                i4++;
            } else {
                return;
            }
        }
    }

    private boolean c(Fnb fnb) {
        b bVar = new b(this);
        Vnb vnb = (Vnb) bVar.next();
        b bVar2 = new b(fnb);
        Vnb vnb2 = (Vnb) bVar2.next();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int size = vnb.size() - i;
            int size2 = vnb2.size() - i2;
            int min = Math.min(size, size2);
            if (!(i == 0 ? vnb.a(vnb2, i2, min) : vnb2.a(vnb, i, min))) {
                return false;
            }
            i3 += min;
            int i4 = this.c;
            if (i3 < i4) {
                if (min == size) {
                    vnb = (Vnb) bVar.next();
                    i = 0;
                } else {
                    i += min;
                }
                if (min == size2) {
                    vnb2 = (Vnb) bVar2.next();
                    i2 = 0;
                } else {
                    i2 += min;
                }
            } else if (i3 == i4) {
                return true;
            } else {
                throw new IllegalStateException();
            }
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Fnb)) {
            return false;
        }
        Fnb fnb = (Fnb) obj;
        if (this.c != fnb.size()) {
            return false;
        }
        if (this.c == 0) {
            return true;
        }
        if (this.h != 0) {
            int k = fnb.k();
            if (!(k == 0 || this.h == k)) {
                return false;
            }
        }
        return c(fnb);
    }

    /* access modifiers changed from: protected */
    public int f() {
        return this.g;
    }

    /* access modifiers changed from: protected */
    public boolean g() {
        return this.c >= b[this.g];
    }

    public boolean h() {
        int b2 = this.d.b(0, 0, this.f);
        Fnb fnb = this.e;
        if (fnb.b(b2, 0, fnb.size()) == 0) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i = this.h;
        if (i == 0) {
            int i2 = this.c;
            i = a(i2, 0, i2);
            if (i == 0) {
                i = 1;
            }
            this.h = i;
        }
        return i;
    }

    public Gnb i() {
        return Gnb.a((InputStream) new d());
    }

    /* access modifiers changed from: protected */
    public int k() {
        return this.h;
    }

    public int size() {
        return this.c;
    }

    private C5593aob(Fnb fnb, Fnb fnb2) {
        this.h = 0;
        this.d = fnb;
        this.e = fnb2;
        this.f = fnb.size();
        this.c = this.f + fnb2.size();
        this.g = Math.max(fnb.f(), fnb2.f()) + 1;
    }

    static Fnb a(Fnb fnb, Fnb fnb2) {
        C5593aob aob = fnb instanceof C5593aob ? (C5593aob) fnb : null;
        if (fnb2.size() == 0) {
            return fnb;
        }
        if (fnb.size() != 0) {
            int size = fnb.size() + fnb2.size();
            if (size < 128) {
                return b(fnb, fnb2);
            }
            if (aob != null && aob.e.size() + fnb2.size() < 128) {
                fnb2 = new C5593aob(aob.d, b(aob.e, fnb2));
            } else if (aob == null || aob.d.f() <= aob.e.f() || aob.f() <= fnb2.f()) {
                if (size >= b[Math.max(fnb.f(), fnb2.f()) + 1]) {
                    return new C5593aob(fnb, fnb2);
                }
                return new a().a(fnb, fnb2);
            } else {
                fnb2 = new C5593aob(aob.d, new C5593aob(aob.e, fnb2));
            }
        }
        return fnb2;
    }

    private static Vnb b(Fnb fnb, Fnb fnb2) {
        int size = fnb.size();
        int size2 = fnb2.size();
        byte[] bArr = new byte[(size + size2)];
        fnb.a(bArr, 0, 0, size);
        fnb2.a(bArr, 0, size, size2);
        return new Vnb(bArr);
    }

    public defpackage.Fnb.a iterator() {
        return new c();
    }

    /* access modifiers changed from: protected */
    public void b(byte[] bArr, int i, int i2, int i3) {
        int i4 = i + i3;
        int i5 = this.f;
        if (i4 <= i5) {
            this.d.b(bArr, i, i2, i3);
        } else if (i >= i5) {
            this.e.b(bArr, i - i5, i2, i3);
        } else {
            int i6 = i5 - i;
            this.d.b(bArr, i, i2, i6);
            this.e.b(bArr, 0, i2 + i6, i3 - i6);
        }
    }

    /* access modifiers changed from: 0000 */
    public void b(OutputStream outputStream, int i, int i2) throws IOException {
        int i3 = i + i2;
        int i4 = this.f;
        if (i3 <= i4) {
            this.d.b(outputStream, i, i2);
        } else if (i >= i4) {
            this.e.b(outputStream, i - i4, i2);
        } else {
            int i5 = i4 - i;
            this.d.b(outputStream, i, i5);
            this.e.b(outputStream, 0, i2 - i5);
        }
    }

    /* access modifiers changed from: protected */
    public int a(int i, int i2, int i3) {
        int i4 = i2 + i3;
        int i5 = this.f;
        if (i4 <= i5) {
            return this.d.a(i, i2, i3);
        }
        if (i2 >= i5) {
            return this.e.a(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return this.e.a(this.d.a(i, i2, i6), 0, i3 - i6);
    }

    public String b(String str) throws UnsupportedEncodingException {
        return new String(l(), str);
    }

    /* access modifiers changed from: protected */
    public int b(int i, int i2, int i3) {
        int i4 = i2 + i3;
        int i5 = this.f;
        if (i4 <= i5) {
            return this.d.b(i, i2, i3);
        }
        if (i2 >= i5) {
            return this.e.b(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return this.e.b(this.d.b(i, i2, i6), 0, i3 - i6);
    }
}
