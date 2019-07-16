package com.google.android.gms.cast.framework.media;

import android.os.Handler;
import android.os.Looper;
import android.util.LruCache;
import android.util.SparseIntArray;
import com.google.android.gms.cast.MediaQueueItem;
import com.google.android.gms.cast.MediaStatus;
import com.google.android.gms.cast.framework.C0635c;
import com.google.android.gms.cast.framework.C0636d;
import com.google.android.gms.cast.framework.C0667t;
import com.google.android.gms.cast.framework.r;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.cast.C0710ia;
import com.google.android.gms.internal.cast.Ca;
import com.google.android.gms.internal.cast.X;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Deque;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TimerTask;

/* renamed from: com.google.android.gms.cast.framework.media.b reason: case insensitive filesystem */
public class C0647b {
    /* access modifiers changed from: private */
    public final C0710ia a;
    long b;
    /* access modifiers changed from: private */
    public final C0650e c;
    private boolean d;
    List<Integer> e;
    final SparseIntArray f;
    LruCache<Integer, MediaQueueItem> g;
    final List<Integer> h;
    final Deque<Integer> i;
    private final int j;
    private final Handler k;
    private TimerTask l;
    PendingResult<com.google.android.gms.cast.framework.media.C0650e.c> m;
    PendingResult<com.google.android.gms.cast.framework.media.C0650e.c> n;
    private ResultCallback<com.google.android.gms.cast.framework.media.C0650e.c> o;
    private ResultCallback<com.google.android.gms.cast.framework.media.C0650e.c> p;
    private d q;
    private C0667t<C0636d> r;
    private Set<a> s;

    /* renamed from: com.google.android.gms.cast.framework.media.b$a */
    public static abstract class a {
        public void a() {
        }

        public void a(int i, int i2) {
        }

        public void a(int[] iArr) {
        }

        public void b() {
        }

        public void b(int[] iArr) {
        }

        public void c() {
        }
    }

    /* renamed from: com.google.android.gms.cast.framework.media.b$b reason: collision with other inner class name */
    private class C0041b implements ResultCallback<com.google.android.gms.cast.framework.media.C0650e.c> {
        private C0041b() {
        }

        public final /* synthetic */ void onResult(Result result) {
            Status status = ((com.google.android.gms.cast.framework.media.C0650e.c) result).getStatus();
            int statusCode = status.getStatusCode();
            if (statusCode != 0) {
                C0647b.this.a.d(String.format("Error fetching queue items, statusCode=%s, statusMessage=%s", new Object[]{Integer.valueOf(statusCode), status.getStatusMessage()}), new Object[0]);
            }
            C0647b bVar = C0647b.this;
            bVar.m = null;
            if (!bVar.i.isEmpty()) {
                C0647b.this.c();
            }
        }

        /* synthetic */ C0041b(C0647b bVar, I i) {
            this();
        }
    }

    /* renamed from: com.google.android.gms.cast.framework.media.b$c */
    private class c implements ResultCallback<com.google.android.gms.cast.framework.media.C0650e.c> {
        private c() {
        }

        public final /* synthetic */ void onResult(Result result) {
            Status status = ((com.google.android.gms.cast.framework.media.C0650e.c) result).getStatus();
            int statusCode = status.getStatusCode();
            if (statusCode != 0) {
                C0647b.this.a.d(String.format("Error fetching queue item ids, statusCode=%s, statusMessage=%s", new Object[]{Integer.valueOf(statusCode), status.getStatusMessage()}), new Object[0]);
            }
            C0647b bVar = C0647b.this;
            bVar.n = null;
            if (!bVar.i.isEmpty()) {
                C0647b.this.c();
            }
        }

        /* synthetic */ c(C0647b bVar, I i) {
            this();
        }
    }

    /* renamed from: com.google.android.gms.cast.framework.media.b$d */
    public class d extends com.google.android.gms.cast.framework.media.C0650e.a {
        public d() {
        }

        public final void a(int[] iArr) {
            List<Integer> a2 = X.a(iArr);
            if (!C0647b.this.e.equals(a2)) {
                C0647b.this.j();
                C0647b.this.g.evictAll();
                C0647b.this.h.clear();
                C0647b bVar = C0647b.this;
                bVar.e = a2;
                bVar.i();
                C0647b.this.l();
                C0647b.this.k();
            }
        }

        public final void b(int[] iArr) {
            ArrayList arrayList = new ArrayList();
            int length = iArr.length;
            int i = 0;
            while (i < length) {
                int i2 = iArr[i];
                C0647b.this.g.remove(Integer.valueOf(i2));
                int i3 = C0647b.this.f.get(i2, -1);
                if (i3 == -1) {
                    C0647b.this.b();
                    return;
                } else {
                    arrayList.add(Integer.valueOf(i3));
                    i++;
                }
            }
            Collections.sort(arrayList);
            C0647b.this.j();
            C0647b.this.a(X.a((Collection<Integer>) arrayList));
            C0647b.this.k();
        }

