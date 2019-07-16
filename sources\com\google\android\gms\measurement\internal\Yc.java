package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.RemoteException;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.zf;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

@VisibleForTesting
public final class Yc extends C1095cc {
    /* access modifiers changed from: private */
    public final C1166qd c;
    /* access modifiers changed from: private */
    public _a d;
    private volatile Boolean e;
    private final C1087b f;
    private final Hd g;
    private final List<Runnable> h = new ArrayList();
    private final C1087b i;

    protected Yc(Mb mb) {
        super(mb);
        this.g = new Hd(mb.c());
        this.c = new C1166qd(this);
        this.f = new Xc(this, mb);
        this.i = new C1126id(this, mb);
    }

    private final boolean H() {
        a();
        return true;
    }

    /* access modifiers changed from: private */
    public final void I() {
        i();
        this.g.b();
        this.f.a(((Long) C1127j.R.a(null)).longValue());
    }

    /* access modifiers changed from: private */
    public final void J() {
        i();
        if (B()) {
            e().A().a("Inactivity, disconnecting from the service");
            A();
        }
    }

    /* access modifiers changed from: private */
    public final void K() {
        i();
        e().A().a("Processing queued up service tasks", Integer.valueOf(this.h.size()));
        for (Runnable run : this.h) {
            try {
                run.run();
            } catch (Exception e2) {
                e().s().a("Task exception while flushing queue", e2);
            }
        }
        this.h.clear();
        this.i.a();
    }

