package defpackage;

import android.app.Activity;
import androidx.appcompat.app.AppCompatActivity;
import com.soundcloud.lightcycle.DefaultActivityLightCycle;

/* renamed from: ZT reason: default package and case insensitive filesystem */
/* compiled from: ConfigurationUpdateLightCycle */
public class C2416ZT extends DefaultActivityLightCycle<AppCompatActivity> {
    private final C2288ST a;
    private final C3184oU b;
    /* access modifiers changed from: private */
    public final C4581ija c;
    private final C5327TLa d;
    private VPa e = C4881Eua.b();

    /* renamed from: ZT$a */
    /* compiled from: ConfigurationUpdateLightCycle */
    private final class a extends C5037Jua<C2000DU> {
        private final AppCompatActivity d;

        a(AppCompatActivity appCompatActivity) {
            this.d = appCompatActivity;
        }

        public void a(C2000DU du) {
            if (C2416ZT.d(du)) {
                C2416ZT.this.c.e((Activity) this.d);
            } else if (C2416ZT.c(du)) {
                C2416ZT.this.c.d((Activity) this.d);
            }
        }
    }

    C2416ZT(C2288ST st, C3184oU oUVar, C4581ija ija, C5327TLa tLa) {
        this.a = st;
        this.b = oUVar;
        this.c = ija;
        this.d = tLa;
    }

    /* access modifiers changed from: private */
    public static boolean c(C2000DU du) {
        return C2474bV.a(du.c, du.b);
    }

    /* access modifiers changed from: private */
    public static boolean d(C2000DU du) {
        return C2474bV.b(du.c, du.b);
    }

    /* renamed from: b */
    public void onStop(AppCompatActivity appCompatActivity) {
        this.e.dispose();
        super.onStop(appCompatActivity);
    }

    /* renamed from: a */
    public void onStart(AppCompatActivity appCompatActivity) {
        this.e = this.d.a(C3876taa.j, (SUa<E>) new a<E>(appCompatActivity));
        if (this.b.f()) {
            this.c.e((Activity) appCompatActivity);
        } else if (this.b.e()) {
            this.c.d((Activity) appCompatActivity);
        } else {
            this.a.d();
        }
    }
}
