package defpackage;

import android.content.Context;
import com.soundcloud.android.collection.C2839u;
import com.soundcloud.android.collection.C2840v;
import com.soundcloud.android.offline.Jd;
import com.soundcloud.android.offline.Kd;
import com.soundcloud.android.search.history.l;
import com.soundcloud.android.search.history.m;
import com.soundcloud.android.stations.Ia;
import com.soundcloud.android.stations.Ja;
import com.soundcloud.android.tracks.W;
import com.soundcloud.android.tracks.X;

/* renamed from: pya reason: default package and case insensitive filesystem */
/* compiled from: SqlBriteDatabaseModule */
public abstract class C7163pya {
    static Jd a(Context context, Kd kd, HPa hPa) {
        return new Jd(C3930Bfa.a(context, "offline.db", kd), hPa);
    }

    static l a(Context context, m mVar, HPa hPa) {
        return new l(C3930Bfa.a(context, "search_history.db", mVar), hPa);
    }

    static C3869sba a(Context context, C3877tba tba, HPa hPa) {
        return new C3869sba(C3930Bfa.a(context, "following.db", tba), hPa);
    }

    static C2839u a(Context context, C2840v vVar, HPa hPa) {
        return new C2839u(C3930Bfa.a(context, "collection.db", vVar), hPa);
    }

    static C3826nY a(Context context, C3834oY oYVar, HPa hPa) {
        return new C3826nY(C3930Bfa.a(context, "discovery.db", oYVar), hPa);
    }

    static C3758eca a(Context context, C3766fca fca, HPa hPa) {
        return new C3758eca(C3930Bfa.a(context, "play_queue.db", fca), hPa);
    }

    static W a(Context context, X x, HPa hPa) {
        return new W(C3930Bfa.a(context, "media_streams.db", x), hPa);
    }

    static Ia a(Context context, Ja ja, HPa hPa) {
        return new Ia(C3930Bfa.a(context, "station.db", ja), hPa);
    }
}
