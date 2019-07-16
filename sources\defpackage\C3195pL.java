package defpackage;

import com.soundcloud.android.foundation.events.J;

/* renamed from: pL reason: default package and case insensitive filesystem */
/* compiled from: AnalyticsModule_ProvideTrackingEventsFactory */
public final class C3195pL implements C4961HMa<C2350WH<J>> {
    private static final C3195pL a = new C3195pL();

    public static C3195pL a() {
        return a;
    }

    public static C2350WH<J> b() {
        C2350WH<J> b = C2995fL.b();
        C5023JMa.a(b, "Cannot return null from a non-@Nullable @Provides method");
        return b;
    }

    public C2350WH<J> get() {
        return b();
    }
}
