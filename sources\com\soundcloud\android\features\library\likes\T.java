package com.soundcloud.android.features.library.likes;

import com.soundcloud.android.likes.V;
import com.soundcloud.android.likes.la;
import com.soundcloud.android.view.C6223l;
import java.util.List;

@EVa(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\t\bf\u0018\u00002 \u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0001J\b\u0010\u001b\u001a\u00020\bH&J\b\u0010\u001c\u001a\u00020\bH&J\b\u0010\u001d\u001a\u00020\bH&R\u0018\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0018\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\nR\u0018\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\nR\u0018\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\nR*\u0010\u0012\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00020\u00130\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\nR\u0018\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\nR\u0018\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\nø\u0001\u0000\u0002\u0004\n\u0002\b\u0019¨\u0006\u001e"}, d2 = {"Lcom/soundcloud/android/features/library/likes/TrackLikesView;", "Lcom/soundcloud/android/view/BaseView;", "", "Lcom/soundcloud/android/likes/TrackLikesUniflowItem;", "Lcom/soundcloud/android/view/collection/LegacyError;", "Lcom/soundcloud/android/features/library/likes/TrackLikesParams;", "emptyActionClick", "Lio/reactivex/Observable;", "", "getEmptyActionClick", "()Lio/reactivex/Observable;", "offlineToggled", "", "getOfflineToggled", "searchClick", "getSearchClick", "shuffleClick", "getShuffleClick", "trackClick", "Lkotlin/Pair;", "", "Lcom/soundcloud/android/likes/TrackLikesTrackUniflowItem;", "getTrackClick", "upsellClick", "getUpsellClick", "upsellImpression", "getUpsellImpression", "showConfirmRemoveOfflineDialog", "showOfflineStorageErrorDialog", "showSyncLikesDialog", "collections-ui_release"}, mv = {1, 1, 15})
/* compiled from: TrackLikesPresenter.kt */
public interface T extends C6223l<List<? extends la>, C6973nJa, y, y> {

    /* compiled from: TrackLikesPresenter.kt */
    public static final class a {
        public static void a(T t) {
            com.soundcloud.android.view.C6223l.a.b(t);
        }
    }

    APa<RVa> Fa();

    void U();

    APa<Boolean> Y();

    APa<RVa> Z();

    APa<RVa> aa();

    void da();

    APa<RVa> ea();

    void la();

    APa<HVa<Integer, List<V>>> o();

    APa<RVa> x();
}
