package com.appboy;

import android.net.Uri;

class g implements m {
    final /* synthetic */ String a;
    final /* synthetic */ h b;

    g(h hVar, String str) {
        this.b = hVar;
        this.a = str;
    }

    public Uri a(Uri uri) {
        return uri.buildUpon().encodedAuthority(this.a).build();
    }
}
