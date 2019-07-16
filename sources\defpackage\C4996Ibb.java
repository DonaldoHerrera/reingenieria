package defpackage;

import java.util.ServiceLoader;

/* renamed from: Ibb reason: default package and case insensitive filesystem */
/* compiled from: BuiltInsLoader.kt */
final class C4996Ibb extends C7540vYa implements PXa<C5028Jbb> {
    public static final C4996Ibb a = new C4996Ibb();

    C4996Ibb() {
        super(0);
    }

    public final C5028Jbb d() {
        ServiceLoader load = ServiceLoader.load(C5028Jbb.class, C5028Jbb.class.getClassLoader());
        C7471uYa.a((Object) load, "implementations");
        C5028Jbb jbb = (C5028Jbb) C7676xWa.h((Iterable) load);
        if (jbb != null) {
            return jbb;
        }
        throw new IllegalStateException("No BuiltInsLoader implementation was found. Please ensure that the META-INF/services/ is not stripped from your application and that the Java virtual machine is not running under a security manager");
    }
}
