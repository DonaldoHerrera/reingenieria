package defpackage;

import com.soundcloud.android.sync.na;
import com.soundcloud.android.sync.oa.a;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* renamed from: xCa reason: default package and case insensitive filesystem */
/* compiled from: TrackPostsSyncProvider */
public class C7654xCa extends a {
    private final C7054oVa<C7309sCa> b;

    public C7654xCa(C7054oVa<C7309sCa> ova) {
        super(na.TRACK_POSTS);
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
        return true;
    }
}