        public final void c(int[] iArr) {
            ArrayList arrayList = new ArrayList();
            for (int i : iArr) {
                C0647b.this.g.remove(Integer.valueOf(i));
                int i2 = C0647b.this.f.get(i, -1);
                if (i2 == -1) {
                    C0647b.this.b();
                    return;
                }
                C0647b.this.f.delete(i);
                arrayList.add(Integer.valueOf(i2));
            }
            if (!arrayList.isEmpty()) {
                Collections.sort(arrayList);
                C0647b.this.j();
                C0647b.this.e.removeAll(X.a(iArr));
                C0647b.this.i();
                C0647b.this.b(X.a((Collection<Integer>) arrayList));
                C0647b.this.k();
            }
        }

        public final void f() {
            C0647b bVar = C0647b.this;
            long a2 = C0647b.b(bVar.c);
            C0647b bVar2 = C0647b.this;
            if (a2 != bVar2.b) {
                bVar2.b = a2;
                bVar2.a();
                C0647b bVar3 = C0647b.this;
                if (bVar3.b != 0) {
                    bVar3.b();
                }
            }
        }

        public final void a(int[] iArr, int i) {
            int i2;
            int length = iArr.length;
            if (i == 0) {
                i2 = C0647b.this.e.size();
            } else {
                i2 = C0647b.this.f.get(i, -1);
                if (i2 == -1) {
                    C0647b.this.b();
                    return;
                }
            }
            C0647b.this.j();
            C0647b.this.e.addAll(i2, X.a(iArr));
            C0647b.this.i();
            C0647b.this.a(i2, length);
            C0647b.this.k();
        }

        public final void a(MediaQueueItem[] mediaQueueItemArr) {
            HashSet hashSet = new HashSet();
            C0647b.this.h.clear();
            int length = mediaQueueItemArr.length;
            int i = 0;
            while (i < length) {
                MediaQueueItem mediaQueueItem = mediaQueueItemArr[i];
                int G = mediaQueueItem.G();
                C0647b.this.g.put(Integer.valueOf(G), mediaQueueItem);
                int i2 = C0647b.this.f.get(G, -1);
                if (i2 == -1) {
                    C0647b.this.b();
                    return;
                } else {
                    hashSet.add(Integer.valueOf(i2));
                    i++;
                }
            }
            for (Integer intValue : C0647b.this.h) {
                int i3 = C0647b.this.f.get(intValue.intValue(), -1);
                if (i3 != -1) {
                    hashSet.add(Integer.valueOf(i3));
                }
            }
            C0647b.this.h.clear();
            ArrayList arrayList = new ArrayList(hashSet);
            Collections.sort(arrayList);
            C0647b.this.j();
            C0647b.this.a(X.a((Collection<Integer>) arrayList));
            C0647b.this.k();
        }
    }

    /* renamed from: com.google.android.gms.cast.framework.media.b$e */
    private class e implements C0667t<C0636d> {
        private e() {
        }

        public final /* bridge */ /* synthetic */ void a(r rVar) {
        }

        public final /* synthetic */ void a(r rVar, int i) {
            C0647b.this.d();
        }

        public final /* bridge */ /* synthetic */ void a(r rVar, String str) {
        }

        public final /* synthetic */ void b(r rVar, int i) {
            C0647b.this.d();
            C0647b.this.a();
        }

        public final /* bridge */ /* synthetic */ void c(r rVar, int i) {
        }

        public final /* bridge */ /* synthetic */ void d(r rVar, int i) {
        }

        /* synthetic */ e(C0647b bVar, I i) {
            this();
        }

        public final /* synthetic */ void a(r rVar, boolean z) {
            C0636d dVar = (C0636d) rVar;
            if (dVar.g() != null) {
                C0647b.this.a(dVar.g());
            }
        }

        public final /* synthetic */ void b(r rVar) {
            C0647b.this.d();
            C0647b.this.a();
        }

        public final /* synthetic */ void b(r rVar, String str) {
            C0647b.this.a(((C0636d) rVar).g());
        }
    }

    C0647b(C0650e eVar) {
        this(eVar, 20, 20);
    }

    private final void b(int i2) {
        this.g = new J(this, i2);
    }

    private final void f() {
        this.k.removeCallbacks(this.l);
    }

