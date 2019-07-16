package defpackage;

import android.os.Build.VERSION;
import java.util.Arrays;
import java.util.Objects;

/* renamed from: Pb reason: default package and case insensitive filesystem */
/* compiled from: ObjectsCompat */
public class C0243Pb {
    public static boolean a(Object obj, Object obj2) {
        if (VERSION.SDK_INT >= 19) {
            return Objects.equals(obj, obj2);
        }
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static int a(Object... objArr) {
        if (VERSION.SDK_INT >= 19) {
            return Objects.hash(objArr);
        }
        return Arrays.hashCode(objArr);
    }
}
