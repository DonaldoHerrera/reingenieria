package com.soundcloud.android.profile;

import com.soundcloud.android.SoundCloudApplication;
import com.soundcloud.android.ia.p;
import java.util.HashMap;

@EVa(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u0000 \u00162\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0016B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0010\u001a\u00020\u0002H\u0014J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u000f\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0014¢\u0006\u0002\u0010\u0015R\u001b\u0010\u0004\u001a\u00020\u00058TX\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\n\u001a\u00020\u000bXD¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000bXD¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r¨\u0006\u0017"}, d2 = {"Lcom/soundcloud/android/profile/UserFollowingsFragment;", "Lcom/soundcloud/android/profile/UserListFragment;", "Lcom/soundcloud/android/profile/UserFollowingsPresenter;", "()V", "emptyStateProvider", "Lcom/soundcloud/android/profile/UserFollowingsEmptyStateProvider;", "getEmptyStateProvider", "()Lcom/soundcloud/android/profile/UserFollowingsEmptyStateProvider;", "emptyStateProvider$delegate", "Lkotlin/Lazy;", "eventModule", "", "getEventModule", "()Ljava/lang/String;", "presenterKey", "getPresenterKey", "createPresenter", "getScreen", "Lcom/soundcloud/android/foundation/domain/Screen;", "titleResId", "", "()Ljava/lang/Integer;", "Companion", "base_release"}, mv = {1, 1, 15})
/* compiled from: UserFollowingsFragment.kt */
public final class UserFollowingsFragment extends UserListFragment<Fb> {
    static final /* synthetic */ DZa[] n = {HYa.a((DYa) new EYa(HYa.a(UserFollowingsFragment.class), "emptyStateProvider", "getEmptyStateProvider()Lcom/soundcloud/android/profile/UserFollowingsEmptyStateProvider;"))};
    public static final a o = new a(null);
    private final String p = "users-followings";
    private final String q = "UserFollowingsPresenterKey";
    private final C7744yVa r = BVa.a(new Db(this));
    private HashMap s;

    /* compiled from: UserFollowingsFragment.kt */
    public static final class a {
        private a() {
        }

        public final UserFollowingsFragment a(C3508cda cda) {
            C7471uYa.b(cda, "userUrn");
            UserFollowingsFragment userFollowingsFragment = new UserFollowingsFragment();
            userFollowingsFragment.setArguments(C5803jc.a.a(cda, userFollowingsFragment.Xb().b(cda)));
            return userFollowingsFragment;
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }
    }

    public UserFollowingsFragment() {
        SoundCloudApplication.f().a(this);
    }

    public String O() {
        return this.p;
    }

    /* access modifiers changed from: protected */
    public Integer Qb() {
        return Integer.valueOf(p.profile_following);
    }

    public void Rb() {
        HashMap hashMap = this.s;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public Yca Ta() {
        return _b().b() ? Yca.YOUR_FOLLOWINGS : Yca.USERS_FOLLOWINGS;
    }

    /* access modifiers changed from: protected */
    public String Ub() {
        return this.q;
    }

    /* access modifiers changed from: protected */
    public Cb Yb() {
        C7744yVa yva = this.r;
        DZa dZa = n[0];
        return (Cb) yva.getValue();
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        Rb();
    }

    /* access modifiers changed from: protected */
    public Fb Tb() {
        C5773dc Zb = Zb();
        Zca zca = new Zca(Ta(), _b().a(), null, null, null, 28, null);
        return Zb.b(zca);
    }
}
