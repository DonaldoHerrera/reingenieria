package defpackage;

import android.content.Context;
import android.os.Bundle;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: Pi reason: default package */
/* compiled from: DefaultAppMeasurementEventListenerRegistrar */
class Pi implements Hh {
    private static final List<Class<?>> a = Collections.unmodifiableList(Arrays.asList(new Class[]{String.class, String.class, Bundle.class, Long.class}));
    /* access modifiers changed from: private */
    public final Ei b;
    private Object c;

    public Pi(Ei ei) {
        this.b = ei;
    }

    private Object b(Class<?> cls) {
        try {
            return cls.getDeclaredMethod("getInstance", new Class[]{Context.class}).invoke(cls, new Object[]{this.b.e()});
        } catch (Exception unused) {
            return null;
        }
    }

    /* access modifiers changed from: private */
    public static void b(Ei ei, String str, Bundle bundle) {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("$A$:");
            sb.append(a(str, bundle));
            ei.a(sb.toString());
        } catch (JSONException unused) {
            C5701cNa e = C5328TMa.e();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Unable to serialize Firebase Analytics event; ");
            sb2.append(str);
            e.w("CrashlyticsCore", sb2.toString());
        }
    }

    public boolean a() {
        Class a2 = a("com.google.android.gms.measurement.AppMeasurement");
        String str = "CrashlyticsCore";
        if (a2 == null) {
            C5328TMa.e().d(str, "Firebase Analytics is not present; you will not see automatic logging of events before a crash occurs.");
            return false;
        }
        Object b2 = b(a2);
        if (b2 == null) {
            C5328TMa.e().w(str, "Cannot register AppMeasurement Listener for Crashlytics breadcrumbs: Could not create an instance of Firebase Analytics.");
            return false;
        }
        Class a3 = a("com.google.android.gms.measurement.AppMeasurement$OnEventListener");
        if (a3 == null) {
            C5328TMa.e().w(str, "Cannot register AppMeasurement Listener for Crashlytics breadcrumbs: Could not get class com.google.android.gms.measurement.AppMeasurement$OnEventListener");
            return false;
        }
        try {
            a2.getDeclaredMethod("registerOnMeasurementEventListener", new Class[]{a3}).invoke(b2, new Object[]{a(a3)});
        } catch (NoSuchMethodException e) {
            C5328TMa.e().b(str, "Cannot register AppMeasurement Listener for Crashlytics breadcrumbs: Method registerOnMeasurementEventListener not found.", e);
            return false;
        } catch (Exception e2) {
            C5701cNa e3 = C5328TMa.e();
            StringBuilder sb = new StringBuilder();
            sb.append("Cannot register AppMeasurement Listener for Crashlytics breadcrumbs: ");
            sb.append(e2.getMessage());
            e3.b(str, sb.toString(), e2);
        }
        return true;
    }

    private Class<?> a(String str) {
        try {
            return this.b.e().getClassLoader().loadClass(str);
        } catch (Exception unused) {
            return null;
        }
    }

    /* access modifiers changed from: 0000 */
    public synchronized Object a(Class cls) {
        if (this.c == null) {
            this.c = Proxy.newProxyInstance(this.b.e().getClassLoader(), new Class[]{cls}, new Oi(this));
        }
        return this.c;
    }

    static boolean a(Object[] objArr) {
        if (objArr.length != a.size()) {
            return false;
        }
        Iterator it = a.iterator();
        for (Object obj : objArr) {
            if (!obj.getClass().equals(it.next())) {
                return false;
            }
        }
        return true;
    }

    private static String a(String str, Bundle bundle) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        for (String str2 : bundle.keySet()) {
            jSONObject2.put(str2, bundle.get(str2));
        }
        jSONObject.put("name", str);
        jSONObject.put("parameters", jSONObject2);
        return jSONObject.toString();
    }
}
