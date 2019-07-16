package androidx.mediarouter.media;

import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IBinder.DeathRecipient;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

public abstract class MediaRouteProviderService extends Service {
    static final boolean a = Log.isLoggable("MediaRouteProviderSrv", 3);
    private final ArrayList<a> b = new ArrayList<>();
    private final d c = new d(this);
    private final Messenger d = new Messenger(this.c);
    final b e = new b();
    private final c f = new c();
    c g;
    private b h;

    private final class a implements DeathRecipient {
        public final Messenger a;
        public final int b;
        public b c;
        private final SparseArray<androidx.mediarouter.media.c.d> d = new SparseArray<>();

        public a(Messenger messenger, int i) {
            this.a = messenger;
            this.b = i;
        }

        public void a() {
            int size = this.d.size();
            for (int i = 0; i < size; i++) {
                ((androidx.mediarouter.media.c.d) this.d.valueAt(i)).a();
            }
            this.d.clear();
            this.a.getBinder().unlinkToDeath(this, 0);
            a((b) null);
        }

        public boolean b() {
            try {
                this.a.getBinder().linkToDeath(this, 0);
                return true;
            } catch (RemoteException unused) {
                binderDied();
                return false;
            }
        }

        public void binderDied() {
            MediaRouteProviderService.this.e.obtainMessage(1, this.a).sendToTarget();
        }

        public String toString() {
            return MediaRouteProviderService.b(this.a);
        }

        public boolean b(int i) {
            androidx.mediarouter.media.c.d dVar = (androidx.mediarouter.media.c.d) this.d.get(i);
            if (dVar == null) {
                return false;
            }
            this.d.remove(i);
            dVar.a();
            return true;
        }

        public boolean a(Messenger messenger) {
            return this.a.getBinder() == messenger.getBinder();
        }

        public boolean a(String str, String str2, int i) {
            androidx.mediarouter.media.c.d dVar;
            if (this.d.indexOfKey(i) < 0) {
                if (str2 == null) {
                    dVar = MediaRouteProviderService.this.g.a(str);
                } else {
                    dVar = MediaRouteProviderService.this.g.a(str, str2);
                }
                if (dVar != null) {
                    this.d.put(i, dVar);
                    return true;
                }
            }
            return false;
        }

        public androidx.mediarouter.media.c.d a(int i) {
            return (androidx.mediarouter.media.c.d) this.d.get(i);
        }

        public boolean a(b bVar) {
            if (C0243Pb.a(this.c, bVar)) {
                return false;
            }
            this.c = bVar;
            return MediaRouteProviderService.this.b();
        }
    }

    private final class b extends Handler {
        b() {
        }

        public void handleMessage(Message message) {
            if (message.what == 1) {
                MediaRouteProviderService.this.c((Messenger) message.obj);
            }
        }
    }

    private final class c extends androidx.mediarouter.media.c.a {
        c() {
        }

        public void a(c cVar, d dVar) {
            MediaRouteProviderService.this.a(dVar);
        }
    }

    private static final class d extends Handler {
        private final WeakReference<MediaRouteProviderService> a;

        public d(MediaRouteProviderService mediaRouteProviderService) {
            this.a = new WeakReference<>(mediaRouteProviderService);
        }

        private boolean a(int i, Messenger messenger, int i2, int i3, Object obj, Bundle bundle) {
            MediaRouteProviderService mediaRouteProviderService = (MediaRouteProviderService) this.a.get();
            int i4 = 0;
            if (mediaRouteProviderService != null) {
                String str = "volume";
                switch (i) {
                    case 1:
                        return mediaRouteProviderService.a(messenger, i2, i3);
                    case 2:
                        return mediaRouteProviderService.a(messenger, i2);
                    case 3:
                        String string = bundle.getString("routeId");
                        String string2 = bundle.getString("routeGroupId");
                        if (string != null) {
                            return mediaRouteProviderService.a(messenger, i2, i3, string, string2);
                        }
                        break;
                    case 4:
                        return mediaRouteProviderService.b(messenger, i2, i3);
                    case 5:
                        return mediaRouteProviderService.c(messenger, i2, i3);
                    case 6:
                        if (bundle != null) {
                            i4 = bundle.getInt("unselectReason", 0);
                        }
                        return mediaRouteProviderService.b(messenger, i2, i3, i4);
                    case 7:
                        int i5 = bundle.getInt(str, -1);
                        if (i5 >= 0) {
                            return mediaRouteProviderService.a(messenger, i2, i3, i5);
                        }
                        break;
                    case 8:
                        int i6 = bundle.getInt(str, 0);
                        if (i6 != 0) {
                            return mediaRouteProviderService.c(messenger, i2, i3, i6);
                        }
                        break;
                    case 9:
                        if (obj instanceof Intent) {
                            return mediaRouteProviderService.a(messenger, i2, i3, (Intent) obj);
                        }
                        break;
                    case 10:
                        if (obj == null || (obj instanceof Bundle)) {
                            b a2 = b.a((Bundle) obj);
                            if (a2 == null || !a2.d()) {
                                a2 = null;
                            }
                            return mediaRouteProviderService.a(messenger, i2, a2);
                        }
                }
            }
            return false;
        }

