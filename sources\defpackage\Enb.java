package defpackage;

import java.util.NoSuchElementException;

/* renamed from: Enb reason: default package */
/* compiled from: BoundedByteString */
class Enb extends Vnb {
    private final int d;
    private final int e;

    /* renamed from: Enb$a */
    /* compiled from: BoundedByteString */
    private class a implements defpackage.Fnb.a {
        private int a;
        private final int b;

        public boolean hasNext() {
            return this.a < this.b;
        }

        public byte nextByte() {
            int i = this.a;
            if (i < this.b) {
                byte[] bArr = Enb.this.b;
                this.a = i + 1;
                return bArr[i];
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }

        private a() {
            this.a = Enb.this.n();
            this.b = this.a + Enb.this.size();
        }

        public Byte next() {
            return Byte.valueOf(nextByte());
        }
    }

    Enb(byte[] bArr, int i, int i2) {
        super(bArr);
        if (i < 0) {
            StringBuilder sb = new StringBuilder(29);
            sb.append("Offset too small: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        } else if (i2 < 0) {
            StringBuilder sb2 = new StringBuilder(29);
            sb2.append("Length too small: ");
            sb2.append(i);
            throw new IllegalArgumentException(sb2.toString());
        } else if (((long) i) + ((long) i2) <= ((long) bArr.length)) {
            this.d = i;
            this.e = i2;
        } else {
            StringBuilder sb3 = new StringBuilder(48);
            sb3.append("Offset+Length too large: ");
            sb3.append(i);
            sb3.append("+");
            sb3.append(i2);
            throw new IllegalArgumentException(sb3.toString());
        }
    }

    /* access modifiers changed from: protected */
    public void b(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.b, n() + i, bArr, i2, i3);
    }

    public byte c(int i) {
        if (i < 0) {
            StringBuilder sb = new StringBuilder(28);
            sb.append("Index too small: ");
            sb.append(i);
            throw new ArrayIndexOutOfBoundsException(sb.toString());
        } else if (i < size()) {
            return this.b[this.d + i];
        } else {
            int size = size();
            StringBuilder sb2 = new StringBuilder(41);
            sb2.append("Index too large: ");
            sb2.append(i);
            sb2.append(", ");
            sb2.append(size);
            throw new ArrayIndexOutOfBoundsException(sb2.toString());
        }
    }

    /* access modifiers changed from: protected */
    public int n() {
        return this.d;
    }

    public int size() {
        return this.e;
    }

    public defpackage.Fnb.a iterator() {
        return new a();
    }
}
