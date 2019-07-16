package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.work.i;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.a;
import java.util.HashMap;
import java.util.Map;

/* compiled from: CommandHandler */
public class b implements a {
    private static final String a = i.a("CommandHandler");
    private final Context b;
    private final Map<String, a> c = new HashMap();
    private final Object d = new Object();

    b(Context context) {
        this.b = context;
    }

    static Intent a(Context context, String str) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_DELAY_MET");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    static Intent b(Context context, String str) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_SCHEDULE_WORK");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    static Intent c(Context context, String str) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_STOP_WORK");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    private void d(Intent intent, int i, g gVar) {
        Bundle extras = intent.getExtras();
        String string = extras.getString("KEY_WORKSPEC_ID");
        boolean z = extras.getBoolean("KEY_NEEDS_RESCHEDULE");
        i.a().a(a, String.format("Handling onExecutionCompleted %s, %s", new Object[]{intent, Integer.valueOf(i)}), new Throwable[0]);
        a(string, z);
    }

    private void e(Intent intent, int i, g gVar) {
        i.a().a(a, String.format("Handling reschedule %s, %s", new Object[]{intent, Integer.valueOf(i)}), new Throwable[0]);
        gVar.d().j();
    }

    private void f(Intent intent, int i, g gVar) {
        String string = intent.getExtras().getString("KEY_WORKSPEC_ID");
        i.a().a(a, String.format("Handling schedule work for %s", new Object[]{string}), new Throwable[0]);
        WorkDatabase g = gVar.d().g();
        g.c();
        try {
            _e c2 = g.t().c(string);
            String str = "Skipping scheduling ";
            if (c2 == null) {
                i a2 = i.a();
                String str2 = a;
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(string);
                sb.append(" because it's no longer in the DB");
                a2.e(str2, sb.toString(), new Throwable[0]);
            } else if (c2.d.a()) {
                i a3 = i.a();
                String str3 = a;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(string);
                sb2.append("because it is finished.");
                a3.e(str3, sb2.toString(), new Throwable[0]);
                g.e();
            } else {
                long a4 = c2.a();
                if (!c2.b()) {
                    i.a().a(a, String.format("Setting up Alarms for %s at %s", new Object[]{string, Long.valueOf(a4)}), new Throwable[0]);
                    a.a(this.b, gVar.d(), string, a4);
                } else {
                    i.a().a(a, String.format("Opportunistically setting an alarm for %s at %s", new Object[]{string, Long.valueOf(a4)}), new Throwable[0]);
                    a.a(this.b, gVar.d(), string, a4);
                    gVar.a((Runnable) new a(gVar, a(this.b), i));
                }
                g.m();
                g.e();
            }
        } finally {
            g.e();
        }
    }

    private void g(Intent intent, int i, g gVar) {
        String string = intent.getExtras().getString("KEY_WORKSPEC_ID");
        i.a().a(a, String.format("Handing stopWork work for %s", new Object[]{string}), new Throwable[0]);
        gVar.d().e(string);
        a.a(this.b, gVar.d(), string);
        gVar.a(string, false);
    }

    static Intent a(Context context) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_CONSTRAINTS_CHANGED");
        return intent;
    }

    static Intent b(Context context) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_RESCHEDULE");
        return intent;
    }

    private void c(Intent intent, int i, g gVar) {
        Bundle extras = intent.getExtras();
        synchronized (this.d) {
            String string = extras.getString("KEY_WORKSPEC_ID");
            i.a().a(a, String.format("Handing delay met for %s", new Object[]{string}), new Throwable[0]);
            if (!this.c.containsKey(string)) {
                e eVar = new e(this.b, i, string, gVar);
                this.c.put(string, eVar);
                eVar.a();
            } else {
                i.a().a(a, String.format("WorkSpec %s is already being handled for ACTION_DELAY_MET", new Object[]{string}), new Throwable[0]);
            }
        }
    }

    static Intent a(Context context, String str, boolean z) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_EXECUTION_COMPLETED");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        intent.putExtra("KEY_NEEDS_RESCHEDULE", z);
        return intent;
    }

    private void b(Intent intent, int i, g gVar) {
        i.a().a(a, String.format("Handling constraints changed %s", new Object[]{intent}), new Throwable[0]);
        new d(this.b, i, gVar).a();
    }

    public void a(String str, boolean z) {
        synchronized (this.d) {
            a aVar = (a) this.c.remove(str);
            if (aVar != null) {
                aVar.a(str, z);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public boolean a() {
        boolean z;
        synchronized (this.d) {
            z = !this.c.isEmpty();
        }
        return z;
    }

    /* access modifiers changed from: 0000 */
    public void a(Intent intent, int i, g gVar) {
        String action = intent.getAction();
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            b(intent, i, gVar);
        } else if ("ACTION_RESCHEDULE".equals(action)) {
            e(intent, i, gVar);
        } else {
            String str = "KEY_WORKSPEC_ID";
            if (!a(intent.getExtras(), str)) {
                i.a().b(a, String.format("Invalid request for %s, requires %s.", new Object[]{action, str}), new Throwable[0]);
            } else if ("ACTION_SCHEDULE_WORK".equals(action)) {
                f(intent, i, gVar);
            } else if ("ACTION_DELAY_MET".equals(action)) {
                c(intent, i, gVar);
            } else if ("ACTION_STOP_WORK".equals(action)) {
                g(intent, i, gVar);
            } else if ("ACTION_EXECUTION_COMPLETED".equals(action)) {
                d(intent, i, gVar);
            } else {
                i.a().e(a, String.format("Ignoring intent %s", new Object[]{intent}), new Throwable[0]);
            }
        }
    }

    private static boolean a(Bundle bundle, String... strArr) {
        if (bundle == null || bundle.isEmpty()) {
            return false;
        }
        for (String str : strArr) {
            if (bundle.get(str) == null) {
                return false;
            }
        }
        return true;
    }
}
