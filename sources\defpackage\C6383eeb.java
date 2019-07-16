package defpackage;

import java.util.Map;

/* renamed from: eeb reason: default package and case insensitive filesystem */
/* compiled from: AnnotationDescriptorImpl */
public class C6383eeb implements C6315deb {
    private final C7706xtb a;
    private final Map<C7694xnb, Npb<?>> b;
    private final C7822zdb c;

    public C6383eeb(C7706xtb xtb, Map<C7694xnb, Npb<?>> map, C7822zdb zdb) {
        if (xtb == null) {
            a(0);
            throw null;
        } else if (map == null) {
            a(1);
            throw null;
        } else if (zdb != null) {
            this.a = xtb;
            this.b = map;
            this.c = zdb;
        } else {
            a(2);
            throw null;
        }
    }

    private static /* synthetic */ void a(int i) {
        String str = (i == 3 || i == 4 || i == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i == 3 || i == 4 || i == 5) ? 2 : 3)];
        String str2 = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotationDescriptorImpl";
        if (i == 1) {
            objArr[0] = "valueArguments";
        } else if (i == 2) {
            objArr[0] = "source";
        } else if (i == 3 || i == 4 || i == 5) {
            objArr[0] = str2;
        } else {
            objArr[0] = "annotationType";
        }
        if (i == 3) {
            objArr[1] = "getType";
        } else if (i == 4) {
            objArr[1] = "getAllValueArguments";
        } else if (i != 5) {
            objArr[1] = str2;
        } else {
            objArr[1] = "getSource";
        }
        if (!(i == 3 || i == 4 || i == 5)) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        throw ((i == 3 || i == 4 || i == 5) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    public Map<C7694xnb, Npb<?>> a() {
        Map<C7694xnb, Npb<?>> map = this.b;
        if (map != null) {
            return map;
        }
        a(4);
        throw null;
    }

    public C7822zdb getSource() {
        C7822zdb zdb = this.c;
        if (zdb != null) {
            return zdb;
        }
        a(5);
        throw null;
    }

    public C7706xtb getType() {
        C7706xtb xtb = this.a;
        if (xtb != null) {
            return xtb;
        }
        a(3);
        throw null;
    }

    public C7349snb q() {
        return a.a(this);
    }

    public String toString() {
        return Cob.f.a((C6315deb) this, (C6451feb) null);
    }
}
