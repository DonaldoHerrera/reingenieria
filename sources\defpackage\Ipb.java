package defpackage;

import java.util.List;

/* renamed from: Ipb reason: default package */
/* compiled from: constantValues.kt */
public final class Ipb extends Npb<List<? extends Npb<?>>> {
    private final _Xa<C6450fdb, C7706xtb> b;

    public Ipb(List<? extends Npb<?>> list, _Xa<? super C6450fdb, ? extends C7706xtb> _xa) {
        C7471uYa.b(list, "value");
        C7471uYa.b(_xa, "computeType");
        super(list);
        this.b = _xa;
    }

    public C7706xtb a(C6450fdb fdb) {
        C7471uYa.b(fdb, "module");
        C7706xtb xtb = (C7706xtb) this.b.invoke(fdb);
        boolean z = C5301Sbb.d(xtb) || C5301Sbb.r(xtb);
        if (!TVa.a || z) {
            return xtb;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Type should be an array, but was ");
        sb.append(xtb);
        sb.append(": ");
        sb.append((List) a());
        throw new AssertionError(sb.toString());
    }
}
