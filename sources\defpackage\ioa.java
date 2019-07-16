package defpackage;

import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;

@EVa(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001:\u0001\u000bB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/soundcloud/android/player/ui/progress/SeekHandler;", "Landroid/os/Handler;", "scrubController", "Lcom/soundcloud/android/player/ui/progress/ScrubController;", "(Lcom/soundcloud/android/player/ui/progress/ScrubController;)V", "scrubControllerRef", "Ljava/lang/ref/WeakReference;", "handleMessage", "", "msg", "Landroid/os/Message;", "Factory", "player-ui-components_release"}, mv = {1, 1, 15})
/* renamed from: ioa reason: default package */
/* compiled from: SeekHandler.kt */
public class ioa extends Handler {
    private final WeakReference<goa> a;

    /* renamed from: ioa$a */
    /* compiled from: SeekHandler.kt */
    public static class a {
        public ioa a(goa goa) {
            C7471uYa.b(goa, "scrubController");
            return new ioa(goa);
        }
    }

    public ioa(goa goa) {
        C7471uYa.b(goa, "scrubController");
        this.a = new WeakReference<>(goa);
    }

    public void handleMessage(Message message) {
        C7471uYa.b(message, "msg");
        goa goa = (goa) this.a.get();
        if (goa != null) {
            String str = "null cannot be cast to non-null type kotlin.Float";
            if (goa.c()) {
                Object obj = message.obj;
                if (obj != null) {
                    goa.b(((Float) obj).floatValue());
                    return;
                }
                throw new OVa(str);
            }
            Object obj2 = message.obj;
            if (obj2 != null) {
                goa.a(((Float) obj2).floatValue());
                return;
            }
            throw new OVa(str);
        }
    }
}
