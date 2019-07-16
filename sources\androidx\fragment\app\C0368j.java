package androidx.fragment.app;

import android.os.Bundle;
import androidx.fragment.app.Fragment.b;
import java.lang.reflect.InvocationTargetException;

/* renamed from: androidx.fragment.app.j reason: case insensitive filesystem */
/* compiled from: FragmentFactory */
public class C0368j {
    private static final C0485ba<String, Class<?>> a = new C0485ba<>();

    static boolean a(ClassLoader classLoader, String str) {
        try {
            return Fragment.class.isAssignableFrom(c(classLoader, str));
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public static Class<? extends Fragment> b(ClassLoader classLoader, String str) {
        String str2 = "Unable to instantiate fragment ";
        try {
            return c(classLoader, str);
        } catch (ClassNotFoundException e) {
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append(str);
            sb.append(": make sure class name exists");
            throw new b(sb.toString(), e);
        } catch (ClassCastException e2) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str2);
            sb2.append(str);
            sb2.append(": make sure class is a valid subclass of Fragment");
            throw new b(sb2.toString(), e2);
        }
    }

    private static Class<?> c(ClassLoader classLoader, String str) throws ClassNotFoundException {
        Class<?> cls = (Class) a.get(str);
        if (cls != null) {
            return cls;
        }
        Class<?> loadClass = classLoader.loadClass(str);
        a.put(str, loadClass);
        return loadClass;
    }

    public Fragment a(ClassLoader classLoader, String str, Bundle bundle) {
        String str2 = " empty constructor that is public";
        String str3 = ": make sure class name exists, is public, and has an";
        String str4 = "Unable to instantiate fragment ";
        try {
            return (Fragment) b(classLoader, str).getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (InstantiationException e) {
            StringBuilder sb = new StringBuilder();
            sb.append(str4);
            sb.append(str);
            sb.append(str3);
            sb.append(str2);
            throw new b(sb.toString(), e);
        } catch (IllegalAccessException e2) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str4);
            sb2.append(str);
            sb2.append(str3);
            sb2.append(str2);
            throw new b(sb2.toString(), e2);
        } catch (NoSuchMethodException e3) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str4);
            sb3.append(str);
            sb3.append(": could not find Fragment constructor");
            throw new b(sb3.toString(), e3);
        } catch (InvocationTargetException e4) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(str4);
            sb4.append(str);
            sb4.append(": calling Fragment constructor caused an exception");
            throw new b(sb4.toString(), e4);
        }
    }
}
