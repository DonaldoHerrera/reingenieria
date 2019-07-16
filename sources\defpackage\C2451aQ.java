package defpackage;

import com.crashlytics.android.a;

/* renamed from: aQ reason: default package and case insensitive filesystem */
/* compiled from: Logging.kt */
public final class C2451aQ extends b {
    /* access modifiers changed from: protected */
    public void a(int i, String str, String str2, Throwable th) {
        C7471uYa.b(str2, "message");
        if (C5328TMa.h()) {
            a.a(i, str, str2);
            if (th != null) {
                new a().a(th);
            }
        }
    }

    /* access modifiers changed from: protected */
    public boolean a(String str, int i) {
        return i >= 4;
    }
}
