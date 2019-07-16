package androidx.browser.customtabs;

import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.support.customtabs.ICustomTabsCallback;
import android.support.customtabs.ICustomTabsService.Stub;
import java.util.List;

/* compiled from: CustomTabsService */
class d extends Stub {
    final /* synthetic */ CustomTabsService a;

    d(CustomTabsService customTabsService) {
        this.a = customTabsService;
    }

    public Bundle extraCommand(String str, Bundle bundle) {
        return this.a.a(str, bundle);
    }

    public boolean mayLaunchUrl(ICustomTabsCallback iCustomTabsCallback, Uri uri, Bundle bundle, List<Bundle> list) {
        return this.a.a(new g(iCustomTabsCallback), uri, bundle, list);
    }

    public boolean newSession(ICustomTabsCallback iCustomTabsCallback) {
        g gVar = new g(iCustomTabsCallback);
        try {
            c cVar = new c(this, gVar);
            synchronized (this.a.a) {
                iCustomTabsCallback.asBinder().linkToDeath(cVar, 0);
                this.a.a.put(iCustomTabsCallback.asBinder(), cVar);
            }
            return this.a.b(gVar);
        } catch (RemoteException unused) {
            return false;
        }
    }

    public int postMessage(ICustomTabsCallback iCustomTabsCallback, String str, Bundle bundle) {
        return this.a.a(new g(iCustomTabsCallback), str, bundle);
    }

    public boolean requestPostMessageChannel(ICustomTabsCallback iCustomTabsCallback, Uri uri) {
        return this.a.a(new g(iCustomTabsCallback), uri);
    }

    public boolean updateVisuals(ICustomTabsCallback iCustomTabsCallback, Bundle bundle) {
        return this.a.a(new g(iCustomTabsCallback), bundle);
    }

    public boolean validateRelationship(ICustomTabsCallback iCustomTabsCallback, int i, Uri uri, Bundle bundle) {
        return this.a.a(new g(iCustomTabsCallback), i, uri, bundle);
    }

    public boolean warmup(long j) {
        return this.a.a(j);
    }
}
