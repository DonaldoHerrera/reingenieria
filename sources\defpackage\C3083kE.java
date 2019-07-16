package defpackage;

import com.google.android.gms.common.api.Api.BaseClientBuilder;

/* renamed from: kE reason: default package and case insensitive filesystem */
/* compiled from: Ints */
public final class C3083kE {
    public static int a(long j) {
        if (j > 2147483647L) {
            return BaseClientBuilder.API_PRIORITY_OTHER;
        }
        if (j < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j;
    }
}
