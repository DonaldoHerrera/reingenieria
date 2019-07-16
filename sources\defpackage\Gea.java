package defpackage;

import android.content.SharedPreferences;

/* renamed from: Gea reason: default package */
/* compiled from: IntroductoryOverlayOperations_Factory */
public final class Gea implements C4961HMa<Fea> {
    private final C7054oVa<SharedPreferences> a;
    private final C7054oVa<C5694cGa> b;

    public Gea(C7054oVa<SharedPreferences> ova, C7054oVa<C5694cGa> ova2) {
        this.a = ova;
        this.b = ova2;
    }

    public static Gea a(C7054oVa<SharedPreferences> ova, C7054oVa<C5694cGa> ova2) {
        return new Gea(ova, ova2);
    }

    public Fea get() {
        return new Fea((SharedPreferences) this.a.get(), (C5694cGa) this.b.get());
    }
}
