package com.soundcloud.android.playback.widget;

import android.content.Context;
import android.graphics.Bitmap;
import com.soundcloud.android.ia.h;
import com.soundcloud.android.ia.i;

/* compiled from: PlayerWidgetRemoteViewsBuilder */
class A {
    private C4928GKa<B> a = C4928GKa.a();
    private C4928GKa<Boolean> b = C4928GKa.a();
    private C4928GKa<Bitmap> c;

    A() {
    }

    private void b(Context context, PlayerWidgetRemoteViews playerWidgetRemoteViews) {
        B b2 = (B) this.a.b();
        playerWidgetRemoteViews.b((CharSequence) b2.getTitle());
        playerWidgetRemoteViews.a((CharSequence) b2.f());
        a(playerWidgetRemoteViews, b2);
        playerWidgetRemoteViews.a(context, b2.i());
        playerWidgetRemoteViews.a(context, b2.a(), b2.g());
        playerWidgetRemoteViews.a(context, b2.j());
    }

    public PlayerWidgetRemoteViews a(Context context) {
        PlayerWidgetRemoteViews playerWidgetRemoteViews = new PlayerWidgetRemoteViews(context);
        if (!this.b.c() && !this.a.c()) {
            a(context, playerWidgetRemoteViews);
        }
        if (this.b.c()) {
            a(playerWidgetRemoteViews);
        }
        if (this.a.c()) {
            b(context, playerWidgetRemoteViews);
        }
        C4928GKa<Bitmap> gKa = this.c;
        if (gKa != null) {
            if (gKa.c()) {
                playerWidgetRemoteViews.setImageViewBitmap(i.icon, (Bitmap) this.c.b());
            } else {
                playerWidgetRemoteViews.setImageViewResource(i.icon, h.appwidget_artwork_placeholder);
            }
        }
        return playerWidgetRemoteViews;
    }

    private void a(PlayerWidgetRemoteViews playerWidgetRemoteViews, B b2) {
        playerWidgetRemoteViews.a(b2.j().c());
        b2.j().a((C7733yKa<? super T>) new h<Object>(playerWidgetRemoteViews));
    }

    static /* synthetic */ void a(PlayerWidgetRemoteViews playerWidgetRemoteViews, Boolean bool) {
        playerWidgetRemoteViews.setImageViewResource(i.btn_like, bool.booleanValue() ? h.widget_like_orange : h.widget_like_grey);
    }

    private void a(PlayerWidgetRemoteViews playerWidgetRemoteViews) {
        playerWidgetRemoteViews.b(((Boolean) this.b.b()).booleanValue());
    }

    private void a(Context context, PlayerWidgetRemoteViews playerWidgetRemoteViews) {
        playerWidgetRemoteViews.a(context);
    }

    /* access modifiers changed from: 0000 */
    public A a(B b2) {
        this.a = C4928GKa.b(b2);
        if (this.a.c() && !((B) this.a.b()).h()) {
            this.c = C4928GKa.a();
        }
        return this;
    }

    /* access modifiers changed from: 0000 */
    public A a(Bitmap bitmap) {
        this.c = C4928GKa.b(bitmap);
        return this;
    }

    /* access modifiers changed from: 0000 */
    public A a(B b2, boolean z) {
        this.b = C4928GKa.c(Boolean.valueOf(z));
        this.a = C4928GKa.c(b2);
        return this;
    }
}
