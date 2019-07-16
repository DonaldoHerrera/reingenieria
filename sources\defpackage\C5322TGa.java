package defpackage;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Process;
import com.mattprecious.telescope.TelescopeFileProvider;
import com.soundcloud.android.ia.c;
import com.soundcloud.android.ia.p;
import com.soundcloud.android.properties.j;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

@EVa(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u0000 52\u00020\u0001:\u00015BI\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\b\u0001\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011¢\u0006\u0002\u0010\u0012J\u001e\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0012J&\u0010 \u001a\u00020!2\u0006\u0010\u001c\u001a\u00020\u001d2\b\b\u0001\u0010\"\u001a\u00020#2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u001fH\u0017J:\u0010%\u001a\u00020&2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010'\u001a\u00020\u00142\u0006\u0010(\u001a\u00020\u00142\u0006\u0010)\u001a\u00020\u00142\u0006\u0010*\u001a\u00020\u00142\b\u0010$\u001a\u0004\u0018\u00010\u001fH\u0013J\u001c\u0010+\u001a\u00020&2\u0006\u0010\u001c\u001a\u00020\u001d2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u001fH\u0017J\u0010\u0010-\u001a\u00020&2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010.\u001a\u00020&H\u0012J\u001a\u0010/\u001a\u00020&*\u0002002\f\u00101\u001a\b\u0012\u0004\u0012\u00020\u001b02H\u0012J\u001a\u00103\u001a\u00020&*\b\u0012\u0004\u0012\u00020\u001b022\u0006\u00104\u001a\u00020\u001bH\u0012R\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\u00020\u00148RX\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\u00020\u00148RX\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0016R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000¨\u00066"}, d2 = {"Lcom/soundcloud/android/utils/BugReporter;", "", "applicationProperties", "Lcom/soundcloud/android/properties/ApplicationProperties;", "deviceHelper", "Lcom/soundcloud/android/utils/DeviceHelper;", "playQueueManager", "Lcom/soundcloud/android/features/playqueue/PlayQueueManager;", "resources", "Landroid/content/res/Resources;", "scheduler", "Lio/reactivex/Scheduler;", "errorReporter", "Lcom/soundcloud/android/error/reporting/ErrorReporter;", "appFeatures", "Lcom/soundcloud/android/properties/AppFeatures;", "observerFactory", "Lcom/soundcloud/android/rx/observers/ObserverFactory;", "(Lcom/soundcloud/android/properties/ApplicationProperties;Lcom/soundcloud/android/utils/DeviceHelper;Lcom/soundcloud/android/features/playqueue/PlayQueueManager;Landroid/content/res/Resources;Lio/reactivex/Scheduler;Lcom/soundcloud/android/error/reporting/ErrorReporter;Lcom/soundcloud/android/properties/AppFeatures;Lcom/soundcloud/android/rx/observers/ObserverFactory;)V", "emailBody", "", "getEmailBody", "()Ljava/lang/String;", "playQueueSnapshotForEmailBody", "getPlayQueueSnapshotForEmailBody", "collectLogCat", "Lio/reactivex/Single;", "Landroid/net/Uri;", "context", "Landroid/content/Context;", "outputFile", "Ljava/io/File;", "getFeedbackDialog", "Landroid/app/AlertDialog;", "options", "", "screenshot", "sendLogs", "", "toEmail", "subject", "body", "chooserText", "showGeneralFeedbackDialog", "screenshotFile", "showSignInFeedbackDialog", "whitelistThisApp", "addAttachments", "Landroid/content/Intent;", "attachments", "Ljava/util/ArrayList;", "addIfNotEmpty", "uri", "Companion", "base_release"}, mv = {1, 1, 15})
/* renamed from: TGa reason: default package and case insensitive filesystem */
/* compiled from: BugReporter.kt */
public class C5322TGa {
    public static final a a = new a(null);
    /* access modifiers changed from: private */
    public final j b;
    /* access modifiers changed from: private */
    public final C6699jHa c;
    private final C3814lca d;
    /* access modifiers changed from: private */
    public final Resources e;
    private final HPa f;
    /* access modifiers changed from: private */
    public final C3469VY g;
    private final com.soundcloud.android.properties.a h;
    private final C5606ava i;

