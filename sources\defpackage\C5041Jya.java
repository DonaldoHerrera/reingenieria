package defpackage;

import android.app.Application;
import android.content.ContentResolver;

/* renamed from: Jya reason: default package and case insensitive filesystem */
/* compiled from: StorageModule_ProvideContentResolverFactory */
public final class C5041Jya implements C4961HMa<ContentResolver> {
    private final C7054oVa<Application> a;

    public static ContentResolver a(Application application) {
        ContentResolver a2 = C7853zya.a(application);
        C5023JMa.a(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }

    public ContentResolver get() {
        return a((Application) this.a.get());
    }
}
