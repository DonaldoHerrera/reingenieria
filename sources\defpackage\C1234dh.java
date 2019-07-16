package defpackage;

import android.annotation.SuppressLint;
import android.content.Context;

/* renamed from: dh reason: default package and case insensitive filesystem */
/* compiled from: AnswersPreferenceManager */
class C1234dh {
    private final C5057KOa a;

    C1234dh(C5057KOa kOa) {
        this.a = kOa;
    }

    public static C1234dh a(Context context) {
        return new C1234dh(new C5088LOa(context, "settings"));
    }

    @SuppressLint({"CommitPrefEdits"})
    public void b() {
        C5057KOa kOa = this.a;
        kOa.a(kOa.edit().putBoolean("analytics_launched", true));
    }

    @SuppressLint({"CommitPrefEdits"})
    public boolean a() {
        return this.a.get().getBoolean("analytics_launched", false);
    }
}
