package defpackage;

/* renamed from: eLa reason: default package and case insensitive filesystem */
/* compiled from: ScalarMapper */
public class C6363eLa<T> implements C6295dLa<T> {
    private final Class<T> a;

    C6363eLa(Class<T> cls) {
        this.a = cls;
    }

    public static <T> C6363eLa<T> a(Class<T> cls) {
        return new C6363eLa<>(cls);
    }

    public T a(C5326TKa tKa) {
        Class<T> cls = this.a;
        if (cls == Integer.class) {
            return cls.cast(Integer.valueOf(tKa.d(0)));
        }
        if (cls == Long.class) {
            return cls.cast(Long.valueOf(tKa.e(0)));
        }
        if (cls == Short.class) {
            return cls.cast(Short.valueOf(tKa.f(0)));
        }
        if (cls == Float.class) {
            return cls.cast(Float.valueOf(tKa.c(0)));
        }
        if (cls == Double.class) {
            return cls.cast(Double.valueOf(tKa.b(0)));
        }
        if (cls == String.class) {
            return cls.cast(tKa.g(0));
        }
        if (cls == Boolean.class) {
            return cls.cast(tKa.d(0) == 1 ? Boolean.TRUE : Boolean.FALSE);
        } else if (cls == byte[].class) {
            return cls.cast(tKa.a(0));
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Illegal type: ");
            sb.append(this.a.getCanonicalName());
            sb.append("; only primitive types allowed");
            throw new IllegalArgumentException(sb.toString());
        }
    }
}
