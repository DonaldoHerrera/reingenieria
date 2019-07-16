package defpackage;

import androidx.appcompat.app.AppCompatActivity;
import com.soundcloud.android.foundation.events.C3712n;
import com.soundcloud.lightcycle.DefaultActivityLightCycle;

/* renamed from: jU reason: default package and case insensitive filesystem */
/* compiled from: ForceUpdateLightCycle */
public class C3079jU extends DefaultActivityLightCycle<AppCompatActivity> {
    private final C5327TLa a;
    private VPa b = C4881Eua.b();

    /* renamed from: jU$a */
    /* compiled from: ForceUpdateLightCycle */
    private static class a extends C5037Jua<C3712n> {
        private final AppCompatActivity d;

        public a(AppCompatActivity appCompatActivity) {
            this.d = appCompatActivity;
        }

        public void a(C3712n nVar) {
            C3022gU.a(this.d.getSupportFragmentManager());
        }
    }

    public C3079jU(C5327TLa tLa) {
        this.a = tLa;
    }

    /* renamed from: a */
    public void onPause(AppCompatActivity appCompatActivity) {
        this.b.dispose();
    }

    /* renamed from: b */
    public void onResume(AppCompatActivity appCompatActivity) {
        this.b = (VPa) this.a.a(C3876taa.k).d(1).c(new a(appCompatActivity));
    }
}
