package defpackage;

import android.app.Notification.Builder;
import android.app.Notification.MediaStyle;
import android.app.PendingIntent;
import android.media.session.MediaSession;
import android.os.Build.VERSION;
import android.support.v4.media.session.MediaSessionCompat.Token;
import android.widget.RemoteViews;
import androidx.core.app.j;
import androidx.core.app.k.a;
import androidx.core.app.k.e;
import androidx.media.C;
import androidx.media.D;
import androidx.media.E;

/* renamed from: qd reason: default package and case insensitive filesystem */
/* compiled from: NotificationCompat */
public class C1630qd extends e {
    int[] e = null;
    Token f;
    boolean g;
    PendingIntent h;

    public C1630qd a(int... iArr) {
        this.e = iArr;
        return this;
    }

    /* access modifiers changed from: 0000 */
    public RemoteViews b() {
        int i;
        RemoteViews a = a(false, c(), true);
        int size = this.a.b.size();
        int[] iArr = this.e;
        if (iArr == null) {
            i = 0;
        } else {
            i = Math.min(iArr.length, 3);
        }
        a.removeAllViews(C.media_actions);
        if (i > 0) {
            int i2 = 0;
            while (i2 < i) {
                if (i2 < size) {
                    a.addView(C.media_actions, a((a) this.a.b.get(this.e[i2])));
                    i2++;
                } else {
                    throw new IllegalArgumentException(String.format("setShowActionsInCompactView: action %d out of bounds (max %d)", new Object[]{Integer.valueOf(i2), Integer.valueOf(size - 1)}));
                }
            }
        }
        if (this.g) {
            a.setViewVisibility(C.end_padder, 8);
            a.setViewVisibility(C.cancel_action, 0);
            a.setOnClickPendingIntent(C.cancel_action, this.h);
            a.setInt(C.cancel_action, "setAlpha", this.a.a.getResources().getInteger(D.cancel_button_image_alpha));
        } else {
            a.setViewVisibility(C.end_padder, 0);
            a.setViewVisibility(C.cancel_action, 8);
        }
        return a;
    }

    public RemoteViews c(j jVar) {
        if (VERSION.SDK_INT >= 21) {
            return null;
        }
        return b();
    }

    public C1630qd a(Token token) {
        this.f = token;
        return this;
    }

    public C1630qd a(boolean z) {
        if (VERSION.SDK_INT < 21) {
            this.g = z;
        }
        return this;
    }

    /* access modifiers changed from: 0000 */
    public int c() {
        return E.notification_template_media;
    }

    public C1630qd a(PendingIntent pendingIntent) {
        this.h = pendingIntent;
        return this;
    }

    public void a(j jVar) {
        if (VERSION.SDK_INT >= 21) {
            Builder a = jVar.a();
            MediaStyle mediaStyle = new MediaStyle();
            a(mediaStyle);
            a.setStyle(mediaStyle);
        } else if (this.g) {
            jVar.a().setOngoing(true);
        }
    }

    /* access modifiers changed from: 0000 */
    public MediaStyle a(MediaStyle mediaStyle) {
        int[] iArr = this.e;
        if (iArr != null) {
            mediaStyle.setShowActionsInCompactView(iArr);
        }
        Token token = this.f;
        if (token != null) {
            mediaStyle.setMediaSession((MediaSession.Token) token.getToken());
        }
        return mediaStyle;
    }

    private RemoteViews a(a aVar) {
        boolean z = aVar.a() == null;
        RemoteViews remoteViews = new RemoteViews(this.a.a.getPackageName(), E.notification_media_action);
        remoteViews.setImageViewResource(C.action0, aVar.e());
        if (!z) {
            remoteViews.setOnClickPendingIntent(C.action0, aVar.a());
        }
        if (VERSION.SDK_INT >= 15) {
            remoteViews.setContentDescription(C.action0, aVar.i());
        }
        return remoteViews;
    }

    /* access modifiers changed from: 0000 */
    public RemoteViews a() {
        int min = Math.min(this.a.b.size(), 5);
        RemoteViews a = a(false, a(min), false);
        a.removeAllViews(C.media_actions);
        if (min > 0) {
            for (int i = 0; i < min; i++) {
                a.addView(C.media_actions, a((a) this.a.b.get(i)));
            }
        }
        if (this.g) {
            a.setViewVisibility(C.cancel_action, 0);
            a.setInt(C.cancel_action, "setAlpha", this.a.a.getResources().getInteger(D.cancel_button_image_alpha));
            a.setOnClickPendingIntent(C.cancel_action, this.h);
        } else {
            a.setViewVisibility(C.cancel_action, 8);
        }
        return a;
    }

    public RemoteViews b(j jVar) {
        if (VERSION.SDK_INT >= 21) {
            return null;
        }
        return a();
    }

    /* access modifiers changed from: 0000 */
    public int a(int i) {
        return i <= 3 ? E.notification_template_big_media_narrow : E.notification_template_big_media;
    }
}
