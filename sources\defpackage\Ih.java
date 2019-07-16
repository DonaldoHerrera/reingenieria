package defpackage;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Build.VERSION;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: Ih reason: default package */
/* compiled from: BinaryImagesConverter */
class Ih {
    private final Context a;
    private final a b;

    /* renamed from: Ih$a */
    /* compiled from: BinaryImagesConverter */
    interface a {
        String a(File file) throws IOException;
    }

    Ih(Context context, a aVar) {
        this.a = context;
        this.b = aVar;
    }

    private JSONArray b(BufferedReader bufferedReader) throws IOException {
        JSONArray jSONArray = new JSONArray();
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                return jSONArray;
            }
            JSONObject c = c(readLine);
            if (c != null) {
                jSONArray.put(c);
            }
        }
    }

    private JSONObject c(String str) {
        String str2 = "CrashlyticsCore";
        C1359hj a2 = C1389ij.a(str);
        if (a2 != null && a(a2)) {
            try {
                try {
                    return a(this.b.a(b(a2.d)), a2);
                } catch (JSONException e) {
                    C5328TMa.e().a(str2, "Could not create a binary image json string", e);
                    return null;
                }
            } catch (IOException e2) {
                C5701cNa e3 = C5328TMa.e();
                StringBuilder sb = new StringBuilder();
                sb.append("Could not generate ID for file ");
                sb.append(a2.d);
                e3.a(str2, sb.toString(), e2);
            }
        }
        return null;
    }

    private JSONArray d(String str) {
        JSONArray jSONArray = new JSONArray();
        try {
            String[] split = b(new JSONObject(str).getJSONArray("maps")).split("\\|");
            for (String c : split) {
                JSONObject c2 = c(c);
                if (c2 != null) {
                    jSONArray.put(c2);
                }
            }
            return jSONArray;
        } catch (JSONException e) {
            C5328TMa.e().b("CrashlyticsCore", "Unable to parse proc maps string", e);
            return jSONArray;
        }
    }

    /* access modifiers changed from: 0000 */
    public byte[] a(String str) throws IOException {
        return a(d(str));
    }

    /* access modifiers changed from: 0000 */
    public byte[] a(BufferedReader bufferedReader) throws IOException {
        return a(b(bufferedReader));
    }

    private File a(File file) {
        if (VERSION.SDK_INT < 9) {
            return file;
        }
        if (file.getAbsolutePath().startsWith("/data")) {
            try {
                file = new File(this.a.getPackageManager().getApplicationInfo(this.a.getPackageName(), 0).nativeLibraryDir, file.getName());
            } catch (NameNotFoundException e) {
                C5328TMa.e().e("CrashlyticsCore", "Error getting ApplicationInfo", e);
            }
        }
        return file;
    }

    private File b(String str) {
        File file = new File(str);
        return !file.exists() ? a(file) : file;
    }

    private static String b(JSONArray jSONArray) throws JSONException {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < jSONArray.length(); i++) {
            sb.append(jSONArray.getString(i));
        }
        return sb.toString();
    }

    private static byte[] a(JSONArray jSONArray) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("binary_images", jSONArray);
            return jSONObject.toString().getBytes();
        } catch (JSONException e) {
            C5328TMa.e().b("CrashlyticsCore", "Binary images string is null", e);
            return new byte[0];
        }
    }

    private static JSONObject a(String str, C1359hj hjVar) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("base_address", hjVar.a);
        jSONObject.put("size", hjVar.b);
        jSONObject.put("name", hjVar.d);
        jSONObject.put("uuid", str);
        return jSONObject;
    }

    private static boolean a(C1359hj hjVar) {
        return (hjVar.c.indexOf(120) == -1 || hjVar.d.indexOf(47) == -1) ? false : true;
    }
}
