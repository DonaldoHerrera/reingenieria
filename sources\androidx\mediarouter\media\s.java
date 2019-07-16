package androidx.mediarouter.media;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
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
import androidx.mediarouter.media.c.C0017c;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* compiled from: RegisteredMediaRouteProvider */
final class s extends c implements ServiceConnection {
    static final boolean i = Log.isLoggable("MediaRouteProviderProxy", 3);
    private final ComponentName j;
    final c k;
    private final ArrayList<b> l = new ArrayList<>();
    private boolean m;
    private boolean n;
    private a o;
    private boolean p;

    /* compiled from: RegisteredMediaRouteProvider */
    private final class a implements DeathRecipient {
        private final Messenger a;
        private final d b;
        private final Messenger c;
        private int d = 1;
        private int e = 1;
        private int f;
        private int g;
        private final SparseArray<androidx.mediarouter.media.h.c> h = new SparseArray<>();

        public a(Messenger messenger) {
            this.a = messenger;
            this.b = new d(this);
            this.c = new Messenger(this.b);
        }

        public void a() {
            a(2, 0, 0, null, null);
            this.b.a();
            this.a.getBinder().unlinkToDeath(this, 0);
            s.this.k.post(new q(this));
        }

        /* access modifiers changed from: 0000 */
        public void b() {
            for (int i2 = 0; i2 < this.h.size(); i2++) {
                ((androidx.mediarouter.media.h.c) this.h.valueAt(i2)).a(null, null);
            }
            this.h.clear();
        }

        public boolean b(int i2) {
            return true;
        }

        public void binderDied() {
            s.this.k.post(new r(this));
        }

        public boolean c() {
            int i2 = this.d;
            this.d = i2 + 1;
            this.g = i2;
            if (!a(1, this.g, 2, null, null)) {
                return false;
            }
            try {
                this.a.getBinder().linkToDeath(this, 0);
                return true;
            } catch (RemoteException unused) {
                binderDied();
                return false;
            }
        }

        public void d(int i2) {
            int i3 = this.d;
            this.d = i3 + 1;
            a(5, i3, i2, null, null);
        }

        public void b(int i2, int i3) {
            Bundle bundle = new Bundle();
            bundle.putInt("unselectReason", i3);
            int i4 = this.d;
            this.d = i4 + 1;
            a(6, i4, i2, null, bundle);
        }

        public boolean a(int i2) {
            if (i2 == this.g) {
                this.g = 0;
                s.this.a(this, "Registration failed");
            }
            androidx.mediarouter.media.h.c cVar = (androidx.mediarouter.media.h.c) this.h.get(i2);
            if (cVar != null) {
                this.h.remove(i2);
                cVar.a(null, null);
            }
            return true;
        }

        public void c(int i2) {
            int i3 = this.d;
            this.d = i3 + 1;
            a(4, i3, i2, null, null);
        }

        public void c(int i2, int i3) {
            Bundle bundle = new Bundle();
            bundle.putInt("volume", i3);
            int i4 = this.d;
            this.d = i4 + 1;
            a(8, i4, i2, null, bundle);
        }

        public boolean a(int i2, int i3, Bundle bundle) {
            if (this.f != 0 || i2 != this.g || i3 < 1) {
                return false;
            }
            this.g = 0;
            this.f = i3;
            s.this.a(this, d.a(bundle));
            s.this.b(this);
            return true;
        }

        public boolean a(Bundle bundle) {
            if (this.f == 0) {
                return false;
            }
            s.this.a(this, d.a(bundle));
            return true;
        }

        public boolean a(int i2, Bundle bundle) {
            androidx.mediarouter.media.h.c cVar = (androidx.mediarouter.media.h.c) this.h.get(i2);
            if (cVar == null) {
                return false;
            }
            this.h.remove(i2);
            cVar.a(bundle);
            return true;
        }

        public boolean a(int i2, String str, Bundle bundle) {
            androidx.mediarouter.media.h.c cVar = (androidx.mediarouter.media.h.c) this.h.get(i2);
            if (cVar == null) {
                return false;
            }
            this.h.remove(i2);
            cVar.a(str, bundle);
            return true;
        }

        public int a(String str, String str2) {
            int i2 = this.e;
            this.e = i2 + 1;
            Bundle bundle = new Bundle();
            bundle.putString("routeId", str);
            bundle.putString("routeGroupId", str2);
            int i3 = this.d;
            this.d = i3 + 1;
            a(3, i3, i2, null, bundle);
            return i2;
        }

        public void a(int i2, int i3) {
            Bundle bundle = new Bundle();
            bundle.putInt("volume", i3);
            int i4 = this.d;
            this.d = i4 + 1;
            a(7, i4, i2, null, bundle);
        }

        public boolean a(int i2, Intent intent, androidx.mediarouter.media.h.c cVar) {
            int i3 = this.d;
            this.d = i3 + 1;
            if (!a(9, i3, i2, intent, null)) {
                return false;
            }
            if (cVar != null) {
                this.h.put(i3, cVar);
            }
            return true;
        }

