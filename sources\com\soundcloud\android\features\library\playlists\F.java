package com.soundcloud.android.features.library.playlists;

import com.soundcloud.android.view.C6223l;
import java.util.List;

@EVa(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002 \u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0001J\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0007H&J\u0010\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\bH&R\u0018\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0018\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\nR\u0018\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\n¨\u0006\u0013"}, d2 = {"Lcom/soundcloud/android/features/library/playlists/PlaylistCollectionView;", "Lcom/soundcloud/android/view/BaseView;", "", "Lcom/soundcloud/android/features/library/playlists/PlaylistCollectionItem;", "Lcom/soundcloud/android/view/collection/LegacyError;", "", "onFiltersChanged", "Lio/reactivex/Observable;", "Lcom/soundcloud/android/foundation/domain/playable/PlaylistsOptions;", "getOnFiltersChanged", "()Lio/reactivex/Observable;", "onFiltersClicked", "getOnFiltersClicked", "onRemoveFiltersClicked", "getOnRemoveFiltersClicked", "playlistClick", "Lcom/soundcloud/android/foundation/domain/Urn;", "showFiltersDialog", "initialOptions", "collections-ui_release"}, mv = {1, 1, 15})
/* compiled from: PlaylistCollectionPresenter.kt */
public interface F extends C6223l<List<? extends C3635l>, C6973nJa, RVa, RVa> {

    /* compiled from: PlaylistCollectionPresenter.kt */
    public static final class a {
        public static APa<RVa> a(F f) {
            return com.soundcloud.android.view.C6223l.a.a(f);
        }

        public static void b(F f) {
            com.soundcloud.android.view.C6223l.a.b(f);
        }
    }

    APa<C3871sda> Ka();

    APa<RVa> Na();

    void a(C3871sda sda);

    APa<C3508cda> k();

    APa<RVa> wa();
}
