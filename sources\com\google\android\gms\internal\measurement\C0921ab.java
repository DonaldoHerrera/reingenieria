package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.ab reason: case insensitive filesystem */
final class C0921ab extends C0970hb {
    private final int f;
    private final int g;

    C0921ab(byte[] bArr, int i, int i2) {
        super(bArr);
        Ya.b(i, i + i2, bArr.length);
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
