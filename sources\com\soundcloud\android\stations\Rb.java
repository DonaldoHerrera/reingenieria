package com.soundcloud.android.stations;

@EVa(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\u0018\u0000 \u00142\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0014B\u000f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000fH\u0016R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001f\u0010\b\u001a\u0010\u0012\f\u0012\n \u000b*\u0004\u0018\u00010\n0\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0015"}, d2 = {"Lcom/soundcloud/android/stations/StationsAdapter;", "Lcom/soundcloud/android/uniflow/android/UniflowAdapter;", "Lcom/soundcloud/android/stations/StationViewModel;", "renderer", "Lcom/soundcloud/android/stations/StationRenderer;", "(Lcom/soundcloud/android/stations/StationRenderer;)V", "getRenderer", "()Lcom/soundcloud/android/stations/StationRenderer;", "stationClicked", "Lio/reactivex/subjects/PublishSubject;", "Lcom/soundcloud/android/foundation/domain/Urn;", "kotlin.jvm.PlatformType", "getStationClicked", "()Lio/reactivex/subjects/PublishSubject;", "getBasicItemViewType", "", "i", "getItemId", "", "position", "Companion", "base_release"}, mv = {1, 1, 15})
/* compiled from: StationsAdapter.kt */
public final class Rb extends C5407WEa<Nb> {
    public static final a g = new a(null);
    private final C6781kVa<C3508cda> h = this.i.a();
    private final Gb i;

    /* compiled from: StationsAdapter.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }
    }

    public Rb(Gb gb) {
        C7471uYa.b(gb, "renderer");
        super((C6289dFa<T>) gb);
        this.i = gb;
        a(true);
    }

    public long a(int i2) {
        return ((Nb) g(i2)).a().a().c();
    }

    public int f(int i2) {
        return 0;
    }

    public final C6781kVa<C3508cda> j() {
        return this.h;
    }
}
