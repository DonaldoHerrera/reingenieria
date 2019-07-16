package com.soundcloud.android.onboarding;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.net.Uri;
import java.util.Arrays;
import java.util.Locale;

@EVa(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0000\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0002J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/soundcloud/android/onboarding/SpamDialogOnClickListener;", "Landroid/content/DialogInterface$OnClickListener;", "context", "Landroid/content/Context;", "oAuth", "Lcom/soundcloud/android/api/oauth/OAuth;", "(Landroid/content/Context;Lcom/soundcloud/android/api/oauth/OAuth;)V", "onCaptchaRequested", "", "onClick", "dialog", "Landroid/content/DialogInterface;", "which", "", "Companion", "base_release"}, mv = {1, 1, 15})
/* compiled from: SpamDialogOnClickListener.kt */
public final class u implements OnClickListener {
    private static final String a = a;
    public static final a b = new a(null);
    private final Context c;
    private final C2322UP d;

    /* compiled from: SpamDialogOnClickListener.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }
    }

    public u(Context context, C2322UP up) {
        C7471uYa.b(context, "context");
        C7471uYa.b(up, "oAuth");
        this.c = context;
        this.d = up;
    }

    private final void a() {
        KYa kYa = KYa.a;
        Locale locale = Locale.US;
        C7471uYa.a((Object) locale, "Locale.US");
        Object[] objArr = {this.d.b()};
        String format = String.format(locale, a, Arrays.copyOf(objArr, objArr.length));
        C7471uYa.a((Object) format, "java.lang.String.format(locale, format, *args)");
        this.c.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(format)));
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        C7471uYa.b(dialogInterface, "dialog");
        if (i != -1) {
            dialogInterface.dismiss();
            return;
        }
        a();
        dialogInterface.dismiss();
    }
}
