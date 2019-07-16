package com.soundcloud.android.search.suggestions.searchsuggestions;

/* compiled from: SearchSuggestionsUniflowFragment.kt */
final class c extends C7540vYa implements C6308dYa<C7780ywa, C7780ywa, Boolean> {
    public static final c a = new c();

    c() {
        super(2);
    }

    public final boolean a(C7780ywa ywa, C7780ywa ywa2) {
        C7471uYa.a((Object) ywa, "firstSuggestion");
        C7471uYa.a((Object) ywa2, "secondSuggestion");
        return d.b(ywa, ywa2);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return Boolean.valueOf(a((C7780ywa) obj, (C7780ywa) obj2));
    }
}
