package defpackage;

import java.util.List;

/* renamed from: Qrb reason: default package */
/* compiled from: TypeDeserializer.kt */
final class Qrb extends C7540vYa implements _Xa<Integer, C5029Jcb> {
    final /* synthetic */ Rrb a;
    final /* synthetic */ _lb b;

    Qrb(Rrb rrb, _lb _lb) {
        this.a = rrb;
        this.b = _lb;
        super(1);
    }

    public final C5029Jcb a(int i) {
        C7280rnb a2 = Drb.a(this.a.d.e(), i);
        List h = Ywb.h(Ywb.d(Twb.a(this.b, (_Xa<? super T, ? extends T>) new Orb<Object,Object>(this)), Prb.a));
        int d = Ywb.d(Twb.a(a2, (_Xa<? super T, ? extends T>) Nrb.e));
        while (h.size() < d) {
            h.add(Integer.valueOf(0));
        }
        return this.a.d.a().n().a(a2, h);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return a(((Number) obj).intValue());
    }
}
