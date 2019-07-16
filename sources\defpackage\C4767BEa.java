package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;

/* renamed from: BEa reason: default package and case insensitive filesystem */
/* compiled from: DefaultProgressCellRenderer.kt */
public final class C4767BEa implements C5109MEa {
    private OnClickListener a;
    private final int b;

    public C4767BEa(int i) {
        this.b = i;
    }

    public View a(ViewGroup viewGroup) {
        C7471uYa.b(viewGroup, "parentViewGroup");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(this.b, viewGroup, false);
        C7471uYa.a((Object) inflate, "LayoutInflater.from(pare…, parentViewGroup, false)");
        return inflate;
    }

    public void a(View view, boolean z) {
        C7471uYa.b(view, "itemView");
        View findViewById = view.findViewById(h.uniflow_list_progress);
        View findViewById2 = view.findViewById(h.uniflow_list_retry);
        String str = "retryView";
        String str2 = "progressView";
        if (z) {
            C7471uYa.a((Object) findViewById, str2);
            findViewById.setVisibility(8);
            C7471uYa.a((Object) findViewById2, str);
            findViewById2.setVisibility(0);
            findViewById2.setOnClickListener(this.a);
            return;
        }
        C7471uYa.a((Object) findViewById, str2);
        findViewById.setVisibility(0);
        C7471uYa.a((Object) findViewById2, str);
        findViewById2.setVisibility(8);
        findViewById2.setOnClickListener(null);
    }

    public void a(OnClickListener onClickListener) {
        C7471uYa.b(onClickListener, "retryListener");
        this.a = onClickListener;
    }
}
