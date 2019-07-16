package defpackage;

import com.soundcloud.android.sync.na;
import com.soundcloud.android.sync.oa.a;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* renamed from: eY reason: default package and case insensitive filesystem */
/* compiled from: DiscoveryCardSyncProvider */
public class C3754eY extends a {
    private final C7054oVa<C3778hY> b;

    C3754eY(C7054oVa<C3778hY> ova) {
        super(na.DISCOVERY_CARDS);
        this.b = ova;
    }

    public Callable<Boolean> a(String str, boolean z) {
        return (Callable) this.b.get();
    }

    public boolean b() {
        return false;
    }

    public long c() {
        return TimeUnit.HOURS.toMillis(1);
    }

    public boolean d() {
        return false;
    }
}
