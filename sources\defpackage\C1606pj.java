package defpackage;

import android.app.ActivityManager.RunningAppProcessInfo;
import com.soundcloud.flippernative.BuildConfig;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: pj reason: default package and case insensitive filesystem */
/* compiled from: SessionProtobufHelper */
class C1606pj {
    private static final Jh a = Jh.a(BuildConfig.VERSION_NAME);
    private static final Jh b = Jh.a("Unity");

    public static void a(Nh nh, String str, String str2, long j) throws Exception {
        nh.b(1, Jh.a(str2));
        nh.b(2, Jh.a(str));
        nh.b(3, j);
    }

    private static int b(Jh jh) {
        return Nh.a(1, jh) + 0;
    }

    public static void a(Nh nh, String str, String str2, String str3, String str4, String str5, int i, String str6) throws Exception {
        Jh a2 = Jh.a(str);
        Jh a3 = Jh.a(str2);
        Jh a4 = Jh.a(str3);
        Jh a5 = Jh.a(str4);
        Jh a6 = Jh.a(str5);
        Jh a7 = str6 != null ? Jh.a(str6) : null;
        nh.f(7, 2);
        nh.l(a(a2, a3, a4, a5, a6, i, a7));
        nh.b(1, a2);
        nh.b(2, a4);
        nh.b(3, a5);
        nh.f(5, 2);
        nh.l(b(a3));
        nh.b(1, a3);
        nh.b(6, a6);
        if (a7 != null) {
            nh.b(8, b);
            nh.b(9, a7);
        }
        nh.d(10, i);
    }

    public static void a(Nh nh, String str, String str2, boolean z) throws Exception {
        Jh a2 = Jh.a(str);
        Jh a3 = Jh.a(str2);
        nh.f(8, 2);
        nh.l(a(a2, a3, z));
        nh.d(1, 3);
        nh.b(2, a2);
        nh.b(3, a3);
        nh.b(4, z);
    }

    public static void a(Nh nh, int i, String str, int i2, long j, long j2, boolean z, Map<a, String> map, int i3, String str2, String str3) throws Exception {
        Nh nh2 = nh;
        Jh a2 = a(str);
        Jh a3 = a(str3);
        Jh a4 = a(str2);
        nh2.f(9, 2);
        Jh jh = a4;
        nh2.l(a(i, a2, i2, j, j2, z, map, i3, a4, a3));
        nh2.d(3, i);
        nh2.b(4, a2);
        nh2.g(5, i2);
        nh2.b(6, j);
        nh2.b(7, j2);
        nh2.b(10, z);
        for (Entry entry : map.entrySet()) {
            nh2.f(11, 2);
            nh2.l(a((a) entry.getKey(), (String) entry.getValue()));
            nh2.d(1, ((a) entry.getKey()).i);
            nh2.b(2, Jh.a((String) entry.getValue()));
        }
        nh2.g(12, i3);
        if (jh != null) {
            nh2.b(13, jh);
        }
        if (a3 != null) {
            nh2.b(14, a3);
        }
    }

    public static void a(Nh nh, String str, String str2, String str3) throws Exception {
        if (str == null) {
            str = "";
        }
        Jh a2 = Jh.a(str);
        Jh a3 = a(str2);
        Jh a4 = a(str3);
        int a5 = Nh.a(1, a2) + 0;
        if (str2 != null) {
            a5 += Nh.a(2, a3);
        }
        if (str3 != null) {
            a5 += Nh.a(3, a4);
        }
        nh.f(6, 2);
        nh.l(a5);
        nh.b(1, a2);
        if (str2 != null) {
            nh.b(2, a3);
        }
        if (str3 != null) {
            nh.b(3, a4);
        }
    }

    public static void a(Nh nh, long j, String str, C1725tj tjVar, Thread thread, StackTraceElement[] stackTraceElementArr, Thread[] threadArr, List<StackTraceElement[]> list, Map<String, String> map, Yi yi, RunningAppProcessInfo runningAppProcessInfo, int i, String str2, String str3, Float f, int i2, boolean z, long j2, long j3) throws Exception {
        Jh jh;
        Nh nh2 = nh;
        String str4 = str3;
        Jh a2 = Jh.a(str2);
        if (str4 == null) {
            jh = null;
        } else {
            jh = Jh.a(str4.replace("-", ""));
        }
        Jh jh2 = jh;
        Jh b2 = yi.b();
        if (b2 == null) {
            C5328TMa.e().d("CrashlyticsCore", "No log data to include with this event.");
        }
        yi.a();
        nh2.f(10, 2);
        nh2.l(a(j, str, tjVar, thread, stackTraceElementArr, threadArr, list, 8, map, runningAppProcessInfo, i, a2, jh2, f, i2, z, j2, j3, b2));
        nh2.b(1, j);
        nh2.b(2, Jh.a(str));
        Jh jh3 = b2;
        a(nh, tjVar, thread, stackTraceElementArr, threadArr, list, 8, a2, jh2, map, runningAppProcessInfo, i);
        a(nh, f, i2, z, i, j2, j3);
        a(nh2, jh3);
    }

