package defpackage;

import com.adjust.sdk.Constants;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: tqb reason: default package and case insensitive filesystem */
/* compiled from: JvmPrimitiveType */
public enum C7424tqb {
    BOOLEAN(C5331Tbb.BOOLEAN, "boolean", "Z", "java.lang.Boolean"),
    CHAR(C5331Tbb.CHAR, "char", "C", "java.lang.Character"),
    BYTE(C5331Tbb.BYTE, "byte", "B", "java.lang.Byte"),
    SHORT(C5331Tbb.SHORT, "short", "S", "java.lang.Short"),
    INT(C5331Tbb.INT, "int", "I", "java.lang.Integer"),
    FLOAT(C5331Tbb.FLOAT, "float", "F", "java.lang.Float"),
    LONG(C5331Tbb.LONG, Constants.LONG, "J", "java.lang.Long"),
    DOUBLE(C5331Tbb.DOUBLE, "double", "D", "java.lang.Double");
    
    private static final Set<C7349snb> i = null;
    private static final Map<String, C7424tqb> j = null;
    private static final Map<C5331Tbb, C7424tqb> k = null;
    private static final Map<String, C7424tqb> l = null;
    private final C5331Tbb n;
    private final String o;
    private final String p;
    private final C7349snb q;

    static {
        int i2;
        C7424tqb[] values;
        i = new HashSet();
        j = new HashMap();
        k = new EnumMap(C5331Tbb.class);
        l = new HashMap();
        for (C7424tqb tqb : values()) {
            i.add(tqb.d());
            j.put(tqb.b(), tqb);
            k.put(tqb.c(), tqb);
            l.put(tqb.a(), tqb);
        }
    }

    private C7424tqb(C5331Tbb tbb, String str, String str2, String str3) {
        if (tbb == null) {
            a(6);
            throw null;
        } else if (str == null) {
            a(7);
            throw null;
        } else if (str2 == null) {
            a(8);
            throw null;
        } else if (str3 != null) {
            this.n = tbb;
            this.o = str;
            this.p = str2;
            this.q = new C7349snb(str3);
        } else {
            a(9);
            throw null;
        }
    }

    public static C7424tqb a(String str) {
        if (str != null) {
            C7424tqb tqb = (C7424tqb) j.get(str);
            if (tqb == null) {
                StringBuilder sb = new StringBuilder();
                sb.append("Non-primitive type name passed: ");
                sb.append(str);
                throw new AssertionError(sb.toString());
            } else if (tqb != null) {
                return tqb;
            } else {
                a(2);
                throw null;
            }
        } else {
            a(1);
            throw null;
        }
    }

    public String b() {
        String str = this.o;
        if (str != null) {
            return str;
        }
        a(11);
        throw null;
    }

    public C5331Tbb c() {
        C5331Tbb tbb = this.n;
        if (tbb != null) {
            return tbb;
        }
        a(10);
        throw null;
    }

    public C7349snb d() {
        C7349snb snb = this.q;
        if (snb != null) {
            return snb;
        }
        a(13);
        throw null;
    }

    public static C7424tqb a(C5331Tbb tbb) {
        if (tbb != null) {
            C7424tqb tqb = (C7424tqb) k.get(tbb);
            if (tqb != null) {
                return tqb;
            }
            a(4);
            throw null;
        }
        a(3);
        throw null;
    }

    public String a() {
        String str = this.p;
        if (str != null) {
            return str;
        }
        a(12);
        throw null;
    }
}
