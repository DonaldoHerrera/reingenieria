package defpackage;

import android.app.Activity;
import android.os.Bundle;

/* renamed from: ch reason: default package and case insensitive filesystem */
/* compiled from: AnswersLifecycleCallbacks */
class C0523ch extends b {
    private final C1873yh a;
    private final C1357hh b;

    public C0523ch(C1873yh yhVar, C1357hh hhVar) {
        this.a = yhVar;
        this.b = hhVar;
    }

    public void a(Activity activity) {
    }

    public void a(Activity activity, Bundle bundle) {
    }

    public void b(Activity activity) {
        this.a.a(activity, b.PAUSE);
        this.b.a();
    }

    public void b(Activity activity, Bundle bundle) {
    }

    public void c(Activity activity) {
        this.a.a(activity, b.RESUME);
        this.b.b();
    }

    public void d(Activity activity) {
        this.a.a(activity, b.START);
    }

    public void e(Activity activity) {
        this.a.a(activity, b.STOP);
    }
}
