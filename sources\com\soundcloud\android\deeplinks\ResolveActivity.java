package com.soundcloud.android.deeplinks;

import android.content.res.Resources;
import android.net.Uri;
import com.soundcloud.android.ads.C2571fb;
import com.soundcloud.android.ia.l;
import com.soundcloud.android.ia.p;
import com.soundcloud.android.main.RootActivity;

public class ResolveActivity extends RootActivity {
    f n;
    C4655rja o;
    C2571fb p;

    public static boolean a(Uri uri, Resources resources) {
        return "soundcloud".equalsIgnoreCase(uri.getScheme()) || (uri.getHost() != null && uri.getHost().contains(resources.getString(p.host_name)));
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        String str;
        super.onResume();
        Uri data = getIntent().getData();
        StringBuilder sb = new StringBuilder();
        sb.append("Received deeplink with URI = ");
        sb.append(data);
        C7316sHa.a(4, "ResolveActivity", sb.toString());
        try {
            str = this.n.a(getIntent(), getResources());
        } catch (k e) {
            C7316sHa.d(e);
            str = null;
        }
        this.p.a();
        this.o.a(C4621nja.a(data.toString(), str));
    }

    /* access modifiers changed from: protected */
    public void setActivityContentView() {
        setContentView(l.empty);
    }

    public Yca x() {
        return Yca.UNKNOWN;
    }

    /* access modifiers changed from: protected */
    public boolean y() {
        return false;
    }
}
