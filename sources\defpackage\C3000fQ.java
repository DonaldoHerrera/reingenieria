package defpackage;

import com.soundcloud.android.properties.j;

/* renamed from: fQ reason: default package and case insensitive filesystem */
/* compiled from: DownloadModule_ProvideOkHttpClientFactory */
public final class C3000fQ implements C4961HMa<C7440tyb> {
    private final C7054oVa<C7440tyb> a;
    private final C7054oVa<j> b;

    public C3000fQ(C7054oVa<C7440tyb> ova, C7054oVa<j> ova2) {
        this.a = ova;
        this.b = ova2;
    }

    public static C3000fQ a(C7054oVa<C7440tyb> ova, C7054oVa<j> ova2) {
        return new C3000fQ(ova, ova2);
    }

    public static C7440tyb a(C4806CMa<C7440tyb> cMa, j jVar) {
        C7440tyb a2 = C2981eQ.a(cMa, jVar);
        C5023JMa.a(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }

    public C7440tyb get() {
        return a(C4930GMa.a(this.a), (j) this.b.get());
    }
}
