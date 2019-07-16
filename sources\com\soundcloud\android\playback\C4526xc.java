package com.soundcloud.android.playback;

import android.annotation.SuppressLint;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.soundcloud.android.playback.xc reason: case insensitive filesystem */
/* compiled from: PlaybackProgressRepository */
public class C4526xc {
    private Map<C3508cda, C4519wc> a = new ConcurrentHashMap();
    private final C3760eea b;
    @SuppressLint({"sc.MissingCompositeDisposableRecycle"})
    private final UPa c = new UPa();

    public C4526xc(C3760eea eea) {
        this.b = eea;
    }

    public void a(C3508cda cda, long j) {
        if (cda.x()) {
            C4928GKa a2 = a(cda);
            if (a2.c()) {
                C4519wc wcVar = new C4519wc(j, ((C4519wc) a2.b()).c(), cda);
                a(cda, wcVar);
                return;
            }
            this.c.b(Nda.a(this.b.a(cda, a.SYNC_MISSING)).f(new C4329k(j, cda)).c((C6776kQa<? super T>) new C4324j<Object>(this, cda)));
        } else if (cda.e()) {
            C4928GKa a3 = a(cda);
            if (a3.c()) {
                C4519wc wcVar2 = new C4519wc(j, ((C4519wc) a3.b()).c(), cda);
                a(cda, wcVar2);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Ignored caching ad position ");
            sb.append(j);
            sb.append(" for non-previously cached PlaybackProgress in URN: ");
            sb.append(cda);
            SDb.c(sb.toString(), new Object[0]);
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Ignored caching progress position ");
            sb2.append(j);
            sb2.append(" for non-(track|ad) URN: ");
            sb2.append(cda);
            SDb.c(sb2.toString(), new Object[0]);
        }
    }

    /* renamed from: b */
    public void a(C3508cda cda, C4519wc wcVar) {
        if (cda.x() || cda.e()) {
            this.a.put(cda, wcVar);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Ignored caching progress ");
        sb.append(wcVar);
        sb.append(" for non-(track|ad) URN: ");
        sb.append(cda);
        SDb.c(sb.toString(), new Object[0]);
    }

    public void b(C3508cda cda) {
        this.a.remove(cda);
    }

    static /* synthetic */ C4519wc a(long j, C3508cda cda, C3509cea cea) throws Exception {
        C4519wc wcVar = new C4519wc(j, cea.i(), cda);
        return wcVar;
    }

    public C4928GKa<C4519wc> a(C3508cda cda) {
        return C4928GKa.b(this.a.get(cda));
    }
}
