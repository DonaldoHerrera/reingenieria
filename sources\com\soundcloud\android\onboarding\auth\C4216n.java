package com.soundcloud.android.onboarding.auth;

import android.os.Bundle;
import com.google.common.base.Function;
import com.soundcloud.android.SoundCloudApplication;
import java.io.File;

/* renamed from: com.soundcloud.android.onboarding.auth.n reason: case insensitive filesystem */
/* compiled from: AddUserInfoTaskFragment */
public class C4216n extends E {
    public static C4216n a(String str, File file) {
        Bundle bundle = new Bundle();
        bundle.putString("username", str);
        if (file != null && file.exists() && file.length() > 0) {
            bundle.putSerializable("avatar", file.getAbsolutePath());
        }
        C4216n nVar = new C4216n();
        nVar.setArguments(bundle);
        return nVar;
    }

    /* access modifiers changed from: 0000 */
    public Cka Rb() {
        SoundCloudApplication soundCloudApplication = (SoundCloudApplication) getActivity().getApplication();
        C4928GKa d = this.f.d();
        String string = getArguments().getString("username");
        String str = (String) d.b((Function<? super T, V>) C4203a.a).d(string);
        File file = null;
        String string2 = getArguments().getString("avatar", null);
        if (string2 != null) {
            file = new File(string2);
        }
        Aka aka = new Aka(soundCloudApplication, str, string, file, this.k, this.g, this.f, this.h, this.l);
        return aka;
    }
}
