package defpackage;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.soundcloud.android.SoundCloudApplication;
import com.soundcloud.android.onboarding.auth.E;
import com.soundcloud.android.onboarding.auth.pa;
import com.soundcloud.android.sync.T;
import com.soundcloud.android.sync.na;
import java.util.Collections;

/* renamed from: Cka reason: default package */
/* compiled from: AuthTask */
public abstract class Cka extends C6286dDa<Bundle, Void, Eka> {
    private final SoundCloudApplication b;
    private final C3800jea c;
    private final T d;
    private E e;

    public Cka(SoundCloudApplication soundCloudApplication, C3800jea jea, T t) {
        this.b = soundCloudApplication;
        this.c = jea;
        this.d = t;
    }

    public void a(E e2) {
        this.e = e2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void onPostExecute(Eka eka) {
        E e2 = this.e;
        if (e2 != null) {
            e2.a(eka);
        }
    }

    /* access modifiers changed from: protected */
    public Boolean a(C3776gea gea, C2358WP wp, pa paVar) {
        if (!this.b.a(gea, wp)) {
            return Boolean.valueOf(false);
        }
        this.c.b(Collections.singleton(gea));
        if (paVar != pa.NONE) {
            new Handler(Looper.getMainLooper()).postDelayed(new C4728zka(this), 30000);
        }
        return Boolean.valueOf(true);
    }

    public /* synthetic */ void a() {
        this.d.b(na.ME);
    }
}
