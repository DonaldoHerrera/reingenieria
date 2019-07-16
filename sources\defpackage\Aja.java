package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.soundcloud.android.settings.ChangeStorageLocationActivity;

/* renamed from: Aja reason: default package */
/* compiled from: PendingIntentFactory */
public final class Aja {
    private Aja() {
    }

    public static PendingIntent a(Context context) {
        return PendingIntent.getActivity(context, 0, new Intent(context, ChangeStorageLocationActivity.class), 268435456);
    }

    public static PendingIntent b(Context context) {
        Intent b = C4557fja.b();
        b.setFlags(335544320);
        return PendingIntent.getActivity(context, 0, b, 268435456);
    }

    public static PendingIntent c(Context context) {
        Intent j = C4557fja.j(context);
        j.setFlags(335544320);
        return PendingIntent.getActivity(context, 0, j, 268435456);
    }

    public static PendingIntent d(Context context) {
        return PendingIntent.getActivity(context, 0, C4557fja.t(context), 268435456);
    }

    public static PendingIntent a(Context context, C3508cda cda) {
        return PendingIntent.getActivity(context, 0, C4557fja.a(context, cda, C4928GKa.c(Yca.NOTIFICATION), C4928GKa.a(), C4928GKa.a()).addFlags(805306368), 268435456);
    }

    public static PendingIntent a(Context context, C3508cda cda, int i) {
        return PendingIntent.getActivity(context, i, C4557fja.a(context, cda, C4928GKa.c(Yca.WIDGET), C4928GKa.a(), C4928GKa.c(C3235rM.PLAYBACK_WIDGET)), 268435456);
    }
}
