package defpackage;

/* renamed from: ema reason: default package and case insensitive filesystem */
/* compiled from: FlipperWrapperFactory.kt */
public class C4552ema {
    private final Ula a;

    public C4552ema(Ula ula) {
        C7471uYa.b(ula, "flipperConfiguration");
        this.a = ula;
    }

    public C3959bma a(Tla tla) {
        C7471uYa.b(tla, "flipperCallbacks");
        return new C3959bma(tla, new Wla(this.a));
    }
}
