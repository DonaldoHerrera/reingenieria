package defpackage;

import java.util.Arrays;

/* renamed from: ro reason: default package and case insensitive filesystem */
/* compiled from: NalUnitTargetBuffer */
final class C1670ro {
    private final int a;
    private boolean b;
    private boolean c;
    public byte[] d;
    public int e;

    public C1670ro(int i, int i2) {
        this.a = i;
        this.d = new byte[(i2 + 3)];
        this.d[2] = 1;
    }

    public boolean a() {
        return this.c;
    }

    public void b() {
        this.b = false;
        this.c = false;
    }

    public void a(byte[] bArr, int i, int i2) {
        if (this.b) {
            int i3 = i2 - i;
            byte[] bArr2 = this.d;
            int length = bArr2.length;
            int i4 = this.e;
            if (length < i4 + i3) {
                this.d = Arrays.copyOf(bArr2, (i4 + i3) * 2);
            }
            System.arraycopy(bArr, i, this.d, this.e, i3);
            this.e += i3;
        }
    }

    public void b(int i) {
        boolean z = true;
        C1852xq.b(!this.b);
        if (i != this.a) {
            z = false;
        }
        this.b = z;
        if (this.b) {
            this.e = 3;
            this.c = false;
        }
    }

    public boolean a(int i) {
        if (!this.b) {
            return false;
        }
        this.e -= i;
        this.b = false;
        this.c = true;
        return true;
    }
}
