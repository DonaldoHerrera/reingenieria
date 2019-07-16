package com.soundcloud.android.sync;

import android.content.Intent;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Callable;

@EVa(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u0000 ,2\u00020\u0001:\u0001,B9\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\b\u0001\u0010\t\u001a\u00020\n\u0012\b\b\u0001\u0010\u000b\u001a\u00020\n¢\u0006\u0002\u0010\fJ\u0018\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u0011H\u0012J\u0010\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0015H\u0012J\b\u0010\u001b\u001a\u00020\u0017H\u0012J\b\u0010\u001c\u001a\u00020\u0017H\u0012J\b\u0010\u001d\u001a\u00020\u001eH\u0012J\u0010\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020!H\u0012J\u0010\u0010\"\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020!H\u0012J\u0010\u0010#\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0011H\u0012J\u0015\u0010$\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0011H\u0011¢\u0006\u0002\b%J\u0010\u0010&\u001a\u00020\u00172\u0006\u0010 \u001a\u00020!H\u0012J\u0015\u0010'\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020!H\u0011¢\u0006\u0002\b(J\u0010\u0010)\u001a\u00020\u00172\u0006\u0010 \u001a\u00020!H\u0016J\u0012\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00110+*\u00020\u0011H\u0012R\u000e\u0010\r\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0013X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0013X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000¨\u0006-"}, d2 = {"Lcom/soundcloud/android/sync/SyncController;", "", "syncIntentRequestFactory", "Lcom/soundcloud/android/sync/SyncRequestFactory;", "syncStateStorage", "Ldagger/Lazy;", "Lcom/soundcloud/android/sync/SyncStateStorage;", "unauthorisedRequestRegistry", "Lcom/soundcloud/android/api/UnauthorisedRequestRegistry;", "syncerScheduler", "Lio/reactivex/Scheduler;", "coordinatorScheduler", "(Lcom/soundcloud/android/sync/SyncRequestFactory;Ldagger/Lazy;Lcom/soundcloud/android/api/UnauthorisedRequestRegistry;Lio/reactivex/Scheduler;Lio/reactivex/Scheduler;)V", "activeTaskCount", "", "pendingJobs", "Ljava/util/LinkedList;", "Lcom/soundcloud/android/sync/SyncJob;", "runningJobs", "", "syncRequests", "Lcom/soundcloud/android/sync/SyncRequest;", "addItemToPendingRequests", "", "syncRequest", "syncJob", "enqueueRequest", "finishAllRequests", "flushSyncRequests", "isAuthTokenValid", "", "isUiRequest", "intent", "Landroid/content/Intent;", "isUiRequestExtraDefined", "moveRequestToTop", "onSyncJobCompleted", "onSyncJobCompleted$base_release", "performStartSync", "shouldEnqueueJobs", "shouldEnqueueJobs$base_release", "startSync", "createSingle", "Lio/reactivex/Single;", "Companion", "base_release"}, mv = {1, 1, 15})
/* compiled from: SyncController.kt */
public class K {
    public static final a a = new a(null);
    private final LinkedList<W> b = new LinkedList<>();
    private final List<W> c = new ArrayList();
    private final List<ea> d = new ArrayList();
    /* access modifiers changed from: private */
    public int e;
    private final ga f;
    private final C4806CMa<la> g;
    private final C3218qP h;
    private final HPa i;
    private final HPa j;

    /* compiled from: SyncController.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }
    }

    public K(ga gaVar, C4806CMa<la> cMa, C3218qP qPVar, HPa hPa, @com.soundcloud.android.sync.ja.a HPa hPa2) {
        C7471uYa.b(gaVar, "syncIntentRequestFactory");
        C7471uYa.b(cMa, "syncStateStorage");
        C7471uYa.b(qPVar, "unauthorisedRequestRegistry");
        C7471uYa.b(hPa, "syncerScheduler");
        C7471uYa.b(hPa2, "coordinatorScheduler");
        this.f = gaVar;
        this.g = cMa;
        this.h = qPVar;
        this.i = hPa;
        this.j = hPa2;
    }

    private boolean c(Intent intent) {
        return intent.getBooleanExtra("com.soundcloud.android.sync.extra.IS_UI_REQUEST", false);
    }

    private boolean d(Intent intent) {
        Bundle extras = intent.getExtras();
        return extras != null && extras.containsKey("com.soundcloud.android.sync.extra.IS_UI_REQUEST");
    }

    /* access modifiers changed from: private */
    public void e(Intent intent) {
        b a2 = SDb.a("SyncController");
        StringBuilder sb = new StringBuilder();
        sb.append("startListening(");
        sb.append(intent);
        sb.append(')');
        a2.a(sb.toString(), new Object[0]);
        ea a3 = this.f.a(intent);
        List<ea> list = this.d;
        C7471uYa.a((Object) a3, "syncRequest");
        list.add(a3);
        if (a(intent)) {
            a(a3);
        }
        b();
    }

