package com.soundcloud.android.main;

import com.soundcloud.android.main.Z.a;

/* compiled from: BaseNavigationTarget */
public abstract class H implements a {
    private final int a;
    private final int b;

    public H(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public int getIcon() {
        return this.b;
    }

    public int getName() {
        return this.a;
    }
}
