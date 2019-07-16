package defpackage;

import java.util.Set;

/* renamed from: skb reason: default package and case insensitive filesystem */
/* compiled from: DeserializedDescriptorResolver.kt */
public final class C7346skb {
    private static final Set<defpackage.Rkb.a> a = RWa.a(defpackage.Rkb.a.CLASS);
    private static final Set<defpackage.Rkb.a> b = SWa.c(defpackage.Rkb.a.FILE_FACADE, defpackage.Rkb.a.MULTIFILE_CLASS_PART);
    private static final C6732jnb c = new C6732jnb(1, 1, 2);
    private static final C6732jnb d = new C6732jnb(1, 1, 11);
    /* access modifiers changed from: private */
    public static final C6732jnb e = new C6732jnb(1, 1, 13);
    public static final a f = new a(null);
    public C6739jrb g;

    /* renamed from: skb$a */
    /* compiled from: DeserializedDescriptorResolver.kt */
    public static final class a {
        private a() {
        }

        public final C6732jnb a() {
            return C7346skb.e;
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }
    }

    /* access modifiers changed from: private */
    public final boolean c() {
        C6739jrb jrb = this.g;
        if (jrb != null) {
            return jrb.e().c();
        }
        C7471uYa.b("components");
        throw null;
    }

    private final boolean d(Dkb dkb) {
        C6739jrb jrb = this.g;
        if (jrb != null) {
            return !jrb.e().c() && dkb.a().h() && C7471uYa.a((Object) dkb.a().d(), (Object) d);
        }
        C7471uYa.b("components");
        throw null;
    }

    private final boolean e(Dkb dkb) {
        C6739jrb jrb = this.g;
        if (jrb != null) {
            return (jrb.e().d() && (dkb.a().h() || C7471uYa.a((Object) dkb.a().d(), (Object) c))) || d(dkb);
        }
        C7471uYa.b("components");
        throw null;
    }

    public final C6739jrb b() {
        C6739jrb jrb = this.g;
        if (jrb != null) {
            return jrb;
        }
        C7471uYa.b("components");
        throw null;
    }

    private final C7495urb<C6732jnb> c(Dkb dkb) {
        if (c() || dkb.a().d().d()) {
            return null;
        }
        return new C7495urb<>(dkb.a().d(), C6732jnb.g, dkb.getLocation(), dkb.D());
    }

    public final C5029Jcb b(Dkb dkb) {
        C7471uYa.b(dkb, "kotlinClass");
        C6331drb a2 = a(dkb);
        if (a2 == null) {
            return null;
        }
        C6739jrb jrb = this.g;
        if (jrb != null) {
            return jrb.d().a(dkb.D(), a2);
        }
        C7471uYa.b("components");
        throw null;
    }

    public final void a(C7277rkb rkb) {
        C7471uYa.b(rkb, "components");
        this.g = rkb.a();
    }

    public final C6331drb a(Dkb dkb) {
        HVa hVa;
        C7471uYa.b(dkb, "kotlinClass");
        String[] a2 = a(dkb, a);
        if (a2 != null) {
            String[] g2 = dkb.a().g();
            if (g2 != null) {
                try {
                    hVa = C6936mnb.a(a2, g2);
                } catch (Onb e2) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Could not read data from ");
                    sb.append(dkb.getLocation());
                    throw new IllegalStateException(sb.toString(), e2);
                } catch (Throwable th) {
                    if (c() || dkb.a().d().d()) {
                        throw th;
                    }
                    hVa = null;
                }
                if (hVa == null) {
                    return null;
                }
                return new C6331drb((C6800knb) hVa.a(), (C6458flb) hVa.b(), dkb.a().d(), new Fkb(dkb, c(dkb), e(dkb)));
            }
        }
        return null;
    }

    public final Eqb a(C6790kdb kdb, Dkb dkb) {
        HVa hVa;
        C7471uYa.b(kdb, "descriptor");
        C7471uYa.b(dkb, "kotlinClass");
        String[] a2 = a(dkb, b);
        if (a2 != null) {
            String[] g2 = dkb.a().g();
            if (g2 != null) {
                try {
                    hVa = C6936mnb.c(a2, g2);
                } catch (Onb e2) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Could not read data from ");
                    sb.append(dkb.getLocation());
                    throw new IllegalStateException(sb.toString(), e2);
                } catch (Throwable th) {
                    if (c() || dkb.a().d().d()) {
                        throw th;
                    }
                    hVa = null;
                }
                if (hVa == null) {
                    return null;
                }
                C6800knb knb = (C6800knb) hVa.a();
                Ilb ilb = (Ilb) hVa.b();
                C7691xkb xkb = new C7691xkb(dkb, ilb, knb, c(dkb), e(dkb));
                C6732jnb d2 = dkb.a().d();
                C6739jrb jrb = this.g;
                if (jrb != null) {
                    C7773ysb ysb = new C7773ysb(kdb, ilb, knb, d2, xkb, jrb, C7415tkb.a);
                    return ysb;
                }
                C7471uYa.b("components");
                throw null;
            }
        }
        return null;
    }

    public final String[] a(Dkb dkb, Set<? extends defpackage.Rkb.a> set) {
        C7471uYa.b(dkb, "kotlinClass");
        C7471uYa.b(set, "expectedKinds");
        Rkb a2 = dkb.a();
        String[] a3 = a2.a();
        if (a3 == null) {
            a3 = a2.b();
        }
        if (a3 == null || !set.contains(a2.c())) {
            return null;
        }
        return a3;
    }
}
