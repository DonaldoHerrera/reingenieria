package com.facebook.share.internal;

import android.content.Context;
import android.os.Bundle;
import com.facebook.internal.ba;

@Deprecated
/* compiled from: LikeStatusClient */
final class z extends ba {
    private String j;

    z(Context context, String str, String str2) {
        super(context, 65542, 65543, 20141001, str);
        this.j = str2;
    }

    /* access modifiers changed from: protected */
    public void a(Bundle bundle) {
        bundle.putString("com.facebook.platform.extra.OBJECT_ID", this.j);
    }
}
