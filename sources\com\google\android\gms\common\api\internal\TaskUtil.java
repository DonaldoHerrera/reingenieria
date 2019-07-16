package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;

@KeepForSdk
public class TaskUtil {
    @KeepForSdk
    public static void setResultOrApiException(Status status, Xy<Void> xy) {
        setResultOrApiException(status, null, xy);
    }

    @KeepForSdk
    @Deprecated
    public static Wy<Void> toVoidTaskThatFailsOnFalse(Wy<Boolean> wy) {
        return wy.a((Py<TResult, TContinuationResult>) new zacl<TResult,TContinuationResult>());
    }

    @KeepForSdk
    public static <TResult> void setResultOrApiException(Status status, TResult tresult, Xy<TResult> xy) {
        if (status.isSuccess()) {
            xy.a(tresult);
        } else {
            xy.a((Exception) new ApiException(status));
        }
    }
}
