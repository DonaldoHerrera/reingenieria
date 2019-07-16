package defpackage;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Bundle;
import java.util.HashSet;
import java.util.Set;

/* renamed from: PMa reason: default package and case insensitive filesystem */
/* compiled from: ActivityLifecycleManager */
public class C5208PMa {
    private final Application a;
    private a b;

    /* renamed from: PMa$a */
    /* compiled from: ActivityLifecycleManager */
    private static class a {
        private final Set<ActivityLifecycleCallbacks> a = new HashSet();
        private final Application b;

        a(Application application) {
            this.b = application;
        }

        /* access modifiers changed from: private */
        @TargetApi(14)
        public void a() {
            for (ActivityLifecycleCallbacks unregisterActivityLifecycleCallbacks : this.a) {
                this.b.unregisterActivityLifecycleCallbacks(unregisterActivityLifecycleCallbacks);
            }
        }

        /* access modifiers changed from: private */
        @TargetApi(14)
        public boolean a(b bVar) {
            if (this.b == null) {
                return false;
            }
            C5178OMa oMa = new C5178OMa(this, bVar);
            this.b.registerActivityLifecycleCallbacks(oMa);
            this.a.add(oMa);
            return true;
        }
    }

    /* renamed from: PMa$b */
    /* compiled from: ActivityLifecycleManager */
    public static abstract class b {
        public void a(Activity activity) {
        }

        public abstract void a(Activity activity, Bundle bundle);

        public void b(Activity activity) {
        }

        public void b(Activity activity, Bundle bundle) {
        }

        public abstract void c(Activity activity);

        public abstract void d(Activity activity);

        public void e(Activity activity) {
        }
    }

    public C5208PMa(Context context) {
        this.a = (Application) context.getApplicationContext();
        if (VERSION.SDK_INT >= 14) {
            this.b = new a(this.a);
        }
    }

    public boolean a(b bVar) {
        a aVar = this.b;
        return aVar != null && aVar.a(bVar);
    }

    public void a() {
        a aVar = this.b;
        if (aVar != null) {
            aVar.a();
        }
    }
}
