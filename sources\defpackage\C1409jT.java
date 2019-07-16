package defpackage;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.List;

/* renamed from: jT reason: default package and case insensitive filesystem */
/* compiled from: StorePlaylistsCommand */
public class C1409jT extends C1286fT<Iterable<C3927zda>, C6499gLa> {
    /* access modifiers changed from: private */
    public final C3800jea b;

    public C1409jT(C5500ZKa zKa, C3800jea jea) {
        super(zKa);
        this.b = jea;
    }

    /* access modifiers changed from: private */
    public static C5054KLa b(Iterable<C3927zda> iterable) {
        a aVar = new a(d());
        for (C3927zda a : iterable) {
            aVar.a(a(a));
        }
        return aVar.a();
    }

    private static List<C5085LLa> d() {
        return Arrays.asList(new C5085LLa[]{e.d, e.e, e.p, e.k, e.f, e.y, e.E, e.F, e.K, e.H, e.j, e.n, e.q, e.r, e.O, e.P, e.Q, e.S, e.g});
    }

    /* access modifiers changed from: protected */
    public C6499gLa a(C5500ZKa zKa, Iterable<C3927zda> iterable) {
        return zKa.a((a) new C1379iT(this, iterable));
    }

    public static List<Object> a(C3927zda zda) {
        String str;
        Object[] objArr = new Object[19];
        objArr[0] = Long.valueOf(zda.a().c());
        objArr[1] = Integer.valueOf(1);
        objArr[2] = zda.getTitle();
        objArr[3] = Long.valueOf(zda.h());
        objArr[4] = Long.valueOf(zda.g().getTime());
        objArr[5] = zda.n().b();
        objArr[6] = Integer.valueOf(zda.o().a());
        objArr[7] = Integer.valueOf(zda.o().b());
        objArr[8] = Integer.valueOf(zda.q());
        objArr[9] = Long.valueOf(zda.s().l().c());
        objArr[10] = zda.i();
        if (zda.p() == null) {
            str = null;
        } else {
            str = TextUtils.join(" ", zda.p());
        }
        objArr[11] = str;
        objArr[12] = zda.j();
        objArr[13] = zda.b().d();
        objArr[14] = Boolean.valueOf(zda.t());
        objArr[15] = zda.m();
        objArr[16] = zda.k();
        objArr[17] = zda.l();
        objArr[18] = Long.valueOf(zda.r().getTime());
        return Arrays.asList(objArr);
    }
}
