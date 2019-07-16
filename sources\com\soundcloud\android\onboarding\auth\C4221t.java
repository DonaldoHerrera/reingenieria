package com.soundcloud.android.onboarding.auth;

import com.soundcloud.android.ia.p;
import com.soundcloud.android.image.ca;

/* renamed from: com.soundcloud.android.onboarding.auth.t reason: case insensitive filesystem */
/* compiled from: AlmostDoneLayout.kt */
public final class C4221t extends C5037Jua<ca> {
    final /* synthetic */ AlmostDoneLayout d;

    C4221t(AlmostDoneLayout almostDoneLayout) {
        this.d = almostDoneLayout;
    }

    public void a(Throwable th) {
        C7471uYa.b(th, "throwable");
        C7316sHa.a("error setting image", th);
        this.d.getAlmostDoneHandler().a(p.create_photo_error);
    }
}