    public final void A() {
        i();
        w();
        this.c.a();
        try {
            ConnectionTracker.getInstance().unbindService(getContext(), this.c);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        this.d = null;
    }

    public final boolean B() {
        i();
        w();
        return this.d != null;
    }

    /* access modifiers changed from: protected */
    public final void C() {
        i();
        g();
        w();
        zzn a = a(false);
        if (H()) {
            s().A();
        }
        a((Runnable) new C1091bd(this, a));
    }

    /* access modifiers changed from: protected */
    public final void D() {
        i();
        w();
        zzn a = a(true);
        boolean a2 = f().a(C1127j.Ja);
        if (a2) {
            s().B();
        }
        a((Runnable) new C1101dd(this, a, a2));
    }

    /* access modifiers changed from: protected */
    public final void E() {
        i();
        w();
        a((Runnable) new C1121hd(this, a(true)));
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x010d  */
    public final void F() {
        boolean z;
        boolean z2;
        boolean z3;
        i();
        w();
        if (!B()) {
            boolean z4 = false;
            if (this.e == null) {
                i();
                w();
                Boolean u = b().u();
                if (u == null || !u.booleanValue()) {
                    a();
                    if (p().F() != 1) {
                        e().A().a("Checking service availability");
                        int a = l().a((int) GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE);
                        if (a != 0) {
                            if (a != 1) {
                                if (a == 2) {
                                    e().z().a("Service container out of date");
                                    if (l().v() >= 15300) {
                                        Boolean u2 = b().u();
                                        if (u2 == null || u2.booleanValue()) {
                                            z = true;
                                            z2 = false;
                                            if (!z && f().w()) {
                                                e().s().a("No way to upload. Consider using the full version of Analytics");
                                                z2 = false;
                                            }
                                            if (z2) {
                                                b().b(z);
                                            }
                                        }
                                    }
                                } else if (a == 3) {
                                    e().v().a("Service disabled");
                                } else if (a == 9) {
                                    e().v().a("Service invalid");
                                } else if (a != 18) {
                                    e().v().a("Unexpected service status", Integer.valueOf(a));
                                } else {
                                    e().v().a("Service updating");
                                }
                                z = false;
                                z2 = false;
                                e().s().a("No way to upload. Consider using the full version of Analytics");
                                z2 = false;
                                if (z2) {
                                }
                            } else {
                                e().A().a("Service missing");
                            }
                            z3 = false;
                            z2 = true;
                            e().s().a("No way to upload. Consider using the full version of Analytics");
                            z2 = false;
                            if (z2) {
                            }
                        } else {
                            e().A().a("Service available");
                        }
                    }
                    z3 = true;
                    z2 = true;
                    e().s().a("No way to upload. Consider using the full version of Analytics");
                    z2 = false;
                    if (z2) {
                    }
                } else {
                    z = true;
                }
                this.e = Boolean.valueOf(z);
            }
            if (this.e.booleanValue()) {
                this.c.b();
                return;
            }
            if (!f().w()) {
                a();
                String str = "com.google.android.gms.measurement.AppMeasurementService";
                List queryIntentServices = getContext().getPackageManager().queryIntentServices(new Intent().setClassName(getContext(), str), 65536);
                if (queryIntentServices != null && queryIntentServices.size() > 0) {
                    z4 = true;
                }
                if (z4) {
                    Intent intent = new Intent("com.google.android.gms.measurement.START");
                    Context context = getContext();
                    a();
                    intent.setComponent(new ComponentName(context, str));
                    this.c.a(intent);
                    return;
                }
                e().s().a("Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest");
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public final Boolean G() {
        return this.e;
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0041  */
    @VisibleForTesting
    public final void a(_a _aVar, AbstractSafeParcelable abstractSafeParcelable, zzn zzn) {
        int i2;
        int size;
        int i3;
        i();
        g();
        w();
        boolean H = H();
        int i4 = 0;
        int i5 = 100;
        while (i4 < 1001 && i5 == 100) {
            ArrayList arrayList = new ArrayList();
            if (H) {
                List a = s().a(100);
                if (a != null) {
                    arrayList.addAll(a);
                    i2 = a.size();
                    if (abstractSafeParcelable != null && i2 < 100) {
                        arrayList.add(abstractSafeParcelable);
                    }
                    size = arrayList.size();
                    i3 = 0;
                    while (i3 < size) {
                        Object obj = arrayList.get(i3);
                        i3++;
                        AbstractSafeParcelable abstractSafeParcelable2 = (AbstractSafeParcelable) obj;
                        if (abstractSafeParcelable2 instanceof zzai) {
                            try {
                                _aVar.a((zzai) abstractSafeParcelable2, zzn);
                            } catch (RemoteException e2) {
                                e().s().a("Failed to send event to the service", e2);
                            }
                        } else if (abstractSafeParcelable2 instanceof zzjn) {
                            try {
                                _aVar.a((zzjn) abstractSafeParcelable2, zzn);
                            } catch (RemoteException e3) {
                                e().s().a("Failed to send attribute to the service", e3);
                            }
                        } else if (abstractSafeParcelable2 instanceof zzq) {
                            try {
                                _aVar.a((zzq) abstractSafeParcelable2, zzn);
                            } catch (RemoteException e4) {
                                e().s().a("Failed to send conditional property to the service", e4);
                            }
                        } else {
                            e().s().a("Discarding data. Unrecognized parcel type.");
                        }
                    }
                    i4++;
                    i5 = i2;
                }
            }
            i2 = 0;
            arrayList.add(abstractSafeParcelable);
            size = arrayList.size();
            i3 = 0;
            while (i3 < size) {
            }
            i4++;
            i5 = i2;
        }
    }

    public final /* bridge */ /* synthetic */ C1168rb b() {
        return super.b();
    }

    public final /* bridge */ /* synthetic */ Clock c() {
        return super.c();
    }

    public final /* bridge */ /* synthetic */ Gb d() {
        return super.d();
    }

    public final /* bridge */ /* synthetic */ C1124ib e() {
        return super.e();
    }

    public final /* bridge */ /* synthetic */ ce f() {
        return super.f();
    }

    public final /* bridge */ /* synthetic */ void g() {
        super.g();
    }

    public final /* bridge */ /* synthetic */ Context getContext() {
        return super.getContext();
    }

    public final /* bridge */ /* synthetic */ void i() {
        super.i();
    }

    public final /* bridge */ /* synthetic */ C1097d j() {
        return super.j();
    }

    public final /* bridge */ /* synthetic */ C1114gb k() {
        return super.k();
    }

    public final /* bridge */ /* synthetic */ Vd l() {
        return super.l();
    }

    public final /* bridge */ /* synthetic */ C1174sc o() {
        return super.o();
    }

    public final /* bridge */ /* synthetic */ C1084ab p() {
        return super.p();
    }

    public final /* bridge */ /* synthetic */ C1104eb s() {
        return super.s();
    }

    /* access modifiers changed from: protected */
    public final boolean y() {
        return false;
    }

    /* access modifiers changed from: protected */
    public final void a(zzai zzai, String str) {
        Preconditions.checkNotNull(zzai);
        i();
        w();
        boolean H = H();
        C1136kd kdVar = new C1136kd(this, H, H && s().a(zzai), zzai, a(true), str);
        a((Runnable) kdVar);
    }

    /* access modifiers changed from: protected */
    public final void a(zzq zzq) {
        Preconditions.checkNotNull(zzq);
        i();
        w();
        a();
        C1131jd jdVar = new C1131jd(this, true, s().a(zzq), new zzq(zzq), a(true), zzq);
        a((Runnable) jdVar);
    }

    /* access modifiers changed from: protected */
    public final void a(AtomicReference<List<zzq>> atomicReference, String str, String str2, String str3) {
        i();
        w();
        C1146md mdVar = new C1146md(this, atomicReference, str, str2, str3, a(false));
        a((Runnable) mdVar);
    }

    /* access modifiers changed from: protected */
    public final void a(zf zfVar, String str, String str2) {
        i();
        w();
        C1141ld ldVar = new C1141ld(this, str, str2, a(false), zfVar);
        a((Runnable) ldVar);
    }

    /* access modifiers changed from: protected */
    public final void a(AtomicReference<List<zzjn>> atomicReference, String str, String str2, String str3, boolean z) {
        i();
        w();
        C1156od odVar = new C1156od(this, atomicReference, str, str2, str3, z, a(false));
        a((Runnable) odVar);
    }

    /* access modifiers changed from: protected */
    public final void a(zf zfVar, String str, String str2, boolean z) {
        i();
        w();
        C1151nd ndVar = new C1151nd(this, str, str2, z, a(false), zfVar);
        a((Runnable) ndVar);
    }

    /* access modifiers changed from: protected */
    public final void a(zzjn zzjn) {
        i();
        w();
        a((Runnable) new _c(this, H() && s().a(zzjn), zzjn, a(true)));
    }

    /* access modifiers changed from: protected */
    public final void a(AtomicReference<List<zzjn>> atomicReference, boolean z) {
        i();
        w();
        a((Runnable) new Zc(this, atomicReference, a(false), z));
    }

    public final void a(AtomicReference<String> atomicReference) {
        i();
        w();
        a((Runnable) new C1086ad(this, atomicReference, a(false)));
    }

    public final void a(zf zfVar) {
        i();
        w();
        a((Runnable) new C1106ed(this, a(false), zfVar));
    }

    /* access modifiers changed from: protected */
    public final void a(Uc uc) {
        i();
        w();
        a((Runnable) new C1116gd(this, uc));
    }

    /* access modifiers changed from: protected */
    @VisibleForTesting
    public final void a(_a _aVar) {
        i();
        Preconditions.checkNotNull(_aVar);
        this.d = _aVar;
        I();
        K();
    }

    /* access modifiers changed from: private */
    public final void a(ComponentName componentName) {
        i();
        if (this.d != null) {
            this.d = null;
            e().A().a("Disconnected from device MeasurementService", componentName);
            i();
            F();
        }
    }

    private final void a(Runnable runnable) throws IllegalStateException {
        i();
        if (B()) {
            runnable.run();
        } else if (((long) this.h.size()) >= 1000) {
            e().s().a("Discarding data. Max runnable queue size reached");
        } else {
            this.h.add(runnable);
            this.i.a(60000);
            F();
        }
    }

    private final zzn a(boolean z) {
        a();
        return p().a(z ? e().B() : null);
    }

    public final void a(zf zfVar, zzai zzai, String str) {
        i();
        w();
        if (l().a((int) GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE) != 0) {
            e().v().a("Not bundling data. Service unavailable or out of date");
            l().a(zfVar, new byte[0]);
            return;
        }
        a((Runnable) new C1111fd(this, zzai, str, zfVar));
    }

    public final /* bridge */ /* synthetic */ be a() {
        return super.a();
    }
}
