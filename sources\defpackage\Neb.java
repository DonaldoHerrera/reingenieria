package defpackage;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* renamed from: Neb reason: default package */
/* compiled from: ClassDescriptorImpl */
public class Neb extends Meb {
    private final C6314ddb h;
    private final C5060Kcb i;
    private final Ptb j;
    private Eqb k;
    private Set<C4997Icb> l;
    private C4997Icb m;

    public Neb(C5272Rcb rcb, C7694xnb xnb, C6314ddb ddb, C5060Kcb kcb, Collection<C7706xtb> collection, C7822zdb zdb, boolean z, Ssb ssb) {
        if (rcb == null) {
            c(0);
            throw null;
        } else if (xnb == null) {
            c(1);
            throw null;
        } else if (ddb == null) {
            c(2);
            throw null;
        } else if (kcb == null) {
            c(3);
            throw null;
        } else if (collection == null) {
            c(4);
            throw null;
        } else if (zdb == null) {
            c(5);
            throw null;
        } else if (ssb != null) {
            super(ssb, rcb, xnb, zdb, z);
            this.h = ddb;
            this.i = kcb;
            this.j = new C6335dtb(this, Collections.emptyList(), collection, ssb);
        } else {
            c(6);
            throw null;
        }
    }

    private static /* synthetic */ void c(int i2) {
        String str;
        int i3;
        Throwable th;
        switch (i2) {
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i2) {
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                i3 = 2;
                break;
            default:
                i3 = 3;
                break;
        }
        Object[] objArr = new Object[i3];
        String str2 = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorImpl";
        switch (i2) {
            case 1:
                objArr[0] = "name";
                break;
            case 2:
                objArr[0] = "modality";
                break;
            case 3:
                objArr[0] = "kind";
                break;
            case 4:
                objArr[0] = "supertypes";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
                objArr[0] = "storageManager";
                break;
            case 7:
                objArr[0] = "unsubstitutedMemberScope";
                break;
            case 8:
                objArr[0] = "constructors";
                break;
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                objArr[0] = str2;
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i2) {
            case 9:
                objArr[1] = "getAnnotations";
                break;
            case 10:
                objArr[1] = "getTypeConstructor";
                break;
            case 11:
                objArr[1] = "getConstructors";
                break;
            case 12:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 13:
                objArr[1] = "getStaticScope";
                break;
            case 14:
                objArr[1] = "getKind";
                break;
            case 15:
                objArr[1] = "getModality";
                break;
            case 16:
                objArr[1] = "getVisibility";
                break;
            case 17:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 18:
                objArr[1] = "getSealedSubclasses";
                break;
            default:
                objArr[1] = str2;
                break;
        }
        switch (i2) {
            case 7:
            case 8:
                objArr[2] = "initialize";
                break;
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i2) {
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                th = new IllegalStateException(format);
                break;
            default:
                th = new IllegalArgumentException(format);
                break;
        }
        throw th;
    }

    public List<C4905Fdb> B() {
        List<C4905Fdb> emptyList = Collections.emptyList();
        if (emptyList != null) {
            return emptyList;
        }
        c(17);
        throw null;
    }

    public Collection<C5029Jcb> C() {
        List emptyList = Collections.emptyList();
        if (emptyList != null) {
            return emptyList;
        }
        c(18);
        throw null;
    }

    public boolean D() {
        return false;
    }

    public C4997Icb F() {
        return this.m;
    }

    public Eqb J() {
        Eqb eqb = this.k;
        if (eqb != null) {
            return eqb;
        }
        c(12);
        throw null;
    }

    public boolean K() {
        return false;
    }

    public Eqb L() {
        b bVar = b.a;
        if (bVar != null) {
            return bVar;
        }
        c(13);
        throw null;
    }

    public C5029Jcb M() {
        return null;
    }

    public boolean N() {
        return false;
    }

    public Ptb Q() {
        Ptb ptb = this.j;
        if (ptb != null) {
            return ptb;
        }
        c(10);
        throw null;
    }

    public final void a(Eqb eqb, Set<C4997Icb> set, C4997Icb icb) {
        if (eqb == null) {
            c(7);
            throw null;
        } else if (set != null) {
            this.k = eqb;
            this.l = set;
            this.m = icb;
        } else {
            c(8);
            throw null;
        }
    }

    public C5583aeb d() {
        C5583aeb aeb = _db.e;
        if (aeb != null) {
            return aeb;
        }
        c(16);
        throw null;
    }

    public C5060Kcb g() {
        C5060Kcb kcb = this.i;
        if (kcb != null) {
            return kcb;
        }
        c(14);
        throw null;
    }

    public C6723jeb getAnnotations() {
        C6723jeb a = C6723jeb.c.a();
        if (a != null) {
            return a;
        }
        c(9);
        throw null;
    }

    public C6314ddb h() {
        C6314ddb ddb = this.h;
        if (ddb != null) {
            return ddb;
        }
        c(15);
        throw null;
    }

    public Collection<C4997Icb> i() {
        Set<C4997Icb> set = this.l;
        if (set != null) {
            return set;
        }
        c(11);
        throw null;
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
        sb.append("class ");
        sb.append(getName());
        return sb.toString();
    }
}
