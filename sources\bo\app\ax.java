package bo.app;

import java.util.concurrent.Executor;

public class ax {
    /* access modifiers changed from: private */
    public static final String a = Hg.a(bd.class);
    /* access modifiers changed from: private */
    public final dg b;

    public ax(dg dgVar) {
        this.b = dgVar;
    }

    public void b(bo boVar) {
        this.b.b(boVar);
    }

    public void a(bo boVar) {
        this.b.a(boVar);
    }

    public void a(Executor executor, final l lVar) {
        executor.execute(new Runnable() {
            public void run() {
                Hg.a(ax.a, "Started offline AppboyEvent recovery task.");
                for (bo a2 : ax.this.b.a()) {
                    lVar.a(a2);
                }
            }
        });
    }
}