    public void b(Intent intent) {
        C7471uYa.b(intent, "intent");
        C6979nPa.b((C6368eQa) new P(this, intent)).b(this.j).c((C6368eQa) Q.a);
    }

    private boolean c() {
        return !this.h.b().booleanValue();
    }

    private void c(W w) {
        SDb.a("SyncController").a("Moving sync job to front of queue : %s", w);
        LinkedList<W> linkedList = this.b;
        Object obj = linkedList.get(linkedList.indexOf(w));
        C7471uYa.a(obj, "pendingJobs[pendingJobs.indexOf(syncJob)]");
        W w2 = (W) obj;
        this.b.remove(w2);
        this.b.addFirst(w2);
    }

    private void b() {
        if (!this.b.isEmpty() || !this.c.isEmpty()) {
            while (this.e < 5 && !this.b.isEmpty()) {
                W w = (W) this.b.poll();
                List<W> list = this.c;
                C7471uYa.a((Object) w, "syncJob");
                list.add(w);
                b(w).b(this.i).a(this.j).d((C6776kQa<? super T>) new O<Object>(this));
            }
            return;
        }
        a();
    }

    public boolean a(Intent intent) {
        C7471uYa.b(intent, "intent");
        return !d(intent) || c(intent) || c();
    }

    private void a(ea eaVar) {
        for (W w : eaVar.b()) {
            if (!this.c.contains(w)) {
                String str = "syncJob";
                if (!this.b.contains(w)) {
                    C7471uYa.a((Object) w, str);
                    a(eaVar, w);
                    w.c();
                } else if (eaVar.c()) {
                    C7471uYa.a((Object) w, str);
                    c(w);
                }
            } else {
                b a2 = SDb.a("SyncController");
                StringBuilder sb = new StringBuilder();
                sb.append("Job already running for : ");
                sb.append(w);
                a2.a(sb.toString(), new Object[0]);
            }
        }
    }

    private IPa<W> b(W w) {
        IPa<W> a2 = IPa.c((Callable<? extends T>) new L<Object>(w)).b((C6776kQa<? super VPa>) new M<Object>(this)).a((C6436fQa<? super T, ? super Throwable>) new N<Object,Object>(this));
        C7471uYa.a((Object) a2, "Single.fromCallable {\n  … _ -> activeTaskCount-- }");
        return a2;
    }

    private void a(ea eaVar, W w) {
        b a2 = SDb.a("SyncController");
        StringBuilder sb = new StringBuilder();
        sb.append("Adding sync job to queue : ");
        sb.append(w);
        a2.a(sb.toString(), new Object[0]);
        if (eaVar.c()) {
            this.b.add(0, w);
        } else {
            this.b.add(w);
        }
    }

    private void a() {
        for (ea a2 : this.d) {
            a2.a();
        }
    }

    public void a(W w) {
        C7471uYa.b(w, "syncJob");
        b a2 = SDb.a("SyncController");
        StringBuilder sb = new StringBuilder();
        sb.append("Sync Complete: ");
        sb.append(w);
        a2.a(sb.toString(), new Object[0]);
        C4928GKa b2 = w.b();
        C7471uYa.a((Object) b2, "syncable");
        if (b2.c() && w.e()) {
            ((la) this.g.get()).f((na) b2.b());
        }
        Iterator it = new ArrayList(this.d).iterator();
        while (it.hasNext()) {
            ea eaVar = (ea) it.next();
            if (eaVar.b(w)) {
                eaVar.a(w);
                C7471uYa.a((Object) eaVar, "syncRequest");
                if (eaVar.d()) {
                    eaVar.a();
                    this.d.remove(eaVar);
                }
            }
        }
        this.c.remove(w);
        b();
    }
}
