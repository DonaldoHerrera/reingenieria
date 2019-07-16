package defpackage;

import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: Fnb reason: default package */
/* compiled from: ByteString */
public abstract class Fnb implements Iterable<Byte> {
    public static final Fnb a = new Vnb(new byte[0]);

    /* renamed from: Fnb$a */
    /* compiled from: ByteString */
    public interface a extends Iterator<Byte> {
        byte nextByte();
    }

    /* renamed from: Fnb$b */
    /* compiled from: ByteString */
    public static final class b extends OutputStream {
        private static final byte[] a = new byte[0];
        private final int b;
        private final ArrayList<Fnb> c;
        private int d;
        private byte[] e;
        private int f;

        b(int i) {
            if (i >= 0) {
                this.b = i;
                this.c = new ArrayList<>();
                this.e = new byte[i];
                return;
            }
            throw new IllegalArgumentException("Buffer size < 0");
        }

        private void b() {
            int i = this.f;
            byte[] bArr = this.e;
            if (i >= bArr.length) {
                this.c.add(new Vnb(bArr));
                this.e = a;
            } else if (i > 0) {
                this.c.add(new Vnb(a(bArr, i)));
            }
            this.d += this.f;
            this.f = 0;
        }

        public synchronized Fnb a() {
            b();
            return Fnb.a((Iterable<Fnb>) this.c);
        }

        public synchronized int size() {
            return this.d + this.f;
        }

        public String toString() {
            return String.format("<ByteString.Output@%s size=%d>", new Object[]{Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size())});
        }

        public synchronized void write(int i) {
            if (this.f == this.e.length) {
                a(1);
            }
            byte[] bArr = this.e;
            int i2 = this.f;
            this.f = i2 + 1;
            bArr[i2] = (byte) i;
        }

        private byte[] a(byte[] bArr, int i) {
            byte[] bArr2 = new byte[i];
            System.arraycopy(bArr, 0, bArr2, 0, Math.min(bArr.length, i));
            return bArr2;
        }

        private void a(int i) {
            this.c.add(new Vnb(this.e));
            this.d += this.e.length;
            this.e = new byte[Math.max(this.b, Math.max(i, this.d >>> 1))];
            this.f = 0;
        }

