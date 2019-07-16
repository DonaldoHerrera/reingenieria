package defpackage;

import android.app.Notification;
import android.support.v4.media.session.MediaControllerCompat;

@EVa(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0001\u000bJ\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\tH\u0016¨\u0006\f"}, d2 = {"Lcom/soundcloud/android/playback/players/mediasession/MediaNotificationProvider;", "", "getConfiguration", "Lcom/soundcloud/android/playback/players/mediasession/MediaNotificationProvider$MediaSessionConfiguration;", "getNotification", "Landroid/app/Notification;", "mediaController", "Landroid/support/v4/media/session/MediaControllerCompat;", "onNotificationStart", "", "onNotificationStop", "MediaSessionConfiguration", "players_release"}, mv = {1, 1, 15})
/* renamed from: Wma reason: default package */
/* compiled from: MediaNotificationProvider.kt */
public interface Wma {

    /* renamed from: Wma$a */
    /* compiled from: MediaNotificationProvider.kt */
    public static final class a {
        public static void a(Wma wma) {
        }

        public static void a(Wma wma, MediaControllerCompat mediaControllerCompat) {
            C7471uYa.b(mediaControllerCompat, "mediaController");
        }
    }

    /* renamed from: Wma$b */
    /* compiled from: MediaNotificationProvider.kt */
    public static final class b {
        private final int a;
        private final Integer b;

        public b(int i, Integer num) {
            this.a = i;
            this.b = num;
        }

        public final int a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof b) {
                    b bVar = (b) obj;
                    if (!(this.a == bVar.a) || !C7471uYa.a((Object) this.b, (Object) bVar.b)) {
                        return false;
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            int i = this.a * 31;
            Integer num = this.b;
            return i + (num != null ? num.hashCode() : 0);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("MediaSessionConfiguration(notificationId=");
            sb.append(this.a);
            sb.append(", ratingStyle=");
            sb.append(this.b);
            sb.append(")");
            return sb.toString();
        }

        public /* synthetic */ b(int i, Integer num, int i2, C7264rYa rya) {
            if ((i2 & 2) != 0) {
                num = null;
            }
            this(i, num);
        }
    }

    Notification a(MediaControllerCompat mediaControllerCompat);

    void a();

    b b();

    void b(MediaControllerCompat mediaControllerCompat);
}
