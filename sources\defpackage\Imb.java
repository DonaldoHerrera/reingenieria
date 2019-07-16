package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: Imb reason: default package */
/* compiled from: protoTypeTableUtil.kt */
public final class Imb {
    public static final List<_lb> a(C6458flb flb, Jmb jmb) {
        C7471uYa.b(flb, "$this$supertypes");
        C7471uYa.b(jmb, "typeTable");
        List<_lb> B = flb.B();
        if (!(!B.isEmpty())) {
            B = null;
        }
        if (B == null) {
            List<Integer> A = flb.A();
            C7471uYa.a((Object) A, "supertypeIdList");
            B = new ArrayList<>(C6986nWa.a((Iterable) A, 10));
            for (Integer num : A) {
                C7471uYa.a((Object) num, "it");
                B.add(jmb.a(num.intValue()));
            }
        }
        return B;
    }

    public static final _lb b(_lb _lb, Jmb jmb) {
        C7471uYa.b(_lb, "$this$flexibleUpperBound");
        C7471uYa.b(jmb, "typeTable");
        if (_lb.G()) {
            return _lb.t();
        }
        if (_lb.H()) {
            return jmb.a(_lb.u());
        }
        return null;
    }

    public static final _lb c(_lb _lb, Jmb jmb) {
        C7471uYa.b(_lb, "$this$outerType");
        C7471uYa.b(jmb, "typeTable");
        if (_lb.J()) {
            return _lb.w();
        }
        if (_lb.K()) {
            return jmb.a(_lb.x());
        }
        return null;
    }

    public static final _lb b(Blb blb, Jmb jmb) {
        C7471uYa.b(blb, "$this$returnType");
        C7471uYa.b(jmb, "typeTable");
        if (blb.G()) {
            _lb s = blb.s();
            C7471uYa.a((Object) s, "returnType");
            return s;
        } else if (blb.H()) {
            return jmb.a(blb.t());
        } else {
            throw new IllegalStateException("No returnType in ProtoBuf.Function");
        }
    }

    public static final _lb a(a aVar, Jmb jmb) {
        C7471uYa.b(aVar, "$this$type");
        C7471uYa.b(jmb, "typeTable");
        if (aVar.n()) {
            return aVar.k();
        }
        if (aVar.o()) {
            return jmb.a(aVar.l());
        }
        return null;
    }

    public static final _lb b(Olb olb, Jmb jmb) {
        C7471uYa.b(olb, "$this$returnType");
        C7471uYa.b(jmb, "typeTable");
        if (olb.F()) {
            _lb s = olb.s();
            C7471uYa.a((Object) s, "returnType");
            return s;
        } else if (olb.G()) {
            return jmb.a(olb.t());
        } else {
            throw new IllegalStateException("No returnType in ProtoBuf.Property");
        }
    }

    public static final List<_lb> a(C6527gmb gmb, Jmb jmb) {
        C7471uYa.b(gmb, "$this$upperBounds");
        C7471uYa.b(jmb, "typeTable");
        List<_lb> r = gmb.r();
        if (!(!r.isEmpty())) {
            r = null;
        }
        if (r == null) {
            List<Integer> q = gmb.q();
            C7471uYa.a((Object) q, "upperBoundIdList");
            r = new ArrayList<>(C6986nWa.a((Iterable) q, 10));
            for (Integer num : q) {
                C7471uYa.a((Object) num, "it");
                r.add(jmb.a(num.intValue()));
            }
        }
        return r;
    }

    public static final _lb b(C7003nmb nmb, Jmb jmb) {
        C7471uYa.b(nmb, "$this$varargElementType");
        C7471uYa.b(jmb, "typeTable");
        if (nmb.w()) {
            return nmb.q();
        }
        if (nmb.x()) {
            return jmb.a(nmb.r());
        }
        return null;
    }

    public static final _lb b(C5727cmb cmb, Jmb jmb) {
        C7471uYa.b(cmb, "$this$underlyingType");
        C7471uYa.b(jmb, "typeTable");
        if (cmb.B()) {
            _lb u = cmb.u();
            C7471uYa.a((Object) u, "underlyingType");
            return u;
        } else if (cmb.C()) {
            return jmb.a(cmb.v());
        } else {
            throw new IllegalStateException("No underlyingType in ProtoBuf.TypeAlias");
        }
    }

    public static final boolean a(Blb blb) {
        C7471uYa.b(blb, "$this$hasReceiver");
        return blb.E() || blb.F();
    }

    public static final _lb a(Blb blb, Jmb jmb) {
        C7471uYa.b(blb, "$this$receiverType");
        C7471uYa.b(jmb, "typeTable");
        if (blb.E()) {
            return blb.q();
        }
        if (blb.F()) {
            return jmb.a(blb.r());
        }
        return null;
    }

    public static final boolean a(Olb olb) {
        C7471uYa.b(olb, "$this$hasReceiver");
        return olb.D() || olb.E();
    }

    public static final _lb a(Olb olb, Jmb jmb) {
        C7471uYa.b(olb, "$this$receiverType");
        C7471uYa.b(jmb, "typeTable");
        if (olb.D()) {
            return olb.q();
        }
        if (olb.E()) {
            return jmb.a(olb.r());
        }
        return null;
    }

    public static final _lb a(C7003nmb nmb, Jmb jmb) {
        C7471uYa.b(nmb, "$this$type");
        C7471uYa.b(jmb, "typeTable");
        if (nmb.u()) {
            _lb o = nmb.o();
            C7471uYa.a((Object) o, C1325gg.TYPE);
            return o;
        } else if (nmb.v()) {
            return jmb.a(nmb.p());
        } else {
            throw new IllegalStateException("No type in ProtoBuf.ValueParameter");
        }
    }

    public static final _lb a(_lb _lb, Jmb jmb) {
        C7471uYa.b(_lb, "$this$abbreviatedType");
        C7471uYa.b(jmb, "typeTable");
        if (_lb.B()) {
            return _lb.l();
        }
        if (_lb.C()) {
            return jmb.a(_lb.m());
        }
        return null;
    }

    public static final _lb a(C5727cmb cmb, Jmb jmb) {
        C7471uYa.b(cmb, "$this$expandedType");
        C7471uYa.b(jmb, "typeTable");
        if (cmb.x()) {
            _lb o = cmb.o();
            C7471uYa.a((Object) o, "expandedType");
            return o;
        } else if (cmb.y()) {
            return jmb.a(cmb.p());
        } else {
            throw new IllegalStateException("No expandedType in ProtoBuf.TypeAlias");
        }
    }
}
