package com.soundcloud.android.search.history;

import com.soundcloud.android.search.history.s.b;
import com.soundcloud.android.view.C6223l;
import java.util.List;

@EVa(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002 \u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0001R\u0018\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0018\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\nR\u0018\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\n¨\u0006\u000f"}, d2 = {"Lcom/soundcloud/android/search/history/SearchHistoryView;", "Lcom/soundcloud/android/view/BaseView;", "", "Lcom/soundcloud/android/search/history/SearchHistoryItem;", "Lcom/soundcloud/android/view/collection/LegacyError;", "", "autocompleteArrowClickListener", "Lio/reactivex/Observable;", "Lcom/soundcloud/android/search/history/SearchHistoryItem$SearchHistoryListItem;", "getAutocompleteArrowClickListener", "()Lio/reactivex/Observable;", "clearHistoryClickListener", "getClearHistoryClickListener", "itemClickListener", "getItemClickListener", "base_release"}, mv = {1, 1, 15})
/* compiled from: SearchHistoryPresenter.kt */
public interface J extends C6223l<List<? extends s>, C6973nJa, RVa, RVa> {

    /* compiled from: SearchHistoryPresenter.kt */
    public static final class a {
        public static APa<RVa> a(J j) {
            return com.soundcloud.android.view.C6223l.a.a(j);
        }

        public static void b(J j) {
            com.soundcloud.android.view.C6223l.a.b(j);
        }
    }

    APa<RVa> Ia();

    APa<b> Oa();

    APa<b> xa();
}
