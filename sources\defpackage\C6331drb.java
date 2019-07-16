package defpackage;

/* renamed from: drb reason: default package and case insensitive filesystem */
/* compiled from: ClassData.kt */
public final class C6331drb {
    private final Emb a;
    private final C6458flb b;
    private final Bmb c;
    private final C7822zdb d;

    public C6331drb(Emb emb, C6458flb flb, Bmb bmb, C7822zdb zdb) {
        C7471uYa.b(emb, "nameResolver");
        C7471uYa.b(flb, "classProto");
        C7471uYa.b(bmb, "metadataVersion");
        C7471uYa.b(zdb, "sourceElement");
        this.a = emb;
        this.b = flb;
        this.c = bmb;
        this.d = zdb;
    }

    public final Emb a() {
        return this.a;
    }

    public final C6458flb b() {
        return this.b;
    }

    public final Bmb c() {
        return this.c;
    }

    public final C7822zdb d() {
        return this.d;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002e, code lost:
        if (defpackage.C7471uYa.a((java.lang.Object) r2.d, (java.lang.Object) r3.d) != false) goto L_0x0033;
     */
    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C6331drb) {
                C6331drb drb = (C6331drb) obj;
                if (C7471uYa.a((Object) this.a, (Object) drb.a)) {
                    if (C7471uYa.a((Object) this.b, (Object) drb.b)) {
                        if (C7471uYa.a((Object) this.c, (Object) drb.c)) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        Emb emb = this.a;
        int i = 0;
        int hashCode = (emb != null ? emb.hashCode() : 0) * 31;
        C6458flb flb = this.b;
        int hashCode2 = (hashCode + (flb != null ? flb.hashCode() : 0)) * 31;
        Bmb bmb = this.c;
        int hashCode3 = (hashCode2 + (bmb != null ? bmb.hashCode() : 0)) * 31;
        C7822zdb zdb = this.d;
        if (zdb != null) {
            i = zdb.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ClassData(nameResolver=");
        sb.append(this.a);
        sb.append(", classProto=");
        sb.append(this.b);
        sb.append(", metadataVersion=");
        sb.append(this.c);
        sb.append(", sourceElement=");
        sb.append(this.d);
        sb.append(")");
        return sb.toString();
    }
}
