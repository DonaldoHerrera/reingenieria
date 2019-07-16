package defpackage;

/* renamed from: lF reason: default package and case insensitive filesystem */
/* compiled from: BinaryShiftToken */
final class C3103lF extends C3228rF {
    private final short c;
    private final short d;

    C3103lF(C3228rF rFVar, int i, int i2) {
        super(rFVar);
        this.c = (short) i;
        this.d = (short) i2;
    }

    public void a(C3248sF sFVar, byte[] bArr) {
        int i = 0;
        while (true) {
            short s = this.d;
            if (i < s) {
                if (i == 0 || (i == 31 && s <= 62)) {
                    sFVar.a(31, 5);
                    short s2 = this.d;
                    if (s2 > 62) {
                        sFVar.a(s2 - 31, 16);
                    } else if (i == 0) {
                        sFVar.a(Math.min(s2, 31), 5);
                    } else {
                        sFVar.a(s2 - 31, 5);
                    }
                }
                sFVar.a(bArr[this.c + i], 8);
                i++;
            } else {
                return;
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("<");
        sb.append(this.c);
        sb.append("::");
        sb.append((this.c + this.d) - 1);
        sb.append('>');
        return sb.toString();
    }
}
