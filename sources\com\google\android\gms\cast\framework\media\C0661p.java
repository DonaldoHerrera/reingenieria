package com.google.android.gms.cast.framework.media;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.cast.framework.media.p reason: case insensitive filesystem */
final class C0661p implements ResultCallback<Status> {
    private final long a;
    private final /* synthetic */ f b;

    C0661p(f fVar, long j) {
        this.b = fVar;
        this.a = j;
    }

    public final /* synthetic */ void onResult(Result result) {
        Status status = (Status) result;
        if (!status.isSuccess()) {
            C0650e.this.d.a(this.a, status.getStatusCode());
        }
    }
}
