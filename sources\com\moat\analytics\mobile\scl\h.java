package com.moat.analytics.mobile.scl;

import android.content.Context;
import android.content.Intent;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

class h {
    private static final h a = new h();
    /* access modifiers changed from: private */
    public final Map<i, String> b = new WeakHashMap();
    /* access modifiers changed from: private */
    public final Map<b, String> c = new WeakHashMap();
    private final ScheduledExecutorService d = Executors.newScheduledThreadPool(1);
    /* access modifiers changed from: private */
    public ScheduledFuture<?> e;
    /* access modifiers changed from: private */
    public ScheduledFuture<?> f;

    private h() {
    }

    static h a() {
        return a;
    }

    private void a(final Context context) {
        ScheduledFuture<?> scheduledFuture = this.f;
        if (scheduledFuture == null || scheduledFuture.isDone()) {
            n.a(3, "JSUpdateLooper", (Object) this, "Starting metadata reporting loop");
            this.f = this.d.scheduleWithFixedDelay(new Runnable() {
                public void run() {
                    try {
                        C1600pd.a(context.getApplicationContext()).a(new Intent("UPDATE_METADATA"));
                        if (h.this.b.isEmpty()) {
                            h.this.f.cancel(true);
                        }
                    } catch (Exception e) {
                        l.a(e);
                    }
                }
            }, 0, 50, TimeUnit.MILLISECONDS);
        }
    }

    private void b(final Context context) {
        ScheduledFuture<?> scheduledFuture = this.e;
        if (scheduledFuture == null || scheduledFuture.isDone()) {
            n.a(3, "JSUpdateLooper", (Object) this, "Starting view update loop");
            this.e = this.d.scheduleWithFixedDelay(new Runnable() {
                public void run() {
                    try {
                        C1600pd.a(context.getApplicationContext()).a(new Intent("UPDATE_VIEW_INFO"));
                        if (h.this.c.isEmpty()) {
                            n.a(3, "JSUpdateLooper", (Object) h.this, "No more active trackers");
                            h.this.e.cancel(true);
                        }
                    } catch (Exception e) {
                        l.a(e);
                    }
                }
            }, 0, (long) u.d().c(), TimeUnit.MILLISECONDS);
        }
    }

    /* access modifiers changed from: 0000 */
    public void a(Context context, b bVar) {
        if (bVar != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("addActiveTracker");
            sb.append(bVar.hashCode());
            n.a(3, "JSUpdateLooper", (Object) this, sb.toString());
            Map<b, String> map = this.c;
            if (map != null && !map.containsKey(bVar)) {
                this.c.put(bVar, "");
                b(context);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public void a(Context context, i iVar) {
        Map<i, String> map = this.b;
        if (map != null && iVar != null) {
            map.put(iVar, "");
            a(context);
        }
    }

    /* access modifiers changed from: 0000 */
    public void a(b bVar) {
        if (bVar != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("removeActiveTracker");
            sb.append(bVar.hashCode());
            n.a(3, "JSUpdateLooper", (Object) this, sb.toString());
            Map<b, String> map = this.c;
            if (map != null) {
                map.remove(bVar);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public void a(i iVar) {
        if (iVar != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("removeSetupNeededBridge");
            sb.append(iVar.hashCode());
            n.a(3, "JSUpdateLooper", (Object) this, sb.toString());
            Map<i, String> map = this.b;
            if (map != null) {
                map.remove(iVar);
            }
        }
    }
}
