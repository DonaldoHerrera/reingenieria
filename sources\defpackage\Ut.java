package defpackage;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: Ut reason: default package */
public final class Ut {
    private static final Map<Field, Ut> a = new WeakHashMap();
    private final boolean b;
    private final Field c;
    private final String d;

    private Ut(Field field, String str) {
        String str2;
        this.c = field;
        if (str == null) {
            str2 = null;
        } else {
            str2 = str.intern();
        }
        this.d = str2;
        this.b = Ot.a((Type) this.c.getType());
    }

    public static Ut a(Enum<?> enumR) {
        try {
            Ut a2 = a(enumR.getClass().getField(enumR.name()));
            String str = "enum constant missing @Value or @NullValue annotation: %s";
            Object[] objArr = {enumR};
            if (a2 != null) {
                return a2;
            }
            throw new IllegalArgumentException(Uu.a(str, objArr));
        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        }
    }

    public final String b() {
        return this.d;
    }

    public final boolean c() {
        return this.b;
    }

    public final Field d() {
        return this.c;
    }

    public final boolean e() {
        return Modifier.isFinal(this.c.getModifiers());
    }

    public final <T extends Enum<T>> T f() {
        return Enum.valueOf(this.c.getDeclaringClass(), this.c.getName());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x006a, code lost:
        return r2;
     */
    public static Ut a(Field field) {
        String str = null;
        if (field == null) {
            return null;
        }
        synchronized (a) {
            Ut ut = (Ut) a.get(field);
            boolean isEnumConstant = field.isEnumConstant();
            if (ut == null && (isEnumConstant || !Modifier.isStatic(field.getModifiers()))) {
                if (isEnumConstant) {
                    C1462ku kuVar = (C1462ku) field.getAnnotation(C1462ku.class);
                    if (kuVar != null) {
                        str = kuVar.value();
                    } else if (((C0474au) field.getAnnotation(C0474au.class)) == null) {
                        return null;
                    }
                } else {
                    Yt yt = (Yt) field.getAnnotation(Yt.class);
                    if (yt == null) {
                        return null;
                    }
                    str = yt.value();
                    field.setAccessible(true);
                }
                if ("##default".equals(str)) {
                    str = field.getName();
                }
                ut = new Ut(field, str);
                a.put(field, ut);
            }
        }
    }

    public final Type a() {
        return this.c.getGenericType();
    }

    public final Object a(Object obj) {
        return a(this.c, obj);
    }

    public final void a(Object obj, Object obj2) {
        a(this.c, obj, obj2);
    }

    private static Object a(Field field, Object obj) {
        try {
            return field.get(obj);
        } catch (IllegalAccessException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static void a(Field field, Object obj, Object obj2) {
        if (Modifier.isFinal(field.getModifiers())) {
            Object a2 = a(field, obj);
            if (obj2 != null ? !obj2.equals(a2) : a2 != null) {
                String valueOf = String.valueOf(a2);
                String valueOf2 = String.valueOf(obj2);
                String name = field.getName();
                String name2 = obj.getClass().getName();
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 48 + String.valueOf(valueOf2).length() + String.valueOf(name).length() + String.valueOf(name2).length());
                sb.append("expected final value <");
                sb.append(valueOf);
                sb.append("> but was <");
                sb.append(valueOf2);
                sb.append("> on ");
                sb.append(name);
                sb.append(" field in ");
                sb.append(name2);
                throw new IllegalArgumentException(sb.toString());
            }
            return;
        }
        try {
            field.set(obj, obj2);
        } catch (SecurityException e) {
            throw new IllegalArgumentException(e);
        } catch (IllegalAccessException e2) {
            throw new IllegalArgumentException(e2);
        }
    }
}
