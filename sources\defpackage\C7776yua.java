package defpackage;

import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/* renamed from: yua reason: default package and case insensitive filesystem */
/* compiled from: OperationDurationLogger */
public class C7776yua {

    /* renamed from: yua$a */
    /* compiled from: OperationDurationLogger */
    public static abstract class a {
        public static final a a = new C7638wua("Empty");
        private final String b;

        static a a(String str, C5694cGa cga) {
            return new C7707xua(str, cga);
        }

        public abstract long a(TimeUnit timeUnit);

        public abstract void b();

        public abstract void c();

        private a(String str) {
            this.b = str;
        }

        public String a() {
            return this.b;
        }

        static long a(TimeUnit timeUnit, long j) {
            return timeUnit.convert(j, TimeUnit.MILLISECONDS);
        }
    }

    public static a a(StackTraceElement[] stackTraceElementArr, boolean z) {
        if (z) {
            return a(stackTraceElementArr);
        }
        return a();
    }

    private static String b(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length > 0) {
            String a2 = a(Arrays.asList(stackTraceElementArr).iterator());
            return a2.isEmpty() ? stackTraceElementArr[0].toString() : a2;
        }
        throw new IllegalArgumentException("The stack trace can't be empty.");
    }

    public static a a(StackTraceElement[] stackTraceElementArr) {
        return a(stackTraceElementArr, (C5694cGa) C5626bGa.a);
    }

    public static a a(StackTraceElement[] stackTraceElementArr, C5694cGa cga) {
        return a.a(b(stackTraceElementArr), cga);
    }

    public static a a() {
        return a.a;
    }

    private static String a(Iterator<StackTraceElement> it) {
        if (!it.hasNext()) {
            return "";
        }
        String stackTraceElement = ((StackTraceElement) it.next()).toString();
        if (a(stackTraceElement)) {
            return stackTraceElement;
        }
        return a(it);
    }

    public static void a(a aVar, int i, TimeUnit timeUnit) {
        if (aVar != a.a) {
            long a2 = aVar.a(TimeUnit.MILLISECONDS);
            StringBuilder sb = new StringBuilder();
            sb.append("Operation took ");
            sb.append(a2);
            sb.append(" ms. Subscribed from ");
            sb.append(aVar.a());
            String sb2 = sb.toString();
            String str = "Performances";
            if (a2 > timeUnit.toMillis((long) i)) {
                C7316sHa.a(5, str, sb2);
            } else {
                C7316sHa.a(3, str, sb2);
            }
        }
    }

    private static boolean a(String str) {
        return !str.startsWith("com.soundcloud.android.rx") && str.startsWith("com.soundcloud.android.");
    }
}
