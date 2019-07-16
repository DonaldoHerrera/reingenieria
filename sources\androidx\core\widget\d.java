package androidx.core.widget;

/* compiled from: ContentLoadingProgressBar */
class d implements Runnable {
    final /* synthetic */ ContentLoadingProgressBar a;

    d(ContentLoadingProgressBar contentLoadingProgressBar) {
        this.a = contentLoadingProgressBar;
    }

    public void run() {
        ContentLoadingProgressBar contentLoadingProgressBar = this.a;
        contentLoadingProgressBar.b = false;
        contentLoadingProgressBar.a = -1;
        contentLoadingProgressBar.setVisibility(8);
    }
}
