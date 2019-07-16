package defpackage;

import java.lang.reflect.Field;
import java.security.PrivilegedExceptionAction;
import sun.misc.Unsafe;

/* renamed from: oE reason: default package and case insensitive filesystem */
/* compiled from: AbstractFuture */
class C3169oE implements PrivilegedExceptionAction<Unsafe> {
    C3169oE() {
    }

    public Unsafe run() throws Exception {
        Field[] declaredFields;
        Class<Unsafe> cls = Unsafe.class;
        for (Field field : cls.getDeclaredFields()) {
            field.setAccessible(true);
            Object obj = field.get(null);
            if (cls.isInstance(obj)) {
                return (Unsafe) cls.cast(obj);
            }
        }
        throw new NoSuchFieldError("the Unsafe");
    }
}
