package com.soundcloud.android.ads;

import androidx.appcompat.app.AppCompatActivity;
import com.soundcloud.android.foundation.ads.C3676c;
import com.soundcloud.android.foundation.ads.C3693u;
import com.soundcloud.android.foundation.playqueue.k;
import com.soundcloud.android.foundation.playqueue.q;
import com.soundcloud.android.foundation.playqueue.r;
import com.soundcloud.android.playback.C4412qb;
import com.soundcloud.android.playback.playqueue.Ua;
import com.soundcloud.lightcycle.DefaultActivityLightCycle;

/* compiled from: AdPlayerController */
public class Ca extends DefaultActivityLightCycle<AppCompatActivity> {
    /* access modifiers changed from: private */
    public final Na a;
    /* access modifiers changed from: private */
    public final C5327TLa b;
    private final C4412qb c;
    private final r d;
    private VPa e = C4881Eua.b();

    /* compiled from: AdPlayerController */
    private final class a extends C5037Jua<b> {
        private a() {
        }

        private boolean c() {
            C3676c a = Ca.this.a.a();
            return (a instanceof C3693u) && ((C3693u) a).F();
        }

        private boolean d() {
            return Ca.this.a.a().k().equals(com.soundcloud.android.foundation.ads.C3676c.a.LEAVE_BEHIND);
        }

        public void a(b bVar) {
            q a = bVar.a;
            if (a.e()) {
                Ca.this.b.c(C3876taa.e, Ua.b());
            }
            if (a.k()) {
                Ca.this.b.c(C3876taa.f, Haa.s());
                return;
            }
            Ca.this.b.c(C3876taa.f, Haa.v());
            if (!Ca.this.a.e()) {
                return;
            }
            if (c()) {
                Ca.this.b.c(C3876taa.f, Haa.s());
            } else if (d()) {
                Ca.this.b.c(C3876taa.f, Haa.c());
            }
        }
    }

    /* compiled from: AdPlayerController */
    private static class b {
        /* access modifiers changed from: private */
        public final q a;

        b(q qVar) {
            this.a = qVar;
        }
    }

    Ca(C5327TLa tLa, Na na, C4412qb qbVar, r rVar) {
        this.b = tLa;
        this.a = na;
        this.c = qbVar;
        this.d = rVar;
    }

    static /* synthetic */ b a(k kVar, Iaa iaa) throws Exception {
        return new b(kVar.b());
    }

    /* renamed from: b */
    public void onResume(AppCompatActivity appCompatActivity) {
        this.e = (VPa) APa.a((EPa<? extends T1>) this.d.a(), (EPa<? extends T2>) this.b.a(C3876taa.d), (C6504gQa<? super T1, ? super T2, ? extends R>) C2577h.a).c(new a());
    }

    /* renamed from: a */
    public void onPause(AppCompatActivity appCompatActivity) {
        if (this.a.g() && !appCompatActivity.isChangingConfigurations()) {
            this.c.pause();
        }
        this.e.dispose();
    }
}
