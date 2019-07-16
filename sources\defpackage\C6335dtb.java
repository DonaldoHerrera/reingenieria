package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* renamed from: dtb reason: default package and case insensitive filesystem */
/* compiled from: ClassTypeConstructorImpl */
public class C6335dtb extends Usb implements Ptb {
    private final C5029Jcb c;
    private final List<C4905Fdb> d;
    private final Collection<C7706xtb> e;

    public C6335dtb(C5029Jcb jcb, List<? extends C4905Fdb> list, Collection<C7706xtb> collection, Ssb ssb) {
        if (jcb == null) {
            b(0);
            throw null;
        } else if (list == null) {
            b(1);
            throw null;
        } else if (collection == null) {
            b(2);
            throw null;
        } else if (ssb != null) {
            super(ssb);
            this.c = jcb;
            this.d = Collections.unmodifiableList(new ArrayList(list));
            this.e = Collections.unmodifiableCollection(collection);
        } else {
            b(3);
            throw null;
        }
    }

    private static /* synthetic */ void b(int i) {
        String str = (i == 4 || i == 5 || i == 6 || i == 7) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i == 4 || i == 5 || i == 6 || i == 7) ? 2 : 3)];
        String str2 = "kotlin/reflect/jvm/internal/impl/types/ClassTypeConstructorImpl";
        switch (i) {
            case 1:
                objArr[0] = "parameters";
                break;
            case 2:
                objArr[0] = "supertypes";
                break;
            case 3:
                objArr[0] = "storageManager";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
                objArr[0] = str2;
                break;
            default:
                objArr[0] = "classDescriptor";
                break;
        }
        if (i == 4) {
            objArr[1] = "getParameters";
        } else if (i == 5) {
            objArr[1] = "getDeclarationDescriptor";
        } else if (i == 6) {
            objArr[1] = "computeSupertypes";
        } else if (i != 7) {
            objArr[1] = str2;
        } else {
            objArr[1] = "getSupertypeLoopChecker";
        }
        if (!(i == 4 || i == 5 || i == 6 || i == 7)) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        throw ((i == 4 || i == 5 || i == 6 || i == 7) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    public boolean d() {
        return true;
    }

    /* access modifiers changed from: protected */
    public Collection<C7706xtb> e() {
        Collection<C7706xtb> collection = this.e;
        if (collection != null) {
            return collection;
        }
        b(6);
        throw null;
    }

    /* access modifiers changed from: protected */
    public C4843Ddb g() {
        a aVar = a.a;
        if (aVar != null) {
            return aVar;
        }
        b(7);
        throw null;
    }

    public List<C4905Fdb> getParameters() {
        List<C4905Fdb> list = this.d;
        if (list != null) {
            return list;
        }
        b(4);
        throw null;
    }

    public String toString() {
        return C6531gpb.e(this.c).a();
    }

    public C5029Jcb c() {
        C5029Jcb jcb = this.c;
        if (jcb != null) {
            return jcb;
        }
        b(5);
        throw null;
    }
}
