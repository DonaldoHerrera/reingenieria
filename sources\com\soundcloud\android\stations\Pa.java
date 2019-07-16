package com.soundcloud.android.stations;

/* compiled from: StationInfoFragment.kt */
final class Pa extends C7540vYa implements C6308dYa<Za, Za, Boolean> {
    public static final Pa a = new Pa();

    Pa() {
        super(2);
    }

    public final boolean a(Za za, Za za2) {
        C7471uYa.b(za, "firstItem");
        C7471uYa.b(za2, "secondItem");
        return za.f() == za2.f();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return Boolean.valueOf(a((Za) obj, (Za) obj2));
    }
}