        public void a(b bVar) {
            int i2 = this.d;
            this.d = i2 + 1;
            a(10, i2, 0, bVar != null ? bVar.a() : null, null);
        }

        private boolean a(int i2, int i3, int i4, Object obj, Bundle bundle) {
            Message obtain = Message.obtain();
            obtain.what = i2;
            obtain.arg1 = i3;
            obtain.arg2 = i4;
            obtain.obj = obj;
            obtain.setData(bundle);
            obtain.replyTo = this.c;
            try {
                this.a.send(obtain);
                return true;
            } catch (DeadObjectException unused) {
                return false;
            } catch (RemoteException e2) {
                if (i2 != 2) {
                    Log.e("MediaRouteProviderProxy", "Could not send message to service.", e2);
                }
                return false;
            }
        }
    }

    /* compiled from: RegisteredMediaRouteProvider */
    private final class b extends androidx.mediarouter.media.c.d {
        private final String a;
        private final String b;
        private boolean c;
        private int d = -1;
        private int e;
        private a f;
        private int g;

        public b(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        public void a(a aVar) {
            this.f = aVar;
            this.g = aVar.a(this.a, this.b);
            if (this.c) {
                aVar.d(this.g);
                int i = this.d;
                if (i >= 0) {
                    aVar.a(this.g, i);
                    this.d = -1;
                }
                int i2 = this.e;
                if (i2 != 0) {
                    aVar.c(this.g, i2);
                    this.e = 0;
                }
            }
        }

        public void b() {
            this.c = true;
            a aVar = this.f;
            if (aVar != null) {
                aVar.d(this.g);
            }
        }

        public void c() {
            b(0);
        }

        public void d() {
            a aVar = this.f;
            if (aVar != null) {
                aVar.c(this.g);
                this.f = null;
                this.g = 0;
            }
        }

        public void c(int i) {
            a aVar = this.f;
            if (aVar != null) {
                aVar.c(this.g, i);
            } else {
                this.e += i;
            }
        }

        public void b(int i) {
            this.c = false;
            a aVar = this.f;
            if (aVar != null) {
                aVar.b(this.g, i);
            }
        }

        public void a() {
            s.this.a(this);
        }

        public void a(int i) {
            a aVar = this.f;
            if (aVar != null) {
                aVar.a(this.g, i);
                return;
            }
            this.d = i;
            this.e = 0;
        }

        public boolean a(Intent intent, androidx.mediarouter.media.h.c cVar) {
            a aVar = this.f;
            if (aVar != null) {
                return aVar.a(this.g, intent, cVar);
            }
            return false;
        }
    }

    /* compiled from: RegisteredMediaRouteProvider */
    private static final class c extends Handler {
        c() {
        }
    }

    /* compiled from: RegisteredMediaRouteProvider */
    private static final class d extends Handler {
        private final WeakReference<a> a;

        public d(a aVar) {
            this.a = new WeakReference<>(aVar);
        }

        public void a() {
            this.a.clear();
        }

        public void handleMessage(Message message) {
            a aVar = (a) this.a.get();
            if (aVar != null) {
                if (!a(aVar, message.what, message.arg1, message.arg2, message.obj, message.peekData()) && s.i) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Unhandled message from server: ");
                    sb.append(message);
                    Log.d("MediaRouteProviderProxy", sb.toString());
                }
            }
        }

