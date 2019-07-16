package com.google.android.gms.cast.framework.media;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import com.google.android.gms.cast.framework.C0635c;
import com.google.android.gms.cast.framework.C0636d;
import com.google.android.gms.cast.framework.C0666s;
import com.google.android.gms.cast.framework.r;
import org.json.JSONObject;

public class MediaIntentReceiver extends BroadcastReceiver {
    /* access modifiers changed from: protected */
    public void a(Context context, String str, Intent intent) {
    }

    /* access modifiers changed from: protected */
    public void a(r rVar) {
        if (rVar instanceof C0636d) {
            C0650e b = b((C0636d) rVar);
            if (b != null && !b.s()) {
                b.c((JSONObject) null);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void b(r rVar) {
        if (rVar instanceof C0636d) {
            C0650e b = b((C0636d) rVar);
            if (b != null && !b.s()) {
                b.d((JSONObject) null);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void c(r rVar) {
        if (rVar instanceof C0636d) {
            a((C0636d) rVar);
        }
    }

    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if (action != null) {
            C0666s c = C0635c.a(context).c();
            char c2 = 65535;
            switch (action.hashCode()) {
                case -1699820260:
                    if (action.equals("com.google.android.gms.cast.framework.action.REWIND")) {
                        c2 = 4;
                        break;
                    }
                    break;
                case -945151566:
                    if (action.equals("com.google.android.gms.cast.framework.action.SKIP_NEXT")) {
                        c2 = 1;
                        break;
                    }
                    break;
                case -945080078:
                    if (action.equals("com.google.android.gms.cast.framework.action.SKIP_PREV")) {
                        c2 = 2;
                        break;
                    }
                    break;
                case -668151673:
                    if (action.equals("com.google.android.gms.cast.framework.action.STOP_CASTING")) {
                        c2 = 5;
                        break;
                    }
                    break;
                case -124479363:
                    if (action.equals("com.google.android.gms.cast.framework.action.DISCONNECT")) {
                        c2 = 6;
                        break;
                    }
                    break;
                case 235550565:
                    if (action.equals("com.google.android.gms.cast.framework.action.TOGGLE_PLAYBACK")) {
                        c2 = 0;
                        break;
                    }
                    break;
                case 1362116196:
                    if (action.equals("com.google.android.gms.cast.framework.action.FORWARD")) {
                        c2 = 3;
                        break;
                    }
                    break;
                case 1997055314:
                    if (action.equals("android.intent.action.MEDIA_BUTTON")) {
                        c2 = 7;
                        break;
                    }
                    break;
            }
            String str = "googlecast-extra_skip_step_ms";
            switch (c2) {
                case 0:
                    c(c.b());
                    return;
                case 1:
                    a(c.b());
                    return;
                case 2:
                    b(c.b());
                    return;
                case 3:
                    a(c.b(), intent.getLongExtra(str, 0));
                    return;
                case 4:
                    b(c.b(), intent.getLongExtra(str, 0));
                    return;
                case 5:
                    c.a(true);
                    return;
                case 6:
                    c.a(false);
                    return;
                case 7:
                    a(c.b(), intent);
                    return;
                default:
                    a(context, action, intent);
                    return;
            }
        }
    }

    /* access modifiers changed from: protected */
    public void a(r rVar, long j) {
        if (rVar instanceof C0636d) {
            a((C0636d) rVar, j);
        }
    }

    /* access modifiers changed from: protected */
    public void b(r rVar, long j) {
        if (rVar instanceof C0636d) {
            a((C0636d) rVar, -j);
        }
    }

    private static C0650e b(C0636d dVar) {
        if (dVar == null || !dVar.b()) {
            return null;
        }
        return dVar.g();
    }

    /* access modifiers changed from: protected */
    public void a(r rVar, Intent intent) {
        if (rVar instanceof C0636d) {
            String str = "android.intent.extra.KEY_EVENT";
            if (intent.hasExtra(str)) {
                KeyEvent keyEvent = (KeyEvent) intent.getExtras().get(str);
                if (keyEvent != null && keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 85) {
                    a((C0636d) rVar);
                }
            }
        }
    }

    private static void a(C0636d dVar) {
        C0650e b = b(dVar);
        if (b != null) {
            b.x();
        }
    }

    private static void a(C0636d dVar, long j) {
        if (j != 0) {
            C0650e b = b(dVar);
            if (b != null && !b.o() && !b.s()) {
                b.a(b.d() + j);
            }
        }
    }
}
