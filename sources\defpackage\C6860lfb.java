package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* renamed from: lfb reason: default package and case insensitive filesystem */
/* compiled from: MutableClassDescriptor */
public class C6860lfb extends Meb {
    private final C5060Kcb h;
    private final boolean i;
    private C6314ddb j;
    private C5583aeb k;
    private Ptb l;
    private List<C4905Fdb> m;
    private final Collection<C7706xtb> n;
    private final Ssb o;

    public C6860lfb(C5272Rcb rcb, C5060Kcb kcb, boolean z, boolean z2, C7694xnb xnb, C7822zdb zdb, Ssb ssb) {
        if (rcb == null) {
            c(0);
            throw null;
        } else if (kcb == null) {
            c(1);
            throw null;
        } else if (xnb == null) {
            c(2);
            throw null;
        } else if (zdb == null) {
            c(3);
            throw null;
        } else if (ssb != null) {
            super(ssb, rcb, xnb, zdb, z2);
            this.n = new ArrayList();
            this.o = ssb;
            this.h = kcb;
            this.i = z;
        } else {
            c(4);
            throw null;
        }
    }

    private static /* synthetic */ void c(int i2) {
        String str;
        int i3;
        Throwable th;
        switch (i2) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
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
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
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
        String str2 = "kotlin/reflect/jvm/internal/impl/descriptors/impl/MutableClassDescriptor";
        switch (i2) {
            case 1:
                objArr[0] = "kind";
                break;
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = "source";
                break;
            case 4:
                objArr[0] = "storageManager";
                break;
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 16:
            case 17:
            case 18:
                objArr[0] = str2;
                break;
            case 6:
                objArr[0] = "modality";
                break;
            case 9:
                objArr[0] = "visibility";
                break;
            case 12:
                objArr[0] = "supertype";
                break;
            case 14:
                objArr[0] = "typeParameters";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i2) {
            case 5:
                objArr[1] = "getAnnotations";
                break;
            case 7:
                objArr[1] = "getModality";
                break;
            case 8:
                objArr[1] = "getKind";
                break;
            case 10:
                objArr[1] = "getVisibility";
                break;
            case 11:
                objArr[1] = "getTypeConstructor";
                break;
            case 13:
                objArr[1] = "getConstructors";
                break;
            case 15:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 16:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 17:
                objArr[1] = "getStaticScope";
                break;
            case 18:
                objArr[1] = "getSealedSubclasses";
                break;
            default:
                objArr[1] = str2;
                break;
        }
        switch (i2) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 16:
            case 17:
            case 18:
                break;
            case 6:
                objArr[2] = "setModality";
                break;
            case 9:
                objArr[2] = "setVisibility";
                break;
            case 12:
                objArr[2] = "addSupertype";
                break;
            case 14:
                objArr[2] = "setTypeParameterDescriptors";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i2) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
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
        List<C4905Fdb> list = this.m;
        if (list != null) {
            return list;
        }
        c(15);
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
        return this.i;
    }

    public C4997Icb F() {
        return null;
    }

    public Eqb J() {
        b bVar = b.a;
        if (bVar != null) {
            return bVar;
        }
        c(16);
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
        c(17);
        throw null;
    }

    public C5029Jcb M() {
        return null;
    }

    public boolean N() {
        return false;
    }

    public Ptb Q() {
        Ptb ptb = this.l;
        if (ptb != null) {
            return ptb;
        }
        c(11);
        throw null;
    }

    public void a(C6314ddb ddb) {
        if (ddb != null) {
            this.j = ddb;
        } else {
            c(6);
            throw null;
        }
    }

    public C5583aeb d() {
        C5583aeb aeb = this.k;
        if (aeb != null) {
            return aeb;
        }
        c(10);
        throw null;
    }

    public C5060Kcb g() {
        C5060Kcb kcb = this.h;
        if (kcb != null) {
            return kcb;
        }
        c(8);
        throw null;
    }

    public C6723jeb getAnnotations() {
        C6723jeb a = C6723jeb.c.a();
        if (a != null) {
            return a;
        }
        c(5);
        throw null;
    }

    public C6314ddb h() {
        C6314ddb ddb = this.j;
        if (ddb != null) {
            return ddb;
        }
        c(7);
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
        return Peb.a(this);
    }

    public Set<C4997Icb> i() {
        Set<C4997Icb> emptySet = Collections.emptySet();
        if (emptySet != null) {
            return emptySet;
        }
        c(13);
        throw null;
    }

    public void a(C5583aeb aeb) {
        if (aeb != null) {
            this.k = aeb;
        } else {
            c(9);
            throw null;
        }
    }

    public void a(List<C4905Fdb> list) {
        if (list == null) {
            c(14);
            throw null;
        } else if (this.m == null) {
            this.m = new ArrayList(list);
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Type parameters are already set for ");
            sb.append(getName());
            throw new IllegalStateException(sb.toString());
        }
    }

    public void a() {
        this.l = new C6335dtb(this, this.m, this.n, this.o);
        for (Leb a : i()) {
            a.a((C7706xtb) z());
        }
    }
}
