package defpackage;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface.OnClickListener;
import android.content.res.Resources;
import android.view.View;
import androidx.appcompat.app.C0325l.a;
import com.soundcloud.android.ia.h;
import com.soundcloud.android.ia.o;
import com.soundcloud.android.ia.p;
import com.soundcloud.android.view.customfontviews.b;
import java.util.concurrent.TimeUnit;

/* renamed from: _sa reason: default package and case insensitive filesystem */
/* compiled from: GoBackOnlineDialogPresenter */
class C5540_sa {
    private final Resources a;

    public C5540_sa(Resources resources) {
        this.a = resources;
    }

    private String b(int i) {
        if (i == 0) {
            return this.a.getString(p.offline_dialog_go_online_error_title);
        }
        return this.a.getQuantityString(o.offline_dialog_go_online_warning_title, i, new Object[]{Integer.valueOf(i)});
    }

    public void a(Activity activity, long j) {
        int a2 = a(j);
        View a3 = new b(activity).a(h.dialog_go_online_days).b(b(a2)).a(a(a2)).a();
        a aVar = new a(activity);
        aVar.b(a3);
        aVar.c(p.offline_dialog_go_online_continue, (OnClickListener) null);
        C5232QGa.a((Dialog) aVar.a());
    }

    private String a(int i) {
        if (i == 0) {
            return this.a.getString(p.offline_dialog_go_online_error_content);
        }
        return this.a.getQuantityString(o.offline_dialog_go_online_warning_content, i, new Object[]{Integer.valueOf(i)});
    }

    /* access modifiers changed from: 0000 */
    public int a(long j) {
        return (int) Math.max(30 - TimeUnit.MILLISECONDS.toDays(System.currentTimeMillis() - j), 0);
    }
}
