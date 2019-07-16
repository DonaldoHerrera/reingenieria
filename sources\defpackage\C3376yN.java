package defpackage;

import android.content.Context;
import com.soundcloud.android.properties.a;

/* renamed from: yN reason: default package and case insensitive filesystem */
/* compiled from: AdErrorAnalyticsToaster_Factory */
public final class C3376yN implements C4961HMa<C3356xN> {
    private final C7054oVa<Context> a;
    private final C7054oVa<a> b;

    public C3376yN(C7054oVa<Context> ova, C7054oVa<a> ova2) {
        this.a = ova;
        this.b = ova2;
    }

    public static C3376yN a(C7054oVa<Context> ova, C7054oVa<a> ova2) {
        return new C3376yN(ova, ova2);
    }

    public C3356xN get() {
        return new C3356xN((Context) this.a.get(), (a) this.b.get());
    }
}
