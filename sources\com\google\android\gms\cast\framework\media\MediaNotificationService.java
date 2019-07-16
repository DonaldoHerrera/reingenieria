package com.google.android.gms.cast.framework.media;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.v4.media.session.MediaSessionCompat.Token;
import android.text.TextUtils;
import androidx.core.app.k.a.C0005a;
import androidx.core.app.k.d;
import androidx.core.app.k.e;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaMetadata;
import com.google.android.gms.cast.framework.C0633a;
import com.google.android.gms.cast.framework.C0635c;
import com.google.android.gms.common.images.WebImage;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.internal.cast.C0710ia;
import com.google.android.gms.internal.cast.Pa;
import com.google.android.gms.internal.cast.Ra;
import com.google.android.gms.internal.cast.X;
import java.util.ArrayList;
import java.util.List;

public class MediaNotificationService extends Service {
    /* access modifiers changed from: private */
    public static final C0710ia a = new C0710ia("MediaNotificationService");
    private NotificationOptions b;
    private C0646a c;
    private ComponentName d;
    private ComponentName e;
    private List<String> f = new ArrayList();
    private int[] g;
    private A h;
    private long i;
    private Pa j;
    private ImageHints k;
    private Resources l;
    private C0633a m;
    private b n;
    /* access modifiers changed from: private */
    public a o;
    /* access modifiers changed from: private */
    public Notification p;
    /* access modifiers changed from: private */
    public C0635c q;
    private final BroadcastReceiver r = new F(this);

    private static class a {
        public final Uri a;
        public Bitmap b;

        public a(WebImage webImage) {
            Uri uri;
            if (webImage == null) {
                uri = null;
            } else {
                uri = webImage.getUrl();
            }
            this.a = uri;
        }
    }

    private static class b {
        public final Token a;
        public final boolean b;
        public final int c;
        public final String d;
        public final String e;
        public final boolean f;
        public final boolean g;

        public b(boolean z, int i, String str, String str2, Token token, boolean z2, boolean z3) {
            this.b = z;
            this.c = i;
            this.d = str;
            this.e = str2;
            this.a = token;
            this.f = z2;
            this.g = z3;
        }
    }

