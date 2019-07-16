package defpackage;

import java.io.File;

/* renamed from: cj reason: default package and case insensitive filesystem */
/* compiled from: NativeCreateReportSpiCall */
class C0525cj extends C6637iNa implements Ni {
    public C0525cj(C5531_Ma _ma, String str, String str2, C4839DOa dOa) {
        super(_ma, str, str2, dOa, C7806zOa.POST);
    }

    public boolean a(Mi mi) {
        C4777BOa a = a();
        a(a, mi.a);
        a(a, mi.b);
        C5701cNa e = C5328TMa.e();
        StringBuilder sb = new StringBuilder();
        sb.append("Sending report to: ");
        sb.append(b());
        String str = "CrashlyticsCore";
        e.d(str, sb.toString());
        int g = a.g();
        C5701cNa e2 = C5328TMa.e();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Result was: ");
        sb2.append(g);
        e2.d(str, sb2.toString());
        return C5087LNa.a(g) == 0;
    }

    private C4777BOa a(C4777BOa bOa, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("Crashlytics Android SDK/");
        sb.append(this.f.x());
        bOa.c("User-Agent", sb.toString());
        bOa.c("X-CRASHLYTICS-API-CLIENT-TYPE", "android");
        bOa.c("X-CRASHLYTICS-API-CLIENT-VERSION", this.f.x());
        bOa.c("X-CRASHLYTICS-API-KEY", str);
        return bOa;
    }

    private C4777BOa a(C4777BOa bOa, C1513mj mjVar) {
        File[] d;
        bOa.e("report_id", mjVar.b());
        for (File file : mjVar.d()) {
            String str = "application/octet-stream";
            if (file.getName().equals("minidump")) {
                bOa.a("minidump_file", file.getName(), str, file);
            } else if (file.getName().equals("metadata")) {
                bOa.a("crash_meta_file", file.getName(), str, file);
            } else if (file.getName().equals("binaryImages")) {
                bOa.a("binary_images_file", file.getName(), str, file);
            } else if (file.getName().equals("session")) {
                bOa.a("session_meta_file", file.getName(), str, file);
            } else if (file.getName().equals("app")) {
                bOa.a("app_meta_file", file.getName(), str, file);
            } else if (file.getName().equals("device")) {
                bOa.a("device_meta_file", file.getName(), str, file);
            } else if (file.getName().equals("os")) {
                bOa.a("os_meta_file", file.getName(), str, file);
            } else if (file.getName().equals("user")) {
                bOa.a("user_meta_file", file.getName(), str, file);
            } else if (file.getName().equals("logs")) {
                bOa.a("logs_file", file.getName(), str, file);
            } else if (file.getName().equals("keys")) {
                bOa.a("keys_file", file.getName(), str, file);
            }
        }
        return bOa;
    }
}
