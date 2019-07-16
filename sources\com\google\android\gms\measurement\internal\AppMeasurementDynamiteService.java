package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.Af;
import com.google.android.gms.internal.measurement.Ff;
import com.google.android.gms.internal.measurement.xf;
import com.google.android.gms.internal.measurement.zf;
import com.google.android.gms.internal.measurement.zzx;
import java.util.Map;

@DynamiteApi
public class AppMeasurementDynamiteService extends xf {
    @VisibleForTesting
    Mb a = null;
    private Map<Integer, C1165qc> b = new T();

    class a implements C1165qc {
        private Af a;

        a(Af af) {
            this.a = af;
        }

        public final void onEvent(String str, String str2, Bundle bundle, long j) {
            try {
                this.a.onEvent(str, str2, bundle, j);
            } catch (RemoteException e) {
                AppMeasurementDynamiteService.this.a.e().v().a("Event listener threw exception", e);
            }
        }
    }

    class b implements C1150nc {
        private Af a;

        b(Af af) {
            this.a = af;
        }

        public final void a(String str, String str2, Bundle bundle, long j) {
            try {
                this.a.onEvent(str, str2, bundle, j);
            } catch (RemoteException e) {
                AppMeasurementDynamiteService.this.a.e().v().a("Event interceptor threw exception", e);
            }
        }
    }

    private final void C() {
        if (this.a == null) {
            throw new IllegalStateException("Attempting to perform action before initialize.");
        }
    }

    private final void a(zf zfVar, String str) {
        this.a.F().a(zfVar, str);
    }

