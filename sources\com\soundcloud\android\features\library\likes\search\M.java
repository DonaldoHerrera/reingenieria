package com.soundcloud.android.features.library.likes.search;

import com.soundcloud.android.view.C6223l;
import java.util.List;

@EVa(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0001J\b\u0010\u0012\u001a\u00020\u0004H&J\b\u0010\u0013\u001a\u00020\u0004H&J\u0010\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0015H&J\b\u0010\u0016\u001a\u00020\u0004H&R\u0018\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0006X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\bR*\u0010\f\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\r0\u0006X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\b¨\u0006\u0017"}, d2 = {"Lcom/soundcloud/android/features/library/likes/search/TrackLikesSearchView;", "Lcom/soundcloud/android/view/BaseView;", "Lcom/soundcloud/android/features/library/likes/search/TrackLikesSearchViewModel;", "Lcom/soundcloud/android/features/library/likes/search/Error;", "", "searchClearClicked", "Lio/reactivex/Observable;", "getSearchClearClicked", "()Lio/reactivex/Observable;", "searchQuery", "", "getSearchQuery", "trackClick", "Lkotlin/Pair;", "", "", "Lcom/soundcloud/android/features/library/likes/search/TrackLikesSearchItem;", "getTrackClick", "clearSearchQuery", "hideKeyboard", "showClearButton", "", "snapToTop", "collections-ui_release"}, mv = {1, 1, 15})
/* compiled from: TrackLikesSearchPresenter.kt */
public interface M extends C6223l<N, C3605a, RVa, RVa> {

    /* compiled from: TrackLikesSearchPresenter.kt */
    public static final class a {
        public static APa<RVa> a(M m) {
            return com.soundcloud.android.view.C6223l.a.a(m);
        }

        public static void b(M m) {
            com.soundcloud.android.view.C6223l.a.b(m);
        }
    }

    void Aa();

    APa<RVa> Ga();

    APa<String> Ma();

    void b(boolean z);

    APa<HVa<Integer, List<x>>> o();

    void sa();

    void ta();
}
