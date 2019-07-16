package defpackage;

import java.util.Collections;
import java.util.EnumSet;
import java.util.Set;

/* renamed from: Tbb reason: default package and case insensitive filesystem */
/* compiled from: PrimitiveType */
public enum C5331Tbb {
    BOOLEAN("Boolean"),
    CHAR("Char"),
    BYTE("Byte"),
    SHORT("Short"),
    INT("Int"),
    FLOAT("Float"),
    LONG("Long"),
    DOUBLE("Double");
    
    public static final Set<C5331Tbb> i = null;
    private final C7694xnb k;
    private final C7694xnb l;
    private C7349snb m;
    private C7349snb n;

    static {
        C5331Tbb tbb;
        C5331Tbb tbb2;
        C5331Tbb tbb3;
        C5331Tbb tbb4;
        C5331Tbb tbb5;
        C5331Tbb tbb6;
        C5331Tbb tbb7;
        i = Collections.unmodifiableSet(EnumSet.of(tbb, new C5331Tbb[]{tbb2, tbb3, tbb4, tbb5, tbb6, tbb7}));
    }

    private C5331Tbb(String str) {
        this.m = null;
        this.n = null;
        this.k = C7694xnb.b(str);
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("Array");
        this.l = C7694xnb.b(sb.toString());
    }

    public C7349snb a() {
        C7349snb snb = this.n;
        if (snb == null) {
            this.n = C5301Sbb.b.a(this.l);
            C7349snb snb2 = this.n;
            if (snb2 != null) {
                return snb2;
            }
            a(5);
            throw null;
        } else if (snb != null) {
            return snb;
        } else {
            a(4);
            throw null;
        }
    }

    public C7694xnb b() {
        C7694xnb xnb = this.l;
        if (xnb != null) {
            return xnb;
        }
        a(3);
        throw null;
    }

    public C7349snb c() {
        C7349snb snb = this.m;
        if (snb == null) {
            this.m = C5301Sbb.b.a(this.k);
            C7349snb snb2 = this.m;
            if (snb2 != null) {
                return snb2;
            }
            a(2);
            throw null;
        } else if (snb != null) {
            return snb;
        } else {
            a(1);
            throw null;
        }
    }

    public C7694xnb d() {
        C7694xnb xnb = this.k;
        if (xnb != null) {
            return xnb;
        }
        a(0);
        throw null;
    }
}
