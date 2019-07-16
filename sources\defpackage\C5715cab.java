package defpackage;

/* renamed from: cab reason: default package and case insensitive filesystem */
/* compiled from: KPackageImpl.kt */
final class C5715cab extends C7540vYa implements PXa<C7132pdb> {
    final /* synthetic */ a a;

    C5715cab(a aVar) {
        this.a = aVar;
        super(0);
    }

    public final C7132pdb d() {
        C4841Dbb a2 = this.a.a();
        C7751ybb a3 = this.a.f();
        if (a3 != null) {
            String a4 = C6312dbb.a(a3);
            if (a4 != null) {
                a2.c().b(a4);
            }
        }
        C6450fdb b = a2.b();
        C7349snb d = Rvb.b(C6583hab.this.a()).d();
        C7471uYa.a((Object) d, "jClass.classId.packageFqName");
        return b.a(d);
    }
}
