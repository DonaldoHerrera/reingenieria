package com.soundcloud.android.search.history;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.soundcloud.android.ia.l;

@EVa(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011B\u0015\b\u0007\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\u0010\u0006J \u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0016J\u0010\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\tH\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/soundcloud/android/search/history/ClearSearchHistoryCellRenderer;", "Lcom/soundcloud/android/presentation/LegacyCellRenderer;", "Lcom/soundcloud/android/search/history/SearchHistoryItem$ClearItem;", "itemClickListener", "Lio/reactivex/subjects/PublishSubject;", "", "(Lio/reactivex/subjects/PublishSubject;)V", "bindItemView", "position", "", "itemView", "Landroid/view/View;", "item", "createItemView", "parent", "Landroid/view/ViewGroup;", "getLayoutId", "Factory", "base_release"}, mv = {1, 1, 15})
/* renamed from: com.soundcloud.android.search.history.c reason: case insensitive filesystem */
/* compiled from: ClearSearchHistoryCellRenderer.kt */
public final class C5906c extends C5541_ta<com.soundcloud.android.search.history.s.a> {
    /* access modifiers changed from: private */
    public final C6781kVa<RVa> a;

    /* renamed from: com.soundcloud.android.search.history.c$a */
    /* compiled from: ClearSearchHistoryCellRenderer.kt */
    public static final class a {
        public final C5906c a(C6781kVa<RVa> kva) {
            C7471uYa.b(kva, "itemClickListener");
            return new C5906c(kva);
        }
    }

    public C5906c(C6781kVa<RVa> kva) {
        C7471uYa.b(kva, "itemClickListener");
        this.a = kva;
    }

    public View b(ViewGroup viewGroup) {
        C7471uYa.b(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(a(), viewGroup, false);
        C7471uYa.a((Object) inflate, "LayoutInflater.from(pare…ayoutId(), parent, false)");
        return inflate;
    }

    public void a(int i, View view, com.soundcloud.android.search.history.s.a aVar) {
        C7471uYa.b(view, "itemView");
        C7471uYa.b(aVar, "item");
        view.setOnClickListener(new C5907d(this));
    }

    private final int a() {
        return l.clear_search_history;
    }
}
