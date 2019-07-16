package com.google.android.gms.internal.cast;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.MediaMetadataCompat.Builder;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.MediaSessionCompat.Callback;
import android.support.v4.media.session.MediaSessionCompat.Token;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaMetadata;
import com.google.android.gms.cast.MediaQueueItem;
import com.google.android.gms.cast.MediaStatus;
import com.google.android.gms.cast.framework.C0635c;
import com.google.android.gms.cast.framework.C0663o;
import com.google.android.gms.cast.framework.CastOptions;
import com.google.android.gms.cast.framework.ReconnectionService;
import com.google.android.gms.cast.framework.media.C0650e;
import com.google.android.gms.cast.framework.media.C0650e.b;
import com.google.android.gms.cast.framework.media.MediaNotificationService;
import com.google.android.gms.common.images.WebImage;
import com.google.android.gms.common.util.PlatformVersion;

/* renamed from: com.google.android.gms.internal.cast.i reason: case insensitive filesystem */
public final class C0709i implements b {
    private final Context a;
    private final CastOptions b;
    private final Na c;
    private final ComponentName d;
    private final Pa e;
    private final Pa f;
    private final Handler g;
    private final Runnable h;
    /* access modifiers changed from: private */
    public C0650e i;
    private CastDevice j;
    private MediaSessionCompat k;
    private Callback l;
    private boolean m;

    public C0709i(Context context, CastOptions castOptions, Na na) {
        this.a = context;
        this.b = castOptions;
        this.c = na;
        if (this.b.i() == null || TextUtils.isEmpty(this.b.i().i())) {
            this.d = null;
        } else {
            this.d = new ComponentName(this.a, this.b.i().i());
        }
        this.e = new Pa(this.a);
        this.e.a((Ra) new C0713k(this));
        this.f = new Pa(this.a);
        this.f.a((Ra) new C0719n(this));
        this.g = new Ca(Looper.getMainLooper());
        this.h = new C0715l(this);
    }

    private final Builder g() {
        MediaMetadataCompat metadata = this.k.getController().getMetadata();
        if (metadata == null) {
            return new Builder();
        }
        return new Builder(metadata);
    }

    private final void i() {
        if (this.b.i().H() != null) {
            Intent intent = new Intent(this.a, MediaNotificationService.class);
            intent.setPackage(this.a.getPackageName());
            intent.setAction("com.google.android.gms.cast.framework.action.UPDATE_NOTIFICATION");
            this.a.stopService(intent);
        }
    }

    private final void j() {
        if (this.b.F()) {
            this.g.removeCallbacks(this.h);
            Intent intent = new Intent(this.a, ReconnectionService.class);
            intent.setPackage(this.a.getPackageName());
            this.a.stopService(intent);
        }
    }

    public final void a(C0650e eVar, CastDevice castDevice) {
        if (!this.m) {
            CastOptions castOptions = this.b;
            if (castOptions != null && castOptions.i() != null && eVar != null && castDevice != null) {
                this.i = eVar;
                this.i.a((b) this);
                this.j = castDevice;
                if (!PlatformVersion.isAtLeastLollipop()) {
                    ((AudioManager) this.a.getSystemService("audio")).requestAudioFocus(null, 3, 3);
                }
                ComponentName componentName = new ComponentName(this.a, this.b.i().G());
                Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
                intent.setComponent(componentName);
                this.k = new MediaSessionCompat(this.a, "CastMediaSession", componentName, PendingIntent.getBroadcast(this.a, 0, intent, 0));
                this.k.setFlags(3);
                a(0, (MediaInfo) null);
                CastDevice castDevice2 = this.j;
                if (castDevice2 != null && !TextUtils.isEmpty(castDevice2.G())) {
                    this.k.setMetadata(new Builder().putString(MediaMetadataCompat.METADATA_KEY_ALBUM_ARTIST, this.a.getResources().getString(C0663o.cast_casting_to_device, new Object[]{this.j.G()})).build());
                }
                this.l = new C0717m(this);
                this.k.setCallback(this.l);
                this.k.setActive(true);
                this.c.a(this.k);
                this.m = true;
                a(false);
            }
        }
    }

    public final void b() {
        a(false);
    }

