package com.soundcloud.android.search;

@EVa(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0010B7\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¨\u0006\u0011"}, d2 = {"Lcom/soundcloud/android/search/SearchResultsBaseAdapter;", "Lcom/soundcloud/android/uniflow/android/UniflowAdapter;", "Lcom/soundcloud/android/foundation/domain/ListItem;", "trackItemRenderer", "Lcom/soundcloud/android/presentation/LegacyCellRenderer;", "Lcom/soundcloud/android/search/SearchTrackItem;", "playlistItemRenderer", "Lcom/soundcloud/android/search/SearchPlaylistItem;", "userItemRenderer", "Lcom/soundcloud/android/search/SearchUserItem;", "searchResultHeaderRenderer", "Lcom/soundcloud/android/search/SearchResultHeaderRenderer;", "(Lcom/soundcloud/android/presentation/LegacyCellRenderer;Lcom/soundcloud/android/presentation/LegacyCellRenderer;Lcom/soundcloud/android/presentation/LegacyCellRenderer;Lcom/soundcloud/android/search/SearchResultHeaderRenderer;)V", "getBasicItemViewType", "", "position", "Kind", "base_release"}, mv = {1, 1, 15})
/* compiled from: SearchResultsBaseAdapter.kt */
public class M extends C5407WEa<Wca> {

    /* compiled from: SearchResultsBaseAdapter.kt */
    public enum a {
        TYPE_USER,
        TYPE_TRACK,
        TYPE_PLAYLIST,
        TYPE_HEADER
    }

    public M(C5541_ta<Da> _ta, C5541_ta<C5940w> _ta2, C5541_ta<Ma> _ta3, G g) {
        C7471uYa.b(_ta, "trackItemRenderer");
        C7471uYa.b(_ta2, "playlistItemRenderer");
        C7471uYa.b(_ta3, "userItemRenderer");
        C7471uYa.b(g, "searchResultHeaderRenderer");
        super((C5693cFa<? extends T>[]) new C5693cFa[]{new C5693cFa(a.TYPE_TRACK.ordinal(), _ta), new C5693cFa(a.TYPE_PLAYLIST.ordinal(), _ta2), new C5693cFa(a.TYPE_USER.ordinal(), _ta3), new C5693cFa(a.TYPE_HEADER.ordinal(), g)});
    }

    public int f(int i) {
        Wca wca = (Wca) g(i);
        if (wca instanceof F) {
            return a.TYPE_HEADER.ordinal();
        }
        if (wca instanceof Da) {
            return a.TYPE_TRACK.ordinal();
        }
        if (wca instanceof C5940w) {
            return a.TYPE_PLAYLIST.ordinal();
        }
        if (wca instanceof Ma) {
            return a.TYPE_USER.ordinal();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unexpected item type in ");
        sb.append(getClass().getSimpleName());
        sb.append(" - ");
        sb.append(g(i).toString());
        throw new IllegalStateException(sb.toString());
    }
}
