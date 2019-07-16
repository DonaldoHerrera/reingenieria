package com.facebook.internal;

import com.facebook.FacebookRequestError.a;

/* renamed from: com.facebook.internal.t reason: case insensitive filesystem */
/* compiled from: FacebookRequestErrorClassification */
/* synthetic */ class C0558t {
    static final /* synthetic */ int[] a = new int[a.values().length];

    /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
    static {
        a[a.OTHER.ordinal()] = 1;
        a[a.LOGIN_RECOVERABLE.ordinal()] = 2;
        try {
            a[a.TRANSIENT.ordinal()] = 3;
        } catch (NoSuchFieldError unused) {
        }
    }
}
