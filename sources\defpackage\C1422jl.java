package defpackage;

import android.os.SystemClock;

/* renamed from: jl reason: default package and case insensitive filesystem */
/* compiled from: AndroidSpringLooperFactory */
class C1422jl implements Runnable {
    final /* synthetic */ b a;

    C1422jl(b bVar) {
        this.a = bVar;
    }

    public void run() {
        if (this.a.d && this.a.a != null) {
            long uptimeMillis = SystemClock.uptimeMillis();
            b bVar = this.a;
            bVar.a.b((double) (uptimeMillis - bVar.e));
            this.a.e = uptimeMillis;
            this.a.b.post(this.a.c);
        }
    }
}