    public final void c() {
        a(false);
    }

    public final void d() {
        a(false);
    }

    public final void e() {
        a(false);
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ void f() {
        b(false);
    }

    public final void h() {
    }

    private final void b(boolean z) {
        if (this.b.F()) {
            this.g.removeCallbacks(this.h);
            Intent intent = new Intent(this.a, ReconnectionService.class);
            intent.setPackage(this.a.getPackageName());
            try {
                this.a.startService(intent);
            } catch (IllegalStateException unused) {
                if (z) {
                    this.g.postDelayed(this.h, 1000);
                }
            }
        }
    }

    public final void a(int i2) {
        if (this.m) {
            this.m = false;
            C0650e eVar = this.i;
            if (eVar != null) {
                eVar.b((b) this);
            }
            if (!PlatformVersion.isAtLeastLollipop()) {
                ((AudioManager) this.a.getSystemService("audio")).abandonAudioFocus(null);
            }
            this.c.a(null);
            Pa pa = this.e;
            if (pa != null) {
                pa.a();
            }
            Pa pa2 = this.f;
            if (pa2 != null) {
                pa2.a();
            }
            MediaSessionCompat mediaSessionCompat = this.k;
            if (mediaSessionCompat != null) {
                mediaSessionCompat.setSessionActivity(null);
                this.k.setCallback(null);
                this.k.setMetadata(new Builder().build());
                a(0, (MediaInfo) null);
                this.k.setActive(false);
                this.k.release();
                this.k = null;
            }
            this.i = null;
            this.j = null;
            this.l = null;
            i();
            if (i2 == 0) {
                j();
            }
        }
    }

    public final void a() {
        a(false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:65:0x010d, code lost:
        if (r1.intValue() < (r11.da() - 1)) goto L_0x0113;
     */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0088  */
    public final void a(boolean z) {
        MediaInfo mediaInfo;
        MediaMetadata mediaMetadata;
        boolean z2;
        boolean z3;
        C0650e eVar = this.i;
        if (eVar != null) {
            MediaStatus i2 = eVar.i();
            Token token = null;
            if (i2 == null) {
                mediaInfo = null;
            } else {
                mediaInfo = i2.Z();
            }
            if (mediaInfo == null) {
                mediaMetadata = null;
            } else {
                mediaMetadata = mediaInfo.getMetadata();
            }
            int i3 = 6;
            boolean z4 = false;
            if (!(i2 == null || mediaInfo == null || mediaMetadata == null)) {
                int k2 = this.i.k();
                if (k2 != 1) {
                    if (k2 == 2) {
                        z2 = false;
                        i3 = 3;
                    } else if (k2 == 3) {
                        z2 = false;
                    } else if (k2 == 4) {
                        z2 = false;
                    }
                    a(i3, mediaInfo);
                    if (i3 == 0) {
                        i();
                        j();
                        return;
                    }
                    if (!(this.b.i().H() == null || this.i == null)) {
                        Intent intent = new Intent(this.a, MediaNotificationService.class);
                        intent.putExtra("extra_media_notification_force_update", z);
                        intent.setPackage(this.a.getPackageName());
                        intent.setAction("com.google.android.gms.cast.framework.action.UPDATE_NOTIFICATION");
                        intent.putExtra("extra_media_info", this.i.g());
                        intent.putExtra("extra_remote_media_client_player_state", this.i.k());
                        intent.putExtra("extra_cast_device", this.j);
                        MediaSessionCompat mediaSessionCompat = this.k;
                        if (mediaSessionCompat != null) {
                            token = mediaSessionCompat.getSessionToken();
                        }
                        intent.putExtra("extra_media_session_token", token);
                        MediaStatus i4 = this.i.i();
                        if (i4 != null) {
                            int ea = i4.ea();
                            if (ea == 1 || ea == 2 || ea == 3) {
                                z3 = true;
                            } else {
                                Integer m2 = i4.m(i4.H());
                                if (m2 != null) {
                                    z3 = m2.intValue() > 0;
                                } else {
                                    z3 = false;
                                }
                                intent.putExtra("extra_can_skip_next", z4);
                                intent.putExtra("extra_can_skip_prev", z3);
                            }
                            z4 = true;
                            intent.putExtra("extra_can_skip_next", z4);
                            intent.putExtra("extra_can_skip_prev", z3);
                        }
                        if (VERSION.SDK_INT < 26 || C0635c.a(this.a).e()) {
                            this.a.startService(intent);
                        } else {
                            this.a.startForegroundService(intent);
                        }
                    }
                    if (!z2) {
                        b(true);
                    }
                    return;
                }
                int I = i2.I();
                boolean z5 = this.i.o() && I == 2;
                int Y = i2.Y();
                z2 = Y != 0 && (I == 1 || I == 3);
                if (!z5) {
                    MediaQueueItem a2 = this.i.h().a(this.i.h().a(Y), true);
                    if (a2 != null) {
                        mediaInfo = a2.H();
                        a(i3, mediaInfo);
                        if (i3 == 0) {
                        }
                    }
                    i3 = 0;
                    a(i3, mediaInfo);
                    if (i3 == 0) {
                    }
                }
                i3 = 2;
                a(i3, mediaInfo);
                if (i3 == 0) {
                }
            }
            z2 = false;
            i3 = 0;
            a(i3, mediaInfo);
            if (i3 == 0) {
            }
        }
    }

    private final void a(int i2, MediaInfo mediaInfo) {
        PendingIntent pendingIntent;
        if (i2 == 0) {
            this.k.setPlaybackState(new PlaybackStateCompat.Builder().setState(0, 0, 1.0f).build());
            this.k.setMetadata(new Builder().build());
            return;
        }
        this.k.setPlaybackState(new PlaybackStateCompat.Builder().setState(i2, 0, 1.0f).setActions(mediaInfo.ba() == 2 ? 5 : 512).build());
        MediaSessionCompat mediaSessionCompat = this.k;
        if (this.d == null) {
            pendingIntent = null;
        } else {
            Intent intent = new Intent();
            intent.setComponent(this.d);
            pendingIntent = PendingIntent.getActivity(this.a, 0, intent, 134217728);
        }
        mediaSessionCompat.setSessionActivity(pendingIntent);
        MediaMetadata metadata = mediaInfo.getMetadata();
        String str = "com.google.android.gms.cast.metadata.TITLE";
        this.k.setMetadata(g().putString(MediaMetadataCompat.METADATA_KEY_TITLE, metadata.b(str)).putString(MediaMetadataCompat.METADATA_KEY_DISPLAY_TITLE, metadata.b(str)).putString(MediaMetadataCompat.METADATA_KEY_DISPLAY_SUBTITLE, metadata.b("com.google.android.gms.cast.metadata.SUBTITLE")).putLong(MediaMetadataCompat.METADATA_KEY_DURATION, mediaInfo.aa()).build());
        Uri a2 = a(metadata, 0);
        if (a2 != null) {
            this.e.a(a2);
        } else {
            a((Bitmap) null, 0);
        }
        Uri a3 = a(metadata, 3);
        if (a3 != null) {
            this.f.a(a3);
        } else {
            a((Bitmap) null, 3);
        }
    }

    /* access modifiers changed from: private */
    public final void a(Bitmap bitmap, int i2) {
        if (i2 == 0) {
            String str = MediaMetadataCompat.METADATA_KEY_DISPLAY_ICON;
            if (bitmap != null) {
                this.k.setMetadata(g().putBitmap(str, bitmap).build());
                return;
            }
            Bitmap createBitmap = Bitmap.createBitmap(1, 1, Config.ARGB_8888);
            createBitmap.eraseColor(0);
            this.k.setMetadata(g().putBitmap(str, createBitmap).build());
            return;
        }
        if (i2 == 3) {
            this.k.setMetadata(g().putBitmap(MediaMetadataCompat.METADATA_KEY_ALBUM_ART, bitmap).build());
        }
    }

    private final Uri a(MediaMetadata mediaMetadata, int i2) {
        WebImage webImage = this.b.i().F() != null ? this.b.i().F().a(mediaMetadata, i2) : mediaMetadata.G() ? (WebImage) mediaMetadata.i().get(0) : null;
        if (webImage == null) {
            return null;
        }
        return webImage.getUrl();
    }
}
