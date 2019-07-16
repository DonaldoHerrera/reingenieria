package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: ikb reason: default package and case insensitive filesystem */
/* compiled from: AbstractBinaryClassAnnotationAndConstantLoader.kt */
public abstract class C6661ikb<A, C> implements Zqb<A, C> {
    private static final Set<C7280rnb> a;
    @Deprecated
    public static final a b = new a(null);
    private final Msb<Dkb, c<A, C>> c;
    private final Bkb d;

    /* renamed from: ikb$a */
    /* compiled from: AbstractBinaryClassAnnotationAndConstantLoader.kt */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }
    }

    /* renamed from: ikb$b */
    /* compiled from: AbstractBinaryClassAnnotationAndConstantLoader.kt */
    private enum b {
        PROPERTY,
        BACKING_FIELD,
        DELEGATE_FIELD
    }

    /* renamed from: ikb$c */
    /* compiled from: AbstractBinaryClassAnnotationAndConstantLoader.kt */
    private static final class c<A, C> {
        private final Map<Gkb, List<A>> a;
        private final Map<Gkb, C> b;

        public c(Map<Gkb, ? extends List<? extends A>> map, Map<Gkb, ? extends C> map2) {
            C7471uYa.b(map, "memberAnnotations");
            C7471uYa.b(map2, "propertyConstants");
            this.a = map;
            this.b = map2;
        }

        public final Map<Gkb, List<A>> a() {
            return this.a;
        }

        public final Map<Gkb, C> b() {
            return this.b;
        }
    }

    static {
        List<C7349snb> b2 = C6918mWa.b((T[]) new C7349snb[]{C6657igb.a, C6657igb.d, C6657igb.e, new C7349snb("java.lang.annotation.Target"), new C7349snb("java.lang.annotation.Retention"), new C7349snb("java.lang.annotation.Documented")});
        ArrayList arrayList = new ArrayList(C6986nWa.a((Iterable<? extends T>) b2, 10));
        for (C7349snb a2 : b2) {
            arrayList.add(C7280rnb.a(a2));
        }
        a = C7676xWa.t(arrayList);
    }

    public C6661ikb(Ssb ssb, Bkb bkb) {
        C7471uYa.b(ssb, "storageManager");
        C7471uYa.b(bkb, "kotlinClassFinder");
        this.d = bkb;
        this.c = ssb.b((_Xa<? super K, ? extends V>) new C6933mkb<Object,Object>(this));
    }

    /* access modifiers changed from: private */
    public final defpackage.Dkb.a b(C7280rnb rnb, C7822zdb zdb, List<A> list) {
        if (a.contains(rnb)) {
            return null;
        }
        return a(rnb, zdb, list);
    }

    /* access modifiers changed from: protected */
    public abstract defpackage.Dkb.a a(C7280rnb rnb, C7822zdb zdb, List<A> list);

    /* access modifiers changed from: protected */
    public abstract A a(C5590alb alb, Emb emb);

    /* access modifiers changed from: protected */
    public abstract C a(C c2);

    /* access modifiers changed from: protected */
    public abstract C a(String str, Object obj);

    /* access modifiers changed from: protected */
    public byte[] a(Dkb dkb) {
        C7471uYa.b(dkb, "kotlinClass");
        return null;
    }

    private final Dkb b(defpackage.Frb.a aVar) {
        C7822zdb c2 = aVar.c();
        if (!(c2 instanceof Fkb)) {
            c2 = null;
        }
        Fkb fkb = (Fkb) c2;
        if (fkb != null) {
            return fkb.c();
        }
        return null;
    }

    public List<A> a(defpackage.Frb.a aVar) {
        C7471uYa.b(aVar, "container");
        Dkb b2 = b(aVar);
        if (b2 != null) {
            ArrayList arrayList = new ArrayList(1);
            b2.a((defpackage.Dkb.c) new C6865lkb(this, arrayList), a(b2));
            return arrayList;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Class for loading annotations is not found: ");
        sb.append(aVar.a());
        throw new IllegalStateException(sb.toString().toString());
    }

    public List<A> b(Frb frb, Olb olb) {
        C7471uYa.b(frb, "container");
        C7471uYa.b(olb, "proto");
        return a(frb, olb, b.DELEGATE_FIELD);
    }

    public List<A> b(Frb frb, Wnb wnb, Yqb yqb) {
        C7471uYa.b(frb, "container");
        C7471uYa.b(wnb, "proto");
        C7471uYa.b(yqb, "kind");
        Gkb a2 = a(this, wnb, frb.b(), frb.d(), yqb, false, 16, null);
        if (a2 == null) {
            return C6918mWa.a();
        }
        return a(this, frb, Gkb.a.a(a2, 0), false, false, (Boolean) null, false, 60, (Object) null);
    }

    /* access modifiers changed from: private */
    public final c<A, C> b(Dkb dkb) {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        dkb.a((d) new C6797kkb(this, hashMap, hashMap2), a(dkb));
        return new c<>(hashMap, hashMap2);
    }

    public List<A> a(Frb frb, Wnb wnb, Yqb yqb) {
        C7471uYa.b(frb, "container");
        C7471uYa.b(wnb, "proto");
        C7471uYa.b(yqb, "kind");
        if (yqb == Yqb.PROPERTY) {
            return a(frb, (Olb) wnb, b.PROPERTY);
        }
        Gkb a2 = a(this, wnb, frb.b(), frb.d(), yqb, false, 16, null);
        if (a2 != null) {
            return a(this, frb, a2, false, false, (Boolean) null, false, 60, (Object) null);
        }
        return C6918mWa.a();
    }

    public List<A> a(Frb frb, Olb olb) {
        C7471uYa.b(frb, "container");
        C7471uYa.b(olb, "proto");
        return a(frb, olb, b.BACKING_FIELD);
    }

    private final List<A> a(Frb frb, Olb olb, b bVar) {
        b bVar2 = bVar;
        Boolean a2 = Dmb.w.a(olb.m());
        C7471uYa.a((Object) a2, "Flags.IS_CONST.get(proto.flags)");
        boolean booleanValue = a2.booleanValue();
        boolean a3 = C6936mnb.a(olb);
        if (bVar2 == b.PROPERTY) {
            Gkb a4 = a(this, olb, frb.b(), frb.d(), false, true, false, 40, (Object) null);
            if (a4 == null) {
                return C6918mWa.a();
            }
            return a(this, frb, a4, true, false, Boolean.valueOf(booleanValue), a3, 8, (Object) null);
        }
        Gkb a5 = a(this, olb, frb.b(), frb.d(), true, false, false, 48, (Object) null);
        if (a5 == null) {
            return C6918mWa.a();
        }
        boolean z = false;
        boolean a6 = Hxb.a((CharSequence) a5.a(), (CharSequence) "$delegate", false, 2, (Object) null);
        if (bVar2 == b.DELEGATE_FIELD) {
            z = true;
        }
        if (a6 != z) {
            return C6918mWa.a();
        }
        return a(frb, a5, true, true, Boolean.valueOf(booleanValue), a3);
    }

    public List<A> a(Frb frb, C7485ulb ulb) {
        C7471uYa.b(frb, "container");
        C7471uYa.b(ulb, "proto");
        defpackage.Gkb.a aVar = Gkb.a;
        String string = frb.b().getString(ulb.m());
        String b2 = ((defpackage.Frb.a) frb).e().b();
        C7471uYa.a((Object) b2, "(container as ProtoConta…Class).classId.asString()");
        return a(this, frb, aVar.a(string, C6460fnb.a(b2)), false, false, (Boolean) null, false, 60, (Object) null);
    }

    static /* synthetic */ List a(C6661ikb ikb, Frb frb, Gkb gkb, boolean z, boolean z2, Boolean bool, boolean z3, int i, Object obj) {
        if (obj == null) {
            return ikb.a(frb, gkb, (i & 4) != 0 ? false : z, (i & 8) != 0 ? false : z2, (i & 16) != 0 ? null : bool, (i & 32) != 0 ? false : z3);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: findClassAndLoadMemberAnnotations");
    }

    private final List<A> a(Frb frb, Gkb gkb, boolean z, boolean z2, Boolean bool, boolean z3) {
        Dkb a2 = a(frb, a(frb, z, z2, bool, z3));
        if (a2 == null) {
            return C6918mWa.a();
        }
        List<A> list = (List) ((c) this.c.invoke(a2)).a().get(gkb);
        if (list == null) {
            list = C6918mWa.a();
        }
        return list;
    }

    public List<A> a(Frb frb, Wnb wnb, Yqb yqb, int i, C7003nmb nmb) {
        C7471uYa.b(frb, "container");
        C7471uYa.b(wnb, "callableProto");
        C7471uYa.b(yqb, "kind");
        C7471uYa.b(nmb, "proto");
        Gkb a2 = a(this, wnb, frb.b(), frb.d(), yqb, false, 16, null);
        if (a2 == null) {
            return C6918mWa.a();
        }
        return a(this, frb, Gkb.a.a(a2, i + a(frb, wnb)), false, false, (Boolean) null, false, 60, (Object) null);
    }

    private final int a(Frb frb, Wnb wnb) {
        if (wnb instanceof Blb) {
            if (Imb.a((Blb) wnb)) {
                return 1;
            }
        } else if (wnb instanceof Olb) {
            if (Imb.a((Olb) wnb)) {
                return 1;
            }
        } else if (!(wnb instanceof C6730jlb)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Unsupported message: ");
            sb.append(wnb.getClass());
            throw new UnsupportedOperationException(sb.toString());
        } else if (frb != null) {
            defpackage.Frb.a aVar = (defpackage.Frb.a) frb;
            if (aVar.g() == defpackage.C6458flb.b.ENUM_CLASS) {
                return 2;
            }
            if (aVar.i()) {
                return 1;
            }
        } else {
            throw new OVa("null cannot be cast to non-null type org.jetbrains.kotlin.serialization.deserialization.ProtoContainer.Class");
        }
        return 0;
    }

    public List<A> a(_lb _lb, Emb emb) {
        C7471uYa.b(_lb, "proto");
        C7471uYa.b(emb, "nameResolver");
        Object a2 = _lb.a(Xmb.f);
        C7471uYa.a(a2, "proto.getExtension(JvmProtoBuf.typeAnnotation)");
        Iterable<C5590alb> iterable = (Iterable) a2;
        ArrayList arrayList = new ArrayList(C6986nWa.a(iterable, 10));
        for (C5590alb alb : iterable) {
            C7471uYa.a((Object) alb, "it");
            arrayList.add(a(alb, emb));
        }
        return arrayList;
    }

    public List<A> a(C6527gmb gmb, Emb emb) {
        C7471uYa.b(gmb, "proto");
        C7471uYa.b(emb, "nameResolver");
        Object a2 = gmb.a(Xmb.h);
        C7471uYa.a(a2, "proto.getExtension(JvmPr….typeParameterAnnotation)");
        Iterable<C5590alb> iterable = (Iterable) a2;
        ArrayList arrayList = new ArrayList(C6986nWa.a(iterable, 10));
        for (C5590alb alb : iterable) {
            C7471uYa.a((Object) alb, "it");
            arrayList.add(a(alb, emb));
        }
        return arrayList;
    }

    public C a(Frb frb, Olb olb, C7706xtb xtb) {
        C7471uYa.b(frb, "container");
        C7471uYa.b(olb, "proto");
        C7471uYa.b(xtb, "expectedType");
        Dkb a2 = a(frb, a(frb, true, true, Dmb.w.a(olb.m()), C6936mnb.a(olb)));
        if (a2 != null) {
            Olb olb2 = olb;
            Gkb a3 = a((Wnb) olb2, frb.b(), frb.d(), Yqb.PROPERTY, a2.a().d().a(C7346skb.f.a()));
            if (a3 != null) {
                C c2 = ((c) this.c.invoke(a2)).b().get(a3);
                if (c2 != null) {
                    if (C5505Zbb.e.a(xtb)) {
                        c2 = a(c2);
                    }
                    return c2;
                }
            }
        }
        return null;
    }

    private final Dkb a(Frb frb, Dkb dkb) {
        if (dkb != null) {
            return dkb;
        }
        if (frb instanceof defpackage.Frb.a) {
            return b((defpackage.Frb.a) frb);
        }
        return null;
    }

    private final Dkb a(Frb frb, boolean z, boolean z2, Boolean bool, boolean z3) {
        if (z) {
            if (bool != null) {
                if (frb instanceof defpackage.Frb.a) {
                    defpackage.Frb.a aVar = (defpackage.Frb.a) frb;
                    if (aVar.g() == defpackage.C6458flb.b.INTERFACE) {
                        Bkb bkb = this.d;
                        C7280rnb a2 = aVar.e().a(C7694xnb.b("DefaultImpls"));
                        C7471uYa.a((Object) a2, "container.classId.create…EFAULT_IMPLS_CLASS_NAME))");
                        return Ckb.a(bkb, a2);
                    }
                }
                if (bool.booleanValue() && (frb instanceof defpackage.Frb.b)) {
                    C7822zdb c2 = frb.c();
                    if (!(c2 instanceof C7691xkb)) {
                        c2 = null;
                    }
                    C7691xkb xkb = (C7691xkb) c2;
                    C7355sqb e = xkb != null ? xkb.e() : null;
                    if (e != null) {
                        Bkb bkb2 = this.d;
                        String b2 = e.b();
                        C7471uYa.a((Object) b2, "facadeClassName.internalName");
                        C7280rnb a3 = C7280rnb.a(new C7349snb(Cxb.a(b2, '/', '.', false, 4, (Object) null)));
                        C7471uYa.a((Object) a3, "ClassId.topLevel(FqName(…lName.replace('/', '.')))");
                        return Ckb.a(bkb2, a3);
                    }
                }
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("isConst should not be null for property (container=");
                sb.append(frb);
                sb.append(')');
                throw new IllegalStateException(sb.toString().toString());
            }
        }
        if (z2 && (frb instanceof defpackage.Frb.a)) {
            defpackage.Frb.a aVar2 = (defpackage.Frb.a) frb;
            if (aVar2.g() == defpackage.C6458flb.b.COMPANION_OBJECT) {
                defpackage.Frb.a h = aVar2.h();
                if (h != null && (h.g() == defpackage.C6458flb.b.CLASS || h.g() == defpackage.C6458flb.b.ENUM_CLASS || (z3 && (h.g() == defpackage.C6458flb.b.INTERFACE || h.g() == defpackage.C6458flb.b.ANNOTATION_CLASS)))) {
                    return b(h);
                }
            }
        }
        if (!(frb instanceof defpackage.Frb.b) || !(frb.c() instanceof C7691xkb)) {
            return null;
        }
        C7822zdb c3 = frb.c();
        if (c3 != null) {
            C7691xkb xkb2 = (C7691xkb) c3;
            Dkb f = xkb2.f();
            if (f == null) {
                f = Ckb.a(this.d, xkb2.c());
            }
            return f;
        }
        throw new OVa("null cannot be cast to non-null type org.jetbrains.kotlin.load.kotlin.JvmPackagePartSource");
    }

    static /* synthetic */ Gkb a(C6661ikb ikb, Olb olb, Emb emb, Jmb jmb, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if (obj == null) {
            return ikb.a(olb, emb, jmb, (i & 8) != 0 ? false : z, (i & 16) != 0 ? false : z2, (i & 32) != 0 ? true : z3);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getPropertySignature");
    }

    private final Gkb a(Olb olb, Emb emb, Jmb jmb, boolean z, boolean z2, boolean z3) {
        f<Olb, e> fVar = Xmb.d;
        C7471uYa.a((Object) fVar, "propertySignature");
        e eVar = (e) Hmb.a(olb, fVar);
        if (eVar != null) {
            if (z) {
                defpackage.C6664inb.a a2 = C6936mnb.b.a(olb, emb, jmb, z3);
                if (a2 != null) {
                    return Gkb.a.a(a2);
                }
                return null;
            } else if (z2 && eVar.q()) {
                defpackage.Gkb.a aVar = Gkb.a;
                defpackage.Xmb.c m = eVar.m();
                C7471uYa.a((Object) m, "signature.syntheticMethod");
                return aVar.a(emb, m);
            }
        }
        return null;
    }

    static /* synthetic */ Gkb a(C6661ikb ikb, Wnb wnb, Emb emb, Jmb jmb, Yqb yqb, boolean z, int i, Object obj) {
        if (obj == null) {
            return ikb.a(wnb, emb, jmb, yqb, (i & 16) != 0 ? false : z);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getCallableSignature");
    }

    private final Gkb a(Wnb wnb, Emb emb, Jmb jmb, Yqb yqb, boolean z) {
        Gkb gkb = null;
        if (wnb instanceof C6730jlb) {
            defpackage.Gkb.a aVar = Gkb.a;
            defpackage.C6664inb.b a2 = C6936mnb.b.a((C6730jlb) wnb, emb, jmb);
            if (a2 == null) {
                return null;
            }
            gkb = aVar.a(a2);
        } else if (wnb instanceof Blb) {
            defpackage.Gkb.a aVar2 = Gkb.a;
            defpackage.C6664inb.b a3 = C6936mnb.b.a((Blb) wnb, emb, jmb);
            if (a3 == null) {
                return null;
            }
            gkb = aVar2.a(a3);
        } else if (wnb instanceof Olb) {
            defpackage.Mnb.c cVar = (defpackage.Mnb.c) wnb;
            f<Olb, e> fVar = Xmb.d;
            C7471uYa.a((Object) fVar, "propertySignature");
            e eVar = (e) Hmb.a(cVar, fVar);
            if (eVar != null) {
                int i = C6729jkb.a[yqb.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            gkb = a((Olb) wnb, emb, jmb, true, true, z);
                        }
                    } else if (eVar.p()) {
                        defpackage.Gkb.a aVar3 = Gkb.a;
                        defpackage.Xmb.c l = eVar.l();
                        C7471uYa.a((Object) l, "signature.setter");
                        gkb = aVar3.a(emb, l);
                    }
                } else if (eVar.o()) {
                    defpackage.Gkb.a aVar4 = Gkb.a;
                    defpackage.Xmb.c k = eVar.k();
                    C7471uYa.a((Object) k, "signature.getter");
                    gkb = aVar4.a(emb, k);
                }
            }
        }
        return gkb;
    }
}
