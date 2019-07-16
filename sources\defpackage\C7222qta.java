package defpackage;

import androidx.appcompat.app.AppCompatActivity;
import com.soundcloud.android.offline.C4197yd;
import com.soundcloud.android.offline.Qb;
import com.soundcloud.lightcycle.DefaultActivityLightCycle;
import java.util.concurrent.TimeUnit;

/* renamed from: qta reason: default package and case insensitive filesystem */
/* compiled from: PolicyUpdateController */
public class C7222qta extends DefaultActivityLightCycle<AppCompatActivity> {
    private final C2436_U a;
    /* access modifiers changed from: private */
    public final C4197yd b;
    private final C6334dta c;
    private final C6810kta d;
    private final C5694cGa e;
    /* access modifiers changed from: private */
    public final C5540_sa f;
    private final C6834lGa g;
    /* access modifiers changed from: private */
    public final Qb h;
    private VPa i = C4881Eua.b();

    /* renamed from: qta$a */
    /* compiled from: PolicyUpdateController */
    private class a extends C5068Kua<Long> {
        private AppCompatActivity d;

        a(AppCompatActivity appCompatActivity) {
            this.d = appCompatActivity;
        }

        /* renamed from: a */
        public void onSuccess(Long l) {
            super.onSuccess(l);
            if (C7222qta.this.b(l)) {
                C7222qta.this.f.a(this.d, l.longValue());
                if (C7222qta.this.a(l)) {
                    C7222qta.this.h.a("No policy update in last 30 days");
                    C7222qta.this.b.a().a((KPa<? super T>) new C5068Kua<Object>());
                }
            }
        }
    }

    public C7222qta(C2436_U _u, C4197yd ydVar, C6334dta dta, C6810kta kta, C5694cGa cga, C5540_sa _sa, C6834lGa lga, Qb qb) {
        this.a = _u;
        this.b = ydVar;
        this.c = dta;
        this.d = kta;
        this.e = cga;
        this.f = _sa;
        this.g = lga;
        this.h = qb;
    }

    private boolean x() {
        long a2 = this.e.a() - this.d.a();
        Qb qb = this.h;
        StringBuilder sb = new StringBuilder();
        sb.append("Last valid policy check was: ");
        sb.append(TimeUnit.MILLISECONDS.toDays(a2));
        sb.append(" days ago");
        qb.a(sb.toString());
        return TimeUnit.MILLISECONDS.toDays(a2) > 0;
    }

    /* renamed from: a */
    public void onDestroy(AppCompatActivity appCompatActivity) {
        this.i.dispose();
        super.onDestroy(appCompatActivity);
    }

    /* renamed from: b */
    public void onResume(AppCompatActivity appCompatActivity) {
        if (this.a.l() && x()) {
            this.i.dispose();
            IPa a2 = this.c.b().a(RPa.a());
            a aVar = new a(appCompatActivity);
            a2.c(aVar);
            this.i = aVar;
        }
    }

    /* access modifiers changed from: private */
    public boolean a(Long l) {
        return TimeUnit.MILLISECONDS.toDays(this.e.a() - l.longValue()) >= 30;
    }

    /* access modifiers changed from: private */
    public boolean b(Long l) {
        if (l.longValue() == -1) {
            return false;
        }
        this.d.a(this.e.a());
        if (this.g.d()) {
            return false;
        }
        long days = TimeUnit.MILLISECONDS.toDays(this.e.a() - l.longValue());
        Qb qb = this.h;
        StringBuilder sb = new StringBuilder();
        sb.append("Days elapsed since last update: ");
        sb.append(days);
        qb.a(sb.toString());
        if (days >= 27) {
            return true;
        }
        return false;
    }
}
