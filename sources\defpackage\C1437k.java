package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import androidx.appcompat.widget.C0350q;
import java.util.WeakHashMap;

/* renamed from: k reason: default package and case insensitive filesystem */
/* compiled from: AppCompatResources */
public final class C1437k {
    private static final ThreadLocal<TypedValue> a = new ThreadLocal<>();
    private static final WeakHashMap<Context, SparseArray<a>> b = new WeakHashMap<>(0);
    private static final Object c = new Object();

    /* renamed from: k$a */
    /* compiled from: AppCompatResources */
    private static class a {
        final ColorStateList a;
        final Configuration b;

        a(ColorStateList colorStateList, Configuration configuration) {
            this.a = colorStateList;
            this.b = configuration;
        }
    }

    public static ColorStateList a(Context context, int i) {
        if (VERSION.SDK_INT >= 23) {
            return context.getColorStateList(i);
        }
        ColorStateList c2 = c(context, i);
        if (c2 != null) {
            return c2;
        }
        ColorStateList d = d(context, i);
        if (d == null) {
            return androidx.core.content.a.b(context, i);
        }
        a(context, i, d);
        return d;
    }

    public static Drawable b(Context context, int i) {
        return C0350q.a().a(context, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0034, code lost:
        return null;
     */
    private static ColorStateList c(Context context, int i) {
        synchronized (c) {
            SparseArray sparseArray = (SparseArray) b.get(context);
            if (sparseArray != null && sparseArray.size() > 0) {
                a aVar = (a) sparseArray.get(i);
                if (aVar != null) {
                    if (aVar.b.equals(context.getResources().getConfiguration())) {
                        ColorStateList colorStateList = aVar.a;
                        return colorStateList;
                    }
                    sparseArray.remove(i);
                }
            }
        }
    }

    private static ColorStateList d(Context context, int i) {
        if (e(context, i)) {
            return null;
        }
        Resources resources = context.getResources();
        try {
            return C0246Qa.a(resources, resources.getXml(i), context.getTheme());
        } catch (Exception e) {
            Log.e("AppCompatResources", "Failed to inflate ColorStateList, leaving it to the framework", e);
            return null;
        }
    }

    private static boolean e(Context context, int i) {
        Resources resources = context.getResources();
        TypedValue a2 = a();
        resources.getValue(i, a2, true);
        int i2 = a2.type;
        if (i2 < 28 || i2 > 31) {
            return false;
        }
        return true;
    }

    private static void a(Context context, int i, ColorStateList colorStateList) {
        synchronized (c) {
            SparseArray sparseArray = (SparseArray) b.get(context);
            if (sparseArray == null) {
                sparseArray = new SparseArray();
                b.put(context, sparseArray);
            }
            sparseArray.append(i, new a(colorStateList, context.getResources().getConfiguration()));
        }
    }

    private static TypedValue a() {
        TypedValue typedValue = (TypedValue) a.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        a.set(typedValue2);
        return typedValue2;
    }
}
