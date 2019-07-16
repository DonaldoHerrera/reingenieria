package defpackage;

import com.soundcloud.android.properties.m.C5886c;

@EVa(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0016\u0018\u0000 \u00162\u00020\u0001:\u0002\u0016\u0017B/\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\b\u0010\r\u001a\u00020\u000eH\u0012J\b\u0010\u000f\u001a\u00020\u000eH\u0012J\b\u0010\u0010\u001a\u00020\u000eH\u0012J\b\u0010\u0011\u001a\u00020\u0012H\u0012J\b\u0010\u0013\u001a\u00020\u000eH\u0012J\b\u0010\u0014\u001a\u00020\u000eH\u0012J\b\u0010\u0015\u001a\u00020\u000eH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/soundcloud/android/configuration/experiments/DownloadsInLibraryExperiment;", "", "experimentOperations", "Lcom/soundcloud/android/configuration/experiments/ExperimentOperations;", "appFeatures", "Lcom/soundcloud/android/properties/AppFeatures;", "featureOperations", "Lcom/soundcloud/android/configuration/plans/FeatureOperations;", "collection2Experiment", "Lcom/soundcloud/android/configuration/experiments/Collection2Experiment;", "errorReporter", "Lcom/soundcloud/android/error/reporting/ErrorReporter;", "(Lcom/soundcloud/android/configuration/experiments/ExperimentOperations;Lcom/soundcloud/android/properties/AppFeatures;Lcom/soundcloud/android/configuration/plans/FeatureOperations;Lcom/soundcloud/android/configuration/experiments/Collection2Experiment;Lcom/soundcloud/android/error/reporting/ErrorReporter;)V", "collection2IsNotEnabled", "", "downloadsIsEnabled", "experimentIsEnabled", "getExperimentVariant", "", "isEligibleForDownloadFeature", "isInControlGroup", "shouldShowDownloads", "Companion", "MisconfiguredExperimentException", "experiments-active_release"}, mv = {1, 1, 15})
/* renamed from: HU reason: default package and case insensitive filesystem */
/* compiled from: DownloadsInLibraryExperiment.kt */
public class C2080HU {
    public static final a a = new a(null);
    private final C2137KU b;
    private final com.soundcloud.android.properties.a c;
    private final C2436_U d;
    private final C2040FU e;
    private final C3469VY f;

    /* renamed from: HU$a */
    /* compiled from: DownloadsInLibraryExperiment.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }
    }

    /* renamed from: HU$b */
    /* compiled from: DownloadsInLibraryExperiment.kt */
    private static final class b extends Exception {
        public b(String str) {
            C7471uYa.b(str, "message");
            super(str);
        }
    }

    public C2080HU(C2137KU ku, com.soundcloud.android.properties.a aVar, C2436_U _u, C2040FU fu, C3469VY vy) {
        C7471uYa.b(ku, "experimentOperations");
        C7471uYa.b(aVar, "appFeatures");
        C7471uYa.b(_u, "featureOperations");
        C7471uYa.b(fu, "collection2Experiment");
        C7471uYa.b(vy, "errorReporter");
        this.b = ku;
        this.c = aVar;
        this.d = _u;
        this.e = fu;
        this.f = vy;
    }

    private boolean b() {
        return !this.e.a();
    }

    private boolean c() {
        return this.c.a((defpackage.C3821mba.a) C5886c.a);
    }

    private boolean d() {
        return c() && f() && !g();
    }

    private String e() {
        return this.b.a(C2118JU.c);
    }

    private boolean f() {
        return this.d.b() || this.d.l();
    }

    private boolean g() {
        String e2 = e();
        return C7471uYa.a((Object) e2, (Object) "control1") || C7471uYa.a((Object) e2, (Object) "control2");
    }

    public boolean a() {
        if (!d() || !b()) {
            return d();
        }
        defpackage.C3469VY.a.a(this.f, new b("the downloads experiment is enabled, but the collection 2 experiment is not"), null, 2, null);
        return false;
    }
}
