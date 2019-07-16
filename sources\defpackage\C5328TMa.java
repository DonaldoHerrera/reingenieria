package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: TMa reason: default package and case insensitive filesystem */
/* compiled from: Fabric */
public class C5328TMa {
    static volatile C5328TMa a;
    static final C5701cNa b = new C5238QMa();
    private final Context c;
    private final Map<Class<? extends C5531_Ma>, C5531_Ma> d;
    private final ExecutorService e;
    private final Handler f;
    /* access modifiers changed from: private */
    public final C5444XMa<C5328TMa> g;
    private final C5444XMa<?> h;
    private final C4931GNa i;
    private C5208PMa j;
    private WeakReference<Activity> k;
    /* access modifiers changed from: private */
    public AtomicBoolean l = new AtomicBoolean(false);
    final C5701cNa m;
    final boolean n;

    /* renamed from: TMa$a */
    /* compiled from: Fabric */
    public static class a {
        private final Context a;
        private C5531_Ma[] b;
        private C6366eOa c;
        private Handler d;
        private C5701cNa e;
        private boolean f;
        private String g;
        private String h;
        private C5444XMa<C5328TMa> i;

        public a(Context context) {
            if (context != null) {
                this.a = context;
                return;
            }
            throw new IllegalArgumentException("Context must not be null.");
        }

        public a a(C5531_Ma... _maArr) {
            if (this.b == null) {
                if (!C7598wNa.a(this.a).a()) {
                    ArrayList arrayList = new ArrayList();
                    boolean z = false;
                    for (C5531_Ma _ma : _maArr) {
                        String v = _ma.v();
                        char c2 = 65535;
                        int hashCode = v.hashCode();
                        if (hashCode != 607220212) {
                            if (hashCode == 1830452504 && v.equals("com.crashlytics.sdk.android:crashlytics")) {
                                c2 = 0;
                            }
                        } else if (v.equals("com.crashlytics.sdk.android:answers")) {
                            c2 = 1;
                        }
                        if (c2 == 0 || c2 == 1) {
                            arrayList.add(_ma);
                        } else if (!z) {
                            C5328TMa.e().w("Fabric", "Fabric will not initialize any kits when Firebase automatic data collection is disabled; to use Third-party kits with automatic data collection disabled, initialize these kits via non-Fabric means.");
                            z = true;
                        }
                    }
                    _maArr = (C5531_Ma[]) arrayList.toArray(new C5531_Ma[0]);
                }
                this.b = _maArr;
                return this;
            }
            throw new IllegalStateException("Kits already set.");
        }

        public C5328TMa a() {
            Map map;
            if (this.c == null) {
                this.c = C6366eOa.a();
            }
            if (this.d == null) {
                this.d = new Handler(Looper.getMainLooper());
            }
            if (this.e == null) {
                if (this.f) {
                    this.e = new C5238QMa(3);
                } else {
                    this.e = new C5238QMa();
                }
            }
            if (this.h == null) {
                this.h = this.a.getPackageName();
            }
            if (this.i == null) {
                this.i = C5444XMa.a;
            }
            C5531_Ma[] _maArr = this.b;
            if (_maArr == null) {
                map = new HashMap();
            } else {
                map = C5328TMa.b((Collection<? extends C5531_Ma>) Arrays.asList(_maArr));
            }
            Map map2 = map;
            Context applicationContext = this.a.getApplicationContext();
            C5328TMa tMa = new C5328TMa(applicationContext, map2, this.c, this.d, this.e, this.f, this.i, new C4931GNa(applicationContext, this.h, this.g, map2.values()), C5328TMa.d(this.a));
            return tMa;
        }
    }

    C5328TMa(Context context, Map<Class<? extends C5531_Ma>, C5531_Ma> map, C6366eOa eoa, Handler handler, C5701cNa cna, boolean z, C5444XMa xMa, C4931GNa gNa, Activity activity) {
        this.c = context;
        this.d = map;
        this.e = eoa;
        this.f = handler;
        this.m = cna;
        this.n = z;
        this.g = xMa;
        this.h = a(map.size());
        this.i = gNa;
        a(activity);
    }

    public static C5328TMa c(C5328TMa tMa) {
        if (a == null) {
            synchronized (C5328TMa.class) {
                if (a == null) {
                    d(tMa);
                }
            }
        }
        return a;
    }

    private static void d(C5328TMa tMa) {
        a = tMa;
        tMa.j();
    }

    public static C5701cNa e() {
        if (a == null) {
            return b;
        }
        return a.m;
    }

