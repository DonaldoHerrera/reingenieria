package com.soundcloud.android.ads;

import android.os.Bundle;
import com.evernote.android.job.c.b;
import com.evernote.android.job.s;
import com.evernote.android.job.s.d;
import java.util.concurrent.TimeUnit;

/* renamed from: com.soundcloud.android.ads.pa reason: case insensitive filesystem */
/* compiled from: AdIdSyncer.kt */
public final class C2610pa implements C2453aS {
    private final C2594la a;

    public C2610pa(C2594la laVar) {
        C7471uYa.b(laVar, "adIdHelper");
        this.a = laVar;
    }

    public b a(C2267RR rr) {
        C7471uYa.b(rr, "jobParamsHolder");
        this.a.e();
        return b.SUCCESS;
    }

    public s.b a(Bundle bundle) {
        s.b bVar = new s.b(C2342VR.AD_ID.name());
        bVar.b(TimeUnit.DAYS.toMillis(1), TimeUnit.HOURS.toMillis(4));
        bVar.a(d.CONNECTED);
        C7471uYa.a((Object) bVar, "JobRequest.Builder(Perio…st.NetworkType.CONNECTED)");
        return bVar;
    }
}
