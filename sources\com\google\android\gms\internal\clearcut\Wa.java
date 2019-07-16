package com.google.android.gms.internal.clearcut;

import android.content.Context;
import com.google.android.gms.clearcut.a;
import com.google.android.gms.clearcut.c;
import com.google.android.gms.clearcut.zze;
import com.google.android.gms.common.api.Api.ApiOptions.NoOptions;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.ApiExceptionMapper;
import com.google.android.gms.common.api.internal.StatusExceptionMapper;
import com.google.android.gms.common.util.VisibleForTesting;

public final class Wa extends GoogleApi<NoOptions> implements c {
    @VisibleForTesting
    private Wa(Context context) {
        super(context, a.c, null, (StatusExceptionMapper) new ApiExceptionMapper());
    }

    public static c a(Context context) {
        return new Wa(context);
    }

    public final PendingResult<Status> a(zze zze) {
        return doBestEffortWrite(new kc(zze, asGoogleApiClient()));
    }
}