    private static void a(Nh nh, C1725tj tjVar, Thread thread, StackTraceElement[] stackTraceElementArr, Thread[] threadArr, List<StackTraceElement[]> list, int i, Jh jh, Jh jh2, Map<String, String> map, RunningAppProcessInfo runningAppProcessInfo, int i2) throws Exception {
        nh.f(3, 2);
        nh.l(a(tjVar, thread, stackTraceElementArr, threadArr, list, i, jh, jh2, map, runningAppProcessInfo, i2));
        a(nh, tjVar, thread, stackTraceElementArr, threadArr, list, i, jh, jh2);
        if (map != null && !map.isEmpty()) {
            a(nh, map);
        }
        if (runningAppProcessInfo != null) {
            nh.b(3, runningAppProcessInfo.importance != 100);
        }
        nh.g(4, i2);
    }

    private static void a(Nh nh, C1725tj tjVar, Thread thread, StackTraceElement[] stackTraceElementArr, Thread[] threadArr, List<StackTraceElement[]> list, int i, Jh jh, Jh jh2) throws Exception {
        nh.f(1, 2);
        nh.l(a(tjVar, thread, stackTraceElementArr, threadArr, list, i, jh, jh2));
        a(nh, thread, stackTraceElementArr, 4, true);
        int length = threadArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            a(nh, threadArr[i2], (StackTraceElement[]) list.get(i2), 0, false);
        }
        a(nh, tjVar, 1, i, 2);
        nh.f(3, 2);
        nh.l(a());
        nh.b(1, a);
        nh.b(2, a);
        nh.b(3, 0);
        nh.f(4, 2);
        nh.l(a(jh, jh2));
        nh.b(1, 0);
        nh.b(2, 0);
        nh.b(3, jh);
        if (jh2 != null) {
            nh.b(4, jh2);
        }
    }

    private static void a(Nh nh, Map<String, String> map) throws Exception {
        for (Entry entry : map.entrySet()) {
            nh.f(2, 2);
            nh.l(a((String) entry.getKey(), (String) entry.getValue()));
            nh.b(1, Jh.a((String) entry.getKey()));
            String str = (String) entry.getValue();
            if (str == null) {
                str = "";
            }
            nh.b(2, Jh.a(str));
        }
    }

    private static void a(Nh nh, C1725tj tjVar, int i, int i2, int i3) throws Exception {
        nh.f(i3, 2);
        nh.l(a(tjVar, 1, i2));
        nh.b(1, Jh.a(tjVar.b));
        String str = tjVar.a;
        if (str != null) {
            nh.b(3, Jh.a(str));
        }
        int i4 = 0;
        for (StackTraceElement a2 : tjVar.c) {
            a(nh, 4, a2, true);
        }
        C1725tj tjVar2 = tjVar.d;
        if (tjVar2 == null) {
            return;
        }
        if (i < i2) {
            a(nh, tjVar2, i + 1, i2, 6);
            return;
        }
        while (tjVar2 != null) {
            tjVar2 = tjVar2.d;
            i4++;
        }
        nh.g(7, i4);
    }

    private static void a(Nh nh, Thread thread, StackTraceElement[] stackTraceElementArr, int i, boolean z) throws Exception {
        nh.f(1, 2);
        nh.l(a(thread, stackTraceElementArr, i, z));
        nh.b(1, Jh.a(thread.getName()));
        nh.g(2, i);
        for (StackTraceElement a2 : stackTraceElementArr) {
            a(nh, 3, a2, z);
        }
    }

    private static void a(Nh nh, int i, StackTraceElement stackTraceElement, boolean z) throws Exception {
        nh.f(i, 2);
        nh.l(a(stackTraceElement, z));
        if (stackTraceElement.isNativeMethod()) {
            nh.b(1, (long) Math.max(stackTraceElement.getLineNumber(), 0));
        } else {
            nh.b(1, 0);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(stackTraceElement.getClassName());
        sb.append(".");
        sb.append(stackTraceElement.getMethodName());
        nh.b(2, Jh.a(sb.toString()));
        if (stackTraceElement.getFileName() != null) {
            nh.b(3, Jh.a(stackTraceElement.getFileName()));
        }
        int i2 = 4;
        if (!stackTraceElement.isNativeMethod() && stackTraceElement.getLineNumber() > 0) {
            nh.b(4, (long) stackTraceElement.getLineNumber());
        }
        if (!z) {
            i2 = 0;
        }
        nh.g(5, i2);
    }

    private static void a(Nh nh, Float f, int i, boolean z, int i2, long j, long j2) throws Exception {
        nh.f(5, 2);
        nh.l(a(f, i, z, i2, j, j2));
        if (f != null) {
            nh.b(1, f.floatValue());
        }
        nh.e(2, i);
        nh.b(3, z);
        nh.g(4, i2);
        nh.b(5, j);
        nh.b(6, j2);
    }

    private static void a(Nh nh, Jh jh) throws Exception {
        if (jh != null) {
            nh.f(6, 2);
            nh.l(a(jh));
            nh.b(1, jh);
        }
    }

    private static int a(Jh jh, Jh jh2, Jh jh3, Jh jh4, Jh jh5, int i, Jh jh6) {
        int a2 = Nh.a(1, jh) + 0 + Nh.a(2, jh3) + Nh.a(3, jh4);
        int b2 = b(jh2);
        int e = a2 + Nh.e(5) + Nh.c(b2) + b2 + Nh.a(6, jh5);
        if (jh6 != null) {
            e = e + Nh.a(8, b) + Nh.a(9, jh6);
        }
        return e + Nh.a(10, i);
    }

    private static int a(Jh jh, Jh jh2, boolean z) {
        return Nh.a(1, 3) + 0 + Nh.a(2, jh) + Nh.a(3, jh2) + Nh.a(4, z);
    }

    private static int a(a aVar, String str) {
        return Nh.a(1, aVar.i) + Nh.a(2, Jh.a(str));
    }

    private static int a(int i, Jh jh, int i2, long j, long j2, boolean z, Map<a, String> map, int i3, Jh jh2, Jh jh3) {
        int i4;
        int i5;
        int i6 = 0;
        int a2 = Nh.a(3, i) + 0;
        if (jh == null) {
            i4 = 0;
        } else {
            i4 = Nh.a(4, jh);
        }
        int c = a2 + i4 + Nh.c(5, i2) + Nh.a(6, j) + Nh.a(7, j2) + Nh.a(10, z);
        if (map != null) {
            for (Entry entry : map.entrySet()) {
                int a3 = a((a) entry.getKey(), (String) entry.getValue());
                c += Nh.e(11) + Nh.c(a3) + a3;
            }
        }
        int c2 = c + Nh.c(12, i3);
        if (jh2 == null) {
            i5 = 0;
        } else {
            i5 = Nh.a(13, jh2);
        }
        int i7 = c2 + i5;
        if (jh3 != null) {
            i6 = Nh.a(14, jh3);
        }
        return i7 + i6;
    }

    private static int a(Jh jh, Jh jh2) {
        int a2 = Nh.a(1, 0) + 0 + Nh.a(2, 0) + Nh.a(3, jh);
        return jh2 != null ? a2 + Nh.a(4, jh2) : a2;
    }

    private static int a(long j, String str, C1725tj tjVar, Thread thread, StackTraceElement[] stackTraceElementArr, Thread[] threadArr, List<StackTraceElement[]> list, int i, Map<String, String> map, RunningAppProcessInfo runningAppProcessInfo, int i2, Jh jh, Jh jh2, Float f, int i3, boolean z, long j2, long j3, Jh jh3) {
        long j4 = j;
        int a2 = Nh.a(1, j) + 0 + Nh.a(2, Jh.a(str));
        int a3 = a(tjVar, thread, stackTraceElementArr, threadArr, list, i, jh, jh2, map, runningAppProcessInfo, i2);
        int e = a2 + Nh.e(3) + Nh.c(a3) + a3;
        int a4 = a(f, i3, z, i2, j2, j3);
        int e2 = e + Nh.e(5) + Nh.c(a4) + a4;
        if (jh3 == null) {
            return e2;
        }
        int a5 = a(jh3);
        return e2 + Nh.e(6) + Nh.c(a5) + a5;
    }

    private static int a(C1725tj tjVar, Thread thread, StackTraceElement[] stackTraceElementArr, Thread[] threadArr, List<StackTraceElement[]> list, int i, Jh jh, Jh jh2, Map<String, String> map, RunningAppProcessInfo runningAppProcessInfo, int i2) {
        int a2 = a(tjVar, thread, stackTraceElementArr, threadArr, list, i, jh, jh2);
        int e = Nh.e(1) + Nh.c(a2) + a2;
        boolean z = false;
        int i3 = e + 0;
        if (map != null) {
            for (Entry entry : map.entrySet()) {
                int a3 = a((String) entry.getKey(), (String) entry.getValue());
                i3 += Nh.e(2) + Nh.c(a3) + a3;
            }
        }
        if (runningAppProcessInfo != null) {
            if (runningAppProcessInfo.importance != 100) {
                z = true;
            }
            i3 += Nh.a(3, z);
        }
        return i3 + Nh.c(4, i2);
    }

    private static int a(C1725tj tjVar, Thread thread, StackTraceElement[] stackTraceElementArr, Thread[] threadArr, List<StackTraceElement[]> list, int i, Jh jh, Jh jh2) {
        int a2 = a(thread, stackTraceElementArr, 4, true);
        int e = Nh.e(1) + Nh.c(a2) + a2 + 0;
        int length = threadArr.length;
        int i2 = e;
        for (int i3 = 0; i3 < length; i3++) {
            int a3 = a(threadArr[i3], (StackTraceElement[]) list.get(i3), 0, false);
            i2 += Nh.e(1) + Nh.c(a3) + a3;
        }
        int a4 = a(tjVar, 1, i);
        int e2 = i2 + Nh.e(2) + Nh.c(a4) + a4;
        int a5 = a();
        int e3 = e2 + Nh.e(3) + Nh.c(a5) + a5;
        int a6 = a(jh, jh2);
        return e3 + Nh.e(3) + Nh.c(a6) + a6;
    }

    private static int a(String str, String str2) {
        int a2 = Nh.a(1, Jh.a(str));
        if (str2 == null) {
            str2 = "";
        }
        return a2 + Nh.a(2, Jh.a(str2));
    }

    private static int a(Float f, int i, boolean z, int i2, long j, long j2) {
        int i3 = 0;
        if (f != null) {
            i3 = 0 + Nh.a(1, f.floatValue());
        }
        return i3 + Nh.b(2, i) + Nh.a(3, z) + Nh.c(4, i2) + Nh.a(5, j) + Nh.a(6, j2);
    }

    private static int a(Jh jh) {
        return Nh.a(1, jh);
    }

    private static int a(C1725tj tjVar, int i, int i2) {
        int i3 = 0;
        int a2 = Nh.a(1, Jh.a(tjVar.b)) + 0;
        String str = tjVar.a;
        if (str != null) {
            a2 += Nh.a(3, Jh.a(str));
        }
        int i4 = a2;
        for (StackTraceElement a3 : tjVar.c) {
            int a4 = a(a3, true);
            i4 += Nh.e(4) + Nh.c(a4) + a4;
        }
        C1725tj tjVar2 = tjVar.d;
        if (tjVar2 == null) {
            return i4;
        }
        if (i < i2) {
            int a5 = a(tjVar2, i + 1, i2);
            return i4 + Nh.e(6) + Nh.c(a5) + a5;
        }
        while (tjVar2 != null) {
            tjVar2 = tjVar2.d;
            i3++;
        }
        return i4 + Nh.c(7, i3);
    }

    private static int a() {
        return Nh.a(1, a) + 0 + Nh.a(2, a) + Nh.a(3, 0);
    }

    private static int a(StackTraceElement stackTraceElement, boolean z) {
        int i;
        int i2 = 0;
        if (stackTraceElement.isNativeMethod()) {
            i = Nh.a(1, (long) Math.max(stackTraceElement.getLineNumber(), 0));
        } else {
            i = Nh.a(1, 0);
        }
        int i3 = i + 0;
        StringBuilder sb = new StringBuilder();
        sb.append(stackTraceElement.getClassName());
        sb.append(".");
        sb.append(stackTraceElement.getMethodName());
        int a2 = i3 + Nh.a(2, Jh.a(sb.toString()));
        if (stackTraceElement.getFileName() != null) {
            a2 += Nh.a(3, Jh.a(stackTraceElement.getFileName()));
        }
        if (!stackTraceElement.isNativeMethod() && stackTraceElement.getLineNumber() > 0) {
            a2 += Nh.a(4, (long) stackTraceElement.getLineNumber());
        }
        if (z) {
            i2 = 2;
        }
        return a2 + Nh.c(5, i2);
    }

    private static int a(Thread thread, StackTraceElement[] stackTraceElementArr, int i, boolean z) {
        int a2 = Nh.a(1, Jh.a(thread.getName())) + Nh.c(2, i);
        for (StackTraceElement a3 : stackTraceElementArr) {
            int a4 = a(a3, z);
            a2 += Nh.e(3) + Nh.c(a4) + a4;
        }
        return a2;
    }

    private static Jh a(String str) {
        if (str == null) {
            return null;
        }
        return Jh.a(str);
    }
}
