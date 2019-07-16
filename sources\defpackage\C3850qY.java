package defpackage;

import com.soundcloud.android.sync.la;

/* renamed from: qY reason: default package and case insensitive filesystem */
/* compiled from: DiscoveryDatabaseOpenHelper_Factory */
public final class C3850qY implements C4961HMa<C3834oY> {
    private final C7054oVa<la> a;

    public C3850qY(C7054oVa<la> ova) {
        this.a = ova;
    }

    public static C3850qY a(C7054oVa<la> ova) {
        return new C3850qY(ova);
    }

    public C3834oY get() {
        return new C3834oY((la) this.a.get());
    }
}
