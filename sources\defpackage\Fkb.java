package defpackage;

/* renamed from: Fkb reason: default package */
/* compiled from: KotlinJvmBinarySourceElement.kt */
public final class Fkb implements C7014nsb {
    private final Dkb a;
    private final C7495urb<C6732jnb> b;
    private final boolean c;

    public Fkb(Dkb dkb, C7495urb<C6732jnb> urb, boolean z) {
        C7471uYa.b(dkb, "binaryClass");
        this.a = dkb;
        this.b = urb;
        this.c = z;
    }

    public C4781Bdb a() {
        C4781Bdb bdb = C4781Bdb.a;
        C7471uYa.a((Object) bdb, "SourceFile.NO_SOURCE_FILE");
        return bdb;
    }

    public String b() {
        StringBuilder sb = new StringBuilder();
        sb.append("Class '");
        sb.append(this.a.D().a().a());
        sb.append('\'');
        return sb.toString();
    }

    public final Dkb c() {
        return this.a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Fkb.class.getSimpleName());
        sb.append(": ");
        sb.append(this.a);
        return sb.toString();
    }
}