    private final void g() {
        PendingResult<com.google.android.gms.cast.framework.media.C0650e.c> pendingResult = this.n;
        if (pendingResult != null) {
            pendingResult.cancel();
            this.n = null;
        }
    }

    private final void h() {
        PendingResult<com.google.android.gms.cast.framework.media.C0650e.c> pendingResult = this.m;
        if (pendingResult != null) {
            pendingResult.cancel();
            this.m = null;
        }
    }

    /* access modifiers changed from: private */
    public final void i() {
        this.f.clear();
        for (int i2 = 0; i2 < this.e.size(); i2++) {
            this.f.put(((Integer) this.e.get(i2)).intValue(), i2);
        }
    }

    /* access modifiers changed from: private */
    public final void j() {
        for (a c2 : this.s) {
            c2.c();
        }
    }

    /* access modifiers changed from: private */
    public final void k() {
        for (a b2 : this.s) {
            b2.b();
        }
    }

    /* access modifiers changed from: private */
    public final void l() {
        for (a a2 : this.s) {
            a2.a();
        }
    }

    public MediaQueueItem a(int i2, boolean z) {
        Preconditions.checkMainThread("Must be called from the main thread.");
        if (i2 < 0 || i2 >= this.e.size()) {
            return null;
        }
        int intValue = ((Integer) this.e.get(i2)).intValue();
        MediaQueueItem mediaQueueItem = (MediaQueueItem) this.g.get(Integer.valueOf(intValue));
        if (mediaQueueItem == null && z && !this.i.contains(Integer.valueOf(intValue))) {
            while (this.i.size() >= this.j) {
                this.i.removeFirst();
            }
            this.i.add(Integer.valueOf(intValue));
            c();
        }
        return mediaQueueItem;
    }

    public final void c() {
        f();
        this.k.postDelayed(this.l, 500);
    }

    /* access modifiers changed from: 0000 */
    public final void d() {
        this.c.b((com.google.android.gms.cast.framework.media.C0650e.a) this.q);
        this.d = false;
    }

    /* access modifiers changed from: 0000 */
    public final void e() {
        if (!this.i.isEmpty() && this.m == null && this.d && this.b != 0) {
            this.m = this.c.a(X.a((Collection<Integer>) this.i));
            this.m.setResultCallback(this.o);
            this.i.clear();
        }
    }

    private C0647b(C0650e eVar, int i2, int i3) {
        this.s = new HashSet();
        this.a = new C0710ia("MediaQueue");
        this.c = eVar;
        this.j = Math.max(20, 1);
        C0636d a2 = C0635c.d().c().a();
        this.e = new ArrayList();
        this.f = new SparseIntArray();
        this.h = new ArrayList();
        this.i = new ArrayDeque(20);
        this.k = new Ca(Looper.getMainLooper());
        b(20);
        this.l = new I(this);
        this.o = new C0041b(this, null);
        this.p = new c(this, null);
        this.q = new d();
        this.r = new e(this, null);
        C0635c.d().c().a(this.r, C0636d.class);
        if (a2 != null && a2.b()) {
            a(a2.g());
        }
    }

    public final void b() {
        Preconditions.checkMainThread("Must be called from the main thread.");
        if (this.d && this.b != 0 && this.n == null) {
            g();
            h();
            this.n = this.c.z();
            this.n.setResultCallback(this.p);
        }
    }

    /* access modifiers changed from: private */
    public static long b(C0650e eVar) {
        MediaStatus i2 = eVar.i();
        if (i2 == null || i2.la()) {
            return 0;
        }
        return i2.ka();
    }

    public int a(int i2) {
        Preconditions.checkMainThread("Must be called from the main thread.");
        return this.f.get(i2, -1);
    }

    /* access modifiers changed from: private */
    public final void b(int[] iArr) {
        for (a a2 : this.s) {
            a2.a(iArr);
        }
    }

    public final void a() {
        j();
        this.e.clear();
        this.f.clear();
        this.g.evictAll();
        this.h.clear();
        f();
        this.i.clear();
        g();
        h();
        l();
        k();
    }

    /* access modifiers changed from: 0000 */
    public final void a(C0650e eVar) {
        if (eVar != null && this.c == eVar) {
            this.d = true;
            eVar.a((com.google.android.gms.cast.framework.media.C0650e.a) this.q);
            long b2 = b(eVar);
            this.b = b2;
            if (b2 != 0) {
                b();
            }
        }
    }

    /* access modifiers changed from: private */
    public final void a(int i2, int i3) {
        for (a a2 : this.s) {
            a2.a(i2, i3);
        }
    }

    /* access modifiers changed from: private */
    public final void a(int[] iArr) {
        for (a b2 : this.s) {
            b2.b(iArr);
        }
    }
}
