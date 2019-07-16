package defpackage;

import com.google.android.gms.common.internal.ImagesContract;

/* renamed from: eKa reason: default package and case insensitive filesystem */
/* compiled from: WaveformOperations.kt */
final class C6362eKa<T, R> implements C7118pQa<T, C7669xPa<? extends R>> {
    final /* synthetic */ C5630bKa a;
    final /* synthetic */ C3508cda b;

    C6362eKa(C5630bKa bka, C3508cda cda) {
        this.a = bka;
        this.b = cda;
    }

    /* renamed from: a */
    public final C7531vPa<C5325TJa> apply(C5325TJa tJa) {
        C7471uYa.b(tJa, "it");
        C5630bKa bka = this.a;
        String cda = this.b.toString();
        C7471uYa.a((Object) cda, "trackUrn.toString()");
        return bka.a(tJa, ImagesContract.LOCAL, cda);
    }
}
