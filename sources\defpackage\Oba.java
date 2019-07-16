package defpackage;

import android.content.res.Resources;
import com.soundcloud.android.collection.C2746fa;
import com.soundcloud.android.collection.playhistory.Z;
import com.soundcloud.android.features.library.likes.search.C3609e;
import com.soundcloud.android.image.X;

/* renamed from: Oba reason: default package */
/* compiled from: DefaultMediaBrowserDataSource_Factory */
public final class Oba implements C4961HMa<Fba> {
    private final C7054oVa<Resources> a;
    private final C7054oVa<C3858rY> b;
    private final C7054oVa<Z> c;
    private final C7054oVa<C3609e> d;
    private final C7054oVa<C2746fa> e;
    private final C7054oVa<C1938AS> f;
    private final C7054oVa<X> g;
    private final C7054oVa<HPa> h;
    private final C7054oVa<HPa> i;

    public Oba(C7054oVa<Resources> ova, C7054oVa<C3858rY> ova2, C7054oVa<Z> ova3, C7054oVa<C3609e> ova4, C7054oVa<C2746fa> ova5, C7054oVa<C1938AS> ova6, C7054oVa<X> ova7, C7054oVa<HPa> ova8, C7054oVa<HPa> ova9) {
        this.a = ova;
        this.b = ova2;
        this.c = ova3;
        this.d = ova4;
        this.e = ova5;
        this.f = ova6;
        this.g = ova7;
        this.h = ova8;
        this.i = ova9;
    }

    public static Oba a(C7054oVa<Resources> ova, C7054oVa<C3858rY> ova2, C7054oVa<Z> ova3, C7054oVa<C3609e> ova4, C7054oVa<C2746fa> ova5, C7054oVa<C1938AS> ova6, C7054oVa<X> ova7, C7054oVa<HPa> ova8, C7054oVa<HPa> ova9) {
        Oba oba = new Oba(ova, ova2, ova3, ova4, ova5, ova6, ova7, ova8, ova9);
        return oba;
    }

    public Fba get() {
        Fba fba = new Fba((Resources) this.a.get(), (C3858rY) this.b.get(), (Z) this.c.get(), (C3609e) this.d.get(), (C2746fa) this.e.get(), (C1938AS) this.f.get(), (X) this.g.get(), (HPa) this.h.get(), (HPa) this.i.get());
        return fba;
    }
}
