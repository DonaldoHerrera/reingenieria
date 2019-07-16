package com.google.firebase.analytics;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.If;
import com.google.android.gms.internal.measurement.zzx;
import com.google.android.gms.measurement.internal.Lc;
import com.google.android.gms.measurement.internal.Mb;
import com.google.android.gms.measurement.internal.be;
import com.google.firebase.iid.FirebaseInstanceId;

public final class FirebaseAnalytics {
    private static volatile FirebaseAnalytics a;
    private final Mb b;
    private final If c;
    private final boolean d;
    private final Object e;

    private FirebaseAnalytics(Mb mb) {
        Preconditions.checkNotNull(mb);
        this.b = mb;
        this.c = null;
        this.d = false;
        this.e = new Object();
    }

    @Keep
    public static FirebaseAnalytics getInstance(Context context) {
        if (a == null) {
            synchronized (FirebaseAnalytics.class) {
                if (a == null) {
                    if (If.b(context)) {
                        a = new FirebaseAnalytics(If.a(context));
                    } else {
                        a = new FirebaseAnalytics(Mb.a(context, (zzx) null));
                    }
                }
            }
        }
        return a;
    }

    @Keep
    public static Lc getScionFrontendApiImplementation(Context context, Bundle bundle) {
        if (!If.b(context)) {
            return null;
        }
        If a2 = If.a(context, (String) null, (String) null, (String) null, bundle);
        if (a2 == null) {
            return null;
        }
        return new a(a2);
    }

    public final void a(String str, Bundle bundle) {
        if (this.d) {
            this.c.a(str, bundle);
        } else {
            this.b.x().a("app", str, bundle, true);
        }
    }

    @Keep
    public final String getFirebaseInstanceId() {
        return FirebaseInstanceId.b().a();
    }

    @Keep
    public final void setCurrentScreen(Activity activity, String str, String str2) {
        if (this.d) {
            this.c.a(activity, str, str2);
        } else if (!be.a()) {
            this.b.e().v().a("setCurrentScreen must be called from the main thread");
        } else {
            this.b.A().a(activity, str, str2);
        }
    }

    public final void a(String str, String str2) {
        if (this.d) {
            this.c.b(str, str2);
        } else {
            this.b.x().a("app", str, (Object) str2, false);
        }
    }

    private FirebaseAnalytics(If ifR) {
        Preconditions.checkNotNull(ifR);
        this.b = null;
        this.c = ifR;
        this.d = true;
        this.e = new Object();
    }

    public final void a(boolean z) {
        if (this.d) {
            this.c.b(z);
        } else {
            this.b.x().a(z);
        }
    }
}
