package defpackage;

import android.util.Base64;
import com.adjust.sdk.Constants;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.X509Certificate;
import java.util.Arrays;

/* renamed from: XA reason: default package */
public class XA {
    public static <T> TA<T> a(Object obj, String str, Class<T> cls) {
        return new TA<>(obj, a(obj, str), cls);
    }

    public static <R, P0> R a(Class<?> cls, String str, Class<R> cls2, Class<P0> cls3, P0 p0) {
        try {
            return cls2.cast(a(cls, str, (Class<?>[]) new Class[]{cls3}).invoke(null, new Object[]{p0}));
        } catch (Exception e) {
            throw new WA(String.format("Failed to invoke static method %s on type %s", new Object[]{str, cls}), e);
        }
    }

    public static <R, P0, P1> R a(Class<?> cls, String str, Class<R> cls2, Class<P0> cls3, P0 p0, Class<P1> cls4, P1 p1) {
        try {
            return cls2.cast(a(cls, str, (Class<?>[]) new Class[]{cls3, cls4}).invoke(null, new Object[]{p0, p1}));
        } catch (Exception e) {
            throw new WA(String.format("Failed to invoke static method %s on type %s", new Object[]{str, cls}), e);
        }
    }

    public static <T> T a(T t, Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    public static <R, P0> R a(Object obj, String str, Class<R> cls, Class<P0> cls2, P0 p0) {
        try {
            return cls.cast(a(obj, str, (Class<?>[]) new Class[]{cls2}).invoke(obj, new Object[]{p0}));
        } catch (Exception e) {
            throw new WA(String.format("Failed to invoke method %s on an object of type %s", new Object[]{str, obj.getClass()}), e);
        }
    }

    public static <R, P0, P1, P2> R a(Object obj, String str, Class<R> cls, Class<P0> cls2, P0 p0, Class<P1> cls3, P1 p1, Class<P2> cls4, P2 p2) {
        try {
            return cls.cast(a(obj, str, (Class<?>[]) new Class[]{cls2, cls3, cls4}).invoke(obj, new Object[]{p0, p1, p2}));
        } catch (Exception e) {
            throw new WA(String.format("Failed to invoke method %s on an object of type %s", new Object[]{str, obj.getClass()}), e);
        }
    }

    public static String a(byte[] bArr) {
        try {
            MessageDigest instance = MessageDigest.getInstance(Constants.SHA256);
            instance.update(bArr);
            return Base64.encodeToString(instance.digest(), 11);
        } catch (NoSuchAlgorithmException unused) {
            return "";
        }
    }

    private static Field a(Object obj, String str) {
        Class cls = obj.getClass();
        while (cls != null) {
            try {
                Field declaredField = cls.getDeclaredField(str);
                if (!declaredField.isAccessible()) {
                    declaredField.setAccessible(true);
                }
                return declaredField;
            } catch (NoSuchFieldException unused) {
                cls = cls.getSuperclass();
            }
        }
        throw new WA(String.format("Failed to find a field named %s on an object of instance %s", new Object[]{str, obj.getClass().getName()}));
    }

    private static Method a(Class<?> cls, String str, Class<?>... clsArr) {
        Class<?> cls2 = cls;
        while (cls2 != null) {
            try {
                Method declaredMethod = cls2.getDeclaredMethod(str, clsArr);
                if (!declaredMethod.isAccessible()) {
                    declaredMethod.setAccessible(true);
                }
                return declaredMethod;
            } catch (NoSuchMethodException unused) {
                cls2 = cls2.getSuperclass();
            }
        }
        throw new WA(String.format("Could not find a method named %s with parameters %s in type %s", new Object[]{str, Arrays.asList(clsArr), cls}));
    }

    private static Method a(Object obj, String str, Class<?>... clsArr) {
        return a(obj.getClass(), str, clsArr);
    }

    public static void a(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    public static X509Certificate[][] a(String str) throws C1254eB, IOException {
        return C1408jB.a(str);
    }

    public static <T> TA b(Object obj, String str, Class<T> cls) {
        return new TA(obj, a(obj, str), cls, 0);
    }
}
