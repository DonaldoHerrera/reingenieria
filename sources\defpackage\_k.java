package defpackage;

import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.util.Log;
import com.facebook.B;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: _k reason: default package */
/* compiled from: InAppPurchaseActivityLifecycleTracker */
public class _k {
    private static final String a = "_k";
    private static final AtomicBoolean b = new AtomicBoolean(false);
    private static Boolean c = null;
    /* access modifiers changed from: private */
    public static Boolean d = null;
    private static ServiceConnection e;
    private static ActivityLifecycleCallbacks f;
    private static Intent g;
    /* access modifiers changed from: private */
    public static Object h;

    public static void c() {
        d();
        if (c.booleanValue() && Uk.a()) {
            e();
        }
    }

    private static void d() {
        if (c == null) {
            try {
                Class.forName("com.android.vending.billing.IInAppBillingService$Stub");
                c = Boolean.valueOf(true);
                try {
                    Class.forName("com.android.billingclient.api.ProxyBillingActivity");
                    d = Boolean.valueOf(true);
                } catch (ClassNotFoundException unused) {
                    d = Boolean.valueOf(false);
                }
                C0311al.a();
                g = new Intent("com.android.vending.billing.InAppBillingService.BIND").setPackage("com.android.vending");
                e = new Wk();
                f = new Zk();
            } catch (ClassNotFoundException unused2) {
                c = Boolean.valueOf(false);
            }
        }
    }

    private static void e() {
        if (b.compareAndSet(false, true)) {
            Context e2 = B.e();
            if (e2 instanceof Application) {
                ((Application) e2).registerActivityLifecycleCallbacks(f);
                e2.bindService(g, e, 1);
            }
        }
    }

    /* access modifiers changed from: private */
    public static void b(Context context, ArrayList<String> arrayList) {
        if (!arrayList.isEmpty()) {
            HashMap hashMap = new HashMap();
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                try {
                    String string = new JSONObject(str).getString("productId");
                    hashMap.put(string, str);
                    arrayList2.add(string);
                } catch (JSONException e2) {
                    Log.e(a, "Error parsing in-app purchase data.", e2);
                }
            }
            for (Entry entry : C0311al.a(context, arrayList2, h, false).entrySet()) {
                Uk.a((String) hashMap.get(entry.getKey()), (String) entry.getValue());
            }
        }
    }

    /* access modifiers changed from: private */
    public static void b(Context context, Map<String, C1268el> map, Map<String, String> map2) {
        if (!map.isEmpty()) {
            HashMap hashMap = new HashMap();
            ArrayList arrayList = new ArrayList();
            for (String str : map.keySet()) {
                try {
                    String string = new JSONObject(str).getString("productId");
                    arrayList.add(string);
                    hashMap.put(string, str);
                } catch (JSONException e2) {
                    Log.e(a, "Error parsing in-app purchase data.", e2);
                }
            }
            Map a2 = C0311al.a(context, arrayList, h, true);
            for (String str2 : a2.keySet()) {
                String str3 = (String) hashMap.get(str2);
                Uk.a((C1268el) map.get(str3), str3, (String) a2.get(str2), map2);
            }
        }
    }
}
