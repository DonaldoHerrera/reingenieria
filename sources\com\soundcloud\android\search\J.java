package com.soundcloud.android.search;

import java.util.List;

/* compiled from: SearchResultPageViewModel.kt */
public final class J {
    private final List<Wca> a;
    private final int b;

    public J(List<? extends Wca> list, int i) {
        C7471uYa.b(list, "items");
        this.a = list;
        this.b = i;
    }

    public final List<Wca> a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof J) {
                J j = (J) obj;
                if (C7471uYa.a((Object) this.a, (Object) j.a)) {
                    if (this.b == j.b) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        List<Wca> list = this.a;
        return ((list != null ? list.hashCode() : 0) * 31) + this.b;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SearchResultPageViewModel(items=");
        sb.append(this.a);
        sb.append(", resultsCount=");
        sb.append(this.b);
        sb.append(")");
        return sb.toString();
    }
}
