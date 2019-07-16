package defpackage;

import com.soundcloud.android.properties.a;

/* renamed from: NQ reason: default package and case insensitive filesystem */
/* compiled from: RemoteConfigSyncJob_Factory */
public final class C2190NQ implements C4961HMa<C2171MQ> {
    private final C7054oVa<a> a;

    public C2190NQ(C7054oVa<a> ova) {
        this.a = ova;
    }

    public static C2190NQ a(C7054oVa<a> ova) {
        return new C2190NQ(ova);
    }

    public C2171MQ get() {
        return new C2171MQ((a) this.a.get());
    }
}
