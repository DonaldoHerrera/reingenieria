package defpackage;

import com.soundcloud.android.foundation.events.A;
import com.soundcloud.android.foundation.events.C3699a;
import com.soundcloud.android.foundation.events.C3707i;
import com.soundcloud.android.foundation.events.J;
import com.soundcloud.android.foundation.events.z;
import java.util.List;

/* renamed from: IL reason: default package and case insensitive filesystem */
/* compiled from: DefaultAnalyticsEngineInputs.kt */
public final class C2090IL implements a {
    private final APa<List<C3254sL>> a;
    private final APa<J> b;
    private final APa<C3699a> c;
    private final APa<A> d;
    private final APa<z> e;
    private final APa<C3707i> f;

    public C2090IL(APa<List<C3254sL>> aPa, APa<J> aPa2, APa<C3699a> aPa3, APa<A> aPa4, APa<z> aPa5, APa<C3707i> aPa6) {
        C7471uYa.b(aPa, "providers");
        C7471uYa.b(aPa2, "trackingEvents");
        C7471uYa.b(aPa3, "activityLifeCycleEvents");
        C7471uYa.b(aPa4, "playbackPerformanceEvents");
        C7471uYa.b(aPa5, "playbackErrorEvents");
        C7471uYa.b(aPa6, "currentUserChangedEvent");
        this.a = aPa;
        this.b = aPa2;
        this.c = aPa3;
        this.d = aPa4;
        this.e = aPa5;
        this.f = aPa6;
    }

    public APa<A> a() {
        return this.d;
    }

    public APa<z> b() {
        return this.e;
    }

    public APa<C3699a> c() {
        return this.c;
    }

    public APa<J> d() {
        return this.b;
    }

    public APa<C3707i> e() {
        return this.f;
    }

    public APa<List<C3254sL>> f() {
        return this.a;
    }
}
