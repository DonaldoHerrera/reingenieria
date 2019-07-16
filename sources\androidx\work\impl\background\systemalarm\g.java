package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager.WakeLock;
import android.text.TextUtils;
import androidx.work.i;
import androidx.work.impl.m;
import androidx.work.impl.utils.n;
import java.util.ArrayList;
import java.util.List;

/* compiled from: SystemAlarmDispatcher */
public class g implements androidx.work.impl.a {
    static final String a = i.a("SystemAlarmDispatcher");
    final Context b;
    private final C1811wf c;
    private final j d;
    private final androidx.work.impl.c e;
    private final m f;
    final b g;
    private final Handler h;
    final List<Intent> i;
    Intent j;
    private b k;

    /* compiled from: SystemAlarmDispatcher */
    static class a implements Runnable {
        private final g a;
        private final Intent b;
        private final int c;

        a(g gVar, Intent intent, int i) {
            this.a = gVar;
            this.b = intent;
            this.c = i;
        }

        public void run() {
            this.a.a(this.b, this.c);
        }
    }

    /* compiled from: SystemAlarmDispatcher */
    interface b {
        void a();
    }

    /* compiled from: SystemAlarmDispatcher */
    static class c implements Runnable {
        private final g a;

        c(g gVar) {
            this.a = gVar;
        }

        public void run() {
            this.a.a();
        }
    }

    g(Context context) {
        this(context, null, null);
    }

    private void g() {
        if (this.h.getLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Needs to be invoked on the main thread.");
        }
    }

    private void h() {
        g();
        WakeLock a2 = n.a(this.b, "ProcessCommand");
        try {
            a2.acquire();
            this.f.h().a(new f(this));
        } finally {
            a2.release();
        }
    }

    public void a(String str, boolean z) {
        a((Runnable) new a(this, b.a(this.b, str, z), 0));
    }

    /* access modifiers changed from: 0000 */
    public androidx.work.impl.c b() {
        return this.e;
    }

    /* access modifiers changed from: 0000 */
    public C1811wf c() {
        return this.c;
    }

    /* access modifiers changed from: 0000 */
    public m d() {
        return this.f;
    }

    /* access modifiers changed from: 0000 */
    public j e() {
        return this.d;
    }

    /* access modifiers changed from: 0000 */
    public void f() {
        i.a().a(a, "Destroying SystemAlarmDispatcher", new Throwable[0]);
        this.e.b((androidx.work.impl.a) this);
        this.d.a();
        this.k = null;
    }

    g(Context context, androidx.work.impl.c cVar, m mVar) {
        this.b = context.getApplicationContext();
        this.g = new b(this.b);
        this.d = new j();
        if (mVar == null) {
            mVar = m.a(context);
        }
        this.f = mVar;
        if (cVar == null) {
            cVar = this.f.e();
        }
        this.e = cVar;
        this.c = this.f.h();
        this.e.a((androidx.work.impl.a) this);
        this.i = new ArrayList();
        this.j = null;
        this.h = new Handler(Looper.getMainLooper());
    }

    public boolean a(Intent intent, int i2) {
        boolean z = false;
        i.a().a(a, String.format("Adding command %s (%s)", new Object[]{intent, Integer.valueOf(i2)}), new Throwable[0]);
        g();
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            i.a().e(a, "Unknown command. Ignoring", new Throwable[0]);
            return false;
        } else if ("ACTION_CONSTRAINTS_CHANGED".equals(action) && a("ACTION_CONSTRAINTS_CHANGED")) {
            return false;
        } else {
            intent.putExtra("KEY_START_ID", i2);
            synchronized (this.i) {
                if (!this.i.isEmpty()) {
                    z = true;
                }
                this.i.add(intent);
                if (!z) {
                    h();
                }
            }
            return true;
        }
    }

    /* access modifiers changed from: 0000 */
    public void a(b bVar) {
        if (this.k != null) {
            i.a().b(a, "A completion listener for SystemAlarmDispatcher already exists.", new Throwable[0]);
            return;
        }
        this.k = bVar;
    }

    /* access modifiers changed from: 0000 */
    public void a(Runnable runnable) {
        this.h.post(runnable);
    }

    /* access modifiers changed from: 0000 */
    public void a() {
        i.a().a(a, "Checking if commands are complete.", new Throwable[0]);
        g();
        synchronized (this.i) {
            if (this.j != null) {
                i.a().a(a, String.format("Removing command %s", new Object[]{this.j}), new Throwable[0]);
                if (((Intent) this.i.remove(0)).equals(this.j)) {
                    this.j = null;
                } else {
                    throw new IllegalStateException("Dequeue-d command is not the first.");
                }
            }
            if (!this.g.a() && this.i.isEmpty()) {
                i.a().a(a, "No more commands & intents.", new Throwable[0]);
                if (this.k != null) {
                    this.k.a();
                }
            } else if (!this.i.isEmpty()) {
                h();
            }
        }
    }

    private boolean a(String str) {
        g();
        synchronized (this.i) {
            for (Intent action : this.i) {
                if (str.equals(action.getAction())) {
                    return true;
                }
            }
            return false;
        }
    }
}
