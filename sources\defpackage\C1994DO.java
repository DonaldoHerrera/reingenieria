package defpackage;

import com.soundcloud.android.foundation.events.t;
import com.soundcloud.android.foundation.events.u;

/* renamed from: DO reason: default package and case insensitive filesystem */
/* compiled from: PerformanceMetric */
public abstract class C1994DO {

    /* renamed from: DO$a */
    /* compiled from: PerformanceMetric */
    public static abstract class a {
        /* access modifiers changed from: 0000 */
        public abstract a a(C2093IO io);

        public abstract a a(t tVar);

        public abstract a a(u uVar);

        /* access modifiers changed from: 0000 */
        public abstract C1994DO a();

        public C1994DO b() {
            u c = c();
            if (d().a()) {
                C2093IO a = C2093IO.a(c);
                a.b();
                a(a);
            }
            return a();
        }

        /* access modifiers changed from: 0000 */
        public abstract u c();

        /* access modifiers changed from: 0000 */
        public abstract C2093IO d();
    }

    public static C1994DO a(u uVar) {
        return a().a(uVar).b();
    }

    public abstract t b();

    public abstract u c();

    /* access modifiers changed from: 0000 */
    public abstract long d();

    /* access modifiers changed from: 0000 */
    public abstract C2093IO e();

    public static a a() {
        return new a().a(System.nanoTime()).a(C2093IO.a).a(t.a);
    }
}
