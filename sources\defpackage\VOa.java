package defpackage;

import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStream;
import org.json.JSONObject;

/* renamed from: VOa reason: default package */
/* compiled from: DefaultCachedSettingsIo */
class VOa implements TOa {
    private final C5531_Ma a;

    public VOa(C5531_Ma _ma) {
        this.a = _ma;
    }

    public JSONObject a() {
        Throwable th;
        FileInputStream fileInputStream;
        JSONObject jSONObject;
        String str = "Error while closing settings cache file.";
        String str2 = "Fabric";
        C5328TMa.e().d(str2, "Reading cached settings...");
        FileInputStream fileInputStream2 = null;
        try {
            File file = new File(new C5025JOa(this.a).a(), "com.crashlytics.settings.json");
            if (file.exists()) {
                fileInputStream = new FileInputStream(file);
                try {
                    jSONObject = new JSONObject(C7391tNa.b((InputStream) fileInputStream));
                    fileInputStream2 = fileInputStream;
                } catch (Exception e) {
                    e = e;
                    try {
                        C5328TMa.e().e(str2, "Failed to fetch cached settings", e);
                        C7391tNa.a((Closeable) fileInputStream, str);
                        return null;
                    } catch (Throwable th2) {
                        th = th2;
                        fileInputStream2 = fileInputStream;
                        C7391tNa.a((Closeable) fileInputStream2, str);
                        throw th;
                    }
                }
            } else {
                C5328TMa.e().d(str2, "No cached settings found.");
                jSONObject = null;
            }
            C7391tNa.a((Closeable) fileInputStream2, str);
            return jSONObject;
        } catch (Exception e2) {
            e = e2;
            fileInputStream = null;
            C5328TMa.e().e(str2, "Failed to fetch cached settings", e);
            C7391tNa.a((Closeable) fileInputStream, str);
            return null;
        } catch (Throwable th3) {
            th = th3;
            C7391tNa.a((Closeable) fileInputStream2, str);
            throw th;
        }
    }

    public void a(long j, JSONObject jSONObject) {
        String str = "Failed to close settings writer.";
        String str2 = "Fabric";
        C5328TMa.e().d(str2, "Writing settings to cache file...");
        if (jSONObject != null) {
            FileWriter fileWriter = null;
            try {
                jSONObject.put("expires_at", j);
                FileWriter fileWriter2 = new FileWriter(new File(new C5025JOa(this.a).a(), "com.crashlytics.settings.json"));
                try {
                    fileWriter2.write(jSONObject.toString());
                    fileWriter2.flush();
                    C7391tNa.a((Closeable) fileWriter2, str);
                } catch (Exception e) {
                    e = e;
                    fileWriter = fileWriter2;
                    try {
                        C5328TMa.e().e(str2, "Failed to cache settings", e);
                        C7391tNa.a((Closeable) fileWriter, str);
                    } catch (Throwable th) {
                        th = th;
                        C7391tNa.a((Closeable) fileWriter, str);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fileWriter = fileWriter2;
                    C7391tNa.a((Closeable) fileWriter, str);
                    throw th;
                }
            } catch (Exception e2) {
                e = e2;
                C5328TMa.e().e(str2, "Failed to cache settings", e);
                C7391tNa.a((Closeable) fileWriter, str);
            }
        }
    }
}
