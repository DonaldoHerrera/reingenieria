package androidx.preference;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

/* renamed from: androidx.preference.e reason: case insensitive filesystem */
/* compiled from: EditTextPreferenceDialogFragmentCompat */
public class C0397e extends o {
    private EditText i;
    private CharSequence j;

    private EditTextPreference Sb() {
        return (EditTextPreference) Qb();
    }

    public static C0397e c(String str) {
        C0397e eVar = new C0397e();
        Bundle bundle = new Bundle(1);
        bundle.putString("key", str);
        eVar.setArguments(bundle);
        return eVar;
    }

    /* access modifiers changed from: protected */
    public boolean Rb() {
        return true;
    }

    /* access modifiers changed from: protected */
    public void a(View view) {
        super.a(view);
        this.i = (EditText) view.findViewById(16908291);
        this.i.requestFocus();
        EditText editText = this.i;
        if (editText != null) {
            editText.setText(this.j);
            EditText editText2 = this.i;
            editText2.setSelection(editText2.getText().length());
            return;
        }
        throw new IllegalStateException("Dialog view must contain an EditText with id @android:id/edit");
    }

    public void f(boolean z) {
        if (z) {
            String obj = this.i.getText().toString();
            if (Sb().a((Object) obj)) {
                Sb().e(obj);
            }
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            this.j = Sb().ia();
        } else {
            this.j = bundle.getCharSequence("EditTextPreferenceDialogFragment.text");
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putCharSequence("EditTextPreferenceDialogFragment.text", this.j);
    }
}
