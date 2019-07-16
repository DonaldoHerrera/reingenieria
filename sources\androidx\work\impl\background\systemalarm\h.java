package androidx.work.impl.background.systemalarm;

import android.content.Context;
import androidx.work.i;
import androidx.work.impl.d;

/* compiled from: SystemAlarmScheduler */
public class h implements d {
    private static final String a = i.a("SystemAlarmScheduler");
    private final Context b;

    public h(Context context) {
        this.b = context.getApplicationContext();
    }

    public void a(_e... _eVarArr) {
        for (_e a2 : _eVarArr) {
            a(a2);
        }
    }

    public void a(String str) {
        this.b.startService(b.c(this.b, str));
    }

    private void a(_e _eVar) {
        i.a().a(a, String.format("Scheduling work with workSpecId %s", new Object[]{_eVar.c}), new Throwable[0]);
        this.b.startService(b.b(this.b, _eVar.c));
    }
}
