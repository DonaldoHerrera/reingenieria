package defpackage;

import android.content.Context;

/* renamed from: UK reason: default package and case insensitive filesystem */
/* compiled from: AnalyticsAppDelegate.kt */
public final class C2317UK implements Jca {
    private final C2280SL a;
    private final C2242QL b;
    private final C2353WK c;
    private final C2486cN d;
    private final C3371yI e;
    private final C3126mJ f;
    private final Context g;

    public C2317UK(C2280SL sl, C2242QL ql, C2353WK wk, C2486cN cNVar, C3371yI yIVar, C3126mJ mJVar, Context context) {
        C7471uYa.b(sl, "defaultScreenProvider");
        C7471uYa.b(ql, "defaultPlaySessionOriginScreenProvider");
        C7471uYa.b(wk, "analyticsEngine");
        C7471uYa.b(cNVar, "appboyPlaySessionState");
        C7471uYa.b(yIVar, "moatWrapper");
        C7471uYa.b(mJVar, "omSdkWrapper");
        C7471uYa.b(context, "context");
        this.a = sl;
        this.b = ql;
        this.c = wk;
        this.d = cNVar;
        this.e = yIVar;
        this.f = mJVar;
        this.g = context;
    }

    public void onCreate() {
        this.a.c();
        this.b.b();
        this.d.e();
        this.f.a(this.g);
        this.e.a(this.g);
        this.c.a();
    }
}
