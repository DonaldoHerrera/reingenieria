package defpackage;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* renamed from: qfb reason: default package and case insensitive filesystem */
/* compiled from: PropertySetterDescriptorImpl */
public class C7203qfb extends C6996nfb implements C7546vdb {
    private C5061Kdb m;
    private final C7546vdb n;

    /* JADX WARNING: type inference failed for: r0v3, types: [vdb] */
    /* JADX WARNING: type inference failed for: r0v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    public C7203qfb(C7408tdb tdb, C6723jeb jeb, C6314ddb ddb, C5583aeb aeb, boolean z, boolean z2, boolean z3, a aVar, C7546vdb vdb, C7822zdb zdb) {
        C7203qfb qfb;
        C7203qfb qfb2;
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
            sb.append("<set-");
            sb.append(tdb.getName());
            sb.append(">");
            super(ddb, aeb, tdb, jeb, C7694xnb.d(sb.toString()), z, z2, z3, aVar, zdb);
            if (vdb != 0) {
                qfb = this;
                qfb2 = vdb;
            } else {
                qfb2 = this;
                qfb = qfb2;
            }
            qfb.n = qfb2;
        } else {
            e(5);
            throw null;
        }
    }

    private static /* synthetic */ void e(int i) {
        String str;
        int i2;
        Throwable th;
        switch (i) {
            case 10:
            case 11:
            case 12:
            case 13:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 10:
            case 11:
            case 12:
            case 13:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        String str2 = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertySetterDescriptorImpl";
        switch (i) {
            case 1:
            case 9:
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
                objArr[0] = "parameter";
                break;
            case 7:
                objArr[0] = "setterDescriptor";
                break;
            case 8:
                objArr[0] = C1325gg.TYPE;
                break;
            case 10:
            case 11:
            case 12:
            case 13:
                objArr[0] = str2;
                break;
            default:
                objArr[0] = "correspondingProperty";
                break;
        }
        switch (i) {
            case 10:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 11:
                objArr[1] = "getValueParameters";
                break;
            case 12:
                objArr[1] = "getReturnType";
                break;
            case 13:
                objArr[1] = "getOriginal";
                break;
            default:
                objArr[1] = str2;
                break;
        }
        switch (i) {
            case 6:
                objArr[2] = "initialize";
                break;
            case 7:
            case 8:
            case 9:
                objArr[2] = "createSetterParameter";
                break;
            case 10:
            case 11:
            case 12:
            case 13:
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i) {
            case 10:
            case 11:
            case 12:
            case 13:
                th = new IllegalStateException(format);
                break;
            default:
                th = new IllegalArgumentException(format);
                break;
        }
        throw th;
    }

    public void a(C5061Kdb kdb) {
        if (kdb != null) {
            this.m = kdb;
        } else {
            e(6);
            throw null;
        }
    }

    public List<C5061Kdb> f() {
        C5061Kdb kdb = this.m;
        if (kdb != null) {
            List<C5061Kdb> singletonList = Collections.singletonList(kdb);
            if (singletonList != null) {
                return singletonList;
            }
            e(11);
            throw null;
        }
        throw new IllegalStateException();
    }

    public Collection<? extends C7546vdb> j() {
        Collection<? extends C7546vdb> a = super.a(false);
        if (a != null) {
            return a;
        }
        e(10);
        throw null;
    }

    public static C7755yfb a(C7546vdb vdb, C7706xtb xtb, C6723jeb jeb) {
        if (vdb == null) {
            e(7);
            throw null;
        } else if (xtb == null) {
            e(8);
            throw null;
        } else if (jeb != null) {
            C7755yfb yfb = new C7755yfb(vdb, null, 0, jeb, C7694xnb.d("<set-?>"), xtb, false, false, false, null, C7822zdb.a);
            return yfb;
        } else {
            e(9);
            throw null;
        }
    }

    public C7706xtb a() {
        Etb E = C7148pqb.b((C5272Rcb) this).E();
        if (E != null) {
            return E;
        }
        e(12);
        throw null;
    }

    public <R, D> R a(C5332Tcb<R, D> tcb, D d) {
        return tcb.a((C7546vdb) this, d);
    }

    public C7546vdb getOriginal() {
        C7546vdb vdb = this.n;
        if (vdb != null) {
            return vdb;
        }
        e(13);
        throw null;
    }
}
