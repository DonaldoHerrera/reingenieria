package com.google.android.gms.cast.framework.media;

import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.cast.AdBreakInfo;
import com.google.android.gms.cast.C0627a.e;
import com.google.android.gms.cast.C0675h;
import com.google.android.gms.cast.C0676i;
import com.google.android.gms.cast.C0679l;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaQueueItem;
import com.google.android.gms.cast.MediaStatus;
import com.google.android.gms.common.api.Api.AnyClient;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.cast.C0708ha;
import com.google.android.gms.internal.cast.C0712ja;
import com.google.android.gms.internal.cast.C0716la;
import com.google.android.gms.internal.cast.C0718ma;
import com.google.android.gms.internal.cast.C0722oa;
import com.google.android.gms.internal.cast.Ca;
import com.google.android.gms.internal.cast.H;
import com.google.android.gms.internal.cast.N;
import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.cast.framework.media.e reason: case insensitive filesystem */
public class C0650e implements e {
    public static final String a = C0708ha.e;
    /* access modifiers changed from: private */
    public final Object b = new Object();
    /* access modifiers changed from: private */
    public final Handler c = new Ca(Looper.getMainLooper());
    /* access modifiers changed from: private */
    public final C0708ha d;
    private final f e = new f();
    /* access modifiers changed from: private */
    public final com.google.android.gms.cast.C0627a.b f;
    private final C0647b g;
    private GoogleApiClient h;
    /* access modifiers changed from: private */
    public final List<b> i = new CopyOnWriteArrayList();
    @VisibleForTesting
    final List<a> j = new CopyOnWriteArrayList();
    private final Map<C0042e, j> k = new ConcurrentHashMap();
    private final Map<Long, j> l = new ConcurrentHashMap();
    /* access modifiers changed from: private */
    public d m;

    /* renamed from: com.google.android.gms.cast.framework.media.e$a */
    public static abstract class a {
        public void a() {
        }

        public void a(int[] iArr) {
        }

        public void a(int[] iArr, int i) {
        }

        public void a(MediaQueueItem[] mediaQueueItemArr) {
        }

        public void b() {
        }

        public void b(int[] iArr) {
        }

        public void c() {
        }

        public void c(int[] iArr) {
        }

        public void d() {
        }

        public void e() {
        }

        public void f() {
        }
    }

    @Deprecated
    /* renamed from: com.google.android.gms.cast.framework.media.e$b */
    public interface b {
        void a();

        void b();

        void c();

        void d();

        void e();

        void h();
    }

    /* renamed from: com.google.android.gms.cast.framework.media.e$c */
    public interface c extends Result {
    }

    /* renamed from: com.google.android.gms.cast.framework.media.e$d */
    public interface d {
        List<AdBreakInfo> a(MediaStatus mediaStatus);

        boolean b(MediaStatus mediaStatus);
    }

    /* renamed from: com.google.android.gms.cast.framework.media.e$e reason: collision with other inner class name */
    public interface C0042e {
        void a(long j, long j2);
    }

    /* renamed from: com.google.android.gms.cast.framework.media.e$f */
    private class f implements C0716la {
        private GoogleApiClient a;
        private long b = 0;

        public f() {
        }

        public final void a(GoogleApiClient googleApiClient) {
            this.a = googleApiClient;
        }

        public final void a(String str, String str2, long j, String str3) {
            if (this.a != null) {
                C0650e.this.f.b(this.a, str, str2).setResultCallback(new C0661p(this, j));
                return;
            }
            throw new IllegalStateException("No GoogleApiClient available");
        }

        public final long a() {
            long j = this.b + 1;
            this.b = j;
            return j;
        }
    }

    /* renamed from: com.google.android.gms.cast.framework.media.e$g */
    private static class g extends BasePendingResult<c> {
        g() {
            super((GoogleApiClient) null);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final c createFailedResult(Status status) {
            return new q(this, status);
        }
    }

