package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: Rrb reason: default package */
/* compiled from: TypeDeserializer.kt */
public final class Rrb {
    private final _Xa<Integer, C5029Jcb> a;
    private final _Xa<Integer, C5122Mcb> b;
    private final Map<Integer, C4905Fdb> c;
    /* access modifiers changed from: private */
    public final C6875lrb d;
    private final Rrb e;
    private final String f;
    private final String g;
    private boolean h;

    public Rrb(C6875lrb lrb, Rrb rrb, List<C6527gmb> list, String str, String str2, boolean z) {
        Map<Integer, C4905Fdb> map;
        C7471uYa.b(lrb, "c");
        C7471uYa.b(list, "typeParameterProtos");
        C7471uYa.b(str, "debugName");
        C7471uYa.b(str2, "containerPresentableName");
        this.d = lrb;
        this.e = rrb;
        this.f = str;
        this.g = str2;
        this.h = z;
        this.a = this.d.f().a((_Xa<? super K, ? extends V>) new Jrb<Object,Object>(this));
        this.b = this.d.f().a((_Xa<? super K, ? extends V>) new Mrb<Object,Object>(this));
        if (list.isEmpty()) {
            map = LWa.a();
        } else {
            map = new LinkedHashMap<>();
            int i = 0;
            for (C6527gmb gmb : list) {
                map.put(Integer.valueOf(gmb.m()), new Dsb(this.d, gmb, i));
                i++;
            }
        }
        this.c = map;
    }

    private final Ptb c(_lb _lb) {
        Object obj;
        Qrb qrb = new Qrb(this, _lb);
        if (_lb.D()) {
            C5029Jcb jcb = (C5029Jcb) this.a.invoke(Integer.valueOf(_lb.p()));
            if (jcb == null) {
                jcb = qrb.a(_lb.p());
            }
            Ptb Q = jcb.Q();
            C7471uYa.a((Object) Q, "(classDescriptors(proto.…assName)).typeConstructor");
            return Q;
        } else if (_lb.M()) {
            Ptb d2 = d(_lb.z());
            if (d2 != null) {
                return d2;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Unknown type parameter ");
            sb.append(_lb.z());
            sb.append(". Please try recompiling module containing \"");
            sb.append(this.g);
            sb.append('\"');
            Ptb d3 = C7154ptb.d(sb.toString());
            C7471uYa.a((Object) d3, "ErrorUtils.createErrorTy…\\\"\"\n                    )");
            return d3;
        } else if (_lb.N()) {
            C5272Rcb c2 = this.d.c();
            String string = this.d.e().getString(_lb.A());
            Iterator it = b().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (C7471uYa.a((Object) ((C4905Fdb) obj).getName().a(), (Object) string)) {
                    break;
                }
            }
            C4905Fdb fdb = (C4905Fdb) obj;
            if (fdb != null) {
                Ptb Q2 = fdb.Q();
                if (Q2 != null) {
                    return Q2;
                }
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Deserialized type parameter ");
            sb2.append(string);
            sb2.append(" in ");
            sb2.append(c2);
            Ptb d4 = C7154ptb.d(sb2.toString());
            C7471uYa.a((Object) d4, "ErrorUtils.createErrorTy…ter $name in $container\")");
            return d4;
        } else if (_lb.L()) {
            C5122Mcb mcb = (C5122Mcb) this.b.invoke(Integer.valueOf(_lb.y()));
            if (mcb == null) {
                mcb = qrb.a(_lb.y());
            }
            Ptb Q3 = mcb.Q();
            C7471uYa.a((Object) Q3, "(typeAliasDescriptors(pr…iasName)).typeConstructor");
            return Q3;
        } else {
            Ptb d5 = C7154ptb.d("Unknown type");
            C7471uYa.a((Object) d5, "ErrorUtils.createErrorTy…nstructor(\"Unknown type\")");
            return d5;
        }
    }

    private final Ptb d(int i) {
        C4905Fdb fdb = (C4905Fdb) this.c.get(Integer.valueOf(i));
        if (fdb != null) {
            Ptb Q = fdb.Q();
            if (Q != null) {
                return Q;
            }
        }
        Rrb rrb = this.e;
        if (rrb != null) {
            return rrb.d(i);
        }
        return null;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f);
        if (this.e == null) {
            str = "";
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(". Child of ");
            sb2.append(this.e.f);
            str = sb2.toString();
        }
        sb.append(str);
        return sb.toString();
    }

