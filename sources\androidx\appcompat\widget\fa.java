package androidx.appcompat.widget;

import androidx.appcompat.widget.SearchView.SearchAutoComplete;

/* compiled from: SearchView */
class fa implements Runnable {
    final /* synthetic */ SearchAutoComplete a;

    fa(SearchAutoComplete searchAutoComplete) {
        this.a = searchAutoComplete;
    }

    public void run() {
        this.a.b();
    }
}
