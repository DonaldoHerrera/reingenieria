package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.C1074yd;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.measurement.yd reason: case insensitive filesystem */
public abstract class C1074yd<M extends C1074yd<M>> extends Ed {
    protected Ad b = null;

    /* access modifiers changed from: protected */
    public int a() {
        if (this.b == null) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < this.b.j(); i2++) {
            i += this.b.b(i2).i();
        }
        return i;
    }

    public final /* synthetic */ Ed c() throws CloneNotSupportedException {
        return (C1074yd) clone();
    }

    public /* synthetic */ Object clone() throws CloneNotSupportedException {
        C1074yd ydVar = (C1074yd) super.clone();
        Cd.a(this, ydVar);
        return ydVar;
    }

    public void a(C1062wd wdVar) throws IOException {
        if (this.b != null) {
            for (int i = 0; i < this.b.j(); i++) {
                this.b.b(i).a(wdVar);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final boolean a(C1044td tdVar, int i) throws IOException {
        int a = tdVar.a();
        if (!tdVar.a(i)) {
            return false;
        }
        int i2 = i >>> 3;
        Gd gd = new Gd(i, tdVar.a(a, tdVar.a() - a));
        C1080zd zdVar = null;
        Ad ad = this.b;
        if (ad == null) {
            this.b = new Ad();
        } else {
            zdVar = ad.a(i2);
        }
        if (zdVar == null) {
            zdVar = new C1080zd();
            this.b.a(i2, zdVar);
        }
        zdVar.a(gd);
        return true;
    }
}
