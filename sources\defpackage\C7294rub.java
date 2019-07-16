package defpackage;

/* renamed from: rub reason: default package and case insensitive filesystem */
/* compiled from: NewKotlinTypeChecker.kt */
public final class C7294rub {
    public static final boolean a(Etb etb) {
        C7471uYa.b(etb, "$this$isClassType");
        return etb.za().c() instanceof C5029Jcb;
    }

    public static final boolean b(Etb etb) {
        C7471uYa.b(etb, "$this$isIntersectionType");
        return etb.za() instanceof C7637wtb;
    }

    public static final boolean c(Etb etb) {
        C7471uYa.b(etb, "$this$isSingleClassifierType");
        return !C7844ztb.a(etb) && !(etb.za().c() instanceof C4874Edb) && (etb.za().c() != null || (etb instanceof Bpb) || (etb instanceof C6949mub) || (etb instanceof C6471ftb));
    }
}
