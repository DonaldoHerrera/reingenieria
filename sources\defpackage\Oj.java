package defpackage;

import android.annotation.TargetApi;
import android.app.job.JobInfo;
import android.app.job.JobInfo.Builder;
import android.content.Context;
import android.os.Build.VERSION;
import com.evernote.android.job.s;
import com.evernote.android.job.s.d;

@TargetApi(26)
/* renamed from: Oj reason: default package */
/* compiled from: JobProxy26 */
public class Oj extends Mj {
    public Oj(Context context) {
        super(context, "JobProxy26");
    }

    /* access modifiers changed from: protected */
    public Builder a(s sVar, Builder builder) {
        return builder.setTransientExtras(sVar.q());
    }

    /* access modifiers changed from: protected */
    public boolean a(JobInfo jobInfo, s sVar) {
        return jobInfo != null && jobInfo.getId() == sVar.k();
    }

    /* access modifiers changed from: protected */
    public Builder a(s sVar, boolean z) {
        return super.a(sVar, z).setRequiresBatteryNotLow(sVar.A()).setRequiresStorageNotLow(sVar.D());
    }

    /* access modifiers changed from: protected */
    public int a(d dVar) {
        if (Nj.a[dVar.ordinal()] != 1) {
            return super.a(dVar);
        }
        if (VERSION.SDK_INT >= 28) {
        }
        return 4;
    }
}
