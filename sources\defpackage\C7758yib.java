package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: yib reason: default package and case insensitive filesystem */
/* compiled from: RawType.kt */
final class C7758yib extends C7540vYa implements _Xa<C7706xtb, List<? extends String>> {
    final /* synthetic */ Cob a;

    C7758yib(Cob cob) {
        this.a = cob;
        super(1);
    }

    /* renamed from: a */
    public final List<String> invoke(C7706xtb xtb) {
        C7471uYa.b(xtb, C1325gg.TYPE);
        List<Stb> ya = xtb.ya();
        ArrayList arrayList = new ArrayList(C6986nWa.a((Iterable<? extends T>) ya, 10));
        for (Stb a2 : ya) {
            arrayList.add(this.a.a(a2));
        }
        return arrayList;
    }
}
