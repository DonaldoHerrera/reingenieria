package com.google.android.gms.measurement.internal;

import android.app.Application;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.api.internal.GoogleServices;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.CollectionUtils;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.sc reason: case insensitive filesystem */
public final class C1174sc extends C1095cc {
    @VisibleForTesting
    protected Mc c;
    private C1150nc d;
    private final Set<C1165qc> e = new CopyOnWriteArraySet();
    private boolean f;
    private final AtomicReference<String> g = new AtomicReference<>();
    @VisibleForTesting
    protected boolean h = true;

    protected C1174sc(Mb mb) {
        super(mb);
    }

    /* access modifiers changed from: private */
    public final void L() {
        if (f().e(p().B(), C1127j.qa)) {
            i();
            String a = b().t.a();
            if (a != null) {
                if ("unset".equals(a)) {
                    a("app", "_npa", (Object) null, c().currentTimeMillis());
                } else {
                    a("app", "_npa", (Object) Long.valueOf("true".equals(a) ? 1 : 0), c().currentTimeMillis());
                }
            }
        }
        if (!this.a.b() || !this.h) {
            e().z().a("Updating Scion state (FE)");
            q().E();
            return;
        }
        e().z().a("Recording app launch after enabling measurement for the first time (FE)");
        K();
    }

    /* access modifiers changed from: private */
    public final void d(boolean z) {
        i();
        g();
        w();
        e().z().a("Setting app measurement enabled (FE)", Boolean.valueOf(z));
        b().a(z);
        L();
    }

    public final String A() {
        Uc B = this.a.A().B();
        if (B != null) {
            return B.b;
        }
        return null;
    }

    public final String B() {
        Uc B = this.a.A().B();
        if (B != null) {
            return B.a;
        }
        return null;
    }

    public final String C() {
        if (this.a.m() != null) {
            return this.a.m();
        }
        try {
            return GoogleServices.getGoogleAppId();
        } catch (IllegalStateException e2) {
            this.a.e().s().a("getGoogleAppId failed with exception", e2);
            return null;
        }
    }

    public final String D() {
        g();
        return (String) this.g.get();
    }

    public final void E() {
        if (getContext().getApplicationContext() instanceof Application) {
            ((Application) getContext().getApplicationContext()).unregisterActivityLifecycleCallbacks(this.c);
        }
    }

    public final Boolean F() {
        AtomicReference atomicReference = new AtomicReference();
        return (Boolean) d().a(atomicReference, 15000, "boolean test flag value", new C1169rc(this, atomicReference));
    }

    public final String G() {
        AtomicReference atomicReference = new AtomicReference();
        return (String) d().a(atomicReference, 15000, "String test flag value", new Ac(this, atomicReference));
    }

    public final Long H() {
        AtomicReference atomicReference = new AtomicReference();
        return (Long) d().a(atomicReference, 15000, "long test flag value", new Dc(this, atomicReference));
    }

    public final Integer I() {
        AtomicReference atomicReference = new AtomicReference();
        return (Integer) d().a(atomicReference, 15000, "int test flag value", new Gc(this, atomicReference));
    }

    public final Double J() {
        AtomicReference atomicReference = new AtomicReference();
        return (Double) d().a(atomicReference, 15000, "double test flag value", new Fc(this, atomicReference));
    }

    public final void K() {
        i();
        g();
        w();
        if (this.a.t()) {
            q().D();
            this.h = false;
            String x = b().x();
            if (!TextUtils.isEmpty(x)) {
                j().o();
                if (!x.equals(VERSION.RELEASE)) {
                    Bundle bundle = new Bundle();
                    bundle.putString("_po", x);
                    b("auto", "_ou", bundle);
                }
            }
        }
    }

    public final void a(boolean z) {
        w();
        g();
        d().a((Runnable) new Ic(this, z));
    }

    public final void b(boolean z) {
        w();
        g();
        d().a((Runnable) new Hc(this, z));
    }

