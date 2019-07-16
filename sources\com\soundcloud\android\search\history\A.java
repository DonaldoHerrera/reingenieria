package com.soundcloud.android.search.history;

import com.soundcloud.android.search.history.t.c;
import com.soundcloud.android.search.history.t.h;
import java.util.List;

@EVa(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0004\b\u0016\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u000f\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\u0006H\u0016J\u001a\u0010\f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u000f0\u000e0\rH\u0016J\u0012\u0010\u0010\u001a\u00020\u00062\b\b\u0002\u0010\u0011\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/soundcloud/android/search/history/SearchHistoryStorage;", "", "searchHistoryDatabase", "Lcom/soundcloud/android/search/history/SearchHistoryDatabase;", "(Lcom/soundcloud/android/search/history/SearchHistoryDatabase;)V", "addSearchHistoryItem", "", "searchTerm", "", "timestamp", "", "clear", "getSearchHistory", "Lio/reactivex/Observable;", "Lcom/soundcloud/java/optional/Optional;", "", "truncate", "limit", "Companion", "base_release"}, mv = {1, 1, 15})
/* compiled from: SearchHistoryStorage.kt */
public class A {
    public static final a a = new a(null);
    private final l b;

    /* compiled from: SearchHistoryStorage.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }
    }

    public A(l lVar) {
        C7471uYa.b(lVar, "searchHistoryDatabase");
        this.b = lVar;
    }

    public void a() {
        this.b.a("search_history");
    }

    public APa<C4928GKa<List<String>>> b() {
        l lVar = this.b;
        B b2 = B.a;
        C6840lMa a2 = p.a.a(5);
        C7471uYa.a((Object) a2, "SearchHistoryDbModel.FAC…ectAll(MAX_HISTORY_ITEMS)");
        APa<C4928GKa<List<String>>> h = lVar.a(b2, "search_history", a2).h(C.a);
        C7471uYa.a((Object) h, "searchHistoryDatabase.ex…).map { Optional.of(it) }");
        return h;
    }

    public static /* synthetic */ void a(A a2, long j, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                j = 5;
            }
            a2.a(j);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: truncate");
    }

    public void a(long j) {
        h hVar = new h(this.b.a());
        hVar.a(j);
        this.b.c("search_history", (Yd) hVar);
    }

    public void a(String str, long j) {
        C7471uYa.b(str, "searchTerm");
        c cVar = new c(this.b.a());
        cVar.a(str, j);
        this.b.a("search_history", (Yd) cVar);
    }
}
