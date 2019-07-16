package com.evernote.android.job;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.os.PowerManager.WakeLock;
import android.util.LruCache;
import android.util.SparseArray;
import com.evernote.android.job.c.b;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* compiled from: JobExecutor */
class j {
    /* access modifiers changed from: private */
    public static final Dj a = new Dj("JobExecutor");
    /* access modifiers changed from: private */
    public static final long b = TimeUnit.MINUTES.toMillis(3);
    private final SparseArray<c> c = new SparseArray<>();
    private final LruCache<Integer, WeakReference<c>> d = new LruCache<>(20);
    private final SparseArray<b> e = new SparseArray<>();
    private final Set<s> f = new HashSet();

    /* compiled from: JobExecutor */
    private final class a implements Callable<b> {
        private final c a;
        private final WakeLock b;

        private b a() {
            try {
                b n = this.a.n();
                j.a.c("Finished %s", this.a);
                a(this.a, n);
                return n;
            } catch (Throwable th) {
                j.a.a(th, "Crashed %s", this.a);
                return this.a.e();
            }
        }

        private a(c cVar) {
            this.a = cVar;
            this.b = w.a(this.a.b(), "JobExecutor", j.b);
        }

        public b call() throws Exception {
            String str = "Wake lock was not held after job %s was done. The job took too long to complete. This could have unintended side effects on your app.";
            try {
                w.a(this.a.b(), this.b, j.b);
                return a();
            } finally {
                j.this.a(this.a);
                WakeLock wakeLock = this.b;
                if (wakeLock == null || !wakeLock.isHeld()) {
                    j.a.d(str, this.a);
                }
                w.a(this.b);
            }
        }

        private void a(c cVar, b bVar) {
            s b2 = this.a.d().b();
            boolean z = false;
            boolean z2 = true;
            if (!b2.u() && b.RESCHEDULE.equals(bVar) && !cVar.f()) {
                b2 = b2.a(true, true);
                this.a.a(b2.k());
            } else if (!b2.u()) {
                z2 = false;
            } else if (!b.SUCCESS.equals(bVar)) {
                z = true;
            }
            if (cVar.f()) {
                return;
            }
            if (z || z2) {
                b2.b(z, z2);
            }
        }
    }

    public synchronized Set<c> c() {
        return a((String) null);
    }

    public synchronized Future<b> a(Context context, s sVar, c cVar, Bundle bundle) {
        this.f.remove(sVar);
        if (cVar == null) {
            a.d("JobCreator returned null for tag %s", sVar.p());
            return null;
        } else if (!cVar.g()) {
            cVar.a(context).a(sVar, bundle);
            a.c("Executing %s, context %s", sVar, context.getClass().getSimpleName());
            this.c.put(sVar.k(), cVar);
            return g.b().submit(new a(cVar));
        } else {
            throw new IllegalStateException(String.format(Locale.ENGLISH, "Job for tag %s was already run, a creator should always create a new Job instance", new Object[]{sVar.p()}));
        }
    }

    public synchronized void b(s sVar) {
        this.f.add(sVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0024, code lost:
        return r2 != null ? (com.evernote.android.job.c) r2.get() : null;
     */
    public synchronized c a(int i) {
        c cVar = (c) this.c.get(i);
        if (cVar != null) {
            return cVar;
        }
        WeakReference weakReference = (WeakReference) this.d.get(Integer.valueOf(i));
    }

    public synchronized Set<c> a(String str) {
        HashSet hashSet;
        hashSet = new HashSet();
        for (int i = 0; i < this.c.size(); i++) {
            c cVar = (c) this.c.valueAt(i);
            if (str == null || str.equals(cVar.d().c())) {
                hashSet.add(cVar);
            }
        }
        for (WeakReference weakReference : this.d.snapshot().values()) {
            c cVar2 = (c) weakReference.get();
            if (cVar2 != null) {
                if (str == null || str.equals(cVar2.d().c())) {
                    hashSet.add(cVar2);
                }
            }
        }
        return hashSet;
    }

    public synchronized boolean a(s sVar) {
        boolean z;
        if (sVar != null) {
            if (this.f.contains(sVar)) {
                z = true;
            }
        }
        z = false;
        return z;
    }

    /* access modifiers changed from: 0000 */
    public synchronized void a(c cVar) {
        int a2 = cVar.d().a();
        this.c.remove(a2);
        a(this.d);
        this.e.put(a2, cVar.e());
        this.d.put(Integer.valueOf(a2), new WeakReference(cVar));
    }

    /* access modifiers changed from: 0000 */
    @SuppressLint({"UseSparseArrays"})
    public void a(LruCache<Integer, WeakReference<c>> lruCache) {
        HashMap hashMap = new HashMap(lruCache.snapshot());
        for (Integer num : hashMap.keySet()) {
            if (hashMap.get(num) == null || ((WeakReference) hashMap.get(num)).get() == null) {
                lruCache.remove(num);
            }
        }
    }
}
