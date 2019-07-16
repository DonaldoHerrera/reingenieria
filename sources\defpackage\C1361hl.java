package defpackage;

import android.os.SystemClock;
import android.view.Choreographer.FrameCallback;

/* renamed from: hl reason: default package and case insensitive filesystem */
/* compiled from: AndroidSpringLooperFactory */
class C1361hl implements FrameCallback {
    final /* synthetic */ a a;

    C1361hl(a aVar) {
        this.a = aVar;
    }

    public void doFrame(long j) {
        if (this.a.d && this.a.a != null) {
            long uptimeMillis = SystemClock.uptimeMillis();
            a aVar = this.a;
            aVar.a.b((double) (uptimeMillis - aVar.e));
            this.a.e = uptimeMillis;
            this.a.b.postFrameCallback(this.a.c);
        }
    }
}
