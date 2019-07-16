package com.soundcloud.android.onboarding.auth;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.gms.auth.c;
import com.google.android.gms.auth.d;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.soundcloud.android.SoundCloudApplication;
import com.soundcloud.android.ia.p;
import com.soundcloud.android.profile.C5815m;

/* compiled from: GooglePlusSignInTaskFragment */
public class T extends E {

    /* compiled from: GooglePlusSignInTaskFragment */
    public interface a {
        public static final a a = C4209g.a;

        T a(Bundle bundle);
    }

    public static Bundle a(String str, int i) {
        Bundle bundle = new Bundle();
        bundle.putString("account_name", str);
        bundle.putInt("request_code", i);
        bundle.putBoolean("is_sign_in", true);
        return bundle;
    }

    /* access modifiers changed from: 0000 */
    public Cka Rb() {
        Fka fka = new Fka((SoundCloudApplication) getActivity().getApplication(), getArguments().getString("account_name"), "oauth2:https://www.googleapis.com/auth/userinfo.profile https://www.googleapis.com/auth/userinfo.email", this.k, this.f, this.h, this.i, this.j);
        return fka;
    }

    public static Bundle a(String str, C5815m mVar, String str2, int i) {
        Bundle bundle = new Bundle();
        bundle.putString("account_name", str);
        bundle.putString("user_gender", str2);
        bundle.putSerializable("user_age", mVar);
        bundle.putInt("request_code", i);
        bundle.putBoolean("is_sign_in", false);
        return bundle;
    }

    public static T a(Bundle bundle) {
        T t = new T();
        t.setArguments(bundle);
        return t;
    }

    /* access modifiers changed from: protected */
    public String a(Activity activity, Eka eka) {
        Throwable a2 = C7316sHa.a(eka.d());
        if (a2 instanceof c) {
            C5232QGa.a(GooglePlayServicesUtil.getErrorDialog(((c) a2).b(), activity, 8004));
            return null;
        } else if (a2 instanceof d) {
            activity.startActivityForResult(((d) a2).a(), getArguments().getInt("request_code"));
            return null;
        } else if (eka.r()) {
            return activity.getString(p.authentication_login_error_credentials_message);
        } else {
            if (!(a2 instanceof com.google.android.gms.auth.a)) {
                return super.a(activity, eka);
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Unrecoverable error ");
            sb.append(a2.getMessage());
            return sb.toString();
        }
    }
}
