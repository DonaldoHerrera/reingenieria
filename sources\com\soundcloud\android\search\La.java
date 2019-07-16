package com.soundcloud.android.search;

import android.content.res.Resources;
import com.soundcloud.android.ia.p;
import java.util.Arrays;
import java.util.List;

/* compiled from: SearchType */
public enum La {
    ALL(p.search_type_all, Yca.SEARCH_EVERYTHING, true),
    TRACKS(p.search_type_tracks, Yca.SEARCH_TRACKS, false),
    USERS(p.search_type_people, Yca.SEARCH_USERS, false),
    ALBUMS(p.search_type_albums, Yca.SEARCH_ALBUMS, false),
    PLAYLISTS(p.search_type_playlists, Yca.SEARCH_PLAYLISTS, false);
    
    private final int g;
    private final Yca h;
    private final boolean i;

    private La(int i2, Yca yca, boolean z) {
        this.g = i2;
        this.h = yca;
        this.i = z;
    }

    /* access modifiers changed from: 0000 */
    public String a(Resources resources) {
        return resources.getString(this.g);
    }

    public Yca b() {
        return this.h;
    }

    /* access modifiers changed from: 0000 */
    public boolean c() {
        return this.i;
    }

    static List<La> a() {
        return Arrays.asList(values());
    }

    static La a(int i2) {
        return (La) a().get(i2);
    }
}
