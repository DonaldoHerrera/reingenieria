package defpackage;

import java.util.Map;

/* renamed from: Ggb reason: default package */
/* compiled from: JavaAnnotationMapper.kt */
final class Ggb extends C7540vYa implements PXa<Map<C7694xnb, ? extends Npb<?>>> {
    final /* synthetic */ Hgb a;

    Ggb(Hgb hgb) {
        this.a = hgb;
        super(0);
    }

    public final Map<C7694xnb, Npb<?>> d() {
        Fib b = this.a.b();
        Map<C7694xnb, Npb<?>> map = null;
        Object obj = b instanceof Iib ? C7756ygb.c.a(((Iib) this.a.b()).getElements()) : b instanceof Qib ? C7756ygb.c.a(C6850lWa.a(this.a.b())) : null;
        if (obj != null) {
            map = KWa.a(NVa.a(C7618wgb.k.c(), obj));
        }
        return map != null ? map : LWa.a();
    }
}
