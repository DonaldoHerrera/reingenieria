package defpackage;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Collection;

/* renamed from: TA reason: default package */
public class TA<T> {
    private final Object a;
    private final Field b;
    private final Class<T> c;

    TA(Object obj, Field field, Class<T> cls) {
        this.a = obj;
        this.b = field;
        this.c = cls;
    }

    TA(Object obj, Field field, Class<T> cls, byte b2) {
        this(obj, field, a(cls));
    }

    private static <T> Class<T[]> a(Class<T> cls) {
        return Array.newInstance(cls, 0).getClass();
    }

    private Class<T> b() {
        return this.b.getType().getComponentType();
    }

    public final T a() {
        try {
            return this.c.cast(this.b.get(this.a));
        } catch (Exception e) {
            throw new WA(String.format("Failed to get value of field %s of type %s on object of type %s", new Object[]{this.b.getName(), this.a.getClass().getName(), this.c.getName()}), e);
        }
    }

    public void a(Collection<T> collection) {
        Object[] objArr = (Object[]) a();
        int length = objArr == null ? 0 : objArr.length;
        Object[] objArr2 = (Object[]) Array.newInstance(b(), collection.size() + length);
        if (objArr != null) {
            System.arraycopy(objArr, 0, objArr2, 0, objArr.length);
        }
        for (T t : collection) {
            objArr2[length] = t;
            length++;
        }
        try {
            this.b.set(this.a, objArr2);
        } catch (Exception e) {
            throw new WA(String.format("Failed to set value of field %s of type %s on object of type %s", new Object[]{this.b.getName(), this.a.getClass().getName(), this.c.getName()}), e);
        }
    }

    public void a(T[] tArr) {
        a((Collection<T>) Arrays.asList(tArr));
    }
}
