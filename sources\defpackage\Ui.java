package defpackage;

import android.content.Context;

/* renamed from: Ui reason: default package */
/* compiled from: DialogStringResolver */
class Ui {
    private final Context a;
    private final C5567aPa b;

    public Ui(Context context, C5567aPa apa) {
        this.a = context;
        this.b = apa;
    }

    public String a() {
        return a("com.crashlytics.CrashSubmissionAlwaysSendTitle", this.b.g);
    }

    public String b() {
        return a("com.crashlytics.CrashSubmissionCancelTitle", this.b.e);
    }

    public String c() {
        return a("com.crashlytics.CrashSubmissionPromptMessage", this.b.b);
    }

    public String d() {
        return a("com.crashlytics.CrashSubmissionSendTitle", this.b.c);
    }

    public String e() {
        return a("com.crashlytics.CrashSubmissionPromptTitle", this.b.a);
    }

    private String a(String str, String str2) {
        return b(C7391tNa.b(this.a, str), str2);
    }

    private String b(String str, String str2) {
        return a(str) ? str2 : str;
    }

    private boolean a(String str) {
        return str == null || str.length() == 0;
    }
}
