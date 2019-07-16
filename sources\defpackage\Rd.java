package defpackage;

import android.os.Bundle;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: Rd reason: default package */
/* compiled from: BundleSavedStateRegistry */
public final class Rd extends Pd<Bundle> {
    public void a(Bundle bundle) {
        Bundle bundle2 = bundle != null ? bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key") : null;
        if (bundle2 == null || bundle2.isEmpty()) {
            a(null);
            return;
        }
        HashMap hashMap = new HashMap();
        for (String str : bundle2.keySet()) {
            hashMap.put(str, bundle2.getBundle(str));
        }
        a(hashMap);
    }

    public void b(Bundle bundle) {
        Map a = a();
        Bundle bundle2 = new Bundle();
        for (Entry entry : a.entrySet()) {
            bundle2.putBundle((String) entry.getKey(), (Bundle) entry.getValue());
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
    }
}
