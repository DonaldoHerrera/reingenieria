package androidx.mediarouter.app;

import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;
import androidx.fragment.app.C0361c;
import androidx.mediarouter.media.g;

/* compiled from: MediaRouteChooserDialogFragment */
public class h extends C0361c {
    private static final boolean a = Log.isLoggable("UseSupportDynamicGroup", 3);
    private g b;
    private Dialog mDialog;

    public h() {
        setCancelable(true);
    }

    private void Rb() {
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

    public g Qb() {
        Rb();
        return this.b;
    }

    public void a(g gVar) {
        if (gVar != null) {
            Rb();
            if (!this.b.equals(gVar)) {
                this.b = gVar;
                Bundle arguments = getArguments();
                if (arguments == null) {
                    arguments = new Bundle();
                }
                arguments.putBundle("selector", gVar.a());
                setArguments(arguments);
                Dialog dialog = this.mDialog;
                if (dialog == null) {
                    return;
                }
                if (a) {
                    ((z) dialog).a(gVar);
                } else {
                    ((g) dialog).a(gVar);
                }
            }
        } else {
            throw new IllegalArgumentException("selector must not be null");
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            if (a) {
                ((z) dialog).c();
            } else {
                ((g) dialog).c();
            }
        }
    }

    public Dialog onCreateDialog(Bundle bundle) {
        if (a) {
            this.mDialog = a(getContext());
            ((z) this.mDialog).a(Qb());
        } else {
            this.mDialog = a(getContext(), bundle);
            ((g) this.mDialog).a(Qb());
        }
        return this.mDialog;
    }

    public z a(Context context) {
        return new z(context);
    }

    public g a(Context context, Bundle bundle) {
        return new g(context);
    }
}
