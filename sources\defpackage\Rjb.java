package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: Rjb reason: default package */
/* compiled from: signatureEnhancement.kt */
public final class Rjb {
    private final Ifb a;
    private final C7848zvb b;

    /* renamed from: Rjb$a */
    /* compiled from: signatureEnhancement.kt */
    private static class a {
        private final C7706xtb a;
        private final boolean b;
        private final boolean c;

        public a(C7706xtb xtb, boolean z, boolean z2) {
            C7471uYa.b(xtb, C1325gg.TYPE);
            this.a = xtb;
            this.b = z;
            this.c = z2;
        }

        public final boolean a() {
            return this.c;
        }

        public final C7706xtb b() {
            return this.a;
        }

        public final boolean c() {
            return this.b;
        }
    }

    /* renamed from: Rjb$b */
    /* compiled from: signatureEnhancement.kt */
    private final class b {
        private final C5651beb a;
        private final C7706xtb b;
        private final Collection<C7706xtb> c;
        private final boolean d;
        private final C6590hhb e;
        private final defpackage.Ifb.a f;
        final /* synthetic */ Rjb g;

        public b(Rjb rjb, C5651beb beb, C7706xtb xtb, Collection<? extends C7706xtb> collection, boolean z, C6590hhb hhb, defpackage.Ifb.a aVar) {
            C7471uYa.b(xtb, "fromOverride");
            C7471uYa.b(collection, "fromOverridden");
            C7471uYa.b(hhb, "containerContext");
            C7471uYa.b(aVar, "containerApplicabilityType");
            this.g = rjb;
            this.a = beb;
            this.b = xtb;
            this.c = collection;
            this.d = z;
            this.e = hhb;
            this.f = aVar;
        }

        public static /* synthetic */ a a(b bVar, C6457fkb fkb, int i, Object obj) {
            if ((i & 1) != 0) {
                fkb = null;
            }
            return bVar.a(fkb);
        }

        private final boolean b() {
            C5651beb beb = this.a;
            C7706xtb xtb = null;
            if (!(beb instanceof C5061Kdb)) {
                beb = null;
            }
            C5061Kdb kdb = (C5061Kdb) beb;
            if (kdb != null) {
                xtb = kdb.da();
            }
            return xtb != null;
        }

        public final a a(C6457fkb fkb) {
            _Xa a2 = a();
            _Xa tjb = fkb != null ? new Tjb(fkb, a2) : null;
            boolean a3 = C5605aub.a(this.b, (_Xa<C6405eub, Boolean>) Ujb.a);
            C7706xtb xtb = this.b;
            if (tjb == null) {
                tjb = a2;
            }
            C7706xtb a4 = C6593hkb.a(xtb, tjb);
            if (a4 != null) {
                return new a(a4, true, a3);
            }
            return new a(this.b, false, a3);
        }

