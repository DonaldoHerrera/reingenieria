package com.google.android.gms.common.util.concurrent;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.concurrent.Executor;

@KeepForSdk
public class HandlerExecutor implements Executor {
    private final Handler handler;

    @KeepForSdk
    public HandlerExecutor(Looper looper) {
        this.handler = new As(looper);
    }

    public void execute(Runnable runnable) {
        this.handler.post(runnable);
    }
}
