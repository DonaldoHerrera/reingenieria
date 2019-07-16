package defpackage;

/* renamed from: Jtb reason: default package */
/* compiled from: StarProjectionImpl.kt */
public final class Jtb extends Ttb {
    static final /* synthetic */ DZa[] a = {HYa.a((DYa) new EYa(HYa.a(Jtb.class), "_type", "get_type()Lorg/jetbrains/kotlin/types/KotlinType;"))};
    private final C7744yVa b = BVa.a(DVa.PUBLICATION, new Itb(this));
    /* access modifiers changed from: private */
    public final C4905Fdb c;

    public Jtb(C4905Fdb fdb) {
        C7471uYa.b(fdb, "typeParameter");
        this.c = fdb;
    }

    private final C7706xtb c() {
        C7744yVa yva = this.b;
        DZa dZa = a[0];
        return (C7706xtb) yva.getValue();
    }

    public boolean a() {
        return true;
    }

    public C6473fub b() {
        return C6473fub.OUT_VARIANCE;
    }

    public C7706xtb getType() {
        return c();
    }
}
