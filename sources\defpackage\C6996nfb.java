package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* renamed from: nfb reason: default package and case insensitive filesystem */
/* compiled from: PropertyAccessorDescriptorImpl */
public abstract class C6996nfb extends Qeb implements C7339sdb {
    private boolean e;
    private final boolean f;
    private final C6314ddb g;
    private final C7408tdb h;
    private final boolean i;
    private final a j;
    private C5583aeb k;
    private C5582adb l;

    public C6996nfb(C6314ddb ddb, C5583aeb aeb, C7408tdb tdb, C6723jeb jeb, C7694xnb xnb, boolean z, boolean z2, boolean z3, a aVar, C7822zdb zdb) {
        if (ddb == null) {
            d(0);
            throw null;
        } else if (aeb == null) {
            d(1);
            throw null;
        } else if (tdb == null) {
            d(2);
            throw null;
        } else if (jeb == null) {
            d(3);
            throw null;
        } else if (xnb == null) {
            d(4);
            throw null;
        } else if (zdb != null) {
            super(tdb.e(), jeb, xnb, zdb);
            this.l = null;
            this.g = ddb;
            this.k = aeb;
            this.h = tdb;
            this.e = z;
            this.f = z2;
            this.i = z3;
            this.j = aVar;
        } else {
            d(5);
            throw null;
        }
    }

    private static /* synthetic */ void d(int i2) {
        String str;
        int i3;
        Throwable th;
        switch (i2) {
            case 6:
            case 8:
            case 9:
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
        switch (i2) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
                i3 = 2;
                break;
            default:
                i3 = 3;
                break;
        }
        Object[] objArr = new Object[i3];
        String str2 = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyAccessorDescriptorImpl";
        switch (i2) {
            case 1:
                objArr[0] = "visibility";
                break;
            case 2:
                objArr[0] = "correspondingProperty";
                break;
            case 3:
                objArr[0] = "annotations";
                break;
            case 4:
                objArr[0] = "name";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
                objArr[0] = str2;
                break;
            case 7:
                objArr[0] = "substitutor";
                break;
            case 14:
                objArr[0] = "overriddenDescriptors";
                break;
            default:
                objArr[0] = "modality";
                break;
        }
        switch (i2) {
            case 6:
                objArr[1] = "getKind";
                break;
            case 8:
                objArr[1] = "getTypeParameters";
                break;
            case 9:
                objArr[1] = "getModality";
                break;
            case 10:
                objArr[1] = "getVisibility";
                break;
            case 11:
                objArr[1] = "getCorrespondingVariable";
                break;
            case 12:
                objArr[1] = "getCorrespondingProperty";
                break;
            case 13:
                objArr[1] = "getOverriddenDescriptors";
                break;
            default:
                objArr[1] = str2;
                break;
        }
        switch (i2) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
                break;
            case 7:
                objArr[2] = "substitute";
                break;
            case 14:
                objArr[2] = "setOverriddenDescriptors";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i2) {
            case 6:
            case 8:
            case 9:
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

    public boolean G() {
        return this.e;
    }

    public C7408tdb I() {
        C7408tdb tdb = this.h;
        if (tdb != null) {
            return tdb;
        }
        d(12);
        throw null;
    }

    public <V> V a(a<V> aVar) {
        return null;
    }

    public void a(Collection<? extends C4935Gcb> collection) {
        if (collection == null) {
            d(14);
            throw null;
        }
    }

    public void b(boolean z) {
        this.e = z;
    }

    public C5583aeb d() {
        C5583aeb aeb = this.k;
        if (aeb != null) {
            return aeb;
        }
        d(10);
        throw null;
    }

    public a g() {
        a aVar = this.j;
        if (aVar != null) {
            return aVar;
        }
        d(6);
        throw null;
    }

    public abstract C7339sdb getOriginal();

    public List<C4905Fdb> getTypeParameters() {
        List<C4905Fdb> emptyList = Collections.emptyList();
        if (emptyList != null) {
            return emptyList;
        }
        d(8);
        throw null;
    }

    public C6314ddb h() {
        C6314ddb ddb = this.g;
        if (ddb != null) {
            return ddb;
        }
        d(9);
        throw null;
    }

    public boolean isInline() {
        return this.i;
    }

    public C7615wdb k() {
        return I().k();
    }

    public C7615wdb l() {
        return I().l();
    }

    public boolean m() {
        return false;
    }

    public boolean n() {
        return this.f;
    }

    public boolean o() {
        return false;
    }

    public boolean p() {
        return false;
    }

    public boolean r() {
        return false;
    }

    public boolean s() {
        return false;
    }

    public boolean t() {
        return false;
    }

    public C5582adb u() {
        return this.l;
    }

    public boolean v() {
        return false;
    }

    public boolean w() {
        return false;
    }

    public boolean y() {
        return false;
    }

    public C5582adb a(_tb _tb) {
        if (_tb == null) {
            d(7);
            throw null;
        }
        throw new UnsupportedOperationException();
    }

    public void a(C5583aeb aeb) {
        this.k = aeb;
    }

    public C7339sdb a(C5272Rcb rcb, C6314ddb ddb, C5583aeb aeb, a aVar, boolean z) {
        throw new UnsupportedOperationException("Accessors must be copied by the corresponding property");
    }

    /* access modifiers changed from: protected */
    public Collection<C7339sdb> a(boolean z) {
        ArrayList arrayList = new ArrayList(0);
        for (C7408tdb tdb : I().j()) {
            Object b = z ? tdb.b() : tdb.c();
            if (b != null) {
                arrayList.add(b);
            }
        }
        return arrayList;
    }

    public void a(C5582adb adb) {
        this.l = adb;
    }
}
