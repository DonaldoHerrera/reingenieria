package com.soundcloud.android.playback.ui;

import android.view.View;
import android.view.ViewGroup;
import com.soundcloud.android.collections.data.J;
import com.soundcloud.android.foundation.events.C.a;
import com.soundcloud.android.foundation.playqueue.q;
import com.soundcloud.android.playback.C4431ub;
import com.soundcloud.android.playback.C4519wc;
import com.soundcloud.android.playback.ui.C4510zb;
import java.util.Set;

/* compiled from: PlayerPagePresenter */
interface Cb<T extends C4510zb> {
    View a(ViewGroup viewGroup, Xb xb);

    void a(View view);

    void a(View view, float f);

    void a(View view, J j);

    void a(View view, a aVar);

    void a(View view, q qVar, boolean z);

    void a(View view, C4431ub ubVar, boolean z, boolean z2, boolean z3);

    void a(View view, T t);

    void a(View view, C4519wc wcVar);

    void a(View view, Set<C3799jda> set);

    void b(View view);

    void b(View view, q qVar, boolean z);

    void c(View view);

    void d(View view);

    void e(View view);

    void f(View view);

    View g(View view);

    void h(View view);

    void i(View view);
}
