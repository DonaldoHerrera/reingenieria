package defpackage;

import android.os.ResultReceiver;
import com.soundcloud.android.sync.C6142z;
import com.soundcloud.android.sync.SyncJobResult;
import com.soundcloud.android.sync.W;
import com.soundcloud.android.sync.r;

/* renamed from: NBa reason: default package and case insensitive filesystem */
/* compiled from: SinglePlaylistJobRequest */
public class C5137NBa extends C6142z {
    private final C3508cda g;

    public C5137NBa(r rVar, String str, boolean z, ResultReceiver resultReceiver, C5327TLa tLa, C3508cda cda) {
        super(rVar, str, z, resultReceiver, tLa);
        this.g = cda;
    }

    public void a(W w) {
        SyncJobResult syncJobResult;
        Exception a = w.a();
        if (a == null) {
            syncJobResult = SyncJobResult.a(this.e, w.d(), this.g);
        } else {
            syncJobResult = SyncJobResult.a(this.e, a);
        }
        this.f = syncJobResult;
    }
}
