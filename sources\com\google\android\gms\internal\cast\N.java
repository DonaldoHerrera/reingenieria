package com.google.android.gms.internal.cast;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.cast.C0627a.C0036a;
import com.google.android.gms.cast.C0627a.d;
import com.google.android.gms.cast.C0627a.e;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.LaunchOptions;
import com.google.android.gms.cast.zzae;
import com.google.android.gms.cast.zzah;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder;
import com.google.android.gms.common.internal.BinderWrapper;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.GmsClient;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

public final class N extends GmsClient<Z> {
    /* access modifiers changed from: private */
    public static final C0710ia a = new C0710ia("CastClientImpl");
    /* access modifiers changed from: private */
    public static final Object b = new Object();
    private static final Object c = new Object();
    private ResultHolder<Status> A;
    /* access modifiers changed from: private */
    public ApplicationMetadata d;
    /* access modifiers changed from: private */
    public final CastDevice e;
    /* access modifiers changed from: private */
    public final d f;
    /* access modifiers changed from: private */
    public final Map<String, e> g = new HashMap();
    private final long h;
    private final Bundle i;
    private P j;
    /* access modifiers changed from: private */
    public String k;
    private boolean l;
    private boolean m;
    private boolean n;
    private boolean o;
    private double p;
    private zzae q;
    private int r;
    private int s;
    private final AtomicLong t = new AtomicLong(0);
    /* access modifiers changed from: private */
    public String u;
    /* access modifiers changed from: private */
    public String v;
    private Bundle w;
    private final Map<Long, ResultHolder<Status>> x = new HashMap();
    private double y;
    /* access modifiers changed from: private */
    public ResultHolder<C0036a> z;

    public N(Context context, Looper looper, ClientSettings clientSettings, CastDevice castDevice, long j2, d dVar, Bundle bundle, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
        super(context, looper, 10, clientSettings, connectionCallbacks, onConnectionFailedListener);
        this.e = castDevice;
        this.f = dVar;
        this.h = j2;
        this.i = bundle;
        e();
        this.y = h();
    }

    private final void b(ResultHolder<Status> resultHolder) {
        synchronized (c) {
            if (this.A != null) {
                resultHolder.setResult(new Status(2001));
            } else {
                this.A = resultHolder;
            }
        }
    }

    /* access modifiers changed from: private */
    public final void e() {
        this.o = false;
        this.r = -1;
        this.s = -1;
        this.d = null;
        this.k = null;
        this.p = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        this.y = h();
        this.l = false;
        this.q = null;
    }

    private final void f() {
        a.a("removing all MessageReceivedCallbacks", new Object[0]);
        synchronized (this.g) {
            this.g.clear();
        }
    }

    @VisibleForTesting
    private final boolean g() {
        if (this.o) {
            P p2 = this.j;
            if (p2 != null && !p2.C()) {
                return true;
            }
        }
        return false;
    }

    @VisibleForTesting
    private final double h() {
        if (this.e.m(2048)) {
            return 0.02d;
        }
        if (!this.e.m(4) || this.e.m(1)) {
            return 0.05d;
        }
        if ("Chromecast Audio".equals(this.e.I())) {
            return 0.05d;
        }
        return 0.02d;
    }

    public final void a(String str, String str2, ResultHolder<Status> resultHolder) throws IllegalArgumentException, IllegalStateException, RemoteException {
        if (TextUtils.isEmpty(str2)) {
            throw new IllegalArgumentException("The message payload cannot be null or empty");
        } else if (str2.length() <= 524288) {
            X.a(str);
            long incrementAndGet = this.t.incrementAndGet();
            try {
                this.x.put(Long.valueOf(incrementAndGet), resultHolder);
                Z z2 = (Z) getService();
                if (g()) {
                    z2.a(str, str2, incrementAndGet);
                } else {
                    a(incrementAndGet, 2016);
                }
            } catch (Throwable th) {
                this.x.remove(Long.valueOf(incrementAndGet));
                throw th;
            }
        } else {
            a.d("Message send failed. Message exceeds maximum size", new Object[0]);
            throw new IllegalArgumentException("Message exceeds maximum size");
        }
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.internal.ICastDeviceController");
        if (queryLocalInterface instanceof Z) {
            return (Z) queryLocalInterface;
        }
        return new C0698ca(iBinder);
    }

