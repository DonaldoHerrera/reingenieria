package defpackage;

import com.soundcloud.android.foundation.events.J;
import com.soundcloud.android.offline.Ue;

/* renamed from: Aaa reason: default package */
/* compiled from: OfflinePerformanceEvent */
public abstract class Aaa extends J {

    /* renamed from: Aaa$a */
    /* compiled from: OfflinePerformanceEvent */
    public enum a {
        KIND_START("start"),
        KIND_FAIL("fail"),
        KIND_USER_CANCEL("user_cancelled"),
        KIND_COMPLETE("complete"),
        KIND_STORAGE_INACCESSIBLE("storage_inaccessible"),
        KIND_STORAGE_LIMIT("storage_limit_reached");
        
        private final String h;

        private a(String str) {
            this.h = str;
        }

        public String a() {
            return this.h;
        }
    }

    private static Aaa a(a aVar, C3508cda cda, Ue ue) {
        C3482ZZ zz = new C3482ZZ(J.b(), J.c(), aVar, cda, ue.a(), ue.c(), ue.b());
        return zz;
    }

    public static Aaa b(C3508cda cda, Ue ue) {
        return a(a.KIND_COMPLETE, cda, ue);
    }

    public static Aaa c(C3508cda cda, Ue ue) {
        return a(a.KIND_FAIL, cda, ue);
    }

    public static Aaa d(C3508cda cda, Ue ue) {
        return a(a.KIND_START, cda, ue);
    }

    public static Aaa e(C3508cda cda, Ue ue) {
        return a(a.KIND_STORAGE_INACCESSIBLE, cda, ue);
    }

    public static Aaa f(C3508cda cda, Ue ue) {
        return a(a.KIND_STORAGE_LIMIT, cda, ue);
    }

    public abstract boolean h();

    public abstract a i();

    public abstract boolean j();

    public abstract C3508cda k();

    public abstract C3508cda l();

    public static Aaa a(C3508cda cda, Ue ue) {
        return a(a.KIND_USER_CANCEL, cda, ue);
    }
}
