package defpackage;

import android.content.Context;
import android.os.Looper;
import java.io.IOException;

/* renamed from: bh reason: default package and case insensitive filesystem */
/* compiled from: AnswersFilesManagerProvider */
class C0492bh {
    final Context a;
    final C4994IOa b;

    public C0492bh(Context context, C4994IOa iOa) {
        this.a = context;
        this.b = iOa;
    }

    public C1813wh a() throws IOException {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            return new C1813wh(this.a, new Dh(), new C5118MNa(), new C7392tOa(this.a, this.b.a(), "session_analytics.tap", "session_analytics_to_send"));
        }
        throw new IllegalStateException("AnswersFilesManagerProvider cannot be called on the main thread");
    }
}
