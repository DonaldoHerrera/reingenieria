package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: xua reason: default package and case insensitive filesystem */
/* compiled from: OperationDurationLogger */
class C7707xua extends a {
    private long c = -1;
    private long d = -1;
    final /* synthetic */ C5694cGa e;

    C7707xua(String str, C5694cGa cga) {
        this.e = cga;
        super(str);
    }

    public long a(TimeUnit timeUnit) {
        long j = this.c;
        if (j == -1) {
            return -1;
        }
        long j2 = this.d;
        if (j2 == -1) {
            return a.a(timeUnit, this.e.a() - this.c);
        }
        return a.a(timeUnit, j2 - j);
    }

    public void b() {
        if (this.c == -1) {
            this.c = this.e.a();
            return;
        }
        throw new IllegalStateException("Cannot start a measure if already stated.");
    }

    public void c() {
        if (this.d == -1) {
            this.d = this.e.a();
            return;
        }
        throw new IllegalStateException("Cannot stop a measure if already stopped.");
    }
}
