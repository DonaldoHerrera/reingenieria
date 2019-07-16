package defpackage;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* renamed from: pfb reason: default package and case insensitive filesystem */
/* compiled from: PropertyGetterDescriptorImpl */
public class C7134pfb extends C6996nfb implements C7477udb {
    private C7706xtb m;
    private final C7477udb n;

    /* JADX WARNING: type inference failed for: r0v3, types: [udb] */
    /* JADX WARNING: type inference failed for: r0v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    public C7134pfb(C7408tdb tdb, C6723jeb jeb, C6314ddb ddb, C5583aeb aeb, boolean z, boolean z2, boolean z3, a aVar, C7477udb udb, C7822zdb zdb) {
        C7134pfb pfb;
        C7134pfb pfb2;
        if (tdb == null) {
            e(0);
            throw null;
        } else if (jeb == null) {
            e(1);
            throw null;
        } else if (ddb == null) {
            e(2);
            throw null;
        } else if (aeb == null) {
            e(3);
            throw null;
        } else if (aVar == null) {
            e(4);
            throw null;
        } else if (zdb != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("<get-");
            sb.append(tdb.getName());
            sb.append(">");
            super(ddb, aeb, tdb, jeb, C7694xnb.d(sb.toString()), z, z2, z3, aVar, zdb);
            if (udb != 0) {
                pfb = this;
                pfb2 = udb;
            } else {
                pfb2 = this;
                pfb = pfb2;
            }
            pfb.n = pfb2;
        } else {
            e(5);
            throw null;
        }
    }

    private static /* synthetic */ void e(int i) {
        String str = (i == 6 || i == 7 || i == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i == 6 || i == 7 || i == 8) ? 2 : 3)];
        String str2 = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyGetterDescriptorImpl";
        switch (i) {
            case 1:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = "modality";
                break;
            case 3:
                objArr[0] = "visibility";
                break;
            case 4:
                objArr[0] = "kind";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
            case 7:
            case 8:
                objArr[0] = str2;
                break;
            default:
                objArr[0] = "correspondingProperty";
                break;
        }
        if (i == 6) {
            objArr[1] = "getOverriddenDescriptors";
        } else if (i == 7) {
            objArr[1] = "getValueParameters";
        } else if (i != 8) {
            objArr[1] = str2;
        } else {
            objArr[1] = "getOriginal";
        }
        if (!(i == 6 || i == 7 || i == 8)) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        throw ((i == 6 || i == 7 || i == 8) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    public void a(C7706xtb xtb) {
        if (xtb == null) {
            xtb = I().getType();
        }
        this.m = xtb;
    }

    public List<C5061Kdb> f() {
        List<C5061Kdb> emptyList = Collections.emptyList();
        if (emptyList != null) {
            return emptyList;
        }
        e(7);
        throw null;
    }

    public Collection<? extends C7477udb> j() {
        Collection<? extends C7477udb> a = super.a(true);
        if (a != null) {
            return a;
        }
        e(6);
        throw null;
    }

    public C7706xtb a() {
        return this.m;
    }

    public <R, D> R a(C5332Tcb<R, D> tcb, D d) {
        return tcb.a((C7477udb) this, d);
    }

    public C7477udb getOriginal() {
        C7477udb udb = this.n;
        if (udb != null) {
            return udb;
        }
        e(8);
        throw null;
    }
}
