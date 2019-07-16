package defpackage;

import android.content.Context;

/* renamed from: Le reason: default package */
/* compiled from: Trackers */
public class Le {
    private static Le a;
    private De b;
    private Ee c;
    private Je d;
    private Ke e;

    private Le(Context context, C1811wf wfVar) {
        Context applicationContext = context.getApplicationContext();
        this.b = new De(applicationContext, wfVar);
        this.c = new Ee(applicationContext, wfVar);
        this.d = new Je(applicationContext, wfVar);
        this.e = new Ke(applicationContext, wfVar);
    }

    public static synchronized Le a(Context context, C1811wf wfVar) {
        Le le;
        synchronized (Le.class) {
            if (a == null) {
                a = new Le(context, wfVar);
            }
            le = a;
        }
        return le;
    }

    public Ee b() {
        return this.c;
    }

    public Je c() {
        return this.d;
    }

    public Ke d() {
        return this.e;
    }

    public De a() {
        return this.b;
    }
}