    public final List<C4905Fdb> b() {
        return C7676xWa.q(this.c.values());
    }

    public final boolean a() {
        return this.h;
    }

    public final C7706xtb b(_lb _lb) {
        C7471uYa.b(_lb, "proto");
        if (!_lb.F()) {
            return a(_lb);
        }
        String string = this.d.e().getString(_lb.s());
        Etb a2 = a(_lb);
        _lb b2 = Imb.b(_lb, this.d.h());
        if (b2 != null) {
            return this.d.a().j().a(_lb, string, a2, a(b2));
        }
        C7471uYa.a();
        throw null;
    }

    public final Etb a(_lb _lb) {
        Etb etb;
        C7471uYa.b(_lb, "proto");
        Etb etb2 = _lb.D() ? b(_lb.p()) : _lb.L() ? b(_lb.y()) : null;
        if (etb2 != null) {
            return etb2;
        }
        Ptb c2 = c(_lb);
        if (C7154ptb.a((C5272Rcb) c2.c())) {
            Etb a2 = C7154ptb.a(c2.toString(), c2);
            C7471uYa.a((Object) a2, "ErrorUtils.createErrorTy….toString(), constructor)");
            return a2;
        }
        Xrb xrb = new Xrb(this.d.f(), new Lrb(this, _lb));
        List a3 = new Krb(this).invoke(_lb);
        ArrayList arrayList = new ArrayList(C6986nWa.a((Iterable) a3, 10));
        int i = 0;
        for (Object next : a3) {
            int i2 = i + 1;
            if (i >= 0) {
                a aVar = (a) next;
                List parameters = c2.getParameters();
                C7471uYa.a((Object) parameters, "constructor.parameters");
                arrayList.add(a((C4905Fdb) C7676xWa.d(parameters, i), aVar));
                i = i2;
            } else {
                C6782kWa.c();
                throw null;
            }
        }
        List q = C7676xWa.q(arrayList);
        Boolean a4 = Dmb.a.a(_lb.r());
        C7471uYa.a((Object) a4, "Flags.SUSPEND_TYPE.get(proto.flags)");
        if (a4.booleanValue()) {
            etb = a(xrb, c2, q, _lb.v());
        } else {
            etb = C7775ytb.a(xrb, c2, q, _lb.v());
        }
        _lb a5 = Imb.a(_lb, this.d.h());
        return a5 != null ? Htb.a(etb, a(a5)) : etb;
    }

    public /* synthetic */ Rrb(C6875lrb lrb, Rrb rrb, List list, String str, String str2, boolean z, int i, C7264rYa rya) {
        this(lrb, rrb, list, str, str2, (i & 32) != 0 ? false : z);
    }

    private final Etb b(C6723jeb jeb, Ptb ptb, List<? extends Stb> list, boolean z) {
        Etb a2 = C7775ytb.a(jeb, ptb, list, z);
        if (!C5181Obb.g(a2)) {
            return null;
        }
        return a((C7706xtb) a2);
    }

    private final Etb b(int i) {
        if (Drb.a(this.d.e(), i).g()) {
            return this.d.a().k().a();
        }
        return null;
    }

    /* access modifiers changed from: private */
    public final C5122Mcb c(int i) {
        C7280rnb a2 = Drb.a(this.d.e(), i);
        if (a2.g()) {
            return null;
        }
        return C5535_cb.b(this.d.a().m(), a2);
    }

