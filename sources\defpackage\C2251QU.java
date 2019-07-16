package defpackage;

import com.soundcloud.android.properties.m.p;

@EVa(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0016\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\bH\u0012R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/soundcloud/android/configuration/experiments/PlayQueueVideoAdsExperiment;", "", "experimentOperations", "Lcom/soundcloud/android/configuration/experiments/ExperimentOperations;", "appFeatures", "Lcom/soundcloud/android/properties/AppFeatures;", "(Lcom/soundcloud/android/configuration/experiments/ExperimentOperations;Lcom/soundcloud/android/properties/AppFeatures;)V", "isEnabled", "", "isInExperimentGroup", "Companion", "experiments-active_release"}, mv = {1, 1, 15})
/* renamed from: QU reason: default package and case insensitive filesystem */
/* compiled from: PlayQueueVideoAdsExperiment.kt */
public class C2251QU {
    public static final a a = new a(null);
    private final C2137KU b;
    private final com.soundcloud.android.properties.a c;

    /* renamed from: QU$a */
    /* compiled from: PlayQueueVideoAdsExperiment.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }
    }

    public C2251QU(C2137KU ku, com.soundcloud.android.properties.a aVar) {
        C7471uYa.b(ku, "experimentOperations");
        C7471uYa.b(aVar, "appFeatures");
        this.b = ku;
        this.c = aVar;
    }

    private boolean b() {
        return C7471uYa.a((Object) this.b.a(C2118JU.b), (Object) "75mvideo_3");
    }

    public boolean a() {
        return this.c.a((defpackage.C3821mba.a) p.a) || b();
    }
}
