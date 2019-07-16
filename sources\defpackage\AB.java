package defpackage;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: AB reason: default package */
final class AB extends C1684sB {
    private final /* synthetic */ IBinder b;
    private final /* synthetic */ C1834xB c;

    AB(C1834xB xBVar, IBinder iBinder) {
        this.c = xBVar;
        this.b = iBinder;
    }

    public final void a() {
        C1654rB rBVar = this.c.a;
        rBVar.l = (IInterface) rBVar.h.a(this.b);
        this.c.a.e();
        this.c.a.f = false;
        for (Runnable run : this.c.a.e) {
            run.run();
        }
        this.c.a.e.clear();
    }
}
