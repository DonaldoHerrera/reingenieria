package com.evernote.android.job;

/* compiled from: WorkManagerAvailableHelper */
final class x {
    private static final boolean a;

    static {
        boolean z;
        try {
            Class.forName("androidx.work.r");
            z = true;
        } catch (Throwable unused) {
            z = false;
        }
        a = z;
    }

    public static boolean a() {
        return a;
    }
}
