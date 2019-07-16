package defpackage;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: qub reason: default package and case insensitive filesystem */
/* compiled from: NewKotlinTypeChecker.kt */
public final class C7225qub implements C6745jub {
    public static final C7225qub a = new C7225qub();

    private C7225qub() {
    }

    private final List<Etb> c(C7570vub vub, Etb etb, Ptb ptb) {
        return a(b(vub, etb, ptb));
    }

    public boolean a(C7706xtb xtb, C7706xtb xtb2) {
        C7471uYa.b(xtb, "a");
        C7471uYa.b(xtb2, "b");
        return a(new C7570vub(false, false, 2, null), xtb.Ba(), xtb2.Ba());
    }

    public boolean b(C7706xtb xtb, C7706xtb xtb2) {
        C7471uYa.b(xtb, "subtype");
        C7471uYa.b(xtb2, "supertype");
        return b(new C7570vub(true, false, 2, null), xtb.Ba(), xtb2.Ba());
    }

    private final boolean b(C7706xtb xtb) {
        return xtb.za().d() && !C6879ltb.a(xtb) && !Htb.c(xtb) && C7471uYa.a((Object) C7430ttb.c(xtb).za(), (Object) C7430ttb.d(xtb).za());
    }

    public final boolean a(C7570vub vub, C6405eub eub, C6405eub eub2) {
        C7471uYa.b(vub, "$this$equalTypes");
        C7471uYa.b(eub, "a");
        C7471uYa.b(eub2, "b");
        boolean z = true;
        if (eub == eub2) {
            return true;
        }
        if (b(eub) && b(eub2)) {
            if (!vub.a(eub.za(), eub2.za())) {
                return false;
            }
            if (eub.ya().isEmpty()) {
                if (!a((C7706xtb) eub) && !a((C7706xtb) eub2) && eub.Aa() != eub2.Aa()) {
                    z = false;
                }
                return z;
            }
        }
        if (!b(vub, eub, eub2) || !b(vub, eub2, eub)) {
            z = false;
        }
        return z;
    }

    public final boolean b(C7570vub vub, C6405eub eub, C6405eub eub2) {
        C7471uYa.b(vub, "$this$isSubtypeOf");
        C7471uYa.b(eub, "subType");
        C7471uYa.b(eub2, "superType");
        if (eub == eub2) {
            return true;
        }
        C6405eub a2 = a(eub);
        C6405eub a3 = a(eub2);
        Boolean a4 = a(vub, C7430ttb.c(a2), C7430ttb.d(a3));
        if (a4 != null) {
            boolean booleanValue = a4.booleanValue();
            vub.a(a2, a3);
            return booleanValue;
        }
        Boolean a5 = vub.a(a2, a3);
        if (a5 != null) {
            return a5.booleanValue();
        }
        return b(vub, C7430ttb.c(a2), C7430ttb.d(a3));
    }

