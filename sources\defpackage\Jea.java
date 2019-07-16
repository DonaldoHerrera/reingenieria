package defpackage;

import android.content.res.Resources;
import com.soundcloud.android.foundation.events.C3700b;

/* renamed from: Jea reason: default package */
/* compiled from: IntroductoryOverlayPresenter_Factory */
public final class Jea implements C4961HMa<Iea> {
    private final C7054oVa<Fea> a;
    private final C7054oVa<Resources> b;
    private final C7054oVa<C3700b> c;

    public Jea(C7054oVa<Fea> ova, C7054oVa<Resources> ova2, C7054oVa<C3700b> ova3) {
        this.a = ova;
        this.b = ova2;
        this.c = ova3;
    }

    public static Jea a(C7054oVa<Fea> ova, C7054oVa<Resources> ova2, C7054oVa<C3700b> ova3) {
        return new Jea(ova, ova2, ova3);
    }

    public Iea get() {
        return new Iea((Fea) this.a.get(), (Resources) this.b.get(), (C3700b) this.c.get());
    }
}
