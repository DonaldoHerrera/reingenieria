package com.soundcloud.android.foundation.playqueue;

import com.soundcloud.android.foundation.events.SearchQuerySourceInfo;
import java.util.Arrays;
import java.util.List;

/* compiled from: PlaybackContext */
public abstract class v {

    /* compiled from: PlaybackContext */
    public enum a {
        EXPLICIT(new Yca[0]),
        AUTO_PLAY(new Yca[0]),
        PLAYLIST(new Yca[0]),
        TRACK_STATION(new Yca[0]),
        ARTIST_STATION(new Yca[0]),
        PROFILE(new Yca[0]),
        LISTENING_HISTORY(new Yca[0]),
        STREAM(Yca.STREAM),
        LINK(Yca.DEEPLINK),
        YOUR_LIKES(Yca.LIKES, Yca.YOUR_LIKES),
        SEARCH_RESULT(Yca.SEARCH_EVERYTHING, Yca.SEARCH_TRACKS),
        CAST(new Yca[0]),
        OTHER(new Yca[0]);
        
        private List<Yca> o;

        private a(Yca... ycaArr) {
            this.o = Arrays.asList(ycaArr);
        }

        static a a(Yca yca) {
            a[] values;
            for (a aVar : values()) {
                if (aVar.o.contains(yca)) {
                    return aVar;
                }
            }
            return OTHER;
        }

        public static C4928GKa<a> a(String str) {
            a[] values;
            for (a aVar : values()) {
                if (aVar.toString().equals(str)) {
                    return C4928GKa.c(aVar);
                }
            }
            return C4928GKa.a();
        }
    }

    /* compiled from: PlaybackContext */
    public static abstract class b {
        public abstract b a(C4928GKa<String> gKa);

        public abstract b a(a aVar);

        public abstract v a();

        public abstract b b(C4928GKa<C3508cda> gKa);
    }

    public static v a(PlaySessionSource playSessionSource) {
        return b().a(b(playSessionSource)).b(d(playSessionSource)).a(c(playSessionSource)).a();
    }

    private static a b(PlaySessionSource playSessionSource) {
        String g = playSessionSource.g();
        C3508cda d = playSessionSource.d();
        m e = playSessionSource.e();
        if (d.u()) {
            return a.PLAYLIST;
        }
        if (d.J()) {
            return a.PROFILE;
        }
        if (d.f()) {
            return a.ARTIST_STATION;
        }
        if (d.y()) {
            return a.TRACK_STATION;
        }
        if (playSessionSource.l()) {
            return a.LISTENING_HISTORY;
        }
        if (m.CAST.equals(e)) {
            return a.CAST;
        }
        return a.a(Yca.a(g));
    }

    private static C4928GKa<String> c(PlaySessionSource playSessionSource) {
        if (playSessionSource.n()) {
            SearchQuerySourceInfo j = playSessionSource.j();
            if (j != null) {
                return C4928GKa.b(j.d());
            }
        }
        return C4928GKa.a();
    }

    private static C4928GKa<C3508cda> d(PlaySessionSource playSessionSource) {
        return a(playSessionSource.d());
    }

    public abstract a a();

    public abstract C4928GKa<String> c();

    public abstract C4928GKa<C3508cda> d();

    public static v a(a aVar) {
        return a(aVar, C4928GKa.a());
    }

    public static v a(a aVar, C4928GKa<C3508cda> gKa) {
        return b().a(aVar).b(gKa).a(C4928GKa.a()).a();
    }

    public static C4928GKa<C3508cda> a(C3508cda cda) {
        return C3508cda.a.equals(cda) ? C4928GKa.a() : C4928GKa.c(cda);
    }

    public static b b() {
        return new a();
    }
}
