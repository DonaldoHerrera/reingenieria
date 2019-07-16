package defpackage;

import android.annotation.TargetApi;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import com.evernote.android.job.n;
import com.evernote.android.job.s;
import com.evernote.android.job.v14.a;

@TargetApi(19)
/* renamed from: Kj reason: default package */
/* compiled from: JobProxy19 */
public class Kj extends a {
    public Kj(Context context) {
        super(context, "JobProxy19");
    }

    /* access modifiers changed from: protected */
    public void b(s sVar, AlarmManager alarmManager, PendingIntent pendingIntent) {
        alarmManager.setWindow(1, System.currentTimeMillis() + n.a.g(sVar), n.a.d(sVar) - n.a.g(sVar), pendingIntent);
        this.b.a("Scheduled repeating alarm (flex support), %s, start %s, end %s, flex %s", sVar, Gj.a(n.a.g(sVar)), Gj.a(n.a.d(sVar)), Gj.a(sVar.h()));
    }

    /* access modifiers changed from: protected */
    public void c(s sVar, AlarmManager alarmManager, PendingIntent pendingIntent) {
        alarmManager.setWindow(1, System.currentTimeMillis() + n.a.f(sVar), n.a.c(sVar) - n.a.f(sVar), pendingIntent);
        this.b.a("Schedule alarm, %s, start %s, end %s", sVar, Gj.a(n.a.f(sVar)), Gj.a(n.a.c(sVar)));
    }
}
