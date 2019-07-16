package defpackage;

import android.os.Bundle;
import java.util.Set;

/* renamed from: Lla reason: default package */
/* compiled from: BundleExtensions.kt */
public final class Lla {
    public static final boolean a(Bundle bundle, Bundle bundle2) {
        C7471uYa.b(bundle, "$this$equalsInContent");
        if (bundle2 == null || bundle.size() != bundle2.size()) {
            return false;
        }
        if (bundle.keySet() == null && bundle2.keySet() == null) {
            return true;
        }
        if (!C7471uYa.a((Object) bundle.keySet(), (Object) bundle2.keySet())) {
            return false;
        }
        if (bundle.keySet() != null) {
            Set keySet = bundle.keySet();
            Set keySet2 = bundle2.keySet();
            C7471uYa.a((Object) keySet2, "other.keySet()");
            if (!keySet.containsAll(keySet2)) {
                return false;
            }
        }
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            Object obj2 = bundle2.get(str);
            if (!(obj instanceof Bundle) || !(obj2 instanceof Bundle)) {
                if (!C7471uYa.a(obj, obj2)) {
                    return false;
                }
            } else if (!a((Bundle) obj, (Bundle) obj2)) {
                return false;
            }
        }
        return true;
    }
}
