package com.soundcloud.android.search.suggestions.searchsuggestions;

import java.util.List;

/* compiled from: SearchSuggestionsViewModel.kt */
public final class m {
    private final List<C7780ywa> a;

    public m(List<? extends C7780ywa> list) {
        C7471uYa.b(list, "suggestions");
        this.a = list;
    }

    public final List<C7780ywa> a() {
        return this.a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (defpackage.C7471uYa.a((java.lang.Object) r1.a, (java.lang.Object) ((com.soundcloud.android.search.suggestions.searchsuggestions.m) r2).a) != false) goto L_0x0015;
     */
    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof m) {
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        List<C7780ywa> list = this.a;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SearchSuggestionsViewModel(suggestions=");
        sb.append(this.a);
        sb.append(")");
        return sb.toString();
    }
}
