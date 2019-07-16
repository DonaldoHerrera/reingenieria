package com.soundcloud.android.playback;

import android.content.ComponentName;
import android.content.Context;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.media.session.MediaControllerCompat;
import android.support.v4.media.session.MediaControllerCompat.TransportControls;
import com.soundcloud.android.playback.players.MediaService;

@EVa(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\u0010\u0012\f\u0012\n \u0012*\u0004\u0018\u00010\r0\r0\u0011X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/soundcloud/android/playback/MediaController;", "", "mediaControllerCallback", "Lcom/soundcloud/android/playback/MediaControllerCallback;", "(Lcom/soundcloud/android/playback/MediaControllerCallback;)V", "mediaBrowser", "Landroid/support/v4/media/MediaBrowserCompat;", "mediaController", "Landroid/support/v4/media/session/MediaControllerCompat;", "getMediaControllerCallback", "()Lcom/soundcloud/android/playback/MediaControllerCallback;", "transportControls", "Lio/reactivex/Single;", "Landroid/support/v4/media/session/MediaControllerCompat$TransportControls;", "getTransportControls", "()Lio/reactivex/Single;", "transportControlsSubject", "Lio/reactivex/subjects/SingleSubject;", "kotlin.jvm.PlatformType", "connect", "", "context", "Landroid/content/Context;", "Companion", "base_release"}, mv = {1, 1, 15})
/* compiled from: MediaController.kt */
public class Fa {
    public static final a a = new a(null);
    /* access modifiers changed from: private */
    public final C6917mVa<TransportControls> b;
    /* access modifiers changed from: private */
    public MediaBrowserCompat c;
    /* access modifiers changed from: private */
    public MediaControllerCompat d;
    private final IPa<TransportControls> e;
    private final Ha f;

    /* compiled from: MediaController.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }
    }

    public Fa(Ha ha) {
        C7471uYa.b(ha, "mediaControllerCallback");
        this.f = ha;
        C6917mVa<TransportControls> k = C6917mVa.k();
        C7471uYa.a((Object) k, "SingleSubject.create<Med…mpat.TransportControls>()");
        this.b = k;
        IPa<TransportControls> d2 = this.b.d();
        C7471uYa.a((Object) d2, "transportControlsSubject.hide()");
        this.e = d2;
    }

    public IPa<TransportControls> b() {
        return this.e;
    }

    public Ha a() {
        return this.f;
    }

    public void a(Context context) {
        C7471uYa.b(context, "context");
        Context applicationContext = context.getApplicationContext();
        MediaBrowserCompat mediaBrowserCompat = new MediaBrowserCompat(applicationContext, new ComponentName(applicationContext, MediaService.class), new Ga(this, applicationContext), null);
        SDb.a("MediaController").d("Request to connect MediaBrowser...", new Object[0]);
        mediaBrowserCompat.connect();
        this.c = mediaBrowserCompat;
    }
}
