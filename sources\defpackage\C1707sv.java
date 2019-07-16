package defpackage;

import android.util.Log;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigValue;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.regex.Pattern;
import org.json.JSONException;

/* renamed from: sv reason: default package and case insensitive filesystem */
public final class C1707sv {
    public static final Charset a = Charset.forName("UTF-8");
    static final Pattern b = Pattern.compile("^(1|true|t|yes|y|on)$", 2);
    static final Pattern c = Pattern.compile("^(0|false|f|no|n|off|)$", 2);
    private final C1278ev d;
    private final C1278ev e;

    public C1707sv(C1278ev evVar, C1278ev evVar2) {
        this.d = evVar;
        this.e = evVar2;
    }

    public final boolean a(String str) {
        String str2 = "Boolean";
        String a2 = a(this.d, str, str2);
        if (a2 != null) {
            if (b.matcher(a2).matches()) {
                return true;
            }
            if (c.matcher(a2).matches()) {
                return false;
            }
        }
        String a3 = a(this.e, str, str2);
        if (a3 != null) {
            if (b.matcher(a3).matches()) {
                return true;
            }
            if (c.matcher(a3).matches()) {
            }
        }
        return false;
    }

    public final byte[] b(String str) {
        String str2 = "ByteArray";
        String a2 = a(this.d, str, str2);
        if (a2 != null) {
            return a2.getBytes(a);
        }
        String a3 = a(this.e, str, str2);
        if (a3 != null) {
            return a3.getBytes(a);
        }
        return FirebaseRemoteConfig.DEFAULT_VALUE_FOR_BYTE_ARRAY;
    }

    public final double c(String str) {
        Double a2 = a(this.d, str);
        if (a2 != null) {
            return a2.doubleValue();
        }
        Double a3 = a(this.e, str);
        return a3 != null ? a3.doubleValue() : FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
    }

    public final Set<String> d(String str) {
        if (str == null) {
            str = "";
        }
        TreeSet treeSet = new TreeSet();
        C1432jv a2 = this.d.a(5);
        if (a2 != null) {
            treeSet.addAll(a(str, a2));
        }
        C1432jv a3 = this.e.a(5);
        if (a3 != null) {
            treeSet.addAll(a(str, a3));
        }
        return treeSet;
    }

    public final long e(String str) {
        Long b2 = b(this.d, str);
        if (b2 != null) {
            return b2.longValue();
        }
        Long b3 = b(this.e, str);
        if (b3 != null) {
            return b3.longValue();
        }
        return 0;
    }

    public final String f(String str) {
        String str2 = "String";
        String a2 = a(this.d, str, str2);
        if (a2 != null) {
            return a2;
        }
        String a3 = a(this.e, str, str2);
        return a3 != null ? a3 : "";
    }

    public final FirebaseRemoteConfigValue g(String str) {
        String str2 = "FirebaseRemoteConfigValue";
        String a2 = a(this.d, str, str2);
        if (a2 != null) {
            return new Bv(a2, 2);
        }
        String a3 = a(this.e, str, str2);
        if (a3 != null) {
            return new Bv(a3, 1);
        }
        return new Bv("", 0);
    }

    private static Long b(C1278ev evVar, String str) {
        C1432jv a2 = evVar.a(5);
        if (a2 == null) {
            return null;
        }
        try {
            return Long.valueOf(a2.a().getLong(str));
        } catch (JSONException unused) {
            a(str, "Long");
            return null;
        }
    }

    private static TreeSet<String> a(String str, C1432jv jvVar) {
        TreeSet<String> treeSet = new TreeSet<>();
        Iterator keys = jvVar.a().keys();
        while (keys.hasNext()) {
            String str2 = (String) keys.next();
            if (str2.startsWith(str)) {
                treeSet.add(str2);
            }
        }
        return treeSet;
    }

    public final Map<String, FirebaseRemoteConfigValue> a() {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.addAll(a(this.d));
        hashSet.addAll(a(this.e));
        HashMap hashMap = new HashMap();
        for (String str : hashSet) {
            hashMap.put(str, g(str));
        }
        return hashMap;
    }

    private static String a(C1278ev evVar, String str, String str2) {
        C1432jv a2 = evVar.a(5);
        if (a2 == null) {
            return null;
        }
        try {
            return a2.a().getString(str);
        } catch (JSONException unused) {
            a(str, str2);
            return null;
        }
    }

    private static Double a(C1278ev evVar, String str) {
        C1432jv a2 = evVar.a(5);
        if (a2 == null) {
            return null;
        }
        try {
            return Double.valueOf(a2.a().getDouble(str));
        } catch (JSONException unused) {
            a(str, "Double");
            return null;
        }
    }

    private static Set<String> a(C1278ev evVar) {
        HashSet hashSet = new HashSet();
        C1432jv a2 = evVar.a(5);
        if (a2 == null) {
            return hashSet;
        }
        Iterator keys = a2.a().keys();
        while (keys.hasNext()) {
            hashSet.add((String) keys.next());
        }
        return hashSet;
    }

    private static void a(String str, String str2) {
        Object[] objArr = {str2, str};
        Log.w("FirebaseRemoteConfig", String.format("No value of type '%s' exists for parameter key '%s'.", objArr));
    }
}
