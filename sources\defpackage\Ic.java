package defpackage;

import android.os.Build.VERSION;
import android.view.WindowInsets;

/* renamed from: Ic reason: default package */
/* compiled from: WindowInsetsCompat */
public class Ic {
    private final Object a;

    private Ic(Object obj) {
        this.a = obj;
    }

    public Ic a() {
        if (VERSION.SDK_INT >= 20) {
            return new Ic(((WindowInsets) this.a).consumeSystemWindowInsets());
        }
        return null;
    }

    public int b() {
        if (VERSION.SDK_INT >= 20) {
            return ((WindowInsets) this.a).getSystemWindowInsetBottom();
        }
        return 0;
    }

    public int c() {
        if (VERSION.SDK_INT >= 20) {
            return ((WindowInsets) this.a).getSystemWindowInsetLeft();
        }
        return 0;
    }

    public int d() {
        if (VERSION.SDK_INT >= 20) {
            return ((WindowInsets) this.a).getSystemWindowInsetRight();
        }
        return 0;
    }

    public int e() {
        if (VERSION.SDK_INT >= 20) {
            return ((WindowInsets) this.a).getSystemWindowInsetTop();
        }
        return 0;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || Ic.class != obj.getClass()) {
            return false;
        }
        Ic ic = (Ic) obj;
        Object obj2 = this.a;
        if (obj2 != null) {
            z = obj2.equals(ic.a);
        } else if (ic.a != null) {
            z = false;
        }
        return z;
    }

    public boolean f() {
        if (VERSION.SDK_INT >= 20) {
            return ((WindowInsets) this.a).hasSystemWindowInsets();
        }
        return false;
    }

    public boolean g() {
        if (VERSION.SDK_INT >= 21) {
            return ((WindowInsets) this.a).isConsumed();
        }
        return false;
    }

    public int hashCode() {
        Object obj = this.a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public Ic a(int i, int i2, int i3, int i4) {
        if (VERSION.SDK_INT >= 20) {
            return new Ic(((WindowInsets) this.a).replaceSystemWindowInsets(i, i2, i3, i4));
        }
        return null;
    }

    static Ic a(Object obj) {
        if (obj == null) {
            return null;
        }
        return new Ic(obj);
    }

    static Object a(Ic ic) {
        if (ic == null) {
            return null;
        }
        return ic.a;
    }
}
