package defpackage;

import java.lang.reflect.Field;
import java.security.PrivilegedExceptionAction;
import sun.misc.Unsafe;

/* renamed from: UC reason: default package and case insensitive filesystem */
/* compiled from: Striped64 */
class C2309UC implements PrivilegedExceptionAction<Unsafe> {
    C2309UC() {
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
