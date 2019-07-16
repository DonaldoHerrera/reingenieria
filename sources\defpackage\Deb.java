package defpackage;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* renamed from: Deb reason: default package */
/* compiled from: AbstractReceiverParameterDescriptor */
public abstract class Deb extends Peb implements C7615wdb {
    private static final C7694xnb c = C7694xnb.d("<this>");

    public Deb(C6723jeb jeb) {
        if (jeb != null) {
            super(jeb, c);
        } else {
            c(0);
            throw null;
        }
    }

    private static /* synthetic */ void c(int i) {
        String str;
        int i2;
        Throwable th;
        switch (i) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        String str2 = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractReceiverParameterDescriptor";
        switch (i) {
            case 1:
                objArr[0] = "substitutor";
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                objArr[0] = str2;
                break;
            default:
                objArr[0] = "annotations";
                break;
        }
        switch (i) {
            case 2:
                objArr[1] = "getTypeParameters";
                break;
            case 3:
                objArr[1] = "getType";
                break;
            case 4:
                objArr[1] = "getValueParameters";
                break;
            case 5:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 6:
                objArr[1] = "getVisibility";
                break;
            case 7:
                objArr[1] = "getOriginal";
                break;
            case 8:
                objArr[1] = "getSource";
                break;
            default:
                objArr[1] = str2;
                break;
        }
        switch (i) {
            case 1:
                objArr[2] = "substitute";
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                th = new IllegalStateException(format);
                break;
            default:
                th = new IllegalArgumentException(format);
                break;
        }
        throw th;
    }

    public C5583aeb d() {
        C5583aeb aeb = _db.f;
        if (aeb != null) {
            return aeb;
        }
        c(6);
        throw null;
    }

    public List<C5061Kdb> f() {
        List<C5061Kdb> emptyList = Collections.emptyList();
        if (emptyList != null) {
            return emptyList;
        }
        c(4);
        throw null;
    }

    public C7201qdb getOriginal() {
        return this;
    }

    public C7822zdb getSource() {
        C7822zdb zdb = C7822zdb.a;
        if (zdb != null) {
            return zdb;
        }
        c(8);
        throw null;
    }

    public C7706xtb getType() {
        C7706xtb type = getValue().getType();
        if (type != null) {
            return type;
        }
        c(3);
        throw null;
    }

    public List<C4905Fdb> getTypeParameters() {
        List<C4905Fdb> emptyList = Collections.emptyList();
        if (emptyList != null) {
            return emptyList;
        }
        c(2);
        throw null;
    }

    public Collection<? extends C4904Fcb> j() {
        Set emptySet = Collections.emptySet();
        if (emptySet != null) {
            return emptySet;
        }
        c(5);
        throw null;
    }

    public C7615wdb k() {
        return null;
    }

    public C7615wdb l() {
        return null;
    }

    public boolean o() {
        return false;
    }

    public C7615wdb a(_tb _tb) {
        C7706xtb xtb;
        if (_tb == null) {
            c(1);
            throw null;
        } else if (_tb.b()) {
            return this;
        } else {
            if (e() instanceof C5029Jcb) {
                xtb = _tb.b(getType(), C6473fub.OUT_VARIANCE);
            } else {
                xtb = _tb.b(getType(), C6473fub.INVARIANT);
            }
            if (xtb == null) {
                return null;
            }
            if (xtb == getType()) {
                return this;
            }
            return new C7272rfb(e(), new Wqb(xtb), getAnnotations());
        }
    }

    public <R, D> R a(C5332Tcb<R, D> tcb, D d) {
        return tcb.a((C7615wdb) this, d);
    }

    public C7706xtb a() {
        return getType();
    }
}
