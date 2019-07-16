package com.google.android.gms.internal.cast;

import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.cast.C0627a.C0036a;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.util.VisibleForTesting;

@VisibleForTesting
final class Q implements C0036a {
    private final Status a;
    private final ApplicationMetadata b;
    private final String c;
    private final String d;
    private final boolean e;

    public Q(Status status, ApplicationMetadata applicationMetadata, String str, String str2, boolean z) {
        this.a = status;
        this.b = applicationMetadata;
        this.c = str;
        this.d = str2;
        this.e = z;
    }

    public final boolean f() {
        return this.e;
    }

    public final String g() {
        return this.c;
    }

    public final String getSessionId() {
        return this.d;
    }

    public final Status getStatus() {
        return this.a;
    }

    public final ApplicationMetadata h() {
        return this.b;
    }

    public Q(Status status) {
        this(status, null, null, null, false);
    }
}
