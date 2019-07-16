package defpackage;

/* renamed from: cwb reason: default package and case insensitive filesystem */
/* compiled from: ReflectJavaClass.kt */
final class C6273cwb extends C7540vYa implements _Xa<Class<?>, Boolean> {
    public static final C6273cwb a = new C6273cwb();

    C6273cwb() {
        super(1);
    }

    public final boolean a(Class<?> cls) {
        C7471uYa.a((Object) cls, "it");
        String simpleName = cls.getSimpleName();
        C7471uYa.a((Object) simpleName, "it.simpleName");
        return simpleName.length() == 0;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return Boolean.valueOf(a((Class) obj));
    }
}
