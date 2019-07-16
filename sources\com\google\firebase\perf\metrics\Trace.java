package com.google.firebase.perf.metrics;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.Log;
import androidx.annotation.Keep;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.firebase-perf.A;
import com.google.android.gms.internal.firebase-perf.C0911y;
import com.google.android.gms.internal.firebase-perf.zzbg;
import com.google.firebase.perf.internal.GaugeManager;
import com.google.firebase.perf.internal.SessionManager;
import com.google.firebase.perf.internal.a;
import com.google.firebase.perf.internal.b;
import com.google.firebase.perf.internal.c;
import com.google.firebase.perf.internal.q;
import com.google.firebase.perf.internal.y;
import com.google.firebase.perf.internal.zzq;
import java.lang.ref.WeakReference;
import java.util.AbstractMap.SimpleEntry;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

public class Trace extends b implements Parcelable, y {
    @Keep
    public static final Creator<Trace> CREATOR = new b();
    private static final Map<String, Trace> a = new ConcurrentHashMap();
    @VisibleForTesting
    private static final Creator<Trace> b = new d();
    private final Trace c;
    private final GaugeManager d;
    private final String e;
    private final List<zzq> f;
    private final List<Trace> g;
    private final Map<String, zza> h;
    private final C0911y i;
    private final c j;
    private final Map<String, String> k;
    private zzbg l;
    private zzbg m;
    private final WeakReference<y> n;

    private Trace(String str) {
        this(str, c.a(), new C0911y(), a.a(), GaugeManager.zzbf());
    }

    private final zza b(String str) {
        zza zza = (zza) this.h.get(str);
        if (zza != null) {
            return zza;
        }
        zza zza2 = new zza(str);
        this.h.put(str, zza2);
        return zza2;
    }

    @VisibleForTesting
    private final boolean g() {
        return this.l != null;
    }

    @VisibleForTesting
    private final boolean h() {
        return this.m != null;
    }

    public final void a(zzq zzq) {
        if (g() && !h()) {
            this.f.add(zzq);
        }
    }

    /* access modifiers changed from: 0000 */
    @VisibleForTesting
    public final Map<String, zza> c() {
        return this.h;
    }

    /* access modifiers changed from: 0000 */
    @VisibleForTesting
    public final zzbg d() {
        return this.l;
    }

    @Keep
    public int describeContents() {
        return 0;
    }

    /* access modifiers changed from: 0000 */
    @VisibleForTesting
    public final zzbg e() {
        return this.m;
    }

    /* access modifiers changed from: 0000 */
    @VisibleForTesting
    public final List<Trace> f() {
        return this.g;
    }

    /* access modifiers changed from: protected */
    public void finalize() throws Throwable {
        try {
            if (g() && !h()) {
                Log.w("FirebasePerformance", String.format("Trace '%s' is started but not stopped when it is destructed!", new Object[]{this.e}));
                zzc(1);
            }
        } finally {
            super.finalize();
        }
    }

    @Keep
    public String getAttribute(String str) {
        return (String) this.k.get(str);
    }

    @Keep
    public Map<String, String> getAttributes() {
        return new HashMap(this.k);
    }

    @Keep
    public long getLongMetric(String str) {
        zza zza = str != null ? (zza) this.h.get(str.trim()) : null;
        if (zza == null) {
            return 0;
        }
        return zza.a();
    }

    @Keep
    public void incrementMetric(String str, long j2) {
        String a2 = q.a(str);
        String str2 = "FirebasePerformance";
        if (a2 != null) {
            Log.e(str2, String.format("Cannot increment metric %s. Metric name is invalid.(%s)", new Object[]{str, a2}));
        } else if (!g()) {
            Log.w(str2, String.format("Cannot increment metric '%s' for trace '%s' because it's not started", new Object[]{str, this.e}));
        } else if (h()) {
            Log.w(str2, String.format("Cannot increment metric '%s' for trace '%s' because it's been stopped", new Object[]{str, this.e}));
        } else {
            b(str.trim()).a(j2);
        }
    }

    @Keep
    public void putAttribute(String str, String str2) {
        boolean z = false;
        try {
            str = str.trim();
            str2 = str2.trim();
            if (!h()) {
                if (!this.k.containsKey(str)) {
                    if (this.k.size() >= 5) {
                        throw new IllegalArgumentException(String.format(Locale.US, "Exceeds max limit of number of attributes - %d", new Object[]{Integer.valueOf(5)}));
                    }
                }
                String a2 = q.a((Entry<String, String>) new SimpleEntry<String,String>(str, str2));
                if (a2 == null) {
                    z = true;
                    if (z) {
                        this.k.put(str, str2);
                        return;
                    }
                    return;
                }
                throw new IllegalArgumentException(a2);
            }
            throw new IllegalArgumentException(String.format(Locale.US, "Trace %s has been stopped", new Object[]{this.e}));
        } catch (Exception e2) {
            Object[] objArr = {str, str2, e2.getMessage()};
            Log.e("FirebasePerformance", String.format("Can not set attribute %s with value %s (%s)", objArr));
        }
    }

    @Keep
    public void putMetric(String str, long j2) {
        String a2 = q.a(str);
        String str2 = "FirebasePerformance";
        if (a2 != null) {
            Log.e(str2, String.format("Cannot set value for metric %s. Metric name is invalid.(%s)", new Object[]{str, a2}));
        } else if (!g()) {
            Log.w(str2, String.format("Cannot set value for metric '%s' for trace '%s' because it's not started", new Object[]{str, this.e}));
        } else if (h()) {
            Log.w(str2, String.format("Cannot set value for metric '%s' for trace '%s' because it's been stopped", new Object[]{str, this.e}));
        } else {
            b(str.trim()).b(j2);
        }
    }