    @VisibleForTesting
    /* renamed from: com.google.android.gms.cast.framework.media.e$h */
    abstract class h extends H<c> {
        C0722oa a;
        private final boolean b;

        h(C0650e eVar, GoogleApiClient googleApiClient) {
            this(googleApiClient, false);
        }

        /* access modifiers changed from: 0000 */
        public abstract void a(N n) throws C0718ma;

        public /* synthetic */ Result createFailedResult(Status status) {
            return new s(this, status);
        }

        /* access modifiers changed from: protected */
        public /* synthetic */ void doExecute(AnyClient anyClient) throws RemoteException {
            N n = (N) anyClient;
            if (!this.b) {
                for (b h : C0650e.this.i) {
                    h.h();
                }
                for (a e : C0650e.this.j) {
                    e.e();
                }
            }
            try {
                synchronized (C0650e.this.b) {
                    a(n);
                }
            } catch (C0718ma unused) {
                setResult((c) createFailedResult(new Status(2100)));
            }
        }

        h(GoogleApiClient googleApiClient, boolean z) {
            super(googleApiClient);
            this.b = z;
            this.a = new r(this, C0650e.this);
        }
    }

    /* renamed from: com.google.android.gms.cast.framework.media.e$i */
    private static final class i implements c {
        private final Status a;
        private final JSONObject b;

        i(Status status, JSONObject jSONObject) {
            this.a = status;
            this.b = jSONObject;
        }

        public final Status getStatus() {
            return this.a;
        }
    }

    /* renamed from: com.google.android.gms.cast.framework.media.e$j */
    private class j {
        /* access modifiers changed from: private */
        public final Set<C0042e> a = new HashSet();
        /* access modifiers changed from: private */
        public final long b;
        private final Runnable c;
        private boolean d;

        public j(long j) {
            this.b = j;
            this.c = new t(this, C0650e.this);
        }

        public final void a(C0042e eVar) {
            this.a.add(eVar);
        }

        public final void b(C0042e eVar) {
            this.a.remove(eVar);
        }

        public final void c() {
            C0650e.this.c.removeCallbacks(this.c);
            this.d = true;
            C0650e.this.c.postDelayed(this.c, this.b);
        }

        public final void d() {
            C0650e.this.c.removeCallbacks(this.c);
            this.d = false;
        }

        public final long e() {
            return this.b;
        }

        public final boolean a() {
            return !this.a.isEmpty();
        }

        public final boolean b() {
            return this.d;
        }
    }

    public C0650e(C0708ha haVar, com.google.android.gms.cast.C0627a.b bVar) {
        this.f = bVar;
        Preconditions.checkNotNull(haVar);
        this.d = haVar;
        this.d.a((C0712ja) new M(this));
        this.d.a((C0716la) this.e);
        this.g = new C0647b(this);
    }

    private final boolean B() {
        return this.h != null;
    }

    /* access modifiers changed from: private */
    public final void C() {
        for (j jVar : this.l.values()) {
            if (m() && !jVar.b()) {
                jVar.c();
            } else if (!m() && jVar.b()) {
                jVar.d();
            }
            if (jVar.b() && (n() || q() || p())) {
                a(jVar.a);
            }
        }
    }

    public final boolean A() {
        Preconditions.checkMainThread("Must be called from the main thread.");
        if (!o()) {
            return true;
        }
        MediaStatus i2 = i();
        if (i2 == null || !i2.i(2) || i2.X() == null) {
            return false;
        }
        return true;
    }

    public final void a(GoogleApiClient googleApiClient) {
        GoogleApiClient googleApiClient2 = this.h;
        if (googleApiClient2 != googleApiClient) {
            if (googleApiClient2 != null) {
                this.d.b();
                try {
                    this.f.a(this.h, j());
                } catch (IOException unused) {
                }
                this.e.a(null);
                this.c.removeCallbacksAndMessages(null);
            }
            this.h = googleApiClient;
            GoogleApiClient googleApiClient3 = this.h;
            if (googleApiClient3 != null) {
                this.e.a(googleApiClient3);
            }
        }
    }

