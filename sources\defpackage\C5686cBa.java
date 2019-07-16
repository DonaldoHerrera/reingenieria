package defpackage;

import com.soundcloud.android.sync.na;
import com.soundcloud.android.sync.oa.a;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* renamed from: cBa reason: default package and case insensitive filesystem */
/* compiled from: MeSyncerProvider */
public class C5686cBa extends a {
    private final C7054oVa<C5618bBa> b;

    public C5686cBa(C7054oVa<C5618bBa> ova) {
        super(na.ME);
        this.b = ova;
    }

    public Callable<Boolean> a(String str, boolean z) {
        return (Callable) this.b.get();
    }

    public boolean b() {
        return false;
    }

    public long c() {
        return TimeUnit.HOURS.toMillis(24);
    }

    public boolean d() {
        return true;
    }
}
