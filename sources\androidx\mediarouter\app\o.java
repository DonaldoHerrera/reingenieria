package androidx.mediarouter.app;

import android.app.PendingIntent;
import android.app.PendingIntent.CanceledException;
import android.support.v4.media.session.MediaControllerCompat;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;

/* compiled from: MediaRouteControllerDialog */
class o implements OnClickListener {
    final /* synthetic */ u a;

    o(u uVar) {
        this.a = uVar;
    }

    public void onClick(View view) {
        MediaControllerCompat mediaControllerCompat = this.a.T;
        if (mediaControllerCompat != null) {
            PendingIntent sessionActivity = mediaControllerCompat.getSessionActivity();
            if (sessionActivity != null) {
                try {
                    sessionActivity.send();
                    this.a.dismiss();
                } catch (CanceledException unused) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(sessionActivity);
                    sb.append(" was not sent, it had been canceled.");
                    Log.e("MediaRouteCtrlDialog", sb.toString());
                }
            }
        }
    }
}
