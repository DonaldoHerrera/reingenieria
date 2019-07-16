package androidx.work;

import android.annotation.SuppressLint;

/* compiled from: Operation */
public interface m {
    @SuppressLint({"SyntheticAccessor"})
    public static final c a = new c();
    @SuppressLint({"SyntheticAccessor"})
    public static final b b = new b();

    /* compiled from: Operation */
    public static abstract class a {

        /* renamed from: androidx.work.m$a$a reason: collision with other inner class name */
        /* compiled from: Operation */
        public static final class C0028a extends a {
            private final Throwable a;

            public C0028a(Throwable th) {
                this.a = th;
            }

            public Throwable a() {
                return this.a;
            }

            public String toString() {
                return String.format("FAILURE (%s)", new Object[]{this.a.getMessage()});
            }
        }

        /* compiled from: Operation */
        public static final class b extends a {
            public String toString() {
                return "IN_PROGRESS";
            }

            private b() {
            }
        }

        /* compiled from: Operation */
        public static final class c extends a {
            public String toString() {
                return "SUCCESS";
            }

            private c() {
            }
        }

        a() {
        }
    }
}
