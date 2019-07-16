package defpackage;

import com.soundcloud.android.foundation.events.J;
import com.soundcloud.android.foundation.events.r;

/* renamed from: Oaa reason: default package */
/* compiled from: PolicyUpdateFailureEvent */
public abstract class Oaa extends J implements r {

    /* renamed from: Oaa$a */
    /* compiled from: PolicyUpdateFailureEvent */
    enum a {
        CONTEXT_BACKGROUND("Background"),
        CONTEXT_UPSELL("Upsell");
        
        private final String d;

        private a(String str) {
            this.d = str;
        }
    }

    /* renamed from: Oaa$b */
    /* compiled from: PolicyUpdateFailureEvent */
    public enum b {
        KIND_POLICY_FETCH_FAILED("PolicyFetch"),
        KIND_POLICY_WRITE_FAILED("PolicyWrite");
        
        private final String d;

        private b(String str) {
            this.d = str;
        }
    }

    public static Oaa a(boolean z) {
        return a(b.KIND_POLICY_FETCH_FAILED, z ? a.CONTEXT_BACKGROUND : a.CONTEXT_UPSELL);
    }

    public static Oaa b(boolean z) {
        return a(b.KIND_POLICY_WRITE_FAILED, z ? a.CONTEXT_BACKGROUND : a.CONTEXT_UPSELL);
    }

    /* access modifiers changed from: 0000 */
    public abstract a h();

    public abstract b i();

    private static Oaa a(b bVar, a aVar) {
        C3756eaa eaa = new C3756eaa(J.b(), J.c(), bVar, aVar);
        return eaa;
    }

    public C3816lea a() {
        return C3816lea.a("core_policy_update_failure", C3808kea.a("Reason", i().toString()), C3808kea.a("Context", h().toString()));
    }
}
