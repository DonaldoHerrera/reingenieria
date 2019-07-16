package defpackage;

import android.os.Bundle;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: Ig reason: default package */
public class Ig {
    public static Bundle a(Map<String, String> map) {
        Bundle bundle = new Bundle();
        if (map != null) {
            for (Entry entry : map.entrySet()) {
                bundle.putString((String) entry.getKey(), (String) entry.getValue());
            }
        }
        return bundle;
    }
}
