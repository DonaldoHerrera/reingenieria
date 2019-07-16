package com.soundcloud.android.profile;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.soundcloud.android.ia.i;
import com.soundcloud.android.ia.l;
import com.soundcloud.android.view.customfontviews.CustomFontTextView;

@EVa(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0013B+\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\u0002\u0010\bJ \u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/soundcloud/android/profile/UserFollowRenderer;", "Lcom/soundcloud/android/presentation/LegacyCellRenderer;", "Lcom/soundcloud/android/profile/UserFollowsItem;", "condensedNumberFormatter", "Lcom/soundcloud/android/util/CondensedNumberFormatter;", "followersClickListener", "Lio/reactivex/subjects/PublishSubject;", "followingsClickListener", "(Lcom/soundcloud/android/util/CondensedNumberFormatter;Lio/reactivex/subjects/PublishSubject;Lio/reactivex/subjects/PublishSubject;)V", "bindItemView", "", "position", "", "itemView", "Landroid/view/View;", "item", "createItemView", "parent", "Landroid/view/ViewGroup;", "Factory", "base_release"}, mv = {1, 1, 15})
/* renamed from: com.soundcloud.android.profile.ub reason: case insensitive filesystem */
/* compiled from: UserFollowRenderer.kt */
public final class C5856ub extends C5541_ta<Gb> {
    private final C5408WFa a;
    /* access modifiers changed from: private */
    public final C6781kVa<Gb> b;
    /* access modifiers changed from: private */
    public final C6781kVa<Gb> c;

    /* renamed from: com.soundcloud.android.profile.ub$a */
    /* compiled from: UserFollowRenderer.kt */
    public static final class a {
        private final C5408WFa a;

        public a(C5408WFa wFa) {
            C7471uYa.b(wFa, "condensedNumberFormatter");
            this.a = wFa;
        }

        public final C5856ub a(C6781kVa<Gb> kva, C6781kVa<Gb> kva2) {
            C7471uYa.b(kva, "followersClickListener");
            C7471uYa.b(kva2, "followingsClickListener");
            return new C5856ub(this.a, kva, kva2);
        }
    }

    public C5856ub(C5408WFa wFa, C6781kVa<Gb> kva, C6781kVa<Gb> kva2) {
        C7471uYa.b(wFa, "condensedNumberFormatter");
        C7471uYa.b(kva, "followersClickListener");
        C7471uYa.b(kva2, "followingsClickListener");
        this.a = wFa;
        this.b = kva;
        this.c = kva2;
    }

    public View b(ViewGroup viewGroup) {
        C7471uYa.b(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(l.user_detail_follows_item, viewGroup, false);
        C7471uYa.a((Object) inflate, "LayoutInflater.from(pare…lows_item, parent, false)");
        return inflate;
    }

    public void a(int i, View view, Gb gb) {
        C7471uYa.b(view, "itemView");
        C7471uYa.b(gb, "item");
        Long a2 = gb.a();
        if (a2 != null) {
            long longValue = a2.longValue();
            CustomFontTextView customFontTextView = (CustomFontTextView) view.findViewById(i.followers_count);
            C7471uYa.a((Object) customFontTextView, "itemView.followers_count");
            customFontTextView.setText(this.a.a(longValue));
        }
        Long b2 = gb.b();
        if (b2 != null) {
            long longValue2 = b2.longValue();
            CustomFontTextView customFontTextView2 = (CustomFontTextView) view.findViewById(i.followings_count);
            C7471uYa.a((Object) customFontTextView2, "itemView.followings_count");
            customFontTextView2.setText(this.a.a(longValue2));
        }
        ((LinearLayout) view.findViewById(i.view_followers)).setOnClickListener(new C5861vb(this, gb));
        ((LinearLayout) view.findViewById(i.view_following)).setOnClickListener(new C5866wb(this, gb));
    }
}
