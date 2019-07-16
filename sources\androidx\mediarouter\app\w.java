package androidx.mediarouter.app;

import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;
import androidx.fragment.app.C0361c;
import androidx.mediarouter.media.g;

/* compiled from: MediaRouteControllerDialogFragment */
public class w extends C0361c {
    private static final boolean a = Log.isLoggable("UseSupportDynamicGroup", 3);
    private g b;
    private Dialog mDialog;

    public w() {
        setCancelable(true);
    }

    private void Qb() {
        if (this.b == null) {
            Bundle arguments = getArguments();
            if (arguments != null) {
                this.b = g.a(arguments.getBundle("selector"));
            }
            if (this.b == null) {
                this.b = g.a;
            }
        }
    }

    public void a(g gVar) {
        if (gVar != null) {
            Qb();
            if (!this.b.equals(gVar)) {
                this.b = gVar;
                Bundle arguments = getArguments();
                if (arguments == null) {
                    arguments = new Bundle();
                }
                arguments.putBundle("selector", gVar.a());
                setArguments(arguments);
                Dialog dialog = this.mDialog;
                if (dialog != null && a) {
                    ((C0392e) dialog).a(gVar);
                    return;
                }
                return;
            }
            return;
        }
        throw new IllegalArgumentException("selector must not be null");
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Dialog dialog = this.mDialog;
        if (dialog == null) {
            return;
        }
        if (a) {
            ((C0392e) dialog).f();
        } else {
            ((u) dialog).j();
        }
    }

    public Dialog onCreateDialog(Bundle bundle) {
        if (a) {
            this.mDialog = a(getContext());
            ((C0392e) this.mDialog).a(this.b);
        } else {
            this.mDialog = a(getContext(), bundle);
        }
        return this.mDialog;
    }

    public void onStop() {
        super.onStop();
        Dialog dialog = this.mDialog;
        if (dialog != null && !a) {
            ((u) dialog).a(false);
        }
    }

    public C0392e a(Context context) {
        return new C0392e(context);
    }

    public u a(Context context, Bundle bundle) {
        return new u(context);
    }
}
