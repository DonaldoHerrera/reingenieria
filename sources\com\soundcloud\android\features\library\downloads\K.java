package com.soundcloud.android.features.library.downloads;

import com.soundcloud.android.view.C6223l;
import com.soundcloud.android.view.V;
import com.soundcloud.android.view.W;
import java.util.List;

@EVa(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002 \u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00012\u00020\u00062\u00020\u0007J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\tH&J \u0010\u000e\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u000f0\tH&R\u0018\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u0010"}, d2 = {"Lcom/soundcloud/android/features/library/downloads/DownloadsView;", "Lcom/soundcloud/android/view/BaseView;", "", "Lcom/soundcloud/android/features/library/downloads/DownloadsLibraryItem;", "Lcom/soundcloud/android/features/library/downloads/Error;", "", "Lcom/soundcloud/android/view/ViewWithTracks;", "Lcom/soundcloud/android/view/ViewWithNavigation;", "emptyActionClick", "Lio/reactivex/Observable;", "getEmptyActionClick", "()Lio/reactivex/Observable;", "playlistClick", "Lcom/soundcloud/android/features/library/downloads/DownloadsLibraryItem$Playlist;", "trackClick", "Lkotlin/Pair;", "collections-ui_release"}, mv = {1, 1, 15})
/* compiled from: DownloadsPresenter.kt */
public interface K extends C6223l<List<? extends s>, L, RVa, RVa>, W, V {

    /* compiled from: DownloadsPresenter.kt */
    public static final class a {
        public static APa<RVa> a(K k) {
            return com.soundcloud.android.view.C6223l.a.a(k);
        }

        public static void b(K k) {
            com.soundcloud.android.view.C6223l.a.b(k);
        }
    }

    APa<com.soundcloud.android.features.library.downloads.s.a> k();

    APa<HVa<s, List<s>>> l();

    APa<RVa> x();
}
