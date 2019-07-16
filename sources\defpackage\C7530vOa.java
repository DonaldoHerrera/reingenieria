package defpackage;

import android.content.Context;

/* renamed from: vOa reason: default package and case insensitive filesystem */
/* compiled from: TimeBasedFileRollOverRunnable */
public class C7530vOa implements Runnable {
    private final Context a;
    private final C7254rOa b;

    public C7530vOa(Context context, C7254rOa roa) {
        this.a = context;
        this.b = roa;
    }

    public void run() {
        try {
            C7391tNa.c(this.a, "Performing time based file roll over.");
            if (!this.b.a()) {
                this.b.b();
            }
        } catch (Exception e) {
            C7391tNa.a(this.a, "Failed to roll over file", (Throwable) e);
        }
    }
}
