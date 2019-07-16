package defpackage;

/* renamed from: dwb reason: default package and case insensitive filesystem */
/* compiled from: ReflectJavaClass.kt */
final class C6341dwb extends C7540vYa implements _Xa<Class<?>, C7694xnb> {
    public static final C6341dwb a = new C6341dwb();

    C6341dwb() {
        super(1);
    }

    /* renamed from: a */
    public final C7694xnb invoke(Class<?> cls) {
        C7471uYa.a((Object) cls, "it");
        String simpleName = cls.getSimpleName();
        if (!C7694xnb.c(simpleName)) {
            simpleName = null;
        }
        if (simpleName != null) {
            return C7694xnb.b(simpleName);
        }
        return null;
    }
}
