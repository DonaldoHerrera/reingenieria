package com.soundcloud.android.listeners.dev.eventlogger;

import android.app.Dialog;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.B;
import androidx.appcompat.app.C0325l;
import androidx.fragment.app.FragmentActivity;
import com.soundcloud.android.listeners.dev.U.i;
import com.soundcloud.android.listeners.dev.U.l;
import com.soundcloud.android.listeners.dev.U.p;
import com.soundcloud.android.view.customfontviews.CustomFontTextView;
import java.util.HashMap;

@EVa(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H\u0002J\u0012\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016R\u0014\u0010\u0003\u001a\u00020\u00048BX\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/soundcloud/android/listeners/dev/eventlogger/DevEventLoggerMonitorDetailsDialog;", "Landroidx/appcompat/app/AppCompatDialogFragment;", "()V", "data", "", "getData", "()Ljava/lang/String;", "copyDataToClipboard", "", "prettyData", "onCreateDialog", "Landroid/app/Dialog;", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "devdrawer_release"}, mv = {1, 1, 15})
/* compiled from: DevEventLoggerMonitorDetailsDialog.kt */
public final class e extends B {
    public static final a a = new a(null);
    private HashMap b;

    /* compiled from: DevEventLoggerMonitorDetailsDialog.kt */
    public static final class a {
        private a() {
        }

        @NXa
        public final e a(C2110JM jm) {
            C7471uYa.b(jm, "trackingRecord");
            Bundle bundle = new Bundle();
            e eVar = new e();
            bundle.putString("KEY_TRACKING_RECORD_DATA", jm.b());
            eVar.setArguments(bundle);
            return eVar;
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }
    }

    private final String Rb() {
        Bundle arguments = getArguments();
        String str = "";
        if (arguments == null) {
            return str;
        }
        String string = arguments.getString("KEY_TRACKING_RECORD_DATA", str);
        C7471uYa.a((Object) string, "args.getString(KEY_TRACK…CORD_DATA, Strings.EMPTY)");
        return string;
    }

    @NXa
    public static final e a(C2110JM jm) {
        return a.a(jm);
    }

    /* access modifiers changed from: private */
    public final void c(String str) {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            C7471uYa.a((Object) activity, "this.activity ?: throw I…ty when creating dialog\")");
            Object systemService = activity.getSystemService("clipboard");
            if (systemService != null) {
                ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText("event_data", str));
                return;
            }
            throw new OVa("null cannot be cast to non-null type android.content.ClipboardManager");
        }
        throw new IllegalStateException("missing activity when creating dialog");
    }

    public void Qb() {
        HashMap hashMap = this.b;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public Dialog onCreateDialog(Bundle bundle) {
        View inflate = View.inflate(getActivity(), l.dialog_dev_event_logger_monitor_details, null);
        String b2 = C7315sGa.b.b(Rb(), 2);
        C7471uYa.a((Object) inflate, "view");
        CustomFontTextView customFontTextView = (CustomFontTextView) inflate.findViewById(i.title);
        C7471uYa.a((Object) customFontTextView, "view.title");
        customFontTextView.setText(getString(p.event_logger_monitor_details_dialog_title));
        CustomFontTextView customFontTextView2 = (CustomFontTextView) inflate.findViewById(i.body);
        C7471uYa.a((Object) customFontTextView2, "view.body");
        customFontTextView2.setText(b2);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            C7471uYa.a((Object) activity, "this.activity ?: throw I…ty when creating dialog\")");
            androidx.appcompat.app.C0325l.a aVar = new androidx.appcompat.app.C0325l.a(activity);
            aVar.b(inflate);
            aVar.c(17039361, (OnClickListener) new f(this, b2));
            aVar.a(p.share, (OnClickListener) new g(this, activity, b2));
            C0325l a2 = aVar.a();
            C7471uYa.a((Object) a2, "AlertDialog.Builder(acti…) }\n            .create()");
            return a2;
        }
        throw new IllegalStateException("missing activity when creating dialog");
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        Qb();
    }
}
