package com.soundcloud.android.profile;

import android.view.View;
import android.view.ViewGroup;

@EVa(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\fB\u000f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/soundcloud/android/profile/UserListAdapter;", "Lcom/soundcloud/android/uniflow/android/UniflowAdapter;", "Lcom/soundcloud/android/users/UserItem;", "userItemRenderer", "Lcom/soundcloud/android/profile/UserListAdapter$FollowUserItemRenderer;", "(Lcom/soundcloud/android/profile/UserListAdapter$FollowUserItemRenderer;)V", "getBasicItemViewType", "", "position", "userClick", "Lio/reactivex/Observable;", "Lcom/soundcloud/android/profile/UserItemClickParams;", "FollowUserItemRenderer", "base_release"}, mv = {1, 1, 15})
/* compiled from: UserListAdapter.kt */
public class Rb extends C5407WEa<C4954HFa> {
    private final a g;

    /* compiled from: UserListAdapter.kt */
    public static class a extends C5541_ta<C4954HFa> {
        private final C6781kVa<Hb> a;
        private final C6429fJa b;

        public a(C6429fJa fja) {
            C7471uYa.b(fja, "userItemRenderer");
            this.b = fja;
            C6781kVa<Hb> s = C6781kVa.s();
            C7471uYa.a((Object) s, "PublishSubject.create()");
            this.a = s;
        }

        public View b(ViewGroup viewGroup) {
            C7471uYa.b(viewGroup, "parent");
            return this.b.b(viewGroup);
        }

        public C6781kVa<Hb> a() {
            return this.a;
        }

        public void a(int i, View view, C4954HFa hFa) {
            C7471uYa.b(view, "itemView");
            C7471uYa.b(hFa, "item");
            this.b.a(view, hFa);
            view.setOnClickListener(new Qb(this, hFa));
        }
    }

    public Rb(a aVar) {
        C7471uYa.b(aVar, "userItemRenderer");
        super((C6289dFa<T>) aVar);
        this.g = aVar;
    }

    public int f(int i) {
        return 0;
    }

    public APa<Hb> j() {
        return this.g.a();
    }
}
