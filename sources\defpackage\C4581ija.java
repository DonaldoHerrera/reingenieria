package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.soundcloud.android.downgrade.GoOffboardingActivity;
import com.soundcloud.android.main.ha;
import com.soundcloud.android.properties.a;
import com.soundcloud.android.upgrade.GoOnboardingActivity;

/* renamed from: ija reason: default package and case insensitive filesystem */
/* compiled from: NavigationExecutor.kt */
public class C4581ija {
    private final a a;

    public C4581ija(a aVar) {
        C7471uYa.b(aVar, "appFeatures");
        this.a = aVar;
    }

    public void a(Context context, Bundle bundle) {
        C7471uYa.b(context, "context");
        Intent j = C4557fja.j(context);
        if (bundle != null) {
            j.putExtras(bundle);
        }
        if (!C3235rM.c(j)) {
            C3235rM.HOME_BUTTON.a(j);
        }
        if (!ha.b(j)) {
            ha.a(Yca.UNKNOWN, j);
        }
        context.startActivity(j);
    }

    public void b(Context context) {
        C7471uYa.b(context, "context");
        context.startActivity(C4557fja.v(context));
    }

    public void c(Context context) {
        C7471uYa.b(context, "context");
        context.startActivity(C4557fja.y(context));
    }

    public void d(Context context) {
        C7471uYa.b(context, "context");
        context.startActivity(C4557fja.D(context));
    }

    public void e(Context context) {
        C7471uYa.b(context, "context");
        context.startActivity(C4557fja.C(context));
    }

    public void f(Context context) {
        C7471uYa.b(context, "context");
        context.startActivity(C4557fja.m(context));
        System.exit(0);
    }

    public void b(Activity activity) {
        C7471uYa.b(activity, "activity");
        activity.finish();
        activity.startActivity(C4557fja.a(C4557fja.j(activity)));
    }

    public void c(Activity activity) {
        C7471uYa.b(activity, "activity");
        activity.startActivity(C4557fja.a(activity));
    }

    public void d(Activity activity) {
        C7471uYa.b(activity, "activity");
        a(activity, GoOffboardingActivity.class);
    }

    public void e(Activity activity) {
        C7471uYa.b(activity, "activity");
        a(activity, GoOnboardingActivity.class);
    }

    public void a(Context context) {
        C7471uYa.b(context, "context");
        context.startActivity(C4557fja.j(context));
    }

    public void a(Activity activity) {
        C7471uYa.b(activity, "activity");
        activity.finish();
        activity.startActivity(C4557fja.a());
    }

    public void a(Context context, Uri uri) {
        C7471uYa.b(context, "context");
        C7471uYa.b(uri, "uri");
        context.startActivity(C4557fja.b(context, uri));
    }

    private void a(Activity activity, Class<? extends Activity> cls) {
        activity.startActivity(C4557fja.a(new Intent(activity, cls)));
        activity.finish();
    }
}
