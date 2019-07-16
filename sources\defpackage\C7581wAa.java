package defpackage;

import com.soundcloud.android.collections.data.C2860p;
import com.soundcloud.android.sync.na;
import com.soundcloud.android.sync.oa.a;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* renamed from: wAa reason: default package and case insensitive filesystem */
/* compiled from: DeltaSyncProvider.kt */
public final class C7581wAa extends a {
    private final C7054oVa<C4825DAa> b;
    private final C2860p c;

    public C7581wAa(C7054oVa<C4825DAa> ova, C2860p pVar) {
        C7471uYa.b(ova, "deltaSyncer");
        C7471uYa.b(pVar, "stateProvider");
        super(na.COLLECTIONS_DELTA);
        this.b = ova;
        this.c = pVar;
    }

    public Callable<Boolean> a(String str, boolean z) {
        Object obj = this.b.get();
        C7471uYa.a(obj, "deltaSyncer.get()");
        return (Callable) obj;
    }

    public boolean b() {
        return this.c.a();
    }

    public long c() {
        return TimeUnit.DAYS.toMillis(1);
    }

    public boolean d() {
        return false;
    }
}