    private final void a(d dVar, String str) {
        char c2;
        int i2;
        int i3;
        d dVar2 = dVar;
        String str2 = str;
        String str3 = "com.google.android.gms.cast.framework.action.FORWARD";
        String str4 = "com.google.android.gms.cast.framework.action.TOGGLE_PLAYBACK";
        String str5 = "com.google.android.gms.cast.framework.action.STOP_CASTING";
        String str6 = "com.google.android.gms.cast.framework.action.SKIP_PREV";
        String str7 = "com.google.android.gms.cast.framework.action.SKIP_NEXT";
        String str8 = "com.google.android.gms.cast.framework.action.REWIND";
        switch (str.hashCode()) {
            case -1699820260:
                if (str2.equals(str8)) {
                    c2 = 4;
                    break;
                }
            case -945151566:
                if (str2.equals(str7)) {
                    c2 = 1;
                    break;
                }
            case -945080078:
                if (str2.equals(str6)) {
                    c2 = 2;
                    break;
                }
            case -668151673:
                if (str2.equals(str5)) {
                    c2 = 5;
                    break;
                }
            case -124479363:
                if (str2.equals("com.google.android.gms.cast.framework.action.DISCONNECT")) {
                    c2 = 6;
                    break;
                }
            case 235550565:
                if (str2.equals(str4)) {
                    c2 = 0;
                    break;
                }
            case 1362116196:
                if (str2.equals(str3)) {
                    c2 = 3;
                    break;
                }
            default:
                c2 = 65535;
                break;
        }
        String str9 = "googlecast-extra_skip_step_ms";
        PendingIntent pendingIntent = null;
        switch (c2) {
            case 0:
                b bVar = this.n;
                int i4 = bVar.c;
                boolean z = bVar.b;
                if (i4 == 2) {
                    i3 = this.b.ia();
                    i2 = this.b.ja();
                } else {
                    i3 = this.b.Z();
                    i2 = this.b.ma();
                }
                if (!z) {
                    i3 = this.b.aa();
                }
                if (!z) {
                    i2 = this.b.na();
                }
                Intent intent = new Intent(str4);
                intent.setComponent(this.d);
                dVar2.a(new C0005a(i3, this.l.getString(i2), PendingIntent.getBroadcast(this, 0, intent, 0)).a());
                return;
            case 1:
                if (this.n.f) {
                    Intent intent2 = new Intent(str7);
                    intent2.setComponent(this.d);
                    pendingIntent = PendingIntent.getBroadcast(this, 0, intent2, 0);
                }
                dVar2.a(new C0005a(this.b.ea(), this.l.getString(this.b.oa()), pendingIntent).a());
                return;
            case 2:
                if (this.n.g) {
                    Intent intent3 = new Intent(str6);
                    intent3.setComponent(this.d);
                    pendingIntent = PendingIntent.getBroadcast(this, 0, intent3, 0);
                }
                dVar2.a(new C0005a(this.b.fa(), this.l.getString(this.b.pa()), pendingIntent).a());
                return;
            case 3:
                long j2 = this.i;
                Intent intent4 = new Intent(str3);
                intent4.setComponent(this.d);
                intent4.putExtra(str9, j2);
                PendingIntent broadcast = PendingIntent.getBroadcast(this, 0, intent4, 134217728);
                int Y = this.b.Y();
                int qa = this.b.qa();
                if (j2 == 10000) {
                    Y = this.b.I();
                    qa = this.b.T();
                } else if (j2 == 30000) {
                    Y = this.b.X();
                    qa = this.b.V();
                }
                dVar2.a(new C0005a(Y, this.l.getString(qa), broadcast).a());
                return;
            case 4:
                long j3 = this.i;
                Intent intent5 = new Intent(str8);
                intent5.setComponent(this.d);
                intent5.putExtra(str9, j3);
                PendingIntent broadcast2 = PendingIntent.getBroadcast(this, 0, intent5, 134217728);
                int da = this.b.da();
                int ra = this.b.ra();
                if (j3 == 10000) {
                    da = this.b.ba();
                    ra = this.b.sa();
                } else if (j3 == 30000) {
                    da = this.b.ca();
                    ra = this.b.ta();
                }
                dVar2.a(new C0005a(da, this.l.getString(ra), broadcast2).a());
                return;
            case 5:
            case 6:
                Intent intent6 = new Intent(str5);
                intent6.setComponent(this.d);
                dVar2.a(new C0005a(this.b.H(), this.l.getString(this.b.ua()), PendingIntent.getBroadcast(this, 0, intent6, 0)).a());
                return;
            default:
                a.b("Action: %s is not a pre-defined action.", str2);
                return;
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x011a  */
    public final void b() {
        Bitmap bitmap;
        int[] iArr;
        boolean z;
        boolean z2;
        if (this.n != null) {
            a aVar = this.o;
            PendingIntent pendingIntent = null;
            if (aVar == null) {
                bitmap = null;
            } else {
                bitmap = aVar.b;
            }
            d dVar = new d(this, "cast_media_notification");
            dVar.a(bitmap);
            dVar.e(this.b.ha());
            dVar.c((CharSequence) this.n.d);
            dVar.b((CharSequence) this.l.getString(this.b.F(), new Object[]{this.n.e}));
            dVar.c(true);
            dVar.d(false);
            dVar.f(1);
            if (this.e != null) {
                Intent intent = new Intent();
                intent.putExtra("targetActivity", this.e);
                intent.setAction(this.e.flattenToString());
                pendingIntent = PendingIntent.getBroadcast(this, 1, intent, 134217728);
            }
            if (pendingIntent != null) {
                dVar.a(pendingIntent);
            }
            if (this.h != null) {
                a.c("mActionsProvider != null", new Object[0]);
                try {
                    List<NotificationAction> v = this.h.v();
                    int[] o2 = this.h.o();
                    if (v == null || v.isEmpty()) {
                        a.b(String.valueOf(C0649d.class.getSimpleName()).concat(" doesn't provide any action."), new Object[0]);
                    } else if (v.size() > 5) {
                        a.b(String.valueOf(C0649d.class.getSimpleName()).concat(" provides more than 5 actions."), new Object[0]);
                    } else {
                        z = true;
                        if (z) {
                            int size = v.size();
                            if (o2 == null || o2.length == 0) {
                                a.b(String.valueOf(C0649d.class.getSimpleName()).concat(" doesn't provide any actions for compact view."), new Object[0]);
                            } else {
                                int length = o2.length;
                                int i2 = 0;
                                while (i2 < length) {
                                    int i3 = o2[i2];
                                    if (i3 < 0 || i3 >= size) {
                                        a.b(String.valueOf(C0649d.class.getSimpleName()).concat("provides a compact view action whose index is out of bounds."), new Object[0]);
                                    } else {
                                        i2++;
                                    }
                                }
                                z2 = true;
                                if (z2) {
                                    iArr = (int[]) o2.clone();
                                    for (NotificationAction notificationAction : v) {
                                        new com.google.android.gms.cast.framework.media.NotificationAction.a().a(notificationAction.i());
                                        String i4 = notificationAction.i();
                                        if (i4.equals("com.google.android.gms.cast.framework.action.TOGGLE_PLAYBACK") || i4.equals("com.google.android.gms.cast.framework.action.SKIP_NEXT") || i4.equals("com.google.android.gms.cast.framework.action.SKIP_PREV") || i4.equals("com.google.android.gms.cast.framework.action.FORWARD") || i4.equals("com.google.android.gms.cast.framework.action.REWIND") || i4.equals("com.google.android.gms.cast.framework.action.STOP_CASTING")) {
                                            a(dVar, notificationAction.i());
                                        } else {
                                            Intent intent2 = new Intent(notificationAction.i());
                                            intent2.setComponent(this.d);
                                            dVar.a(new C0005a(notificationAction.G(), notificationAction.F(), PendingIntent.getBroadcast(this, 0, intent2, 0)).a());
                                        }
                                    }
                                }
                            }
                            z2 = false;
                            if (z2) {
                            }
                        }
                        return;
                    }
                    z = false;
                    if (z) {
                    }
                    return;
                } catch (RemoteException e2) {
                    a.b(e2, "Unable to call %s on %s.", "getNotificationActions", A.class.getSimpleName());
                    return;
                }
            } else {
                for (String a2 : this.f) {
                    a(dVar, a2);
                }
                iArr = this.g;
            }
            if (VERSION.SDK_INT >= 21) {
                C1630qd qdVar = new C1630qd();
                qdVar.a(iArr);
                qdVar.a(this.n.a);
                dVar.a((e) qdVar);
            }
            this.p = dVar.a();
            if (!this.q.e()) {
                startForeground(1, this.p);
            } else {
                stopForeground(true);
            }
        }
    }

    public IBinder onBind(Intent intent) {
        return null;
    }

    public void onCreate() {
        this.q = C0635c.a((Context) this);
        CastMediaOptions i2 = this.q.a().i();
        this.b = i2.H();
        this.c = i2.F();
        this.l = getResources();
        this.d = new ComponentName(getApplicationContext(), i2.G());
        if (!TextUtils.isEmpty(this.b.ka())) {
            this.e = new ComponentName(getApplicationContext(), this.b.ka());
        } else {
            this.e = null;
        }
        this.h = this.b.va();
        if (this.h == null) {
            this.f.addAll(this.b.i());
            this.g = (int[]) this.b.G().clone();
        } else {
            this.g = null;
        }
        this.i = this.b.ga();
        int dimensionPixelSize = this.l.getDimensionPixelSize(this.b.la());
        this.k = new ImageHints(1, dimensionPixelSize, dimensionPixelSize);
        this.j = new Pa(getApplicationContext(), this.k);
        this.m = new H(this);
        this.q.a(this.m);
        ComponentName componentName = this.e;
        if (componentName != null) {
            registerReceiver(this.r, new IntentFilter(componentName.flattenToString()));
        }
        if (PlatformVersion.isAtLeastO()) {
            NotificationManager notificationManager = (NotificationManager) getSystemService(NotificationManager.class);
            NotificationChannel notificationChannel = new NotificationChannel("cast_media_notification", "Cast", 2);
            notificationChannel.setShowBadge(false);
            notificationManager.createNotificationChannel(notificationChannel);
        }
    }

    public void onDestroy() {
        Pa pa = this.j;
        if (pa != null) {
            pa.a();
        }
        if (this.e != null) {
            try {
                unregisterReceiver(this.r);
            } catch (IllegalArgumentException e2) {
                a.b(e2, "Unregistering trampoline BroadcastReceiver failed", new Object[0]);
            }
        }
        ((NotificationManager) getSystemService("notification")).cancel(1);
        this.q.b(this.m);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00aa, code lost:
        if ((r1 != null && r7.b == r1.b && r7.c == r1.c && com.google.android.gms.internal.cast.X.a(r7.d, r1.d) && com.google.android.gms.internal.cast.X.a(r7.e, r1.e) && r7.f == r1.f && r7.g == r1.g) == false) goto L_0x00ac;
     */
    public int onStartCommand(Intent intent, int i2, int i3) {
        Intent intent2 = intent;
        if (intent2 != null) {
            if ("com.google.android.gms.cast.framework.action.UPDATE_NOTIFICATION".equals(intent.getAction())) {
                MediaInfo mediaInfo = (MediaInfo) intent2.getParcelableExtra("extra_media_info");
                boolean z = false;
                if (mediaInfo != null) {
                    MediaMetadata metadata = mediaInfo.getMetadata();
                    if (metadata != null) {
                        int intExtra = intent2.getIntExtra("extra_remote_media_client_player_state", 0);
                        if (intExtra != 0) {
                            CastDevice castDevice = (CastDevice) intent2.getParcelableExtra("extra_cast_device");
                            if (castDevice != null) {
                                boolean z2 = intExtra == 2;
                                b bVar = r9;
                                b bVar2 = new b(z2, mediaInfo.ba(), metadata.b("com.google.android.gms.cast.metadata.TITLE"), castDevice.G(), (Token) intent2.getParcelableExtra("extra_media_session_token"), intent2.getBooleanExtra("extra_can_skip_next", false), intent2.getBooleanExtra("extra_can_skip_prev", false));
                                if (!intent2.getBooleanExtra("extra_media_notification_force_update", false)) {
                                    b bVar3 = this.n;
                                }
                                this.n = bVar;
                                b();
                                C0646a aVar = this.c;
                                WebImage webImage = aVar != null ? aVar.a(metadata, this.k) : metadata.G() ? (WebImage) metadata.i().get(0) : null;
                                a aVar2 = new a(webImage);
                                a aVar3 = this.o;
                                if (aVar3 != null && X.a(aVar2.a, aVar3.a)) {
                                    z = true;
                                }
                                if (!z) {
                                    this.j.a((Ra) new G(this, aVar2));
                                    this.j.a(aVar2.a);
                                }
                                z = true;
                            }
                        }
                    }
                }
                if (!z) {
                    stopForeground(true);
                }
            }
        }
        return 2;
    }
}
