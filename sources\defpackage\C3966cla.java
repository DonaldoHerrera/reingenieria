package defpackage;

import android.content.DialogInterface;
import androidx.fragment.app.FragmentActivity;

/* renamed from: cla reason: default package and case insensitive filesystem */
/* compiled from: UnrecoverableErrorDialog */
abstract class C3966cla extends C2418ZW {
    C3966cla() {
    }

    private void Rb() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        Rb();
    }
}
