package defpackage;

/* renamed from: xgb reason: default package and case insensitive filesystem */
/* compiled from: JavaAnnotationMapper.kt */
final class C7687xgb extends C7540vYa implements _Xa<C6450fdb, C7706xtb> {
    public static final C7687xgb a = new C7687xgb();

    C7687xgb() {
        super(1);
    }

    /* renamed from: a */
    public final C7706xtb invoke(C6450fdb fdb) {
        C7471uYa.b(fdb, "module");
        C5061Kdb a2 = C7411tgb.a(C7618wgb.k.c(), fdb.E().a(C5301Sbb.h.D));
        if (a2 != null) {
            C7706xtb type = a2.getType();
            if (type != null) {
                return type;
            }
        }
        Etb c = C7154ptb.c("Error: AnnotationTarget[]");
        C7471uYa.a((Object) c, "ErrorUtils.createErrorTy…ror: AnnotationTarget[]\")");
        return c;
    }
}
