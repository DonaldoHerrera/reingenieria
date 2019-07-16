package bo.app;

import java.util.concurrent.Executor;

public class cx implements ct {
    private final a a;
    private final d b;
    private final ab c;
    private final ab d;
    private final Executor e;
    private final df f;
    private final dj g;
    private bg h;

    public cx(a aVar, d dVar, ab abVar, ab abVar2, Executor executor, df dfVar, dj djVar) {
        this.a = aVar;
        this.b = dVar;
        this.c = abVar;
        this.d = abVar2;
        this.e = executor;
        this.f = dfVar;
        this.g = djVar;
    }

    public void a(bg bgVar) {
        this.h = bgVar;
    }

    public void b(cs csVar) {
        if (csVar instanceof cr) {
            cm cmVar = new cm((cr) csVar, this.a, this.b, this.c, this.d, this.f, this.h, this.g);
            cmVar.run();
        } else if (csVar instanceof ch) {
            cv cvVar = new cv((ch) csVar, new ci(), this.b, this.c, this.d);
            cvVar.run();
        }
    }

    public void a(cs csVar) {
        if (csVar instanceof cr) {
            cr crVar = (cr) csVar;
            Executor executor = this.e;
            cm cmVar = new cm(crVar, this.a, this.b, this.c, this.d, this.f, this.h, this.g);
            executor.execute(cmVar);
        } else if (csVar instanceof ch) {
            ch chVar = (ch) csVar;
            Executor executor2 = this.e;
            cv cvVar = new cv(chVar, new ci(), this.b, this.c, this.d);
            executor2.execute(cvVar);
        }
    }
}
