package com.google.android.gms.internal.measurement;

import java.io.IOException;

public abstract class Ed {
    protected volatile int a = -1;

    /* access modifiers changed from: protected */
    public int a() {
        return 0;
    }

    public abstract Ed a(C1044td tdVar) throws IOException;

    public void a(C1062wd wdVar) throws IOException {
    }

    public final int b() {
        int a2 = a();
        this.a = a2;
        return a2;
    }

    /* renamed from: c */
    public Ed clone() throws CloneNotSupportedException {
        return (Ed) super.clone();
    }

    public String toString() {
        return Dd.a(this);
    }
}
