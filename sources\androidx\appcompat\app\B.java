package androidx.appcompat.app;

import android.app.Dialog;
import android.os.Bundle;
import androidx.fragment.app.C0361c;

/* compiled from: AppCompatDialogFragment */
public class B extends C0361c {
    public Dialog onCreateDialog(Bundle bundle) {
        return new A(getContext(), getTheme());
    }

    public void setupDialog(Dialog dialog, int i) {
        if (dialog instanceof A) {
            A a = (A) dialog;
            if (!(i == 1 || i == 2)) {
                if (i == 3) {
                    dialog.getWindow().addFlags(24);
                } else {
                    return;
                }
            }
            a.a(1);
            return;
        }
        super.setupDialog(dialog, i);
    }
}
