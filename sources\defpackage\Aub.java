package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* renamed from: Aub reason: default package */
/* compiled from: IntersectionType.kt */
public final class Aub {
    public static final Aub a = new Aub();

    /* renamed from: Aub$a */
    /* compiled from: IntersectionType.kt */
    private enum a {
        ;

        /* renamed from: Aub$a$a reason: collision with other inner class name */
        /* compiled from: IntersectionType.kt */
        static final class C0137a extends a {
            C0137a(String str, int i) {
                super(str, i, null);
            }

            public a a(C6405eub eub) {
                C7471uYa.b(eub, "nextType");
                return b(eub);
            }
        }

        /* renamed from: Aub$a$b */
        /* compiled from: IntersectionType.kt */
        static final class b extends a {
            b(String str, int i) {
                super(str, i, null);
            }

            public b a(C6405eub eub) {
                C7471uYa.b(eub, "nextType");
                return this;
            }
        }

        /* renamed from: Aub$a$c */
        /* compiled from: IntersectionType.kt */
        static final class c extends a {
            c(String str, int i) {
                super(str, i, null);
            }

            public a a(C6405eub eub) {
                C7471uYa.b(eub, "nextType");
                return b(eub);
            }
        }

        /* renamed from: Aub$a$d */
        /* compiled from: IntersectionType.kt */
        static final class d extends a {
            d(String str, int i) {
                super(str, i, null);
            }

            public a a(C6405eub eub) {
                C7471uYa.b(eub, "nextType");
                a b = b(eub);
                return b == a.b ? this : b;
            }
        }

        public abstract a a(C6405eub eub);

        /* access modifiers changed from: protected */
        public final a b(C6405eub eub) {
            C7471uYa.b(eub, "$this$resultNullability");
            if (eub.Aa()) {
                return b;
            }
            if (C7363sub.a.a(eub)) {
                return d;
            }
            return c;
        }
    }

    private Aub() {
    }

    public final Etb a(List<? extends Etb> list) {
        C7471uYa.b(list, "types");
        boolean z = list.size() > 1;
        if (!TVa.a || z) {
            ArrayList<C6405eub> arrayList = new ArrayList<>();
            for (Etb etb : list) {
                if (etb.za() instanceof C7637wtb) {
                    Collection<C7706xtb> b = etb.za().b();
                    C7471uYa.a((Object) b, "type.constructor.supertypes");
                    ArrayList arrayList2 = new ArrayList(C6986nWa.a((Iterable) b, 10));
                    for (C7706xtb xtb : b) {
                        C7471uYa.a((Object) xtb, "it");
                        Etb d = C7430ttb.d(xtb);
                        if (etb.Aa()) {
                            d = d.a(true);
                        }
                        arrayList2.add(d);
                    }
                    arrayList.addAll(arrayList2);
                } else {
                    arrayList.add(etb);
                }
            }
            a aVar = a.a;
            for (C6405eub a2 : arrayList) {
                aVar = aVar.a(a2);
            }
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Etb etb2 = (Etb) it.next();
                if (aVar == a.d) {
                    etb2 = Htb.a(etb2);
                }
                linkedHashSet.add(etb2);
            }
            return a((Set<? extends Etb>) linkedHashSet);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Size should be at least 2, but it is ");
        sb.append(list.size());
        throw new AssertionError(sb.toString());
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x0061 A[SYNTHETIC] */
    private final Etb a(Set<? extends Etb> set) {
        boolean z;
        if (set.size() == 1) {
            return (Etb) C7676xWa.m(set);
        }
        ArrayList arrayList = new ArrayList(set);
        Iterator it = arrayList.iterator();
        C7471uYa.a((Object) it, "filteredSuperAndEqualTypes.iterator()");
        while (true) {
            boolean z2 = false;
            if (!it.hasNext()) {
                break;
            }
            Etb etb = (Etb) it.next();
            if (!arrayList.isEmpty()) {
                Iterator it2 = arrayList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Etb etb2 = (Etb) it2.next();
                    if (etb2 != etb) {
                        Aub aub = a;
                        C7471uYa.a((Object) etb2, "lower");
                        C7471uYa.a((Object) etb, "upper");
                        if (aub.a(etb2, etb) || C7225qub.a.a((C7706xtb) etb2, (C7706xtb) etb)) {
                            z = true;
                            continue;
                            if (z) {
                                z2 = true;
                                break;
                            }
                        }
                    }
                    z = false;
                    continue;
                    if (z) {
                    }
                }
            }
            if (z2) {
                it.remove();
            }
        }
        boolean isEmpty = true ^ arrayList.isEmpty();
        if (TVa.a && !isEmpty) {
            StringBuilder sb = new StringBuilder();
            sb.append("This collections cannot be empty! input types: ");
            sb.append(C7676xWa.a(set, null, null, null, 0, null, null, 63, null));
            throw new AssertionError(sb.toString());
        } else if (arrayList.size() < 2) {
            Object j = C7676xWa.j((List) arrayList);
            C7471uYa.a(j, "filteredSuperAndEqualTypes.single()");
            return (Etb) j;
        } else {
            C7637wtb wtb = new C7637wtb(set);
            return C7775ytb.a(C6723jeb.c.a(), wtb, C6918mWa.a(), false, wtb.e());
        }
    }

    private final boolean a(C7706xtb xtb, C7706xtb xtb2) {
        C7225qub qub = C7225qub.a;
        return qub.b(xtb, xtb2) && !qub.b(xtb2, xtb);
    }
}
