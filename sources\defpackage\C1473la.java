package defpackage;

import java.util.Arrays;

/* renamed from: la reason: default package and case insensitive filesystem */
/* compiled from: SolverVariable */
public class C1473la {
    private static int a = 1;
    private String b;
    public int c = -1;
    int d = -1;
    public int e = 0;
    public float f;
    float[] g = new float[7];
    a h;
    C1257ea[] i = new C1257ea[8];
    int j = 0;
    public int k = 0;

    /* renamed from: la$a */
    /* compiled from: SolverVariable */
    public enum a {
        UNRESTRICTED,
        CONSTANT,
        SLACK,
        ERROR,
        UNKNOWN
    }

    public C1473la(a aVar, String str) {
        this.h = aVar;
    }

    static void a() {
        a++;
    }

    public final void b(C1257ea eaVar) {
        int i2 = this.j;
        for (int i3 = 0; i3 < i2; i3++) {
            if (this.i[i3] == eaVar) {
                for (int i4 = 0; i4 < (i2 - i3) - 1; i4++) {
                    C1257ea[] eaVarArr = this.i;
                    int i5 = i3 + i4;
                    eaVarArr[i5] = eaVarArr[i5 + 1];
                }
                this.j--;
                return;
            }
        }
    }

    public final void c(C1257ea eaVar) {
        int i2 = this.j;
        for (int i3 = 0; i3 < i2; i3++) {
            C1257ea[] eaVarArr = this.i;
            eaVarArr[i3].d.a(eaVarArr[i3], eaVar, false);
        }
        this.j = 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("");
        sb.append(this.b);
        return sb.toString();
    }

    public final void a(C1257ea eaVar) {
        int i2 = 0;
        while (true) {
            int i3 = this.j;
            if (i2 >= i3) {
                C1257ea[] eaVarArr = this.i;
                if (i3 >= eaVarArr.length) {
                    this.i = (C1257ea[]) Arrays.copyOf(eaVarArr, eaVarArr.length * 2);
                }
                C1257ea[] eaVarArr2 = this.i;
                int i4 = this.j;
                eaVarArr2[i4] = eaVar;
                this.j = i4 + 1;
                return;
            } else if (this.i[i2] != eaVar) {
                i2++;
            } else {
                return;
            }
        }
    }

    public void b() {
        this.b = null;
        this.h = a.UNKNOWN;
        this.e = 0;
        this.c = -1;
        this.d = -1;
        this.f = 0.0f;
        this.j = 0;
        this.k = 0;
    }

    public void a(a aVar, String str) {
        this.h = aVar;
    }
}
