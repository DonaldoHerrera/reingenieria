package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks;
import com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.common.util.VisibleForTesting;

@VisibleForTesting
/* renamed from: com.google.android.gms.measurement.internal.qd reason: case insensitive filesystem */
public final class C1166qd implements ServiceConnection, BaseConnectionCallbacks, BaseOnConnectionFailedListener {
    /* access modifiers changed from: private */
    public volatile boolean a;
    private volatile C1109fb b;
    final /* synthetic */ Yc c;

    protected C1166qd(Yc yc) {
        this.c = yc;
    }

    public final void a(Intent intent) {
        this.c.i();
        Context context = this.c.getContext();
        ConnectionTracker instance = ConnectionTracker.getInstance();
        synchronized (this) {
            if (this.a) {
                this.c.e().A().a("Connection attempt already in progress");
                return;
            }
            this.c.e().A().a("Using local app measurement service");
            this.a = true;
            instance.bindService(context, intent, this.c.c, 129);
        }
    }

    public final void b() {
        this.c.i();
        Context context = this.c.getContext();
        synchronized (this) {
            if (this.a) {
                this.c.e().A().a("Connection attempt already in progress");
            } else if (this.b == null || (!this.b.isConnecting() && !this.b.isConnected())) {
                this.b = new C1109fb(context, Looper.getMainLooper(), this, this);
                this.c.e().A().a("Connecting to remote service");
                this.a = true;
                this.b.checkAvailabilityAndConnect();
            } else {
                this.c.e().A().a("Already awaiting connection attempt");
            }
        }
    }

    public final void onConnected(Bundle bundle) {
        Preconditions.checkMainThread("MeasurementServiceConnection.onConnected");
        synchronized (this) {
            try {
                this.c.d().a((Runnable) new C1170rd(this, (_a) this.b.getService()));
            } catch (DeadObjectException | IllegalStateException unused) {
                this.b = null;
                this.a = false;
            }
        }
    }

    public final void onConnectionFailed(ConnectionResult connectionResult) {
        Preconditions.checkMainThread("MeasurementServiceConnection.onConnectionFailed");
        C1124ib i = this.c.a.i();
        if (i != null) {
            i.v().a("Service connection failed", connectionResult);
        }
        synchronized (this) {
            this.a = false;
            this.b = null;
        }
        this.c.d().a((Runnable) new C1180td(this));
    }

    public final void onConnectionSuspended(int i) {
        Preconditions.checkMainThread("MeasurementServiceConnection.onConnectionSuspended");
        this.c.e().z().a("Service connection suspended");
        this.c.d().a((Runnable) new C1185ud(this));
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:22|23) */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        r3.c.e().s().a("Service connect failed to get IMeasurementService");
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x0062 */
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        _a _aVar;
        Preconditions.checkMainThread("MeasurementServiceConnection.onServiceConnected");
        synchronized (this) {
            if (iBinder == null) {
                this.a = false;
                this.c.e().s().a("Service connected with null binder");
                return;
            }
            _a _aVar2 = null;
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            if ("com.google.android.gms.measurement.internal.IMeasurementService".equals(interfaceDescriptor)) {
                if (iBinder != null) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
                    if (queryLocalInterface instanceof _a) {
                        _aVar = (_a) queryLocalInterface;
                    } else {
                        _aVar = new C1089bb(iBinder);
                    }
                    _aVar2 = _aVar;
                }
                this.c.e().A().a("Bound to IMeasurementService interface");
            } else {
                this.c.e().s().a("Got binder with a wrong descriptor", interfaceDescriptor);
            }
            if (_aVar2 == null) {
                this.a = false;
                try {
                    ConnectionTracker.getInstance().unbindService(this.c.getContext(), this.c.c);
                } catch (IllegalArgumentException unused) {
                }
            } else {
                this.c.d().a((Runnable) new C1161pd(this, _aVar2));
            }
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        Preconditions.checkMainThread("MeasurementServiceConnection.onServiceDisconnected");
        this.c.e().z().a("Service disconnected");
        this.c.d().a((Runnable) new C1175sd(this, componentName));
    }

    public final void a() {
        if (this.b != null && (this.b.isConnected() || this.b.isConnecting())) {
            this.b.disconnect();
        }
        this.b = null;
    }
}
