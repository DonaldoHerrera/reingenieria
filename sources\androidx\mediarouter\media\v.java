package androidx.mediarouter.media;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Handler;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: RegisteredMediaRouteProviderWatcher */
final class v {
    private final Context a;
    private final a b;
    private final Handler c;
    private final PackageManager d;
    private final ArrayList<s> e = new ArrayList<>();
    private boolean f;
    private final BroadcastReceiver g = new t(this);
    private final Runnable h = new u(this);

    /* compiled from: RegisteredMediaRouteProviderWatcher */
    public interface a {
        void a(c cVar);

        void b(c cVar);
    }

    public v(Context context, a aVar) {
        this.a = context;
        this.b = aVar;
        this.c = new Handler();
        this.d = context.getPackageManager();
    }

    /* access modifiers changed from: 0000 */
    public void a() {
        int i;
        if (this.f) {
            int i2 = 0;
            for (ResolveInfo resolveInfo : this.d.queryIntentServices(new Intent("android.media.MediaRouteProviderService"), 0)) {
                ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                if (serviceInfo != null) {
                    int a2 = a(serviceInfo.packageName, serviceInfo.name);
                    if (a2 < 0) {
                        s sVar = new s(this.a, new ComponentName(serviceInfo.packageName, serviceInfo.name));
                        sVar.i();
                        i = i2 + 1;
                        this.e.add(i2, sVar);
                        this.b.a(sVar);
                    } else if (a2 >= i2) {
                        s sVar2 = (s) this.e.get(a2);
                        sVar2.i();
                        sVar2.h();
                        i = i2 + 1;
                        Collections.swap(this.e, a2, i2);
                    }
                    i2 = i;
                }
            }
            if (i2 < this.e.size()) {
                for (int size = this.e.size() - 1; size >= i2; size--) {
                    s sVar3 = (s) this.e.get(size);
                    this.b.b(sVar3);
                    this.e.remove(sVar3);
                    sVar3.j();
                }
            }
        }
    }

    public void b() {
        if (!this.f) {
            this.f = true;
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.PACKAGE_ADDED");
            intentFilter.addAction("android.intent.action.PACKAGE_REMOVED");
            intentFilter.addAction("android.intent.action.PACKAGE_CHANGED");
            intentFilter.addAction("android.intent.action.PACKAGE_REPLACED");
            intentFilter.addAction("android.intent.action.PACKAGE_RESTARTED");
            intentFilter.addDataScheme("package");
            this.a.registerReceiver(this.g, intentFilter, null, this.c);
            this.c.post(this.h);
        }
    }

    private int a(String str, String str2) {
        int size = this.e.size();
        for (int i = 0; i < size; i++) {
            if (((s) this.e.get(i)).b(str, str2)) {
                return i;
            }
        }
        return -1;
    }
}
