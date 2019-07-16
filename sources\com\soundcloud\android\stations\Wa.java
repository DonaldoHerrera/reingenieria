package com.soundcloud.android.stations;

import com.soundcloud.android.stations.Za.a;
import java.util.List;

/* compiled from: StationInfoHeader */
abstract class Wa extends Za implements Vca, Uca {
    Wa() {
        super(a.STATION_HEADER);
    }

    public static Wa a(Pb pb) {
        C6055w wVar = new C6055w(pb.g(), pb.f(), pb.e(), pb.b(), pb.a(), pb.h());
        return wVar;
    }

    public abstract C3508cda a();

    public abstract C4928GKa<String> b();

    public abstract List<String> g();

    public abstract String getTitle();

    public abstract String getType();

    public abstract boolean h();
}
