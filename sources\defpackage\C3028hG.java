package defpackage;

import java.lang.reflect.Array;

/* renamed from: hG reason: default package and case insensitive filesystem */
/* compiled from: BarcodeMatrix */
public final class C3028hG {
    private final C3047iG[] a;
    private int b;
    private final int c;
    private final int d;

    C3028hG(int i, int i2) {
        this.a = new C3047iG[i];
        int length = this.a.length;
        for (int i3 = 0; i3 < length; i3++) {
            this.a[i3] = new C3047iG(((i2 + 4) * 17) + 1);
        }
        this.d = i2 * 17;
        this.c = i;
        this.b = -1;
    }

    /* access modifiers changed from: 0000 */
    public C3047iG a() {
        return this.a[this.b];
    }

    /* access modifiers changed from: 0000 */
    public void b() {
        this.b++;
    }

    public byte[][] a(int i, int i2) {
        byte[][] bArr = (byte[][]) Array.newInstance(byte.class, new int[]{this.c * i2, this.d * i});
        int i3 = this.c * i2;
        for (int i4 = 0; i4 < i3; i4++) {
            bArr[(i3 - i4) - 1] = this.a[i4 / i2].a(i);
        }
        return bArr;
    }
}
