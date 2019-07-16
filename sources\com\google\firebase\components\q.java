package com.google.firebase.components;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;

@KeepForSdk
/* compiled from: com.google.firebase:firebase-common@@17.0.0 */
public final class q {
    private final Class<?> a;
    private final int b;
    private final int c;

    private q(Class<?> cls, int i, int i2) {
        Preconditions.checkNotNull(cls, "Null dependency anInterface.");
        this.a = cls;
        this.b = i;
        this.c = i2;
    }

    @KeepForSdk
    public static q a(Class<?> cls) {
        return new q(cls, 0, 0);
    }

    @KeepForSdk
    public static q b(Class<?> cls) {
        return new q(cls, 1, 0);
    }

    @KeepForSdk
    public static q c(Class<?> cls) {
        return new q(cls, 2, 0);
    }

    public boolean d() {
        return this.b == 2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        if (this.a == qVar.a && this.b == qVar.b && this.c == qVar.c) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.a);
        sb.append(", type=");
        int i = this.b;
        boolean z = true;
        String str = i == 1 ? "required" : i == 0 ? "optional" : "set";
        sb.append(str);
        sb.append(", direct=");
        if (this.c != 0) {
            z = false;
        }
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }

    public Class<?> a() {
        return this.a;
    }

    public boolean b() {
        return this.c == 0;
    }

    public boolean c() {
        return this.b == 1;
    }
}
