package com.facebook.share.internal;

import android.os.Bundle;
import com.facebook.internal.ba.a;

/* renamed from: com.facebook.share.internal.e reason: case insensitive filesystem */
/* compiled from: LikeActionController */
class C0593e implements a {
    final /* synthetic */ t a;

    C0593e(t tVar) {
        this.a = tVar;
    }

    public void a(Bundle bundle) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        if (bundle != null) {
            String str6 = "com.facebook.platform.extra.OBJECT_IS_LIKED";
            if (bundle.containsKey(str6)) {
                boolean z = bundle.getBoolean(str6);
                String str7 = "com.facebook.platform.extra.LIKE_COUNT_STRING_WITH_LIKE";
                if (bundle.containsKey(str7)) {
                    str = bundle.getString(str7);
                } else {
                    str = this.a.n;
                }
                String str8 = str;
                String str9 = "com.facebook.platform.extra.LIKE_COUNT_STRING_WITHOUT_LIKE";
                if (bundle.containsKey(str9)) {
                    str2 = bundle.getString(str9);
                } else {
                    str2 = this.a.o;
                }
                String str10 = str2;
                String str11 = "com.facebook.platform.extra.SOCIAL_SENTENCE_WITH_LIKE";
                if (bundle.containsKey(str11)) {
                    str3 = bundle.getString(str11);
                } else {
                    str3 = this.a.p;
                }
                String str12 = str3;
                String str13 = "com.facebook.platform.extra.SOCIAL_SENTENCE_WITHOUT_LIKE";
                if (bundle.containsKey(str13)) {
                    str4 = bundle.getString(str13);
                } else {
                    str4 = this.a.q;
                }
                String str14 = str4;
                String str15 = "com.facebook.platform.extra.UNLIKE_TOKEN";
                if (bundle.containsKey(str15)) {
                    str5 = bundle.getString(str15);
                } else {
                    str5 = this.a.r;
                }
                this.a.a(z, str8, str10, str12, str14, str5);
            }
        }
    }
}
