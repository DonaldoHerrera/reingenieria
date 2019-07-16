package defpackage;

import com.soundcloud.android.accounts.C2526g;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: uwa reason: default package and case insensitive filesystem */
/* compiled from: SearchSuggestionOperations */
public class C7504uwa {
    private final efa a;
    private final HPa b;
    private final C6884lwa c;
    private final C2526g d;
    private final C7228qwa e;
    private final C4990IKa<Pca<C7778yva>> f = new C7435twa(this);

    C7504uwa(efa efa, HPa hPa, C6884lwa lwa, C2526g gVar, C7228qwa qwa) {
        this.a = efa;
        this.b = hPa;
        this.c = lwa;
        this.d = gVar;
        this.e = qwa;
    }

    /* access modifiers changed from: private */
    public IPa<List<C7780ywa>> b(String str) {
        return this.a.a(hfa.b(C2226PO.SEARCH_AUTOCOMPLETE.a()).a().a("query", str).a("limit", Integer.valueOf(9)).c().b(), this.f).e(new C7295rva(str)).a(IPa.a(Collections.emptyList())).b(this.b);
    }

    private IPa<List<C7780ywa>> c(String str) {
        IPa e2 = this.c.a(str, this.d.c(), 9).e(new C7226qva(str));
        C7228qwa qwa = this.e;
        qwa.getClass();
        return e2.e(new C7364sva(qwa)).a(IPa.a(Collections.emptyList())).b(this.b);
    }

    public APa<List<C7780ywa>> a(String str) {
        return APa.b((EPa<? extends T>[]) new EPa[]{c(str).j(), IPa.a(str).a(300, TimeUnit.MILLISECONDS, this.b).a((C7118pQa<? super T, ? extends MPa<? extends R>>) new C7157pva<Object,Object>(this)).j()}).b((C6504gQa<T, T, T>) C6950mva.a);
    }
}
