package androidx.preference;

/* compiled from: PreferenceGroup */
class t implements Runnable {
    final /* synthetic */ PreferenceGroup a;

    t(PreferenceGroup preferenceGroup) {
        this.a = preferenceGroup;
    }

    public void run() {
        synchronized (this) {
            this.a.U.clear();
        }
    }
}
