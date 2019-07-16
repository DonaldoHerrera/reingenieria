package defpackage;

import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: _i reason: default package */
/* compiled from: MetaDataStore */
class _i {
    private static final Charset a = Charset.forName("UTF-8");
    private final File b;

    public _i(File file) {
        this.b = file;
    }

    private static C1785vj d(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        return new C1785vj(a(jSONObject, "userId"), a(jSONObject, "userName"), a(jSONObject, "userEmail"));
    }

    public void a(String str, Map<String, String> map) {
        String str2 = "Failed to close key/value metadata file.";
        File a2 = a(str);
        BufferedWriter bufferedWriter = null;
        try {
            String a3 = a(map);
            BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(a2), a));
            try {
                bufferedWriter2.write(a3);
                bufferedWriter2.flush();
                C7391tNa.a((Closeable) bufferedWriter2, str2);
            } catch (Exception e) {
                e = e;
                bufferedWriter = bufferedWriter2;
                try {
                    C5328TMa.e().e("CrashlyticsCore", "Error serializing key/value metadata.", e);
                    C7391tNa.a((Closeable) bufferedWriter, str2);
                } catch (Throwable th) {
                    th = th;
                    C7391tNa.a((Closeable) bufferedWriter, str2);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                bufferedWriter = bufferedWriter2;
                C7391tNa.a((Closeable) bufferedWriter, str2);
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            C5328TMa.e().e("CrashlyticsCore", "Error serializing key/value metadata.", e);
            C7391tNa.a((Closeable) bufferedWriter, str2);
        }
    }

    public File b(String str) {
        File file = this.b;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("user");
        sb.append(".meta");
        return new File(file, sb.toString());
    }

    public C1785vj c(String str) {
        String str2 = "Failed to close user metadata file.";
        File b2 = b(str);
        if (!b2.exists()) {
            return C1785vj.a;
        }
        FileInputStream fileInputStream = null;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(b2);
            try {
                C1785vj d = d(C7391tNa.b((InputStream) fileInputStream2));
                C7391tNa.a((Closeable) fileInputStream2, str2);
                return d;
            } catch (Exception e) {
                e = e;
                fileInputStream = fileInputStream2;
                try {
                    C5328TMa.e().e("CrashlyticsCore", "Error deserializing user metadata.", e);
                    C7391tNa.a((Closeable) fileInputStream, str2);
                    return C1785vj.a;
                } catch (Throwable th) {
                    th = th;
                    C7391tNa.a((Closeable) fileInputStream, str2);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                fileInputStream = fileInputStream2;
                C7391tNa.a((Closeable) fileInputStream, str2);
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            C5328TMa.e().e("CrashlyticsCore", "Error deserializing user metadata.", e);
            C7391tNa.a((Closeable) fileInputStream, str2);
            return C1785vj.a;
        }
    }

    public File a(String str) {
        File file = this.b;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("keys");
        sb.append(".meta");
        return new File(file, sb.toString());
    }

    private static String a(Map<String, String> map) throws JSONException {
        return new JSONObject(map).toString();
    }

    private static String a(JSONObject jSONObject, String str) {
        if (!jSONObject.isNull(str)) {
            return jSONObject.optString(str, null);
        }
        return null;
    }
}
