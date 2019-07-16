package com.soundcloud.android.profile;

import java.util.List;

/* compiled from: UserDetailsPresenter.kt */
public final class Mb extends C5797ib {
    private final List<C4892FFa> b;

    public Mb(List<? extends C4892FFa> list) {
        C7471uYa.b(list, "socialMediaLinks");
        super(null);
        this.b = list;
    }

    public final List<C4892FFa> a() {
        return this.b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (defpackage.C7471uYa.a((java.lang.Object) r1.b, (java.lang.Object) ((com.soundcloud.android.profile.Mb) r2).b) != false) goto L_0x0015;
     */
    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Mb) {
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        List<C4892FFa> list = this.b;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("UserLinksItem(socialMediaLinks=");
        sb.append(this.b);
        sb.append(")");
        return sb.toString();
    }
}
