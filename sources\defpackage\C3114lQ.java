package defpackage;

import javax.net.SocketFactory;

/* renamed from: lQ reason: default package and case insensitive filesystem */
/* compiled from: SocketFactoryModule_ProvideSocketFactoryFactory */
public final class C3114lQ implements C4961HMa<SocketFactory> {
    private static final C3114lQ a = new C3114lQ();

    public static C3114lQ a() {
        return a;
    }

    public static SocketFactory b() {
        SocketFactory a2 = C3095kQ.a();
        C5023JMa.a(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }

    public SocketFactory get() {
        return b();
    }
}
