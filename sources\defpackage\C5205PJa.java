package defpackage;

import android.content.res.Resources;

/* renamed from: PJa reason: default package and case insensitive filesystem */
/* compiled from: SnackbarWrapper_Factory */
public final class C5205PJa implements C4961HMa<C5175OJa> {
    private final C7054oVa<Resources> a;

    public C5205PJa(C7054oVa<Resources> ova) {
        this.a = ova;
    }

    public static C5205PJa a(C7054oVa<Resources> ova) {
        return new C5205PJa(ova);
    }

    public C5175OJa get() {
        return new C5175OJa((Resources) this.a.get());
    }
}
