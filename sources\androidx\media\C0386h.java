package androidx.media;

import android.os.Bundle;
import android.support.v4.media.session.IMediaSession;
import android.support.v4.media.session.MediaSessionCompat.Token;
import androidx.core.app.f;

/* renamed from: androidx.media.h reason: case insensitive filesystem */
/* compiled from: MediaBrowserServiceCompat */
class C0386h implements Runnable {
    final /* synthetic */ Token a;
    final /* synthetic */ d b;

    C0386h(d dVar, Token token) {
        this.b = dVar;
        this.a = token;
    }

    public void run() {
        if (!this.b.a.isEmpty()) {
            IMediaSession extraBinder = this.a.getExtraBinder();
            if (extraBinder != null) {
                for (Bundle a2 : this.b.a) {
                    f.a(a2, "extra_session_binder", extraBinder.asBinder());
                }
            }
            this.b.a.clear();
        }
        v.a(this.b.b, this.a.getToken());
    }
}
