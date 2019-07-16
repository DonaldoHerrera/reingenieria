package androidx.work;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;

public abstract class ListenableWorker {
    private Context a;
    private WorkerParameters b;
    private volatile boolean c;
    private boolean d;

    public static abstract class a {

        /* renamed from: androidx.work.ListenableWorker$a$a reason: collision with other inner class name */
        public static final class C0026a extends a {
            private final e a;

            public C0026a() {
                this(e.b);
            }

            public e d() {
                return this.a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || C0026a.class != obj.getClass()) {
                    return false;
                }
                return this.a.equals(((C0026a) obj).a);
            }

            public int hashCode() {
                return (C0026a.class.getName().hashCode() * 31) + this.a.hashCode();
            }

            public String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append("Failure {mOutputData=");
                sb.append(this.a);
                sb.append('}');
                return sb.toString();
            }

            public C0026a(e eVar) {
                this.a = eVar;
            }
        }

        public static final class b extends a {
            public boolean equals(Object obj) {
                boolean z = true;
                if (this == obj) {
                    return true;
                }
                if (obj == null || b.class != obj.getClass()) {
                    z = false;
                }
                return z;
            }

            public int hashCode() {
                return b.class.getName().hashCode();
            }

            public String toString() {
                return "Retry";
            }
        }

        public static final class c extends a {
            private final e a;

            public c() {
                this(e.b);
            }

            public e d() {
                return this.a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || c.class != obj.getClass()) {
                    return false;
                }
                return this.a.equals(((c) obj).a);
            }

            public int hashCode() {
                return (c.class.getName().hashCode() * 31) + this.a.hashCode();
            }

            public String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append("Success {mOutputData=");
                sb.append(this.a);
                sb.append('}');
                return sb.toString();
            }

            public c(e eVar) {
                this.a = eVar;
            }
        }

        a() {
        }

        public static a a(e eVar) {
            return new c(eVar);
        }

        public static a b() {
            return new b();
        }

        public static a c() {
            return new c();
        }

        public static a a() {
            return new C0026a();
        }
    }

    @SuppressLint({"BanKeepAnnotation"})
    @Keep
    public ListenableWorker(Context context, WorkerParameters workerParameters) {
        if (context == null) {
            throw new IllegalArgumentException("Application Context is null");
        } else if (workerParameters != null) {
            this.a = context;
            this.b = workerParameters;
        } else {
            throw new IllegalArgumentException("WorkerParameters is null");
        }
    }

    public final Context a() {
        return this.a;
    }

    public Executor b() {
        return this.b.a();
    }

    public final UUID c() {
        return this.b.b();
    }

    public final e d() {
        return this.b.c();
    }

    public final Set<String> e() {
        return this.b.d();
    }

    public C1811wf f() {
        return this.b.e();
    }

    public v g() {
        return this.b.f();
    }

    public final boolean h() {
        return this.d;
    }

    public void i() {
    }

    public final void j() {
        this.d = true;
    }

    public abstract C3347xE<a> k();

    public final void l() {
        this.c = true;
        i();
    }
}
