package defpackage;

import android.content.Context;

/* renamed from: jN reason: default package and case insensitive filesystem */
/* compiled from: ComScoreAnalyticsWrapper_Factory */
public final class C3073jN implements C4961HMa<C3054iN> {
    private final C7054oVa<Context> a;

    public C3073jN(C7054oVa<Context> ova) {
        this.a = ova;
    }

    public static C3073jN a(C7054oVa<Context> ova) {
        return new C3073jN(ova);
    }

    public C3054iN get() {
        return new C3054iN((Context) this.a.get());
    }
}
