package com.soundcloud.android.soul.components.cells.standard;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Switch;

/* compiled from: CellStandardExtended.kt */
final class a implements OnClickListener {
    final /* synthetic */ CellStandardExtended a;

    a(CellStandardExtended cellStandardExtended) {
        this.a = cellStandardExtended;
    }

    public final void onClick(View view) {
        ((Switch) this.a.b(h.cell_toggle)).toggle();
    }
}
