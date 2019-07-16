package com.google.android.gms.cast.framework;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.cast.C0627a;
import com.google.android.gms.cast.C0627a.C0036a;
import com.google.android.gms.cast.C0627a.c.C0038a;
import com.google.android.gms.cast.C0627a.d;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.LaunchOptions;
import com.google.android.gms.cast.framework.media.C0650e;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.GoogleApiClient.Builder;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.cast.C0708ha;
import com.google.android.gms.internal.cast.C0709i;
import com.google.android.gms.internal.cast.C0710ia;
import com.google.android.gms.internal.cast.Ea;
import com.google.android.gms.internal.cast.ta;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.android.gms.cast.framework.d reason: case insensitive filesystem */
public class C0636d extends r {
    /* access modifiers changed from: private */
    public static final C0710ia d = new C0710ia("CastSession");
    private final Context e;
    /* access modifiers changed from: private */
    public final Set<d> f = new HashSet();
    /* access modifiers changed from: private */
    public final L g;
    private final CastOptions h;
    /* access modifiers changed from: private */
    public final com.google.android.gms.cast.C0627a.b i;
    private final Ea j;
    /* access modifiers changed from: private */
    public final C0709i k;
    /* access modifiers changed from: private */
    public GoogleApiClient l;
    /* access modifiers changed from: private */
    public C0650e m;
    private CastDevice n;
    /* access modifiers changed from: private */
    public C0036a o;

    /* renamed from: com.google.android.gms.cast.framework.d$a */
    private class a extends I {
        private a() {
        }

        public final int a() {
            return 12451009;
        }

        public final void a(String str, LaunchOptions launchOptions) {
            if (C0636d.this.l != null) {
                C0636d.this.i.a(C0636d.this.l, str, launchOptions).setResultCallback(new b("launchApplication"));
            }
        }

        public final void b(String str, String str2) {
            if (C0636d.this.l != null) {
                C0636d.this.i.a(C0636d.this.l, str, str2).setResultCallback(new b("joinApplication"));
            }
        }

        public final void j(int i) {
            C0636d.this.d(i);
        }

        public final void a(String str) {
            if (C0636d.this.l != null) {
                C0636d.this.i.b(C0636d.this.l, str);
            }
        }
    }

    /* renamed from: com.google.android.gms.cast.framework.d$b */
    private class b implements ResultCallback<C0036a> {
        private String a;

        b(String str) {
            this.a = str;
        }

        public final /* synthetic */ void onResult(Result result) {
            C0036a aVar = (C0036a) result;
            C0636d.this.o = aVar;
            try {
                if (aVar.getStatus().isSuccess()) {
                    C0636d.d.a("%s() -> success result", this.a);
                    C0636d.this.m = new C0650e(new C0708ha(null), C0636d.this.i);
                    try {
                        C0636d.this.m.a(C0636d.this.l);
                        C0636d.this.m.y();
                        C0636d.this.m.v();
                        C0636d.this.k.a(C0636d.this.m, C0636d.this.f());
                    } catch (IOException e) {
                        C0636d.d.b(e, "Exception when setting GoogleApiClient.", new Object[0]);
                        C0636d.this.m = null;
                    }
                    C0636d.this.g.a(aVar.h(), aVar.g(), aVar.getSessionId(), aVar.f());
                    return;
                }
                C0636d.d.a("%s() -> failure result", this.a);
                C0636d.this.g.a(aVar.getStatus().getStatusCode());
            } catch (RemoteException e2) {
                C0636d.d.a(e2, "Unable to call %s on %s.", "methods", L.class.getSimpleName());
            }
        }
    }

    /* renamed from: com.google.android.gms.cast.framework.d$c */
    private class c implements ConnectionCallbacks, OnConnectionFailedListener {
        private c() {
        }

        public final void onConnected(Bundle bundle) {
            try {
                if (C0636d.this.m != null) {
                    try {
                        C0636d.this.m.y();
                        C0636d.this.m.v();
                    } catch (IOException e) {
                        C0636d.d.b(e, "Exception when setting GoogleApiClient.", new Object[0]);
                        C0636d.this.m = null;
                    }
                }
                C0636d.this.g.onConnected(bundle);
            } catch (RemoteException e2) {
                C0636d.d.a(e2, "Unable to call %s on %s.", "onConnected", L.class.getSimpleName());
            }
        }

        public final void onConnectionFailed(ConnectionResult connectionResult) {
            try {
                C0636d.this.g.onConnectionFailed(connectionResult);
            } catch (RemoteException e) {
                C0636d.d.a(e, "Unable to call %s on %s.", "onConnectionFailed", L.class.getSimpleName());
            }
        }

        public final void onConnectionSuspended(int i) {
            try {
                C0636d.this.g.onConnectionSuspended(i);
            } catch (RemoteException e) {
                C0636d.d.a(e, "Unable to call %s on %s.", "onConnectionSuspended", L.class.getSimpleName());
            }
        }
    }

    /* renamed from: com.google.android.gms.cast.framework.d$d reason: collision with other inner class name */
    private class C0039d extends d {
        private C0039d() {
        }

        public final void a() {
            for (d a2 : new HashSet(C0636d.this.f)) {
                a2.a();
            }
        }

        public final void b(int i) {
            C0636d.this.d(i);
            C0636d.this.c(i);
            for (d b : new HashSet(C0636d.this.f)) {
                b.b(i);
            }
        }

