package com.google.android.gms.internal.clearcut;

import java.io.IOException;

public class Wb {
    protected volatile int a = -1;

    public static final void a(Wb wb, byte[] bArr, int i, int i2) {
        try {
            Pb a2 = Pb.a(bArr, 0, i2);
            wb.a(a2);
            a2.a();
        } catch (IOException e) {
            throw new RuntimeException("Serializing to a byte array threw an IOException (should never happen).", e);
        }
    }

    public void a(Pb pb) throws IOException {
    }

    public final int i() {
        int j = j();
        this.a = j;
        return j;
    }

    /* access modifiers changed from: protected */
    public int j() {
        return 0;
    }

    /* renamed from: k */
    public Wb clone() throws CloneNotSupportedException {
        return (Wb) super.clone();
    }

    public String toString() {
        return Yb.a(this);
    }
}
