package com.google.android.gms.common.internal;

import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.PendingResult.StatusListener;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.PendingResultUtil.ResultConverter;
import com.google.android.gms.common.internal.PendingResultUtil.zaa;
import java.util.concurrent.TimeUnit;

final class zaj implements StatusListener {
    private final /* synthetic */ PendingResult zaov;
    private final /* synthetic */ Xy zaow;
    private final /* synthetic */ ResultConverter zaox;
    private final /* synthetic */ zaa zaoy;

    zaj(PendingResult pendingResult, Xy xy, ResultConverter resultConverter, zaa zaa) {
        this.zaov = pendingResult;
        this.zaow = xy;
        this.zaox = resultConverter;
        this.zaoy = zaa;
    }

    public final void onComplete(Status status) {
        if (status.isSuccess()) {
            this.zaow.a(this.zaox.convert(this.zaov.await(0, TimeUnit.MILLISECONDS)));
            return;
        }
        this.zaow.a((Exception) this.zaoy.zaf(status));
    }
}
