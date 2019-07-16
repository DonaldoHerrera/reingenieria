package defpackage;

/* renamed from: Thb reason: default package */
/* compiled from: LazyJavaPackageScope.kt */
final class Thb extends C7540vYa implements _Xa<a, C5029Jcb> {
    final /* synthetic */ Shb a;
    final /* synthetic */ C6590hhb b;

    Thb(Shb shb, C6590hhb hhb) {
        this.a = shb;
        this.b = hhb;
        super(1);
    }

    /* renamed from: a */
    public final C5029Jcb invoke(a aVar) {
        a aVar2;
        byte[] bArr;
        C7471uYa.b(aVar, "request");
        C7280rnb rnb = new C7280rnb(this.a.g().q(), aVar.b());
        if (aVar.a() != null) {
            aVar2 = this.b.a().h().a(aVar.a());
        } else {
            aVar2 = this.b.a().h().a(rnb);
        }
        C5029Jcb jcb = 0;
        Dkb a2 = aVar2 != null ? aVar2.a() : null;
        C7280rnb D = a2 != null ? a2.D() : null;
        if (D != null && (D.h() || D.g())) {
            return null;
        }
        b a3 = this.a.a(a2);
        if (a3 instanceof a) {
            jcb = ((a) a3).a();
        } else if (!(a3 instanceof c)) {
            if (a3 instanceof C0153b) {
                Kib a4 = aVar.a();
                if (a4 == null) {
                    _fb d = this.b.a().d();
                    if (aVar2 != null) {
                        if (!(aVar2 instanceof C0138a)) {
                            aVar2 = null;
                        }
                        C0138a aVar3 = (C0138a) aVar2;
                        if (aVar3 != null) {
                            bArr = aVar3.b();
                            a aVar4 = new a(rnb, bArr, null, 4, null);
                            a4 = d.a(aVar4);
                        }
                    }
                    bArr = null;
                    a aVar42 = new a(rnb, bArr, null, 4, null);
                    a4 = d.a(aVar42);
                }
                Kib kib = a4;
                if ((kib != null ? kib.u() : null) != C6320djb.BINARY) {
                    C7349snb q = kib != null ? kib.q() : null;
                    if (q != null && !q.b() && !(!C7471uYa.a((Object) q.c(), (Object) this.a.g().q()))) {
                        C7757yhb yhb = new C7757yhb(this.b, this.a.g(), kib, null, 8, null);
                        this.b.a().e().a(yhb);
                        jcb = yhb;
                    }
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Couldn't find kotlin binary class for light class created by kotlin binary file\n");
                    sb.append("JavaClass: ");
                    sb.append(kib);
                    sb.append(10);
                    sb.append("ClassId: ");
                    sb.append(rnb);
                    sb.append(10);
                    sb.append("findKotlinClass(JavaClass) = ");
                    sb.append(Ckb.a(this.b.a().h(), kib));
                    sb.append(10);
                    sb.append("findKotlinClass(ClassId) = ");
                    sb.append(Ckb.a(this.b.a().h(), rnb));
                    sb.append(10);
                    throw new IllegalStateException(sb.toString());
                }
            } else {
                throw new FVa();
            }
        }
        return jcb;
    }
}
