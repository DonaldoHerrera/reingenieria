package defpackage;

import com.soundcloud.android.properties.j;
import javax.net.SocketFactory;

/* renamed from: _O reason: default package and case insensitive filesystem */
/* compiled from: ApiModule_ProvideOkHttpClientFactory */
public final class C2431_O implements C4961HMa<C7440tyb> {
    private final C7054oVa<Vxb> a;
    private final C7054oVa<C2999fP> b;
    private final C7054oVa<j> c;
    private final C7054oVa<C3469VY> d;
    private final C7054oVa<SocketFactory> e;

    public C2431_O(C7054oVa<Vxb> ova, C7054oVa<C2999fP> ova2, C7054oVa<j> ova3, C7054oVa<C3469VY> ova4, C7054oVa<SocketFactory> ova5) {
        this.a = ova;
        this.b = ova2;
        this.c = ova3;
        this.d = ova4;
        this.e = ova5;
    }

    public static C2431_O a(C7054oVa<Vxb> ova, C7054oVa<C2999fP> ova2, C7054oVa<j> ova3, C7054oVa<C3469VY> ova4, C7054oVa<SocketFactory> ova5) {
        C2431_O _o = new C2431_O(ova, ova2, ova3, ova4, ova5);
        return _o;
    }

    public static C7440tyb a(Vxb vxb, Object obj, j jVar, C3469VY vy, SocketFactory socketFactory) {
        C7440tyb a2 = C2264RO.a(vxb, (C2999fP) obj, jVar, vy, socketFactory);
        C5023JMa.a(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }

    public C7440tyb get() {
        return a((Vxb) this.a.get(), this.b.get(), (j) this.c.get(), (C3469VY) this.d.get(), (SocketFactory) this.e.get());
    }
}
