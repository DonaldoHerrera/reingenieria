package dagger.android;

import android.content.ContentProvider;

public abstract class DaggerContentProvider extends ContentProvider {
    public boolean onCreate() {
        a.a((ContentProvider) this);
        return true;
    }
}
