package androidx.browser.customtabs;

import android.app.Service;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IBinder.DeathRecipient;
import android.support.customtabs.ICustomTabsService.Stub;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

public abstract class CustomTabsService extends Service {
    final Map<IBinder, DeathRecipient> a = new T();
    private Stub b = new d(this);

    /* access modifiers changed from: protected */
    public abstract int a(g gVar, String str, Bundle bundle);

    /* access modifiers changed from: protected */
    public abstract Bundle a(String str, Bundle bundle);

    /* access modifiers changed from: protected */
    public abstract boolean a(long j);

    /* access modifiers changed from: protected */
    public boolean a(g gVar) {
        try {
            synchronized (this.a) {
                IBinder a2 = gVar.a();
                a2.unlinkToDeath((DeathRecipient) this.a.get(a2), 0);
                this.a.remove(a2);
            }
            return true;
        } catch (NoSuchElementException unused) {
            return false;
        }
    }

    /* access modifiers changed from: protected */
    public abstract boolean a(g gVar, int i, Uri uri, Bundle bundle);

    /* access modifiers changed from: protected */
    public abstract boolean a(g gVar, Uri uri);

    /* access modifiers changed from: protected */
    public abstract boolean a(g gVar, Uri uri, Bundle bundle, List<Bundle> list);

    /* access modifiers changed from: protected */
    public abstract boolean a(g gVar, Bundle bundle);

    /* access modifiers changed from: protected */
    public abstract boolean b(g gVar);

    public IBinder onBind(Intent intent) {
        return this.b;
    }
}
