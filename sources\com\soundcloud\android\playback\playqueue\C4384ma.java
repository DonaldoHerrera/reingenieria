package com.soundcloud.android.playback.playqueue;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import androidx.appcompat.widget.SwitchCompat;
import com.soundcloud.android.ia.i;
import com.soundcloud.android.ia.l;

/* renamed from: com.soundcloud.android.playback.playqueue.ma reason: case insensitive filesystem */
/* compiled from: MagicBoxPlayQueueItemRenderer */
class C4384ma extends C5541_ta<C4388oa> {
    private final C3814lca a;
    private C4928GKa<a> b = C4928GKa.a();

    /* renamed from: com.soundcloud.android.playback.playqueue.ma$a */
    /* compiled from: MagicBoxPlayQueueItemRenderer */
    interface a {
        void e(boolean z);

        void q();
    }

    C4384ma(C3814lca lca) {
        this.a = lca;
    }

    public View b(ViewGroup viewGroup) {
        return LayoutInflater.from(viewGroup.getContext()).inflate(l.playqueue_magic_box_item, viewGroup, false);
    }

    private void b(View view, boolean z) {
        SwitchCompat switchCompat = (SwitchCompat) view.findViewById(i.toggle_auto_play);
        C6768kIa.b((View) switchCompat);
        switchCompat.setChecked(this.a.w());
        switchCompat.setOnCheckedChangeListener(new C4371g(this, view, z));
    }

    public void a(int i, View view, C4388oa oaVar) {
        boolean z = !oaVar.c().equals(b.REPEAT_NONE);
        a(view, z);
        b(view, z);
        view.setOnClickListener(new C4373h(this));
    }

    public /* synthetic */ void a(View view) {
        if (this.a.h().j() && this.b.c()) {
            ((a) this.b.b()).q();
        }
    }

    public /* synthetic */ void a(View view, boolean z, CompoundButton compoundButton, boolean z2) {
        if (this.b.c()) {
            ((a) this.b.b()).e(z2);
        }
        a(view, z);
    }

    private void a(View view, boolean z) {
        float f = 1.0f;
        float f2 = (z || !this.a.w()) ? 0.3f : 1.0f;
        if (z) {
            f = 0.3f;
        }
        view.findViewById(i.station_icon).setAlpha(f2);
        view.findViewById(i.toggle_auto_play_label).setAlpha(f2);
        view.findViewById(i.toggle_auto_play_description).setAlpha(f2);
        view.findViewById(i.toggle_auto_play).setAlpha(f);
    }

    public void a(a aVar) {
        this.b = C4928GKa.b(aVar);
    }
}
