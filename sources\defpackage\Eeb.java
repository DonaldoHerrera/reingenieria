package defpackage;

/* renamed from: Eeb reason: default package */
/* compiled from: AbstractTypeAliasDescriptor.kt */
final class Eeb extends C7540vYa implements _Xa<C6405eub, Boolean> {
    final /* synthetic */ Geb a;

    Eeb(Geb geb) {
        this.a = geb;
        super(1);
    }

    public final boolean a(C6405eub eub) {
        C7471uYa.a((Object) eub, C1325gg.TYPE);
        if (C7844ztb.a(eub)) {
            return false;
        }
        Geb geb = this.a;
        C5122Mcb c = eub.za().c();
        if ((c instanceof C4905Fdb) && (C7471uYa.a((Object) ((C4905Fdb) c).e(), (Object) this.a) ^ true)) {
            return true;
        }
        return false;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return Boolean.valueOf(a((C6405eub) obj));
    }
}
