package androidx.media;

import android.os.Bundle;
import android.support.v4.os.ResultReceiver;
import androidx.media.MediaBrowserServiceCompat.i;

/* renamed from: androidx.media.f reason: case insensitive filesystem */
/* compiled from: MediaBrowserServiceCompat */
class C0384f extends i<Bundle> {
    final /* synthetic */ ResultReceiver f;
    final /* synthetic */ MediaBrowserServiceCompat g;

    C0384f(MediaBrowserServiceCompat mediaBrowserServiceCompat, Object obj, ResultReceiver resultReceiver) {
        this.g = mediaBrowserServiceCompat;
        this.f = resultReceiver;
        super(obj);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void a(Bundle bundle) {
        this.f.send(0, bundle);
    }

    /* access modifiers changed from: 0000 */
    public void a(Bundle bundle) {
        this.f.send(-1, bundle);
    }
}