    public final void disconnect() {
        a.a("disconnect(); ServiceListener=%s, isConnected=%b", this.j, Boolean.valueOf(isConnected()));
        P p2 = this.j;
        this.j = null;
        if (p2 == null || p2.D() == null) {
            a.a("already disposed, so short-circuiting", new Object[0]);
            return;
        }
        f();
        try {
            ((Z) getService()).disconnect();
        } catch (RemoteException | IllegalStateException e2) {
            a.a(e2, "Error while disconnecting the controller interface: %s", e2.getMessage());
        } finally {
            super.disconnect();
        }
    }

    public final Bundle getConnectionHint() {
        Bundle bundle = this.w;
        if (bundle == null) {
            return super.getConnectionHint();
        }
        this.w = null;
        return bundle;
    }

    /* access modifiers changed from: protected */
    public final Bundle getGetServiceRequestExtraArgs() {
        Bundle bundle = new Bundle();
        a.a("getRemoteService(): mLastApplicationId=%s, mLastSessionId=%s", this.u, this.v);
        this.e.b(bundle);
        bundle.putLong("com.google.android.gms.cast.EXTRA_CAST_FLAGS", this.h);
        Bundle bundle2 = this.i;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        this.j = new P(this);
        P p2 = this.j;
        p2.asBinder();
        bundle.putParcelable(CastExtraArgs.LISTENER, new BinderWrapper((IBinder) p2));
        String str = this.u;
        if (str != null) {
            bundle.putString("last_application_id", str);
            String str2 = this.v;
            if (str2 != null) {
                bundle.putString("last_session_id", str2);
            }
        }
        return bundle;
    }

    public final int getMinApkVersion() {
        return 12800000;
    }

    /* access modifiers changed from: protected */
    public final String getServiceDescriptor() {
        return "com.google.android.gms.cast.internal.ICastDeviceController";
    }

    /* access modifiers changed from: protected */
    public final String getStartServiceAction() {
        return "com.google.android.gms.cast.service.BIND_CAST_DEVICE_CONTROLLER_SERVICE";
    }

    public final void onConnectionFailed(ConnectionResult connectionResult) {
        super.onConnectionFailed(connectionResult);
        f();
    }

    /* access modifiers changed from: protected */
    public final void onPostInitHandler(int i2, IBinder iBinder, Bundle bundle, int i3) {
        a.a("in onPostInitHandler; statusCode=%d", Integer.valueOf(i2));
        if (i2 == 0 || i2 == 1001) {
            this.o = true;
            this.m = true;
            this.n = true;
        } else {
            this.o = false;
        }
        if (i2 == 1001) {
            this.w = new Bundle();
            this.w.putBoolean("com.google.android.gms.cast.EXTRA_APP_NO_LONGER_RUNNING", true);
            i2 = 0;
        }
        super.onPostInitHandler(i2, iBinder, bundle, i3);
    }

    public final boolean b() throws IllegalStateException {
        checkConnected();
        return this.l;
    }

    /* access modifiers changed from: private */
    public final void b(int i2) {
        synchronized (c) {
            if (this.A != null) {
                this.A.setResult(new Status(i2));
                this.A = null;
            }
        }
    }

    public final void a(String str, LaunchOptions launchOptions, ResultHolder<C0036a> resultHolder) throws IllegalStateException, RemoteException {
        a(resultHolder);
        Z z2 = (Z) getService();
        if (g()) {
            z2.b(str, launchOptions);
        } else {
            a(2016);
        }
    }

    public final void a(String str, String str2, zzah zzah, ResultHolder<C0036a> resultHolder) throws IllegalStateException, RemoteException {
        a(resultHolder);
        if (zzah == null) {
            zzah = new zzah();
        }
        Z z2 = (Z) getService();
        if (g()) {
            z2.a(str, str2, zzah);
        } else {
            a(2016);
        }
    }

    private final void a(ResultHolder<C0036a> resultHolder) {
        synchronized (b) {
            if (this.z != null) {
                this.z.setResult(new Q(new Status(2002)));
            }
            this.z = resultHolder;
        }
    }