    private final Etb a(C6723jeb jeb, Ptb ptb, List<? extends Stb> list, boolean z) {
        int size = ptb.getParameters().size() - list.size();
        Etb etb = null;
        if (size == 0) {
            etb = b(jeb, ptb, list, z);
        } else if (size == 1) {
            int size2 = list.size() - 1;
            if (size2 >= 0) {
                C5029Jcb d2 = ptb.E().d(size2);
                C7471uYa.a((Object) d2, "functionTypeConstructor.…getSuspendFunction(arity)");
                Ptb Q = d2.Q();
                C7471uYa.a((Object) Q, "functionTypeConstructor.…on(arity).typeConstructor");
                etb = C7775ytb.a(jeb, Q, list, z);
            }
        }
        if (etb != null) {
            return etb;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Bad suspend function in metadata with constructor: ");
        sb.append(ptb);
        Etb a2 = C7154ptb.a(sb.toString(), list);
        C7471uYa.a((Object) a2, "ErrorUtils.createErrorTy…      arguments\n        )");
        return a2;
    }

    private final Etb a(C7706xtb xtb) {
        boolean e2 = this.d.a().e().e();
        Stb stb = (Stb) C7676xWa.i(C5181Obb.d(xtb));
        C7349snb snb = null;
        if (stb != null) {
            C7706xtb type = stb.getType();
            if (type != null) {
                C7471uYa.a((Object) type, "funType.getValueParamete…ll()?.type ?: return null");
                C5122Mcb c2 = type.za().c();
                C7349snb c3 = c2 != null ? C7148pqb.c(c2) : null;
                boolean z = true;
                if (type.ya().size() != 1 || (!C5447Xbb.a(c3, true) && !C5447Xbb.a(c3, false))) {
                    return (Etb) xtb;
                }
                C7706xtb type2 = ((Stb) C7676xWa.j(type.ya())).getType();
                C7471uYa.a((Object) type2, "continuationArgumentType.arguments.single().type");
                C5272Rcb c4 = this.d.c();
                if (!(c4 instanceof C4904Fcb)) {
                    c4 = null;
                }
                C4904Fcb fcb = (C4904Fcb) c4;
                if (fcb != null) {
                    snb = C7148pqb.a((C5272Rcb) fcb);
                }
                if (C7471uYa.a((Object) snb, (Object) Irb.a)) {
                    return a(xtb, type2);
                }
                if (!this.h && (!e2 || !C5447Xbb.a(c3, !e2))) {
                    z = false;
                }
                this.h = z;
                return a(xtb, type2);
            }
        }
        return null;
    }

    private final Etb a(C7706xtb xtb, C7706xtb xtb2) {
        C5301Sbb b2 = Fub.b(xtb);
        C6723jeb annotations = xtb.getAnnotations();
        C7706xtb b3 = C5181Obb.b(xtb);
        List<Stb> c2 = C7676xWa.c(C5181Obb.d(xtb), 1);
        ArrayList arrayList = new ArrayList(C6986nWa.a((Iterable) c2, 10));
        for (Stb type : c2) {
            arrayList.add(type.getType());
        }
        return C5181Obb.a(b2, annotations, b3, arrayList, null, xtb2, true).a(xtb.Aa());
    }

    /* access modifiers changed from: private */
    public final C5029Jcb a(int i) {
        C7280rnb a2 = Drb.a(this.d.e(), i);
        if (a2.g()) {
            return this.d.a().a(a2);
        }
        return C5535_cb.a(this.d.a().m(), a2);
    }

    private final Stb a(C4905Fdb fdb, a aVar) {
        Stb stb;
        if (aVar.j() == b.STAR) {
            if (fdb == null) {
                Etb v = this.d.a().m().E().v();
                C7471uYa.a((Object) v, "c.components.moduleDescr….builtIns.nullableAnyType");
                stb = new Ntb(v);
            } else {
                stb = new Jtb(fdb);
            }
            return stb;
        }
        Hrb hrb = Hrb.a;
        b j = aVar.j();
        C7471uYa.a((Object) j, "typeArgumentProto.projection");
        C6473fub a2 = hrb.a(j);
        _lb a3 = Imb.a(aVar, this.d.h());
        if (a3 != null) {
            return new Utb(a2, b(a3));
        }
        return new Utb(C7154ptb.c("No type recorded"));
    }
}
