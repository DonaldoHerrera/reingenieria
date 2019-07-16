package com.google.android.gms.internal.measurement;

import java.util.Arrays;

final class Gd {
    final int a;
    final byte[] b;

    Gd(int i, byte[] bArr) {
        this.a = i;
        this.b = bArr;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Gd)) {
            return false;
        }
        Gd gd = (Gd) obj;
        return this.a == gd.a && Arrays.equals(this.b, gd.b);
    }

    public final int hashCode() {
        return ((this.a + 527) * 31) + Arrays.hashCode(this.b);
    }
}