        private final List<C6321dkb> b(C7706xtb xtb) {
            ArrayList arrayList = new ArrayList(1);
            new Xjb(arrayList).a(xtb, this.e);
            return arrayList;
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x0048  */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x004b  */
        private final C6592hjb a(C7706xtb xtb) {
            HVa hVa;
            C6796kjb kjb;
            C6796kjb kjb2;
            if (C7430ttb.b(xtb)) {
                C7223qtb a2 = C7430ttb.a(xtb);
                hVa = new HVa(a2.Da(), a2.Ea());
            } else {
                hVa = new HVa(xtb, xtb);
            }
            C7706xtb xtb2 = (C7706xtb) hVa.a();
            C7706xtb xtb3 = (C7706xtb) hVa.b();
            C6721jcb jcb = C6721jcb.m;
            if (xtb2.Aa()) {
                kjb2 = C6796kjb.NULLABLE;
            } else if (!xtb3.Aa()) {
                kjb2 = C6796kjb.NOT_NULL;
            } else {
                kjb = null;
                C6660ijb ijb = !jcb.b(xtb2) ? C6660ijb.READ_ONLY : jcb.a(xtb3) ? C6660ijb.MUTABLE : null;
                C6592hjb hjb = new C6592hjb(kjb, ijb, xtb.Ba() instanceof C6728jjb, false, 8, null);
                return hjb;
            }
            kjb = kjb2;
            if (!jcb.b(xtb2)) {
            }
            C6592hjb hjb2 = new C6592hjb(kjb, ijb, xtb.Ba() instanceof C6728jjb, false, 8, null);
            return hjb2;
        }

        /* JADX WARNING: Removed duplicated region for block: B:13:0x0038  */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x0053  */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x0058  */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x0075  */
        /* JADX WARNING: Removed duplicated region for block: B:7:0x0021  */
        private final C6592hjb a(C7706xtb xtb, boolean z, C6592hjb hjb) {
            C6723jeb jeb;
            C6864ljb a2;
            if (z) {
                C5651beb beb = this.a;
                if (beb != null) {
                    jeb = C6859leb.a(beb.getAnnotations(), xtb.getAnnotations());
                    Vjb vjb = new Vjb(jeb);
                    Wjb wjb = Wjb.a;
                    C6796kjb kjb = null;
                    if (z) {
                        C5654bhb b2 = this.e.b();
                        hjb = b2 != null ? b2.a(this.f) : null;
                    }
                    a2 = a(jeb);
                    if (a2 == null) {
                        a2 = (hjb == null || hjb.c() == null) ? null : new C6864ljb(hjb.c(), hjb.e());
                    }
                    C6796kjb a3 = a2 == null ? a2.a() : null;
                    C6660ijb ijb = (C6660ijb) wjb.invoke(vjb.invoke(C6725jgb.j(), C6660ijb.READ_ONLY), vjb.invoke(C6725jgb.g(), C6660ijb.MUTABLE));
                    if (a2 != null) {
                        kjb = a2.a();
                    }
                    boolean z2 = false;
                    boolean z3 = kjb != C6796kjb.NOT_NULL && Fub.d(xtb);
                    if (a2 != null && a2.b()) {
                        z2 = true;
                    }
                    return new C6592hjb(a3, ijb, z3, z2);
                }
            }
            jeb = xtb.getAnnotations();
            Vjb vjb2 = new Vjb(jeb);
            Wjb wjb2 = Wjb.a;
            C6796kjb kjb2 = null;
            if (z) {
            }
            a2 = a(jeb);
            if (a2 == null) {
            }
            if (a2 == null) {
            }
            C6660ijb ijb2 = (C6660ijb) wjb2.invoke(vjb2.invoke(C6725jgb.j(), C6660ijb.READ_ONLY), vjb2.invoke(C6725jgb.g(), C6660ijb.MUTABLE));
            if (a2 != null) {
            }
            boolean z22 = false;
            if (kjb2 != C6796kjb.NOT_NULL) {
            }
            z22 = true;
            return new C6592hjb(a3, ijb2, z3, z22);
        }

        /* JADX WARNING: Incorrect type for immutable var: ssa=jeb, code=jeb<deb>, for r3v0, types: [jeb, jeb<deb>, java.lang.Iterable] */
        private final C6864ljb a(C6723jeb<C6315deb> jeb) {
            Rjb rjb = this.g;
            for (C6315deb a2 : jeb) {
                C6864ljb a3 = rjb.a(a2);
                if (a3 != null) {
                    return a3;
                }
            }
            return null;
        }

        /* JADX WARNING: Removed duplicated region for block: B:18:0x005d  */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x0062  */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x0064  */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x006e  */
        private final _Xa<Integer, C6592hjb> a() {
            boolean z;
            int i;
            int length;
            int i2;
            boolean z2;
            Collection<C7706xtb> collection = this.c;
            ArrayList<List> arrayList = new ArrayList<>(C6986nWa.a((Iterable) collection, 10));
            for (C7706xtb b2 : collection) {
                arrayList.add(b(b2));
            }
            List b3 = b(this.b);
            if (this.d) {
                Collection<C7706xtb> collection2 = this.c;
                if (!(collection2 instanceof Collection) || !collection2.isEmpty()) {
                    Iterator it = collection2.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        if (!C6745jub.a.a((C7706xtb) it.next(), this.b)) {
                            z2 = true;
                            break;
                        }
                    }
                    if (z2) {
                        z = true;
                        if (!z) {
                            i = 1;
                        } else {
                            i = b3.size();
                        }
                        C6592hjb[] hjbArr = new C6592hjb[i];
                        length = hjbArr.length;
                        i2 = 0;
                        while (i2 < length) {
                            boolean z3 = i2 == 0;
                            boolean z4 = z3 || !z;
                            if (!TVa.a || z4) {
                                C6321dkb dkb = (C6321dkb) b3.get(i2);
                                C7706xtb a2 = dkb.a();
                                C6592hjb b4 = dkb.b();
                                ArrayList arrayList2 = new ArrayList();
                                for (List d2 : arrayList) {
                                    C6321dkb dkb2 = (C6321dkb) C7676xWa.d(d2, i2);
                                    C7706xtb c2 = dkb2 != null ? dkb2.c() : null;
                                    if (c2 != null) {
                                        arrayList2.add(c2);
                                    }
                                }
                                hjbArr[i2] = a(a2, (Collection<? extends C7706xtb>) arrayList2, b4, z3);
                                i2++;
                            } else {
                                throw new AssertionError("Only head type constructors should be computed");
                            }
                        }
                        return new Sjb(hjbArr);
                    }
                }
                z2 = false;
                if (z2) {
                }
            }
            z = false;
            if (!z) {
            }
            C6592hjb[] hjbArr2 = new C6592hjb[i];
            length = hjbArr2.length;
            i2 = 0;
            while (i2 < length) {
            }
            return new Sjb(hjbArr2);
        }

