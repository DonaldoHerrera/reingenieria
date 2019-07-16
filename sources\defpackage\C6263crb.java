package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: crb reason: default package and case insensitive filesystem */
/* compiled from: AnnotationDeserializer.kt */
public final class C6263crb {
    private final C6450fdb a;
    private final C6586hdb b;

    public C6263crb(C6450fdb fdb, C6586hdb hdb) {
        C7471uYa.b(fdb, "module");
        C7471uYa.b(hdb, "notFoundClasses");
        this.a = fdb;
        this.b = hdb;
    }

    private final C5301Sbb a() {
        return this.a.E();
    }

    public final C6315deb a(C5590alb alb, Emb emb) {
        String str;
        C7471uYa.b(alb, "proto");
        C7471uYa.b(emb, "nameResolver");
        C5029Jcb a2 = a(Drb.a(emb, alb.l()));
        Map a3 = LWa.a();
        if (alb.h() != 0 && !C7154ptb.a((C5272Rcb) a2) && C6531gpb.g(a2)) {
            Collection i = a2.i();
            C7471uYa.a((Object) i, "annotationClass.constructors");
            C4997Icb icb = (C4997Icb) C7676xWa.n(i);
            if (icb != null) {
                List f = icb.f();
                C7471uYa.a((Object) f, "constructor.valueParameters");
                LinkedHashMap linkedHashMap = new LinkedHashMap(C7265rZa.a(LWa.a(C6986nWa.a((Iterable<? extends T>) f, 10)), 16));
                Iterator it = f.iterator();
                while (true) {
                    str = "it";
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    C5061Kdb kdb = (C5061Kdb) next;
                    C7471uYa.a((Object) kdb, str);
                    linkedHashMap.put(kdb.getName(), next);
                }
                List<a> j = alb.j();
                C7471uYa.a((Object) j, "proto.argumentList");
                ArrayList arrayList = new ArrayList();
                for (a aVar : j) {
                    C7471uYa.a((Object) aVar, str);
                    HVa a4 = a(aVar, (Map<C7694xnb, ? extends C5061Kdb>) linkedHashMap, emb);
                    if (a4 != null) {
                        arrayList.add(a4);
                    }
                }
                a3 = LWa.a((Iterable<? extends HVa<? extends K, ? extends V>>) arrayList);
            }
        }
        return new C6383eeb(a2.z(), a3, C7822zdb.a);
    }

