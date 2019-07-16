package com.google.android.material.snackbar;

/* compiled from: BaseTransientBottomBar */
class m implements a {
    final /* synthetic */ e a;

    m(e eVar) {
        this.a = eVar;
    }

    public void onTouchExplorationStateChanged(boolean z) {
        this.a.setClickableOrFocusableBasedOnAccessibility(z);
    }
}
