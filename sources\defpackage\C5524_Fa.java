package defpackage;

import android.content.Context;

/* renamed from: _Fa reason: default package and case insensitive filesystem */
/* compiled from: AppForegroundStateProvider_Factory */
public final class C5524_Fa implements C4961HMa<C5495ZFa> {
    private final C7054oVa<Context> a;

    public C5524_Fa(C7054oVa<Context> ova) {
        this.a = ova;
    }

    public static C5524_Fa a(C7054oVa<Context> ova) {
        return new C5524_Fa(ova);
    }

    public C5495ZFa get() {
        return new C5495ZFa((Context) this.a.get());
    }
}
