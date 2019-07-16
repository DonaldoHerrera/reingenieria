package com.soundcloud.android.stream;

import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.soundcloud.android.ads.C2617ra;
import com.soundcloud.android.playback.C4536zc;
import com.soundcloud.android.upsell.l;
import com.soundcloud.android.view.C6223l;

@EVa(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001:\u0001$J\u000e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u0007H&J\u000e\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0007H&J\u0010\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001dH&J\u000e\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0007H&J\u000e\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00040\u0007H&J\u000e\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u0007H&J\u000e\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00180\u0007H&R\u0018\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0018\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\nR\u0018\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\nR\u0018\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\nR\u0018\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\nR\u0018\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\n¨\u0006%"}, d2 = {"Lcom/soundcloud/android/stream/StreamView;", "Lcom/soundcloud/android/view/BaseView;", "Lcom/soundcloud/android/stream/StreamViewModel;", "Lcom/soundcloud/android/view/collection/LegacyError;", "", "Lcom/soundcloud/android/stream/StreamView$RefreshType;", "layoutManagerChange", "Lio/reactivex/Observable;", "Landroidx/recyclerview/widget/StaggeredGridLayoutManager;", "getLayoutManagerChange", "()Lio/reactivex/Observable;", "scrollReset", "getScrollReset", "scrollStateChange", "", "getScrollStateChange", "scrolled", "getScrolled", "searchActionClick", "getSearchActionClick", "visible", "Lcom/soundcloud/android/stream/ViewVisibilityState;", "getVisible", "appInstallCallback", "Lcom/soundcloud/android/ads/AdItemCallback;", "playlistClick", "Lcom/soundcloud/android/stream/PlaylistStreamItem;", "showPlaybackResult", "playbackResult", "Lcom/soundcloud/android/playback/PlaybackResult;", "trackClick", "Lcom/soundcloud/android/stream/TrackStreamItemClickParams;", "upsellHeaderItemCallback", "upsellItemCallback", "Lcom/soundcloud/android/upsell/UpsellItemCallback;", "videoAdItemCallback", "RefreshType", "base_release"}, mv = {1, 1, 15})
/* compiled from: StreamPresenter.kt */
public interface rb extends C6223l<sb, C6973nJa, RVa, b> {

    /* compiled from: StreamPresenter.kt */
    public static final class a {
        public static void a(rb rbVar) {
            com.soundcloud.android.view.C6223l.a.b(rbVar);
        }
    }

    /* compiled from: StreamPresenter.kt */
    public enum b {
        FROM_DB,
        FROM_API
    }

    APa<RVa> Ca();

    APa<Integer> La();

    APa<RVa> Ra();

    void a(C4536zc zcVar);

    APa<C6102s> k();

    APa<ub> l();

    APa<vb> pa();

    APa<C2617ra> ra();

    APa<C2617ra> ua();

    APa<StaggeredGridLayoutManager> va();

    APa<l> ya();

    APa<Integer> za();
}
