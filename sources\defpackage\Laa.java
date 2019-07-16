package defpackage;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: Laa reason: default package */
/* compiled from: PlaylistMarkedForOfflineStateChangedEvent */
public abstract class Laa extends Jaa<Boolean> {
    public static Laa a(List<C3508cda> list) {
        return new C3505caa(a.PLAYLIST_MARKED_FOR_DOWNLOAD, a(list, true));
    }

    public static Laa b(List<C3508cda> list) {
        return new C3505caa(a.PLAYLIST_MARKED_FOR_DOWNLOAD, a(list, false));
    }

    private static Map<C3508cda, Boolean> a(List<C3508cda> list, boolean z) {
        HashMap hashMap = new HashMap(list.size());
        for (C3508cda put : list) {
            hashMap.put(put, Boolean.valueOf(z));
        }
        return hashMap;
    }
}
