package com.soundcloud.android.onboarding.auth;

import android.app.Activity;
import android.os.Bundle;
import com.soundcloud.android.SoundCloudApplication;
import com.soundcloud.android.ia.p;

/* compiled from: LoginTaskFragment */
public class X extends E {

    /* compiled from: LoginTaskFragment */
    public interface a {
        public static final a a = new W();

        X a(Bundle bundle);

        X a(String str, String str2);
    }

    public static X a(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("username", str);
        bundle.putString("password", str2);
        return a(bundle);
    }

    /* access modifiers changed from: 0000 */
    public Cka Rb() {
        Ika ika = new Ika((SoundCloudApplication) getActivity().getApplication(), this.k, this.f, this.h, this.i);
        return ika;
    }

    public static X a(Bundle bundle) {
        X x = new X();
        x.setArguments(bundle);
        return x;
    }

    /* access modifiers changed from: protected */
    public String a(Activity activity, Eka eka) {
        if (eka.r()) {
            return activity.getString(p.authentication_login_error_credentials_message);
        }
        return super.a(activity, eka);
    }
}
