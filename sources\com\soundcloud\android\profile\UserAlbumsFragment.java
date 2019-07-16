package com.soundcloud.android.profile;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.soundcloud.android.SoundCloudApplication;
import com.soundcloud.android.foundation.events.SearchQuerySourceInfo;
import com.soundcloud.android.ia.l;
import com.soundcloud.android.ia.p;
import java.util.HashMap;

@EVa(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u0000 \u00172\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0017\u0018B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0002H\u0014J\b\u0010\u0011\u001a\u00020\u0002H\u0014J\u0010\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0002H\u0014J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0014R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u000b8TX\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u0019"}, d2 = {"Lcom/soundcloud/android/profile/UserAlbumsFragment;", "Lcom/soundcloud/android/profile/UserProfilePlayableFragment;", "Lcom/soundcloud/android/profile/UserAlbumsPresenter;", "()V", "presenterFactory", "Lcom/soundcloud/android/profile/UserAlbumsPresenterFactory;", "getPresenterFactory", "()Lcom/soundcloud/android/profile/UserAlbumsPresenterFactory;", "setPresenterFactory", "(Lcom/soundcloud/android/profile/UserAlbumsPresenterFactory;)V", "presenterKey", "", "getPresenterKey", "()Ljava/lang/String;", "connectPresenter", "", "presenter", "createPresenter", "disconnectPresenter", "getEmptyStateProvider", "Lcom/soundcloud/android/view/collection/EmptyStateProvider;", "titleResId", "", "Companion", "UserAlbumsEmptyStateProvider", "base_release"}, mv = {1, 1, 15})
/* compiled from: UserAlbumsFragment.kt */
public final class UserAlbumsFragment extends UserProfilePlayableFragment<C5757ab> {
    public static final a l = new a(null);
    public C5762bb m;
    private HashMap n;

    /* compiled from: UserAlbumsFragment.kt */
    public static final class a {
        private a() {
        }

        @NXa
        public final Fragment a(C3508cda cda, Yca yca, SearchQuerySourceInfo searchQuerySourceInfo) {
            C7471uYa.b(cda, "userUrn");
            C7471uYa.b(yca, "screen");
            UserAlbumsFragment userAlbumsFragment = new UserAlbumsFragment();
            userAlbumsFragment.setArguments(B.a(cda, yca, searchQuerySourceInfo));
            return userAlbumsFragment;
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }
    }

    /* compiled from: UserAlbumsFragment.kt */
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
            return l.emptyview_profile_no_albums;
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

    public UserAlbumsFragment() {
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
        return "userAlbums";
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
        return p.user_profile_sounds_header_albums;
    }

    /* access modifiers changed from: protected */
    public C5757ab Tb() {
        C5762bb bbVar = this.m;
        if (bbVar != null) {
            C3508cda b2 = C5526_Ha.b(getArguments(), "user_urn_key");
            String str = "Required value was null.";
            if (b2 != null) {
                Bundle arguments = getArguments();
                if (arguments != null) {
                    return bbVar.a(b2, (SearchQuerySourceInfo) arguments.getParcelable("search_query_source_info_key"));
                }
                throw new IllegalArgumentException(str);
            }
            throw new IllegalArgumentException(str);
        }
        C7471uYa.b("presenterFactory");
        throw null;
    }

    /* access modifiers changed from: protected */
    public void a(C5757ab abVar) {
        C7471uYa.b(abVar, "presenter");
        abVar.a((C5849t) this);
    }

    /* access modifiers changed from: protected */
    public void b(C5757ab abVar) {
        C7471uYa.b(abVar, "presenter");
        abVar.a();
    }
}