        private boolean a(a aVar, int i, int i2, int i3, Object obj, Bundle bundle) {
            String str;
            if (i == 0) {
                aVar.a(i2);
                return true;
            } else if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i == 5 && (obj == null || (obj instanceof Bundle))) {
                                return aVar.a((Bundle) obj);
                            }
                        } else if (obj == null || (obj instanceof Bundle)) {
                            if (bundle == null) {
                                str = null;
                            } else {
                                str = bundle.getString("error");
                            }
                            return aVar.a(i2, str, (Bundle) obj);
                        }
                    } else if (obj == null || (obj instanceof Bundle)) {
                        return aVar.a(i2, (Bundle) obj);
                    }
                } else if (obj == null || (obj instanceof Bundle)) {
                    return aVar.a(i2, i3, (Bundle) obj);
                }
                return false;
            } else {
                aVar.b(i2);
                return true;
            }
        }
    }

    public s(Context context, ComponentName componentName) {
        super(context, new C0017c(componentName));
        this.j = componentName;
        this.k = new c();
    }

    private androidx.mediarouter.media.c.d c(String str, String str2) {
        d d2 = d();
        if (d2 != null) {
            List c2 = d2.c();
            int size = c2.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (((a) c2.get(i2)).k().equals(str)) {
                    b bVar = new b(str, str2);
                    this.l.add(bVar);
                    if (this.p) {
                        bVar.a(this.o);
                    }
                    q();
                    return bVar;
                }
            }
        }
        return null;
    }

    private void k() {
        int size = this.l.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((b) this.l.get(i2)).a(this.o);
        }
    }

    private void l() {
        String str = ": Bind failed";
        if (!this.n) {
            String str2 = "MediaRouteProviderProxy";
            if (i) {
                StringBuilder sb = new StringBuilder();
                sb.append(this);
                sb.append(": Binding");
                Log.d(str2, sb.toString());
            }
            Intent intent = new Intent("android.media.MediaRouteProviderService");
            intent.setComponent(this.j);
            try {
                this.n = c().bindService(intent, this, 1);
                if (!this.n && i) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(this);
                    sb2.append(str);
                    Log.d(str2, sb2.toString());
                }
            } catch (SecurityException e) {
                if (i) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(this);
                    sb3.append(str);
                    Log.d(str2, sb3.toString(), e);
                }
            }
        }
    }

    private void m() {
        int size = this.l.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((b) this.l.get(i2)).d();
        }
    }

    private void n() {
        if (this.o != null) {
            a((d) null);
            this.p = false;
            m();
            this.o.a();
            this.o = null;
        }
    }

    private boolean o() {
        if (!this.m || (e() == null && this.l.isEmpty())) {
            return false;
        }
        return true;
    }

    private void p() {
        if (this.n) {
            if (i) {
                StringBuilder sb = new StringBuilder();
                sb.append(this);
                sb.append(": Unbinding");
                Log.d("MediaRouteProviderProxy", sb.toString());
            }
            this.n = false;
            n();
            c().unbindService(this);
        }
    }

    private void q() {
        if (o()) {
            l();
        } else {
            p();
        }
    }

    public androidx.mediarouter.media.c.d a(String str) {
        if (str != null) {
            return c(str, null);
        }
        throw new IllegalArgumentException("routeId cannot be null");
    }

    public boolean b(String str, String str2) {
        return this.j.getPackageName().equals(str) && this.j.getClassName().equals(str2);
    }

    public void h() {
        if (this.o == null && o()) {
            p();
            l();
        }
    }

    public void i() {
        if (!this.m) {
            if (i) {
                StringBuilder sb = new StringBuilder();
                sb.append(this);
                sb.append(": Starting");
                Log.d("MediaRouteProviderProxy", sb.toString());
            }
            this.m = true;
            q();
        }
    }

    public void j() {
        if (this.m) {
            if (i) {
                StringBuilder sb = new StringBuilder();
                sb.append(this);
                sb.append(": Stopping");
                Log.d("MediaRouteProviderProxy", sb.toString());
            }
            this.m = false;
            q();
        }
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        String str = "MediaRouteProviderProxy";
        if (i) {
            StringBuilder sb = new StringBuilder();
            sb.append(this);
            sb.append(": Connected");
            Log.d(str, sb.toString());
        }
        if (this.n) {
            n();
            Messenger messenger = iBinder != null ? new Messenger(iBinder) : null;
            if (e.a(messenger)) {
                a aVar = new a(messenger);
                if (aVar.c()) {
                    this.o = aVar;
                } else if (i) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(this);
                    sb2.append(": Registration failed");
                    Log.d(str, sb2.toString());
                }
            } else {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(this);
                sb3.append(": Service returned invalid messenger binder");
                Log.e(str, sb3.toString());
            }
        }
    }

    public void onServiceDisconnected(ComponentName componentName) {
        if (i) {
            StringBuilder sb = new StringBuilder();
            sb.append(this);
            sb.append(": Service disconnected");
            Log.d("MediaRouteProviderProxy", sb.toString());
        }
        n();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Service connection ");
        sb.append(this.j.flattenToShortString());
        return sb.toString();
    }

    public androidx.mediarouter.media.c.d a(String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("routeId cannot be null");
        } else if (str2 != null) {
            return c(str, str2);
        } else {
            throw new IllegalArgumentException("routeGroupId cannot be null");
        }
    }

    /* access modifiers changed from: 0000 */
    public void b(a aVar) {
        if (this.o == aVar) {
            this.p = true;
            k();
            b e = e();
            if (e != null) {
                this.o.a(e);
            }
        }
    }

    public void a(b bVar) {
        if (this.p) {
            this.o.a(bVar);
        }
        q();
    }

    /* access modifiers changed from: 0000 */
    public void a(a aVar) {
        if (this.o == aVar) {
            if (i) {
                StringBuilder sb = new StringBuilder();
                sb.append(this);
                sb.append(": Service connection died");
                Log.d("MediaRouteProviderProxy", sb.toString());
            }
            n();
        }
    }

    /* access modifiers changed from: 0000 */
    public void a(a aVar, String str) {
        if (this.o == aVar) {
            if (i) {
                StringBuilder sb = new StringBuilder();
                sb.append(this);
                sb.append(": Service connection error - ");
                sb.append(str);
                Log.d("MediaRouteProviderProxy", sb.toString());
            }
            p();
        }
    }

    /* access modifiers changed from: 0000 */
    public void a(a aVar, d dVar) {
        if (this.o == aVar) {
            if (i) {
                StringBuilder sb = new StringBuilder();
                sb.append(this);
                sb.append(": Descriptor changed, descriptor=");
                sb.append(dVar);
                Log.d("MediaRouteProviderProxy", sb.toString());
            }
            a(dVar);
        }
    }

    /* access modifiers changed from: 0000 */
    public void a(b bVar) {
        this.l.remove(bVar);
        bVar.d();
        q();
    }
}
