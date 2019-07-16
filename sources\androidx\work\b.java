package androidx.work;

import android.os.Build.VERSION;
import com.google.android.gms.common.api.Api.BaseClientBuilder;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* compiled from: Configuration */
public final class b {
    private final Executor a;
    private final Executor b;
    private final v c;
    private final int d;
    private final int e;
    private final int f;
    private final int g;

    /* compiled from: Configuration */
    public static final class a {
        Executor a;
        v b;
        Executor c;
        int d = 4;
        int e = 0;
        int f = BaseClientBuilder.API_PRIORITY_OTHER;
        int g = 20;

        public a a(v vVar) {
            this.b = vVar;
            return this;
        }

        public b a() {
            return new b(this);
        }
    }

    /* renamed from: androidx.work.b$b reason: collision with other inner class name */
    /* compiled from: Configuration */
    public interface C0027b {
        b a();
    }

    b(a aVar) {
        Executor executor = aVar.a;
        if (executor == null) {
            this.a = h();
        } else {
            this.a = executor;
        }
        Executor executor2 = aVar.c;
        if (executor2 == null) {
            this.b = h();
        } else {
            this.b = executor2;
        }
        v vVar = aVar.b;
        if (vVar == null) {
            this.c = v.a();
        } else {
            this.c = vVar;
        }
        this.d = aVar.d;
        this.e = aVar.e;
        this.f = aVar.f;
        this.g = aVar.g;
    }

    private Executor h() {
        return Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)));
    }

    public Executor a() {
        return this.a;
    }

    public int b() {
        return this.f;
    }

    public int c() {
        if (VERSION.SDK_INT == 23) {
            return this.g / 2;
        }
        return this.g;
    }

    public int d() {
        return this.e;
    }

    public int e() {
        return this.d;
    }

    public Executor f() {
        return this.b;
    }

    public v g() {
        return this.c;
    }
}
