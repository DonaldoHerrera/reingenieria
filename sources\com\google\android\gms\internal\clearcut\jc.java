package com.google.android.gms.internal.clearcut;

import java.io.IOException;
import java.util.Arrays;

public final class jc extends Rb<jc> implements Cloneable {
    private byte[] c = Zb.h;
    private String d = "";
    private byte[][] e = Zb.g;
    private boolean f = false;

    /* access modifiers changed from: private */
    /* renamed from: m */
    public final jc clone() {
        try {
            jc jcVar = (jc) super.clone();
            byte[][] bArr = this.e;
            if (bArr != null && bArr.length > 0) {
                jcVar.e = (byte[][]) bArr.clone();
            }
            return jcVar;
        } catch (CloneNotSupportedException e2) {
            throw new AssertionError(e2);
        }
    }

    public final void a(Pb pb) throws IOException {
        if (!Arrays.equals(this.c, Zb.h)) {
            pb.a(1, this.c);
        }
        byte[][] bArr = this.e;
        if (bArr != null && bArr.length > 0) {
            int i = 0;
            while (true) {
                byte[][] bArr2 = this.e;
                if (i >= bArr2.length) {
                    break;
                }
                byte[] bArr3 = bArr2[i];
                if (bArr3 != null) {
                    pb.a(2, bArr3);
                }
                i++;
            }
        }
        String str = this.d;
        if (str != null && !str.equals("")) {
            pb.a(4, this.d);
        }
        super.a(pb);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof jc)) {
            return false;
        }
        jc jcVar = (jc) obj;
        if (!Arrays.equals(this.c, jcVar.c)) {
            return false;
        }
        String str = this.d;
        if (str == null) {
            if (jcVar.d != null) {
                return false;
            }
        } else if (!str.equals(jcVar.d)) {
            return false;
        }
        if (!Vb.a(this.e, jcVar.e)) {
            return false;
        }
        Tb tb = this.b;
        if (tb != null && !tb.i()) {
            return this.b.equals(jcVar.b);
        }
        Tb tb2 = jcVar.b;
        return tb2 == null || tb2.i();
    }

    public final int hashCode() {
        int hashCode = (((jc.class.getName().hashCode() + 527) * 31) + Arrays.hashCode(this.c)) * 31;
        String str = this.d;
        int i = 0;
        int hashCode2 = (((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + Vb.a(this.e)) * 31) + 1237) * 31;
        Tb tb = this.b;
        if (tb != null && !tb.i()) {
            i = this.b.hashCode();
        }
        return hashCode2 + i;
    }

    /* access modifiers changed from: protected */
    public final int j() {
        int j = super.j();
        if (!Arrays.equals(this.c, Zb.h)) {
            j += Pb.b(1, this.c);
        }
        byte[][] bArr = this.e;
        if (bArr != null && bArr.length > 0) {
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (true) {
                byte[][] bArr2 = this.e;
                if (i >= bArr2.length) {
                    break;
                }
                byte[] bArr3 = bArr2[i];
                if (bArr3 != null) {
                    i3++;
                    i2 += Pb.b(bArr3);
                }
                i++;
            }
            j = j + i2 + (i3 * 1);
        }
        String str = this.d;
        return (str == null || str.equals("")) ? j : j + Pb.b(4, this.d);
    }

    public final /* synthetic */ Wb k() throws CloneNotSupportedException {
        return (jc) clone();
    }

    public final /* synthetic */ Rb l() throws CloneNotSupportedException {
        return (jc) clone();
    }
}
