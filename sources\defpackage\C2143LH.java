package defpackage;

import android.os.Looper;

/* renamed from: LH reason: default package and case insensitive filesystem */
/* compiled from: Preconditions */
public final class C2143LH {
    public static void a(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static boolean a(GPa<?> gPa) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return true;
        }
        gPa.a(WPa.b());
        StringBuilder sb = new StringBuilder();
        sb.append("Expected to be called on the main thread but was ");
        sb.append(Thread.currentThread().getName());
        gPa.a((Throwable) new IllegalStateException(sb.toString()));
        return false;
    }
}
