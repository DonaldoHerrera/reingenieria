package defpackage;

import android.os.Bundle;
import com.soundcloud.android.SoundCloudApplication;
import com.soundcloud.android.onboarding.auth.ka;
import com.soundcloud.android.sync.T;

/* renamed from: Jka reason: default package */
/* compiled from: SignupTask */
public class Jka extends Cka {
    private final ka f;

    public Jka(SoundCloudApplication soundCloudApplication, C3800jea jea, T t, ka kaVar) {
        super(soundCloudApplication, jea, t);
        this.f = kaVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Eka doInBackground(Bundle... bundleArr) {
        return this.f.a(bundleArr[0]);
    }
}
