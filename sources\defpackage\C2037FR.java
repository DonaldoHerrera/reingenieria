package defpackage;

import com.soundcloud.android.ia.p;

/* renamed from: FR reason: default package and case insensitive filesystem */
/* compiled from: RepostResult.kt */
public enum C2037FR {
    REPOST_SUCCEEDED(p.reposted_to_followers),
    REPOST_FAILED(p.repost_error_toast_overflow_action),
    UNREPOST_SUCCEEDED(p.unposted_to_followers),
    UNREPOST_FAILED(p.repost_error_toast_overflow_action);
    
    private final int f;

    private C2037FR(int i) {
        this.f = i;
    }

    public final int a() {
        return this.f;
    }
}