    private final boolean a(C7706xtb xtb) {
        return C7430ttb.c(xtb).Aa() != C7430ttb.d(xtb).Aa();
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0083  */
    public final Etb a(Etb etb) {
        C6405eub eub;
        C7018nub e;
        C7471uYa.b(etb, C1325gg.TYPE);
        Ptb za = etb.za();
        boolean z = true;
        C7637wtb wtb = null;
        if (za instanceof Dpb) {
            Dpb dpb = (Dpb) za;
            Stb a2 = dpb.a();
            if (a2.b() != C6473fub.IN_VARIANCE) {
                z = false;
            }
            if (!z) {
                a2 = null;
            }
            if (a2 != null) {
                C7706xtb type = a2.getType();
                if (type != null) {
                    eub = type.Ba();
                    if (dpb.e() == null) {
                        Stb a3 = dpb.a();
                        Collection<C7706xtb> b = dpb.b();
                        ArrayList arrayList = new ArrayList(C6986nWa.a((Iterable<? extends T>) b, 10));
                        for (C7706xtb Ba : b) {
                            arrayList.add(Ba.Ba());
                        }
                        dpb.a(new C7018nub(a3, arrayList));
                    }
                    C6609hub hub = C6609hub.FOR_SUBTYPING;
                    e = dpb.e();
                    if (e == null) {
                        C6949mub mub = new C6949mub(hub, e, eub, etb.getAnnotations(), etb.Aa());
                        return mub;
                    }
                    C7471uYa.a();
                    throw null;
                }
            }
            eub = null;
            if (dpb.e() == null) {
            }
            C6609hub hub2 = C6609hub.FOR_SUBTYPING;
            e = dpb.e();
            if (e == null) {
            }
        } else if (za instanceof Xpb) {
            Collection<C7706xtb> b2 = ((Xpb) za).b();
            ArrayList arrayList2 = new ArrayList(C6986nWa.a((Iterable<? extends T>) b2, 10));
            for (C7706xtb a4 : b2) {
                arrayList2.add(C5605aub.a(a4, etb.Aa()));
            }
            return C7775ytb.a(etb.getAnnotations(), new C7637wtb(arrayList2), C6918mWa.a(), false, etb.ha());
        } else {
            if ((za instanceof C7637wtb) && etb.Aa()) {
                C7637wtb wtb2 = (C7637wtb) za;
                Collection<C7706xtb> b3 = wtb2.b();
                ArrayList arrayList3 = new ArrayList(C6986nWa.a((Iterable<? extends T>) b3, 10));
                boolean z2 = false;
                for (C7706xtb f : b3) {
                    arrayList3.add(Fub.f(f));
                    z2 = true;
                }
                if (z2) {
                    wtb = new C7637wtb(arrayList3);
                }
                if (wtb != null) {
                    wtb2 = wtb;
                }
                etb = C7775ytb.a(etb.getAnnotations(), wtb2, C6918mWa.a(), false, wtb2.e());
            }
            return etb;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:58:0x00e4 A[RETURN] */
    private final boolean b(C7570vub vub, Etb etb, Etb etb2) {
        boolean z;
        C7570vub vub2 = vub;
        Etb etb3 = etb;
        Etb etb4 = etb2;
        boolean z2 = C7294rub.c(etb) || C7294rub.b(etb) || vub.a((C6405eub) etb);
        if (!TVa.a || z2) {
            boolean z3 = C7294rub.c(etb2) || vub2.a((C6405eub) etb4);
            if (TVa.a && !z3) {
                StringBuilder sb = new StringBuilder();
                sb.append("Not singleClassifierType superType: ");
                sb.append(etb4);
                throw new AssertionError(sb.toString());
            } else if (!C7363sub.a.a(vub2, etb3, etb4)) {
                return false;
            } else {
                Ptb za = etb2.za();
                if ((C7471uYa.a((Object) etb.za(), (Object) za) && za.getParameters().isEmpty()) || Fub.c(etb2)) {
                    return true;
                }
                List<Etb> a2 = a(vub2, etb3, za);
                int size = a2.size();
                if (size == 0) {
                    return a(vub, etb);
                }
                if (size == 1) {
                    return a(vub2, ((Etb) C7676xWa.f(a2)).ya(), etb4);
                }
                int i = C7156pub.b[vub.b().ordinal()];
                if (i == 1) {
                    return false;
                }
                if (i == 2) {
                    return a(vub2, ((Etb) C7676xWa.f(a2)).ya(), etb4);
                }
                if (i == 3 || i == 4) {
                    if (!(a2 instanceof Collection) || !a2.isEmpty()) {
                        Iterator it = a2.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            if (a.a(vub2, ((Etb) it.next()).ya(), etb4)) {
                                z = true;
                                break;
                            }
                        }
                        if (z) {
                            return true;
                        }
                    }
                    z = false;
                    if (z) {
                    }
                }
                if (vub.b() != b.INTERSECT_ARGUMENTS_AND_CHECK_AGAIN) {
                    return false;
                }
                List parameters = za.getParameters();
                C7471uYa.a((Object) parameters, "superConstructor.parameters");
                int i2 = 10;
                ArrayList arrayList = new ArrayList(C6986nWa.a((Iterable<? extends T>) parameters, 10));
                int i3 = 0;
                for (Object next : parameters) {
                    int i4 = i3 + 1;
                    if (i3 >= 0) {
                        C4905Fdb fdb = (C4905Fdb) next;
                        ArrayList arrayList2 = new ArrayList(C6986nWa.a((Iterable<? extends T>) a2, i2));
                        for (Etb etb5 : a2) {
                            Stb stb = (Stb) C7676xWa.d(etb5.ya(), i3);
                            if (stb != null) {
                                if (!(stb.b() == C6473fub.INVARIANT)) {
                                    stb = null;
                                }
                                if (stb != null) {
                                    C7706xtb type = stb.getType();
                                    if (type != null) {
                                        C6405eub Ba = type.Ba();
                                        if (Ba != null) {
                                            arrayList2.add(Ba);
                                        }
                                    }
                                }
                            }
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("Incorrect type: ");
                            sb2.append(etb5);
                            sb2.append(", subType: ");
                            sb2.append(etb3);
                            sb2.append(", superType: ");
                            sb2.append(etb4);
                            throw new IllegalStateException(sb2.toString().toString());
                        }
                        arrayList.add(Fub.a((C7706xtb) C6677iub.a(arrayList2)));
                        i3 = i4;
                        i2 = 10;
                    } else {
                        C6782kWa.c();
                        throw null;
                    }
                }
                return a(vub2, (List<? extends Stb>) arrayList, etb4);
            }
        } else {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Not singleClassifierType and not intersection subType: ");
            sb3.append(etb3);
            throw new AssertionError(sb3.toString());
        }
    }

    public final C6405eub a(C6405eub eub) {
        C6405eub eub2;
        C7471uYa.b(eub, C1325gg.TYPE);
        if (eub instanceof Etb) {
            eub2 = a((Etb) eub);
        } else if (eub instanceof C7223qtb) {
            C7223qtb qtb = (C7223qtb) eub;
            Etb a2 = a(qtb.Da());
            Etb a3 = a(qtb.Ea());
            if (a2 == qtb.Da() && a3 == qtb.Ea()) {
                eub2 = eub;
            } else {
                eub2 = C7775ytb.a(a2, a3);
            }
        } else {
            throw new FVa();
        }
        return C6269cub.a(eub2, eub);
    }

    private final List<Etb> b(C7570vub vub, Etb etb, Ptb ptb) {
        c cVar;
        List<Etb> list;
        C7570vub vub2 = vub;
        Etb etb2 = etb;
        Ptb ptb2 = ptb;
        C5122Mcb c = ptb.c();
        if (!(c instanceof C5029Jcb)) {
            c = null;
        }
        C5029Jcb jcb = (C5029Jcb) c;
        if (jcb != null) {
            if (a(jcb)) {
                if (vub2.a(etb.za(), ptb2)) {
                    Etb a2 = C7087oub.a(etb2, C6609hub.FOR_SUBTYPING, null, 4, null);
                    if (a2 == null) {
                        a2 = etb2;
                    }
                    list = C6850lWa.a(a2);
                } else {
                    list = C6918mWa.a();
                }
                return list;
            }
        }
        Fvb fvb = new Fvb();
        vub.d();
        ArrayDeque c2 = vub.c;
        if (c2 != null) {
            Set d = vub.d;
            if (d != null) {
                c2.push(etb2);
                while (!c2.isEmpty()) {
                    if (d.size() <= 1000) {
                        Etb etb3 = (Etb) c2.pop();
                        C7471uYa.a((Object) etb3, "current");
                        if (d.add(etb3)) {
                            Etb a3 = C7087oub.a(etb3, C6609hub.FOR_SUBTYPING, null, 4, null);
                            if (a3 == null) {
                                a3 = etb3;
                            }
                            if (vub2.a(a3.za(), ptb2)) {
                                fvb.add(a3);
                                cVar = C0185c.a;
                            } else if (a3.ya().isEmpty()) {
                                cVar = a.a;
                            } else {
                                cVar = new b(Rtb.c.a(a3).c());
                            }
                            if (!(!C7471uYa.a((Object) cVar, (Object) C0185c.a))) {
                                cVar = null;
                            }
                            if (cVar != null) {
                                for (C7706xtb xtb : etb3.za().b()) {
                                    C7471uYa.a((Object) xtb, "supertype");
                                    c2.add(cVar.a(xtb));
                                }
                            }
                        }
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Too many supertypes for type: ");
                        sb.append(etb2);
                        sb.append(". Supertypes = ");
                        sb.append(C7676xWa.a(d, null, null, null, 0, null, null, 63, null));
                        throw new IllegalStateException(sb.toString().toString());
                    }
                }
                vub.c();
                return fvb;
            }
            C7471uYa.a();
            throw null;
        }
        C7471uYa.a();
        throw null;
    }

    private final Boolean a(C7570vub vub, Etb etb, Etb etb2) {
        boolean a2 = C7844ztb.a(etb);
        boolean z = true;
        Boolean valueOf = Boolean.valueOf(true);
        if (!a2 && !C7844ztb.a(etb2)) {
            if (etb2 instanceof C6949mub) {
                C6949mub mub = (C6949mub) etb2;
                if (mub.Ca() != null) {
                    int i = C7156pub.a[vub.a(etb, mub).ordinal()];
                    if (i == 1) {
                        return Boolean.valueOf(b(vub, (C6405eub) etb, mub.Ca()));
                    }
                    if (i == 2 && b(vub, (C6405eub) etb, mub.Ca())) {
                        return valueOf;
                    }
                }
            }
            Ptb za = etb2.za();
            if (!(za instanceof C7637wtb)) {
                za = null;
            }
            C7637wtb wtb = (C7637wtb) za;
            if (wtb == null) {
                return null;
            }
            boolean z2 = !etb2.Aa();
            if (!TVa.a || z2) {
                Collection b = wtb.b();
                if (!(b instanceof Collection) || !b.isEmpty()) {
                    Iterator it = b.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        if (!a.b(vub, (C6405eub) etb, ((C7706xtb) it.next()).Ba())) {
                            z = false;
                            break;
                        }
                    }
                }
                return Boolean.valueOf(z);
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Intersection type should not be marked nullable!: ");
            sb.append(etb2);
            throw new AssertionError(sb.toString());
        } else if (vub.a()) {
            return valueOf;
        } else {
            if (!etb.Aa() || etb2.Aa()) {
                return Boolean.valueOf(C7432tub.a.a(etb.a(false), etb2.a(false)));
            }
            return Boolean.valueOf(false);
        }
    }

    private final boolean a(C7570vub vub, Etb etb) {
        c cVar;
        if (C5301Sbb.p(etb)) {
            return true;
        }
        vub.d();
        ArrayDeque c = vub.c;
        if (c != null) {
            Set d = vub.d;
            if (d != null) {
                c.push(etb);
                while (!c.isEmpty()) {
                    if (d.size() <= 1000) {
                        Etb etb2 = (Etb) c.pop();
                        C7471uYa.a((Object) etb2, "current");
                        if (d.add(etb2)) {
                            if (C7294rub.a(etb2)) {
                                cVar = C0185c.a;
                            } else {
                                cVar = a.a;
                            }
                            if (!(!C7471uYa.a((Object) cVar, (Object) C0185c.a))) {
                                cVar = null;
                            }
                            if (cVar != null) {
                                for (C7706xtb xtb : etb2.za().b()) {
                                    C7471uYa.a((Object) xtb, "supertype");
                                    Etb a2 = cVar.a(xtb);
                                    if (C5301Sbb.p(a2)) {
                                        vub.c();
                                        return true;
                                    }
                                    c.add(a2);
                                }
                                continue;
                            } else {
                                continue;
                            }
                        }
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Too many supertypes for type: ");
                        sb.append(etb);
                        sb.append(". Supertypes = ");
                        sb.append(C7676xWa.a(d, null, null, null, 0, null, null, 63, null));
                        throw new IllegalStateException(sb.toString().toString());
                    }
                }
                vub.c();
                return false;
            }
            C7471uYa.a();
            throw null;
        }
        C7471uYa.a();
        throw null;
    }

    public final List<Etb> a(C7570vub vub, Etb etb, Ptb ptb) {
        c cVar;
        C7471uYa.b(vub, "$this$findCorrespondingSupertypes");
        C7471uYa.b(etb, "baseType");
        C7471uYa.b(ptb, "constructor");
        if (C7294rub.a(etb)) {
            return c(vub, etb, ptb);
        }
        if (!(ptb.c() instanceof C5029Jcb)) {
            return b(vub, etb, ptb);
        }
        Fvb<Etb> fvb = new Fvb<>();
        vub.d();
        ArrayDeque c = vub.c;
        if (c != null) {
            Set d = vub.d;
            if (d != null) {
                c.push(etb);
                while (!c.isEmpty()) {
                    if (d.size() <= 1000) {
                        Etb etb2 = (Etb) c.pop();
                        C7471uYa.a((Object) etb2, "current");
                        if (d.add(etb2)) {
                            if (C7294rub.a(etb2)) {
                                fvb.add(etb2);
                                cVar = C0185c.a;
                            } else {
                                cVar = a.a;
                            }
                            if (!(!C7471uYa.a((Object) cVar, (Object) C0185c.a))) {
                                cVar = null;
                            }
                            if (cVar != null) {
                                for (C7706xtb xtb : etb2.za().b()) {
                                    C7471uYa.a((Object) xtb, "supertype");
                                    c.add(cVar.a(xtb));
                                }
                            }
                        }
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Too many supertypes for type: ");
                        sb.append(etb);
                        sb.append(". Supertypes = ");
                        sb.append(C7676xWa.a(d, null, null, null, 0, null, null, 63, null));
                        throw new IllegalStateException(sb.toString().toString());
                    }
                }
                vub.c();
                ArrayList arrayList = new ArrayList();
                for (Etb etb3 : fvb) {
                    C7225qub qub = a;
                    C7471uYa.a((Object) etb3, "it");
                    C7331sWa.a((Collection<? super T>) arrayList, (Iterable<? extends T>) qub.c(vub, etb3, ptb));
                }
                return arrayList;
            }
            C7471uYa.a();
            throw null;
        }
        C7471uYa.a();
        throw null;
    }

    private final boolean a(C5029Jcb jcb) {
        return (!C6382edb.a(jcb) || jcb.g() == C5060Kcb.ENUM_ENTRY || jcb.g() == C5060Kcb.ANNOTATION_CLASS) ? false : true;
    }

    private final List<Etb> a(List<? extends Etb> list) {
        if (list.size() < 2) {
            return list;
        }
        List<? extends Etb> arrayList = new ArrayList<>();
        Iterator it = list.iterator();
        while (true) {
            boolean z = true;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            List ya = ((Etb) next).ya();
            if (!(ya instanceof Collection) || !ya.isEmpty()) {
                Iterator it2 = ya.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    C7706xtb type = ((Stb) it2.next()).getType();
                    C7471uYa.a((Object) type, "it.type");
                    if (!(!C7430ttb.b(type))) {
                        z = false;
                        break;
                    }
                }
            }
            if (z) {
                arrayList.add(next);
            }
        }
        if (!arrayList.isEmpty()) {
            list = arrayList;
        }
        return list;
    }

    public final C6473fub a(C6473fub fub, C6473fub fub2) {
        C7471uYa.b(fub, "declared");
        C7471uYa.b(fub2, "useSite");
        C6473fub fub3 = C6473fub.INVARIANT;
        if (fub == fub3) {
            return fub2;
        }
        if (fub2 == fub3 || fub == fub2) {
            return fub;
        }
        return null;
    }

    private final boolean a(C7570vub vub, List<? extends Stb> list, Etb etb) {
        boolean z;
        if (list == etb.ya()) {
            return true;
        }
        List parameters = etb.za().getParameters();
        C7471uYa.a((Object) parameters, "superType.constructor.parameters");
        int size = parameters.size();
        for (int i = 0; i < size; i++) {
            Stb stb = (Stb) etb.ya().get(i);
            if (!stb.a()) {
                C6405eub Ba = stb.getType().Ba();
                Stb stb2 = (Stb) list.get(i);
                boolean z2 = stb2.b() == C6473fub.INVARIANT;
                if (!TVa.a || z2) {
                    C6405eub Ba2 = stb2.getType().Ba();
                    Object obj = parameters.get(i);
                    C7471uYa.a(obj, "parameters[index]");
                    C6473fub pa = ((C4905Fdb) obj).pa();
                    C7471uYa.a((Object) pa, "parameters[index].variance");
                    C6473fub b = stb.b();
                    C7471uYa.a((Object) b, "superProjection.projectionKind");
                    C6473fub a2 = a(pa, b);
                    if (a2 == null) {
                        return vub.a();
                    }
                    if (vub.a <= 100) {
                        vub.a = vub.a + 1;
                        int i2 = C7156pub.c[a2.ordinal()];
                        if (i2 == 1) {
                            z = a.a(vub, Ba2, Ba);
                        } else if (i2 == 2) {
                            z = a.b(vub, Ba2, Ba);
                        } else if (i2 == 3) {
                            z = a.b(vub, Ba, Ba2);
                        } else {
                            throw new FVa();
                        }
                        vub.a = vub.a - 1;
                        if (!z) {
                            return false;
                        }
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Arguments depth is too high. Some related argument: ");
                        sb.append(Ba2);
                        throw new IllegalStateException(sb.toString().toString());
                    }
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Incorrect sub argument: ");
                    sb2.append(stb2);
                    throw new AssertionError(sb2.toString());
                }
            }
        }
        return true;
    }
}