    public static boolean g() {
        if (a == null) {
            return false;
        }
        return a.n;
    }

    public static boolean h() {
        return a != null && a.l.get();
    }

    static C5328TMa i() {
        if (a != null) {
            return a;
        }
        throw new IllegalStateException("Must Initialize Fabric before using singleton()");
    }

    private void j() {
        this.j = new C5208PMa(this.c);
        this.j.a(new C5268RMa(this));
        c(this.c);
    }

    public String c() {
        return "io.fabric.sdk.android:fabric";
    }

    public String f() {
        return "1.4.8.32";
    }

    public ExecutorService b() {
        return this.e;
    }

    /* access modifiers changed from: private */
    public static Map<Class<? extends C5531_Ma>, C5531_Ma> b(Collection<? extends C5531_Ma> collection) {
        HashMap hashMap = new HashMap(collection.size());
        a((Map<Class<? extends C5531_Ma>, C5531_Ma>) hashMap, collection);
        return hashMap;
    }

    /* access modifiers changed from: private */
    public static Activity d(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        return null;
    }

    public static C5328TMa a(Context context, C5531_Ma... _maArr) {
        if (a == null) {
            synchronized (C5328TMa.class) {
                if (a == null) {
                    a aVar = new a(context);
                    aVar.a(_maArr);
                    d(aVar.a());
                }
            }
        }
        return a;
    }

    public Collection<C5531_Ma> d() {
        return this.d.values();
    }

    /* access modifiers changed from: 0000 */
    public Future<Map<String, C5633bNa>> b(Context context) {
        return b().submit(new C5386VMa(context.getPackageCodePath()));
    }

    /* access modifiers changed from: 0000 */
    public void c(Context context) {
        StringBuilder sb;
        Future b2 = b(context);
        Collection d2 = d();
        C6297dNa dna = new C6297dNa(b2, d2);
        ArrayList<C5531_Ma> arrayList = new ArrayList<>(d2);
        Collections.sort(arrayList);
        dna.a(context, this, C5444XMa.a, this.i);
        for (C5531_Ma a2 : arrayList) {
            a2.a(context, this, this.h, this.i);
        }
        dna.J();
        String str = "Fabric";
        String str2 = " [Version: ";
        if (e().isLoggable(str, 3)) {
            sb = new StringBuilder("Initializing ");
            sb.append(c());
            sb.append(str2);
            sb.append(f());
            sb.append("], with the following kits:\n");
        } else {
            sb = null;
        }
        for (C5531_Ma _ma : arrayList) {
            _ma.b.a((C6434fOa) dna.b);
            a(this.d, _ma);
            _ma.J();
            if (sb != null) {
                sb.append(_ma.v());
                sb.append(str2);
                sb.append(_ma.x());
                sb.append("]\n");
            }
        }
        if (sb != null) {
            e().d(str, sb.toString());
        }
    }

    public C5328TMa a(Activity activity) {
        this.k = new WeakReference<>(activity);
        return this;
    }

    public Activity a() {
        WeakReference<Activity> weakReference = this.k;
        if (weakReference != null) {
            return (Activity) weakReference.get();
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    public void a(Map<Class<? extends C5531_Ma>, C5531_Ma> map, C5531_Ma _ma) {
        Class[] value;
        C5445XNa xNa = _ma.f;
        if (xNa != null) {
            for (Class cls : xNa.value()) {
                if (cls.isInterface()) {
                    for (C5531_Ma _ma2 : map.values()) {
                        if (cls.isAssignableFrom(_ma2.getClass())) {
                            _ma.b.a((C6434fOa) _ma2.b);
                        }
                    }
                } else if (((C5531_Ma) map.get(cls)) != null) {
                    _ma.b.a((C6434fOa) ((C5531_Ma) map.get(cls)).b);
                } else {
                    throw new C6502gOa("Referenced Kit was null, does the kit exist?");
                }
            }
        }
    }

    public static <T extends C5531_Ma> T a(Class<T> cls) {
        return (C5531_Ma) i().d.get(cls);
    }

    private static void a(Map<Class<? extends C5531_Ma>, C5531_Ma> map, Collection<? extends C5531_Ma> collection) {
        for (C5531_Ma _ma : collection) {
            map.put(_ma.getClass(), _ma);
            if (_ma instanceof C5565aNa) {
                a(map, ((C5565aNa) _ma).c());
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public C5444XMa<?> a(int i2) {
        return new C5298SMa(this, i2);
    }
}
