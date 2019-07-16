package com.soundcloud.android.collection.recentlyplayed;

import com.soundcloud.android.view.C6223l;
import java.util.List;

@EVa(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002 \u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0001J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H&J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0007H&J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0007H&J\b\u0010\u000e\u001a\u00020\u0005H&J\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u0007H&R\u0018\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u0010"}, d2 = {"Lcom/soundcloud/android/collection/recentlyplayed/RecentlyPlayedView;", "Lcom/soundcloud/android/view/BaseView;", "", "Lcom/soundcloud/android/collection/recentlyplayed/RecentlyPlayedItem;", "Lcom/soundcloud/android/view/collection/LegacyError;", "", "clearConfirmationClick", "Lio/reactivex/Observable;", "getClearConfirmationClick", "()Lio/reactivex/Observable;", "clearContent", "playlistClick", "Lcom/soundcloud/android/foundation/domain/Urn;", "profileClick", "showClearContentDialog", "stationClick", "base_release"}, mv = {1, 1, 15})
/* compiled from: RecentlyPlayedPresenter.kt */
public interface Ma extends C6223l<List<? extends E>, C6973nJa, RVa, RVa> {

    /* compiled from: RecentlyPlayedPresenter.kt */
    public static final class a {
        public static APa<RVa> a(Ma ma) {
            return com.soundcloud.android.view.C6223l.a.a(ma);
        }

        public static void b(Ma ma) {
            com.soundcloud.android.view.C6223l.a.b(ma);
        }
    }

    APa<C3508cda> Da();

    APa<C3508cda> J();

    APa<RVa> S();

    void W();

    APa<RVa> ia();

    APa<C3508cda> k();
}
