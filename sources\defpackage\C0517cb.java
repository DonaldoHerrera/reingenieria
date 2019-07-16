package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build.VERSION;
import android.os.CancellationSignal;
import android.os.Handler;

/* renamed from: cb reason: default package and case insensitive filesystem */
/* compiled from: TypefaceCompat */
public class C0517cb {
    private static final C1412jb a;
    private static final Z<String, Typeface> b = new Z<>(16);

    static {
        int i = VERSION.SDK_INT;
        if (i >= 28) {
            a = new C1320gb();
        } else if (i >= 26) {
            a = new C1289fb();
        } else if (i >= 24 && C1258eb.a()) {
            a = new C1258eb();
        } else if (VERSION.SDK_INT >= 21) {
            a = new C1228db();
        } else {
            a = new C1412jb();
        }
    }

    public static Typeface a(Resources resources, int i, int i2) {
        return (Typeface) b.get(b(resources, i, i2));
    }

    private static String b(Resources resources, int i, int i2) {
        StringBuilder sb = new StringBuilder();
        sb.append(resources.getResourcePackageName(i));
        String str = "-";
        sb.append(str);
        sb.append(i);
        sb.append(str);
        sb.append(i2);
        return sb.toString();
    }

    public static Typeface a(Context context, a aVar, Resources resources, int i, int i2, a aVar2, Handler handler, boolean z) {
        Typeface typeface;
        if (aVar instanceof d) {
            d dVar = (d) aVar;
            boolean z2 = false;
            if (!z ? aVar2 == null : dVar.a() == 0) {
                z2 = true;
            }
            typeface = C0193Bb.a(context, dVar.b(), aVar2, handler, z2, z ? dVar.c() : -1, i2);
        } else {
            typeface = a.a(context, (b) aVar, resources, i2);
            if (aVar2 != null) {
                if (typeface != null) {
                    aVar2.a(typeface, handler);
                } else {
                    aVar2.a(-3, handler);
                }
            }
        }
        if (typeface != null) {
            b.put(b(resources, i, i2), typeface);
        }
        return typeface;
    }

    public static Typeface a(Context context, Resources resources, int i, String str, int i2) {
        Typeface a2 = a.a(context, resources, i, str, i2);
        if (a2 != null) {
            b.put(b(resources, i, i2), a2);
        }
        return a2;
    }

    public static Typeface a(Context context, CancellationSignal cancellationSignal, b[] bVarArr, int i) {
        return a.a(context, cancellationSignal, bVarArr, i);
    }
}
