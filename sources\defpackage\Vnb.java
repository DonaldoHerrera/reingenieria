package defpackage;

import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.NoSuchElementException;

/* renamed from: Vnb reason: default package */
/* compiled from: LiteralByteString */
class Vnb extends Fnb {
    protected final byte[] b;
    private int c = 0;

    /* renamed from: Vnb$a */
    /* compiled from: LiteralByteString */
    private class a implements defpackage.Fnb.a {
        private int a;
        private final int b;

        public boolean hasNext() {
            return this.a < this.b;
        }

        public byte nextByte() {
            try {
                byte[] bArr = Vnb.this.b;
                int i = this.a;
                this.a = i + 1;
                return bArr[i];
            } catch (ArrayIndexOutOfBoundsException e) {
                throw new NoSuchElementException(e.getMessage());
            }
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }

        private a() {
            this.a = 0;
            this.b = Vnb.this.size();
        }

        public Byte next() {
            return Byte.valueOf(nextByte());
        }
    }

    Vnb(byte[] bArr) {
        this.b = bArr;
    }

    /* access modifiers changed from: 0000 */
    public boolean a(Vnb vnb, int i, int i2) {
        if (i2 > vnb.size()) {
            int size = size();
            StringBuilder sb = new StringBuilder(40);
            sb.append("Length too large: ");
            sb.append(i2);
            sb.append(size);
            throw new IllegalArgumentException(sb.toString());
        } else if (i + i2 <= vnb.size()) {
            byte[] bArr = this.b;
            byte[] bArr2 = vnb.b;
            int n = n() + i2;
            int n2 = n();
            int n3 = vnb.n() + i;
            while (n2 < n) {
                if (bArr[n2] != bArr2[n3]) {
                    return false;
                }
                n2++;
                n3++;
            }
            return true;
        } else {
            int size2 = vnb.size();
            StringBuilder sb2 = new StringBuilder(59);
            sb2.append("Ran off end of other: ");
            sb2.append(i);
            String str = ", ";
            sb2.append(str);
            sb2.append(i2);
            sb2.append(str);
            sb2.append(size2);
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    /* access modifiers changed from: protected */
    public void b(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.b, i, bArr, i2, i3);
    }

    public byte c(int i) {
        return this.b[i];
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Fnb) || size() != ((Fnb) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (obj instanceof Vnb) {
            return a((Vnb) obj, 0, size());
        }
        if (obj instanceof C5593aob) {
            return obj.equals(this);
        }
        String valueOf = String.valueOf(String.valueOf(obj.getClass()));
        StringBuilder sb = new StringBuilder(valueOf.length() + 49);
        sb.append("Has a new type of ByteString been created? Found ");
        sb.append(valueOf);
        throw new IllegalArgumentException(sb.toString());
    }

    /* access modifiers changed from: protected */
    public int f() {
        return 0;
    }

    /* access modifiers changed from: protected */
    public boolean g() {
        return true;
    }

    public boolean h() {
        int n = n();
        return C6733job.a(this.b, n, size() + n);
    }

    public int hashCode() {
        int i = this.c;
        if (i == 0) {
            int size = size();
            i = a(size, 0, size);
            if (i == 0) {
                i = 1;
            }
            this.c = i;
        }
        return i;
    }

    public Gnb i() {
        return Gnb.a(this);
    }

    /* access modifiers changed from: protected */
    public int k() {
        return this.c;
    }

    /* access modifiers changed from: protected */
    public int n() {
        return 0;
    }

    public int size() {
        return this.b.length;
    }

    /* access modifiers changed from: 0000 */
    public void b(OutputStream outputStream, int i, int i2) throws IOException {
        outputStream.write(this.b, n() + i, i2);
    }

    public defpackage.Fnb.a iterator() {
        return new a();
    }

    public String b(String str) throws UnsupportedEncodingException {
        return new String(this.b, n(), size(), str);
    }

    /* access modifiers changed from: protected */
    public int b(int i, int i2, int i3) {
        int n = n() + i2;
        return C6733job.a(i, this.b, n, i3 + n);
    }

    /* access modifiers changed from: protected */
    public int a(int i, int i2, int i3) {
        return a(i, this.b, n() + i2, i3);
    }

    static int a(int i, byte[] bArr, int i2, int i3) {
        int i4 = i;
        for (int i5 = i2; i5 < i2 + i3; i5++) {
            i4 = (i4 * 31) + bArr[i5];
        }
        return i4;
    }
}
