package bo.app;

import android.content.Context;
import android.content.SharedPreferences;

public class bc {
    private static final String d = Hg.a(bc.class);
    final SharedPreferences a;
    final ab b;
    boolean c = false;
    private final dj e;

    public bc(Context context, ab abVar, dj djVar) {
        this.b = abVar;
        this.e = djVar;
        this.a = context.getSharedPreferences("com.appboy.storage.sessions.messaging_session", 0);
    }

    /* access modifiers changed from: 0000 */
    public void a() {
        if (c()) {
            Hg.a(d, "Publishing new messaging session event.");
            this.b.a(ag.a, ag.class);
            this.c = true;
            return;
        }
        Hg.a(d, "Messaging session not started.");
    }

    /* access modifiers changed from: 0000 */
    public void b() {
        long a2 = dn.a();
        String str = d;
        StringBuilder sb = new StringBuilder();
        sb.append("Messaging session stopped. Adding new messaging session timestamp: ");
        sb.append(a2);
        Hg.a(str, sb.toString());
        this.a.edit().putLong("messaging_session_timestamp", a2).apply();
        this.c = false;
    }

    /* access modifiers changed from: 0000 */
    public boolean c() {
        long j = this.e.j();
        if (j == -1 || this.c) {
            return false;
        }
        long j2 = this.a.getLong("messaging_session_timestamp", -1);
        long a2 = dn.a();
        String str = d;
        StringBuilder sb = new StringBuilder();
        sb.append("Messaging session timeout: ");
        sb.append(j);
        sb.append(", current diff: ");
        sb.append(a2 - j2);
        Hg.a(str, sb.toString());
        if (j2 + j < a2) {
            return true;
        }
        return false;
    }
}