    public PendingResult<c> b(JSONObject jSONObject) {
        Preconditions.checkMainThread("Must be called from the main thread.");
        if (!B()) {
            return a(17, (String) null);
        }
        C0659n nVar = new C0659n(this, this.h, jSONObject);
        a((h) nVar);
        return nVar;
    }

    public PendingResult<c> c(JSONObject jSONObject) {
        Preconditions.checkMainThread("Must be called from the main thread.");
        if (!B()) {
            return a(17, (String) null);
        }
        C0655j jVar = new C0655j(this, this.h, jSONObject);
        a((h) jVar);
        return jVar;
    }

    public PendingResult<c> d(JSONObject jSONObject) {
        Preconditions.checkMainThread("Must be called from the main thread.");
        if (!B()) {
            return a(17, (String) null);
        }
        C0653h hVar = new C0653h(this, this.h, jSONObject);
        a((h) hVar);
        return hVar;
    }

    public int e() {
        int I;
        synchronized (this.b) {
            Preconditions.checkMainThread("Must be called from the main thread.");
            MediaStatus i2 = i();
            I = i2 != null ? i2.I() : 0;
        }
        return I;
    }

    public MediaQueueItem f() {
        Preconditions.checkMainThread("Must be called from the main thread.");
        MediaStatus i2 = i();
        if (i2 == null) {
            return null;
        }
        return i2.o(i2.Y());
    }

    public MediaInfo g() {
        MediaInfo i2;
        synchronized (this.b) {
            Preconditions.checkMainThread("Must be called from the main thread.");
            i2 = this.d.i();
        }
        return i2;
    }

    public C0647b h() {
        C0647b bVar;
        synchronized (this.b) {
            Preconditions.checkMainThread("Must be called from the main thread.");
            bVar = this.g;
        }
        return bVar;
    }

    public MediaStatus i() {
        MediaStatus j2;
        synchronized (this.b) {
            Preconditions.checkMainThread("Must be called from the main thread.");
            j2 = this.d.j();
        }
        return j2;
    }

    public String j() {
        Preconditions.checkMainThread("Must be called from the main thread.");
        return this.d.a();
    }

    public int k() {
        int ba;
        synchronized (this.b) {
            Preconditions.checkMainThread("Must be called from the main thread.");
            MediaStatus i2 = i();
            ba = i2 != null ? i2.ba() : 1;
        }
        return ba;
    }

    public long l() {
        long k2;
        synchronized (this.b) {
            Preconditions.checkMainThread("Must be called from the main thread.");
            k2 = this.d.k();
        }
        return k2;
    }

    public boolean m() {
        Preconditions.checkMainThread("Must be called from the main thread.");
        return n() || r() || q() || p();
    }

    public boolean n() {
        Preconditions.checkMainThread("Must be called from the main thread.");
        MediaStatus i2 = i();
        return i2 != null && i2.ba() == 4;
    }

    public boolean o() {
        Preconditions.checkMainThread("Must be called from the main thread.");
        MediaInfo g2 = g();
        return g2 != null && g2.ba() == 2;
    }

    public boolean p() {
        Preconditions.checkMainThread("Must be called from the main thread.");
        MediaStatus i2 = i();
        return (i2 == null || i2.Y() == 0) ? false : true;
    }

    public boolean q() {
        Preconditions.checkMainThread("Must be called from the main thread.");
        MediaStatus i2 = i();
        return i2 != null && (i2.ba() == 3 || (o() && e() == 2));
    }

    public boolean r() {
        Preconditions.checkMainThread("Must be called from the main thread.");
        MediaStatus i2 = i();
        return i2 != null && i2.ba() == 2;
    }

