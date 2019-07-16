package defpackage;

import android.content.SharedPreferences.Editor;

/* renamed from: sK reason: default package and case insensitive filesystem */
/* compiled from: AlphaReminderDialogController.kt */
final class C3253sK implements C6368eQa {
    final /* synthetic */ C3233rK a;

    C3253sK(C3233rK rKVar) {
        this.a = rKVar;
    }

    public final void run() {
        Editor edit = this.a.e.edit();
        C7471uYa.a((Object) edit, "editor");
        edit.putLong("last_thanks", this.a.i.a());
        edit.apply();
    }
}
