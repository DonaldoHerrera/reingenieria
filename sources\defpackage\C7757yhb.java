package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: yhb reason: default package and case insensitive filesystem */
/* compiled from: LazyJavaClassDescriptor.kt */
public final class C7757yhb extends Meb implements Pgb {
    private static final Set<String> h = SWa.c("equals", "hashCode", "getClass", "wait", "notify", "notifyAll", "toString");
    public static final a i = new a(null);
    /* access modifiers changed from: private */
    public final C6590hhb j;
    private final C5060Kcb k;
    private final C6314ddb l;
    private final C5583aeb m;
    private final boolean n;
    private final b o;
    private final Mhb p;
    private final Bqb q;
    private final C6727jib r;
    private final C6723jeb s;
    private final Psb<List<C4905Fdb>> t;
    private final C6590hhb u;
    private final Kib v;
    /* access modifiers changed from: private */
    public final C5029Jcb w;

    /* renamed from: yhb$a */
    /* compiled from: LazyJavaClassDescriptor.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }
    }

    /* renamed from: yhb$b */
    /* compiled from: LazyJavaClassDescriptor.kt */
    private final class b extends Usb {
        private final Psb<List<C4905Fdb>> c;

        public b() {
            super(C7757yhb.this.j.e());
            this.c = C7757yhb.this.j.e().a((PXa<? extends T>) new C7826zhb<Object>(this));
        }

        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0019, code lost:
            if ((!r0.b() && r0.b(defpackage.C5301Sbb.a)) != false) goto L_0x001d;
         */
        private final C7706xtb h() {
            C7349snb snb;
            ArrayList arrayList;
            C7349snb i = i();
            if (i != null) {
            }
            i = null;
            if (i != null) {
                snb = i;
            } else {
                snb = Yfb.b.a(C7148pqb.c(C7757yhb.this));
            }
            if (snb != null) {
                C5029Jcb a = C7148pqb.a(C7757yhb.this.j.d(), snb, (Dfb) Ffb.FROM_JAVA_LOADER);
                if (a != null) {
                    Ptb Q = a.Q();
                    C7471uYa.a((Object) Q, "classDescriptor.typeConstructor");
                    int size = Q.getParameters().size();
                    List<C4905Fdb> parameters = C7757yhb.this.Q().getParameters();
                    C7471uYa.a((Object) parameters, "getTypeConstructor().parameters");
                    int size2 = parameters.size();
                    if (size2 == size) {
                        arrayList = new ArrayList(C6986nWa.a((Iterable<? extends T>) parameters, 10));
                        for (C4905Fdb fdb : parameters) {
                            C6473fub fub = C6473fub.INVARIANT;
                            C7471uYa.a((Object) fdb, "parameter");
                            arrayList.add(new Utb(fub, fdb.z()));
                        }
                    } else if (size2 == 1 && size > 1 && i == null) {
                        C6473fub fub2 = C6473fub.INVARIANT;
                        Object j = C7676xWa.j(parameters);
                        C7471uYa.a(j, "typeParameters.single()");
                        Utb utb = new Utb(fub2, ((C4905Fdb) j).z());
                        C6785kZa kza = new C6785kZa(1, size);
                        ArrayList arrayList2 = new ArrayList(C6986nWa.a((Iterable<? extends T>) kza, 10));
                        Iterator it = kza.iterator();
                        while (it.hasNext()) {
                            ((FWa) it).nextInt();
                            arrayList2.add(utb);
                        }
                        arrayList = arrayList2;
                    }
                    return C7775ytb.a(C6723jeb.c.a(), a, arrayList);
                }
            }
            return null;
        }

        private final C7349snb i() {
            C6723jeb annotations = C7757yhb.this.getAnnotations();
            C7349snb snb = C6657igb.j;
            C7471uYa.a((Object) snb, "JvmAnnotationNames.PURELY_IMPLEMENTS_ANNOTATION");
            C6315deb a = annotations.a(snb);
            C7349snb snb2 = null;
            if (a != null) {
                Object n = C7676xWa.n(a.a().values());
                if (!(n instanceof C5665bqb)) {
                    n = null;
                }
                C5665bqb bqb = (C5665bqb) n;
                if (bqb != null) {
                    String str = (String) bqb.a();
                    if (str != null) {
                        if (!C7625wnb.a(str)) {
                            return null;
                        }
                        snb2 = new C7349snb(str);
                    }
                }
            }
            return snb2;
        }

        public boolean d() {
            return true;
        }

        /* access modifiers changed from: protected */
        public Collection<C7706xtb> e() {
            Object obj;
            Collection b = C7757yhb.this.a().b();
            ArrayList arrayList = new ArrayList(b.size());
            ArrayList<Zib> arrayList2 = new ArrayList<>(0);
            C7706xtb h = h();
            Iterator it = b.iterator();
            while (true) {
                obj = null;
                if (!it.hasNext()) {
                    break;
                }
                Nib nib = (Nib) it.next();
                C7706xtb a = C7757yhb.this.j.g().a((Zib) nib, C7482uib.a(Lgb.SUPERTYPE, false, (C4905Fdb) null, 3, (Object) null));
                if (a.za().c() instanceof defpackage.C6586hdb.b) {
                    arrayList2.add(nib);
                }
                Ptb za = a.za();
                if (h != null) {
                    obj = h.za();
                }
                if (!C7471uYa.a((Object) za, obj) && !C5301Sbb.c(a)) {
                    arrayList.add(a);
                }
            }
            C5029Jcb a2 = C7757yhb.this.w;
            if (a2 != null) {
                obj = C4873Ecb.a(a2, C7757yhb.this).c().b((C7706xtb) a2.z(), C6473fub.INVARIANT);
            }
            C7089ovb.a(arrayList, obj);
            C7089ovb.a(arrayList, h);
            if (!arrayList2.isEmpty()) {
                C7357srb c2 = C7757yhb.this.j.a().c();
                C5029Jcb c3 = c();
                ArrayList arrayList3 = new ArrayList(C6986nWa.a((Iterable<? extends T>) arrayList2, 10));
                for (Zib zib : arrayList2) {
                    if (zib != null) {
                        arrayList3.add(((Nib) zib).A());
                    } else {
                        throw new OVa("null cannot be cast to non-null type org.jetbrains.kotlin.load.java.structure.JavaClassifierType");
                    }
                }
                c2.a(c3, arrayList3);
            }
            return arrayList.isEmpty() ^ true ? C7676xWa.q(arrayList) : C6850lWa.a(C7757yhb.this.j.d().E().e());
        }

