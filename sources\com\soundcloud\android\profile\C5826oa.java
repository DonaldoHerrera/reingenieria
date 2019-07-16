package com.soundcloud.android.profile;

import com.soundcloud.android.view.C6223l;
import com.soundcloud.android.view.V;
import com.soundcloud.android.view.W;

@EVa(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u00052\u00020\u0006J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH&J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\bH&J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\bH&¨\u0006\r"}, d2 = {"Lcom/soundcloud/android/profile/ProfileBucketsView;", "Lcom/soundcloud/android/view/BaseView;", "Lcom/soundcloud/android/profile/ProfileBucketsViewModel;", "Lcom/soundcloud/android/view/collection/LegacyError;", "", "Lcom/soundcloud/android/view/ViewWithTracks;", "Lcom/soundcloud/android/view/ViewWithNavigation;", "onPlaylistClicked", "Lio/reactivex/Observable;", "Lcom/soundcloud/android/navigation/NavigationTarget;", "onTrackClicked", "Lcom/soundcloud/android/playback/PlaybackInitiator$PlayParams;", "onViewAllClicked", "base_release"}, mv = {1, 1, 15})
/* renamed from: com.soundcloud.android.profile.oa reason: case insensitive filesystem */
/* compiled from: ProfileBucketsPresenter.kt */
public interface C5826oa extends C6223l<C5831pa, C6973nJa, RVa, RVa>, W, V {

    /* renamed from: com.soundcloud.android.profile.oa$a */
    /* compiled from: ProfileBucketsPresenter.kt */
    public static final class a {
        public static APa<RVa> a(C5826oa oaVar) {
            return com.soundcloud.android.view.C6223l.a.a(oaVar);
        }

        public static void b(C5826oa oaVar) {
            com.soundcloud.android.view.C6223l.a.b(oaVar);
        }
    }

    APa<C4621nja> E();

    APa<com.soundcloud.android.playback.Db.a> n();

    APa<C4621nja> r();
}