    public void beginAdUnitExposure(String str, long j) throws RemoteException {
        C();
        this.a.w().a(str, j);
    }

    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) throws RemoteException {
        C();
        this.a.x().a(str, str2, bundle);
    }

    public void endAdUnitExposure(String str, long j) throws RemoteException {
        C();
        this.a.w().b(str, j);
    }

    public void generateEventId(zf zfVar) throws RemoteException {
        C();
        this.a.F().a(zfVar, this.a.F().t());
    }

    public void getAppInstanceId(zf zfVar) throws RemoteException {
        C();
        this.a.d().a((Runnable) new Cc(this, zfVar));
    }

    public void getCachedAppInstanceId(zf zfVar) throws RemoteException {
        C();
        a(zfVar, this.a.x().D());
    }

    public void getConditionalUserProperties(String str, String str2, zf zfVar) throws RemoteException {
        C();
        this.a.d().a((Runnable) new Yd(this, zfVar, str, str2));
    }

    public void getCurrentScreenClass(zf zfVar) throws RemoteException {
        C();
        a(zfVar, this.a.x().A());
    }

    public void getCurrentScreenName(zf zfVar) throws RemoteException {
        C();
        a(zfVar, this.a.x().B());
    }

    public void getDeepLink(zf zfVar) throws RemoteException {
        C();
        C1174sc x = this.a.x();
        x.i();
        String str = "";
        if (!x.f().d(null, C1127j.Ia)) {
            x.l().a(zfVar, str);
        } else if (x.b().A.a() > 0) {
            x.l().a(zfVar, str);
        } else {
            x.b().A.a(x.c().currentTimeMillis());
            x.a.a(zfVar);
        }
    }

    public void getGmpAppId(zf zfVar) throws RemoteException {
        C();
        a(zfVar, this.a.x().C());
    }

    public void getMaxUserProperties(String str, zf zfVar) throws RemoteException {
        C();
        this.a.x();
        Preconditions.checkNotEmpty(str);
        this.a.F().a(zfVar, 25);
    }

    public void getTestFlag(zf zfVar, int i) throws RemoteException {
        C();
        if (i == 0) {
            this.a.F().a(zfVar, this.a.x().G());
        } else if (i == 1) {
            this.a.F().a(zfVar, this.a.x().H().longValue());
        } else if (i == 2) {
            Vd F = this.a.F();
            double doubleValue = this.a.x().J().doubleValue();
            Bundle bundle = new Bundle();
            bundle.putDouble("r", doubleValue);
            try {
                zfVar.h(bundle);
            } catch (RemoteException e) {
                F.a.e().v().a("Error returning double value to wrapper", e);
            }
        } else if (i != 3) {
            if (i == 4) {
                this.a.F().a(zfVar, this.a.x().F().booleanValue());
            }
        } else {
            this.a.F().a(zfVar, this.a.x().I().intValue());
        }
    }

    public void getUserProperties(String str, String str2, boolean z, zf zfVar) throws RemoteException {
        C();
        Gb d = this.a.d();
        C1096cd cdVar = new C1096cd(this, zfVar, str, str2, z);
        d.a((Runnable) cdVar);
    }

    public void initForTests(Map map) throws RemoteException {
        C();
    }

    public void initialize(Dr dr, zzx zzx, long j) throws RemoteException {
        Context context = (Context) Er.c(dr);
        Mb mb = this.a;
        if (mb == null) {
            this.a = Mb.a(context, zzx);
        } else {
            mb.e().v().a("Attempting to initialize multiple times");
        }
    }

    public void isDataCollectionEnabled(zf zfVar) throws RemoteException {
        C();
        this.a.d().a((Runnable) new Xd(this, zfVar));
    }

    public void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) throws RemoteException {
        C();
        this.a.x().a(str, str2, bundle, z, z2, j);
    }

    public void logEventAndBundle(String str, String str2, Bundle bundle, zf zfVar, long j) throws RemoteException {
        C();
        Preconditions.checkNotEmpty(str2);
        String str3 = "app";
        (bundle != null ? new Bundle(bundle) : new Bundle()).putString("_o", str3);
        zzai zzai = new zzai(str2, new zzah(bundle), str3, j);
        this.a.d().a((Runnable) new Dd(this, zfVar, zzai, str));
    }

    public void logHealthData(int i, String str, Dr dr, Dr dr2, Dr dr3) throws RemoteException {
        Object obj;
        Object obj2;
        C();
        Object obj3 = null;
        if (dr == null) {
            obj = null;
        } else {
            obj = Er.c(dr);
        }
        if (dr2 == null) {
            obj2 = null;
        } else {
            obj2 = Er.c(dr2);
        }
        if (dr3 != null) {
            obj3 = Er.c(dr3);
        }
        this.a.e().a(i, true, false, str, obj, obj2, obj3);
    }

    public void onActivityCreated(Dr dr, Bundle bundle, long j) throws RemoteException {
        C();
        Mc mc = this.a.x().c;
        if (mc != null) {
            this.a.x().E();
            mc.onActivityCreated((Activity) Er.c(dr), bundle);
        }
    }

    public void onActivityDestroyed(Dr dr, long j) throws RemoteException {
        C();
        Mc mc = this.a.x().c;
        if (mc != null) {
            this.a.x().E();
            mc.onActivityDestroyed((Activity) Er.c(dr));
        }
    }

    public void onActivityPaused(Dr dr, long j) throws RemoteException {
        C();
        Mc mc = this.a.x().c;
        if (mc != null) {
            this.a.x().E();
            mc.onActivityPaused((Activity) Er.c(dr));
        }
    }

    public void onActivityResumed(Dr dr, long j) throws RemoteException {
        C();
        Mc mc = this.a.x().c;
        if (mc != null) {
            this.a.x().E();
            mc.onActivityResumed((Activity) Er.c(dr));
        }
    }

    public void onActivitySaveInstanceState(Dr dr, zf zfVar, long j) throws RemoteException {
        C();
        Mc mc = this.a.x().c;
        Bundle bundle = new Bundle();
        if (mc != null) {
            this.a.x().E();
            mc.onActivitySaveInstanceState((Activity) Er.c(dr), bundle);
        }
        try {
            zfVar.h(bundle);
        } catch (RemoteException e) {
            this.a.e().v().a("Error returning bundle value to wrapper", e);
        }
    }

    public void onActivityStarted(Dr dr, long j) throws RemoteException {
        C();
        Mc mc = this.a.x().c;
        if (mc != null) {
            this.a.x().E();
            mc.onActivityStarted((Activity) Er.c(dr));
        }
    }

    public void onActivityStopped(Dr dr, long j) throws RemoteException {
        C();
        Mc mc = this.a.x().c;
        if (mc != null) {
            this.a.x().E();
            mc.onActivityStopped((Activity) Er.c(dr));
        }
    }

    public void performAction(Bundle bundle, zf zfVar, long j) throws RemoteException {
        C();
        zfVar.h(null);
    }

    public void registerOnMeasurementEventListener(Af af) throws RemoteException {
        C();
        C1165qc qcVar = (C1165qc) this.b.get(Integer.valueOf(af.id()));
        if (qcVar == null) {
            qcVar = new a(af);
            this.b.put(Integer.valueOf(af.id()), qcVar);
        }
        this.a.x().a(qcVar);
    }

    public void resetAnalyticsData(long j) throws RemoteException {
        C();
        this.a.x().a(j);
    }

    public void setConditionalUserProperty(Bundle bundle, long j) throws RemoteException {
        C();
        if (bundle == null) {
            this.a.e().s().a("Conditional user property must not be null");
        } else {
            this.a.x().a(bundle, j);
        }
    }

    public void setCurrentScreen(Dr dr, String str, String str2, long j) throws RemoteException {
        C();
        this.a.A().a((Activity) Er.c(dr), str, str2);
    }

    public void setDataCollectionEnabled(boolean z) throws RemoteException {
        C();
        this.a.x().b(z);
    }

    public void setEventInterceptor(Af af) throws RemoteException {
        C();
        C1174sc x = this.a.x();
        b bVar = new b(af);
        x.g();
        x.w();
        x.d().a((Runnable) new C1194wc(x, bVar));
    }

    public void setInstanceIdProvider(Ff ff) throws RemoteException {
        C();
    }

    public void setMeasurementEnabled(boolean z, long j) throws RemoteException {
        C();
        this.a.x().a(z);
    }

    public void setMinimumSessionDuration(long j) throws RemoteException {
        C();
        this.a.x().b(j);
    }

    public void setSessionTimeoutDuration(long j) throws RemoteException {
        C();
        this.a.x().c(j);
    }

    public void setUserId(String str, long j) throws RemoteException {
        C();
        this.a.x().a(null, "_id", str, true, j);
    }

    public void setUserProperty(String str, String str2, Dr dr, boolean z, long j) throws RemoteException {
        C();
        this.a.x().a(str, str2, Er.c(dr), z, j);
    }

    public void unregisterOnMeasurementEventListener(Af af) throws RemoteException {
        C();
        C1165qc qcVar = (C1165qc) this.b.remove(Integer.valueOf(af.id()));
        if (qcVar == null) {
            qcVar = new a(af);
        }
        this.a.x().b(qcVar);
    }
}
