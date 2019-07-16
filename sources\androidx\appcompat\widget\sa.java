package androidx.appcompat.widget;

import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window.Callback;
import androidx.appcompat.view.menu.C0326a;

/* compiled from: ToolbarWidgetWrapper */
class sa implements OnClickListener {
    final C0326a a;
    final /* synthetic */ ua b;

    sa(ua uaVar) {
        this.b = uaVar;
        C0326a aVar = new C0326a(this.b.a.getContext(), 0, 16908332, 0, 0, this.b.i);
        this.a = aVar;
    }

    public void onClick(View view) {
        ua uaVar = this.b;
        Callback callback = uaVar.l;
        if (callback != null && uaVar.m) {
            callback.onMenuItemSelected(0, this.a);
        }
    }
}
