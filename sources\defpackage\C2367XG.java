package defpackage;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;

/* renamed from: XG reason: default package and case insensitive filesystem */
public class C2367XG {
    @SuppressLint({"StaticFieldLeak"})
    private static C2367XG a = new C2367XG();
    private Context b;
    private BroadcastReceiver c;
    private boolean d;
    private boolean e;
    private a f;

    /* renamed from: XG$a */
    public interface a {
        void a(boolean z);
    }

    private C2367XG() {
    }

    public static C2367XG a() {
        return a;
    }

    /* access modifiers changed from: private */
    public void a(boolean z) {
        if (this.e != z) {
            this.e = z;
            if (this.d) {
                g();
                a aVar = this.f;
                if (aVar != null) {
                    aVar.a(d());
                }
            }
        }
    }

    private void e() {
        this.c = new C2349WG(this);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        this.b.registerReceiver(this.c, intentFilter);
    }

    private void f() {
        Context context = this.b;
        if (context != null) {
            BroadcastReceiver broadcastReceiver = this.c;
            if (broadcastReceiver != null) {
                context.unregisterReceiver(broadcastReceiver);
                this.c = null;
            }
        }
    }

    private void g() {
        boolean z = !this.e;
        for (C2218PG k : C2331VG.a().b()) {
            k.k().a(z);
        }
    }

    public void a(a aVar) {
        this.f = aVar;
    }

    public void a(Context context) {
        this.b = context.getApplicationContext();
    }

    public void b() {
        e();
        this.d = true;
        g();
    }

    public void c() {
        f();
        this.d = false;
        this.e = false;
        this.f = null;
    }

    public boolean d() {
        return !this.e;
    }
}
