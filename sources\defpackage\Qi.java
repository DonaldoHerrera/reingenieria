package defpackage;

import java.io.File;
import java.util.Map.Entry;

/* renamed from: Qi reason: default package */
/* compiled from: DefaultCreateReportSpiCall */
class Qi extends C6637iNa implements Ni {
    public Qi(C5531_Ma _ma, String str, String str2, C4839DOa dOa) {
        super(_ma, str, str2, dOa, C7806zOa.POST);
    }

    public boolean a(Mi mi) {
        C4777BOa a = a();
        a(a, mi);
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
        sb2.append("Create report request ID: ");
        sb2.append(a.d("X-REQUEST-ID"));
        e2.d(str, sb2.toString());
        C5701cNa e3 = C5328TMa.e();
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Result was: ");
        sb3.append(g);
        e3.d(str, sb3.toString());
        return C5087LNa.a(g) == 0;
    }

    private C4777BOa a(C4777BOa bOa, Mi mi) {
        bOa.c("X-CRASHLYTICS-API-KEY", mi.a);
        bOa.c("X-CRASHLYTICS-API-CLIENT-TYPE", "android");
        bOa.c("X-CRASHLYTICS-API-CLIENT-VERSION", this.f.x());
        for (Entry a : mi.b.a().entrySet()) {
            bOa.a(a);
        }
        return bOa;
    }

    private C4777BOa a(C4777BOa bOa, C1513mj mjVar) {
        File[] d;
        bOa.e("report[identifier]", mjVar.b());
        String str = "application/octet-stream";
        String str2 = " to report ";
        String str3 = "CrashlyticsCore";
        if (mjVar.d().length == 1) {
            C5701cNa e = C5328TMa.e();
            StringBuilder sb = new StringBuilder();
            sb.append("Adding single file ");
            sb.append(mjVar.getFileName());
            sb.append(str2);
            sb.append(mjVar.b());
            e.d(str3, sb.toString());
            bOa.a("report[file]", mjVar.getFileName(), str, mjVar.c());
            return bOa;
        }
        int i = 0;
        for (File file : mjVar.d()) {
            C5701cNa e2 = C5328TMa.e();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Adding file ");
            sb2.append(file.getName());
            sb2.append(str2);
            sb2.append(mjVar.b());
            e2.d(str3, sb2.toString());
            StringBuilder sb3 = new StringBuilder();
            sb3.append("report[file");
            sb3.append(i);
            sb3.append("]");
            bOa.a(sb3.toString(), file.getName(), str, file);
            i++;
        }
        return bOa;
    }
}
