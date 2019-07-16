package androidx.preference;

import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import androidx.appcompat.app.C0325l.a;

/* renamed from: androidx.preference.h reason: case insensitive filesystem */
/* compiled from: ListPreferenceDialogFragmentCompat */
public class C0400h extends o {
    int i;
    private CharSequence[] j;
    private CharSequence[] k;

    private ListPreference Sb() {
        return (ListPreference) Qb();
    }

    public static C0400h c(String str) {
        C0400h hVar = new C0400h();
        Bundle bundle = new Bundle(1);
        bundle.putString("key", str);
        hVar.setArguments(bundle);
        return hVar;
    }

    /* access modifiers changed from: protected */
    public void a(a aVar) {
        super.a(aVar);
        aVar.a(this.j, this.i, (OnClickListener) new C0399g(this));
        aVar.c((CharSequence) null, (OnClickListener) null);
    }

    public void f(boolean z) {
        ListPreference Sb = Sb();
        if (z) {
            int i2 = this.i;
            if (i2 >= 0) {
                String charSequence = this.k[i2].toString();
                if (Sb.a((Object) charSequence)) {
                    Sb.f(charSequence);
                }
            }
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            ListPreference Sb = Sb();
            if (Sb.ia() == null || Sb.ka() == null) {
                throw new IllegalStateException("ListPreference requires an entries array and an entryValues array.");
            }
            this.i = Sb.e(Sb.la());
            this.j = Sb.ia();
            this.k = Sb.ka();
            return;
        }
        this.i = bundle.getInt("ListPreferenceDialogFragment.index", 0);
        this.j = bundle.getCharSequenceArray("ListPreferenceDialogFragment.entries");
        this.k = bundle.getCharSequenceArray("ListPreferenceDialogFragment.entryValues");
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("ListPreferenceDialogFragment.index", this.i);
        bundle.putCharSequenceArray("ListPreferenceDialogFragment.entries", this.j);
        bundle.putCharSequenceArray("ListPreferenceDialogFragment.entryValues", this.k);
    }
}
