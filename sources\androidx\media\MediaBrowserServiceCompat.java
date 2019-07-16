package androidx.media;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Binder;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IBinder.DeathRecipient;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.RemoteException;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.media.MediaBrowserCompat.MediaItem;
import android.support.v4.media.session.IMediaSession;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.MediaSessionCompat.Token;
import android.support.v4.os.ResultReceiver;
import android.text.TextUtils;
import android.util.Log;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public abstract class MediaBrowserServiceCompat extends Service {
    static final boolean a = Log.isLoggable("MBServiceCompat", 3);
    private c b;
    final T<IBinder, b> c = new T<>();
    b d;
    final m e = new m();
    Token f;

    public static final class a {
        private final String a;
        private final Bundle b;

        public a(String str, Bundle bundle) {
            if (str != null) {
                this.a = str;
                this.b = bundle;
                return;
            }
            throw new IllegalArgumentException("The root id in BrowserRoot cannot be null. Use null for BrowserRoot instead.");
        }

        public Bundle a() {
            return this.b;
        }

        public String b() {
            return this.a;
        }
    }

    private class b implements DeathRecipient {
        public final String a;
        public final int b;
        public final int c;
        public final y d;
        public final Bundle e;
        public final k f;
        public final HashMap<String, List<C0247Qb<IBinder, Bundle>>> g = new HashMap<>();
        public a h;

        b(String str, int i2, int i3, Bundle bundle, k kVar) {
            this.a = str;
            this.b = i2;
            this.c = i3;
            this.d = new y(str, i2, i3);
            this.e = bundle;
            this.f = kVar;
        }

        public void binderDied() {
            MediaBrowserServiceCompat.this.e.post(new C0385g(this));
        }
    }

    interface c {
        IBinder a(Intent intent);

        void a(Token token);

        void onCreate();
    }

    class d implements c, androidx.media.v.d {
        final List<Bundle> a = new ArrayList();
        Object b;
        Messenger c;

        d() {
        }

        public IBinder a(Intent intent) {
            return v.a(this.b, intent);
        }

        public void b(String str, c<List<Parcel>> cVar) {
            MediaBrowserServiceCompat.this.a(str, (i<List<MediaItem>>) new C0387i<List<MediaItem>>(this, str, cVar));
        }

        public void onCreate() {
            this.b = v.a((Context) MediaBrowserServiceCompat.this, (androidx.media.v.d) this);
            v.a(this.b);
        }

        public void a(Token token) {
            MediaBrowserServiceCompat.this.e.a(new C0386h(this, token));
        }

        /* JADX WARNING: Removed duplicated region for block: B:15:0x006b A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:16:0x006c  */
        public a a(String str, int i, Bundle bundle) {
            Bundle bundle2;
            a a2;
            IBinder iBinder;
            if (bundle != null) {
                String str2 = "extra_client_version";
                if (bundle.getInt(str2, 0) != 0) {
                    bundle.remove(str2);
                    this.c = new Messenger(MediaBrowserServiceCompat.this.e);
                    bundle2 = new Bundle();
                    bundle2.putInt("extra_service_version", 2);
                    androidx.core.app.f.a(bundle2, "extra_messenger", this.c.getBinder());
                    Token token = MediaBrowserServiceCompat.this.f;
                    if (token != null) {
                        IMediaSession extraBinder = token.getExtraBinder();
                        if (extraBinder == null) {
                            iBinder = null;
                        } else {
                            iBinder = extraBinder.asBinder();
                        }
                        androidx.core.app.f.a(bundle2, "extra_session_binder", iBinder);
                    } else {
                        this.a.add(bundle2);
                    }
                    MediaBrowserServiceCompat mediaBrowserServiceCompat = MediaBrowserServiceCompat.this;
                    b bVar = new b(str, -1, i, bundle, null);
                    mediaBrowserServiceCompat.d = bVar;
                    a2 = MediaBrowserServiceCompat.this.a(str, i, bundle);
                    MediaBrowserServiceCompat.this.d = null;
                    if (a2 != null) {
                        return null;
                    }
                    if (bundle2 == null) {
                        bundle2 = a2.a();
                    } else if (a2.a() != null) {
                        bundle2.putAll(a2.a());
                    }
                    return new a(a2.b(), bundle2);
                }
            }
            bundle2 = null;
            MediaBrowserServiceCompat mediaBrowserServiceCompat2 = MediaBrowserServiceCompat.this;
            b bVar2 = new b(str, -1, i, bundle, null);
            mediaBrowserServiceCompat2.d = bVar2;
            a2 = MediaBrowserServiceCompat.this.a(str, i, bundle);
            MediaBrowserServiceCompat.this.d = null;
            if (a2 != null) {
            }
        }
    }

    class e extends d implements androidx.media.w.b {
        e() {
            super();
        }

        public void a(String str, c<Parcel> cVar) {
            MediaBrowserServiceCompat.this.b(str, new j(this, str, cVar));
        }

        public void onCreate() {
            this.b = w.a(MediaBrowserServiceCompat.this, this);
            v.a(this.b);
        }
    }

    class f extends e implements androidx.media.x.c {
        f() {
            super();
        }

        public void a(String str, b bVar, Bundle bundle) {
            MediaBrowserServiceCompat.this.a(str, (i<List<MediaItem>>) new k<List<MediaItem>>(this, str, bVar), bundle);
        }

        public void onCreate() {
            this.b = x.a(MediaBrowserServiceCompat.this, this);
            v.a(this.b);
        }
    }

    class g extends f {
        g() {
            super();
        }
    }

    class h implements c {
        private Messenger a;

        h() {
        }

        public IBinder a(Intent intent) {
            if ("android.media.browse.MediaBrowserService".equals(intent.getAction())) {
                return this.a.getBinder();
            }
            return null;
        }

        public void onCreate() {
            this.a = new Messenger(MediaBrowserServiceCompat.this.e);
        }

        public void a(Token token) {
            MediaBrowserServiceCompat.this.e.post(new l(this, token));
        }
    }

    public static class i<T> {
        private final Object a;
        private boolean b;
        private boolean c;
        private boolean d;
        private int e;

        i(Object obj) {
            this.a = obj;
        }

        public void a() {
            if (this.b) {
                StringBuilder sb = new StringBuilder();
                sb.append("detach() called when detach() had already been called for: ");
                sb.append(this.a);
                throw new IllegalStateException(sb.toString());
            } else if (this.c) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("detach() called when sendResult() had already been called for: ");
                sb2.append(this.a);
                throw new IllegalStateException(sb2.toString());
            } else if (!this.d) {
                this.b = true;
            } else {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("detach() called when sendError() had already been called for: ");
                sb3.append(this.a);
                throw new IllegalStateException(sb3.toString());
            }
        }

        /* access modifiers changed from: 0000 */
        public void a(T t) {
            throw null;
        }

        public void b(T t) {
            if (this.c || this.d) {
                StringBuilder sb = new StringBuilder();
                sb.append("sendResult() called when either sendResult() or sendError() had already been called for: ");
                sb.append(this.a);
                throw new IllegalStateException(sb.toString());
            }
            this.c = true;
            a(t);
        }

        /* access modifiers changed from: 0000 */
        public boolean c() {
            return this.b || this.c || this.d;
        }

        public void b(Bundle bundle) {
            if (this.c || this.d) {
                StringBuilder sb = new StringBuilder();
                sb.append("sendError() called when either sendResult() or sendError() had already been called for: ");
                sb.append(this.a);
                throw new IllegalStateException(sb.toString());
            }
            this.d = true;
            a(bundle);
        }

        /* access modifiers changed from: 0000 */
        public void a(int i) {
            this.e = i;
        }

        /* access modifiers changed from: 0000 */
        public void a(Bundle bundle) {
            StringBuilder sb = new StringBuilder();
            sb.append("It is not supported to send an error for ");
            sb.append(this.a);
            throw new UnsupportedOperationException(sb.toString());
        }

        /* access modifiers changed from: 0000 */
        public int b() {
            return this.e;
        }
    }

    private class j {
        j() {
        }

        public void a(String str, int i, int i2, Bundle bundle, k kVar) {
            if (MediaBrowserServiceCompat.this.a(str, i2)) {
                m mVar = MediaBrowserServiceCompat.this.e;
                m mVar2 = new m(this, kVar, str, i, i2, bundle);
                mVar.a(mVar2);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Package/uid mismatch: uid=");
            sb.append(i2);
            sb.append(" package=");
            sb.append(str);
            throw new IllegalArgumentException(sb.toString());
        }

        public void b(k kVar) {
            MediaBrowserServiceCompat.this.e.a(new s(this, kVar));
        }

        public void b(String str, Bundle bundle, ResultReceiver resultReceiver, k kVar) {
            if (!TextUtils.isEmpty(str) && resultReceiver != null) {
                m mVar = MediaBrowserServiceCompat.this.e;
                u uVar = new u(this, kVar, str, bundle, resultReceiver);
                mVar.a(uVar);
            }
        }

        public void a(k kVar) {
            MediaBrowserServiceCompat.this.e.a(new n(this, kVar));
        }

        public void a(String str, IBinder iBinder, Bundle bundle, k kVar) {
            m mVar = MediaBrowserServiceCompat.this.e;
            o oVar = new o(this, kVar, str, iBinder, bundle);
            mVar.a(oVar);
        }

        public void a(String str, IBinder iBinder, k kVar) {
            MediaBrowserServiceCompat.this.e.a(new p(this, kVar, str, iBinder));
        }

        public void a(String str, ResultReceiver resultReceiver, k kVar) {
            if (!TextUtils.isEmpty(str) && resultReceiver != null) {
                MediaBrowserServiceCompat.this.e.a(new q(this, kVar, str, resultReceiver));
            }
        }

        public void a(k kVar, String str, int i, int i2, Bundle bundle) {
            m mVar = MediaBrowserServiceCompat.this.e;
            r rVar = new r(this, kVar, str, i, i2, bundle);
            mVar.a(rVar);
        }

        public void a(String str, Bundle bundle, ResultReceiver resultReceiver, k kVar) {
            if (!TextUtils.isEmpty(str) && resultReceiver != null) {
                m mVar = MediaBrowserServiceCompat.this.e;
                t tVar = new t(this, kVar, str, bundle, resultReceiver);
                mVar.a(tVar);
            }
        }
    }

    private interface k {
        void a() throws RemoteException;

        void a(String str, Token token, Bundle bundle) throws RemoteException;

        void a(String str, List<MediaItem> list, Bundle bundle, Bundle bundle2) throws RemoteException;

        IBinder asBinder();
    }

    private static class l implements k {
        final Messenger a;

        l(Messenger messenger) {
            this.a = messenger;
        }

        public void a(String str, Token token, Bundle bundle) throws RemoteException {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putInt("extra_service_version", 2);
            Bundle bundle2 = new Bundle();
            bundle2.putString("data_media_item_id", str);
            bundle2.putParcelable("data_media_session_token", token);
            bundle2.putBundle("data_root_hints", bundle);
            a(1, bundle2);
        }

        public IBinder asBinder() {
            return this.a.getBinder();
        }

        public void a() throws RemoteException {
            a(2, null);
        }

        public void a(String str, List<MediaItem> list, Bundle bundle, Bundle bundle2) throws RemoteException {
            Bundle bundle3 = new Bundle();
            bundle3.putString("data_media_item_id", str);
            bundle3.putBundle("data_options", bundle);
            bundle3.putBundle("data_notify_children_changed_options", bundle2);
            if (list != null) {
                bundle3.putParcelableArrayList("data_media_item_list", list instanceof ArrayList ? (ArrayList) list : new ArrayList(list));
            }
            a(3, bundle3);
        }

        private void a(int i, Bundle bundle) throws RemoteException {
            Message obtain = Message.obtain();
            obtain.what = i;
            obtain.arg1 = 2;
            obtain.setData(bundle);
            this.a.send(obtain);
        }
    }

    private final class m extends Handler {
        private final j a = new j();

        m() {
        }

        public void a(Runnable runnable) {
            if (Thread.currentThread() == getLooper().getThread()) {
                runnable.run();
            } else {
                post(runnable);
            }
        }

        public void handleMessage(Message message) {
            Bundle data = message.getData();
            String str = "data_callback_token";
            String str2 = "data_calling_uid";
            String str3 = "data_calling_pid";
            String str4 = "data_package_name";
            String str5 = "data_root_hints";
            String str6 = "data_result_receiver";
            String str7 = "data_media_item_id";
            switch (message.what) {
                case 1:
                    Bundle bundle = data.getBundle(str5);
                    MediaSessionCompat.ensureClassLoader(bundle);
                    this.a.a(data.getString(str4), data.getInt(str3), data.getInt(str2), bundle, (k) new l(message.replyTo));
                    return;
                case 2:
                    this.a.a(new l(message.replyTo));
                    return;
                case 3:
                    Bundle bundle2 = data.getBundle("data_options");
                    MediaSessionCompat.ensureClassLoader(bundle2);
                    this.a.a(data.getString(str7), androidx.core.app.f.a(data, str), bundle2, (k) new l(message.replyTo));
                    return;
                case 4:
                    this.a.a(data.getString(str7), androidx.core.app.f.a(data, str), (k) new l(message.replyTo));
                    return;
                case 5:
                    this.a.a(data.getString(str7), (ResultReceiver) data.getParcelable(str6), (k) new l(message.replyTo));
                    return;
                case 6:
                    Bundle bundle3 = data.getBundle(str5);
                    MediaSessionCompat.ensureClassLoader(bundle3);
                    this.a.a((k) new l(message.replyTo), data.getString(str4), data.getInt(str3), data.getInt(str2), bundle3);
                    return;
                case 7:
                    this.a.b(new l(message.replyTo));
                    return;
                case 8:
                    Bundle bundle4 = data.getBundle("data_search_extras");
                    MediaSessionCompat.ensureClassLoader(bundle4);
                    this.a.a(data.getString("data_search_query"), bundle4, (ResultReceiver) data.getParcelable(str6), (k) new l(message.replyTo));
                    return;
                case 9:
                    Bundle bundle5 = data.getBundle("data_custom_action_extras");
                    MediaSessionCompat.ensureClassLoader(bundle5);
                    this.a.b(data.getString("data_custom_action"), bundle5, (ResultReceiver) data.getParcelable(str6), new l(message.replyTo));
                    return;
                default:
                    StringBuilder sb = new StringBuilder();
                    sb.append("Unhandled message: ");
                    sb.append(message);
                    sb.append("\n  Service version: ");
                    sb.append(2);
                    sb.append("\n  Client version: ");
                    sb.append(message.arg1);
                    Log.w("MBServiceCompat", sb.toString());
                    return;
            }
        }

        public boolean sendMessageAtTime(Message message, long j) {
            Bundle data = message.getData();
            data.setClassLoader(MediaBrowserCompat.class.getClassLoader());
            data.putInt("data_calling_uid", Binder.getCallingUid());
            data.putInt("data_calling_pid", Binder.getCallingPid());
            return super.sendMessageAtTime(message, j);
        }
    }

    public abstract a a(String str, int i2, Bundle bundle);

    public void a(String str) {
    }

    public void a(String str, Bundle bundle) {
    }

    public abstract void a(String str, i<List<MediaItem>> iVar);

    public void a(String str, i<List<MediaItem>> iVar, Bundle bundle) {
        iVar.a(1);
        a(str, iVar);
    }

    public void b(String str, i<MediaItem> iVar) {
        iVar.a(2);
        iVar.b(null);
    }

    public void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    public IBinder onBind(Intent intent) {
        return this.b.a(intent);
    }

    public void onCreate() {
        super.onCreate();
        int i2 = VERSION.SDK_INT;
        if (i2 >= 28) {
            this.b = new g();
        } else if (i2 >= 26) {
            this.b = new f();
        } else if (i2 >= 23) {
            this.b = new e();
        } else if (i2 >= 21) {
            this.b = new d();
        } else {
            this.b = new h();
        }
        this.b.onCreate();
    }

    public void a(String str, Bundle bundle, i<Bundle> iVar) {
        iVar.b((Bundle) null);
    }

    public void b(String str, Bundle bundle, i<List<MediaItem>> iVar) {
        iVar.a(4);
        iVar.b(null);
    }

    public void a(Token token) {
        if (token == null) {
            throw new IllegalArgumentException("Session token may not be null.");
        } else if (this.f == null) {
            this.f = token;
            this.b.a(token);
        } else {
            throw new IllegalStateException("The session token has already been set.");
        }
    }

    /* access modifiers changed from: 0000 */
    public void b(String str, Bundle bundle, b bVar, ResultReceiver resultReceiver) {
        C0383e eVar = new C0383e(this, str, resultReceiver);
        this.d = bVar;
        b(str, bundle, eVar);
        this.d = null;
        if (!eVar.c()) {
            StringBuilder sb = new StringBuilder();
            sb.append("onSearch must call detach() or sendResult() before returning for query=");
            sb.append(str);
            throw new IllegalStateException(sb.toString());
        }
    }

    public Token a() {
        return this.f;
    }

    /* access modifiers changed from: 0000 */
    public boolean a(String str, int i2) {
        if (str == null) {
            return false;
        }
        for (String equals : getPackageManager().getPackagesForUid(i2)) {
            if (equals.equals(str)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    public void a(String str, b bVar, IBinder iBinder, Bundle bundle) {
        List<C0247Qb> list = (List) bVar.g.get(str);
        if (list == null) {
            list = new ArrayList<>();
        }
        for (C0247Qb qb : list) {
            if (iBinder == qb.a && C0380b.a(bundle, (Bundle) qb.b)) {
                return;
            }
        }
        list.add(new C0247Qb(iBinder, bundle));
        bVar.g.put(str, list);
        a(str, bVar, bundle, (Bundle) null);
        this.d = bVar;
        a(str, bundle);
        this.d = null;
    }

    /* access modifiers changed from: 0000 */
    public boolean a(String str, b bVar, IBinder iBinder) {
        boolean z = true;
        boolean z2 = false;
        if (iBinder == null) {
            try {
                if (bVar.g.remove(str) == null) {
                    z = false;
                }
                return z;
            } finally {
                this.d = bVar;
                a(str);
                this.d = null;
            }
        } else {
            List list = (List) bVar.g.get(str);
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (iBinder == ((C0247Qb) it.next()).a) {
                        it.remove();
                        z2 = true;
                    }
                }
                if (list.size() == 0) {
                    bVar.g.remove(str);
                }
            }
            this.d = bVar;
            a(str);
            this.d = null;
            return z2;
        }
    }

    /* access modifiers changed from: 0000 */
    public void a(String str, b bVar, Bundle bundle, Bundle bundle2) {
        C0381c cVar = new C0381c(this, str, bVar, str, bundle, bundle2);
        this.d = bVar;
        if (bundle == null) {
            a(str, (i<List<MediaItem>>) cVar);
        } else {
            a(str, (i<List<MediaItem>>) cVar, bundle);
        }
        this.d = null;
        if (!cVar.c()) {
            StringBuilder sb = new StringBuilder();
            sb.append("onLoadChildren must call detach() or sendResult() before returning for package=");
            sb.append(bVar.a);
            sb.append(" id=");
            sb.append(str);
            throw new IllegalStateException(sb.toString());
        }
    }

    /* access modifiers changed from: 0000 */
    public List<MediaItem> a(List<MediaItem> list, Bundle bundle) {
        if (list == null) {
            return null;
        }
        int i2 = bundle.getInt(MediaBrowserCompat.EXTRA_PAGE, -1);
        int i3 = bundle.getInt(MediaBrowserCompat.EXTRA_PAGE_SIZE, -1);
        if (i2 == -1 && i3 == -1) {
            return list;
        }
        int i4 = i3 * i2;
        int i5 = i4 + i3;
        if (i2 < 0 || i3 < 1 || i4 >= list.size()) {
            return Collections.emptyList();
        }
        if (i5 > list.size()) {
            i5 = list.size();
        }
        return list.subList(i4, i5);
    }

    /* access modifiers changed from: 0000 */
    public void a(String str, b bVar, ResultReceiver resultReceiver) {
        C0382d dVar = new C0382d(this, str, resultReceiver);
        this.d = bVar;
        b(str, dVar);
        this.d = null;
        if (!dVar.c()) {
            StringBuilder sb = new StringBuilder();
            sb.append("onLoadItem must call detach() or sendResult() before returning for id=");
            sb.append(str);
            throw new IllegalStateException(sb.toString());
        }
    }

    /* access modifiers changed from: 0000 */
    public void a(String str, Bundle bundle, b bVar, ResultReceiver resultReceiver) {
        C0384f fVar = new C0384f(this, str, resultReceiver);
        this.d = bVar;
        a(str, bundle, (i<Bundle>) fVar);
        this.d = null;
        if (!fVar.c()) {
            StringBuilder sb = new StringBuilder();
            sb.append("onCustomAction must call detach() or sendResult() or sendError() before returning for action=");
            sb.append(str);
            sb.append(" extras=");
            sb.append(bundle);
            throw new IllegalStateException(sb.toString());
        }
    }
}
