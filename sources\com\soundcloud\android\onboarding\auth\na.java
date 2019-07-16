package com.soundcloud.android.onboarding.auth;

import android.os.Bundle;
import android.os.Handler;
import com.soundcloud.android.SoundCloudApplication;
import com.soundcloud.android.profile.C5815m;
import java.util.concurrent.TimeUnit;

/* compiled from: SignupTaskFragment */
public class na extends E {
    private static final long m = TimeUnit.SECONDS.toMillis(5);
    private final Handler n = new Handler();
    private final Runnable o = new C4208f(this);
    private int p;

    private Ika Tb() {
        Ika ika = new Ika((SoundCloudApplication) getActivity().getApplication(), this.k, this.f, this.h, this.i);
        ika.a((E) this);
        return ika;
    }

    private void Ub() {
        this.p--;
        this.n.postDelayed(this.o, m);
    }

    public static Bundle a(Bundle bundle, String str, String str2) {
        bundle.putString("username", str);
        bundle.putString("password", str2);
        return bundle;
    }

    private void c(int i) {
        this.p = i;
    }

    /* access modifiers changed from: 0000 */
    public Cka Rb() {
        return new Jka((SoundCloudApplication) getActivity().getApplication(), this.k, this.h, this.j);
    }

    public /* synthetic */ void Sb() {
        Tb().a(getArguments());
    }

    private boolean c(Eka eka) {
        return !eka.q() && this.p > 0;
    }

    public static Bundle a(Bundle bundle, C5815m mVar, String str) {
        bundle.putSerializable("birthday", mVar);
        bundle.putString("gender", str);
        return bundle;
    }

    public static na a(Bundle bundle) {
        na naVar = new na();
        naVar.setArguments(bundle);
        return naVar;
    }

    public void a(Eka eka) {
        if (eka.o()) {
            c(3);
        }
        if (c(eka)) {
            Ub();
            return;
        }
        c(0);
        super.a(eka);
    }
}
