package defpackage;

import android.webkit.URLUtil;
import com.soundcloud.android.ads.Hc;
import com.soundcloud.android.foundation.ads.C3675b.C0090b;
import com.soundcloud.android.foundation.ads.S;
import com.soundcloud.android.foundation.ads.Y;
import com.soundcloud.android.foundation.events.C3703e;
import java.net.MalformedURLException;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* renamed from: Yaa reason: default package */
/* compiled from: UrlWithPlaceholderBuilder.kt */
public class Yaa {
    private final SimpleDateFormat a = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS-Z", Locale.US);
    private final String b = "%02d:%02d:%02d.%03d";
    private final C5694cGa c;
    private final C3844paa d;
    private final Hc e;
    private final C5495ZFa f;
    private final C3469VY g;

    public Yaa(C5694cGa cga, C3844paa paa, Hc hc, C5495ZFa zFa, C3469VY vy) {
        C7471uYa.b(cga, "dateProvider");
        C7471uYa.b(paa, "cacheBustingStringGenerator");
        C7471uYa.b(hc, "playerAdsPositionTracker");
        C7471uYa.b(zFa, "appStateProvider");
        C7471uYa.b(vy, "errorReporter");
        this.c = cga;
        this.d = paa;
        this.e = hc;
        this.f = zFa;
        this.g = vy;
    }

    public static /* synthetic */ String a(Yaa yaa, Y y, C0090b bVar, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                bVar = null;
            }
            return yaa.a(y, bVar);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: build");
    }

    public List<String> a(List<Y> list) {
        return a(this, (List) list, (C0090b) null, 2, (Object) null);
    }

    public String a(Y y, C0090b bVar) {
        String str;
        C7471uYa.b(y, "urlWithPlaceholder");
        if (!Hxb.a((CharSequence) y.a(), (CharSequence) "[ERRORCODE]", false, 2, (Object) null) || bVar != null) {
            String a2 = y.a();
            if (bVar != null) {
                String str2 = a2;
                String a3 = Cxb.a(str2, "[ERRORCODE]", bVar.toString(), false, 4, (Object) null);
                if (a3 != null) {
                    str = a3;
                    String a4 = Cxb.a(str, "[CACHEBUSTING]", this.d.a(), false, 4, (Object) null);
                    String encode = URLEncoder.encode(this.a.format(this.c.b()), C5053KKa.c.displayName());
                    C7471uYa.a((Object) encode, "URLEncoder.encode(dateFo…sets.UTF_8.displayName())");
                    String a5 = Cxb.a(a4, "[TIMESTAMP]", encode, false, 4, (Object) null);
                    String encode2 = URLEncoder.encode(a(this.e.a()));
                    C7471uYa.a((Object) encode2, "URLEncoder.encode(format…ositionTracker.position))");
                    String a6 = Cxb.a(Cxb.a(a5, "[CONTENTPLAYHEAD]", encode2, false, 4, (Object) null), "[PLAYERSTATE]", a().a(), false, 4, (Object) null);
                    a(a6, y);
                    return a6;
                }
            }
            str = a2;
            String a42 = Cxb.a(str, "[CACHEBUSTING]", this.d.a(), false, 4, (Object) null);
            String encode3 = URLEncoder.encode(this.a.format(this.c.b()), C5053KKa.c.displayName());
            C7471uYa.a((Object) encode3, "URLEncoder.encode(dateFo…sets.UTF_8.displayName())");
            String a52 = Cxb.a(a42, "[TIMESTAMP]", encode3, false, 4, (Object) null);
            String encode22 = URLEncoder.encode(a(this.e.a()));
            C7471uYa.a((Object) encode22, "URLEncoder.encode(format…ositionTracker.position))");
            String a62 = Cxb.a(Cxb.a(a52, "[CONTENTPLAYHEAD]", encode22, false, 4, (Object) null), "[PLAYERSTATE]", a().a(), false, 4, (Object) null);
            a(a62, y);
            return a62;
        }
        throw new S("[ERRORCODE] is there but errorCode was not provided!");
    }

    public static /* synthetic */ List a(Yaa yaa, List list, C0090b bVar, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                bVar = null;
            }
            return yaa.a(list, bVar);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: build");
    }

    private void a(String str, Y y) {
        if (!URLUtil.isValidUrl(str)) {
            C3469VY vy = this.g;
            StringBuilder sb = new StringBuilder();
            sb.append("Malformed urlWithPlaceholder! Raw value: ");
            sb.append(y.a());
            sb.append(", after building: ");
            sb.append(str);
            a.a(vy, new MalformedURLException(sb.toString()), null, 2, null);
        }
    }

    private String a(long j) {
        KYa kYa = KYa.a;
        Locale locale = Locale.US;
        C7471uYa.a((Object) locale, "Locale.US");
        Object[] objArr = {Long.valueOf(TimeUnit.MILLISECONDS.toHours(j)), Long.valueOf(TimeUnit.MILLISECONDS.toMinutes(j) - TimeUnit.HOURS.toMinutes(TimeUnit.MILLISECONDS.toHours(j))), Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(j) - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(j))), Long.valueOf(j - TimeUnit.SECONDS.toMillis(TimeUnit.MILLISECONDS.toSeconds(j)))};
        String format = String.format(locale, this.b, Arrays.copyOf(objArr, objArr.length));
        C7471uYa.a((Object) format, "java.lang.String.format(locale, format, *args)");
        return format;
    }

    private C3703e a() {
        return this.f.a() ? C3703e.FOREGROUND : C3703e.BACKGROUND;
    }

    public List<String> a(List<Y> list, C0090b bVar) {
        C7471uYa.b(list, "urlWithPlaceholders");
        ArrayList arrayList = new ArrayList(C6986nWa.a((Iterable) list, 10));
        for (Y a2 : list) {
            arrayList.add(a(a2, bVar));
        }
        return arrayList;
    }
}
