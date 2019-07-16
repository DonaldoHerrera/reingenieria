package defpackage;

import java.io.File;
import java.util.List;

/* renamed from: xh reason: default package and case insensitive filesystem */
/* compiled from: SessionAnalyticsFilesSender */
class C1843xh extends C6637iNa implements C7323sOa {
    private final String g;

    public C1843xh(C5531_Ma _ma, String str, String str2, C4839DOa dOa, String str3) {
        super(_ma, str, str2, dOa, C7806zOa.POST);
        this.g = str3;
    }

    public boolean a(List<File> list) {
        C4777BOa a = a();
        a.c("X-CRASHLYTICS-API-CLIENT-TYPE", "android");
        a.c("X-CRASHLYTICS-API-CLIENT-VERSION", this.f.x());
        a.c("X-CRASHLYTICS-API-KEY", this.g);
        int i = 0;
        for (File file : list) {
            StringBuilder sb = new StringBuilder();
            sb.append("session_analytics_file_");
            sb.append(i);
            a.a(sb.toString(), file.getName(), "application/vnd.crashlytics.android.events", file);
            i++;
        }
        C5701cNa e = C5328TMa.e();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Sending ");
        sb2.append(list.size());
        sb2.append(" analytics files to ");
        sb2.append(b());
        String sb3 = sb2.toString();
        String str = "Answers";
        e.d(str, sb3);
        int g2 = a.g();
        C5701cNa e2 = C5328TMa.e();
        StringBuilder sb4 = new StringBuilder();
        sb4.append("Response code for analytics file send is ");
        sb4.append(g2);
        e2.d(str, sb4.toString());
        if (C5087LNa.a(g2) == 0) {
            return true;
        }
        return false;
    }
}
