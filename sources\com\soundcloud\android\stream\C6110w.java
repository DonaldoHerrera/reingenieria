package com.soundcloud.android.stream;

import com.soundcloud.android.sync.na;
import com.soundcloud.android.sync.oa.a;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* renamed from: com.soundcloud.android.stream.w reason: case insensitive filesystem */
/* compiled from: SoundStreamSyncProvider */
public class C6110w extends a {
    private final a b;

    public C6110w(a aVar) {
        super(na.SOUNDSTREAM);
        this.b = aVar;
    }

    public Callable<Boolean> a(String str, boolean z) {
        return this.b.a(str);
    }

    public boolean b() {
        return false;
    }

    public long c() {
        return TimeUnit.MINUTES.toMillis(10);
    }

    public boolean d() {
        return false;
    }
}