    @Keep
    public void removeAttribute(String str) {
        if (h()) {
            Log.e("FirebasePerformance", "Can't remove a attribute from a Trace that's stopped.");
        } else {
            this.k.remove(str);
        }
    }

    @Keep
    public void start() {
        String str;
        String str2 = this.e;
        if (str2 == null) {
            str = "Trace name must not be null";
        } else if (str2.length() > 100) {
            str = String.format(Locale.US, "Trace name must not exceed %d characters", new Object[]{Integer.valueOf(100)});
        } else {
            if (str2.startsWith("_")) {
                A[] values = A.values();
                int length = values.length;
                int i2 = 0;
                while (true) {
                    if (i2 < length) {
                        if (values[i2].toString().equals(str2)) {
                            break;
                        }
                        i2++;
                    } else if (!str2.startsWith("_st_")) {
                        str = "Trace name must not start with '_'";
                    }
                }
            }
            str = null;
        }
        String str3 = "FirebasePerformance";
        if (str != null) {
            Log.e(str3, String.format("Cannot start trace %s. Trace name is invalid.(%s)", new Object[]{this.e, str}));
        } else if (this.l != null) {
            Log.e(str3, String.format("Trace '%s' has already started, should not start again!", new Object[]{this.e}));
        } else {
            zzay();
            zzq zzcg = SessionManager.zzcf().zzcg();
            SessionManager.zzcf().zzc(this.n);
            this.f.add(zzcg);
            this.l = new zzbg();
            Log.i(str3, String.format("Session ID - %s", new Object[]{zzcg.c()}));
            if (zzcg.d()) {
                this.d.zzbh();
            }
        }
    }

    @Keep
    public void stop() {
        String str = "FirebasePerformance";
        if (!g()) {
            Log.e(str, String.format("Trace '%s' has not been started so unable to stop!", new Object[]{this.e}));
        } else if (h()) {
            Log.e(str, String.format("Trace '%s' has already stopped, should not stop again!", new Object[]{this.e}));
        } else {
            SessionManager.zzcf().zzd(this.n);
            zzaz();
            this.m = new zzbg();
            if (this.c == null) {
                zzbg zzbg = this.m;
                if (!this.g.isEmpty()) {
                    Trace trace = (Trace) this.g.get(this.g.size() - 1);
                    if (trace.m == null) {
                        trace.m = zzbg;
                    }
                }
                if (!this.e.isEmpty()) {
                    c cVar = this.j;
                    if (cVar != null) {
                        cVar.a(new c(this).a(), zzal());
                        if (SessionManager.zzcf().zzcg().d()) {
                            this.d.zzbh();
                        }
                    }
                } else {
                    Log.e(str, "Trace name is empty, no log is sent to server");
                }
            }
        }
    }

    @Keep
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeParcelable(this.c, 0);
        parcel.writeString(this.e);
        parcel.writeList(this.g);
        parcel.writeMap(this.h);
        parcel.writeParcelable(this.l, 0);
        parcel.writeParcelable(this.m, 0);
        parcel.writeList(this.f);
    }

    public static Trace a(String str) {
        return new Trace(str);
    }

    /* access modifiers changed from: 0000 */
    @VisibleForTesting
    public final String a() {
        return this.e;
    }

    /* access modifiers changed from: 0000 */
    @VisibleForTesting
    public final List<zzq> b() {
        return this.f;
    }

    public Trace(String str, c cVar, C0911y yVar, a aVar) {
        this(str, cVar, yVar, aVar, GaugeManager.zzbf());
    }

    private Trace(String str, c cVar, C0911y yVar, a aVar, GaugeManager gaugeManager) {
        super(aVar);
        this.n = new WeakReference<>(this);
        this.c = null;
        this.e = str.trim();
        this.g = new ArrayList();
        this.h = new ConcurrentHashMap();
        this.k = new ConcurrentHashMap();
        this.i = yVar;
        this.j = cVar;
        this.f = new ArrayList();
        this.d = gaugeManager;
    }

    private Trace(Parcel parcel, boolean z) {
        super(z ? null : a.a());
        this.n = new WeakReference<>(this);
        this.c = (Trace) parcel.readParcelable(Trace.class.getClassLoader());
        this.e = parcel.readString();
        this.g = new ArrayList();
        parcel.readList(this.g, Trace.class.getClassLoader());
        this.h = new ConcurrentHashMap();
        this.k = new ConcurrentHashMap();
        parcel.readMap(this.h, zza.class.getClassLoader());
        this.l = (zzbg) parcel.readParcelable(zzbg.class.getClassLoader());
        this.m = (zzbg) parcel.readParcelable(zzbg.class.getClassLoader());
        this.f = new ArrayList();
        parcel.readList(this.f, zzq.class.getClassLoader());
        if (z) {
            this.j = null;
            this.i = null;
            this.d = null;
            return;
        }
        this.j = c.a();
        this.i = new C0911y();
        this.d = GaugeManager.zzbf();
    }

    /* synthetic */ Trace(Parcel parcel, boolean z, b bVar) {
        this(parcel, z);
    }
}
