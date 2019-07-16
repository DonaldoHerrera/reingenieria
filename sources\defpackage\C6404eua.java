package defpackage;

import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.content.Context;
import android.os.PowerManager;
import android.os.Process;
import com.soundcloud.android.foundation.events.F;
import com.soundcloud.android.properties.a;
import com.soundcloud.android.properties.m;
import com.soundcloud.android.utilities.android.f;
import java.util.ArrayList;
import java.util.Locale;

/* renamed from: eua reason: default package and case insensitive filesystem */
/* compiled from: CrashlyticsAppConfigurationReporter */
public class C6404eua implements C6336dua {
    private final C2137KU a;
    private final C6834lGa b;
    private final a c;
    private final C4806CMa<C3814lca> d;
    private final C7181qKa e;
    private final PowerManager f;
    private final F g;
    private final Context h;
    private final ActivityManager i;

    public C6404eua(C2137KU ku, C6834lGa lga, a aVar, C4806CMa<C3814lca> cMa, C7181qKa qka, PowerManager powerManager, F f2, Context context) {
        this.a = ku;
        this.b = lga;
        this.c = aVar;
        this.d = cMa;
        this.e = qka;
        this.f = powerManager;
        this.g = f2;
        this.h = context;
        this.i = (ActivityManager) context.getSystemService("activity");
    }

    private void b() {
        com.crashlytics.android.a.a("Current screen", this.g.a() == null ? Yca.UNKNOWN.a() : this.g.a());
    }

    private void c() {
        String str;
        float a2 = f.a(this.h, -1.0f);
        if (a2 == -1.0f) {
            str = "not set";
        } else {
            str = String.valueOf(a2);
        }
        com.crashlytics.android.a.a("Default Animation Scale", str);
    }

    private void d() {
        com.crashlytics.android.a.a("ExoPlayer Version", this.e.h());
    }

    private void e() {
        C2118JU[] values;
        for (C2118JU ju : C2118JU.values()) {
            String b2 = ju.b();
            String a2 = this.a.a(ju);
            String str = "A/B ";
            if (!a2.isEmpty()) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(b2);
                com.crashlytics.android.a.a(sb.toString(), a2);
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(b2);
                com.crashlytics.android.a.a(sb2.toString(), "undefined");
            }
        }
    }

    private void f() {
        com.crashlytics.android.a.a("Flipper Version", this.e.d());
    }

    private void g() {
        com.crashlytics.android.a.a("Git SHA", this.e.f());
    }

    private void h() {
        com.crashlytics.android.a.a("Locale", Locale.getDefault().toString());
    }

    private void i() {
        com.crashlytics.android.a.a("Network Type", this.b.b().a());
    }

    private void j() {
        com.crashlytics.android.a.a("Power Save Mode", this.f.isPowerSaveMode());
    }

    private void k() {
        for (RunningAppProcessInfo runningAppProcessInfo : this.i.getRunningAppProcesses()) {
            if (runningAppProcessInfo.pid == Process.myPid()) {
                com.crashlytics.android.a.a("Process Importance", String.valueOf(runningAppProcessInfo.importance));
            }
        }
    }

    private void l() {
        C3814lca lca = (C3814lca) this.d.get();
        com.crashlytics.android.a.a("Queue Size", lca.p());
        lca.g().a((C7733yKa<? super T>) C6268cua.a);
    }

    private void m() {
        com.crashlytics.android.a.a("Remote Config", this.c.d());
        ArrayList<C3821mba> arrayList = new ArrayList<>();
        arrayList.addAll(m.c.a());
        arrayList.addAll(m.c.b());
        for (C3821mba mba : arrayList) {
            com.crashlytics.android.a.a(mba.c(), this.c.a(mba).toString());
        }
    }

    private void n() {
        com.crashlytics.android.a.a("Device Configuration", this.h.getResources().getConfiguration().toString());
    }

    public void a() {
        g();
        h();
        f();
        d();
        l();
        i();
        j();
        n();
        m();
        e();
        b();
        c();
        k();
    }
}