        public final void c(int i) {
            for (d c : new HashSet(C0636d.this.f)) {
                c.c(i);
            }
        }

        public final void a(ApplicationMetadata applicationMetadata) {
            for (d a2 : new HashSet(C0636d.this.f)) {
                a2.a(applicationMetadata);
            }
        }

        public final void b() {
            for (d b : new HashSet(C0636d.this.f)) {
                b.b();
            }
        }

        public final void a(int i) {
            for (d a2 : new HashSet(C0636d.this.f)) {
                a2.a(i);
            }
        }
    }

    public C0636d(Context context, String str, String str2, CastOptions castOptions, com.google.android.gms.cast.C0627a.b bVar, Ea ea, C0709i iVar) {
        super(context, str, str2);
        this.e = context.getApplicationContext();
        this.h = castOptions;
        this.i = bVar;
        this.j = ea;
        this.k = iVar;
        this.g = ta.a(context, castOptions, e(), (J) new a());
    }

    private final void e(Bundle bundle) {
        this.n = CastDevice.a(bundle);
        if (this.n != null) {
            GoogleApiClient googleApiClient = this.l;
            if (googleApiClient != null) {
                googleApiClient.disconnect();
                this.l = null;
            }
            boolean z = true;
            d.a("Acquiring a connection to Google Play Services for %s", this.n);
            c cVar = new c();
            Context context = this.e;
            CastDevice castDevice = this.n;
            CastOptions castOptions = this.h;
            C0039d dVar = new C0039d();
            Bundle bundle2 = new Bundle();
            bundle2.putBoolean("com.google.android.gms.cast.EXTRA_CAST_FRAMEWORK_NOTIFICATION_ENABLED", (castOptions == null || castOptions.i() == null || castOptions.i().H() == null) ? false : true);
            if (castOptions == null || castOptions.i() == null || !castOptions.i().I()) {
                z = false;
            }
            bundle2.putBoolean("com.google.android.gms.cast.EXTRA_CAST_REMOTE_CONTROL_NOTIFICATION_ENABLED", z);
            Builder builder = new Builder(context);
            Api<com.google.android.gms.cast.C0627a.c> api = C0627a.b;
            C0038a aVar = new C0038a(castDevice, dVar);
            aVar.a(bundle2);
            this.l = builder.addApi(api, aVar.a()).addConnectionCallbacks(cVar).addOnConnectionFailedListener(cVar).build();
            this.l.connect();
        } else if (d()) {
            a(8);
        } else {
            b(8);
        }
    }

    /* access modifiers changed from: protected */
    public void a(Bundle bundle) {
        this.n = CastDevice.a(bundle);
    }

    /* access modifiers changed from: protected */
    public void b(Bundle bundle) {
        this.n = CastDevice.a(bundle);
    }

    /* access modifiers changed from: protected */
    public void c(Bundle bundle) {
        e(bundle);
    }

    /* access modifiers changed from: protected */
    public void d(Bundle bundle) {
        e(bundle);
    }

    public CastDevice f() {
        Preconditions.checkMainThread("Must be called from the main thread.");
        return this.n;
    }

    public C0650e g() {
        Preconditions.checkMainThread("Must be called from the main thread.");
        return this.m;
    }

    public boolean h() throws IllegalStateException {
        Preconditions.checkMainThread("Must be called from the main thread.");
        GoogleApiClient googleApiClient = this.l;
        if (googleApiClient != null) {
            return this.i.a(googleApiClient);
        }
        return false;
    }

    /* access modifiers changed from: private */
    public final void d(int i2) {
        this.k.a(i2);
        GoogleApiClient googleApiClient = this.l;
        if (googleApiClient != null) {
            googleApiClient.disconnect();
            this.l = null;
        }
        this.n = null;
        C0650e eVar = this.m;
        if (eVar != null) {
            eVar.a((GoogleApiClient) null);
            this.m = null;
        }
        this.o = null;
    }

    /* access modifiers changed from: protected */
    public void a(boolean z) {
        try {
            this.g.a(z, 0);
        } catch (RemoteException e2) {
            d.a(e2, "Unable to call %s on %s.", "disconnectFromDevice", L.class.getSimpleName());
        }
        c(0);
    }

    public void b(boolean z) throws IOException, IllegalStateException {
        Preconditions.checkMainThread("Must be called from the main thread.");
        GoogleApiClient googleApiClient = this.l;
        if (googleApiClient != null) {
            this.i.a(googleApiClient, z);
        }
    }

    public void b(d dVar) {
        Preconditions.checkMainThread("Must be called from the main thread.");
        if (dVar != null) {
            this.f.remove(dVar);
        }
    }

    public PendingResult<Status> a(String str, String str2) {
        Preconditions.checkMainThread("Must be called from the main thread.");
        GoogleApiClient googleApiClient = this.l;
        if (googleApiClient != null) {
            return this.i.b(googleApiClient, str, str2);
        }
        return null;
    }

    public void a(d dVar) {
        Preconditions.checkMainThread("Must be called from the main thread.");
        if (dVar != null) {
            this.f.add(dVar);
        }
    }

    public long a() {
        Preconditions.checkMainThread("Must be called from the main thread.");
        C0650e eVar = this.m;
        if (eVar == null) {
            return 0;
        }
        return eVar.l() - this.m.d();
    }
}
