package defpackage;

/* renamed from: pF reason: default package and case insensitive filesystem */
/* compiled from: SimpleToken */
final class C3189pF extends C3228rF {
    private final short c;
    private final short d;

    C3189pF(C3228rF rFVar, int i, int i2) {
        super(rFVar);
        this.c = (short) i;
        this.d = (short) i2;
    }

    /* access modifiers changed from: 0000 */
    public void a(C3248sF sFVar, byte[] bArr) {
        sFVar.a(this.c, this.d);
    }

    public String toString() {
        short s = this.c;
        short s2 = this.d;
        short s3 = (s & ((1 << s2) - 1)) | (1 << s2);
        StringBuilder sb = new StringBuilder("<");
        sb.append(Integer.toBinaryString(s3 | (1 << this.d)).substring(1));
        sb.append('>');
        return sb.toString();
    }
}
