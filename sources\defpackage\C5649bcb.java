package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: bcb reason: default package and case insensitive filesystem */
/* compiled from: FunctionClassDescriptor.kt */
public final class C5649bcb extends Beb {
    /* access modifiers changed from: private */
    public static final C7280rnb e = new C7280rnb(C5301Sbb.b, C7694xnb.b("Function"));
    /* access modifiers changed from: private */
    public static final C7280rnb f = new C7280rnb(C5418Wbb.a(), C7694xnb.b("KFunction"));
    public static final a g = new a(null);
    private final b h = new b();
    private final C6449fcb i = new C6449fcb(this.k, this);
    /* access modifiers changed from: private */
    public final List<C4905Fdb> j;
    /* access modifiers changed from: private */
    public final Ssb k;
    /* access modifiers changed from: private */
    public final C6790kdb l;
    private final c m;
    private final int n;

    /* renamed from: bcb$a */
    /* compiled from: FunctionClassDescriptor.kt */
    public static final class a {
        private a() {
        }

        public final C7280rnb a() {
            return C5649bcb.e;
        }

        public final C7280rnb b() {
            return C5649bcb.f;
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }
    }

    /* renamed from: bcb$b */
    /* compiled from: FunctionClassDescriptor.kt */
    private final class b extends Usb {
        public b() {
            super(C5649bcb.this.k);
        }

        public boolean d() {
            return true;
        }

        /* access modifiers changed from: protected */
        public Collection<C7706xtb> e() {
            ArrayList arrayList = new ArrayList(2);
            C6313dcb dcb = new C6313dcb(this, arrayList);
            int i = C5717ccb.a[C5649bcb.this.f().ordinal()];
            if (i == 1) {
                dcb.a(C5649bcb.g.a());
            } else if (i == 2) {
                dcb.a(C5649bcb.g.b());
            } else if (i == 3) {
                dcb.a(C5649bcb.g.a());
            } else if (i == 4) {
                dcb.a(C5649bcb.g.b());
            }
            int i2 = C5717ccb.b[C5649bcb.this.f().ordinal()];
            if (i2 == 1) {
                dcb.a(new C7280rnb(C5301Sbb.b, c.a.a(C5649bcb.this.c())));
            } else if (i2 == 2) {
                dcb.a(new C7280rnb(C6531gpb.c, c.b.a(C5649bcb.this.c())));
            }
            return C7676xWa.q(arrayList);
        }

        /* access modifiers changed from: protected */
        public C4843Ddb g() {
            return defpackage.C4843Ddb.a.a;
        }

        public List<C4905Fdb> getParameters() {
            return C5649bcb.this.j;
        }

        public String toString() {
            return c().toString();
        }

        public C5649bcb c() {
            return C5649bcb.this;
        }
    }

    /* renamed from: bcb$c */
    /* compiled from: FunctionClassDescriptor.kt */
    public enum c {
        a(r2, r3),
        b(r2, r3),
        c(C5418Wbb.a(), r3),
        d(C5418Wbb.a(), r3);
        
        public static final a f = null;
        private final C7349snb g;
        private final String h;

        /* renamed from: bcb$c$a */
        /* compiled from: FunctionClassDescriptor.kt */
        public static final class a {
            private a() {
            }

            public final c a(C7349snb snb, String str) {
                c[] values;
                C7471uYa.b(snb, "packageFqName");
                C7471uYa.b(str, "className");
                for (c cVar : c.values()) {
                    if (C7471uYa.a((Object) cVar.b(), (Object) snb) && Cxb.b(str, cVar.a(), false, 2, null)) {
                        return cVar;
                    }
                }
                return null;
            }

            public /* synthetic */ a(C7264rYa rya) {
                this();
            }
        }

        static {
            f = new a(null);
        }

        private c(C7349snb snb, String str) {
            this.g = snb;
            this.h = str;
        }

        public final String a() {
            return this.h;
        }

        public final C7349snb b() {
            return this.g;
        }

        public final C7694xnb a(int i) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.h);
            sb.append(i);
            C7694xnb b2 = C7694xnb.b(sb.toString());
            C7471uYa.a((Object) b2, "Name.identifier(\"$classNamePrefix$arity\")");
            return b2;
        }
    }

    public C5649bcb(Ssb ssb, C6790kdb kdb, c cVar, int i2) {
        C7471uYa.b(ssb, "storageManager");
        C7471uYa.b(kdb, "containingDeclaration");
        C7471uYa.b(cVar, "functionKind");
        super(ssb, cVar.a(i2));
        this.k = ssb;
        this.l = kdb;
        this.m = cVar;
        this.n = i2;
        ArrayList arrayList = new ArrayList();
        C5581acb acb = new C5581acb(this, arrayList);
        C6785kZa kza = new C6785kZa(1, this.n);
        ArrayList arrayList2 = new ArrayList(C6986nWa.a((Iterable<? extends T>) kza, 10));
        Iterator it = kza.iterator();
        while (it.hasNext()) {
            int nextInt = ((FWa) it).nextInt();
            C6473fub fub = C6473fub.IN_VARIANCE;
            StringBuilder sb = new StringBuilder();
            sb.append('P');
            sb.append(nextInt);
            acb.a(fub, sb.toString());
            arrayList2.add(RVa.a);
        }
        acb.a(C6473fub.OUT_VARIANCE, "R");
        this.j = C7676xWa.q(arrayList);
    }

    public List<C4905Fdb> B() {
        return this.j;
    }

    public boolean D() {
        return false;
    }

    public Void F() {
        return null;
    }

    public boolean K() {
        return false;
    }

    public Void M() {
        return null;
    }

    public boolean N() {
        return false;
    }

    public Ptb Q() {
        return this.h;
    }

    public C5583aeb d() {
        C5583aeb aeb = _db.e;
        C7471uYa.a((Object) aeb, "Visibilities.PUBLIC");
        return aeb;
    }

    public final c f() {
        return this.m;
    }

    public C5060Kcb g() {
        return C5060Kcb.INTERFACE;
    }

    public C6723jeb getAnnotations() {
        return C6723jeb.c.a();
    }

    public C7822zdb getSource() {
        C7822zdb zdb = C7822zdb.a;
        C7471uYa.a((Object) zdb, "SourceElement.NO_SOURCE");
        return zdb;
    }

    public C6314ddb h() {
        return C6314ddb.ABSTRACT;
    }

    public boolean isInline() {
        return false;
    }

    public boolean m() {
        return false;
    }

    public boolean n() {
        return false;
    }

    public boolean p() {
        return false;
    }

    public String toString() {
        String a2 = getName().a();
        C7471uYa.a((Object) a2, "name.asString()");
        return a2;
    }

    public List<C5029Jcb> C() {
        return C6918mWa.a();
    }

    public C6449fcb J() {
        return this.i;
    }

    public defpackage.Eqb.b L() {
        return defpackage.Eqb.b.a;
    }

    public final int c() {
        return this.n;
    }

    public C6790kdb e() {
        return this.l;
    }

    public List<C4997Icb> i() {
        return C6918mWa.a();
    }
}
