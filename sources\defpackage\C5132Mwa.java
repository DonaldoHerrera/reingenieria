package defpackage;

/* renamed from: Mwa reason: default package and case insensitive filesystem */
/* compiled from: PlayerSettings.kt */
final class C5132Mwa<T> implements CPa<T> {
    final /* synthetic */ C5039Jwa a;

    C5132Mwa(C5039Jwa jwa) {
        this.a = jwa;
    }

    public final void a(BPa<Boolean> bPa) {
        C7471uYa.b(bPa, "emitter");
        C5101Lwa lwa = new C5101Lwa(this, bPa);
        bPa.a((C6708jQa) new C5070Kwa(this, lwa));
        bPa.a(Boolean.valueOf(this.a.b()));
        this.a.b.registerOnSharedPreferenceChangeListener(lwa);
    }
}