        public void handleMessage(Message message) {
            Messenger messenger = message.replyTo;
            String str = "MediaRouteProviderSrv";
            if (e.a(messenger)) {
                int i = message.what;
                int i2 = message.arg1;
                int i3 = message.arg2;
                Object obj = message.obj;
                Bundle peekData = message.peekData();
                if (!a(i, messenger, i2, i3, obj, peekData)) {
                    if (MediaRouteProviderService.a) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(MediaRouteProviderService.b(messenger));
                        sb.append(": Message failed, what=");
                        sb.append(i);
                        sb.append(", requestId=");
                        sb.append(i2);
                        sb.append(", arg=");
                        sb.append(i3);
                        sb.append(", obj=");
                        sb.append(obj);
                        sb.append(", data=");
                        sb.append(peekData);
                        Log.d(str, sb.toString());
                    }
                    MediaRouteProviderService.b(messenger, i2);
                }
            } else if (MediaRouteProviderService.a) {
                Log.d(str, "Ignoring message without valid reply messenger.");
            }
        }
    }

    private a d(Messenger messenger) {
        int a2 = a(messenger);
        if (a2 >= 0) {
            return (a) this.b.get(a2);
        }
        return null;
    }

    public abstract c a();

    /* access modifiers changed from: 0000 */
    public boolean a(Messenger messenger, int i, int i2) {
        if (i2 >= 1 && a(messenger) < 0) {
            a aVar = new a(messenger, i2);
            if (aVar.b()) {
                this.b.add(aVar);
                if (a) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(aVar);
                    sb.append(": Registered, version=");
                    sb.append(i2);
                    Log.d("MediaRouteProviderSrv", sb.toString());
                }
                if (i != 0) {
                    a(messenger, 2, i, 1, a(this.g.d(), aVar.b), null);
                }
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    public boolean b(Messenger messenger, int i, int i2) {
        a d2 = d(messenger);
        if (d2 == null || !d2.b(i2)) {
            return false;
        }
        if (a) {
            StringBuilder sb = new StringBuilder();
            sb.append(d2);
            sb.append(": Route controller released");
            sb.append(", controllerId=");
            sb.append(i2);
            Log.d("MediaRouteProviderSrv", sb.toString());
        }
        c(messenger, i);
        return true;
    }

    /* access modifiers changed from: 0000 */
    public void c(Messenger messenger) {
        int a2 = a(messenger);
        if (a2 >= 0) {
            a aVar = (a) this.b.remove(a2);
            if (a) {
                StringBuilder sb = new StringBuilder();
                sb.append(aVar);
                sb.append(": Binder died");
                Log.d("MediaRouteProviderSrv", sb.toString());
            }
            aVar.a();
        }
    }

    public IBinder onBind(Intent intent) {
        if (intent.getAction().equals("android.media.MediaRouteProviderService")) {
            if (this.g == null) {
                c a2 = a();
                if (a2 != null) {
                    String b2 = a2.g().b();
                    if (b2.equals(getPackageName())) {
                        this.g = a2;
                        this.g.a((androidx.mediarouter.media.c.a) this.f);
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append("onCreateMediaRouteProvider() returned a provider whose package name does not match the package name of the service.  A media route provider service can only export its own media route providers.  Provider package name: ");
                        sb.append(b2);
                        sb.append(".  Service package name: ");
                        sb.append(getPackageName());
                        sb.append(".");
                        throw new IllegalStateException(sb.toString());
                    }
                }
            }
            if (this.g != null) {
                return this.d.getBinder();
            }
        }
        return null;
    }

    public boolean onUnbind(Intent intent) {
        c cVar = this.g;
        if (cVar != null) {
            cVar.a((androidx.mediarouter.media.c.a) null);
        }
        return super.onUnbind(intent);
    }

    /* access modifiers changed from: 0000 */
    public boolean b(Messenger messenger, int i, int i2, int i3) {
        a d2 = d(messenger);
        if (d2 != null) {
            androidx.mediarouter.media.c.d a2 = d2.a(i2);
            if (a2 != null) {
                a2.b(i3);
                if (a) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(d2);
                    sb.append(": Route unselected");
                    sb.append(", controllerId=");
                    sb.append(i2);
                    Log.d("MediaRouteProviderSrv", sb.toString());
                }
                c(messenger, i);
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    public boolean c(Messenger messenger, int i, int i2) {
        a d2 = d(messenger);
        if (d2 != null) {
            androidx.mediarouter.media.c.d a2 = d2.a(i2);
            if (a2 != null) {
                a2.b();
                if (a) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(d2);
                    sb.append(": Route selected");
                    sb.append(", controllerId=");
                    sb.append(i2);
                    Log.d("MediaRouteProviderSrv", sb.toString());
                }
                c(messenger, i);
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    public boolean a(Messenger messenger, int i) {
        int a2 = a(messenger);
        if (a2 < 0) {
            return false;
        }
        a aVar = (a) this.b.remove(a2);
        if (a) {
            StringBuilder sb = new StringBuilder();
            sb.append(aVar);
            sb.append(": Unregistered");
            Log.d("MediaRouteProviderSrv", sb.toString());
        }
        aVar.a();
        c(messenger, i);
        return true;
    }

    /* access modifiers changed from: 0000 */
    public boolean b() {
        int size = this.b.size();
        androidx.mediarouter.media.g.a aVar = null;
        b bVar = null;
        boolean z = false;
        for (int i = 0; i < size; i++) {
            b bVar2 = ((a) this.b.get(i)).c;
            if (bVar2 != null && (!bVar2.b().d() || bVar2.c())) {
                z |= bVar2.c();
                if (bVar == null) {
                    bVar = bVar2;
                } else {
                    if (aVar == null) {
                        aVar = new androidx.mediarouter.media.g.a(bVar.b());
                    }
                    aVar.a(bVar2.b());
                }
            }
        }
        if (aVar != null) {
            bVar = new b(aVar.a(), z);
        }
        if (C0243Pb.a(this.h, bVar)) {
            return false;
        }
        this.h = bVar;
        this.g.b(bVar);
        return true;
    }

    /* access modifiers changed from: 0000 */
    public boolean c(Messenger messenger, int i, int i2, int i3) {
        a d2 = d(messenger);
        if (d2 != null) {
            androidx.mediarouter.media.c.d a2 = d2.a(i2);
            if (a2 != null) {
                a2.c(i3);
                if (a) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(d2);
                    sb.append(": Route volume updated");
                    sb.append(", controllerId=");
                    sb.append(i2);
                    sb.append(", delta=");
                    sb.append(i3);
                    Log.d("MediaRouteProviderSrv", sb.toString());
                }
                c(messenger, i);
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    public boolean a(Messenger messenger, int i, int i2, String str, String str2) {
        a d2 = d(messenger);
        if (d2 == null || !d2.a(str, str2, i2)) {
            return false;
        }
        if (a) {
            StringBuilder sb = new StringBuilder();
            sb.append(d2);
            sb.append(": Route controller created, controllerId=");
            sb.append(i2);
            sb.append(", routeId=");
            sb.append(str);
            sb.append(", routeGroupId=");
            sb.append(str2);
            Log.d("MediaRouteProviderSrv", sb.toString());
        }
        c(messenger, i);
        return true;
    }

    private static void c(Messenger messenger, int i) {
        if (i != 0) {
            a(messenger, 1, i, 0, null, null);
        }
    }

    static void b(Messenger messenger, int i) {
        if (i != 0) {
            a(messenger, 0, i, 0, null, null);
        }
    }

    /* access modifiers changed from: 0000 */
    public boolean a(Messenger messenger, int i, int i2, int i3) {
        a d2 = d(messenger);
        if (d2 != null) {
            androidx.mediarouter.media.c.d a2 = d2.a(i2);
            if (a2 != null) {
                a2.a(i3);
                if (a) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(d2);
                    sb.append(": Route volume changed");
                    sb.append(", controllerId=");
                    sb.append(i2);
                    sb.append(", volume=");
                    sb.append(i3);
                    Log.d("MediaRouteProviderSrv", sb.toString());
                }
                c(messenger, i);
                return true;
            }
        }
        return false;
    }

    static String b(Messenger messenger) {
        StringBuilder sb = new StringBuilder();
        sb.append("Client connection ");
        sb.append(messenger.getBinder().toString());
        return sb.toString();
    }

    /* access modifiers changed from: 0000 */
    public boolean a(Messenger messenger, int i, int i2, Intent intent) {
        a d2 = d(messenger);
        if (d2 != null) {
            androidx.mediarouter.media.c.d a2 = d2.a(i2);
            if (a2 != null) {
                f fVar = null;
                if (i != 0) {
                    fVar = new f(this, d2, i2, intent, messenger, i);
                }
                if (a2.a(intent, fVar)) {
                    if (a) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(d2);
                        sb.append(": Route control request delivered");
                        sb.append(", controllerId=");
                        sb.append(i2);
                        sb.append(", intent=");
                        sb.append(intent);
                        Log.d("MediaRouteProviderSrv", sb.toString());
                    }
                    return true;
                }
            }
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    public boolean a(Messenger messenger, int i, b bVar) {
        a d2 = d(messenger);
        if (d2 == null) {
            return false;
        }
        boolean a2 = d2.a(bVar);
        if (a) {
            StringBuilder sb = new StringBuilder();
            sb.append(d2);
            sb.append(": Set discovery request, request=");
            sb.append(bVar);
            sb.append(", actuallyChanged=");
            sb.append(a2);
            sb.append(", compositeDiscoveryRequest=");
            sb.append(this.h);
            Log.d("MediaRouteProviderSrv", sb.toString());
        }
        c(messenger, i);
        return true;
    }

    /* access modifiers changed from: 0000 */
    public void a(d dVar) {
        int size = this.b.size();
        for (int i = 0; i < size; i++) {
            a aVar = (a) this.b.get(i);
            a(aVar.a, 5, 0, 0, a(dVar, aVar.b), null);
            if (a) {
                StringBuilder sb = new StringBuilder();
                sb.append(aVar);
                sb.append(": Sent descriptor change event, descriptor=");
                sb.append(dVar);
                Log.d("MediaRouteProviderSrv", sb.toString());
            }
        }
    }

    static Bundle a(d dVar, int i) {
        if (dVar == null) {
            return null;
        }
        androidx.mediarouter.media.d.a aVar = new androidx.mediarouter.media.d.a(dVar);
        aVar.a(null);
        for (a aVar2 : dVar.c()) {
            if (i >= aVar2.m() && i <= aVar2.l()) {
                aVar.a(aVar2);
            }
        }
        return aVar.a().a();
    }

    /* access modifiers changed from: 0000 */
    public int a(Messenger messenger) {
        int size = this.b.size();
        for (int i = 0; i < size; i++) {
            if (((a) this.b.get(i)).a(messenger)) {
                return i;
            }
        }
        return -1;
    }

    static void a(Messenger messenger, int i, int i2, int i3, Object obj, Bundle bundle) {
        Message obtain = Message.obtain();
        obtain.what = i;
        obtain.arg1 = i2;
        obtain.arg2 = i3;
        obtain.obj = obj;
        obtain.setData(bundle);
        try {
            messenger.send(obtain);
        } catch (DeadObjectException unused) {
        } catch (RemoteException e2) {
            StringBuilder sb = new StringBuilder();
            sb.append("Could not send message to ");
            sb.append(b(messenger));
            Log.e("MediaRouteProviderSrv", sb.toString(), e2);
        }
    }
}
