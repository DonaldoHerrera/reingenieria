package com.google.android.gms.cast.framework.media;

import android.util.Log;
import com.google.android.gms.cast.framework.media.C0650e.c;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.cast.C0722oa;
import org.json.JSONObject;

final class r implements C0722oa {
    private final /* synthetic */ C0650e a;
    private final /* synthetic */ h b;

    r(h hVar, C0650e eVar) {
        this.b = hVar;
        this.a = eVar;
    }

    public final void a(long j) {
        try {
            this.b.setResult((c) this.b.createFailedResult(new Status(2103)));
        } catch (IllegalStateException e) {
            Log.e("RemoteMediaClient", "Result already set when calling onRequestReplaced", e);
        }
    }

    public final void a(long j, int i, Object obj) {
        try {
            this.b.setResult(new i(new Status(i), obj instanceof JSONObject ? (JSONObject) obj : null));
        } catch (IllegalStateException e) {
            Log.e("RemoteMediaClient", "Result already set when calling onRequestCompleted", e);
        }
    }
}