    public boolean s() {
        Preconditions.checkMainThread("Must be called from the main thread.");
        MediaStatus i2 = i();
        return i2 != null && i2.ja();
    }

    public PendingResult<c> t() {
        return a((JSONObject) null);
    }

    public PendingResult<c> u() {
        return b((JSONObject) null);
    }

    public PendingResult<c> v() {
        Preconditions.checkMainThread("Must be called from the main thread.");
        if (!B()) {
            return a(17, (String) null);
        }
        N n = new N(this, this.h);
        a((h) n);
        return n;
    }

    public PendingResult<c> w() {
        Preconditions.checkMainThread("Must be called from the main thread.");
        if (!B()) {
            return a(17, (String) null);
        }
        O o = new O(this, this.h);
        a((h) o);
        return o;
    }

    public void x() {
        Preconditions.checkMainThread("Must be called from the main thread.");
        int k2 = k();
        if (k2 == 4 || k2 == 2) {
            t();
        } else {
            u();
        }
    }

    public final void y() throws IOException {
        GoogleApiClient googleApiClient = this.h;
        if (googleApiClient != null) {
            this.f.a(googleApiClient, j(), (e) this);
        }
    }

    public final PendingResult<c> z() {
        Preconditions.checkMainThread("Must be called from the main thread.");
        if (!B()) {
            return a(17, (String) null);
        }
        C0656k kVar = new C0656k(this, this.h, true);
        a((h) kVar);
        return kVar;
    }

    public long b() {
        long f2;
        synchronized (this.b) {
            Preconditions.checkMainThread("Must be called from the main thread.");
            f2 = this.d.f();
        }
        return f2;
    }

    public long c() {
        long g2;
        synchronized (this.b) {
            Preconditions.checkMainThread("Must be called from the main thread.");
            g2 = this.d.g();
        }
        return g2;
    }

    public long d() {
        long h2;
        synchronized (this.b) {
            Preconditions.checkMainThread("Must be called from the main thread.");
            h2 = this.d.h();
        }
        return h2;
    }

    @Deprecated
    public PendingResult<c> a(MediaInfo mediaInfo, boolean z, long j2, JSONObject jSONObject) {
        com.google.android.gms.cast.C0675h.a aVar = new com.google.android.gms.cast.C0675h.a();
        aVar.a(z);
        aVar.a(j2);
        aVar.a(jSONObject);
        return a(mediaInfo, aVar.a());
    }

    @Deprecated
    public void b(b bVar) {
        Preconditions.checkMainThread("Must be called from the main thread.");
        if (bVar != null) {
            this.i.remove(bVar);
        }
    }

    public void b(a aVar) {
        Preconditions.checkMainThread("Must be called from the main thread.");
        if (aVar != null) {
            this.j.remove(aVar);
        }
    }

    public PendingResult<c> a(MediaInfo mediaInfo, C0675h hVar) {
        com.google.android.gms.cast.C0676i.a aVar = new com.google.android.gms.cast.C0676i.a();
        aVar.a(mediaInfo);
        aVar.a(Boolean.valueOf(hVar.b()));
        aVar.a(hVar.f());
        aVar.a(hVar.g());
        aVar.a(hVar.a());
        aVar.a(hVar.e());
        aVar.a(hVar.c());
        aVar.b(hVar.d());
        return a(aVar.a());
    }

    public PendingResult<c> a(C0676i iVar) {
        Preconditions.checkMainThread("Must be called from the main thread.");
        if (!B()) {
            return a(17, (String) null);
        }
        C0654i iVar2 = new C0654i(this, this.h, iVar);
        a((h) iVar2);
        return iVar2;
    }

    public PendingResult<c> a(JSONObject jSONObject) {
        Preconditions.checkMainThread("Must be called from the main thread.");
        if (!B()) {
            return a(17, (String) null);
        }
        C0658m mVar = new C0658m(this, this.h, jSONObject);
        a((h) mVar);
        return mVar;
    }

