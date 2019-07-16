package defpackage;

import com.soundcloud.android.sync.na;
import com.soundcloud.android.sync.r;
import java.util.concurrent.Callable;

/* renamed from: OBa reason: default package and case insensitive filesystem */
/* compiled from: SinglePlaylistSyncJob */
public class C5167OBa extends r {
    private final C3508cda e;

    public C5167OBa(Callable<Boolean> callable, C3508cda cda) {
        super(callable, na.PLAYLIST);
        this.e = cda;
    }

    public boolean equals(Object obj) {
        return this == obj || (obj != null && C5167OBa.class == obj.getClass() && this.e.equals(((C5167OBa) obj).e));
    }

    public int hashCode() {
        return this.e.hashCode();
    }
}
