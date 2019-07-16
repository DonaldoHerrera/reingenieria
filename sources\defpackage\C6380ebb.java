package defpackage;

import java.lang.ref.WeakReference;

/* renamed from: ebb reason: default package and case insensitive filesystem */
/* compiled from: moduleByClassLoader.kt */
final class C6380ebb {
    private final WeakReference<ClassLoader> a;
    private final int b;
    private ClassLoader c;

    public C6380ebb(ClassLoader classLoader) {
        C7471uYa.b(classLoader, "classLoader");
        this.a = new WeakReference<>(classLoader);
        this.b = System.identityHashCode(classLoader);
        this.c = classLoader;
    }

    public final void a(ClassLoader classLoader) {
        this.c = classLoader;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C6380ebb) && ((ClassLoader) this.a.get()) == ((ClassLoader) ((C6380ebb) obj).a.get());
    }

    public int hashCode() {
        return this.b;
    }

    public String toString() {
        ClassLoader classLoader = (ClassLoader) this.a.get();
        if (classLoader != null) {
            String classLoader2 = classLoader.toString();
            if (classLoader2 != null) {
                return classLoader2;
            }
        }
        return "<null>";
    }
}
