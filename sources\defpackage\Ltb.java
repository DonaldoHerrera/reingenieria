package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: Ltb reason: default package */
/* compiled from: StarProjectionImpl.kt */
public final class Ltb {
    public static final C7706xtb a(C4905Fdb fdb) {
        C7471uYa.b(fdb, "$this$starProjectionType");
        C5272Rcb e = fdb.e();
        if (e != null) {
            Ptb Q = ((C5152Ncb) e).Q();
            C7471uYa.a((Object) Q, "classDescriptor.typeConstructor");
            List<C4905Fdb> parameters = Q.getParameters();
            C7471uYa.a((Object) parameters, "classDescriptor.typeConstructor.parameters");
            ArrayList arrayList = new ArrayList(C6986nWa.a((Iterable) parameters, 10));
            for (C4905Fdb fdb2 : parameters) {
                C7471uYa.a((Object) fdb2, "it");
                arrayList.add(fdb2.Q());
            }
            _tb a = _tb.a((Wtb) new Ktb(arrayList));
            List upperBounds = fdb.getUpperBounds();
            C7471uYa.a((Object) upperBounds, "this.upperBounds");
            C7706xtb b = a.b((C7706xtb) C7676xWa.f(upperBounds), C6473fub.OUT_VARIANCE);
            if (b != null) {
                return b;
            }
            Etb n = C7148pqb.b((C5272Rcb) fdb).n();
            C7471uYa.a((Object) n, "builtIns.defaultBound");
            return n;
        }
        throw new OVa("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassifierDescriptorWithTypeParameters");
    }
}
