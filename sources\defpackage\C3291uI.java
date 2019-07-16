package defpackage;

import com.moat.analytics.mobile.scl.MoatFactory;
import com.moat.analytics.mobile.scl.ReactiveVideoTracker;
import com.moat.analytics.mobile.scl.ReactiveVideoTrackerPlugin;

/* renamed from: uI reason: default package and case insensitive filesystem */
/* compiled from: MoatFactoryHelper */
class C3291uI {
    C3291uI() {
    }

    public static ReactiveVideoTracker a(MoatFactory moatFactory, ReactiveVideoTrackerPlugin reactiveVideoTrackerPlugin) {
        return (ReactiveVideoTracker) moatFactory.createCustomTracker(reactiveVideoTrackerPlugin);
    }
}
