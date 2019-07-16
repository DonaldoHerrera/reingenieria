package defpackage;

import android.os.Bundle;
import com.soundcloud.android.SoundCloudApplication;
import com.soundcloud.android.accounts.C2526g;
import com.soundcloud.android.onboarding.auth.ia;
import com.soundcloud.android.sync.T;

/* renamed from: Ika reason: default package */
/* compiled from: LoginTask */
public class Ika extends Cka {
    protected final C2526g f;
    private final ia g;

    public Ika(SoundCloudApplication soundCloudApplication, C3800jea jea, C2526g gVar, T t, ia iaVar) {
        super(soundCloudApplication, jea, t);
        this.f = gVar;
        this.g = iaVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Eka doInBackground(Bundle... bundleArr) {
        return this.g.a(bundleArr[0]);
    }
}
