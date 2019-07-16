package com.google.android.gms.common.internal;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Response;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

@KeepForSdk
public class PendingResultUtil {
    private static final zaa zaou = new zai();

    @KeepForSdk
    public interface ResultConverter<R extends Result, T> {
        @KeepForSdk
        T convert(R r);
    }

    public interface zaa {
        ApiException zaf(Status status);
    }

    @KeepForSdk
    public static <R extends Result, T extends Response<R>> Wy<T> toResponseTask(PendingResult<R> pendingResult, T t) {
        return toTask(pendingResult, new zak(t));
    }

    @KeepForSdk
    public static <R extends Result, T> Wy<T> toTask(PendingResult<R> pendingResult, ResultConverter<R, T> resultConverter) {
        zaa zaa2 = zaou;
        Xy xy = new Xy();
        pendingResult.addStatusListener(new zaj(pendingResult, xy, resultConverter, zaa2));
        return xy.a();
    }

    @KeepForSdk
    public static <R extends Result> Wy<Void> toVoidTask(PendingResult<R> pendingResult) {
        return toTask(pendingResult, new zal());
    }
}
