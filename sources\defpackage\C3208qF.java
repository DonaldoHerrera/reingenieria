package defpackage;

import java.util.LinkedList;

/* renamed from: qF reason: default package and case insensitive filesystem */
/* compiled from: State */
final class C3208qF {
    static final C3208qF a = new C3208qF(C3228rF.a, 0, 0, 0);
    private final int b;
    private final C3228rF c;
    private final int d;
    private final int e;

    private C3208qF(C3228rF rFVar, int i, int i2, int i3) {
        this.c = rFVar;
        this.b = i;
        this.d = i2;
        this.e = i3;
    }

    /* access modifiers changed from: 0000 */
    public int a() {
        return this.d;
    }

    /* access modifiers changed from: 0000 */
    public int b() {
        return this.e;
    }

    /* access modifiers changed from: 0000 */
    public int c() {
        return this.b;
    }

    public String toString() {
        return String.format("%s bits=%d bytes=%d", new Object[]{C3170oF.a[this.b], Integer.valueOf(this.e), Integer.valueOf(this.d)});
    }

    /* access modifiers changed from: 0000 */
    public C3208qF a(int i, int i2) {
        int i3 = this.e;
        C3228rF rFVar = this.c;
        int i4 = this.b;
        if (i != i4) {
            int i5 = C3170oF.b[i4][i];
            int i6 = 65535 & i5;
            int i7 = i5 >> 16;
            rFVar = rFVar.a(i6, i7);
            i3 += i7;
        }
        int i8 = i == 2 ? 4 : 5;
        return new C3208qF(rFVar.a(i2, i8), i, 0, i3 + i8);
    }

    /* access modifiers changed from: 0000 */
    public C3208qF b(int i, int i2) {
        C3228rF rFVar = this.c;
        int i3 = this.b == 2 ? 4 : 5;
        return new C3208qF(rFVar.a(C3170oF.d[this.b][i], i3).a(i2, 5), this.b, 0, this.e + i3 + 5);
    }

    /* access modifiers changed from: 0000 */
    public C3208qF b(int i) {
        int i2 = this.d;
        if (i2 == 0) {
            return this;
        }
        return new C3208qF(this.c.b(i - i2, i2), this.b, 0, this.e);
    }

    /* access modifiers changed from: 0000 */
    public C3208qF a(int i) {
        C3228rF rFVar = this.c;
        int i2 = this.b;
        int i3 = this.e;
        if (i2 == 4 || i2 == 2) {
            int i4 = C3170oF.b[i2][0];
            int i5 = 65535 & i4;
            int i6 = i4 >> 16;
            rFVar = rFVar.a(i5, i6);
            i3 += i6;
            i2 = 0;
        }
        int i7 = this.d;
        int i8 = (i7 == 0 || i7 == 31) ? 18 : i7 == 62 ? 9 : 8;
        C3208qF qFVar = new C3208qF(rFVar, i2, this.d + 1, i3 + i8);
        return qFVar.d == 2078 ? qFVar.b(i + 1) : qFVar;
    }

    /* access modifiers changed from: 0000 */
    public boolean a(C3208qF qFVar) {
        int i = this.e + (C3170oF.b[this.b][qFVar.b] >> 16);
        int i2 = qFVar.d;
        if (i2 > 0) {
            int i3 = this.d;
            if (i3 == 0 || i3 > i2) {
                i += 10;
            }
        }
        return i <= qFVar.e;
    }

    /* access modifiers changed from: 0000 */
    public C3248sF a(byte[] bArr) {
        LinkedList<C3228rF> linkedList = new LinkedList<>();
        for (C3228rF rFVar = b(bArr.length).c; rFVar != null; rFVar = rFVar.a()) {
            linkedList.addFirst(rFVar);
        }
        C3248sF sFVar = new C3248sF();
        for (C3228rF a2 : linkedList) {
            a2.a(sFVar, bArr);
        }
        return sFVar;
    }
}
