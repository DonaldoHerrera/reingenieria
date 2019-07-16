package defpackage;

/* renamed from: aKa reason: default package and case insensitive filesystem */
/* compiled from: WaveformModule_ProvidesWaveformOkHttpClientFactory */
public final class C5562aKa implements C4961HMa<C7440tyb> {
    private final C7054oVa<C7440tyb> a;

    public C5562aKa(C7054oVa<C7440tyb> ova) {
        this.a = ova;
    }

    public static C5562aKa a(C7054oVa<C7440tyb> ova) {
        return new C5562aKa(ova);
    }

    public static C7440tyb a(C4806CMa<C7440tyb> cMa) {
        C7440tyb a2 = C5528_Ja.a(cMa);
        C5023JMa.a(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }

    public C7440tyb get() {
        return a(C4930GMa.a(this.a));
    }
}
