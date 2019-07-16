package com.soundcloud.android.playback.widget;

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.widget.RemoteViews;
import com.soundcloud.android.ia.g;
import com.soundcloud.android.ia.i;
import com.soundcloud.android.ia.l;
import com.soundcloud.android.image.C3721b;
import com.soundcloud.android.image.N;
import com.soundcloud.android.main.MainActivity;
import com.soundcloud.android.playback.service.PlayerAppWidgetProvider;
import com.soundcloud.android.tracks.C6185ma;

/* compiled from: PlayerWidgetPresenter */
class w {
    private final Context a;
    private final AppWidgetManager b;
    private final N c;
    private final HPa d;
    private VPa e = C4881Eua.b();
    private ComponentName f;
    private B g;

    w(Context context, AppWidgetManager appWidgetManager, N n, HPa hPa) {
        this.a = context;
        this.b = appWidgetManager;
        this.c = n;
        this.d = hPa;
    }

    private RemoteViews d(Context context) {
        RemoteViews remoteViews = new RemoteViews(context.getPackageName(), l.appwidget_empty_player);
        remoteViews.setOnClickPendingIntent(i.logo, f(context));
        return remoteViews;
    }

    private C5068Kua<Bitmap> e(Context context) {
        return new v(this, context);
    }

    private PendingIntent f(Context context) {
        return PendingIntent.getActivity(context, i.player_widget_request_id, new Intent(context, MainActivity.class).addFlags(67108864), 268435456);
    }

    private void g(Context context) {
        IPa a2 = a(context, this.g.a(), this.g.b()).b(this.d).a((MPa<? extends T>) this.c.a(this.g.a(), this.g.b(), a(context.getResources()), context.getResources().getDimensionPixelSize(g.widget_image_estimated_width), context.getResources().getDimensionPixelSize(g.widget_image_estimated_height))).a(RPa.a());
        C5068Kua e2 = e(context);
        a2.c(e2);
        this.e = e2;
    }

    private void h(Context context) {
        a((RemoteViews) new A().a(this.g).a(context));
    }

    /* access modifiers changed from: 0000 */
    public void b(Context context) {
        this.e.dispose();
        this.g = B.a(context.getResources());
        h(context);
    }

    /* access modifiers changed from: 0000 */
    public void c(Context context) {
        this.e.dispose();
        this.g = B.b(context.getResources());
        h(context);
    }

    /* access modifiers changed from: 0000 */
    public void a(Context context, boolean z) {
        if (this.g != null) {
            a((RemoteViews) new A().a(this.g, z).a(context));
        }
    }

    /* access modifiers changed from: 0000 */
    public void a(Context context, C6185ma maVar) {
        this.e.dispose();
        this.g = B.a(maVar);
        g(context);
    }

    /* access modifiers changed from: private */
    public void a(Context context, Bitmap bitmap) {
        a((RemoteViews) new A().a(this.g).a(bitmap).a(context));
    }

    /* access modifiers changed from: 0000 */
    public void a(Context context) {
        SDb.a("resetting widget", new Object[0]);
        this.e.dispose();
        this.g = null;
        a(d(context));
    }

    private void a(RemoteViews remoteViews) {
        SDb.a("Push update", new Object[0]);
        this.b.updateAppWidget(a(), remoteViews);
    }

    private ComponentName a() {
        if (this.f == null) {
            this.f = new ComponentName(this.a, PlayerAppWidgetProvider.class);
        }
        return this.f;
    }

    private C7531vPa<Bitmap> a(Context context, C3508cda cda, C4928GKa<String> gKa) {
        return this.c.a(cda, gKa, a(context.getResources()), this.d, context.getResources().getDimensionPixelSize(g.widget_image_estimated_width), context.getResources().getDimensionPixelSize(g.widget_image_estimated_height));
    }

    private C3721b a(Resources resources) {
        return C3721b.d(resources);
    }
}
