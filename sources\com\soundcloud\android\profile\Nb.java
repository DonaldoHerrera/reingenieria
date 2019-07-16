package com.soundcloud.android.profile;

import android.content.Context;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.soundcloud.android.ia.i;
import com.soundcloud.android.ia.l;
import com.soundcloud.android.view.customfontviews.CustomFontTextView;

@EVa(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\u0010\u0006J \u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0002H\u0016J\u0010\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/soundcloud/android/profile/UserLinksRenderer;", "Lcom/soundcloud/android/presentation/LegacyCellRenderer;", "Lcom/soundcloud/android/profile/UserLinksItem;", "linkClickListener", "Lio/reactivex/subjects/PublishSubject;", "", "(Lio/reactivex/subjects/PublishSubject;)V", "bindItemView", "", "position", "", "itemView", "Landroid/view/View;", "item", "createItemView", "parent", "Landroid/view/ViewGroup;", "Factory", "base_release"}, mv = {1, 1, 15})
/* compiled from: UserLinksRenderer.kt */
public final class Nb extends C5541_ta<Mb> {
    /* access modifiers changed from: private */
    public final C6781kVa<String> a;

    /* compiled from: UserLinksRenderer.kt */
    public static final class a {
        public final Nb a(C6781kVa<String> kva) {
            C7471uYa.b(kva, "linkClickListener");
            return new Nb(kva);
        }
    }

    public Nb(C6781kVa<String> kva) {
        C7471uYa.b(kva, "linkClickListener");
        this.a = kva;
    }

    public View b(ViewGroup viewGroup) {
        C7471uYa.b(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(l.user_detail_links_item, viewGroup, false);
        C7471uYa.a((Object) inflate, "LayoutInflater.from(pare…inks_item, parent, false)");
        return inflate;
    }

    public void a(int i, View view, Mb mb) {
        C7471uYa.b(view, "itemView");
        C7471uYa.b(mb, "item");
        for (C4892FFa fFa : mb.a()) {
            View inflate = LayoutInflater.from(view.getContext()).inflate(l.user_info_social_media_link, (LinearLayout) view.findViewById(i.links_container), false);
            if (inflate != null) {
                CustomFontTextView customFontTextView = (CustomFontTextView) inflate;
                customFontTextView.setMovementMethod(LinkMovementMethod.getInstance());
                customFontTextView.setText(fFa.a());
                CustomFontTextView customFontTextView2 = (CustomFontTextView) customFontTextView.findViewById(i.social_link);
                C7471uYa.a((Object) customFontTextView2, "view.social_link");
                CustomFontTextView customFontTextView3 = (CustomFontTextView) customFontTextView2.findViewById(i.social_link);
                Context context = view.getContext();
                C7471uYa.a((Object) context, "itemView.context");
                customFontTextView3.setCompoundDrawablesWithIntrinsicBounds(fFa.a(context), null, null, null);
                customFontTextView.setOnClickListener(new Ob(fFa, this, view));
                ((LinearLayout) view.findViewById(i.links_container)).addView(customFontTextView);
            } else {
                throw new OVa("null cannot be cast to non-null type com.soundcloud.android.view.customfontviews.CustomFontTextView");
            }
        }
    }
}
