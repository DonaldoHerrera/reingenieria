package com.soundcloud.android.search.history;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import com.soundcloud.android.ia.g;
import com.soundcloud.android.ia.i;
import com.soundcloud.android.ia.l;
import com.soundcloud.android.search.history.s.b;
import com.soundcloud.android.view.customfontviews.CustomFontTextView;

@EVa(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0012B)\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ \u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0002H\u0016J\u0010\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/soundcloud/android/search/history/SearchHistoryCellRenderer;", "Lcom/soundcloud/android/presentation/LegacyCellRenderer;", "Lcom/soundcloud/android/search/history/SearchHistoryItem$SearchHistoryListItem;", "itemClickListener", "Lio/reactivex/subjects/PublishSubject;", "autocompleteArrowClickListener", "autocompleteItemLayoutId", "", "(Lio/reactivex/subjects/PublishSubject;Lio/reactivex/subjects/PublishSubject;I)V", "bindItemView", "", "position", "itemView", "Landroid/view/View;", "item", "createItemView", "parent", "Landroid/view/ViewGroup;", "Factory", "base_release"}, mv = {1, 1, 15})
/* renamed from: com.soundcloud.android.search.history.h reason: case insensitive filesystem */
/* compiled from: SearchHistoryCellRenderer.kt */
public final class C5911h extends C5541_ta<b> {
    /* access modifiers changed from: private */
    public final C6781kVa<b> a;
    /* access modifiers changed from: private */
    public final C6781kVa<b> b;
    private final int c;

    /* renamed from: com.soundcloud.android.search.history.h$a */
    /* compiled from: SearchHistoryCellRenderer.kt */
    public static final class a {
        public final C5911h a(C6781kVa<b> kva, C6781kVa<b> kva2) {
            C7471uYa.b(kva, "itemClickListener");
            C7471uYa.b(kva2, "autocompleteArrowClickListener");
            return new C5911h(kva, kva2, l.autocompletion_item);
        }
    }

    public C5911h(C6781kVa<b> kva, C6781kVa<b> kva2, int i) {
        C7471uYa.b(kva, "itemClickListener");
        C7471uYa.b(kva2, "autocompleteArrowClickListener");
        this.a = kva;
        this.b = kva2;
        this.c = i;
    }

    public View b(ViewGroup viewGroup) {
        C7471uYa.b(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(this.c, viewGroup, false);
        C7471uYa.a((Object) inflate, "view");
        ImageButton imageButton = (ImageButton) inflate.findViewById(i.arrow_icon);
        C7471uYa.a((Object) imageButton, "view.arrow_icon");
        C6428fIa.a((ImageView) imageButton, g.search_suggestion_arrow_touch_expansion);
        return inflate;
    }

    public void a(int i, View view, b bVar) {
        C7471uYa.b(view, "itemView");
        C7471uYa.b(bVar, "item");
        CustomFontTextView customFontTextView = (CustomFontTextView) view.findViewById(i.search_title);
        C7471uYa.a((Object) customFontTextView, "itemView.search_title");
        customFontTextView.setText(bVar.b());
        view.setOnClickListener(new C5912i(this, bVar));
        ((ImageButton) view.findViewById(i.arrow_icon)).setOnClickListener(new C5913j(this, bVar));
    }
}
