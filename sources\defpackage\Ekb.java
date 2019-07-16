package defpackage;

/* renamed from: Ekb reason: default package */
/* compiled from: KotlinJvmBinaryPackageSourceElement.kt */
public final class Ekb implements C7822zdb {
    private final Rhb a;

    public Ekb(Rhb rhb) {
        C7471uYa.b(rhb, "packageFragment");
        this.a = rhb;
    }

    public C4781Bdb a() {
        C4781Bdb bdb = C4781Bdb.a;
        C7471uYa.a((Object) bdb, "SourceFile.NO_SOURCE_FILE");
        return bdb;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append(": ");
        sb.append(this.a.ta().keySet());
        return sb.toString();
    }

    public final Dkb a(C7083osb osb) {
        C7471uYa.b(osb, "descriptor");
        C7355sqb a2 = Vgb.a(osb);
        if (a2 != null) {
            return (Dkb) this.a.ta().get(a2.b());
        }
        return null;
    }
}
