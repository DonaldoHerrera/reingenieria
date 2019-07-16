package com.google.firebase.iid;

import android.os.Bundle;

/* renamed from: com.google.firebase.iid.o reason: case insensitive filesystem */
final class C2508o extends C2506m<Bundle> {
    C2508o(int i, int i2, Bundle bundle) {
        super(i, 1, bundle);
    }

    /* access modifiers changed from: 0000 */
    public final void a(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("data");
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        a(bundle2);
    }

    /* access modifiers changed from: 0000 */
    public final boolean a() {
        return false;
    }
}
