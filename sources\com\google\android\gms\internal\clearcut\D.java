package com.google.android.gms.internal.clearcut;

final class D extends H {
    private final int e;
    private final int f;

    D(byte[] bArr, int i, int i2) {
        super(bArr);
        A.b(i, i + i2, bArr.length);
        this.e = i;
        this.f = i2;
    }

    public final byte c(int i) {
        int size = size();
        if (((size - (i + 1)) | i) >= 0) {
            return this.d[this.e + i];
        }
        if (i < 0) {
            StringBuilder sb = new StringBuilder(22);
            sb.append("Index < 0: ");
            sb.append(i);
            throw new ArrayIndexOutOfBoundsException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder(40);
        sb2.append("Index > length: ");
        sb2.append(i);
        sb2.append(", ");
        sb2.append(size);
        throw new ArrayIndexOutOfBoundsException(sb2.toString());
    }

    /* access modifiers changed from: protected */
    public final int i() {
        return this.e;
    }

    public final int size() {
        return this.f;
    }
}
