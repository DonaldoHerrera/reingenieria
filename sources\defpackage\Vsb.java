package defpackage;

import java.util.Collection;
import java.util.List;

/* renamed from: Vsb reason: default package */
/* compiled from: AbstractTypeConstructor.kt */
public abstract class Vsb implements Ptb {
    private final Psb<a> a;

    /* renamed from: Vsb$a */
    /* compiled from: AbstractTypeConstructor.kt */
    private static final class a {
        private List<? extends C7706xtb> a = C6850lWa.a(C7154ptb.c);
        private final Collection<C7706xtb> b;

        public a(Collection<? extends C7706xtb> collection) {
            C7471uYa.b(collection, "allSupertypes");
            this.b = collection;
        }

        public final Collection<C7706xtb> a() {
            return this.b;
        }

        public final List<C7706xtb> b() {
            return this.a;
        }

        public final void a(List<? extends C7706xtb> list) {
            C7471uYa.b(list, "<set-?>");
            this.a = list;
        }
    }

    public Vsb(Ssb ssb) {
        C7471uYa.b(ssb, "storageManager");
        this.a = ssb.a(new Wsb(this), Xsb.a, new C5671btb(this));
    }

    /* access modifiers changed from: protected */
    public void a(C7706xtb xtb) {
        C7471uYa.b(xtb, C1325gg.TYPE);
    }

    /* access modifiers changed from: protected */
    public void b(C7706xtb xtb) {
        C7471uYa.b(xtb, C1325gg.TYPE);
    }

    /* access modifiers changed from: protected */
    public abstract Collection<C7706xtb> e();

    /* access modifiers changed from: protected */
    public C7706xtb f() {
        return null;
    }

    /* access modifiers changed from: protected */
    public abstract C4843Ddb g();

    /* access modifiers changed from: private */
    public final Collection<C7706xtb> a(Ptb ptb, boolean z) {
        Vsb vsb = (Vsb) (!(ptb instanceof Vsb) ? null : ptb);
        if (vsb != null) {
            List c = C7676xWa.c(((a) vsb.a.d()).a(), (Iterable) vsb.a(z));
            if (c != null) {
                return c;
            }
        }
        Collection<C7706xtb> b = ptb.b();
        C7471uYa.a((Object) b, "supertypes");
        return b;
    }

    public List<C7706xtb> b() {
        return ((a) this.a.d()).b();
    }

    /* access modifiers changed from: protected */
    public Collection<C7706xtb> a(boolean z) {
        return C6918mWa.a();
    }
}
