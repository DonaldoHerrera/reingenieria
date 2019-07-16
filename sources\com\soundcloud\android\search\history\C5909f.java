package com.soundcloud.android.search.history;

@EVa(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0000\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u000b\fB\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016¨\u0006\r"}, d2 = {"Lcom/soundcloud/android/search/history/SearchHistoryAdapter;", "Lcom/soundcloud/android/uniflow/android/UniflowAdapter;", "Lcom/soundcloud/android/search/history/SearchHistoryItem;", "searchHistoryCellRenderer", "Lcom/soundcloud/android/search/history/SearchHistoryCellRenderer;", "clearHistoryCellRenderer", "Lcom/soundcloud/android/search/history/ClearSearchHistoryCellRenderer;", "(Lcom/soundcloud/android/search/history/SearchHistoryCellRenderer;Lcom/soundcloud/android/search/history/ClearSearchHistoryCellRenderer;)V", "getBasicItemViewType", "", "position", "Companion", "Factory", "base_release"}, mv = {1, 1, 15})
/* renamed from: com.soundcloud.android.search.history.f reason: case insensitive filesystem */
/* compiled from: SearchHistoryAdapter.kt */
public final class C5909f extends C5407WEa<s> {
    public static final a g = new a(null);

    /* renamed from: com.soundcloud.android.search.history.f$a */
    /* compiled from: SearchHistoryAdapter.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }
    }

    /* renamed from: com.soundcloud.android.search.history.f$b */
    /* compiled from: SearchHistoryAdapter.kt */
    public static final class b {
        public final C5909f a(com.soundcloud.android.search.history.C5911h.a aVar, com.soundcloud.android.search.history.C5906c.a aVar2, C6781kVa<com.soundcloud.android.search.history.s.b> kva, C6781kVa<com.soundcloud.android.search.history.s.b> kva2, C6781kVa<RVa> kva3) {
            C7471uYa.b(aVar, "searchHistoryCellRendererFactory");
            C7471uYa.b(aVar2, "clearHistoryCellRendererFactory");
            C7471uYa.b(kva, "itemClickListener");
            C7471uYa.b(kva2, "autocompleteArrowClickListener");
            C7471uYa.b(kva3, "clearHistoryClickListener");
            return new C5909f(aVar.a(kva, kva2), aVar2.a(kva3));
        }
    }

    public C5909f(C5911h hVar, C5906c cVar) {
        C7471uYa.b(hVar, "searchHistoryCellRenderer");
        C7471uYa.b(cVar, "clearHistoryCellRenderer");
        super((C5693cFa<? extends T>[]) new C5693cFa[]{new C5693cFa(0, hVar), new C5693cFa(1, cVar)});
    }

    public int f(int i) {
        s sVar = (s) g(i);
        if (sVar instanceof com.soundcloud.android.search.history.s.a) {
            return 1;
        }
        if (sVar instanceof com.soundcloud.android.search.history.s.b) {
            return 0;
        }
        throw new FVa();
    }
}
