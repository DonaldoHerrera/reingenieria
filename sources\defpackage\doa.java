package defpackage;

import android.view.View;

/* renamed from: doa reason: default package */
/* compiled from: ProgressHelper */
public abstract class doa {
    private final int a;
    private final int b;

    protected doa(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public int a() {
        return this.b;
    }

    public abstract Zna a(View view, float f);

    public abstract void b(View view, float f);

    public void c(View view, float f) {
        b(view, a(f));
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        doa doa = (doa) obj;
        if (!(this.b == doa.b && this.a == doa.a)) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return (this.a * 31) + this.b;
    }

    public float a(int i) {
        float f = (float) i;
        int i2 = this.a;
        return (f - ((float) i2)) / ((float) (this.b - i2));
    }

    /* access modifiers changed from: protected */
    public float a(float f) {
        int i = this.a;
        return ((float) i) + (((float) (this.b - i)) * f);
    }
}
