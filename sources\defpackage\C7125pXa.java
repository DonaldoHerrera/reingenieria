package defpackage;

import java.lang.reflect.Field;

/* renamed from: pXa reason: default package and case insensitive filesystem */
/* compiled from: DebugMetadata.kt */
public final class C7125pXa {
    public static final StackTraceElement a(C6783kXa kxa) {
        int i;
        String str;
        C7471uYa.b(kxa, "$this$getStackTraceElementImpl");
        C7056oXa b = b(kxa);
        if (b == null) {
            return null;
        }
        a(1, b.v());
        int c = c(kxa);
        if (c < 0) {
            i = -1;
        } else {
            i = b.l()[c];
        }
        String a = C7263rXa.c.a(kxa);
        if (a == null) {
            str = b.c();
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(a);
            sb.append('/');
            sb.append(b.c());
            str = sb.toString();
        }
        return new StackTraceElement(str, b.m(), b.f(), i);
    }

    private static final C7056oXa b(C6783kXa kxa) {
        return (C7056oXa) kxa.getClass().getAnnotation(C7056oXa.class);
    }

    private static final int c(C6783kXa kxa) {
        try {
            Field declaredField = kxa.getClass().getDeclaredField("label");
            C7471uYa.a((Object) declaredField, "field");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(kxa);
            if (!(obj instanceof Integer)) {
                obj = null;
            }
            Integer num = (Integer) obj;
            return (num != null ? num.intValue() : 0) - 1;
        } catch (Exception unused) {
            return -1;
        }
    }

    private static final void a(int i, int i2) {
        if (i2 > i) {
            StringBuilder sb = new StringBuilder();
            sb.append("Debug metadata version mismatch. Expected: ");
            sb.append(i);
            sb.append(", got ");
            sb.append(i2);
            sb.append(". Please update the Kotlin standard library.");
            throw new IllegalStateException(sb.toString().toString());
        }
    }
}
