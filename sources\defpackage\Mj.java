package defpackage;

import android.annotation.TargetApi;
import android.app.job.JobInfo.Builder;
import android.content.Context;
import com.evernote.android.job.s;
import com.evernote.android.job.s.d;
import com.evernote.android.job.v21.b;

@TargetApi(24)
/* renamed from: Mj reason: default package */
/* compiled from: JobProxy24 */
public class Mj extends b {
    public Mj(Context context) {
        this(context, "JobProxy24");
    }

    /* access modifiers changed from: protected */
    public int a(d dVar) {
        if (Lj.a[dVar.ordinal()] != 1) {
            return super.a(dVar);
        }
        return 3;
    }

    public boolean b(s sVar) {
        try {
            return a(a().getPendingJob(sVar.k()), sVar);
        } catch (Exception e) {
            this.b.a((Throwable) e);
            return false;
        }
    }

    public void c(s sVar) {
        this.b.d("plantPeriodicFlexSupport called although flex is supported");
        super.c(sVar);
    }

    public Mj(Context context, String str) {
        super(context, str);
    }

    /* access modifiers changed from: protected */
    public Builder b(Builder builder, long j, long j2) {
        return builder.setPeriodic(j, j2);
    }
}
