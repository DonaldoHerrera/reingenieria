package defpackage;

import android.os.Bundle;
import android.os.ResultReceiver;
import com.soundcloud.android.sync.SyncJobResult;
import com.soundcloud.android.sync.W;
import com.soundcloud.android.sync.ea;
import com.soundcloud.android.sync.na;
import java.util.Collection;
import java.util.Collections;

/* renamed from: XAa reason: default package and case insensitive filesystem */
/* compiled from: EntitySyncRequest */
class C5432XAa implements ea {
    private final C5256RAa a;
    private final na b;
    private SyncJobResult c;
    private final ResultReceiver d;

    C5432XAa(C5256RAa rAa, na naVar, ResultReceiver resultReceiver) {
        this.a = rAa;
        this.b = naVar;
        this.d = resultReceiver;
    }

    private Bundle e() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("syncResult", this.c);
        return bundle;
    }

    public void a(W w) {
        SyncJobResult syncJobResult;
        if (w.equals(this.a)) {
            if (w.a() == null) {
                syncJobResult = SyncJobResult.a(this.b.name(), w.d());
            } else {
                syncJobResult = SyncJobResult.a(this.b.name(), w.a());
            }
            this.c = syncJobResult;
        }
    }

    public Collection<? extends W> b() {
        return d() ? Collections.emptyList() : Collections.singletonList(this.a);
    }

    public boolean c() {
        return true;
    }

    public boolean d() {
        return this.c != null;
    }

    public boolean b(W w) {
        return w.equals(this.a) && !d();
    }

    public void a() {
        ResultReceiver resultReceiver = this.d;
        if (resultReceiver != null) {
            resultReceiver.send(0, e());
        }
        this.a.f();
    }
}
