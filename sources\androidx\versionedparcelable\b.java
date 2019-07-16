package androidx.versionedparcelable;

import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: VersionedParcel */
public abstract class b {
    protected final T<String, Method> a;
    protected final T<String, Method> b;
    protected final T<String, Class> c;

    public b(T<String, Method> t, T<String, Method> t2, T<String, Class> t3) {
        this.a = t;
        this.b = t2;
        this.c = t3;
    }

    public int a(int i, int i2) {
        if (!a(i2)) {
            return i;
        }
        return e();
    }

    /* access modifiers changed from: protected */
    public abstract void a();

    /* access modifiers changed from: protected */
    public abstract void a(Parcelable parcelable);

    /* access modifiers changed from: protected */
    public abstract void a(String str);

    public void a(boolean z, boolean z2) {
    }

    /* access modifiers changed from: protected */
    public abstract void a(byte[] bArr);

    /* access modifiers changed from: protected */
    public abstract boolean a(int i);

    /* access modifiers changed from: protected */
    public abstract b b();

    /* access modifiers changed from: protected */
    public abstract void b(int i);

    public void b(byte[] bArr, int i) {
        b(i);
        a(bArr);
    }

    /* access modifiers changed from: protected */
    public abstract void c(int i);

    public boolean c() {
        return false;
    }

    /* access modifiers changed from: protected */
    public abstract byte[] d();

    /* access modifiers changed from: protected */
    public abstract int e();

    /* access modifiers changed from: protected */
    public abstract <T extends Parcelable> T f();

    /* access modifiers changed from: protected */
    public abstract String g();

    /* access modifiers changed from: protected */
    public <T extends d> T h() {
        String g = g();
        if (g == null) {
            return null;
        }
        return a(g, b());
    }

    public String a(String str, int i) {
        if (!a(i)) {
            return str;
        }
        return g();
    }

    public void b(int i, int i2) {
        b(i2);
        c(i);
    }

    public byte[] a(byte[] bArr, int i) {
        if (!a(i)) {
            return bArr;
        }
        return d();
    }

    public void b(String str, int i) {
        b(i);
        a(str);
    }

    public <T extends Parcelable> T a(T t, int i) {
        if (!a(i)) {
            return t;
        }
        return f();
    }

    public void b(Parcelable parcelable, int i) {
        b(i);
        a(parcelable);
    }

    /* access modifiers changed from: protected */
    public void a(d dVar) {
        if (dVar == null) {
            a((String) null);
            return;
        }
        b(dVar);
        b b2 = b();
        a((T) dVar, b2);
        b2.a();
    }

    public void b(d dVar, int i) {
        b(i);
        a(dVar);
    }

    private void b(d dVar) {
        try {
            a(a(dVar.getClass()).getName());
        } catch (ClassNotFoundException e) {
            StringBuilder sb = new StringBuilder();
            sb.append(dVar.getClass().getSimpleName());
            sb.append(" does not have a Parcelizer");
            throw new RuntimeException(sb.toString(), e);
        }
    }

    private Method b(String str) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException {
        Method method = (Method) this.a.get(str);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, b.class.getClassLoader()).getDeclaredMethod("read", new Class[]{b.class});
        this.a.put(str, declaredMethod);
        return declaredMethod;
    }

    public <T extends d> T a(T t, int i) {
        if (!a(i)) {
            return t;
        }
        return h();
    }

    /* access modifiers changed from: protected */
    public <T extends d> T a(String str, b bVar) {
        try {
            return (d) b(str).invoke(null, new Object[]{bVar});
        } catch (IllegalAccessException e) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e);
        } catch (InvocationTargetException e2) {
            if (e2.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e2.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
        } catch (ClassNotFoundException e4) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e4);
        }
    }

    private Method b(Class cls) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException {
        Method method = (Method) this.b.get(cls.getName());
        if (method != null) {
            return method;
        }
        Class a2 = a(cls);
        System.currentTimeMillis();
        Method declaredMethod = a2.getDeclaredMethod("write", new Class[]{cls, b.class});
        this.b.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    /* access modifiers changed from: protected */
    public <T extends d> void a(T t, b bVar) {
        try {
            b(t.getClass()).invoke(null, new Object[]{t, bVar});
        } catch (IllegalAccessException e) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e);
        } catch (InvocationTargetException e2) {
            if (e2.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e2.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
        } catch (ClassNotFoundException e4) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e4);
        }
    }

    private Class a(Class<? extends d> cls) throws ClassNotFoundException {
        Class cls2 = (Class) this.c.get(cls.getName());
        if (cls2 != null) {
            return cls2;
        }
        Class cls3 = Class.forName(String.format("%s.%sParcelizer", new Object[]{cls.getPackage().getName(), cls.getSimpleName()}), false, cls.getClassLoader());
        this.c.put(cls.getName(), cls3);
        return cls3;
    }
}
