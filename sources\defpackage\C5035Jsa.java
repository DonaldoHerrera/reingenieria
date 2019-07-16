package defpackage;

import android.content.res.Resources;
import com.soundcloud.android.ia.o;
import com.soundcloud.android.ia.p;
import java.text.ParseException;
import java.util.concurrent.TimeUnit;

/* renamed from: Jsa reason: default package and case insensitive filesystem */
/* compiled from: PlaylistUtils */
public class C5035Jsa {
    public static String a(Resources resources, int i, long j) {
        String quantityString = resources.getQuantityString(o.number_of_sounds, i, new Object[]{Integer.valueOf(i)});
        return resources.getString(p.playlist_new_info_header_text_trackcount_duration, new Object[]{quantityString, C7315sGa.a(j, TimeUnit.MILLISECONDS)});
    }

    private static int b(String str) {
        char c;
        switch (str.hashCode()) {
            case -2076770877:
                if (str.equals("compilation")) {
                    c = 4;
                    break;
                }
            case -902265784:
                if (str.equals("single")) {
                    c = 3;
                    break;
                }
            case 3243:
                if (str.equals("ep")) {
                    c = 2;
                    break;
                }
            case 92896879:
                if (str.equals("album")) {
                    c = 1;
                    break;
                }
            case 1879474642:
                if (str.equals("playlist")) {
                    c = 0;
                    break;
                }
            default:
                c = 65535;
                break;
        }
        if (c == 0) {
            return p.set_type_default_label;
        }
        if (c == 1) {
            return p.set_type_album_label;
        }
        if (c == 2) {
            return p.set_type_ep_label;
        }
        if (c == 3) {
            return p.set_type_single_label;
        }
        if (c != 4) {
            return p.set_type_default_label;
        }
        return p.set_type_compilation_label;
    }

    public static String a(Resources resources, String str, boolean z, String str2) {
        String string = resources.getString(b(str));
        if (!z) {
            return string;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(string);
        String a = a(str2);
        if (!a.isEmpty()) {
            sb.append(String.format(" · %s", new Object[]{a}));
        }
        return sb.toString();
    }

    static String a(String str) {
        String str2 = "";
        if (str.isEmpty()) {
            return str2;
        }
        try {
            return Integer.toString(C6427fHa.a(str, "yyyy-MM-dd"));
        } catch (ParseException unused) {
            return str2;
        }
    }
}