        /* access modifiers changed from: protected */
        public C4843Ddb g() {
            return C7757yhb.this.j.a().s();
        }

        public List<C4905Fdb> getParameters() {
            return (List) this.c.d();
        }

        public String toString() {
            String a = C7757yhb.this.getName().a();
            C7471uYa.a((Object) a, "name.asString()");
            return a;
        }

        public C5029Jcb c() {
            return C7757yhb.this;
        }
    }

    public /* synthetic */ C7757yhb(C6590hhb hhb, C5272Rcb rcb, Kib kib, C5029Jcb jcb, int i2, C7264rYa rya) {
        if ((i2 & 8) != 0) {
            jcb = null;
        }
        this(hhb, rcb, kib, jcb);
    }

    public List<C4905Fdb> B() {
        return (List) this.t.d();
    }

    public Collection<C5029Jcb> C() {
        return C6918mWa.a();
    }

    public boolean D() {
        return this.n;
    }

    public C4997Icb F() {
        return null;
    }

    public Eqb H() {
        return this.q;
    }

    public boolean K() {
        return false;
    }

    public Eqb L() {
        return this.r;
    }

    public C5029Jcb M() {
        return null;
    }

    public boolean N() {
        return false;
    }

    public Ptb Q() {
        return this.o;
    }

    public C5583aeb d() {
        C5583aeb aeb = (!C7471uYa.a((Object) this.m, (Object) _db.a) || this.v.l() != null) ? this.m : C6521ggb.a;
        C7471uYa.a((Object) aeb, "if (visibility == Visibi…ISIBILITY else visibility");
        return aeb;
    }

    public C5060Kcb g() {
        return this.k;
    }

    public C6723jeb getAnnotations() {
        return this.s;
    }

    public C6314ddb h() {
        return this.l;
    }

    public boolean isInline() {
        return false;
    }

    public boolean m() {
        return false;
    }

    public boolean p() {
        return false;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Lazy Java class ");
        sb.append(C7148pqb.d(this));
        return sb.toString();
    }

    public C7757yhb(C6590hhb hhb, C5272Rcb rcb, Kib kib, C5029Jcb jcb) {
        C5060Kcb kcb;
        C6314ddb ddb;
        C7471uYa.b(hhb, "outerContext");
        C7471uYa.b(rcb, "containingDeclaration");
        C7471uYa.b(kib, "jClass");
        super(hhb.e(), rcb, kib.getName(), hhb.a().q().a(kib), false);
        this.u = hhb;
        this.v = kib;
        this.w = jcb;
        this.j = Zgb.a(this.u, (C5091Lcb) this, (C5588ajb) this.v, 0, 4, (Object) null);
        this.j.a().g().a(this.v, (C5029Jcb) this);
        boolean z = true;
        boolean z2 = this.v.u() == null;
        if (!TVa.a || z2) {
            if (this.v.m()) {
                kcb = C5060Kcb.ANNOTATION_CLASS;
            } else if (this.v.t()) {
                kcb = C5060Kcb.INTERFACE;
            } else if (this.v.o()) {
                kcb = C5060Kcb.ENUM_CLASS;
            } else {
                kcb = C5060Kcb.CLASS;
            }
            this.k = kcb;
            if (this.v.m()) {
                ddb = C6314ddb.FINAL;
            } else {
                ddb = C6314ddb.f.a(this.v.g() || this.v.t(), !this.v.h());
            }
            this.l = ddb;
            this.m = this.v.d();
            if (this.v.l() == null || this.v.k()) {
                z = false;
            }
            this.n = z;
            this.o = new b();
            this.p = new Mhb(this.j, this, this.v);
            this.q = new Bqb(J());
            this.r = new C6727jib(this.j, this.v, this);
            this.s = C6386ehb.a(this.j, this.v);
            this.t = this.j.e().a((PXa<? extends T>) new Ahb<Object>(this));
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Creating LazyJavaClassDescriptor for light class ");
        sb.append(this.v);
        throw new AssertionError(sb.toString());
    }

    public Mhb J() {
        return this.p;
    }

    public final Kib a() {
        return this.v;
    }

    public List<C4997Icb> i() {
        return (List) this.p.h().d();
    }

    public final C7757yhb a(Dgb dgb, C5029Jcb jcb) {
        C7471uYa.b(dgb, "javaResolverCache");
        C6590hhb hhb = this.j;
        C6590hhb a2 = Zgb.a(hhb, hhb.a().a(dgb));
        C5272Rcb e = e();
        C7471uYa.a((Object) e, "containingDeclaration");
        return new C7757yhb(a2, e, this.v, jcb);
    }
}