    /* renamed from: TGa$a */
    /* compiled from: BugReporter.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }
    }

    public C5322TGa(j jVar, C6699jHa jha, C3814lca lca, Resources resources, HPa hPa, C3469VY vy, com.soundcloud.android.properties.a aVar, C5606ava ava) {
        C7471uYa.b(jVar, "applicationProperties");
        C7471uYa.b(jha, "deviceHelper");
        C7471uYa.b(lca, "playQueueManager");
        C7471uYa.b(resources, "resources");
        C7471uYa.b(hPa, "scheduler");
        C7471uYa.b(vy, "errorReporter");
        C7471uYa.b(aVar, "appFeatures");
        C7471uYa.b(ava, "observerFactory");
        this.b = jVar;
        this.c = jha;
        this.d = lca;
        this.e = resources;
        this.f = hPa;
        this.g = vy;
        this.h = aVar;
        this.i = ava;
    }

    public AlertDialog a(Context context, int i2) {
        return a(this, context, i2, (File) null, 4, (Object) null);
    }

    public void a(Context context) {
        a(this, context, null, 2, null);
    }

    private String b() {
        C4928GKa g2 = this.d.g();
        C7471uYa.a((Object) g2, "currentItemUrn");
        String str = "Q(";
        if (g2.c()) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(this.d.p());
            sb.append(")[");
            sb.append((C3508cda) g2.b());
            sb.append("]");
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(this.d.p());
        sb2.append(")[EMPTY-ITEM]");
        return sb2.toString();
    }

    /* access modifiers changed from: private */
    public void c() throws IOException, InterruptedException {
        int myPid = Process.myPid();
        StringBuilder sb = new StringBuilder();
        sb.append("logcat -P '");
        sb.append(myPid);
        sb.append('\'');
        Runtime.getRuntime().exec(sb.toString()).waitFor();
    }

    /* access modifiers changed from: private */
    public String a() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.e.getString(p.feedback_email_describe_problem));
        sb.append("\n\n\n");
        sb.append(this.c.j());
        sb.append(" ");
        sb.append(this.c.i());
        String str = "\n";
        sb.append(str);
        sb.append(b());
        sb.append(str);
        sb.append(this.h.d());
        return sb.toString();
    }

    public void b(Context context) {
        C7471uYa.b(context, "context");
        C5232QGa.a((Dialog) a(context, c.feedback_sign_in, (File) null));
    }

    private IPa<Uri> b(Context context, File file) {
        IPa<Uri> a2 = IPa.a((LPa<T>) new C5351UGa<T>(this, file, context));
        C7471uYa.a((Object) a2, "Single.create { emitter …Y, outputFile))\n        }");
        return a2;
    }

    public static /* synthetic */ void a(C5322TGa tGa, Context context, File file, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 2) != 0) {
                file = null;
            }
            tGa.a(context, file);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showGeneralFeedbackDialog");
    }

    public void a(Context context, File file) {
        C7471uYa.b(context, "context");
        C5232QGa.a((Dialog) a(context, c.feedback_general, file));
    }

    public static /* synthetic */ AlertDialog a(C5322TGa tGa, Context context, int i2, File file, int i3, Object obj) {
        if (obj == null) {
            if ((i3 & 4) != 0) {
                file = null;
            }
            return tGa.a(context, i2, file);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getFeedbackDialog");
    }

    public AlertDialog a(Context context, int i2, File file) {
        C7471uYa.b(context, "context");
        String[] stringArray = this.e.getStringArray(i2);
        AlertDialog create = new Builder(context).setTitle(p.select_feedback_category).setItems(stringArray, new C5380VGa(this, stringArray, context, file)).create();
        C7471uYa.a((Object) create, "AlertDialog.Builder(cont… )\n            }.create()");
        return create;
    }

    /* access modifiers changed from: private */
    @SuppressLint({"CheckResult"})
    public void a(Context context, String str, String str2, String str3, String str4, File file) {
        Intent intent = new Intent("android.intent.action.SEND_MULTIPLE");
        intent.setType("message/rfc822");
        intent.putExtra("android.intent.extra.EMAIL", new String[]{str});
        intent.putExtra("android.intent.extra.SUBJECT", str2);
        intent.putExtra("android.intent.extra.TEXT", str3);
        ArrayList arrayList = new ArrayList(2);
        if (file != null) {
            arrayList.add(TelescopeFileProvider.a(context, file));
        }
        File a2 = C4739AHa.a(context, "logcat", "log.txt");
        if (a2 == null) {
            SDb.b("Failed to get external storage directory for logcat file. Sending bug report without logs.", new Object[0]);
            a(intent, arrayList);
            context.startActivity(Intent.createChooser(intent, str4));
            return;
        }
        IPa a3 = b(context, a2).b(this.f).a(RPa.a());
        C5606ava ava = this.i;
        C5409WGa wGa = new C5409WGa(this, arrayList, intent, context, str4);
        a3.c(ava.c(wGa));
    }

    /* access modifiers changed from: private */
    public void a(ArrayList<Uri> arrayList, Uri uri) {
        if (!C7471uYa.a((Object) Uri.EMPTY, (Object) uri)) {
            arrayList.add(uri);
        }
    }

    /* access modifiers changed from: private */
    public void a(Intent intent, ArrayList<Uri> arrayList) {
        if (!arrayList.isEmpty()) {
            intent.putParcelableArrayListExtra("android.intent.extra.STREAM", arrayList);
        }
    }
}
