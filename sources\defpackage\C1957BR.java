package defpackage;

import com.soundcloud.android.sync.na;
import com.soundcloud.android.sync.oa.a;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* renamed from: BR reason: default package and case insensitive filesystem */
/* compiled from: MyFollowingsSyncProvider */
public class C1957BR extends a {
    private final C7054oVa<C5518Zza> b;
    private final Cba c;

    C1957BR(C7054oVa<C5518Zza> ova, Cba cba) {
        super(na.MY_FOLLOWINGS);
        this.b = ova;
        this.c = cba;
    }

    public Callable<Boolean> a(String str, boolean z) {
        return (Callable) this.b.get();
    }

    public boolean b() {
        return this.c.c();
    }

    public long c() {
        return TimeUnit.HOURS.toMillis(12);
    }

    public boolean d() {
        return true;
    }
}
