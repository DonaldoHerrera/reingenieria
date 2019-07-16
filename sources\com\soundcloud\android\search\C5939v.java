package com.soundcloud.android.search;

import android.content.res.Resources;
import android.os.Bundle;
import androidx.fragment.app.C0370l;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.x;
import com.google.common.base.Function;
import java.util.List;

/* renamed from: com.soundcloud.android.search.v reason: case insensitive filesystem */
/* compiled from: SearchPagerAdapter.kt */
public final class C5939v extends x {
    private final List<La> f;
    private final Resources g;
    private final String h;
    private final String i;
    private final C4928GKa<C3508cda> j;
    private final C4928GKa<Integer> k;

    public C5939v(Resources resources, C0370l lVar, String str, String str2, C4928GKa<C3508cda> gKa, C4928GKa<Integer> gKa2) {
        C7471uYa.b(resources, "resources");
        C7471uYa.b(lVar, "fm");
        C7471uYa.b(str, "apiQuery");
        C7471uYa.b(str2, "userQuery");
        C7471uYa.b(gKa, "queryUrn");
        C7471uYa.b(gKa2, "queryPosition");
        super(lVar);
        this.g = resources;
        this.h = str;
        this.i = str2;
        this.j = gKa;
        this.k = gKa2;
        List<La> a = La.a();
        C7471uYa.a((Object) a, "SearchType.asList()");
        this.f = a;
    }

    private final Fragment a(La la, boolean z) {
        SearchFragmentArgs searchFragmentArgs = new SearchFragmentArgs(la, this.h, this.i, (String) this.j.b((Function<? super T, V>) C5937u.a).d(), (Integer) this.k.d(), z);
        Bundle g2 = searchFragmentArgs.g();
        SearchResultsFragment searchResultsFragment = new SearchResultsFragment();
        searchResultsFragment.setArguments(g2);
        return searchResultsFragment;
    }

    public CharSequence c(int i2) {
        String a = ((La) this.f.get(i2)).a(this.g);
        C7471uYa.a((Object) a, "tabs[position].getPageTitle(resources)");
        return a;
    }

    public Fragment e(int i2) {
        La la = (La) this.f.get(i2);
        return a(la, la.c());
    }

    public int a() {
        return this.f.size();
    }
}
