package defpackage;

import android.content.Context;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: LU reason: default package and case insensitive filesystem */
/* compiled from: ExperimentStorage */
public class C2156LU {
    private final a a;
    private final File b;

    /* renamed from: LU$a */
    /* compiled from: ExperimentStorage */
    static class a {
        public <T> T a(String str, C4990IKa<T> iKa) throws IOException, Lea {
            if (C2020EU.class.equals(iKa.a())) {
                try {
                    return a(str);
                } catch (JSONException e) {
                    throw new Lea((Exception) e);
                }
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Assignment Transformer requires target type of ");
                sb.append(C2020EU.class);
                throw new IllegalArgumentException(sb.toString());
            }
        }

        private <T> T a(String str) throws JSONException {
            JSONArray jSONArray = new JSONArray(str);
            ArrayList arrayList = new ArrayList(jSONArray.length());
            for (int i = 0; i < jSONArray.length(); i++) {
                arrayList.add(a(jSONArray.getJSONObject(i)));
            }
            return new C2020EU(arrayList);
        }

        private C2232PU a(JSONObject jSONObject) throws JSONException {
            C2232PU pu = new C2232PU(jSONObject.getString("layer_name"), jSONObject.getInt("experiment_id"), jSONObject.getString("experiment_name"), jSONObject.getInt("variant_id"), jSONObject.getString("variant_name"));
            return pu;
        }

        public String a(Object obj) throws Lea {
            if (obj.getClass().equals(C2020EU.class)) {
                try {
                    return a((C2020EU) obj).toString();
                } catch (JSONException e) {
                    throw new Lea((Exception) e);
                }
            } else {
                throw new IllegalArgumentException();
            }
        }

        private JSONArray a(C2020EU eu) throws JSONException {
            JSONArray jSONArray = new JSONArray();
            for (C2232PU a : eu.b()) {
                jSONArray.put(a(a));
            }
            return jSONArray;
        }

        private JSONObject a(C2232PU pu) throws JSONException {
            return new JSONObject().put("layer_name", pu.c()).put("experiment_id", pu.a()).put("experiment_name", pu.b()).put("variant_id", pu.d()).put("variant_name", pu.e());
        }
    }

    C2156LU(Context context, a aVar) {
        this.a = aVar;
        this.b = new File(context.getFilesDir(), ".assignment");
    }

    private C2020EU c() {
        String str = "";
        try {
            str = C6698jGa.a((InputStream) new FileInputStream(this.b));
            return (C2020EU) this.a.a(str, C4990IKa.a(C2020EU.class));
        } catch (IOException e) {
            C7316sHa.d(e);
            return C2020EU.a();
        } catch (Lea e2) {
            StringBuilder sb = new StringBuilder();
            sb.append("Failed parsing assignment; json = ");
            sb.append(str);
            C7316sHa.d(new IllegalStateException(sb.toString(), e2));
            C6630iGa.b(this.b);
            return C2020EU.a();
        }
    }

    /* access modifiers changed from: 0000 */
    public void a(C2020EU eu) {
        try {
            a(this.a.a((Object) eu));
        } catch (Lea e) {
            C7316sHa.b((Throwable) e, C2156LU.class);
        }
    }

    public C2020EU b() {
        return this.b.exists() ? c() : C2020EU.a();
    }

    private void a(String str) {
        FileOutputStream fileOutputStream = null;
        try {
            FileOutputStream fileOutputStream2 = new FileOutputStream(this.b);
            try {
                fileOutputStream2.write(str.getBytes(StandardCharsets.UTF_8));
                C6698jGa.a((Closeable) fileOutputStream2);
            } catch (IOException e) {
                e = e;
                fileOutputStream = fileOutputStream2;
                try {
                    C7316sHa.b((Throwable) e, C6698jGa.class);
                    C6698jGa.a((Closeable) fileOutputStream);
                } catch (Throwable th) {
                    th = th;
                    C6698jGa.a((Closeable) fileOutputStream);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream = fileOutputStream2;
                C6698jGa.a((Closeable) fileOutputStream);
                throw th;
            }
        } catch (IOException e2) {
            e = e2;
            C7316sHa.b((Throwable) e, C6698jGa.class);
            C6698jGa.a((Closeable) fileOutputStream);
        }
    }

    public void a() {
        C6630iGa.b(this.b);
    }
}
