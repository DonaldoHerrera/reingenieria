package com.soundcloud.android;

import android.accounts.Account;
import android.app.ActivityManager;
import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.os.StrictMode;
import android.os.StrictMode.ThreadPolicy;
import android.os.StrictMode.VmPolicy;
import androidx.appcompat.app.n;
import androidx.fragment.app.C0370l;
import com.facebook.stetho.Stetho;
import com.google.firebase.FirebaseApp;
import com.google.firebase.d;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigSettings.Builder;
import com.soundcloud.android.accounts.C2526g;
import com.soundcloud.android.accounts.C2529j;
import com.soundcloud.android.ads.C2568ec;
import com.soundcloud.android.ads.C2594la;
import com.soundcloud.android.cast.v;
import com.soundcloud.android.collection.Aa;
import com.soundcloud.android.collection.playhistory.G;
import com.soundcloud.android.foundation.events.C3700b;
import com.soundcloud.android.likes.C3989m;
import com.soundcloud.android.offline.C4136ne;
import com.soundcloud.android.offline.Se;
import com.soundcloud.android.playback.C4282ac;
import com.soundcloud.android.playback.C4283ad;
import com.soundcloud.android.playback.C4301eb;
import com.soundcloud.android.playback.C4323id;
import com.soundcloud.android.playback.Fa;
import com.soundcloud.android.playback.Ta;
import com.soundcloud.android.playback.players.MediaService;
import com.soundcloud.android.playback.widget.s;
import com.soundcloud.android.properties.a;
import com.soundcloud.android.properties.j;
import com.soundcloud.android.stations._b;
import com.soundcloud.android.stations.ic;
import com.soundcloud.android.sync.I;
import com.soundcloud.android.sync.T;
import com.soundcloud.android.sync.na;
import com.soundcloud.lightcycle.LightCycles;
import dagger.android.b;
import dagger.android.c;
import dagger.android.f;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

public abstract class SoundCloudApplication extends Application implements f {
    public static final String a = "SoundCloudApplication";
    private static SoundCloudApplication b;
    C3815lda A;
    I B;
    C2248QR C;
    G D;
    T E;
    ic F;
    Aa G;
    C7730yHa H;
    C3989m I;
    C2210OR J;
    C3360xR K;
    C4136ne L;
    C4863EHa M;
    C4282ac N;
    C7155pua O;
    C7054oVa<C6404eua> P;
    Fa Q;
    a R;
    C7250rKa S;
    ta T;
    HPa U;
    C6676iua V;
    C3700b W;
    Set<Jca> X;
    protected C2932k Y;
    private ra c;
    private j d;
    private C7181qKa e;
    private C3236rN f;
    c<Object> g;
    C5071Kxa h;
    C7108pGa i;
    C2529j j;
    C2526g k;
    C3041hU l;
    s m;
    C4711xla n;
    C4283ad o;
    C4301eb p;
    Ta q;
    C2568ec r;
    com.soundcloud.android.search.history.G s;
    C3284tV t;
    C2250QT u;
    C2594la v;
    C4806CMa<v> w;
    _b x;
    C4323id y;
    Se z;

    @Deprecated
    public static C2932k f() {
        SoundCloudApplication soundCloudApplication = b;
        if (soundCloudApplication != null) {
            C2932k kVar = soundCloudApplication.Y;
            if (kVar != null) {
                return kVar;
            }
        }
        throw new IllegalStateException("Cannot access the app graph before the application has been created");
    }

    private void k() {
        if (j.e()) {
            n.d(this.S.a());
        } else {
            n.d(1);
        }
    }

    private void l() {
        FirebaseApp.a((Context) this, e());
    }

    private void m() {
        this.G.k();
        this.F.b(7).h().a((C7117pPa) new C4974Hua());
        this.E.b(na.PLAY_HISTORY);
        this.E.b(na.RECENTLY_PLAYED);
        this.E.b(na.MY_FOLLOWINGS);
    }

    private void n() {
        C7054oVa ova;
        if (this.f.c()) {
            C3296uN.a(this, this.f);
            ova = new C2925d(this);
        } else {
            ova = C2725b.a;
        }
        this.c = new ra(this, this.f.c(), new C2726c(this), ova);
        this.c.b();
        ra.a(this.d.k());
    }

