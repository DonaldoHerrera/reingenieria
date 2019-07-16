package com.soundcloud.android.playback;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaControllerCompat;
import android.support.v4.media.session.MediaSessionCompat.Token;
import android.support.v4.media.session.PlaybackStateCompat;
import android.view.KeyEvent;
import androidx.core.app.k.d;
import androidx.core.app.k.e;
import androidx.media.session.MediaButtonReceiver;
import com.soundcloud.android.ia.h;
import com.soundcloud.android.ia.p;
import com.soundcloud.android.likes.LikeInNotificationBroadcastReceiver;

@EVa(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0016\u0018\u0000 *2\u00020\u0001:\u0003)*+B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH\u0012J\u0018\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH\u0012J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0011H\u0012J\u0018\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH\u0012J'\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0010\u001a\u00020\u0011H\u0011¢\u0006\u0002\b\u0019J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0002\u001a\u00020\u0003H\u0012J\u0018\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020 H\u0012J\u0018\u0010!\u001a\u00020\"2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020 H\u0012J\u0010\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0016J\f\u0010'\u001a\u00020(*\u00020\u0018H\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006,"}, d2 = {"Lcom/soundcloud/android/playback/PlaybackNotificationProvider;", "Lcom/soundcloud/android/playback/players/mediasession/MediaNotificationProvider;", "context", "Landroid/content/Context;", "metadataOperations", "Lcom/soundcloud/android/playback/mediasession/MetadataOperations;", "(Landroid/content/Context;Lcom/soundcloud/android/playback/mediasession/MetadataOperations;)V", "createLikeAction", "Landroidx/core/app/NotificationCompat$Action;", "urn", "Lcom/soundcloud/android/foundation/domain/Urn;", "createMediaButtonAction", "action", "Lcom/soundcloud/android/playback/PlaybackNotificationProvider$Action;", "createMediaStyle", "Landroidx/media/app/NotificationCompat$MediaStyle;", "sessionToken", "Landroid/support/v4/media/session/MediaSessionCompat$Token;", "createUnlikeAction", "from", "Landroidx/core/app/NotificationCompat$Builder;", "playbackState", "Landroid/support/v4/media/session/PlaybackStateCompat;", "mediaMetadata", "Landroid/support/v4/media/MediaMetadataCompat;", "from$base_release", "getConfiguration", "Lcom/soundcloud/android/playback/players/mediasession/MediaNotificationProvider$MediaSessionConfiguration;", "getContentIntent", "Landroid/app/PendingIntent;", "getMediaButtonActionPendingIntent", "keyCode", "", "getMediaButtonIntent", "Landroid/content/Intent;", "getNotification", "Landroid/app/Notification;", "mediaController", "Landroid/support/v4/media/session/MediaControllerCompat;", "isAdvertisement", "", "Action", "Companion", "MissingMetadataDescriptionException", "base_release"}, mv = {1, 1, 15})
/* renamed from: com.soundcloud.android.playback.qc reason: case insensitive filesystem */
/* compiled from: PlaybackNotificationProvider.kt */
public class C4413qc implements Wma {
    private static final int a = h.ic_notification_cloud;
    public static final b b = new b(null);
    private final Context c;
    private final Fma d;

    /* renamed from: com.soundcloud.android.playback.qc$a */
    /* compiled from: PlaybackNotificationProvider.kt */
    private enum a {
        PREVIOUS(88, h.notifications_previous, p.previous),
        PAUSE(85, h.notifications_pause, p.pause),
        PLAY(85, h.notifications_play, p.play),
        NEXT(87, h.notifications_next, p.next),
        LIKE(81, h.ic_notification_heart_32_default, p.btn_like),
        UNLIKE(69, h.ic_notification_heart_32_active, p.btn_unlike);
        
        private final int h;
        private final int i;
        private final int j;

        private a(int i2, int i3, int i4) {
            this.h = i2;
            this.i = i3;
            this.j = i4;
        }

        public final int a() {
            return this.i;
        }

        public final int b() {
            return this.h;
        }

        public final int c() {
            return this.j;
        }
    }

    /* renamed from: com.soundcloud.android.playback.qc$b */
    /* compiled from: PlaybackNotificationProvider.kt */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(C7264rYa rya) {
            this();
        }
    }

    /* renamed from: com.soundcloud.android.playback.qc$c */
    /* compiled from: PlaybackNotificationProvider.kt */
    private static final class c extends IllegalStateException {
        public c(String str) {
            C7471uYa.b(str, "message");
            super(str);
        }
    }

    public C4413qc(Context context, Fma fma) {
        C7471uYa.b(context, "context");
        C7471uYa.b(fma, "metadataOperations");
        this.c = context;
        this.d = fma;
    }

    public void a() {
        defpackage.Wma.a.a(this);
    }

    public void b(MediaControllerCompat mediaControllerCompat) {
        C7471uYa.b(mediaControllerCompat, "mediaController");
        defpackage.Wma.a.a(this, mediaControllerCompat);
    }

    public Notification a(MediaControllerCompat mediaControllerCompat) {
        C7471uYa.b(mediaControllerCompat, "mediaController");
        MediaMetadataCompat metadata = mediaControllerCompat.getMetadata();
        StringBuilder sb = new StringBuilder();
        sb.append("getNotification() called, metadata is ");
        sb.append(metadata);
        sb.append(" and for state ");
        sb.append(mediaControllerCompat.getPlaybackState());
        SDb.c(sb.toString(), new Object[0]);
        if (metadata != null) {
            PlaybackStateCompat playbackState = mediaControllerCompat.getPlaybackState();
            Token sessionToken = mediaControllerCompat.getSessionToken();
            C7471uYa.a((Object) sessionToken, "mediaController.sessionToken");
            Notification a2 = a(playbackState, metadata, sessionToken).a();
            C7471uYa.a((Object) a2, "from(mediaController.pla…ler.sessionToken).build()");
            return a2;
        }
        throw new c("Missing metadata for notification");
    }

    public defpackage.Wma.b b() {
        return new defpackage.Wma.b(1, Integer.valueOf(1));
    }

    private androidx.core.app.k.a b(Context context, C3508cda cda) {
        return new androidx.core.app.k.a(a.UNLIKE.a(), context.getString(a.UNLIKE.c()), PendingIntent.getBroadcast(context, a.UNLIKE.b(), LikeInNotificationBroadcastReceiver.a.b(context, cda), 134217728));
    }

    public d a(PlaybackStateCompat playbackStateCompat, MediaMetadataCompat mediaMetadataCompat, Token token) {
        C7471uYa.b(mediaMetadataCompat, "mediaMetadata");
        C7471uYa.b(token, "sessionToken");
        boolean z = playbackStateCompat != null && (playbackStateCompat.getState() == 3 || playbackStateCompat.getState() == 6);
        Boolean b2 = this.d.b(mediaMetadataCompat);
        C3508cda a2 = this.d.a(mediaMetadataCompat);
        if (a2 != null) {
            MediaDescriptionCompat description = mediaMetadataCompat.getDescription();
            StringBuilder sb = new StringBuilder();
            sb.append("Getting notification for ");
            sb.append(a2);
            sb.append(": playing = ");
            sb.append(z);
            sb.append(" liked = ");
            sb.append(b2);
            SDb.c(sb.toString(), new Object[0]);
            d dVar = new d(this.c, "channel_playback");
            C7471uYa.a((Object) description, "mediaDescription");
            dVar.c(description.getTitle());
            dVar.b(description.getSubtitle());
            dVar.d(description.getDescription());
            dVar.e(a);
            dVar.a(description.getIconBitmap());
            dVar.a(a(this.c));
            dVar.a("transport");
            dVar.d(false);
            dVar.a(true);
            dVar.f(1);
            dVar.b(a(this.c, 86));
            dVar.a(a(this.c, a.PREVIOUS));
            dVar.a(a(this.c, z ? a.PAUSE : a.PLAY));
            dVar.a(a(this.c, a.NEXT));
            C1630qd a3 = a(this.c, token);
            if (a(mediaMetadataCompat)) {
                a3.a(0, 1, 2);
                dVar.a((e) a3);
            } else if (b2 != null) {
                dVar.a(b2.booleanValue() ? b(this.c, a2) : a(this.c, a2));
                a3.a(1, 2, 3);
                dVar.a((e) a3);
            } else {
                throw new IllegalArgumentException("You must provide a value for liked state when requesting a notification for non-ads!");
            }
            C7471uYa.a((Object) dVar, "builder");
            return dVar;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    private Intent b(Context context, int i) {
        Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
        intent.setPackage(context.getPackageName());
        intent.putExtra("android.intent.extra.KEY_EVENT", new KeyEvent(0, i));
        intent.setClass(context, MediaButtonReceiver.class);
        return intent;
    }

    private boolean a(MediaMetadataCompat mediaMetadataCompat) {
        return mediaMetadataCompat.getLong(MediaMetadataCompat.METADATA_KEY_ADVERTISEMENT) > 0;
    }

    private C1630qd a(Context context, Token token) {
        C1630qd qdVar = new C1630qd();
        qdVar.a(true);
        qdVar.a(a(context, 86));
        qdVar.a(token);
        C7471uYa.a((Object) qdVar, "MediaStyle()\n           …ediaSession(sessionToken)");
        return qdVar;
    }

    private androidx.core.app.k.a a(Context context, C3508cda cda) {
        return new androidx.core.app.k.a(a.LIKE.a(), context.getString(a.LIKE.c()), PendingIntent.getBroadcast(context, a.LIKE.b(), LikeInNotificationBroadcastReceiver.a.a(context, cda), 134217728));
    }

    private androidx.core.app.k.a a(Context context, a aVar) {
        return new androidx.core.app.k.a(aVar.a(), context.getString(aVar.c()), a(context, aVar.b()));
    }

    private PendingIntent a(Context context, int i) {
        PendingIntent broadcast = PendingIntent.getBroadcast(context, i, b(context, i), 134217728);
        C7471uYa.a((Object) broadcast, "PendingIntent.getBroadca…tent.FLAG_UPDATE_CURRENT)");
        return broadcast;
    }

    private PendingIntent a(Context context) {
        PendingIntent activity = PendingIntent.getActivity(context, 0, C4557fja.l(context), 268435456);
        C7471uYa.a((Object) activity, "PendingIntent.getActivit…_CANCEL_CURRENT\n        )");
        return activity;
    }
}
