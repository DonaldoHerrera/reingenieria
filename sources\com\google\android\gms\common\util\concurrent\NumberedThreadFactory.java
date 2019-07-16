package com.google.android.gms.common.util.concurrent;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

@KeepForSdk
public class NumberedThreadFactory implements ThreadFactory {
    private final int priority;
    private final ThreadFactory zzhr;
    private final String zzhs;
    private final AtomicInteger zzht;

    @KeepForSdk
    public NumberedThreadFactory(String str) {
        this(str, 0);
    }

    public Thread newThread(Runnable runnable) {
        Thread newThread = this.zzhr.newThread(new zza(runnable, 0));
        String str = this.zzhs;
        int andIncrement = this.zzht.getAndIncrement();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 13);
        sb.append(str);
        sb.append("[");
        sb.append(andIncrement);
        sb.append("]");
        newThread.setName(sb.toString());
        return newThread;
    }

    private NumberedThreadFactory(String str, int i) {
        this.zzht = new AtomicInteger();
        this.zzhr = Executors.defaultThreadFactory();
        Preconditions.checkNotNull(str, "Name must not be null");
        this.zzhs = str;
        this.priority = 0;
    }
}
