package defpackage;

/* renamed from: Ccb reason: default package and case insensitive filesystem */
/* compiled from: JvmBuiltInsSettings.kt */
final class C4811Ccb extends C7540vYa implements _Xa<C4935Gcb, Boolean> {
    final /* synthetic */ C7269rcb a;

    C4811Ccb(C7269rcb rcb) {
        this.a = rcb;
        super(1);
    }

    public final boolean a(C4935Gcb gcb) {
        C7471uYa.a((Object) gcb, "overridden");
        if (gcb.g() == a.DECLARATION) {
            C6721jcb a2 = this.a.i;
            C5272Rcb e = gcb.e();
            if (e == null) {
                throw new OVa("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
            } else if (a2.c((C5029Jcb) e)) {
                return true;
            }
        }
        return false;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return Boolean.valueOf(a((C4935Gcb) obj));
    }
}
