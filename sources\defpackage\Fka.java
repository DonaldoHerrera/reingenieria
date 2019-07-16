package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.auth.d;
import com.soundcloud.android.SoundCloudApplication;
import com.soundcloud.android.accounts.C2526g;
import com.soundcloud.android.onboarding.auth.ia;
import com.soundcloud.android.onboarding.auth.ka;
import com.soundcloud.android.profile.C5815m;
import com.soundcloud.android.sync.T;
import java.io.IOException;

/* renamed from: Fka reason: default package */
/* compiled from: GooglePlusSignInTask */
public class Fka extends Ika {
    private static final String[] h = {"http://schemas.google.com/AddActivity", "http://schemas.google.com/CreateActivity", "http://schemas.google.com/ListenActivity"};
    protected String i;
    protected String j;
    private final ia k;
    private final ka l;
    private Bundle m = new Bundle();

    public Fka(SoundCloudApplication soundCloudApplication, String str, String str2, C3800jea jea, C2526g gVar, T t, ia iaVar, ka kaVar) {
        super(soundCloudApplication, jea, gVar, t, iaVar);
        this.i = str;
        this.j = str2;
        this.k = iaVar;
        this.l = kaVar;
        this.m.putString("request_visible_actions", TextUtils.join(" ", h));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Eka doInBackground(Bundle... bundleArr) {
        Eka eka;
        Eka eka2;
        String str = "error retrieving google token";
        int i2 = 2;
        Eka eka3 = null;
        boolean z = true;
        while (i2 > 0 && z) {
            int i3 = 0;
            try {
                String a = this.f.a(this.i, this.j, this.m);
                if (bundleArr[0].getBoolean("is_sign_in", false)) {
                    eka2 = this.k.a(ia.c(a));
                } else {
                    Bundle bundle = bundleArr[0];
                    eka2 = this.l.a(ka.b(a, (C5815m) bundle.getSerializable("user_age"), bundle.getString("user_gender")));
                }
                z = !(eka2.d() instanceof Nka);
                if (z) {
                    this.f.a(a);
                }
                i3 = i2;
                eka = eka2;
            } catch (d e) {
                SDb.a(e, str, new Object[0]);
                eka = Eka.a(e);
            } catch (IOException e2) {
                SDb.a(e2, str, new Object[0]);
                eka = Eka.b((Exception) e2);
            } catch (Exception e3) {
                SDb.a(e3, str, new Object[0]);
                eka = Eka.a(e3);
            }
            int i4 = i3 - 1;
            eka3 = eka;
            i2 = i4;
        }
        return eka3;
    }
}
