package defpackage;

/* renamed from: swb reason: default package and case insensitive filesystem */
/* compiled from: ReflectJavaPrimitiveType.kt */
public final class C7367swb extends C7436twb implements Yib {
    private final Class<?> b;

    public C7367swb(Class<?> cls) {
        C7471uYa.b(cls, "reflectType");
        this.b = cls;
    }

    /* access modifiers changed from: protected */
    public Class<?> f() {
        return this.b;
    }

    public C5331Tbb getType() {
        if (C7471uYa.a((Object) f(), (Object) Void.TYPE)) {
            return null;
        }
        C7424tqb a = C7424tqb.a(f().getName());
        C7471uYa.a((Object) a, "JvmPrimitiveType.get(reflectType.name)");
        return a.c();
    }
}
