package com.soundcloud.android.profile;

import com.google.android.gms.common.Scopes;
import com.soundcloud.android.foundation.events.SearchQuerySourceInfo;
import java.util.Collection;
import java.util.List;

@EVa(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002\u0001\u0004\u0004\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/soundcloud/android/profile/UserDetailItem;", "", "()V", "Companion", "Lcom/soundcloud/android/profile/UserBioItem;", "Lcom/soundcloud/android/profile/UserFollowsItem;", "Lcom/soundcloud/android/profile/UserLinksItem;", "Lcom/soundcloud/android/profile/UserLoadingItem;", "base_release"}, mv = {1, 1, 15})
/* renamed from: com.soundcloud.android.profile.ib reason: case insensitive filesystem */
/* compiled from: UserDetailsPresenter.kt */
public abstract class C5797ib {
    public static final a a = new a(null);

    /* renamed from: com.soundcloud.android.profile.ib$a */
    /* compiled from: UserDetailsPresenter.kt */
    public static final class a {
        private a() {
        }

        private final List<Mb> b(C5379VFa vFa) {
            List b = vFa.b();
            return b.isEmpty() ? C6918mWa.a() : C6850lWa.a(new Mb(b));
        }

        public final List<C5797ib> a(C5379VFa vFa, SearchQuerySourceInfo searchQuerySourceInfo) {
            C7471uYa.b(vFa, Scopes.PROFILE);
            return C7676xWa.c((Collection) C7676xWa.c((Collection) b(vFa, searchQuerySourceInfo), (Iterable) a(vFa)), (Iterable) b(vFa));
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }

        public final List<Gb> a(C5817mb mbVar) {
            C7471uYa.b(mbVar, "userDetailsParams");
            Gb gb = new Gb(mbVar.b(), mbVar.a(), null, null, 12, null);
            return C6850lWa.a(gb);
        }

        private final List<C5772db> a(C5379VFa vFa) {
            String a = vFa.a();
            return (a == null || !(Cxb.a(a) ^ true)) ? C6918mWa.a() : C6850lWa.a(new C5772db(vFa.a()));
        }

        private final List<Gb> b(C5379VFa vFa, SearchQuerySourceInfo searchQuerySourceInfo) {
            return C6850lWa.a(new Gb(vFa.c().a, searchQuerySourceInfo, Long.valueOf(vFa.c().c()), Long.valueOf(vFa.c().d())));
        }
    }

    private C5797ib() {
    }

    public /* synthetic */ C5797ib(C7264rYa rya) {
        this();
    }
}