    private void o() {
        C7531vPa b2 = this.j.d().b(this.U);
        I i2 = this.B;
        i2.getClass();
        C7531vPa a2 = b2.a((C7256rQa<? super T>) new C2927f<Object>(i2));
        I i3 = this.B;
        i3.getClass();
        a2.c(C5190Oua.a(new C2928g(i3)));
    }

    private void p() {
        com.google.firebase.perf.a.b().a(true);
    }

    private void q() {
        FirebaseRemoteConfig instance = FirebaseRemoteConfig.getInstance();
        instance.setConfigSettings(new Builder().setMinimumFetchIntervalInSeconds(this.d.k() ? 0 : TimeUnit.HOURS.toSeconds(1)).build());
        instance.activateFetched();
    }

    private void r() {
        StrictMode.setThreadPolicy(new ThreadPolicy.Builder().detectAll().penaltyLog().build());
        StrictMode.setVmPolicy(new VmPolicy.Builder().detectAll().penaltyLog().build());
    }

    /* access modifiers changed from: protected */
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        this.Y = b();
    }

    /* access modifiers changed from: protected */
    public abstract C2932k b();

    /* access modifiers changed from: protected */
    public abstract void c();

    /* access modifiers changed from: protected */
    public abstract C7181qKa d();

    /* access modifiers changed from: protected */
    public abstract d e();

    /* access modifiers changed from: protected */
    public void g() {
        C3177oM oMVar = new C3177oM(C7853zya.B(this));
        this.e = d();
        this.d = new j(this.e);
        this.f = new C3236rN(this.d, oMVar.b());
        q();
    }

    /* access modifiers changed from: protected */
    public abstract void h();

    public /* synthetic */ C6336dua i() {
        return (C6404eua) this.P.get();
    }

    public /* synthetic */ C7155pua j() {
        return this.O;
    }

    public b<Object> oa() {
        return this.g;
    }

    public void onCreate() {
        super.onCreate();
        c();
        PPa.a((C7118pQa<Callable<HPa>, HPa>) C2926e.a);
        l();
        if (!C5501ZLa.a((Context) this)) {
            b = this;
            g();
            n();
            C7316sHa.a(4, a, "Application online... Booting.");
            h();
            C3149nN.b();
            k();
            if (this.d.k()) {
                this.M.a(this);
                Stetho.initializeWithDefaults(this);
                LightCycles.enableDebugLogging(true);
            }
            if (this.d.f()) {
                C0370l.a(true);
            }
            p();
            a();
            for (Jca onCreate : this.X) {
                onCreate.onCreate();
            }
        }
    }

    public void onLowMemory() {
        onTrimMemory(80);
        super.onLowMemory();
    }

    public void onTrimMemory(int i2) {
        if (!C5501ZLa.a((Context) this)) {
            this.c.a(i2);
        }
        super.onTrimMemory(i2);
    }

    /* access modifiers changed from: protected */
    public void a() {
        this.C.a();
        this.h.a();
        this.R.c();
        this.R.f();
        this.R.e().g();
        SDb.a(a).d("Application starting up in mode %s", this.d.b());
        SDb.a(a).a(this.d.toString(), new Object[0]);
        if (this.d.j() && !ActivityManager.isUserAMonkey()) {
            r();
            SDb.a(a).d(C6699jHa.b.a(), new Object[0]);
        }
        this.v.d();
        this.c.c();
        this.V.a();
        this.s.b();
        o();
        Oja.a(this);
        C2368XH.a((Application) this);
        this.L.a();
        this.t.d();
        this.i.a();
        this.m.b();
        getPackageManager().setComponentEnabledSetting(new ComponentName(this, MediaService.class), 1, 1);
        this.Q.a((Context) this);
        this.n.b();
        this.r.c();
        this.s.a();
        this.N.a();
        if (this.H.b(this)) {
            ((v) this.w.get()).a();
        }
        this.z.b();
        this.p.a();
        this.D.a();
        this.o.a();
        if (this.e.k()) {
            this.q.b();
        }
        this.x.a();
        this.y.a();
        this.u.a();
        this.I.f();
        this.K.b();
        this.J.c();
        this.A.c();
        this.c.a();
        this.l.a();
        this.T.a();
        this.G.a();
    }

    public boolean a(C3776gea gea, C2358WP wp) {
        Account a2 = this.k.a(gea, wp);
        if (a2 == null) {
            return false;
        }
        this.B.a(a2);
        m();
        return true;
    }
}
