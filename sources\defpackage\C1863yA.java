package defpackage;

import android.util.Log;
import java.util.List;

/* renamed from: yA reason: default package and case insensitive filesystem */
final class C1863yA implements Runnable {
    private final /* synthetic */ List a;
    private final /* synthetic */ HB b;
    private final /* synthetic */ C1803wA c;

    C1863yA(C1803wA wAVar, List list, HB hb) {
        this.c = wAVar;
        this.a = list;
        this.b = hb;
    }

    public final void run() {
        try {
            if (this.c.c.a(this.a)) {
                this.c.a(this.b);
            } else {
                this.c.b(this.a, this.b);
            }
        } catch (Exception e) {
            Log.e("SplitCompat", "Error checking verified files.", e);
            this.b.a(-11);
        }
    }
}