        public synchronized void write(byte[] bArr, int i, int i2) {
            if (i2 <= this.e.length - this.f) {
                System.arraycopy(bArr, i, this.e, this.f, i2);
                this.f += i2;
            } else {
                int length = this.e.length - this.f;
                System.arraycopy(bArr, i, this.e, this.f, length);
                int i3 = i + length;
                int i4 = i2 - length;
                a(i4);
                System.arraycopy(bArr, i3, this.e, 0, i4);
                this.f = i4;
            }
        }
    }

    Fnb() {
    }

    public static Fnb a(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new Vnb(bArr2);
    }

    public static b j() {
        return new b(128);
    }

    /* access modifiers changed from: protected */
    public abstract int a(int i, int i2, int i3);

    /* access modifiers changed from: protected */
    public abstract int b(int i, int i2, int i3);

    public Fnb b(Fnb fnb) {
        int size = size();
        int size2 = fnb.size();
        if (((long) size) + ((long) size2) < 2147483647L) {
            return C5593aob.a(this, fnb);
        }
        StringBuilder sb = new StringBuilder(53);
        sb.append("ByteString would be too long: ");
        sb.append(size);
        sb.append("+");
        sb.append(size2);
        throw new IllegalArgumentException(sb.toString());
    }

    public abstract String b(String str) throws UnsupportedEncodingException;

    /* access modifiers changed from: 0000 */
    public abstract void b(OutputStream outputStream, int i, int i2) throws IOException;

    /* access modifiers changed from: protected */
    public abstract void b(byte[] bArr, int i, int i2, int i3);

    /* access modifiers changed from: protected */
    public abstract int f();

    /* access modifiers changed from: protected */
    public abstract boolean g();

    public abstract boolean h();

    public abstract Gnb i();

    public boolean isEmpty() {
        return size() == 0;
    }

    public abstract a iterator();

    /* access modifiers changed from: protected */
    public abstract int k();

    public byte[] l() {
        int size = size();
        if (size == 0) {
            return Nnb.a;
        }
        byte[] bArr = new byte[size];
        b(bArr, 0, 0, size);
        return bArr;
    }

    public String m() {
        try {
            return b("UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("UTF-8 not supported?", e);
        }
    }

    public abstract int size();

    public String toString() {
        return String.format("<ByteString@%s size=%d>", new Object[]{Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size())});
    }

    public static Fnb a(byte[] bArr) {
        return a(bArr, 0, bArr.length);
    }

    public static Fnb a(String str) {
        try {
            return new Vnb(str.getBytes("UTF-8"));
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("UTF-8 not supported?", e);
        }
    }

    public static Fnb a(Iterable<Fnb> iterable) {
        Collection collection;
        if (!(iterable instanceof Collection)) {
            collection = new ArrayList();
            for (Fnb add : iterable) {
                collection.add(add);
            }
        } else {
            collection = (Collection) iterable;
        }
        if (collection.isEmpty()) {
            return a;
        }
        return a(collection.iterator(), collection.size());
    }

    private static Fnb a(Iterator<Fnb> it, int i) {
        if (i == 1) {
            return (Fnb) it.next();
        }
        int i2 = i >>> 1;
        return a(it, i2).b(a(it, i - i2));
    }

    public void a(byte[] bArr, int i, int i2, int i3) {
        if (i < 0) {
            StringBuilder sb = new StringBuilder(30);
            sb.append("Source offset < 0: ");
            sb.append(i);
            throw new IndexOutOfBoundsException(sb.toString());
        } else if (i2 < 0) {
            StringBuilder sb2 = new StringBuilder(30);
            sb2.append("Target offset < 0: ");
            sb2.append(i2);
            throw new IndexOutOfBoundsException(sb2.toString());
        } else if (i3 >= 0) {
            int i4 = i + i3;
            if (i4 <= size()) {
                int i5 = i2 + i3;
                if (i5 > bArr.length) {
                    StringBuilder sb3 = new StringBuilder(34);
                    sb3.append("Target end offset < 0: ");
                    sb3.append(i5);
                    throw new IndexOutOfBoundsException(sb3.toString());
                } else if (i3 > 0) {
                    b(bArr, i, i2, i3);
                }
            } else {
                StringBuilder sb4 = new StringBuilder(34);
                sb4.append("Source end offset < 0: ");
                sb4.append(i4);
                throw new IndexOutOfBoundsException(sb4.toString());
            }
        } else {
            StringBuilder sb5 = new StringBuilder(23);
            sb5.append("Length < 0: ");
            sb5.append(i3);
            throw new IndexOutOfBoundsException(sb5.toString());
        }
    }

    /* access modifiers changed from: 0000 */
    public void a(OutputStream outputStream, int i, int i2) throws IOException {
        if (i < 0) {
            StringBuilder sb = new StringBuilder(30);
            sb.append("Source offset < 0: ");
            sb.append(i);
            throw new IndexOutOfBoundsException(sb.toString());
        } else if (i2 >= 0) {
            int i3 = i + i2;
            if (i3 > size()) {
                StringBuilder sb2 = new StringBuilder(39);
                sb2.append("Source end offset exceeded: ");
                sb2.append(i3);
                throw new IndexOutOfBoundsException(sb2.toString());
            } else if (i2 > 0) {
                b(outputStream, i, i2);
            }
        } else {
            StringBuilder sb3 = new StringBuilder(23);
            sb3.append("Length < 0: ");
            sb3.append(i2);
            throw new IndexOutOfBoundsException(sb3.toString());
        }
    }
}
