package com.google.firebase.perf.internal;

import android.content.Context;
import android.provider.Settings.Secure;
import com.adjust.sdk.Constants;
import com.google.android.gms.internal.firebase-perf.A;
import com.google.android.gms.internal.firebase-perf.C0877pa;
import com.google.android.gms.internal.firebase-perf.C0892ta;
import com.google.android.gms.internal.firebase-perf.C0908xa;
import com.google.android.gms.internal.firebase-perf.C0911y;
import com.google.android.gms.internal.firebase-perf.L;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;

public final class r {
    private final long a;
    private boolean b;
    private t c;
    private t d;
    private final RemoteConfigManager e;

    public r(Context context, long j, long j2) {
        this(100, 500, new C0911y(), a(Secure.getString(context.getContentResolver(), "android_id")), RemoteConfigManager.zzbz());
        this.b = L.a(context);
    }

    /* access modifiers changed from: 0000 */
    public final boolean a(C0877pa paVar) {
        if (paVar.q()) {
            if (!(this.a <= ((long) (this.e.zza("trace_sampling_rate", 100.0f) * 1000000.0f))) && !a(paVar.r().r())) {
                return false;
            }
        }
        if (paVar.s()) {
            if (!(this.a <= ((long) (this.e.zza("network_sampling_rate", 100.0f) * 1000000.0f))) && !a(paVar.t().F())) {
                return false;
            }
        }
        if (!((!paVar.q() || ((!paVar.r().p().equals(A.FOREGROUND_TRACE_NAME.toString()) && !paVar.r().p().equals(A.BACKGROUND_TRACE_NAME.toString())) || paVar.r().s() <= 0)) && !paVar.u())) {
            return true;
        }
        if (paVar.s()) {
            return this.d.a(paVar);
        }
        if (paVar.q()) {
            return this.c.a(paVar);
        }
        return false;
    }

    private r(long j, long j2, C0911y yVar, long j3, RemoteConfigManager remoteConfigManager) {
        this.b = false;
        this.c = null;
        this.d = null;
        this.a = j3;
        this.e = remoteConfigManager;
        C0911y yVar2 = yVar;
        RemoteConfigManager remoteConfigManager2 = remoteConfigManager;
        t tVar = new t(100, 500, yVar2, remoteConfigManager2, u.TRACE, this.b);
        this.c = tVar;
        t tVar2 = new t(100, 500, yVar2, remoteConfigManager2, u.NETWORK, this.b);
        this.d = tVar2;
    }

    private static boolean a(List<C0892ta> list) {
        if (list.size() <= 0 || ((C0892ta) list.get(0)).o() <= 0 || ((C0892ta) list.get(0)).b(0) != C0908xa.GAUGES_AND_SYSTEM_EVENTS) {
            return false;
        }
        return true;
    }

    private static long a(String str) {
        int i;
        try {
            i = L.a(MessageDigest.getInstance(Constants.SHA1).digest(str.getBytes()));
        } catch (NoSuchAlgorithmException unused) {
            i = L.a(str.getBytes());
        }
        return (((((long) i) % 100000000) + 100000000) % 100000000) + 1;
    }

    /* access modifiers changed from: 0000 */
    public final void a(boolean z) {
        this.c.a(z);
        this.d.a(z);
    }
}
