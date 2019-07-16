package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: CUa reason: default package */
/* compiled from: EndConsumerHelper */
public final class CUa {
    public static boolean a(AtomicReference<VPa> atomicReference, VPa vPa, Class<?> cls) {
        AQa.a(vPa, "next is null");
        if (atomicReference.compareAndSet(null, vPa)) {
            return true;
        }
        vPa.dispose();
        if (atomicReference.get() != C7463uQa.DISPOSED) {
            a(cls);
        }
        return false;
    }

    public static String a(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("It is not allowed to subscribe with a(n) ");
        sb.append(str);
        sb.append(" multiple times. Please create a fresh instance of ");
        sb.append(str);
        sb.append(" and subscribe that to the target source instead.");
        return sb.toString();
    }

    public static void a(Class<?> cls) {
        WUa.b((Throwable) new C5704cQa(a(cls.getName())));
    }
}
