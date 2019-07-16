package defpackage;

import android.content.Context;
import java.io.File;

/* renamed from: kza reason: default package and case insensitive filesystem */
/* compiled from: StorageModule_ProvideStreamCacheDirectoryFlipperFactory */
public final class C6822kza implements C4961HMa<File> {
    private final C7054oVa<Context> a;

    public C6822kza(C7054oVa<Context> ova) {
        this.a = ova;
    }

    public static C6822kza a(C7054oVa<Context> ova) {
        return new C6822kza(ova);
    }

    public static File a(Context context) {
        return C7853zya.F(context);
    }

    public File get() {
        return a((Context) this.a.get());
    }
}
