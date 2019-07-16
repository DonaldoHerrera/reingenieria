package com.soundcloud.android.onboarding;

import com.soundcloud.android.onboarding.OnboardActivity.b;
import com.soundcloud.android.onboarding.auth.pa;

/* compiled from: OnboardActivity */
/* synthetic */ class q {
    static final /* synthetic */ int[] a = new int[pa.values().length];
    static final /* synthetic */ int[] b = new int[b.values().length];

    /* JADX WARNING: Can't wrap try/catch for region: R(22:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|13|14|15|16|(2:17|18)|19|21|22|23|24|25|26|27|28|30) */
    /* JADX WARNING: Can't wrap try/catch for region: R(23:0|1|2|3|(2:5|6)|7|(2:9|10)|11|13|14|15|16|(2:17|18)|19|21|22|23|24|25|26|27|28|30) */
    /* JADX WARNING: Can't wrap try/catch for region: R(24:0|1|2|3|5|6|7|(2:9|10)|11|13|14|15|16|(2:17|18)|19|21|22|23|24|25|26|27|28|30) */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0035 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0040 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x005e */
    /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0068 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0072 */
    static {
        try {
            b[b.ENTER_USER_DETAILS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            b[b.LOGIN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            b[b.SIGN_UP_METHOD.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        b[b.SIGN_UP_BASICS.ordinal()] = 4;
        b[b.SIGN_UP_DETAILS.ordinal()] = 5;
        try {
            b[b.PHOTOS.ordinal()] = 6;
        } catch (NoSuchFieldError unused4) {
        }
        a[pa.API.ordinal()] = 1;
        a[pa.FACEBOOK_SSO.ordinal()] = 2;
        a[pa.FACEBOOK_WEBFLOW.ordinal()] = 3;
        a[pa.GOOGLE_PLUS.ordinal()] = 4;
    }
}
