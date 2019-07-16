package defpackage;

import android.content.Context;
import android.content.Intent;

/* renamed from: HB reason: default package */
public class HB {
    final /* synthetic */ EB a;
    final /* synthetic */ Intent b;
    final /* synthetic */ Context c;
    final /* synthetic */ NB d;

    HB(NB nb, EB eb, Intent intent, Context context) {
        this.d = nb;
        this.a = eb;
        this.b = intent;
        this.c = context;
    }

    public void a() {
        this.d.a(this.a, 5, 0);
    }

    public void a(int i) {
        this.d.a(this.a, 6, i);
    }

    public void b() {
        String str = "triggered_from_app_after_verification";
        if (!this.b.getBooleanExtra(str, false)) {
            this.b.putExtra(str, true);
            this.c.sendBroadcast(this.b);
            return;
        }
        this.d.a.d("Splits copied and verified more than once.", new Object[0]);
    }
}
