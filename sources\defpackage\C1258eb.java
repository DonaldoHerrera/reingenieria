package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.util.Log;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;

/* renamed from: eb reason: default package and case insensitive filesystem */
/* compiled from: TypefaceCompatApi24Impl */
class C1258eb extends C1412jb {
    private static final Class a;
    private static final Constructor b;
    private static final Method c;
    private static final Method d;

    static {
        Method method;
        Method method2;
        Class cls;
        Constructor constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor constructor2 = cls.getConstructor(new Class[0]);
            method = cls.getMethod("addFontWeightStyle", new Class[]{ByteBuffer.class, Integer.TYPE, List.class, Integer.TYPE, Boolean.TYPE});
            method2 = Typeface.class.getMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(cls, 1).getClass()});
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi24Impl", e.getClass().getName(), e);
            cls = null;
            method2 = null;
            method = null;
        }
        b = constructor;
        a = cls;
        c = method;
        d = method2;
    }

    C1258eb() {
    }

    public static boolean a() {
        if (c == null) {
            Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
        }
        return c != null;
    }

    private static Object b() {
        try {
            return b.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    private static boolean a(Object obj, ByteBuffer byteBuffer, int i, int i2, boolean z) {
        try {
            return ((Boolean) c.invoke(obj, new Object[]{byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Boolean.valueOf(z)})).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    private static Typeface a(Object obj) {
        try {
            Object newInstance = Array.newInstance(a, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) d.invoke(null, new Object[]{newInstance});
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public Typeface a(Context context, CancellationSignal cancellationSignal, b[] bVarArr, int i) {
        Object b2 = b();
        if (b2 == null) {
            return null;
        }
        C0485ba baVar = new C0485ba();
        for (b bVar : bVarArr) {
            Uri c2 = bVar.c();
            ByteBuffer byteBuffer = (ByteBuffer) baVar.get(c2);
            if (byteBuffer == null) {
                byteBuffer = C1443kb.a(context, cancellationSignal, c2);
                baVar.put(c2, byteBuffer);
            }
            if (byteBuffer == null || !a(b2, byteBuffer, bVar.b(), bVar.d(), bVar.e())) {
                return null;
            }
        }
        Typeface a2 = a(b2);
        if (a2 == null) {
            return null;
        }
        return Typeface.create(a2, i);
    }

    public Typeface a(Context context, b bVar, Resources resources, int i) {
        c[] a2;
        Object b2 = b();
        if (b2 == null) {
            return null;
        }
        for (c cVar : bVar.a()) {
            ByteBuffer a3 = C1443kb.a(context, resources, cVar.b());
            if (a3 == null || !a(b2, a3, cVar.c(), cVar.e(), cVar.f())) {
                return null;
            }
        }
        return a(b2);
    }
}
