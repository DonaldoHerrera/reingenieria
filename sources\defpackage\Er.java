package defpackage;

import android.os.IBinder;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.lang.reflect.Field;

@KeepForSdk
/* renamed from: Er reason: default package */
public final class Er<T> extends a {
    private final T a;

    private Er(T t) {
        this.a = t;
    }

    @KeepForSdk
    public static <T> Dr a(T t) {
        return new Er(t);
    }

    @KeepForSdk
    public static <T> T c(Dr dr) {
        if (dr instanceof Er) {
            return ((Er) dr).a;
        }
        IBinder asBinder = dr.asBinder();
        Field[] declaredFields = asBinder.getClass().getDeclaredFields();
        Field field = null;
        int i = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i++;
                field = field2;
            }
        }
        if (i != 1) {
            int length = declaredFields.length;
            StringBuilder sb = new StringBuilder(64);
            sb.append("Unexpected number of IObjectWrapper declared fields: ");
            sb.append(length);
            throw new IllegalArgumentException(sb.toString());
        } else if (!field.isAccessible()) {
            field.setAccessible(true);
            try {
                return field.get(asBinder);
            } catch (NullPointerException e) {
                throw new IllegalArgumentException("Binder object is null.", e);
            } catch (IllegalAccessException e2) {
                throw new IllegalArgumentException("Could not access the field in remoteBinder.", e2);
            }
        } else {
            throw new IllegalArgumentException("IObjectWrapper declared field not private!");
        }
    }
}
