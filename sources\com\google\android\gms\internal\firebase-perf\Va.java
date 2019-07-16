package com.google.android.gms.internal.firebase-perf;

final class Va extends Ya {
    private final int f;
    private final int g;

    Va(byte[] bArr, int i, int i2) {
        super(bArr);
        Oa.b(i, i + i2, bArr.length);
        this.f = i;
        this.g = i2;
    }

    public final byte c(int i) {
        int size = size();
        if (((size - (i + 1)) | i) >= 0) {
            return this.e[this.f + i];
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
        return this.f;
    }

    /* access modifiers changed from: 0000 */
    public final byte m(int i) {
        return this.e[this.f + i];
    }

    public final int size() {
        return this.g;
    }
}
