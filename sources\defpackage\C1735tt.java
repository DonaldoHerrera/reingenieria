package defpackage;

import java.io.IOException;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: tt reason: default package and case insensitive filesystem */
public abstract class C1735tt {
    public abstract void a() throws IOException;

    public abstract void a(double d) throws IOException;

    public abstract void a(float f) throws IOException;

    public abstract void a(int i) throws IOException;

    public abstract void a(long j) throws IOException;

    public final void a(Object obj) throws IOException {
        a(false, obj);
    }

    public abstract void a(String str) throws IOException;

    public abstract void a(BigDecimal bigDecimal) throws IOException;

    public abstract void a(BigInteger bigInteger) throws IOException;

    public abstract void a(boolean z) throws IOException;

    public abstract void b() throws IOException;

    public abstract void b(String str) throws IOException;

    public abstract void c() throws IOException;

    public abstract void d() throws IOException;

    public abstract void e() throws IOException;

    public abstract void f() throws IOException;

    public abstract void g() throws IOException;

    private final void a(boolean z, Object obj) throws IOException {
        Mt mt;
        boolean z2;
        Field field;
        if (obj != null) {
            Class cls = obj.getClass();
            if (Ot.b(obj)) {
                f();
            } else if (obj instanceof String) {
                a((String) obj);
            } else {
                boolean z3 = true;
                if (obj instanceof Number) {
                    if (z) {
                        a(obj.toString());
                    } else if (obj instanceof BigDecimal) {
                        a((BigDecimal) obj);
                    } else if (obj instanceof BigInteger) {
                        a((BigInteger) obj);
                    } else if (obj instanceof Long) {
                        a(((Long) obj).longValue());
                    } else if (obj instanceof Float) {
                        float floatValue = ((Number) obj).floatValue();
                        if (Float.isInfinite(floatValue) || Float.isNaN(floatValue)) {
                            z3 = false;
                        }
                        if (z3) {
                            a(floatValue);
                            return;
                        }
                        throw new IllegalArgumentException();
                    } else if ((obj instanceof Integer) || (obj instanceof Short) || (obj instanceof Byte)) {
                        a(((Number) obj).intValue());
                    } else {
                        double doubleValue = ((Number) obj).doubleValue();
                        if (Double.isInfinite(doubleValue) || Double.isNaN(doubleValue)) {
                            z3 = false;
                        }
                        if (z3) {
                            a(doubleValue);
                            return;
                        }
                        throw new IllegalArgumentException();
                    }
                } else if (obj instanceof Boolean) {
                    a(((Boolean) obj).booleanValue());
                } else if (obj instanceof Rt) {
                    a(((Rt) obj).a());
                } else if ((obj instanceof Iterable) || cls.isArray()) {
                    b();
                    for (Object a : C1431ju.a(obj)) {
                        a(z, a);
                    }
                    c();
                } else if (cls.isEnum()) {
                    String b = Ut.a((Enum) obj).b();
                    if (b == null) {
                        f();
                    } else {
                        a(b);
                    }
                } else {
                    d();
                    boolean z4 = (obj instanceof Map) && !(obj instanceof Tt);
                    if (z4) {
                        mt = null;
                    } else {
                        mt = Mt.a(cls);
                    }
                    for (Entry entry : Ot.c(obj).entrySet()) {
                        Object value = entry.getValue();
                        if (value != null) {
                            String str = (String) entry.getKey();
                            if (z4) {
                                z2 = z;
                            } else {
                                Ut a2 = mt.a(str);
                                if (a2 == null) {
                                    field = null;
                                } else {
                                    field = a2.d();
                                }
                                z2 = (field == null || field.getAnnotation(C1915zt.class) == null) ? false : true;
                            }
                            b(str);
                            a(z2, value);
                        }
                    }
                    e();
                }
            }
        }
    }
}
