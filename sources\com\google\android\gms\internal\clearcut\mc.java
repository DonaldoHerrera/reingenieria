package com.google.android.gms.internal.clearcut;

import java.io.IOException;

public final class mc extends Rb<mc> implements Cloneable {
    private static volatile mc[] c;
    private String d;
    private String e;

    public mc() {
        String str = "";
        this.d = str;
        this.e = str;
    }

    public static mc[] m() {
        if (c == null) {
            synchronized (Vb.c) {
                if (c == null) {
                    c = new mc[0];
                }
            }
        }
        return c;
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public final mc clone() {
        try {
            return (mc) super.clone();
        } catch (CloneNotSupportedException e2) {
            throw new AssertionError(e2);
        }
    }

    public final void a(Pb pb) throws IOException {
        String str = this.d;
        String str2 = "";
        if (str != null && !str.equals(str2)) {
            pb.a(1, this.d);
        }
        String str3 = this.e;
        if (str3 != null && !str3.equals(str2)) {
            pb.a(2, this.e);
        }
        super.a(pb);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof mc)) {
            return false;
        }
        mc mcVar = (mc) obj;
        String str = this.d;
        if (str == null) {
            if (mcVar.d != null) {
                return false;
            }
        } else if (!str.equals(mcVar.d)) {
            return false;
        }
        String str2 = this.e;
        if (str2 == null) {
            if (mcVar.e != null) {
                return false;
            }
        } else if (!str2.equals(mcVar.e)) {
            return false;
        }
        Tb tb = this.b;
        if (tb != null && !tb.i()) {
            return this.b.equals(mcVar.b);
        }
        Tb tb2 = mcVar.b;
        return tb2 == null || tb2.i();
    }

    public final int hashCode() {
        int hashCode = (mc.class.getName().hashCode() + 527) * 31;
        String str = this.d;
        int i = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Tb tb = this.b;
        if (tb != null && !tb.i()) {
            i = this.b.hashCode();
        }
        return hashCode3 + i;
    }

    /* access modifiers changed from: protected */
    public final int j() {
        int j = super.j();
        String str = this.d;
        String str2 = "";
        if (str != null && !str.equals(str2)) {
            j += Pb.b(1, this.d);
        }
        String str3 = this.e;
        return (str3 == null || str3.equals(str2)) ? j : j + Pb.b(2, this.e);
    }

    public final /* synthetic */ Wb k() throws CloneNotSupportedException {
        return (mc) clone();
    }

    public final /* synthetic */ Rb l() throws CloneNotSupportedException {
        return (mc) clone();
    }
}
