package androidx.core.widget;

/* compiled from: ContentLoadingProgressBar */
class e implements Runnable {
    final /* synthetic */ ContentLoadingProgressBar a;

    e(ContentLoadingProgressBar contentLoadingProgressBar) {
        this.a = contentLoadingProgressBar;
    }

    public void run() {
        ContentLoadingProgressBar contentLoadingProgressBar = this.a;
        contentLoadingProgressBar.c = false;
        if (!contentLoadingProgressBar.d) {
            contentLoadingProgressBar.a = System.currentTimeMillis();
            this.a.setVisibility(0);
        }
    }
}
