package com.soundcloud.android.profile;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.soundcloud.android.ia.h;
import com.soundcloud.android.ia.i;
import com.soundcloud.android.ia.l;
import com.soundcloud.android.ia.p;

/* compiled from: ProfileBucketsFragment.kt */
public final class L implements C6837lJa {
    private Boolean a;
    private String b;

    public void a(View view, C6973nJa nja) {
        C7471uYa.b(view, "view");
        C7471uYa.b(nja, "errorType");
        a.a(this, view, nja);
    }

    public void b(View view) {
        C7471uYa.b(view, "view");
        a.b(this, view);
    }

    public int c() {
        return a.c(this);
    }

    public int d() {
        return a.a(this);
    }

    public int b() {
        return l.emptyview_profile_buckets;
    }

    public int a(C6973nJa nja) {
        C7471uYa.b(nja, "legacyError");
        return a.a((C6837lJa) this, nja);
    }

    public int a() {
        return a.b(this);
    }

    public final void a(Boolean bool) {
        this.a = bool;
    }

    public final void a(String str) {
        this.b = str;
    }

    public void a(View view) {
        C7471uYa.b(view, "view");
        ((ImageView) view.findViewById(i.emptyview_image)).setImageResource(h.empty_lists_sounds);
        Boolean bool = this.a;
        if (bool == null) {
            return;
        }
        if (bool.booleanValue()) {
            ((TextView) view.findViewById(i.emptyview_message)).setText(p.empty_you_sounds_message);
            ((TextView) view.findViewById(i.emptyview_secondary)).setText(p.empty_you_sounds_message_secondary);
            return;
        }
        ((TextView) view.findViewById(i.emptyview_message)).setText(p.empty_user_sounds_message);
        TextView textView = (TextView) view.findViewById(i.emptyview_secondary);
        C7471uYa.a((Object) textView, "view.emptyview_secondary");
        textView.setText(view.getResources().getString(p.empty_user_sounds_message_secondary, new Object[]{this.b}));
    }
}
