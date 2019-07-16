package defpackage;

import java.util.Collection;

/* renamed from: Eub reason: default package */
/* compiled from: ErrorSimpleFunctionDescriptorImpl */
public class Eub extends C7341sfb {
    private final b D;

    public Eub(C5029Jcb jcb, b bVar) {
        if (jcb == null) {
            f(0);
            throw null;
        } else if (bVar != null) {
            super(jcb, null, C6723jeb.c.a(), C7694xnb.d("<ERROR FUNCTION>"), a.DECLARATION, C7822zdb.a);
            this.D = bVar;
        } else {
            f(1);
            throw null;
        }
    }

    private static /* synthetic */ void f(int i) {
        String str = (i == 6 || i == 7 || i == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i == 6 || i == 7 || i == 8) ? 2 : 3)];
        String str2 = "kotlin/reflect/jvm/internal/impl/types/error/ErrorSimpleFunctionDescriptorImpl";
        switch (i) {
            case 1:
                objArr[0] = "ownerScope";
                break;
            case 2:
                objArr[0] = "newOwner";
                break;
            case 3:
                objArr[0] = "kind";
                break;
            case 4:
                objArr[0] = "annotations";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
            case 7:
            case 8:
                objArr[0] = str2;
                break;
            case 9:
                objArr[0] = "overriddenDescriptors";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        String str3 = "createSubstitutedCopy";
        if (i == 6) {
            objArr[1] = str3;
        } else if (i == 7) {
            objArr[1] = "copy";
        } else if (i != 8) {
            objArr[1] = str2;
        } else {
            objArr[1] = "newCopyBuilder";
        }
        switch (i) {
            case 2:
            case 3:
            case 4:
            case 5:
                objArr[2] = str3;
                break;
            case 6:
            case 7:
            case 8:
                break;
            case 9:
                objArr[2] = "setOverriddenDescriptors";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        throw ((i == 6 || i == 7 || i == 8) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    /* access modifiers changed from: protected */
    public _eb a(C5272Rcb rcb, C5582adb adb, a aVar, C7694xnb xnb, C6723jeb jeb, C7822zdb zdb) {
        if (rcb == null) {
            f(2);
            throw null;
        } else if (aVar == null) {
            f(3);
            throw null;
        } else if (jeb == null) {
            f(4);
            throw null;
        } else if (zdb != null) {
            return this;
        } else {
            f(5);
            throw null;
        }
    }

    public <V> V a(a<V> aVar) {
        return null;
    }

    public C7684xdb a(C5272Rcb rcb, C6314ddb ddb, C5583aeb aeb, a aVar, boolean z) {
        return this;
    }

    public void a(Collection<? extends C4935Gcb> collection) {
        if (collection == null) {
            f(9);
            throw null;
        }
    }

    public boolean s() {
        return false;
    }

    public a<? extends C7684xdb> x() {
        return new Dub(this);
    }
}
