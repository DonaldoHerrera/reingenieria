package defpackage;

import android.net.Uri;
import com.google.common.base.Function;
import com.soundcloud.android.deeplinks.e;
import com.soundcloud.android.deeplinks.k;
import java.util.EnumSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: gja reason: default package and case insensitive filesystem */
/* compiled from: LocalEntityUriResolver */
public class C4565gja {
    private static final Pattern a = Pattern.compile("^(http[s]?)?(://)(www\\.)?(m\\.)?(soundcloud\\.com/)(.+)");
    private static final Pattern b = Pattern.compile("^soundcloud:(//)?(.+)");
    private static final Pattern c = Pattern.compile("^([a-z\\-]+)[/:]([^/?]+)$");
    private static final Pattern d = Pattern.compile("^\\d+$");
    private static final EnumSet<C3751dda> e = EnumSet.of(C3751dda.TRACKS, new C3751dda[]{C3751dda.PLAYLISTS, C3751dda.USERS, C3751dda.SYSTEM_PLAYLIST, C3751dda.ARTIST_STATIONS, C3751dda.TRACK_STATIONS});

    static /* synthetic */ IPa d(String str) {
        C3508cda cda;
        Matcher matcher = c.matcher(str);
        if (matcher.matches()) {
            String group = matcher.group(1);
            String group2 = matcher.group(2);
            if (d.matcher(group2).matches()) {
                cda = new C3508cda(C3767fda.SOUNDCLOUD, C3751dda.a(group), Long.valueOf(group2).longValue());
            } else if (group2.startsWith(C3767fda.SOUNDCLOUD.a())) {
                cda = new C3508cda(group2);
            } else {
                cda = new C3508cda(C3767fda.SOUNDCLOUD, C3751dda.a(group), group2);
            }
            return IPa.a(cda);
        }
        throw new IllegalStateException("canResolveLocally should be called before to verify the URN can be extracted");
    }

    private C4928GKa<String> f(String str) {
        Matcher matcher = a.matcher(str);
        Matcher matcher2 = b.matcher(str);
        String str2 = matcher.matches() ? matcher.group(6) : matcher2.matches() ? matcher2.group(2) : null;
        return C4928GKa.b(str2);
    }

    public boolean a(String str) {
        return ((Boolean) f(str).b((Function<? super T, V>) new Lia<Object,V>(this)).d(Boolean.valueOf(false))).booleanValue();
    }

    public boolean b(String str) {
        return !e.b(Uri.parse(str)).b();
    }

    public /* synthetic */ Boolean c(String str) {
        Matcher matcher = c.matcher(str);
        if (!matcher.matches()) {
            return Boolean.valueOf(false);
        }
        return Boolean.valueOf(a(C3751dda.a(matcher.group(1))));
    }

    public IPa<C3508cda> e(String str) throws k {
        try {
            return (IPa) f(str).b((Function<? super T, V>) Mia.a).b();
        } catch (Exception e2) {
            StringBuilder sb = new StringBuilder();
            sb.append("LocalEntity uri ");
            sb.append(str);
            sb.append(" could not be resolved. Did you check before with #canResolveLocally?");
            throw new k(sb.toString(), e2);
        }
    }

    public boolean a(C3508cda cda) {
        return a(C3751dda.a(cda));
    }

    private boolean a(C3751dda dda) {
        return e.contains(dda);
    }
}
