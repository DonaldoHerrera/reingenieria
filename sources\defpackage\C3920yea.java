package defpackage;

import android.content.Intent;

/* renamed from: yea reason: default package and case insensitive filesystem */
/* compiled from: UpsellContext */
public enum C3920yea {
    GENERAL,
    ADS,
    OFFLINE,
    HIGH_QUALITY_STREAMING,
    PREMIUM_CONTENT;

    public static C3920yea b(Intent intent) {
        return values()[intent.getIntExtra("upsell_context", GENERAL.ordinal())];
    }

    public void a(Intent intent) {
        intent.putExtra("upsell_context", ordinal());
    }
}
