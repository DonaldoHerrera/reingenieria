package com.soundcloud.android.storage.provider;

import android.content.UriMatcher;
import android.net.Uri;
import android.util.SparseArray;

/* compiled from: Content */
public enum a {
    ME_LIKES("me/likes"),
    ME_SOUNDS("me/sounds"),
    ME_SOUND_STREAM("me/stream"),
    ME_ACTIVITIES("me/activities/all/own"),
    ME_FOLLOWINGS("me/followings"),
    ME_FOLLOWING("me/followings/#"),
    ME("me"),
    ME_PLAYLISTS("me/playlists"),
    TRACKS("tracks"),
    TRACK("tracks/#"),
    PLAYLIST("playlists/*"),
    SEARCH_ITEM("search/*"),
    UNKNOWN(null);
    
    private static final UriMatcher n = null;
    private static final SparseArray<a> o = null;
    public final Uri q;
    private final String r;

    static {
        int i;
        a[] values;
        n = new UriMatcher(-1);
        o = new SparseArray<>();
        for (a aVar : values()) {
            if (aVar != UNKNOWN) {
                n.addURI("com.soundcloud.android.provider.ScContentProvider", aVar.r, aVar.ordinal());
                o.put(aVar.ordinal(), aVar);
            }
        }
    }

    private a(String str) {
        this.r = str;
        StringBuilder sb = new StringBuilder();
        sb.append("content://com.soundcloud.android.provider.ScContentProvider/");
        sb.append(this.r);
        this.q = Uri.parse(sb.toString());
    }

    public static a a(Uri uri) {
        if (uri == null) {
            return null;
        }
        int match = n.match(uri);
        return match != -1 ? (a) o.get(match) : UNKNOWN;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Content.");
        sb.append(name());
        return sb.toString();
    }
}
