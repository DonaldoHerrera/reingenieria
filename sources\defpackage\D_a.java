package defpackage;

/* renamed from: D_a reason: default package */
/* compiled from: KClassImpl.kt */
final class D_a extends C7540vYa implements PXa<String> {
    final /* synthetic */ a a;

    D_a(a aVar) {
        this.a = aVar;
        super(0);
    }

    public final String d() {
        String str;
        if (I_a.this.a().isAnonymousClass()) {
            return null;
        }
        C7280rnb a2 = I_a.this.m();
        if (a2.g()) {
            a aVar = this.a;
            str = aVar.a(I_a.this.a());
        } else {
            str = a2.f().a();
            C7471uYa.a((Object) str, "classId.shortClassName.asString()");
        }
        return str;
    }
}
