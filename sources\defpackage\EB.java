package defpackage;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import java.util.List;

/* renamed from: EB reason: default package */
public final class EB {
    private final int a;
    private final int b;
    private final int c;
    private final long d;
    private final long e;
    private final List<String> f;
    private final List<String> g;
    private final PendingIntent h;
    List<Intent> i;

    private EB(int i2, int i3, int i4, long j, long j2, List<String> list, List<String> list2, PendingIntent pendingIntent, List<Intent> list3) {
        this.a = i2;
        this.b = i3;
        this.c = i4;
        this.d = j;
        this.e = j2;
        this.f = list;
        this.g = list2;
        this.h = pendingIntent;
        this.i = list3;
    }

    public static EB a(Bundle bundle) {
        EB eb = new EB(bundle.getInt("session_id"), bundle.getInt("status"), bundle.getInt("error_code"), bundle.getLong("bytes_downloaded"), bundle.getLong("total_bytes_to_download"), bundle.getStringArrayList("module_names"), bundle.getStringArrayList("languages"), (PendingIntent) bundle.getParcelable("user_confirmation_intent"), bundle.getParcelableArrayList("split_file_intents"));
        return eb;
    }

    public final int a() {
        return this.b;
    }

    /* access modifiers changed from: 0000 */
    public final EB a(int i2, int i3) {
        EB eb = new EB(this.a, i2, i3, this.d, this.e, this.f, this.g, this.h, this.i);
        return eb;
    }

    public final String toString() {
        int i2 = this.a;
        int i3 = this.b;
        int i4 = this.c;
        long j = this.d;
        long j2 = this.e;
        String valueOf = String.valueOf(this.f);
        String valueOf2 = String.valueOf(this.g);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 193 + String.valueOf(valueOf2).length());
        sb.append("SplitInstallSessionState{sessionId=");
        sb.append(i2);
        sb.append(", status=");
        sb.append(i3);
        sb.append(", errorCode=");
        sb.append(i4);
        sb.append(", bytesDownloaded=");
        sb.append(j);
        sb.append(",totalBytesToDownload=");
        sb.append(j2);
        sb.append(",moduleNames=");
        sb.append(valueOf);
        sb.append("languages=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
