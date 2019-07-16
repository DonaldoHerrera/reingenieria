package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder.DeathRecipient;
import android.os.IInterface;
import android.os.RemoteException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: rB reason: default package and case insensitive filesystem */
public final class C1654rB<T extends IInterface> {
    private static final Map<String, Handler> a = Collections.synchronizedMap(new HashMap());
    /* access modifiers changed from: private */
    public final Context b;
    /* access modifiers changed from: private */
    public final C1893zA c;
    private final String d;
    /* access modifiers changed from: private */
    public final List<C1684sB> e = new ArrayList();
    /* access modifiers changed from: private */
    public boolean f;
    private final Intent g;
    /* access modifiers changed from: private */
    public final C1864yB<T> h;
    private final WeakReference<C1774vB> i;
    private final DeathRecipient j = new C1744uB(this);
    /* access modifiers changed from: private */
    public ServiceConnection k;
    /* access modifiers changed from: private */
    public T l;

    public C1654rB(Context context, C1893zA zAVar, String str, Intent intent, C1864yB<T> yBVar, C1774vB vBVar) {
        this.b = context;
        this.c = zAVar;
        this.d = str;
        this.g = intent;
        this.h = yBVar;
        this.i = new WeakReference<>(vBVar);
    }

    /* access modifiers changed from: private */
    public final void b(C1684sB sBVar) {
        if (this.l == null && !this.f) {
            this.c.a("Initiate binding to the service.", new Object[0]);
            this.e.add(sBVar);
            this.k = new C1834xB(this, 0);
            this.f = true;
            if (!this.b.bindService(this.g, this.k, 1)) {
                this.c.a("Failed to bind to the service.", new Object[0]);
                this.f = false;
                for (C1684sB b2 : this.e) {
                    YB b3 = b2.b();
                    if (b3 != null) {
                        b3.a((Exception) new C1773vA());
                    }
                }
                this.e.clear();
            }
        } else if (this.f) {
            this.c.a("Waiting to bind to the service.", new Object[0]);
            this.e.add(sBVar);
        } else {
            sBVar.run();
        }
    }

    /* access modifiers changed from: private */
    public final void c(C1684sB sBVar) {
        d().post(sBVar);
    }

    private final Handler d() {
        Handler handler;
        synchronized (a) {
            if (!a.containsKey(this.d)) {
                HandlerThread handlerThread = new HandlerThread(this.d, 10);
                handlerThread.start();
                a.put(this.d, new Handler(handlerThread.getLooper()));
            }
            handler = (Handler) a.get(this.d);
        }
        return handler;
    }

    /* access modifiers changed from: private */
    public final void e() {
        this.c.a("linkToDeath", new Object[0]);
        try {
            this.l.asBinder().linkToDeath(this.j, 0);
        } catch (RemoteException e2) {
            this.c.a((Throwable) e2, "linkToDeath failed", new Object[0]);
        }
    }

    /* access modifiers changed from: private */
    public final void f() {
        this.c.a("unlinkToDeath", new Object[0]);
        this.l.asBinder().unlinkToDeath(this.j, 0);
    }

    public final void a() {
        c((C1684sB) new C1804wB(this));
    }

    public final void a(C1684sB sBVar) {
        c((C1684sB) new C1714tB(this, sBVar));
    }

    public final T b() {
        return this.l;
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ void c() {
        this.c.a("reportBinderDeath", new Object[0]);
        C1774vB vBVar = (C1774vB) this.i.get();
        if (vBVar != null) {
            this.c.a("calling onBinderDied", new Object[0]);
            vBVar.a();
        }
    }
}