    @Deprecated
    public PendingResult<c> a(long j2) {
        return a(j2, 0, (JSONObject) null);
    }

    @Deprecated
    public PendingResult<c> a(long j2, int i2, JSONObject jSONObject) {
        com.google.android.gms.cast.C0679l.a aVar = new com.google.android.gms.cast.C0679l.a();
        aVar.a(j2);
        aVar.a(i2);
        aVar.a(jSONObject);
        return a(aVar.a());
    }

    public PendingResult<c> a(C0679l lVar) {
        Preconditions.checkMainThread("Must be called from the main thread.");
        if (!B()) {
            return a(17, (String) null);
        }
        C0660o oVar = new C0660o(this, this.h, lVar);
        a((h) oVar);
        return oVar;
    }

    public PendingResult<c> a(long[] jArr) {
        Preconditions.checkMainThread("Must be called from the main thread.");
        if (!B()) {
            return a(17, (String) null);
        }
        P p = new P(this, this.h, jArr);
        a((h) p);
        return p;
    }

    public final PendingResult<c> a(int[] iArr) {
        Preconditions.checkMainThread("Must be called from the main thread.");
        if (!B()) {
            return a(17, (String) null);
        }
        C0657l lVar = new C0657l(this, this.h, true, iArr);
        a((h) lVar);
        return lVar;
    }

    public long a() {
        long e2;
        synchronized (this.b) {
            Preconditions.checkMainThread("Must be called from the main thread.");
            e2 = this.d.e();
        }
        return e2;
    }

    @Deprecated
    public void a(b bVar) {
        Preconditions.checkMainThread("Must be called from the main thread.");
        if (bVar != null) {
            this.i.add(bVar);
        }
    }

    public void a(a aVar) {
        Preconditions.checkMainThread("Must be called from the main thread.");
        if (aVar != null) {
            this.j.add(aVar);
        }
    }

    public boolean a(C0042e eVar, long j2) {
        Preconditions.checkMainThread("Must be called from the main thread.");
        if (eVar == null || this.k.containsKey(eVar)) {
            return false;
        }
        j jVar = (j) this.l.get(Long.valueOf(j2));
        if (jVar == null) {
            jVar = new j(j2);
            this.l.put(Long.valueOf(j2), jVar);
        }
        jVar.a(eVar);
        this.k.put(eVar, jVar);
        if (m()) {
            jVar.c();
        }
        return true;
    }

    public void a(C0042e eVar) {
        Preconditions.checkMainThread("Must be called from the main thread.");
        j jVar = (j) this.k.remove(eVar);
        if (jVar != null) {
            jVar.b(eVar);
            if (!jVar.a()) {
                this.l.remove(Long.valueOf(jVar.e()));
                jVar.d();
            }
        }
    }

    public void a(CastDevice castDevice, String str, String str2) {
        this.d.b(str2);
    }

    public static PendingResult<c> a(int i2, String str) {
        g gVar = new g();
        gVar.setResult(gVar.createFailedResult(new Status(i2, str)));
        return gVar;
    }

    private final h a(h hVar) {
        try {
            this.h.execute(hVar);
        } catch (IllegalArgumentException e2) {
            throw e2;
        } catch (Throwable unused) {
            hVar.setResult((c) hVar.createFailedResult(new Status(2100)));
        }
        return hVar;
    }

    /* access modifiers changed from: private */
    public final void a(Set<C0042e> set) {
        HashSet<C0042e> hashSet = new HashSet<>(set);
        if (r() || q() || n()) {
            for (C0042e a2 : hashSet) {
                a2.a(d(), l());
            }
        } else if (p()) {
            MediaQueueItem f2 = f();
            if (!(f2 == null || f2.H() == null)) {
                for (C0042e a3 : hashSet) {
                    a3.a(0, f2.H().aa());
                }
            }
        } else {
            for (C0042e a4 : hashSet) {
                a4.a(0, 0);
            }
        }
    }
}
