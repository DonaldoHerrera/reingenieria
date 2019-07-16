package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: Rtb reason: default package */
/* compiled from: TypeSubstitution.kt */
public abstract class Rtb extends Wtb {
    public static final a c = new a(null);

    /* renamed from: Rtb$a */
    /* compiled from: TypeSubstitution.kt */
    public static final class a {
        private a() {
        }

        public static /* synthetic */ Rtb a(a aVar, Map map, boolean z, int i, Object obj) {
            if ((i & 2) != 0) {
                z = false;
            }
            return aVar.a(map, z);
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }

        @NXa
        public final Rtb a(Map<Ptb, ? extends Stb> map, boolean z) {
            C7471uYa.b(map, "map");
            return new Qtb(map, z);
        }

        @NXa
        public final Wtb a(C7706xtb xtb) {
            C7471uYa.b(xtb, "kotlinType");
            return a(xtb.za(), xtb.ya());
        }

        @NXa
        public final Wtb a(Ptb ptb, List<? extends Stb> list) {
            C7471uYa.b(ptb, "typeConstructor");
            C7471uYa.b(list, "arguments");
            List parameters = ptb.getParameters();
            String str = "typeConstructor.parameters";
            C7471uYa.a((Object) parameters, str);
            C4905Fdb fdb = (C4905Fdb) C7676xWa.i(parameters);
            if (!(fdb != null ? fdb.qa() : false)) {
                return new C7499utb(parameters, list);
            }
            List<C4905Fdb> parameters2 = ptb.getParameters();
            C7471uYa.a((Object) parameters2, str);
            ArrayList arrayList = new ArrayList(C6986nWa.a((Iterable) parameters2, 10));
            for (C4905Fdb fdb2 : parameters2) {
                C7471uYa.a((Object) fdb2, "it");
                arrayList.add(fdb2.Q());
            }
            return a(this, LWa.a((Iterable<? extends HVa<? extends K, ? extends V>>) C7676xWa.e((Iterable) arrayList, (Iterable) list)), false, 2, null);
        }
    }

    @NXa
    public static final Rtb a(Map<Ptb, ? extends Stb> map) {
        return a.a(c, map, false, 2, null);
    }

    @NXa
    public static final Wtb a(Ptb ptb, List<? extends Stb> list) {
        return c.a(ptb, list);
    }

    public abstract Stb a(Ptb ptb);

    public Stb a(C7706xtb xtb) {
        C7471uYa.b(xtb, "key");
        return a(xtb.za());
    }
}
