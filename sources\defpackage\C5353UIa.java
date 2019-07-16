package defpackage;

import com.soundcloud.android.image.N;

/* renamed from: UIa reason: default package and case insensitive filesystem */
/* compiled from: CarouselPlaylistItemRenderer_Factory */
public final class C5353UIa implements C4961HMa<C5294SIa> {
    private final C7054oVa<N> a;

    public C5353UIa(C7054oVa<N> ova) {
        this.a = ova;
    }

    public static C5353UIa a(C7054oVa<N> ova) {
        return new C5353UIa(ova);
    }

    public C5294SIa get() {
        return new C5294SIa((N) this.a.get());
    }
}
