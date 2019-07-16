package defpackage;

/* renamed from: Ema reason: default package */
/* compiled from: DefaultSkipActionsProvider_Factory */
public final class Ema implements C4961HMa<Dma> {
    private final C7054oVa<C3814lca> a;

    public Ema(C7054oVa<C3814lca> ova) {
        this.a = ova;
    }

    public static Ema a(C7054oVa<C3814lca> ova) {
        return new Ema(ova);
    }

    public Dma get() {
        return new Dma((C3814lca) this.a.get());
    }
}
