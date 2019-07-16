package com.soundcloud.android.playback;

import android.content.Context;
import com.soundcloud.android.playback.core.l;
import java.io.File;
import java.util.Collection;
import java.util.List;
import java.util.Locale;

@EVa(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0005\n\u0002\b\u0005\b\u0000\u0018\u0000 \u001a*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002:\u0002\u001a\u001bB'\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00028\u0000\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\b\u0010\u0011\u001a\u00020\u0012H\u0002J\b\u0010\u0013\u001a\u00020\rH\u0016J\n\u0010\u0014\u001a\u0004\u0018\u00010\u0007H\u0016J\n\u0010\u0015\u001a\u0004\u0018\u00010\u0007H\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\r\u0010\u0005\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0018J\b\u0010\u0019\u001a\u00020\u0012H\u0016R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00028\u0000X\u0004¢\u0006\u0004\n\u0002\u0010\u000bR\u001a\u0010\f\u001a\u00020\r*\u0004\u0018\u00010\u000e8BX\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\r*\u0004\u0018\u00010\u000e8BX\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000f¨\u0006\u001c"}, d2 = {"Lcom/soundcloud/android/playback/CountryCodePlayerCache;", "T", "Lcom/soundcloud/android/playback/core/PlayerCache;", "context", "Landroid/content/Context;", "password", "cacheDir", "Ljava/io/File;", "countryProvider", "Lcom/soundcloud/android/utils/CountryProvider;", "(Landroid/content/Context;Ljava/lang/Object;Ljava/io/File;Lcom/soundcloud/android/utils/CountryProvider;)V", "Ljava/lang/Object;", "isInvalidCountryCode", "", "", "(Ljava/lang/String;)Z", "isMonetizedCountryCode", "cacheSize", "", "clearCache", "directory", "lazilyCreateCacheDirectory", "minFreeSpaceAvailablePercentage", "", "()Ljava/lang/Object;", "size", "Companion", "NoExternalStorageDirectoryException", "base_release"}, mv = {1, 1, 15})
/* compiled from: CountryCodePlayerCache.kt */
public final class M<T> implements l<T> {
    private static final List<String> a;
    public static final a b = new a(null);
    private final Context c;
    private final T d;
    private final File e;
    private final C6291dHa f;

    /* compiled from: CountryCodePlayerCache.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }
    }

    /* compiled from: CountryCodePlayerCache.kt */
    private static final class b extends IllegalStateException {
        public b() {
            super("External storage directory not available");
        }
    }

    static {
        Locale locale = Locale.US;
        C7471uYa.a((Object) locale, "Locale.US");
        Locale locale2 = Locale.GERMANY;
        C7471uYa.a((Object) locale2, "Locale.GERMANY");
        Locale locale3 = Locale.FRANCE;
        C7471uYa.a((Object) locale3, "Locale.FRANCE");
        Locale locale4 = Locale.UK;
        C7471uYa.a((Object) locale4, "Locale.UK");
        Locale locale5 = Locale.CANADA;
        C7471uYa.a((Object) locale5, "Locale.CANADA");
        Locale locale6 = Locale.ITALY;
        C7471uYa.a((Object) locale6, "Locale.ITALY");
        a = C6918mWa.b((Object[]) new String[]{locale.getCountry(), locale2.getCountry(), locale3.getCountry(), locale4.getCountry(), locale5.getCountry(), "IE", "NZ", "AU", "ES", locale6.getCountry(), "PT", "BE", "CH"});
    }

    public M(Context context, T t, File file, C6291dHa dha) {
        C7471uYa.b(context, "context");
        C7471uYa.b(dha, "countryProvider");
        this.c = context;
        this.d = t;
        this.e = file;
        this.f = dha;
    }

    private final long e() {
        String a2 = this.f.a();
        return (a(a2) || b(a2)) ? 125829120 : 524288000;
    }

    private final File f() {
        File file = this.e;
        if (file != null && !file.exists() && C6630iGa.a()) {
            C6630iGa.e(this.e);
            File a2 = C6630iGa.a(this.c);
            if (a2 != null) {
                C6630iGa.e(a2);
                C6630iGa.f(a2);
            } else {
                C7316sHa.d(new b());
            }
        }
        return this.e;
    }

    public File a() {
        return f();
    }

    public boolean b() {
        File file = this.e;
        boolean z = file != null && C6630iGa.a(file);
        f();
        return z;
    }

    public T c() {
        return this.d;
    }

    public byte d() {
        return 1;
    }

    public long size() {
        return e();
    }

    private final boolean a(String str) {
        return (str == null || Cxb.a(str)) || C7471uYa.a((Object) str, (Object) "null");
    }

    private final boolean b(String str) {
        List<String> list = a;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        for (String c2 : list) {
            if (Cxb.c(c2, str, true)) {
                return true;
            }
        }
        return false;
    }
}
