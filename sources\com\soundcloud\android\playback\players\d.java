package com.soundcloud.android.playback.players;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.support.v4.media.session.MediaControllerCompat;
import android.support.v4.media.session.MediaSessionCompat.Token;

@EVa(d1 = {"\u0000U\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007*\u0001\u000e\b\u0016\u0018\u0000 %2\u00020\u0001:\u0001%B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u000b\u001a\u00020\fH\u0012J\r\u0010\u001a\u001a\u00020\fH\u0011¢\u0006\u0002\b\u001bJ\b\u0010\u001c\u001a\u00020\u001dH\u0016J\u0012\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0017H\u0012J\b\u0010!\u001a\u00020\u001dH\u0012J\b\u0010\"\u001a\u00020\u001dH\u0012J\b\u0010#\u001a\u00020\u001dH\u0012J\b\u0010$\u001a\u00020\u001dH\u0012R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0004\n\u0002\u0010\u000fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0010\u001a\u00020\u00118RX\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u000e¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Lcom/soundcloud/android/playback/players/MediaNotificationManager;", "", "mediaService", "Lcom/soundcloud/android/playback/players/MediaService;", "mediaNotificationProvider", "Lcom/soundcloud/android/playback/players/mediasession/MediaNotificationProvider;", "notificationManager", "Landroid/app/NotificationManager;", "logger", "Lcom/soundcloud/android/playback/core/Logger;", "(Lcom/soundcloud/android/playback/players/MediaService;Lcom/soundcloud/android/playback/players/mediasession/MediaNotificationProvider;Landroid/app/NotificationManager;Lcom/soundcloud/android/playback/core/Logger;)V", "mediaController", "Landroid/support/v4/media/session/MediaControllerCompat;", "mediaControllerCallback", "com/soundcloud/android/playback/players/MediaNotificationManager$mediaControllerCallback$1", "Lcom/soundcloud/android/playback/players/MediaNotificationManager$mediaControllerCallback$1;", "notificationId", "", "getNotificationId", "()I", "notificationId$delegate", "Lkotlin/Lazy;", "sessionToken", "Landroid/support/v4/media/session/MediaSessionCompat$Token;", "createNotification", "Landroid/app/Notification;", "getMediaController", "getMediaController$players_release", "init", "", "isDifferentSession", "", "token", "startNotification", "stopNotification", "updateNotification", "updateSessionToken", "Companion", "players_release"}, mv = {1, 1, 15})
/* compiled from: MediaNotificationManager.kt */
public class d {
    static final /* synthetic */ DZa[] a = {HYa.a((DYa) new EYa(HYa.a(d.class), "notificationId", "getNotificationId()I"))};
    public static final a b = new a(null);
    private final C7744yVa c = BVa.a(new f(this));
    private Token d;
    /* access modifiers changed from: private */
    public MediaControllerCompat e;
    private final e f = new e(this);
    /* access modifiers changed from: private */
    public final MediaService g;
    /* access modifiers changed from: private */
    public final Wma h;
    private final NotificationManager i;
    /* access modifiers changed from: private */
    public final com.soundcloud.android.playback.core.d j;

    /* compiled from: MediaNotificationManager.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }
    }

    public d(MediaService mediaService, Wma wma, NotificationManager notificationManager, com.soundcloud.android.playback.core.d dVar) {
        C7471uYa.b(mediaService, "mediaService");
        C7471uYa.b(wma, "mediaNotificationProvider");
        C7471uYa.b(notificationManager, "notificationManager");
        C7471uYa.b(dVar, "logger");
        this.g = mediaService;
        this.h = wma;
        this.i = notificationManager;
        this.j = dVar;
    }

    private int c() {
        C7744yVa yva = this.c;
        DZa dZa = a[0];
        return ((Number) yva.getValue()).intValue();
    }

    /* access modifiers changed from: private */
    public void d() {
        this.j.b("MediaNotificationManager", "startNotification()");
        MediaControllerCompat mediaControllerCompat = this.e;
        if (mediaControllerCompat != null) {
            this.h.b(mediaControllerCompat);
            this.g.a(c(), a(mediaControllerCompat));
            return;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    /* access modifiers changed from: private */
    public void e() {
        this.j.a("MediaNotificationManager", "stopNotification()");
        this.h.a();
        this.i.cancel(c());
        this.g.a(true);
    }

    /* access modifiers changed from: private */
    public void f() {
        this.j.b("MediaNotificationManager", "updateNotification()");
        MediaControllerCompat mediaControllerCompat = this.e;
        if (mediaControllerCompat != null) {
            this.i.notify(c(), a(mediaControllerCompat));
            return;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    /* access modifiers changed from: private */
    public void g() {
        Token a2 = this.g.a();
        if (a(a2)) {
            MediaControllerCompat mediaControllerCompat = this.e;
            if (mediaControllerCompat != null) {
                mediaControllerCompat.unregisterCallback(this.f);
            }
            this.d = a2;
            this.e = a();
            MediaControllerCompat mediaControllerCompat2 = this.e;
            if (mediaControllerCompat2 != null) {
                mediaControllerCompat2.registerCallback(this.f);
                return;
            }
            throw new IllegalArgumentException("Required value was null.");
        }
    }

    public MediaControllerCompat a() {
        MediaService mediaService = this.g;
        Token token = this.d;
        if (token != null) {
            return new MediaControllerCompat((Context) mediaService, token);
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public void b() {
        this.j.a("MediaNotificationManager", "init() called: registering callback into MediaController");
        g();
        this.i.cancel(c());
    }

    private boolean a(Token token) {
        if (this.d == null && token != null) {
            return true;
        }
        Token token2 = this.d;
        return token2 != null && (C7471uYa.a((Object) token2, (Object) token) ^ true);
    }

    private Notification a(MediaControllerCompat mediaControllerCompat) {
        return this.h.a(mediaControllerCompat);
    }
}
