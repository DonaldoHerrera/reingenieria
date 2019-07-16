package com.soundcloud.android.profile;

import android.content.res.Resources;
import androidx.fragment.app.C0370l;
import androidx.fragment.app.Fragment;
import com.soundcloud.android.foundation.events.SearchQuerySourceInfo;
import com.soundcloud.android.ia.p;

/* compiled from: ProfilePagerAdapter */
class Na extends Jd {
    private final C3508cda f;
    private final Resources g;
    private final boolean h;
    private final SearchQuerySourceInfo i;

    Na(C0370l lVar, Resources resources, C3508cda cda, boolean z, SearchQuerySourceInfo searchQuerySourceInfo) {
        super(lVar);
        this.h = z;
        this.i = searchQuerySourceInfo;
        this.g = resources;
        this.f = cda;
    }

    public int a() {
        return 2;
    }

    public CharSequence c(int i2) {
        if (i2 == 0) {
            return this.g.getString(p.tab_title_user_sounds);
        }
        if (i2 == 1) {
            return this.g.getString(p.tab_title_user_info);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unexpected position for getPageTitle ");
        sb.append(i2);
        throw new IllegalArgumentException(sb.toString());
    }

    public Fragment e(int i2) {
        if (i2 == 0) {
            return ProfileBucketsFragment.a(this.f, this.h ? Yca.YOUR_MAIN : Yca.USERS_MAIN, this.i);
        } else if (i2 == 1) {
            return UserDetailsFragment.i.a(this.f, this.i);
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Unexpected position for ");
            sb.append(i2);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public Yca g(int i2) {
        if (i2 == 0) {
            return Yca.USERS_MAIN;
        }
        if (i2 != 1) {
            return Yca.UNKNOWN;
        }
        return Yca.USERS_INFO;
    }

    public Yca h(int i2) {
        if (i2 == 0) {
            return Yca.YOUR_MAIN;
        }
        if (i2 != 1) {
            return Yca.UNKNOWN;
        }
        return Yca.YOUR_INFO;
    }
}