        /* JADX WARNING: Removed duplicated region for block: B:63:0x0115  */
        /* JADX WARNING: Removed duplicated region for block: B:70:0x0128  */
        private final C6592hjb a(C7706xtb xtb, Collection<? extends C7706xtb> collection, C6592hjb hjb, boolean z) {
            boolean z2;
            boolean z3;
            ArrayList<C6592hjb> arrayList = new ArrayList<>(C6986nWa.a((Iterable) collection, 10));
            for (C7706xtb a2 : collection) {
                arrayList.add(a(a2));
            }
            ArrayList arrayList2 = new ArrayList();
            for (C6592hjb b2 : arrayList) {
                C6660ijb b3 = b2.b();
                if (b3 != null) {
                    arrayList2.add(b3);
                }
            }
            Set t = C7676xWa.t(arrayList2);
            ArrayList arrayList3 = new ArrayList();
            for (C6592hjb c2 : arrayList) {
                C6796kjb c3 = c2.c();
                if (c3 != null) {
                    arrayList3.add(c3);
                }
            }
            Set t2 = C7676xWa.t(arrayList3);
            ArrayList arrayList4 = new ArrayList();
            for (C7706xtb b4 : collection) {
                C6796kjb c4 = a(C6269cub.b(b4)).c();
                if (c4 != null) {
                    arrayList4.add(c4);
                }
            }
            Set t3 = C7676xWa.t(arrayList4);
            C6592hjb a3 = a(xtb, z, hjb);
            boolean z4 = true;
            C6796kjb kjb = null;
            C6592hjb hjb2 = a3.e() ^ true ? a3 : null;
            C6796kjb c5 = hjb2 != null ? hjb2.c() : null;
            C6796kjb c6 = a3.c();
            boolean z5 = this.d && z;
            C6796kjb a4 = C5657bkb.b(t2, c5, z5);
            if (a4 != null) {
                if (!(b() && z && a4 == C6796kjb.NULLABLE)) {
                    kjb = a4;
                }
            }
            C6660ijb ijb = (C6660ijb) C5657bkb.b(t, C6660ijb.MUTABLE, C6660ijb.READ_ONLY, a3.b(), z5);
            boolean z6 = c6 != c5 || (C7471uYa.a((Object) t3, (Object) t2) ^ true);
            if (!a3.d()) {
                if (!arrayList.isEmpty()) {
                    Iterator it = arrayList.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (((C6592hjb) it.next()).d()) {
                                z3 = true;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    if (!z3) {
                        z2 = false;
                        if (kjb != null && z6) {
                            return C5657bkb.b(C5657bkb.b(t3, c6, z5), ijb, true, z2);
                        }
                        if (kjb != null) {
                            z4 = false;
                        }
                        return C5657bkb.b(kjb, ijb, z4, z2);
                    }
                }
                z3 = false;
                if (!z3) {
                }
            }
            z2 = true;
            if (kjb != null) {
            }
            if (kjb != null) {
            }
            return C5657bkb.b(kjb, ijb, z4, z2);
        }
    }

