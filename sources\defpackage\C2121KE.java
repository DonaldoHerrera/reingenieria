package defpackage;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.android.gms.measurement.AppMeasurement.ConditionalUserProperty;
import com.google.firebase.FirebaseApp;
import com.google.firebase.a;
import com.google.firebase.analytics.connector.internal.b;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: KE reason: default package and case insensitive filesystem */
public class C2121KE implements C2102JE {
    private static volatile C2102JE a;
    @VisibleForTesting
    private final AppMeasurement b;
    @VisibleForTesting
    final Map<String, Object> c = new ConcurrentHashMap();

    private C2121KE(AppMeasurement appMeasurement) {
        Preconditions.checkNotNull(appMeasurement);
        this.b = appMeasurement;
    }

    @KeepForSdk
    public static C2102JE a(FirebaseApp firebaseApp, Context context, C2235QE qe) {
        Preconditions.checkNotNull(firebaseApp);
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(qe);
        Preconditions.checkNotNull(context.getApplicationContext());
        if (a == null) {
            synchronized (C2121KE.class) {
                if (a == null) {
                    Bundle bundle = new Bundle(1);
                    if (firebaseApp.e()) {
                        qe.a(a.class, C2159ME.a, C2140LE.a);
                        bundle.putBoolean("dataCollectionDefaultEnabled", firebaseApp.isDataCollectionDefaultEnabled());
                    }
                    a = new C2121KE(AppMeasurement.a(context, bundle));
                }
            }
        }
        return a;
    }

    @KeepForSdk
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        if (str2 == null || b.a(str2, bundle)) {
            this.b.clearConditionalUserProperty(str, str2, bundle);
        }
    }

    @KeepForSdk
    public void a(String str, String str2, Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (b.a(str) && b.a(str2, bundle) && b.a(str, str2, bundle)) {
            this.b.logEventInternal(str, str2, bundle);
        }
    }

    @KeepForSdk
    public void a(String str, String str2, Object obj) {
        if (b.a(str) && b.a(str, str2)) {
            this.b.a(str, str2, obj);
        }
    }

    @KeepForSdk
    public Map<String, Object> a(boolean z) {
        return this.b.a(z);
    }

    @KeepForSdk
    public void a(a aVar) {
        if (b.a(aVar)) {
            this.b.setConditionalUserProperty(b.b(aVar));
        }
    }

    @KeepForSdk
    public List<a> a(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        for (ConditionalUserProperty a2 : this.b.getConditionalUserProperties(str, str2)) {
            arrayList.add(b.a(a2));
        }
        return arrayList;
    }

    @KeepForSdk
    public int a(String str) {
        return this.b.getMaxUserProperties(str);
    }

    static final /* synthetic */ void a(C2178NE ne) {
        boolean z = ((a) ne.a()).a;
        synchronized (C2121KE.class) {
            ((C2121KE) a).b.b(z);
        }
    }
}
