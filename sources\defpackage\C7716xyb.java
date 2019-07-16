package defpackage;

import java.io.IOException;

/* renamed from: xyb reason: default package and case insensitive filesystem */
/* compiled from: RequestBody */
class C7716xyb extends C7854zyb {
    final /* synthetic */ C7233qyb a;
    final /* synthetic */ int b;
    final /* synthetic */ byte[] c;
    final /* synthetic */ int d;

    C7716xyb(C7233qyb qyb, int i, byte[] bArr, int i2) {
        this.a = qyb;
        this.b = i;
        this.c = bArr;
        this.d = i2;
    }

    public long a() {
        return (long) this.b;
    }

    public C7233qyb b() {
        return this.a;
    }

    public void a(C6893mAb mab) throws IOException {
        mab.write(this.c, this.d, this.b);
    }
}
