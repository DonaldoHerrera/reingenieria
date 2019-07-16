package com.soundcloud.android.discovery.systemplaylist;

import com.soundcloud.android.foundation.playqueue.PlaySessionSource;
import java.util.List;

/* compiled from: SystemPlaylistPresenter.kt */
public final class ea {
    private final PlaySessionSource a;
    private final List<C3508cda> b;
    private final int c;

    public ea(PlaySessionSource playSessionSource, List<C3508cda> list, int i) {
        C7471uYa.b(playSessionSource, "playSessionSource");
        C7471uYa.b(list, "allPlayables");
        this.a = playSessionSource;
        this.b = list;
        this.c = i;
    }

    public final List<C3508cda> a() {
        return this.b;
    }

    public final PlaySessionSource b() {
        return this.a;
    }

    public final int c() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ea) {
                ea eaVar = (ea) obj;
                if (C7471uYa.a((Object) this.a, (Object) eaVar.a) && C7471uYa.a((Object) this.b, (Object) eaVar.b)) {
                    if (this.c == eaVar.c) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        PlaySessionSource playSessionSource = this.a;
        int i = 0;
        int hashCode = (playSessionSource != null ? playSessionSource.hashCode() : 0) * 31;
        List<C3508cda> list = this.b;
        if (list != null) {
            i = list.hashCode();
        }
        return ((hashCode + i) * 31) + this.c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("TrackClickParams(playSessionSource=");
        sb.append(this.a);
        sb.append(", allPlayables=");
        sb.append(this.b);
        sb.append(", trackIndexInPlaylist=");
        sb.append(this.c);
        sb.append(")");
        return sb.toString();
    }
}