    public final void c(long j) {
        g();
        d().a((Runnable) new Jc(this, j));
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

    public final /* bridge */ /* synthetic */ void m() {
        super.m();
        throw null;
    }

    public final /* bridge */ /* synthetic */ C1084ab p() {
        return super.p();
    }

    public final /* bridge */ /* synthetic */ Yc q() {
        return super.q();
    }

    public final /* bridge */ /* synthetic */ Tc r() {
        return super.r();
    }

    public final /* bridge */ /* synthetic */ C1210zd t() {
        return super.t();
    }

    /* access modifiers changed from: protected */
    public final boolean y() {
        return false;
    }

    /* access modifiers changed from: 0000 */
    public final void c(String str, String str2, Bundle bundle) {
        g();
        i();
        a(str, str2, c().currentTimeMillis(), bundle);
    }

    public final void a(String str, String str2, Bundle bundle, boolean z) {
        a(str, str2, bundle, false, true, c().currentTimeMillis());
    }

    public final void b(long j) {
        g();
        d().a((Runnable) new Kc(this, j));
    }

    /* access modifiers changed from: 0000 */
    public final void a(String str, String str2, long j, Bundle bundle) {
        g();
        i();
        a(str, str2, j, bundle, true, this.d == null || Vd.e(str2), false, null);
    }

    /* access modifiers changed from: private */
    public final void d(Bundle bundle) {
        Bundle bundle2 = bundle;
        String str = "creation_timestamp";
        String str2 = "origin";
        String str3 = "app_id";
        i();
        w();
        Preconditions.checkNotNull(bundle);
        String str4 = "name";
        Preconditions.checkNotEmpty(bundle2.getString(str4));
        if (!this.a.b()) {
            e().z().a("Conditional property not cleared since collection is disabled");
            return;
        }
        zzjn zzjn = new zzjn(bundle2.getString(str4), 0, null, null);
        try {
            zzai a = l().a(bundle2.getString(str3), bundle2.getString("expired_event_name"), bundle2.getBundle("expired_event_params"), bundle2.getString(str2), bundle2.getLong(str), true, false);
            zzjn zzjn2 = zzjn;
            zzq zzq = new zzq(bundle2.getString(str3), bundle2.getString(str2), zzjn2, bundle2.getLong(str), bundle2.getBoolean("active"), bundle2.getString("trigger_event_name"), null, bundle2.getLong("trigger_timeout"), null, bundle2.getLong("time_to_live"), a);
            q().a(zzq);
        } catch (IllegalArgumentException unused) {
        }
    }

    public final List<zzjn> c(boolean z) {
        g();
        w();
        e().z().a("Fetching user attributes (FE)");
        if (d().s()) {
            e().s().a("Cannot get all user properties from analytics worker thread");
            return Collections.emptyList();
        } else if (be.a()) {
            e().s().a("Cannot get all user properties from main thread");
            return Collections.emptyList();
        } else {
            AtomicReference atomicReference = new AtomicReference();
            synchronized (atomicReference) {
                this.a.d().a((Runnable) new C1189vc(this, atomicReference, z));
                try {
                    atomicReference.wait(5000);
                } catch (InterruptedException e2) {
                    e().v().a("Interrupted waiting for get user properties", e2);
                }
            }
            List<zzjn> list = (List) atomicReference.get();
            if (list == null) {
                e().v().a("Timed out waiting for get user properties");
                list = Collections.emptyList();
            }
            return list;
        }
    }

    public final void b(String str, String str2, Bundle bundle) {
        a(str, str2, bundle, true, true, c().currentTimeMillis());
    }

    private final void b(String str, String str2, long j, Bundle bundle, boolean z, boolean z2, boolean z3, String str3) {
        Bundle b = Vd.b(bundle);
        Gb d2 = d();
        C1184uc ucVar = new C1184uc(this, str, str2, j, b, z, z2, z3, str3);
        d2.a((Runnable) ucVar);
    }

    /* access modifiers changed from: private */
    public final void a(String str, String str2, long j, Bundle bundle, boolean z, boolean z2, boolean z3, String str3) {
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        Uc uc;
        int i;
        int i2;
        ArrayList arrayList;
        long j2;
        Bundle bundle2;
        Class cls;
        String str9 = str;
        String str10 = str2;
        long j3 = j;
        Bundle bundle3 = bundle;
        String str11 = str3;
        Preconditions.checkNotEmpty(str);
        if (!f().e(str11, C1127j.va)) {
            Preconditions.checkNotEmpty(str2);
        }
        Preconditions.checkNotNull(bundle);
        i();
        w();
        if (!this.a.b()) {
            e().z().a("Event not sent since app measurement is disabled");
            return;
        }
        if (f().e(p().B(), C1127j.Da)) {
            List D = p().D();
            if (D != null && !D.contains(str10)) {
                e().z().a("Dropping non-safelisted event. event name, origin", str10, str9);
                return;
            }
        }
        int i3 = 0;
        if (!this.f) {
            this.f = true;
            try {
                if (!this.a.p()) {
                    cls = Class.forName("com.google.android.gms.tagmanager.TagManagerService", true, getContext().getClassLoader());
                } else {
                    cls = Class.forName("com.google.android.gms.tagmanager.TagManagerService");
                }
                try {
                    cls.getDeclaredMethod("initialize", new Class[]{Context.class}).invoke(null, new Object[]{getContext()});
                } catch (Exception e2) {
                    e().v().a("Failed to invoke Tag Manager's initialize() method", e2);
                }
            } catch (ClassNotFoundException unused) {
                e().y().a("Tag Manager is not found and thus will not be used");
            }
        }
        if (f().e(p().B(), C1127j.Ka) && "_cmp".equals(str10)) {
            String str12 = "gclid";
            if (bundle3.containsKey(str12)) {
                a("auto", "_lgclid", (Object) bundle3.getString(str12), c().currentTimeMillis());
            }
        }
        if (z3) {
            a();
            if (!"_iap".equals(str10)) {
                Vd F = this.a.F();
                String str13 = "event";
                int i4 = 2;
                if (F.b(str13, str10)) {
                    if (!F.a(str13, C1145mc.a, str10)) {
                        i4 = 13;
                    } else if (F.a(str13, 40, str10)) {
                        i4 = 0;
                    }
                }
                if (i4 != 0) {
                    e().u().a("Invalid public event name. Event will not be logged (FE)", k().a(str10));
                    this.a.F();
                    this.a.F().a(i4, "_ev", Vd.a(str10, 40, true), str10 != null ? str2.length() : 0);
                    return;
                }
            }
        }
        a();
        Uc A = r().A();
        String str14 = "_sc";
        if (A != null && !bundle3.containsKey(str14)) {
            A.d = true;
        }
        Tc.a(A, bundle3, z && z3);
        boolean equals = "am".equals(str9);
        boolean e3 = Vd.e(str2);
        if (z && this.d != null && !e3 && !equals) {
            e().z().a("Passing event to registered event handler (FE)", k().a(str10), k().a(bundle3));
            this.d.a(str, str2, bundle, j);
        } else if (this.a.t()) {
            int b = l().b(str10);
            if (b != 0) {
                e().u().a("Invalid event name. Event will not be logged (FE)", k().a(str10));
                l();
                String a = Vd.a(str10, 40, true);
                if (str10 != null) {
                    i3 = str2.length();
                }
                this.a.F().a(str3, b, "_ev", a, i3);
                return;
            }
            String str15 = "_sn";
            String str16 = "_o";
            String str17 = "_si";
            List listOf = CollectionUtils.listOf((T[]) new String[]{str16, str15, str14, str17});
            String str18 = str11;
            String str19 = str10;
            Bundle a2 = l().a(str3, str2, bundle, listOf, z3, true);
            Uc uc2 = (a2 == null || !a2.containsKey(str14) || !a2.containsKey(str17)) ? null : new Uc(a2.getString(str15), a2.getString(str14), Long.valueOf(a2.getLong(str17)).longValue());
            Uc uc3 = uc2 == null ? A : uc2;
            String str20 = "_ae";
            if (f().r(str18)) {
                a();
                if (r().A() != null && str20.equals(str19)) {
                    long C = t().C();
                    if (C > 0) {
                        l().a(a2, C);
                    }
                }
            }
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(a2);
            long nextLong = l().u().nextLong();
            if (!f().e(p().B(), C1127j.ja) || b().w.a() <= 0 || !b().a(j) || !b().z.a()) {
                str4 = str16;
            } else {
                e().A().a("Current session is expired, remove the session number and Id");
                if (f().e(p().B(), C1127j.fa)) {
                    str4 = str16;
                    a("auto", "_sid", (Object) null, c().currentTimeMillis());
                } else {
                    str4 = str16;
                }
                if (f().e(p().B(), C1127j.ga)) {
                    a("auto", "_sno", (Object) null, c().currentTimeMillis());
                }
            }
            if (!f().q(p().B()) || a2.getLong("extend_session", 0) != 1) {
                long j4 = j;
            } else {
                e().A().a("EXTEND_SESSION param attached: initiate a new session or extend the current active session");
                this.a.C().a(j, true);
            }
            String[] strArr = (String[]) a2.keySet().toArray(new String[bundle.size()]);
            Arrays.sort(strArr);
            int length = strArr.length;
            int i5 = 0;
            int i6 = 0;
            while (true) {
                str5 = "_eid";
                if (i5 >= length) {
                    break;
                }
                String str21 = strArr[i5];
                Object obj = a2.get(str21);
                l();
                String[] strArr2 = strArr;
                Bundle[] a3 = Vd.a(obj);
                if (a3 != null) {
                    i = length;
                    a2.putInt(str21, a3.length);
                    int i7 = 0;
                    while (i7 < a3.length) {
                        Bundle bundle4 = a3[i7];
                        Tc.a(uc3, bundle4, true);
                        String str22 = str5;
                        int i8 = i6;
                        int i9 = i7;
                        int i10 = i5;
                        long j5 = nextLong;
                        Bundle bundle5 = bundle4;
                        ArrayList arrayList3 = arrayList2;
                        Uc uc4 = uc3;
                        String str23 = str20;
                        Bundle bundle6 = a2;
                        Bundle a4 = l().a(str3, "_ep", bundle5, listOf, z3, false);
                        a4.putString("_en", str19);
                        a4.putLong(str22, j5);
                        a4.putString("_gn", str21);
                        a4.putInt("_ll", a3.length);
                        int i11 = i9;
                        a4.putInt("_i", i11);
                        arrayList3.add(a4);
                        int i12 = i11 + 1;
                        a2 = bundle6;
                        nextLong = j5;
                        arrayList2 = arrayList3;
                        i7 = i12;
                        i5 = i10;
                        uc3 = uc4;
                        i6 = i8;
                        str20 = str23;
                        str5 = str22;
                    }
                    uc = uc3;
                    i2 = i5;
                    j2 = nextLong;
                    arrayList = arrayList2;
                    str8 = str20;
                    bundle2 = a2;
                    i6 += a3.length;
                } else {
                    uc = uc3;
                    i = length;
                    i2 = i5;
                    int i13 = i6;
                    j2 = nextLong;
                    arrayList = arrayList2;
                    str8 = str20;
                    bundle2 = a2;
                }
                a2 = bundle2;
                nextLong = j2;
                arrayList2 = arrayList;
                length = i;
                uc3 = uc;
                str20 = str8;
                long j6 = j;
                i5 = i2 + 1;
                strArr = strArr2;
            }
            String str24 = str5;
            int i14 = i6;
            long j7 = nextLong;
            ArrayList arrayList4 = arrayList2;
            String str25 = str20;
            Bundle bundle7 = a2;
            if (i14 != 0) {
                bundle7.putLong(str24, j7);
                bundle7.putInt("_epc", i14);
            }
            int i15 = 0;
            while (i15 < arrayList4.size()) {
                Bundle bundle8 = (Bundle) arrayList4.get(i15);
                if (i15 != 0) {
                    str7 = "_ep";
                    str6 = str19;
                } else {
                    str7 = str19;
                    str6 = str7;
                }
                String str26 = str4;
                bundle8.putString(str26, str);
                if (z2) {
                    bundle8 = l().a(bundle8);
                }
                Bundle bundle9 = bundle8;
                e().z().a("Logging event (FE)", k().a(str6), k().a(bundle9));
                ArrayList arrayList5 = arrayList4;
                zzai zzai = new zzai(str7, new zzah(bundle9), str, j);
                q().a(zzai, str3);
                if (!equals) {
                    for (C1165qc onEvent : this.e) {
                        onEvent.onEvent(str, str2, new Bundle(bundle9), j);
                    }
                }
                i15++;
                str19 = str6;
                str4 = str26;
                arrayList4 = arrayList5;
            }
            String str27 = str19;
            a();
            if (r().A() != null && str25.equals(str27)) {
                t().a(true, true);
            }
        }
    }

    public final void b(C1165qc qcVar) {
        g();
        w();
        Preconditions.checkNotNull(qcVar);
        if (!this.e.remove(qcVar)) {
            e().v().a("OnEventListener had not been registered");
        }
    }

    public final void b(Bundle bundle) {
        Preconditions.checkNotNull(bundle);
        Preconditions.checkNotEmpty(bundle.getString("app_id"));
        m();
        throw null;
    }

    private final void b(Bundle bundle, long j) {
        Preconditions.checkNotNull(bundle);
        C1130jc.a(bundle, "app_id", String.class, null);
        String str = "origin";
        C1130jc.a(bundle, str, String.class, null);
        String str2 = "name";
        C1130jc.a(bundle, str2, String.class, null);
        String str3 = "value";
        C1130jc.a(bundle, str3, Object.class, null);
        String str4 = "trigger_event_name";
        C1130jc.a(bundle, str4, String.class, null);
        Long valueOf = Long.valueOf(0);
        String str5 = "trigger_timeout";
        C1130jc.a(bundle, str5, Long.class, valueOf);
        C1130jc.a(bundle, "timed_out_event_name", String.class, null);
        C1130jc.a(bundle, "timed_out_event_params", Bundle.class, null);
        C1130jc.a(bundle, "triggered_event_name", String.class, null);
        C1130jc.a(bundle, "triggered_event_params", Bundle.class, null);
        String str6 = "time_to_live";
        C1130jc.a(bundle, str6, Long.class, valueOf);
        C1130jc.a(bundle, "expired_event_name", String.class, null);
        C1130jc.a(bundle, "expired_event_params", Bundle.class, null);
        Preconditions.checkNotEmpty(bundle.getString(str2));
        Preconditions.checkNotEmpty(bundle.getString(str));
        Preconditions.checkNotNull(bundle.get(str3));
        bundle.putLong("creation_timestamp", j);
        String string = bundle.getString(str2);
        Object obj = bundle.get(str3);
        if (l().c(string) != 0) {
            e().s().a("Invalid conditional user property name", k().c(string));
        } else if (l().b(string, obj) != 0) {
            e().s().a("Invalid conditional user property value", k().c(string), obj);
        } else {
            Object c2 = l().c(string, obj);
            if (c2 == null) {
                e().s().a("Unable to normalize conditional user property value", k().c(string), obj);
                return;
            }
            C1130jc.a(bundle, c2);
            long j2 = bundle.getLong(str5);
            if (TextUtils.isEmpty(bundle.getString(str4)) || (j2 <= 15552000000L && j2 >= 1)) {
                long j3 = bundle.getLong(str6);
                if (j3 > 15552000000L || j3 < 1) {
                    e().s().a("Invalid conditional user property time to live", k().c(string), Long.valueOf(j3));
                    return;
                }
                d().a((Runnable) new C1209zc(this, bundle));
                return;
            }
            e().s().a("Invalid conditional user property timeout", k().c(string), Long.valueOf(j2));
        }
    }

    /* access modifiers changed from: private */
    public final void c(Bundle bundle) {
        Bundle bundle2 = bundle;
        String str = "app_id";
        i();
        w();
        Preconditions.checkNotNull(bundle);
        String str2 = "name";
        Preconditions.checkNotEmpty(bundle2.getString(str2));
        String str3 = "origin";
        Preconditions.checkNotEmpty(bundle2.getString(str3));
        String str4 = "value";
        Preconditions.checkNotNull(bundle2.get(str4));
        if (!this.a.b()) {
            e().z().a("Conditional property not sent since collection is disabled");
            return;
        }
        zzjn zzjn = new zzjn(bundle2.getString(str2), bundle2.getLong("triggered_timestamp"), bundle2.get(str4), bundle2.getString(str3));
        try {
            zzai a = l().a(bundle2.getString(str), bundle2.getString("triggered_event_name"), bundle2.getBundle("triggered_event_params"), bundle2.getString(str3), 0, true, false);
            zzq zzq = new zzq(bundle2.getString(str), bundle2.getString(str3), zzjn, bundle2.getLong("creation_timestamp"), false, bundle2.getString("trigger_event_name"), l().a(bundle2.getString(str), bundle2.getString("timed_out_event_name"), bundle2.getBundle("timed_out_event_params"), bundle2.getString(str3), 0, true, false), bundle2.getLong("trigger_timeout"), a, bundle2.getLong("time_to_live"), l().a(bundle2.getString(str), bundle2.getString("expired_event_name"), bundle2.getBundle("expired_event_params"), bundle2.getString(str3), 0, true, false));
            q().a(zzq);
        } catch (IllegalArgumentException unused) {
        }
    }

    public final /* bridge */ /* synthetic */ Gb d() {
        return super.d();
    }

    public final /* bridge */ /* synthetic */ Clock c() {
        return super.c();
    }

    private final void b(String str, String str2, String str3, Bundle bundle) {
        long currentTimeMillis = c().currentTimeMillis();
        Preconditions.checkNotEmpty(str2);
        Bundle bundle2 = new Bundle();
        if (str != null) {
            bundle2.putString("app_id", str);
        }
        bundle2.putString("name", str2);
        bundle2.putLong("creation_timestamp", currentTimeMillis);
        if (str3 != null) {
            bundle2.putString("expired_event_name", str3);
            bundle2.putBundle("expired_event_params", bundle);
        }
        d().a((Runnable) new C1204yc(this, bundle2));
    }

    public final ArrayList<Bundle> b(String str, String str2) {
        g();
        return b((String) null, str, str2);
    }

    @VisibleForTesting
    private final ArrayList<Bundle> b(String str, String str2, String str3) {
        if (d().s()) {
            e().s().a("Cannot get conditional user properties from analytics worker thread");
            return new ArrayList<>(0);
        } else if (be.a()) {
            e().s().a("Cannot get conditional user properties from main thread");
            return new ArrayList<>(0);
        } else {
            AtomicReference atomicReference = new AtomicReference();
            synchronized (atomicReference) {
                Gb d2 = this.a.d();
                Bc bc = new Bc(this, atomicReference, str, str2, str3);
                d2.a((Runnable) bc);
                try {
                    atomicReference.wait(5000);
                } catch (InterruptedException e2) {
                    e().v().a("Interrupted waiting for get conditional user properties", str, e2);
                }
            }
            List list = (List) atomicReference.get();
            if (list != null) {
                return Vd.b(list);
            }
            e().v().a("Timed out waiting for get conditional user properties", str);
            return new ArrayList<>();
        }
    }

    @VisibleForTesting
    private final Map<String, Object> b(String str, String str2, String str3, boolean z) {
        if (d().s()) {
            e().s().a("Cannot get user properties from analytics worker thread");
            return Collections.emptyMap();
        } else if (be.a()) {
            e().s().a("Cannot get user properties from main thread");
            return Collections.emptyMap();
        } else {
            AtomicReference atomicReference = new AtomicReference();
            synchronized (atomicReference) {
                Gb d2 = this.a.d();
                Ec ec = new Ec(this, atomicReference, str, str2, str3, z);
                d2.a((Runnable) ec);
                try {
                    atomicReference.wait(5000);
                } catch (InterruptedException e2) {
                    e().v().a("Interrupted waiting for get user properties", e2);
                }
            }
            List<zzjn> list = (List) atomicReference.get();
            if (list == null) {
                e().v().a("Timed out waiting for get user properties");
                return Collections.emptyMap();
            }
            T t = new T(list.size());
            for (zzjn zzjn : list) {
                t.put(zzjn.b, zzjn.i());
            }
            return t;
        }
    }

    public final /* bridge */ /* synthetic */ C1168rb b() {
        return super.b();
    }

    public final void a(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) {
        boolean z3;
        g();
        String str3 = str == null ? "app" : str;
        Bundle bundle2 = bundle == null ? new Bundle() : bundle;
        if (z2) {
            if (this.d != null && !Vd.e(str2)) {
                z3 = false;
                b(str3, str2, j, bundle2, z2, z3, !z, null);
            }
        }
        z3 = true;
        b(str3, str2, j, bundle2, z2, z3, !z, null);
    }

    public final void a(String str, String str2, Object obj, boolean z) {
        a(str, str2, obj, z, c().currentTimeMillis());
    }

    public final void a(String str, String str2, Object obj, boolean z, long j) {
        if (str == null) {
            str = "app";
        }
        String str3 = str;
        int i = 6;
        int i2 = 0;
        if (z) {
            i = l().c(str2);
        } else {
            Vd l = l();
            String str4 = "user property";
            if (l.b(str4, str2)) {
                if (!l.a(str4, C1155oc.a, str2)) {
                    i = 15;
                } else if (l.a(str4, 24, str2)) {
                    i = 0;
                }
            }
        }
        String str5 = "_ev";
        if (i != 0) {
            l();
            String a = Vd.a(str2, 24, true);
            if (str2 != null) {
                i2 = str2.length();
            }
            this.a.F().a(i, str5, a, i2);
        } else if (obj != null) {
            int b = l().b(str2, obj);
            if (b != 0) {
                l();
                String a2 = Vd.a(str2, 24, true);
                if ((obj instanceof String) || (obj instanceof CharSequence)) {
                    i2 = String.valueOf(obj).length();
                }
                this.a.F().a(b, str5, a2, i2);
                return;
            }
            Object c2 = l().c(str2, obj);
            if (c2 != null) {
                a(str3, str2, j, c2);
            }
        } else {
            a(str3, str2, j, (Object) null);
        }
    }

    private final void a(String str, String str2, long j, Object obj) {
        Gb d2 = d();
        C1179tc tcVar = new C1179tc(this, str, str2, obj, j);
        d2.a((Runnable) tcVar);
    }

    /* JADX WARNING: type inference failed for: r11v0, types: [java.lang.Object] */
    /* JADX WARNING: type inference failed for: r6v0, types: [java.lang.Object] */
    /* JADX WARNING: type inference failed for: r6v1 */
    /* JADX WARNING: type inference failed for: r6v2 */
    /* JADX WARNING: type inference failed for: r6v3 */
    /* JADX WARNING: type inference failed for: r0v7 */
    /* JADX WARNING: type inference failed for: r10v14, types: [java.lang.Long] */
    /* JADX WARNING: type inference failed for: r6v5 */
    /* JADX WARNING: type inference failed for: r6v6 */
    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Incorrect type for immutable var: ssa=java.lang.Object, code=null, for r11v0, types: [java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r6v2
  assigns: []
  uses: []
  mth insns count: 71
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
    	at java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
    	at jadx.core.ProcessClass.process(ProcessClass.java:35)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x008f  */
    /* JADX WARNING: Unknown variable types count: 5 */
    public final void a(String str, String str2, Object r11, long j) {
        ? r6;
        String str3;
        ? r62;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        i();
        g();
        w();
        String str4 = "_npa";
        if (f().e(p().B(), C1127j.qa) && "allow_personalized_ads".equals(str2)) {
            if (r11 instanceof String) {
                String str5 = (String) r11;
                if (!TextUtils.isEmpty(str5)) {
                    String str6 = "false";
                    ? valueOf = Long.valueOf(str6.equals(str5.toLowerCase(Locale.ENGLISH)) ? 1 : 0);
                    C1203yb ybVar = b().t;
                    if (valueOf.longValue() == 1) {
                        str6 = "true";
                    }
                    ybVar.a(str6);
                    r62 = valueOf;
                    str3 = str4;
                    r6 = r62;
                    if (!this.a.b()) {
                        e().z().a("User property not set since app measurement is disabled");
                        return;
                    } else if (this.a.t()) {
                        e().z().a("Setting user property (FE)", k().a(str3), r6);
                        zzjn zzjn = new zzjn(str3, j, r6, str);
                        q().a(zzjn);
                        return;
                    } else {
                        return;
                    }
                }
            }
            if (r11 == 0) {
                b().t.a("unset");
                r62 = r11;
                str3 = str4;
                r6 = r62;
                if (!this.a.b()) {
                }
            }
        }
        str3 = str2;
        r6 = r11;
        if (!this.a.b()) {
        }
    }

    /* access modifiers changed from: 0000 */
    public final void a(String str) {
        this.g.set(str);
    }

    public final void a(long j) {
        a((String) null);
        d().a((Runnable) new C1199xc(this, j));
    }

    public final void a(C1150nc ncVar) {
        i();
        g();
        w();
        if (ncVar != null) {
            C1150nc ncVar2 = this.d;
            if (ncVar != ncVar2) {
                Preconditions.checkState(ncVar2 == null, "EventInterceptor already set.");
            }
        }
        this.d = ncVar;
    }

    public final void a(C1165qc qcVar) {
        g();
        w();
        Preconditions.checkNotNull(qcVar);
        if (!this.e.add(qcVar)) {
            e().v().a("OnEventListener already registered");
        }
    }

    public final void a(Bundle bundle) {
        a(bundle, c().currentTimeMillis());
    }

    public final void a(Bundle bundle, long j) {
        Preconditions.checkNotNull(bundle);
        g();
        Bundle bundle2 = new Bundle(bundle);
        String str = "app_id";
        if (!TextUtils.isEmpty(bundle2.getString(str))) {
            e().v().a("Package name should be null when calling setConditionalUserProperty");
        }
        bundle2.remove(str);
        b(bundle2, j);
    }

    public final void a(String str, String str2, Bundle bundle) {
        g();
        b((String) null, str, str2, bundle);
    }

    public final void a(String str, String str2, String str3, Bundle bundle) {
        Preconditions.checkNotEmpty(str);
        m();
        throw null;
    }

    public final ArrayList<Bundle> a(String str, String str2, String str3) {
        Preconditions.checkNotEmpty(str);
        m();
        throw null;
    }

    public final Map<String, Object> a(String str, String str2, boolean z) {
        g();
        return b((String) null, str, str2, z);
    }

    public final Map<String, Object> a(String str, String str2, String str3, boolean z) {
        Preconditions.checkNotEmpty(str);
        m();
        throw null;
    }

    public final /* bridge */ /* synthetic */ be a() {
        return super.a();
    }
}
