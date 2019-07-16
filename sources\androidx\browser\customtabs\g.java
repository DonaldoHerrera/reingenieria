package androidx.browser.customtabs;

import android.os.IBinder;
import android.support.customtabs.ICustomTabsCallback;

/* compiled from: CustomTabsSessionToken */
public class g {
    final ICustomTabsCallback a;
    private final a b = new f(this);

    g(ICustomTabsCallback iCustomTabsCallback) {
        this.a = iCustomTabsCallback;
    }

    /* access modifiers changed from: 0000 */
    public IBinder a() {
        return this.a.asBinder();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        return ((g) obj).a().equals(this.a.asBinder());
    }

    public int hashCode() {
        return a().hashCode();
    }
}
