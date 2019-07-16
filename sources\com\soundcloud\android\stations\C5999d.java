package com.soundcloud.android.stations;

import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;

/* renamed from: com.soundcloud.android.stations.d reason: case insensitive filesystem */
/* compiled from: lambda */
public final /* synthetic */ class C5999d implements OnCheckedChangeListener {
    private final /* synthetic */ Xa a;
    private final /* synthetic */ Wa b;

    public /* synthetic */ C5999d(Xa xa, Wa wa) {
        this.a = xa;
        this.b = wa;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        this.a.a(this.b, compoundButton, z);
    }
}
