package defpackage;

import com.soundcloud.android.utilities.android.k;

/* renamed from: KDa reason: default package and case insensitive filesystem */
/* compiled from: MediaStreamsStorageWriter_Factory */
public final class C5046KDa implements C4961HMa<C5014JDa> {
    private final C7054oVa<C4797CDa> a;
    private final C7054oVa<k> b;

    public C5046KDa(C7054oVa<C4797CDa> ova, C7054oVa<k> ova2) {
        this.a = ova;
        this.b = ova2;
    }

    public static C5046KDa a(C7054oVa<C4797CDa> ova, C7054oVa<k> ova2) {
        return new C5046KDa(ova, ova2);
    }

    public C5014JDa get() {
        return new C5014JDa((C4797CDa) this.a.get(), (k) this.b.get());
    }
}