    public final void a(String str, ResultHolder<Status> resultHolder) throws IllegalStateException, RemoteException {
        b(resultHolder);
        Z z2 = (Z) getService();
        if (g()) {
            z2.a(str);
        } else {
            b(2016);
        }
    }

    public final void a(boolean z2) throws IllegalStateException, RemoteException {
        Z z3 = (Z) getService();
        if (g()) {
            z3.a(z2, this.p, this.l);
        }
    }

    public final void a(String str, e eVar) throws IllegalArgumentException, IllegalStateException, RemoteException {
        X.a(str);
        a(str);
        if (eVar != null) {
            synchronized (this.g) {
                this.g.put(str, eVar);
            }
            Z z2 = (Z) getService();
            if (g()) {
                z2.e(str);
            }
        }
    }

    public final void a(String str) throws IllegalArgumentException, RemoteException {
        e eVar;
        if (!TextUtils.isEmpty(str)) {
            synchronized (this.g) {
                eVar = (e) this.g.remove(str);
            }
            if (eVar != null) {
                try {
                    ((Z) getService()).f(str);
                    return;
                } catch (IllegalStateException e2) {
                    a.a(e2, "Error unregistering namespace (%s): %s", str, e2.getMessage());
                }
            }
            return;
        }
        throw new IllegalArgumentException("Channel namespace cannot be null or empty");
    }

    /* access modifiers changed from: private */
    public final void a(zzdb zzdb) {
        boolean z2;
        boolean z3;
        boolean z4;
        ApplicationMetadata h2 = zzdb.h();
        if (!X.a(h2, this.d)) {
            this.d = h2;
            this.f.a(this.d);
        }
        double G = zzdb.G();
        if (Double.isNaN(G) || Math.abs(G - this.p) <= 1.0E-7d) {
            z2 = false;
        } else {
            this.p = G;
            z2 = true;
        }
        boolean H = zzdb.H();
        if (H != this.l) {
            this.l = H;
            z2 = true;
        }
        double X = zzdb.X();
        if (!Double.isNaN(X)) {
            this.y = X;
        }
        a.a("hasVolumeChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z2), Boolean.valueOf(this.n));
        if (this.f != null && (z2 || this.n)) {
            this.f.b();
        }
        int i2 = zzdb.i();
        if (i2 != this.r) {
            this.r = i2;
            z3 = true;
        } else {
            z3 = false;
        }
        a.a("hasActiveInputChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z3), Boolean.valueOf(this.n));
        if (this.f != null && (z3 || this.n)) {
            this.f.a(this.r);
        }
        int F = zzdb.F();
        if (F != this.s) {
            this.s = F;
            z4 = true;
        } else {
            z4 = false;
        }
        a.a("hasStandbyStateChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z4), Boolean.valueOf(this.n));
        if (this.f != null && (z4 || this.n)) {
            this.f.c(this.s);
        }
        if (!X.a(this.q, zzdb.I())) {
            this.q = zzdb.I();
        }
        d dVar = this.f;
        this.n = false;
    }

    /* access modifiers changed from: private */
    public final void a(zzcj zzcj) {
        boolean z2;
        String i2 = zzcj.i();
        if (!X.a(i2, this.k)) {
            this.k = i2;
            z2 = true;
        } else {
            z2 = false;
        }
        a.a("hasChanged=%b, mFirstApplicationStatusUpdate=%b", Boolean.valueOf(z2), Boolean.valueOf(this.m));
        if (this.f != null && (z2 || this.m)) {
            this.f.a();
        }
        this.m = false;
    }

    /* access modifiers changed from: private */
    public final void a(long j2, int i2) {
        ResultHolder resultHolder;
        synchronized (this.x) {
            resultHolder = (ResultHolder) this.x.remove(Long.valueOf(j2));
        }
        if (resultHolder != null) {
            resultHolder.setResult(new Status(i2));
        }
    }

    public final void a(int i2) {
        synchronized (b) {
            if (this.z != null) {
                this.z.setResult(new Q(new Status(i2)));
                this.z = null;
            }
        }
    }
}
