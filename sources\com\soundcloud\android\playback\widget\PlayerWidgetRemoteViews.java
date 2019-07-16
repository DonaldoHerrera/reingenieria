package com.soundcloud.android.playback.widget;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.soundcloud.android.ia.h;
import com.soundcloud.android.ia.i;
import com.soundcloud.android.ia.l;
import com.soundcloud.android.ia.p;
import com.soundcloud.android.playback.HomescreenWidgetBroadcastReceiver;
import com.soundcloud.android.playback.views.PlaybackRemoteViews;

public class PlayerWidgetRemoteViews extends PlaybackRemoteViews {
    public static final Creator<PlayerWidgetRemoteViews> CREATOR = new z();
    private static final int c = PlayerWidgetRemoteViews.class.hashCode();

    public PlayerWidgetRemoteViews(Context context) {
        super(context.getPackageName(), l.appwidget_player, h.ic_play_arrow_black_36dp, h.ic_pause_black_36dp);
    }

    private PendingIntent b(Context context) {
        return PendingIntent.getActivity(context, i.player_widget_request_id, C4557fja.j(context), 268435456);
    }

    private PendingIntent c(Context context) {
        return a(context, 4, HomescreenWidgetBroadcastReceiver.a(context));
    }

    private PendingIntent d(Context context) {
        return a(context, 8, HomescreenWidgetBroadcastReceiver.b(context));
    }

    private PendingIntent e(Context context) {
        return a(context, 2, HomescreenWidgetBroadcastReceiver.c(context));
    }

    /* access modifiers changed from: 0000 */
    public void a(Context context) {
        b(false);
        b((CharSequence) context.getString(p.widget_touch_to_open));
        a((CharSequence) "");
        a(context, false);
    }

    PlayerWidgetRemoteViews(Parcel parcel) {
        super(parcel);
    }

    /* access modifiers changed from: 0000 */
    public void a(Context context, boolean z) {
        setOnClickPendingIntent(i.toggle_playback, z ? e(context) : b(context));
        setOnClickPendingIntent(i.prev, d(context));
        setOnClickPendingIntent(i.next, c(context));
    }

    private PendingIntent a(Context context, int i, Intent intent) {
        return PendingIntent.getBroadcast(context, i, intent, 268435456);
    }

    /* access modifiers changed from: 0000 */
    public void a(Context context, C3508cda cda, C4928GKa<C3508cda> gKa) {
        setOnClickPendingIntent(i.title_txt, PendingIntent.getActivity(context, c, C4557fja.a(context, !cda.equals(C3508cda.a)), 268435456));
        if (gKa.c()) {
            setOnClickPendingIntent(i.user_txt, Aja.a(context, (C3508cda) gKa.b(), c));
        }
    }

    /* access modifiers changed from: 0000 */
    public void a(Context context, C4928GKa<Boolean> gKa) {
        if (gKa.c()) {
            Intent intent = new Intent(l.a);
            intent.setClass(context, PlayerWidgetReceiver.class);
            intent.putExtra("isLike", !((Boolean) gKa.b()).booleanValue());
            setOnClickPendingIntent(i.btn_like, PendingIntent.getBroadcast(context, c, intent, 268435456));
        }
    }
}
