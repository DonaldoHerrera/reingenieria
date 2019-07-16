package defpackage;

/* renamed from: xkb reason: default package and case insensitive filesystem */
/* compiled from: JvmPackagePartSource.kt */
public final class C7691xkb implements C7014nsb {
    private final String a;
    private final C7355sqb b;
    private final C7355sqb c;
    private final C7495urb<C6732jnb> d;
    private final boolean e;
    private final Dkb f;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0033, code lost:
        if (r2 != null) goto L_0x0038;
     */
    public C7691xkb(C7355sqb sqb, C7355sqb sqb2, Ilb ilb, Emb emb, C7495urb<C6732jnb> urb, boolean z, Dkb dkb) {
        String str;
        C7471uYa.b(sqb, "className");
        C7471uYa.b(ilb, "packageProto");
        C7471uYa.b(emb, "nameResolver");
        this.b = sqb;
        this.c = sqb2;
        this.d = urb;
        this.e = z;
        this.f = dkb;
        f<Ilb, Integer> fVar = Xmb.l;
        C7471uYa.a((Object) fVar, "JvmProtoBuf.packageModuleName");
        Integer num = (Integer) Hmb.a(ilb, fVar);
        if (num != null) {
            str = emb.getString(num.intValue());
        }
        str = "main";
        this.a = str;
    }

    public C4781Bdb a() {
        C4781Bdb bdb = C4781Bdb.a;
        C7471uYa.a((Object) bdb, "SourceFile.NO_SOURCE_FILE");
        return bdb;
    }

    public String b() {
        StringBuilder sb = new StringBuilder();
        sb.append("Class '");
        sb.append(c().a().a());
        sb.append('\'');
        return sb.toString();
    }

    public final C7280rnb c() {
        return new C7280rnb(this.b.c(), g());
    }

    public final C7355sqb d() {
        return this.b;
    }

    public final C7355sqb e() {
        return this.c;
    }

    public final Dkb f() {
        return this.f;
    }

    public final C7694xnb g() {
        String b2 = this.b.b();
        C7471uYa.a((Object) b2, "className.internalName");
        C7694xnb b3 = C7694xnb.b(Hxb.b(b2, '/', (String) null, 2, (Object) null));
        C7471uYa.a((Object) b3, "Name.identifier(classNam….substringAfterLast('/'))");
        return b3;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(C7691xkb.class.getSimpleName());
        sb.append(": ");
        sb.append(this.b);
        return sb.toString();
    }

    public C7691xkb(Dkb dkb, Ilb ilb, Emb emb, C7495urb<C6732jnb> urb, boolean z) {
        C7471uYa.b(dkb, "kotlinClass");
        C7471uYa.b(ilb, "packageProto");
        C7471uYa.b(emb, "nameResolver");
        C7355sqb a2 = C7355sqb.a(dkb.D());
        C7471uYa.a((Object) a2, "JvmClassName.byClassId(kotlinClass.classId)");
        String e2 = dkb.a().e();
        C7355sqb sqb = null;
        if (e2 != null) {
            if (e2.length() > 0) {
                sqb = C7355sqb.a(e2);
            }
        }
        C7355sqb sqb2 = sqb;
        this(a2, sqb2, ilb, emb, urb, z, dkb);
    }
}
