package defpackage;

import java.util.Map;
import java.util.Set;

/* renamed from: Jaa reason: default package */
/* compiled from: PlaylistChangedEvent */
public abstract class Jaa<T> {
    public static final C7118pQa<Jaa, Set<C3508cda>> a = C3923zZ.a;

    /* renamed from: Jaa$a */
    /* compiled from: PlaylistChangedEvent */
    public enum a {
        TRACK_ADDED,
        TRACK_REMOVED,
        PLAYLIST_MARKED_FOR_DOWNLOAD,
        PLAYLIST_UPDATED,
        PLAYLIST_EDITED,
        PLAYLIST_PUSHED_TO_SERVER
    }

    public abstract Map<C3508cda, T> a();

    public abstract a b();
}
