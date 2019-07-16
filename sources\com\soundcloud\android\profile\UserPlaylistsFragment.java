package com.soundcloud.android.profile;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.soundcloud.android.SoundCloudApplication;
import com.soundcloud.android.foundation.events.SearchQuerySourceInfo;
import com.soundcloud.android.ia.l;
import com.soundcloud.android.ia.p;
import java.util.HashMap;

@EVa(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u0000 \u00182\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0002\u0018\u0019B\u0005¢\u0006\u0002\u0010\u0004J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0002H\u0014J\b\u0010\u0012\u001a\u00020\u0002H\u0014J\u0010\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0002H\u0014J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0014R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\f8TX\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, d2 = {"Lcom/soundcloud/android/profile/UserPlaylistsFragment;", "Lcom/soundcloud/android/profile/UserProfilePlayableFragment;", "Lcom/soundcloud/android/profile/UserPlaylistsPresenter;", "Lcom/soundcloud/android/profile/PlayableView;", "()V", "presenterFactory", "Lcom/soundcloud/android/profile/UserPlaylistsPresenterFactory;", "getPresenterFactory", "()Lcom/soundcloud/android/profile/UserPlaylistsPresenterFactory;", "setPresenterFactory", "(Lcom/soundcloud/android/profile/UserPlaylistsPresenterFactory;)V", "presenterKey", "", "getPresenterKey", "()Ljava/lang/String;", "connectPresenter", "", "presenter", "createPresenter", "disconnectPresenter", "getEmptyStateProvider", "Lcom/soundcloud/android/view/collection/EmptyStateProvider;", "titleResId", "", "Companion", "UserPlaylistsEmptyStateProvider", "base_release"}, mv = {1, 1, 15})
/* compiled from: UserPlaylistsFragment.kt */
public final class UserPlaylistsFragment extends UserProfilePlayableFragment<Hc> implements C5849t {
    public static final a l = new a(null);
    public Ic m;
    private HashMap n;

    /* compiled from: UserPlaylistsFragment.kt */
    public static final class a {
        private a() {
        }

        @NXa
        public final Fragment a(C3508cda cda, Yca yca, SearchQuerySourceInfo searchQuerySourceInfo) {
            C7471uYa.b(cda, "userUrn");
            C7471uYa.b(yca, "screen");
            UserPlaylistsFragment userPlaylistsFragment = new UserPlaylistsFragment();
            userPlaylistsFragment.setArguments(B.a(cda, yca, searchQuerySourceInfo));
            return userPlaylistsFragment;
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }
    }

    /* compiled from: UserPlaylistsFragment.kt */
    public static final class b implements C6837lJa {
        public void a(View view, C6973nJa nja) {
            C7471uYa.b(view, "view");
            C7471uYa.b(nja, "errorType");
            defpackage.C6837lJa.a.a(this, view, nja);
        }

        public void b(View view) {
            C7471uYa.b(view, "view");
            defpackage.C6837lJa.a.b(this, view);
        }

        public int c() {
            return defpackage.C6837lJa.a.c(this);
        }

        public int d() {
            return defpackage.C6837lJa.a.a(this);
        }

        public int b() {
            return l.emptyview_profile_no_playlists;
        }

        public void a(View view) {
            C7471uYa.b(view, "view");
            defpackage.C6837lJa.a.a((C6837lJa) this, view);
        }

        public int a(C6973nJa nja) {
            C7471uYa.b(nja, "legacyError");
            return defpackage.C6837lJa.a.a((C6837lJa) this, nja);
        }

        public int a() {
            return defpackage.C6837lJa.a.b(this);
        }
    }

    public UserPlaylistsFragment() {
        SoundCloudApplication.f().a(this);
    }

    public void Rb() {
        HashMap hashMap = this.n;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    /* access modifiers changed from: protected */
    public String Ub() {
        return "userPlaylists";
    }

    public C6837lJa Xb() {
        return new b();
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        Rb();
    }

    /* access modifiers changed from: protected */
    public int Qb() {
        return p.user_profile_sounds_header_playlists;
    }

    /* access modifiers changed from: protected */
    public Hc Tb() {
        Ic ic = this.m;
        if (ic != null) {
            C3508cda b2 = C5526_Ha.b(getArguments(), "user_urn_key");
            String str = "Required value was null.";
            if (b2 != null) {
                Bundle arguments = getArguments();
                if (arguments != null) {
                    return ic.a(b2, (SearchQuerySourceInfo) arguments.getParcelable("search_query_source_info_key"));
                }
                throw new IllegalArgumentException(str);
            }
            throw new IllegalArgumentException(str);
        }
        C7471uYa.b("presenterFactory");
        throw null;
    }

    /* access modifiers changed from: protected */
    public void a(Hc hc) {
        C7471uYa.b(hc, "presenter");
        hc.a((C5849t) this);
    }

    /* access modifiers changed from: protected */
    public void b(Hc hc) {
        C7471uYa.b(hc, "presenter");
        hc.a();
    }
}
