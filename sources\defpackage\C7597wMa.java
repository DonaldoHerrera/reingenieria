package defpackage;

import android.util.Log;

/* renamed from: wMa reason: default package and case insensitive filesystem */
/* compiled from: Logger */
final class C7597wMa {
    private final boolean a;

    C7597wMa(boolean z) {
        this.a = z;
    }

    private void a(int i, String str, String str2) {
        if (this.a) {
            Log.println(i, str, str2);
        }
    }

    /* access modifiers changed from: 0000 */
    public void a(String str) {
        a(4, "dualcache", str);
    }

    /* access modifiers changed from: 0000 */
    public void a(Throwable th) {
        if (this.a) {
            Log.e("dualcache", "error : ", th);
        }
    }
}
