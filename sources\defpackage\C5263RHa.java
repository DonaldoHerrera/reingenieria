package defpackage;

import java.util.List;
import java.util.Map;

/* renamed from: RHa reason: default package and case insensitive filesystem */
/* compiled from: RepoUtils.kt */
public final class C5263RHa {
    public static final <Entity extends C3759eda, Properties, Aggregate> IPa<List<Aggregate>> a(List<? extends Entity> list, IPa<Map<C3508cda, Properties>> iPa, C6308dYa<? super Properties, ? super Entity, ? extends Aggregate> dya) {
        C7471uYa.b(list, "sourceItems");
        C7471uYa.b(iPa, "entities");
        C7471uYa.b(dya, "combiner");
        if (list.isEmpty()) {
            IPa<List<Aggregate>> a = IPa.a(C6918mWa.a());
            C7471uYa.a((Object) a, "Single.just(emptyList())");
            return a;
        }
        IPa<List<Aggregate>> e = iPa.e(new C5233QHa(list, dya));
        C7471uYa.a((Object) e, "entities\n               …ombined\n                }");
        return e;
    }
}
