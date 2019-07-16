package defpackage;

import com.soundcloud.android.offline.ve;
import com.soundcloud.android.offline.we;

/* renamed from: gQ reason: default package and case insensitive filesystem */
/* compiled from: DownloadModule_ProvideStrictSSLHttpClientFactory */
public final class C3019gQ implements C4961HMa<ve> {
    private final C7054oVa<we> a;
    private final C7054oVa<C3038hQ> b;

    public C3019gQ(C7054oVa<we> ova, C7054oVa<C3038hQ> ova2) {
        this.a = ova;
        this.b = ova2;
    }

    public static C3019gQ a(C7054oVa<we> ova, C7054oVa<C3038hQ> ova2) {
        return new C3019gQ(ova, ova2);
    }

    public static ve a(we weVar, C3038hQ hQVar) {
        ve a2 = C2981eQ.a(weVar, hQVar);
        C5023JMa.a(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }

    public ve get() {
        return a((we) this.a.get(), (C3038hQ) this.b.get());
    }
}
