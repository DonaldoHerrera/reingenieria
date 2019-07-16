package defpackage;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;

/* renamed from: Kaa reason: default package */
/* compiled from: PlaylistEntityChangedEvent */
public abstract class Kaa extends Jaa<Eda> {
    public static Kaa a(C3508cda cda, Eda eda) {
        return new C3497baa(a.PLAYLIST_PUSHED_TO_SERVER, Collections.singletonMap(cda, eda));
    }

    public static Kaa a(Eda eda) {
        return new C3497baa(a.PLAYLIST_EDITED, Collections.singletonMap(eda.v(), eda));
    }

    public static Kaa a(Collection<Eda> collection) {
        HashMap hashMap = new HashMap(collection.size());
        for (Eda eda : collection) {
            hashMap.put(eda.v(), eda);
        }
        return new C3497baa(a.PLAYLIST_UPDATED, hashMap);
    }
}
