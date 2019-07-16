package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.util.HashSet;
import java.util.Set;

/* renamed from: CB reason: default package */
public abstract class CB<StateT> {
    protected final C1893zA a;
    private final IntentFilter b;
    private final Context c;
    private final Set<BB<StateT>> d = new HashSet();
    private DB e = null;
    private volatile boolean f = false;

    protected CB(C1893zA zAVar, IntentFilter intentFilter, Context context) {
        this.a = zAVar;
        this.b = intentFilter;
        this.c = context;
    }

    private final void a() {
        if ((this.f || !this.d.isEmpty()) && this.e == null) {
            this.e = new DB(this, 0);
            this.c.registerReceiver(this.e, this.b);
        }
        if (!this.f && this.d.isEmpty()) {
            DB db = this.e;
            if (db != null) {
                this.c.unregisterReceiver(db);
                this.e = null;
            }
        }
    }

    public final synchronized void a(BB<StateT> bb) {
        this.a.a("registerListener", new Object[0]);
        this.d.add(bb);
        a();
    }

    /* access modifiers changed from: protected */
    public abstract void a(Context context, Intent intent);

    public final synchronized void a(StateT statet) {
        for (BB a2 : this.d) {
            a2.a(statet);
        }
    }

    public final synchronized void a(boolean z) {
        this.f = true;
        a();
    }

    public final synchronized void b(BB<StateT> bb) {
        this.a.a("unregisterListener", new Object[0]);
        this.d.remove(bb);
        a();
    }
}
