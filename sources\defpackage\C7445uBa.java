package defpackage;

import com.soundcloud.android.sync.na;
import com.soundcloud.android.sync.oa.a;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* renamed from: uBa reason: default package and case insensitive filesystem */
/* compiled from: MyPlaylistsSyncProvider */
public class C7445uBa extends a {
    private final C7652xBa b;
    private final C6332dsa c;

    public C7445uBa(C7652xBa xba, C6332dsa dsa) {
        super(na.MY_PLAYLISTS);
        this.b = xba;
        this.c = dsa;
    }

    public Callable<Boolean> a(String str, boolean z) {
        return this.b.a(z);
    }

    public boolean b() {
        return this.c.b();
    }

    public long c() {
        return TimeUnit.HOURS.toMillis(1);
    }

    public boolean d() {
        return true;
    }
}