    /* renamed from: Rjb$c */
    /* compiled from: signatureEnhancement.kt */
    private static final class c extends a {
        private final boolean d;

        public c(C7706xtb xtb, boolean z, boolean z2, boolean z3) {
            C7471uYa.b(xtb, C1325gg.TYPE);
            super(xtb, z2, z3);
            this.d = z;
        }

        public final boolean d() {
            return this.d;
        }
    }

    public Rjb(Ifb ifb, C7848zvb zvb) {
        C7471uYa.b(ifb, "annotationTypeQualifierResolver");
        C7471uYa.b(zvb, "jsr305State");
        this.a = ifb;
        this.b = zvb;
    }

    private final C6864ljb b(C6315deb deb) {
        C6864ljb ljb;
        C7349snb q = deb.q();
        C6864ljb ljb2 = null;
        if (q == null) {
            return null;
        }
        if (C6725jgb.i().contains(q)) {
            ljb = new C6864ljb(C6796kjb.NULLABLE, false, 2, null);
        } else if (C6725jgb.h().contains(q)) {
            ljb = new C6864ljb(C6796kjb.NOT_NULL, false, 2, null);
        } else {
            if (C7471uYa.a((Object) q, (Object) C6725jgb.f())) {
                ljb2 = c(deb);
            } else if (C7471uYa.a((Object) q, (Object) C6725jgb.d()) && this.b.b()) {
                ljb = new C6864ljb(C6796kjb.NULLABLE, false, 2, null);
            } else if (C7471uYa.a((Object) q, (Object) C6725jgb.c()) && this.b.b()) {
                ljb = new C6864ljb(C6796kjb.NOT_NULL, false, 2, null);
            } else if (C7471uYa.a((Object) q, (Object) C6725jgb.a())) {
                ljb2 = new C6864ljb(C6796kjb.NOT_NULL, true);
            } else if (C7471uYa.a((Object) q, (Object) C6725jgb.b())) {
                ljb2 = new C6864ljb(C6796kjb.NULLABLE, true);
            }
            ljb = ljb2;
        }
        return ljb;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0046, code lost:
        if (r5.equals("NEVER") != false) goto L_0x0051;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004f, code lost:
        if (r5.equals("MAYBE") != false) goto L_0x0051;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0051, code lost:
        r5 = new defpackage.C6864ljb(defpackage.C6796kjb.a, false, 2, null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0059, code lost:
        r5 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005a, code lost:
        return r5;
     */
    private final C6864ljb c(C6315deb deb) {
        C6864ljb ljb;
        Npb a2 = C7148pqb.a(deb);
        if (!(a2 instanceof Spb)) {
            a2 = null;
        }
        Spb spb = (Spb) a2;
        if (spb != null) {
            String a3 = spb.b().a();
            switch (a3.hashCode()) {
                case 73135176:
                    break;
                case 74175084:
                    break;
                case 433141802:
                    if (a3.equals("UNKNOWN")) {
                        ljb = new C6864ljb(C6796kjb.FORCE_FLEXIBILITY, false, 2, null);
                        break;
                    }
                case 1933739535:
                    if (a3.equals("ALWAYS")) {
                        ljb = new C6864ljb(C6796kjb.NOT_NULL, false, 2, null);
                        break;
                    }
            }
        } else {
            return new C6864ljb(C6796kjb.NOT_NULL, false, 2, null);
        }
    }

    public final C6864ljb a(C6315deb deb) {
        C7471uYa.b(deb, "annotationDescriptor");
        C6864ljb b2 = b(deb);
        if (b2 != null) {
            return b2;
        }
        C6315deb d = this.a.d(deb);
        C6864ljb ljb = null;
        if (d != null) {
            Dvb a2 = this.a.a(deb);
            if (a2.b()) {
                return null;
            }
            C6864ljb b3 = b(d);
            if (b3 != null) {
                ljb = C6864ljb.a(b3, null, a2.c(), 1, null);
            }
        }
        return ljb;
    }

    /* JADX WARNING: Removed duplicated region for block: B:106:0x01fa  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x0212  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x012f  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x015e  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0163  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x019f  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x01a1  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x01a6  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x01c0  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x01c5  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x01e0  */
    private final <D extends C4935Gcb> D a(D d, C6590hhb hhb) {
        D d2;
        a aVar;
        Rgb rgb;
        Pjb pjb;
        ArrayList<c> arrayList;
        C7408tdb tdb;
        defpackage.Ifb.a aVar2;
        boolean z;
        boolean z2;
        C6457fkb fkb;
        a a2;
        C7706xtb xtb;
        D d3 = d;
        if (!(d3 instanceof Ngb)) {
            return d3;
        }
        Ngb ngb = (Ngb) d3;
        if (ngb.g() == defpackage.C4935Gcb.a.FAKE_OVERRIDE) {
            C4935Gcb original = ngb.getOriginal();
            C7471uYa.a((Object) original, "original");
            if (original.j().size() == 1) {
                return d3;
            }
        }
        C6590hhb b2 = Zgb.b(hhb, d.getAnnotations());
        C6457fkb fkb2 = null;
        if (d3 instanceof Sgb) {
            Sgb sgb = (Sgb) d3;
            C7134pfb b3 = sgb.b();
            if (b3 != null && !b3.G()) {
                D b4 = sgb.b();
                if (b4 != null) {
                    C7471uYa.a((Object) b4, "getter!!");
                    d2 = b4;
                    if (ngb.l() == null) {
                        C5582adb adb = (C5582adb) (!(d2 instanceof C5582adb) ? null : d2);
                        aVar = b.a(a(d3, adb != null ? (C5061Kdb) adb.a(Rgb.D) : null, b2, Yjb.a), (C6457fkb) null, 1, (Object) null);
                    } else {
                        aVar = null;
                    }
                    rgb = (Rgb) (d3 instanceof Rgb ? null : d3);
                    boolean z3 = false;
                    if (rgb != null) {
                        Lkb lkb = Lkb.a;
                        C5272Rcb e = rgb.e();
                        if (e != null) {
                            String a3 = lkb.a((C5029Jcb) e, Hkb.a(rgb, false, false, 3, null));
                            if (a3 != null) {
                                pjb = (Pjb) Ojb.d().get(a3);
                                if (pjb != null) {
                                    boolean z4 = pjb.a().size() == ngb.f().size();
                                    if (TVa.a && !z4) {
                                        StringBuilder sb = new StringBuilder();
                                        sb.append("Predefined enhancement info for ");
                                        sb.append(d3);
                                        sb.append(" has ");
                                        sb.append(pjb.a().size());
                                        sb.append(", but ");
                                        sb.append(ngb.f().size());
                                        sb.append(" expected");
                                        throw new AssertionError(sb.toString());
                                    }
                                }
                                List<C5061Kdb> f = d2.f();
                                C7471uYa.a((Object) f, "annotationOwnerForMember.valueParameters");
                                arrayList = new ArrayList<>(C6986nWa.a((Iterable) f, 10));
                                for (C5061Kdb kdb : f) {
                                    b a4 = a(d3, kdb, b2, new _jb(kdb));
                                    if (pjb != null) {
                                        List a5 = pjb.a();
                                        if (a5 != null) {
                                            fkb = (C6457fkb) C7676xWa.d(a5, kdb.getIndex());
                                            a2 = a4.a(fkb);
                                            String str = "p";
                                            if (!a2.c()) {
                                                xtb = a2.b();
                                            } else {
                                                C7471uYa.a((Object) kdb, str);
                                                xtb = kdb.getType();
                                                C7471uYa.a((Object) xtb, "p.type");
                                            }
                                            C7471uYa.a((Object) kdb, str);
                                            boolean a6 = a(kdb, xtb);
                                            arrayList.add(new c(a2.b(), a6, !a2.c() || a6 != kdb.ea(), a2.a()));
                                            fkb2 = null;
                                        }
                                    }
                                    fkb = fkb2;
                                    a2 = a4.a(fkb);
                                    String str2 = "p";
                                    if (!a2.c()) {
                                    }
                                    C7471uYa.a((Object) kdb, str2);
                                    boolean a62 = a(kdb, xtb);
                                    arrayList.add(new c(a2.b(), a62, !a2.c() || a62 != kdb.ea(), a2.a()));
                                    fkb2 = null;
                                }
                                tdb = (C7408tdb) (!(d3 instanceof C7408tdb) ? null : d3);
                                if (tdb == null && C7274rhb.a(tdb)) {
                                    aVar2 = defpackage.Ifb.a.FIELD;
                                } else {
                                    aVar2 = defpackage.Ifb.a.METHOD_RETURN_TYPE;
                                }
                                a a7 = a(d, d2, true, b2, aVar2, Zjb.a).a(pjb != null ? pjb.b() : null);
                                if ((aVar == null || !aVar.a()) && !a7.a()) {
                                    if (!arrayList.isEmpty()) {
                                        Iterator it = arrayList.iterator();
                                        while (true) {
                                            if (it.hasNext()) {
                                                if (((c) it.next()).a()) {
                                                    z2 = true;
                                                    break;
                                                }
                                            } else {
                                                break;
                                            }
                                        }
                                    }
                                    z2 = false;
                                    if (!z2) {
                                        z = false;
                                        if ((aVar == null || !aVar.c()) && !a7.c()) {
                                            if (!arrayList.isEmpty()) {
                                                Iterator it2 = arrayList.iterator();
                                                while (true) {
                                                    if (it2.hasNext()) {
                                                        if (((c) it2.next()).c()) {
                                                            z3 = true;
                                                            break;
                                                        }
                                                    } else {
                                                        break;
                                                    }
                                                }
                                            }
                                            if (!z3 && !z) {
                                                return d3;
                                            }
                                        }
                                        HVa a8 = z ? NVa.a(C6669iqb.a(), new Tfb(d3)) : null;
                                        C7706xtb b5 = aVar != null ? aVar.b() : null;
                                        ArrayList arrayList2 = new ArrayList(C6986nWa.a((Iterable) arrayList, 10));
                                        for (c cVar : arrayList) {
                                            arrayList2.add(new Wgb(cVar.b(), cVar.d()));
                                        }
                                        D a9 = ngb.a(b5, arrayList2, a7.b(), a8);
                                        if (a9 != null) {
                                            return a9;
                                        }
                                        throw new OVa("null cannot be cast to non-null type D");
                                    }
                                }
                                z = true;
                                if (!arrayList.isEmpty()) {
                                }
                                return d3;
                            }
                        } else {
                            throw new OVa("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                        }
                    }
                    pjb = null;
                    if (pjb != null) {
                    }
                    List<C5061Kdb> f2 = d2.f();
                    C7471uYa.a((Object) f2, "annotationOwnerForMember.valueParameters");
                    arrayList = new ArrayList<>(C6986nWa.a((Iterable) f2, 10));
                    for (C5061Kdb kdb2 : f2) {
                    }
                    tdb = (C7408tdb) (!(d3 instanceof C7408tdb) ? null : d3);
                    if (tdb == null) {
                    }
                    aVar2 = defpackage.Ifb.a.METHOD_RETURN_TYPE;
                    a a72 = a(d, d2, true, b2, aVar2, Zjb.a).a(pjb != null ? pjb.b() : null);
                    if (!arrayList.isEmpty()) {
                    }
                    z2 = false;
                    if (!z2) {
                    }
                    z = true;
                    if (!arrayList.isEmpty()) {
                    }
                    return d3;
                }
                C7471uYa.a();
                throw null;
            }
        }
        d2 = d3;
        if (ngb.l() == null) {
        }
        rgb = (Rgb) (d3 instanceof Rgb ? null : d3);
        boolean z32 = false;
        if (rgb != null) {
        }
        pjb = null;
        if (pjb != null) {
        }
        List<C5061Kdb> f22 = d2.f();
        C7471uYa.a((Object) f22, "annotationOwnerForMember.valueParameters");
        arrayList = new ArrayList<>(C6986nWa.a((Iterable) f22, 10));
        for (C5061Kdb kdb22 : f22) {
        }
        tdb = (C7408tdb) (!(d3 instanceof C7408tdb) ? null : d3);
        if (tdb == null) {
        }
        aVar2 = defpackage.Ifb.a.METHOD_RETURN_TYPE;
        a a722 = a(d, d2, true, b2, aVar2, Zjb.a).a(pjb != null ? pjb.b() : null);
        if (!arrayList.isEmpty()) {
        }
        z2 = false;
        if (!z2) {
        }
        z = true;
        if (!arrayList.isEmpty()) {
        }
        return d3;
    }

    private final boolean a(C5061Kdb kdb, C7706xtb xtb) {
        boolean z;
        Mgb a2 = Vgb.a(kdb);
        if (a2 instanceof Ugb) {
            z = C7204qgb.a(xtb, ((Ugb) a2).a()) != null;
        } else if (C7471uYa.a((Object) a2, (Object) Tgb.a)) {
            z = C5605aub.a(xtb);
        } else if (a2 == null) {
            z = kdb.ea();
        } else {
            throw new FVa();
        }
        if (!z || !kdb.j().isEmpty()) {
            return false;
        }
        return true;
    }

    private final b a(C4935Gcb gcb, C5061Kdb kdb, C6590hhb hhb, _Xa<? super C4935Gcb, ? extends C7706xtb> _xa) {
        C6590hhb hhb2;
        if (kdb != null) {
            C6590hhb b2 = Zgb.b(hhb, kdb.getAnnotations());
            if (b2 != null) {
                hhb2 = b2;
                return a(gcb, kdb, false, hhb2, defpackage.Ifb.a.VALUE_PARAMETER, _xa);
            }
        }
        hhb2 = hhb;
        return a(gcb, kdb, false, hhb2, defpackage.Ifb.a.VALUE_PARAMETER, _xa);
    }

    private final b a(C4935Gcb gcb, C5651beb beb, boolean z, C6590hhb hhb, defpackage.Ifb.a aVar, _Xa<? super C4935Gcb, ? extends C7706xtb> _xa) {
        C7706xtb xtb = (C7706xtb) _xa.invoke(gcb);
        Collection<C4935Gcb> j = gcb.j();
        C7471uYa.a((Object) j, "this.overriddenDescriptors");
        ArrayList arrayList = new ArrayList(C6986nWa.a((Iterable) j, 10));
        for (C4935Gcb gcb2 : j) {
            C7471uYa.a((Object) gcb2, "it");
            arrayList.add((C7706xtb) _xa.invoke(gcb2));
        }
        b bVar = new b(this, beb, xtb, arrayList, z, Zgb.b(hhb, ((C7706xtb) _xa.invoke(gcb)).getAnnotations()), aVar);
        return bVar;
    }

    public final <D extends C4935Gcb> Collection<D> a(C6590hhb hhb, Collection<? extends D> collection) {
        C7471uYa.b(hhb, "c");
        C7471uYa.b(collection, "platformSignatures");
        ArrayList arrayList = new ArrayList(C6986nWa.a((Iterable) collection, 10));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(a((D) (C4935Gcb) it.next(), hhb));
        }
        return arrayList;
    }
}
