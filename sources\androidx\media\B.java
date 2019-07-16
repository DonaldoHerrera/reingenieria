package androidx.media;

import android.text.TextUtils;

/* compiled from: MediaSessionManagerImplBase */
class B implements z {
    private String a;
    private int b;
    private int c;

    B(String str, int i, int i2) {
        this.a = str;
        this.b = i;
        this.c = i2;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof B)) {
            return false;
        }
        B b2 = (B) obj;
        if (!(TextUtils.equals(this.a, b2.a) && this.b == b2.b && this.c == b2.c)) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return C0243Pb.a(this.a, Integer.valueOf(this.b), Integer.valueOf(this.c));
    }
}
