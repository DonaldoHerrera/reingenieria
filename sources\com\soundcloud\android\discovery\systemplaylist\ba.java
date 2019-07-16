package com.soundcloud.android.discovery.systemplaylist;

import java.util.List;

/* compiled from: SystemPlaylistPresenter.kt */
public final class ba {
    private final List<ca> a;

    public ba(List<? extends ca> list) {
        C7471uYa.b(list, "playlistItems");
        this.a = list;
    }

    public final List<ca> a() {
        return this.a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (defpackage.C7471uYa.a((java.lang.Object) r1.a, (java.lang.Object) ((com.soundcloud.android.discovery.systemplaylist.ba) r2).a) != false) goto L_0x0015;
     */
    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ba) {
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        List<ca> list = this.a;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SystemPlaylistViewModel(playlistItems=");
        sb.append(this.a);
        sb.append(")");
        return sb.toString();
    }
}