    private final HVa<C7694xnb, Npb<?>> a(a aVar, Map<C7694xnb, ? extends C5061Kdb> map, Emb emb) {
        C5061Kdb kdb = (C5061Kdb) map.get(Drb.b(emb, aVar.j()));
        if (kdb == null) {
            return null;
        }
        C7694xnb b2 = Drb.b(emb, aVar.j());
        C7706xtb type = kdb.getType();
        C7471uYa.a((Object) type, "parameter.type");
        b k = aVar.k();
        C7471uYa.a((Object) k, "proto.value");
        return new HVa<>(b2, a(type, k, emb));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0126, code lost:
        r11 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x01b3, code lost:
        if (defpackage.Fub.a(r11.a(r8.a), r9) == false) goto L_0x01b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x01b6, code lost:
        r0 = defpackage.Tpb.b;
        r1 = new java.lang.StringBuilder();
        r1.append("Unexpected argument value: type ");
        r1.append(r11.a(r8.a));
        r1.append(" is not a subtype of ");
        r1.append(r9);
        r1.append(" (value.type = ");
        r1.append(r10.u());
        r1.append(')');
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:?, code lost:
        return r0.a(r1.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:?, code lost:
        return r11;
     */
    public final Npb<?> a(C7706xtb xtb, b bVar, Emb emb) {
        Npb<?> npb;
        Npb<?> kpb;
        C7706xtb xtb2;
        C7471uYa.b(xtb, "expectedType");
        C7471uYa.b(bVar, "value");
        C7471uYa.b(emb, "nameResolver");
        Boolean a2 = Dmb.K.a(bVar.q());
        C7471uYa.a((Object) a2, "Flags.IS_UNSIGNED.get(value.flags)");
        boolean booleanValue = a2.booleanValue();
        C0165b u = bVar.u();
        if (u != null) {
            boolean z = false;
            switch (C5667brb.a[u.ordinal()]) {
                case 1:
                    byte s = (byte) ((int) bVar.s());
                    if (!booleanValue) {
                        kpb = new Kpb<>(s);
                        break;
                    } else {
                        kpb = new C6261cqb<>(s);
                        break;
                    }
                case 2:
                    npb = new Lpb<>((char) ((int) bVar.s()));
                    break;
                case 3:
                    short s2 = (short) ((int) bVar.s());
                    if (!booleanValue) {
                        kpb = new C5597aqb<>(s2);
                        break;
                    } else {
                        kpb = new C6465fqb<>(s2);
                        break;
                    }
                case 4:
                    int s3 = (int) bVar.s();
                    if (!booleanValue) {
                        kpb = new Vpb<>(s3);
                        break;
                    } else {
                        kpb = new C6329dqb<>(s3);
                        break;
                    }
                case 5:
                    long s4 = bVar.s();
                    if (!booleanValue) {
                        npb = new Zpb<>(s4);
                        break;
                    } else {
                        npb = new C6397eqb<>(s4);
                        break;
                    }
                case 6:
                    npb = new Upb<>(bVar.r());
                    break;
                case 7:
                    npb = new Rpb<>(bVar.o());
                    break;
                case 8:
                    if (bVar.s() != 0) {
                        z = true;
                    }
                    npb = new Jpb<>(z);
                    break;
                case 9:
                    kpb = new C5665bqb<>(emb.getString(bVar.t()));
                    break;
                case 10:
                    kpb = new Ypb<>(Drb.a(emb, bVar.m()), bVar.j());
                    break;
                case 11:
                    kpb = new Spb<>(Drb.a(emb, bVar.m()), Drb.b(emb, bVar.p()));
                    break;
                case 12:
                    C5590alb h = bVar.h();
                    C7471uYa.a((Object) h, "value.annotation");
                    kpb = new Hpb<>(a(h, emb));
                    break;
                case 13:
                    if (C5301Sbb.d(xtb) || C5301Sbb.r(xtb)) {
                        z = true;
                    }
                    List<b> l = bVar.l();
                    C7471uYa.a((Object) l, "arrayElements");
                    if (!l.isEmpty()) {
                        Object f = C7676xWa.f((List) l);
                        C7471uYa.a(f, "arrayElements.first()");
                        Etb a3 = a((b) f, emb);
                        Etb b2 = a().b((C7706xtb) a3);
                        if (b2 != null) {
                            xtb2 = b2;
                        } else {
                            xtb2 = a().a(C6473fub.INVARIANT, (C7706xtb) a3);
                            C7471uYa.a((Object) xtb2, "builtIns.getArrayType(Va…RIANT, actualElementType)");
                        }
                    } else if (z) {
                        xtb2 = xtb;
                    } else {
                        xtb2 = a().a(C6473fub.INVARIANT, (C7706xtb) a().e());
                        C7471uYa.a((Object) xtb2, "builtIns.getArrayType(Va…ARIANT, builtIns.anyType)");
                    }
                    C7706xtb a4 = a().a(z ? xtb : xtb2);
                    C7471uYa.a((Object) a4, "builtIns.getArrayElement…ype else actualArrayType)");
                    Qpb qpb = Qpb.a;
                    ArrayList arrayList = new ArrayList(C6986nWa.a((Iterable<? extends T>) l, 10));
                    for (b bVar2 : l) {
                        C7471uYa.a((Object) bVar2, "it");
                        arrayList.add(a(a4, bVar2, emb));
                    }
                    npb = qpb.a((List<? extends Npb<?>>) arrayList, xtb2);
                    break;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unsupported annotation argument type: ");
        sb.append(bVar.u());
        sb.append(" (expected ");
        sb.append(xtb);
        sb.append(')');
        throw new IllegalStateException(sb.toString().toString());
    }

    private final Etb a(b bVar, Emb emb) {
        C5301Sbb a2 = a();
        C0165b u = bVar.u();
        if (u != null) {
            switch (C5667brb.b[u.ordinal()]) {
                case 1:
                    Etb j = a2.j();
                    C7471uYa.a((Object) j, "byteType");
                    return j;
                case 2:
                    Etb k = a2.k();
                    C7471uYa.a((Object) k, "charType");
                    return k;
                case 3:
                    Etb z = a2.z();
                    C7471uYa.a((Object) z, "shortType");
                    return z;
                case 4:
                    Etb q = a2.q();
                    C7471uYa.a((Object) q, "intType");
                    return q;
                case 5:
                    Etb s = a2.s();
                    C7471uYa.a((Object) s, "longType");
                    return s;
                case 6:
                    Etb p = a2.p();
                    C7471uYa.a((Object) p, "floatType");
                    return p;
                case 7:
                    Etb o = a2.o();
                    C7471uYa.a((Object) o, "doubleType");
                    return o;
                case 8:
                    Etb g = a2.g();
                    C7471uYa.a((Object) g, "booleanType");
                    return g;
                case 9:
                    Etb C = a2.C();
                    C7471uYa.a((Object) C, "stringType");
                    return C;
                case 10:
                    throw new IllegalStateException("Arrays of class literals are not supported yet");
                case 11:
                    Etb z2 = a(Drb.a(emb, bVar.m())).z();
                    C7471uYa.a((Object) z2, "resolveClass(nameResolve…lue.classId)).defaultType");
                    return z2;
                case 12:
                    C5590alb h = bVar.h();
                    C7471uYa.a((Object) h, "value.annotation");
                    Etb z3 = a(Drb.a(emb, h.l())).z();
                    C7471uYa.a((Object) z3, "resolveClass(nameResolve…notation.id)).defaultType");
                    return z3;
                case 13:
                    throw new IllegalStateException("Array of arrays is impossible");
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unknown type: ");
        sb.append(bVar.u());
        throw new IllegalStateException(sb.toString().toString());
    }

    private final C5029Jcb a(C7280rnb rnb) {
        return C5535_cb.a(this.a, rnb, this.b);
    }
}
