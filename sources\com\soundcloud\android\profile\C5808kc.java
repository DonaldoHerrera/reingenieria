package com.soundcloud.android.profile;

@EVa(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011B\u0017\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016J\u0014\u0010\u000b\u001a\u0010\u0012\f\u0012\n \u000e*\u0004\u0018\u00010\r0\r0\fJ\u0014\u0010\u000f\u001a\u0010\u0012\f\u0012\n \u000e*\u0004\u0018\u00010\u00100\u00100\fR\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/soundcloud/android/profile/UserPlayableAdapter;", "Lcom/soundcloud/android/uniflow/android/UniflowAdapter;", "Lcom/soundcloud/android/profile/UserPlayableItem;", "userTracksItemRenderer", "Lcom/soundcloud/android/profile/UserTracksItemRenderer;", "userPlaylistsItemRenderer", "Lcom/soundcloud/android/profile/UserPlaylistsItemRenderer;", "(Lcom/soundcloud/android/profile/UserTracksItemRenderer;Lcom/soundcloud/android/profile/UserPlaylistsItemRenderer;)V", "getBasicItemViewType", "", "position", "playlistClick", "Lio/reactivex/subjects/PublishSubject;", "Lcom/soundcloud/android/profile/UserPlaylistsItemClickParams;", "kotlin.jvm.PlatformType", "trackClick", "Lcom/soundcloud/android/profile/UserTracksItemClickParams;", "Kind", "base_release"}, mv = {1, 1, 15})
/* renamed from: com.soundcloud.android.profile.kc reason: case insensitive filesystem */
/* compiled from: UserPlayableAdapter.kt */
public final class C5808kc extends C5407WEa<C5818mc> {
    private final ee g;
    private final Bc h;

    /* renamed from: com.soundcloud.android.profile.kc$a */
    /* compiled from: UserPlayableAdapter.kt */
    public enum a {
        TRACK,
        PLAYLIST
    }

    public C5808kc(ee eeVar, Bc bc) {
        C7471uYa.b(eeVar, "userTracksItemRenderer");
        C7471uYa.b(bc, "userPlaylistsItemRenderer");
        super((C5693cFa<? extends T>[]) new C5693cFa[]{new C5693cFa(a.TRACK.ordinal(), eeVar), new C5693cFa(a.PLAYLIST.ordinal(), bc)});
        this.g = eeVar;
        this.h = bc;
    }

    public int f(int i) {
        C5818mc mcVar = (C5818mc) g(i);
        if (mcVar instanceof be) {
            return a.TRACK.ordinal();
        }
        if (mcVar instanceof C5877yc) {
            return a.PLAYLIST.ordinal();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unhandled adapter type ");
        sb.append((C5818mc) g(i));
        throw new IllegalArgumentException(sb.toString());
    }

    public final C6781kVa<C5882zc> j() {
        return this.h.a();
    }

    public final C6781kVa<ce> k() {
        return this.g.a();
    }
}
