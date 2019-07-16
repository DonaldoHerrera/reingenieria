package com.soundcloud.android.sync;

import android.content.Intent;
import com.soundcloud.android.accounts.C2526g;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.soundcloud.android.sync.o reason: case insensitive filesystem */
/* compiled from: BackgroundSyncer */
class C6132o {
    static int[] a = {1, 2, 4, 8, 12, 18, 24};
    private final C2526g b;
    private final BackgroundSyncResultReceiver c;
    private final C4806CMa<K> d;
    private final la e;
    private final oa f;

    /* renamed from: com.soundcloud.android.sync.o$a */
    /* compiled from: BackgroundSyncer */
    private static class a extends RuntimeException {
        public a(Throwable th) {
            super(th);
        }
    }

    /* renamed from: com.soundcloud.android.sync.o$b */
    /* compiled from: BackgroundSyncer */
    enum b {
        UNAUTHORIZED,
        NO_SYNC,
        SYNCING
    }

    C6132o(C2526g gVar, la laVar, oa oaVar, C4806CMa<K> cMa, BackgroundSyncResultReceiver backgroundSyncResultReceiver) {
        this.b = gVar;
        this.e = laVar;
        this.f = oaVar;
        this.c = backgroundSyncResultReceiver;
        this.d = cMa;
    }

    public List<na> a(boolean z) {
        return z ? Arrays.asList(na.values()) : a();
    }

    /* access modifiers changed from: 0000 */
    public b b(boolean z) {
        if (!b()) {
            return b.UNAUTHORIZED;
        }
        List a2 = a(z);
        if (a2.isEmpty()) {
            return b.NO_SYNC;
        }
        Intent intent = new Intent();
        V.a(intent, a2);
        ((K) this.d.get()).b(intent.putExtra("com.soundcloud.android.sync.extra.IS_UI_REQUEST", false).putExtra("com.soundcloud.android.sync.extra.STATUS_RECEIVER", this.c));
        return b.SYNCING;
    }

    private List<na> a() {
        ArrayList arrayList = new ArrayList();
        Iterator it = EnumSet.complementOf(na.p).iterator();
        while (it.hasNext()) {
            na naVar = (na) it.next();
            if (a(naVar, this.f.a(naVar))) {
                arrayList.add(naVar);
            }
        }
        return arrayList;
    }

    private boolean a(na naVar, com.soundcloud.android.sync.oa.a aVar) {
        return aVar.b() || (aVar.d() && a(naVar, aVar.c()));
    }

    private boolean a(na naVar, long j) {
        return !this.e.a(naVar, j * ((long) a[Math.min(a.length - 1, this.e.b(naVar))]));
    }

    private boolean b() {
        long nanoTime = System.nanoTime();
        try {
            return this.b.h();
        } catch (RuntimeException e2) {
            if (C7316sHa.b(e2) instanceof InterruptedException) {
                C7316sHa.a((Throwable) new a(e2), "Blocked Duration Millis", Long.toString((System.nanoTime() - nanoTime) / 1000000));
                return false;
            }
            throw e2;
        }
    }
}
