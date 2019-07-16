package com.soundcloud.android.creators.upload;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.text.TextUtils;
import androidx.core.app.k.d;
import androidx.core.app.n;
import com.soundcloud.android.C2929h;
import com.soundcloud.android.accounts.C2526g;
import com.soundcloud.android.features.record.Recording;
import com.soundcloud.android.ia.g;
import com.soundcloud.android.ia.h;
import com.soundcloud.android.ia.p;

/* compiled from: UploadNotificationController */
public class u {
    private final Context a;
    private final Resources b;
    private final n c;
    private final d d;
    private final d e;
    private final C2526g f;

    u(Context context, Resources resources, n nVar, C2526g gVar) {
        this.a = context;
        this.b = resources;
        this.c = nVar;
        this.f = gVar;
        String str = "channel_upload";
        this.d = new d(context, str);
        this.e = new d(context, str);
    }

    private Notification b(Recording recording, int i) {
        c(this.d, recording);
        this.d.a(c(recording, i));
        this.d.b((CharSequence) this.b.getString(p.uploader_event_uploading_percent, new Object[]{Integer.valueOf(i)}));
        this.d.a(100, i, false);
        return this.d.a();
    }

    private PendingIntent c(Recording recording, int i) {
        return PendingIntent.getActivity(this.a, 0, g(recording).putExtra("stage", 2).putExtra("progress", i), 134217728);
    }

    private Notification d(Recording recording) {
        c(this.d, recording);
        this.d.a(h(recording));
        this.d.b((CharSequence) this.b.getString(p.uploader_event_processing));
        this.d.a(100, 0, true);
        return this.d.a();
    }

    private Notification e(Recording recording) {
        i(recording);
        this.e.c((CharSequence) this.b.getString(p.cloud_uploader_notification_error_title));
        this.e.b((CharSequence) this.b.getString(p.cloud_uploader_notification_error_message_tracktitle, new Object[]{recording.e}));
        this.e.e((CharSequence) this.b.getString(p.cloud_uploader_notification_error_ticker));
        this.e.a(PendingIntent.getActivity(this.a, 0, g(recording), 134217728));
        return this.e.a();
    }

    private Notification f(Recording recording) {
        Intent a2 = C4557fja.a(this.a, this.f.c(), C4928GKa.a(), C4928GKa.a(), C4928GKa.a());
        i(recording);
        this.e.c((CharSequence) this.b.getString(p.cloud_uploader_notification_finished_title));
        this.e.b((CharSequence) this.b.getString(p.cloud_uploader_notification_tracktitle_has_been_uploaded, new Object[]{recording.e}));
        this.e.e((CharSequence) this.b.getString(p.cloud_uploader_notification_finished_ticker));
        this.e.a(PendingIntent.getActivity(this.a, 0, a2, 134217728));
        return this.e.a();
    }

    private Intent g(Recording recording) {
        return new Intent(C2929h.v).putExtra("recording", recording);
    }

    private PendingIntent h(Recording recording) {
        return PendingIntent.getActivity(this.a, 0, g(recording).putExtra("stage", 1), 134217728);
    }

    private void i(Recording recording) {
        b(this.e, recording);
        this.e.c(false);
        this.e.a(true);
    }

    /* access modifiers changed from: 0000 */
    public void a(Recording recording) {
        a(d(recording));
    }

    /* access modifiers changed from: 0000 */
    public void a(Recording recording, int i) {
        a(b(recording, i));
    }

    /* access modifiers changed from: 0000 */
    public void a() {
        this.c.a(2);
    }

    private void a(Notification notification) {
        this.c.a(2, notification);
    }

    private void a(d dVar, Recording recording) {
        if (recording.J()) {
            Bitmap a2 = C4740AIa.a(recording.e(), (int) this.b.getDimension(g.notification_image_width), (int) this.b.getDimension(g.notification_image_height));
            if (a2 != null) {
                dVar.a(a2);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public void c(Recording recording) {
        a(f(recording));
    }

    private void c(d dVar, Recording recording) {
        b(dVar, recording);
        dVar.a(false);
        dVar.c(true);
    }

    /* access modifiers changed from: 0000 */
    public void b(Recording recording) {
        a(e(recording));
    }

    private void b(d dVar, Recording recording) {
        dVar.c((CharSequence) TextUtils.isEmpty(recording.e) ? recording.e(this.a) : recording.e);
        dVar.e(h.ic_notification_cloud);
        dVar.f(1);
        a(dVar, recording);
    }
}
