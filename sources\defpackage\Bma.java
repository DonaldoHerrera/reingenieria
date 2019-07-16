package defpackage;

import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;

@EVa(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0005H\u0017R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X.¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/soundcloud/android/playback/mediaplayer/PlayerHandler;", "Landroid/os/Handler;", "()V", "mediaPlayerAdapterWeakReference", "Ljava/lang/ref/WeakReference;", "Lcom/soundcloud/android/playback/mediaplayer/MediaPlayerAdapter;", "handleMessage", "", "msg", "Landroid/os/Message;", "setMediaPlayerAdapter", "adapter", "Companion", "mediaplayer_release"}, mv = {1, 1, 15})
/* renamed from: Bma reason: default package */
/* compiled from: MediaPlayerAdapter.kt */
public class Bma extends Handler {
    public static final a a = new a(null);
    private WeakReference<C4685uma> b;

    /* renamed from: Bma$a */
    /* compiled from: MediaPlayerAdapter.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }
    }

    public void a(C4685uma uma) {
        C7471uYa.b(uma, "adapter");
        this.b = new WeakReference<>(uma);
    }

    public void handleMessage(Message message) {
        C7471uYa.b(message, "msg");
        WeakReference<C4685uma> weakReference = this.b;
        if (weakReference != null) {
            C4685uma uma = (C4685uma) weakReference.get();
            if (uma != null) {
                C7471uYa.a((Object) uma, "mediaPlayerAdapterWeakReference.get() ?: return");
                int i = message.what;
                if (i == 0) {
                    uma.c(C4685uma.b.a());
                } else if (i == 1) {
                    uma.p();
                    sendEmptyMessageDelayed(1, 500);
                }
            }
        } else {
            C7471uYa.b("mediaPlayerAdapterWeakReference");
            throw null;
        }
    }
}
