package com.google.firebase.iid;

import android.os.Bundle;

/* renamed from: com.google.firebase.iid.n reason: case insensitive filesystem */
final class C2507n extends C2506m<Void> {
    C2507n(int i, int i2, Bundle bundle) {
        super(i, 2, bundle);
    }

    /* access modifiers changed from: 0000 */
    public final void a(Bundle bundle) {
        if (bundle.getBoolean("ack", false)) {
            a(null);
        } else {
            a(new C2509p(4, "Invalid response to one way request"));
        }
    }

    /* access modifiers changed from: 0000 */
    public final boolean a() {
        return true;
    }
}
