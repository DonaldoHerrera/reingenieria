package defpackage;

/* renamed from: Ujb reason: default package */
/* compiled from: signatureEnhancement.kt */
final class Ujb extends C7540vYa implements _Xa<C6405eub, Boolean> {
    public static final Ujb a = new Ujb();

    Ujb() {
        super(1);
    }

    public final boolean a(C6405eub eub) {
        C5122Mcb c = eub.za().c();
        if (c == null) {
            return false;
        }
        C7471uYa.a((Object) c, "it.constructor.declarati… ?: return@contains false");
        if (!C7471uYa.a((Object) c.getName(), (Object) C6721jcb.m.a().e()) || !C7471uYa.a((Object) C7148pqb.a((C5272Rcb) c), (Object) C6721jcb.m.a())) {
            return false;
        }
        return true;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return Boolean.valueOf(a((C6405eub) obj));
    }
}
