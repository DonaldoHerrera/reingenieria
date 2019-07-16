package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: Geb reason: default package */
/* compiled from: AbstractTypeAliasDescriptor.kt */
public abstract class Geb extends Qeb implements C4874Edb {
    private List<? extends C4905Fdb> e;
    private final Feb f = new Feb(this);
    private final C5583aeb g;

    public Geb(C5272Rcb rcb, C6723jeb jeb, C7694xnb xnb, C7822zdb zdb, C5583aeb aeb) {
        C7471uYa.b(rcb, "containingDeclaration");
        C7471uYa.b(jeb, "annotations");
        C7471uYa.b(xnb, "name");
        C7471uYa.b(zdb, "sourceElement");
        C7471uYa.b(aeb, "visibilityImpl");
        super(rcb, jeb, xnb, zdb);
        this.g = aeb;
    }

    public List<C4905Fdb> B() {
        List<? extends C4905Fdb> list = this.e;
        if (list != null) {
            return list;
        }
        C7471uYa.b("declaredTypeParametersImpl");
        throw null;
    }

    public boolean D() {
        return C5605aub.a((C7706xtb) ga(), (_Xa<C6405eub, Boolean>) new Eeb<C6405eub,Boolean>(this));
    }

    public Ptb Q() {
        return this.f;
    }

    public final void a(List<? extends C4905Fdb> list) {
        C7471uYa.b(list, "declaredTypeParameters");
        this.e = list;
    }

    public C5583aeb d() {
        return this.g;
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

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000a, code lost:
        if (r0 != null) goto L_0x000f;
     */
    public final Etb ta() {
        Eqb eqb;
        C5029Jcb A = A();
        if (A != null) {
            eqb = A.J();
        }
        eqb = b.a;
        Etb a = C5605aub.a((C5122Mcb) this, eqb);
        C7471uYa.a((Object) a, "TypeUtils.makeUnsubstitu…ope ?: MemberScope.Empty)");
        return a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("typealias ");
        sb.append(getName().a());
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    public abstract Ssb ua();

    public final Collection<C7479ufb> va() {
        C5029Jcb A = A();
        if (A == null) {
            return C6918mWa.a();
        }
        Collection<C4997Icb> i = A.i();
        C7471uYa.a((Object) i, "classDescriptor.constructors");
        ArrayList arrayList = new ArrayList();
        for (C4997Icb icb : i) {
            a aVar = C7548vfb.E;
            Ssb ua = ua();
            C7471uYa.a((Object) icb, "it");
            C7479ufb a = aVar.a(ua, this, icb);
            if (a != null) {
                arrayList.add(a);
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: protected */
    public abstract List<C4905Fdb> wa();

    public <R, D> R a(C5332Tcb<R, D> tcb, D d) {
        C7471uYa.b(tcb, "visitor");
        return tcb.a((C4874Edb) this, d);
    }

    public C4874Edb getOriginal() {
        C5361Ucb original = super.getOriginal();
        if (original != null) {
            return (C4874Edb) original;
        }
        throw new OVa("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.TypeAliasDescriptor");
    }
}
