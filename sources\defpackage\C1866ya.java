package defpackage;

import java.util.Arrays;

/* renamed from: ya reason: default package and case insensitive filesystem */
/* compiled from: Helper */
public class C1866ya extends C1716ta {
    protected C1716ta[] va = new C1716ta[4];
    protected int wa = 0;

    public void J() {
        this.wa = 0;
    }

    public void b(C1716ta taVar) {
        int i = this.wa + 1;
        C1716ta[] taVarArr = this.va;
        if (i > taVarArr.length) {
            this.va = (C1716ta[]) Arrays.copyOf(taVarArr, taVarArr.length * 2);
        }
        C1716ta[] taVarArr2 = this.va;
        int i2 = this.wa;
        taVarArr2[i2] = taVar;
        this.wa = i2 + 1;
    }
}
