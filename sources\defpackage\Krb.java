package defpackage;

import java.util.Collection;
import java.util.List;

/* renamed from: Krb reason: default package */
/* compiled from: TypeDeserializer.kt */
final class Krb extends C7540vYa implements _Xa<_lb, List<? extends a>> {
    final /* synthetic */ Rrb a;

    Krb(Rrb rrb) {
        this.a = rrb;
        super(1);
    }

    /* renamed from: a */
    public final List<a> invoke(_lb _lb) {
        C7471uYa.b(_lb, "$this$collectAllArguments");
        List o = _lb.o();
        C7471uYa.a((Object) o, "argumentList");
        _lb c = Imb.c(_lb, this.a.d.h());
        List a2 = c != null ? invoke(c) : null;
        if (a2 == null) {
            a2 = C6918mWa.a();
        }
        return C7676xWa.c((Collection) o, (Iterable) a2);
    }
}
