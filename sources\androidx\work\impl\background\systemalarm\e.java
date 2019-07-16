package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager.WakeLock;
import androidx.work.i;
import androidx.work.impl.a;
import androidx.work.impl.utils.n;
import java.util.Collections;
import java.util.List;

/* compiled from: DelayMetCommandHandler */
public class e implements C1720te, a, a {
    private static final String a = i.a("DelayMetCommandHandler");
    private final Context b;
    private final int c;
    private final String d;
    private final g e;
    private final C1750ue f;
    private final Object g = new Object();
    private int h = 0;
    private WakeLock i;
    private boolean j = false;

    e(Context context, int i2, String str, g gVar) {
        this.b = context;
        this.c = i2;
        this.e = gVar;
        this.d = str;
        this.f = new C1750ue(this.b, gVar.c(), this);
    }

    private void c() {
        synchronized (this.g) {
            if (this.h < 2) {
                this.h = 2;
                i.a().a(a, String.format("Stopping work for WorkSpec %s", new Object[]{this.d}), new Throwable[0]);
                this.e.a((Runnable) new a(this.e, b.c(this.b, this.d), this.c));
                if (this.e.b().b(this.d)) {
                    i.a().a(a, String.format("WorkSpec %s needs to be rescheduled", new Object[]{this.d}), new Throwable[0]);
                    this.e.a((Runnable) new a(this.e, b.b(this.b, this.d), this.c));
                } else {
                    i.a().a(a, String.format("Processor does not have WorkSpec %s. No need to reschedule ", new Object[]{this.d}), new Throwable[0]);
                }
            } else {
                i.a().a(a, String.format("Already stopped work for %s", new Object[]{this.d}), new Throwable[0]);
            }
        }
    }

    public void a(String str, boolean z) {
        i.a().a(a, String.format("onExecuted %s, %s", new Object[]{str, Boolean.valueOf(z)}), new Throwable[0]);
        b();
        if (z) {
            Intent b2 = b.b(this.b, this.d);
            g gVar = this.e;
            gVar.a((Runnable) new a(gVar, b2, this.c));
        }
        if (this.j) {
            Intent a2 = b.a(this.b);
            g gVar2 = this.e;
            gVar2.a((Runnable) new a(gVar2, a2, this.c));
        }
    }

    public void b(List<String> list) {
        if (list.contains(this.d)) {
            synchronized (this.g) {
                if (this.h == 0) {
                    this.h = 1;
                    i.a().a(a, String.format("onAllConstraintsMet for %s", new Object[]{this.d}), new Throwable[0]);
                    if (this.e.b().c(this.d)) {
                        this.e.e().a(this.d, 600000, this);
                    } else {
                        b();
                    }
                } else {
                    i.a().a(a, String.format("Already started work for %s", new Object[]{this.d}), new Throwable[0]);
                }
            }
        }
    }

    public void a(String str) {
        i.a().a(a, String.format("Exceeded time limits on execution for %s", new Object[]{str}), new Throwable[0]);
        c();
    }

    private void b() {
        synchronized (this.g) {
            this.f.a();
            this.e.e().a(this.d);
            if (this.i != null && this.i.isHeld()) {
                i.a().a(a, String.format("Releasing wakelock %s for WorkSpec %s", new Object[]{this.i, this.d}), new Throwable[0]);
                this.i.release();
            }
        }
    }

    public void a(List<String> list) {
        c();
    }

    /* access modifiers changed from: 0000 */
    public void a() {
        this.i = n.a(this.b, String.format("%s (%s)", new Object[]{this.d, Integer.valueOf(this.c)}));
        i.a().a(a, String.format("Acquiring wakelock %s for WorkSpec %s", new Object[]{this.i, this.d}), new Throwable[0]);
        this.i.acquire();
        _e c2 = this.e.d().g().t().c(this.d);
        if (c2 == null) {
            c();
            return;
        }
        this.j = c2.b();
        if (!this.j) {
            i.a().a(a, String.format("No constraints for %s", new Object[]{this.d}), new Throwable[0]);
            b(Collections.singletonList(this.d));
        } else {
            this.f.c(Collections.singletonList(c2));
        }
    }
}
