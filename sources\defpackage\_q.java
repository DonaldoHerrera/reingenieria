package defpackage;

import android.annotation.TargetApi;
import android.os.Trace;

/* renamed from: _q reason: default package */
/* compiled from: TraceUtil */
public final class _q {
    public static void a(String str) {
        if (C0471ar.a >= 18) {
            b(str);
        }
    }

    @TargetApi(18)
    private static void b(String str) {
        Trace.beginSection(str);
    }

    @TargetApi(18)
    private static void b() {
        Trace.endSection();
    }

    public static void a() {
        if (C0471ar.a >= 18) {
            b();
        }
    }
}
