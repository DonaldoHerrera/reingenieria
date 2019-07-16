package androidx.preference;

import android.content.DialogInterface.OnMultiChoiceClickListener;
import android.os.Bundle;
import androidx.appcompat.app.C0325l.a;
import androidx.preference.internal.AbstractMultiSelectListPreference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/* renamed from: androidx.preference.k reason: case insensitive filesystem */
/* compiled from: MultiSelectListPreferenceDialogFragmentCompat */
public class C0403k extends o {
    Set<String> i = new HashSet();
    boolean j;
    CharSequence[] k;
    CharSequence[] l;

    private AbstractMultiSelectListPreference Sb() {
        return (AbstractMultiSelectListPreference) Qb();
    }

    public static C0403k c(String str) {
        C0403k kVar = new C0403k();
        Bundle bundle = new Bundle(1);
        bundle.putString("key", str);
        kVar.setArguments(bundle);
        return kVar;
    }

    /* access modifiers changed from: protected */
    public void a(a aVar) {
        super.a(aVar);
        int length = this.l.length;
        boolean[] zArr = new boolean[length];
        for (int i2 = 0; i2 < length; i2++) {
            zArr[i2] = this.i.contains(this.l[i2].toString());
        }
        aVar.a(this.k, zArr, (OnMultiChoiceClickListener) new C0402j(this));
    }

    public void f(boolean z) {
        AbstractMultiSelectListPreference Sb = Sb();
        if (z && this.j) {
            Set<String> set = this.i;
            if (Sb.a((Object) set)) {
                Sb.c(set);
            }
        }
        this.j = false;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            AbstractMultiSelectListPreference Sb = Sb();
            if (Sb.ia() == null || Sb.ja() == null) {
                throw new IllegalStateException("MultiSelectListPreference requires an entries array and an entryValues array.");
            }
            this.i.clear();
            this.i.addAll(Sb.ka());
            this.j = false;
            this.k = Sb.ia();
            this.l = Sb.ja();
            return;
        }
        this.i.clear();
        this.i.addAll(bundle.getStringArrayList("MultiSelectListPreferenceDialogFragmentCompat.values"));
        this.j = bundle.getBoolean("MultiSelectListPreferenceDialogFragmentCompat.changed", false);
        this.k = bundle.getCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entries");
        this.l = bundle.getCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entryValues");
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putStringArrayList("MultiSelectListPreferenceDialogFragmentCompat.values", new ArrayList(this.i));
        bundle.putBoolean("MultiSelectListPreferenceDialogFragmentCompat.changed", this.j);
        bundle.putCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entries", this.k);
        bundle.putCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entryValues", this.l);
    }
}
