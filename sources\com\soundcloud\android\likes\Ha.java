package com.soundcloud.android.likes;

import com.soundcloud.android.view.C6223l;
import java.util.List;

@EVa(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\t\bf\u0018\u00002 \u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0001J\b\u0010\u0017\u001a\u00020\fH&J\b\u0010\u0018\u001a\u00020\fH&J\b\u0010\u0019\u001a\u00020\fH&R\u0018\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0018\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\nR*\u0010\u000e\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00020\u000f0\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\nR\u0018\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\f0\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\nR\u0018\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\f0\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\n¨\u0006\u001a"}, d2 = {"Lcom/soundcloud/android/likes/TrackLikesUniflowView;", "Lcom/soundcloud/android/view/BaseView;", "", "Lcom/soundcloud/android/likes/TrackLikesUniflowItem;", "Lcom/soundcloud/android/view/collection/LegacyError;", "Lcom/soundcloud/android/likes/TrackLikesParams;", "offlineToggled", "Lio/reactivex/Observable;", "", "getOfflineToggled", "()Lio/reactivex/Observable;", "shuffleClick", "", "getShuffleClick", "trackClick", "Lkotlin/Pair;", "", "Lcom/soundcloud/android/likes/TrackLikesTrackUniflowItem;", "getTrackClick", "upsellClick", "getUpsellClick", "upsellImpression", "getUpsellImpression", "showConfirmRemoveOfflineDialog", "showOfflineStorageErrorDialog", "showSyncLikesDialog", "base_release"}, mv = {1, 1, 15})
/* compiled from: TrackLikesUniflowPresenter.kt */
public interface Ha extends C6223l<List<? extends la>, C6973nJa, U, U> {

    /* compiled from: TrackLikesUniflowPresenter.kt */
    public static final class a {
        public static void a(Ha ha) {
            com.soundcloud.android.view.C6223l.a.b(ha);
        }
    }

    void U();

    APa<Boolean> Y();

    APa<RVa> Z();

    APa<RVa> aa();

    void da();

    APa<RVa> ea();

    void la();

    APa<HVa<Integer, List<V>>> o();
}
