package defpackage;

import android.app.Dialog;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import com.soundcloud.android.ia.l;
import dagger.android.support.d;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;

/* renamed from: sga reason: default package and case insensitive filesystem */
/* compiled from: FcmDebugDialogFragment.kt */
public final class C4661sga extends d implements a {
    public C3840oea b;
    private TextView c;
    private HashMap d;

    public void Qb() {
        HashMap hashMap = this.d;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C7471uYa.b(layoutInflater, "inflater");
        return layoutInflater.inflate(l.debug_gcm_dialog, viewGroup);
    }

    public void onDestroyView() {
        C3840oea oea = this.b;
        if (oea != null) {
            oea.a(this);
            super.onDestroyView();
            Qb();
            return;
        }
        C7471uYa.b("fcmMessageHandler");
        throw null;
    }

    public void onStart() {
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog != null) {
            Window window = dialog.getWindow();
            if (window != null) {
                window.setLayout(-1, -1);
            }
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        C7471uYa.b(view, "view");
        super.onViewCreated(view, bundle);
        this.c = (TextView) view.findViewById(16908299);
        C3840oea oea = this.b;
        if (oea != null) {
            oea.b(this);
        } else {
            C7471uYa.b("fcmMessageHandler");
            throw null;
        }
    }

    public void a(b bVar) {
        C7471uYa.b(bVar, "message");
        TextView textView = this.c;
        if (textView != null) {
            new Handler(Looper.getMainLooper()).post(new C4652rga(textView, this, bVar));
        }
    }

    /* access modifiers changed from: private */
    public final String a(b bVar, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US).format(new Date()));
        sb.append("\n            |from ");
        sb.append(bVar.a());
        sb.append("\n            |sent_at ");
        sb.append(bVar.d());
        sb.append("\n            |payload ");
        sb.append(str);
        return C7576vxb.a(sb.toString(), null, 1, null);
    }
}
