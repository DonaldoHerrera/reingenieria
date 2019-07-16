package androidx.preference;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.C0325l;
import androidx.fragment.app.C0361c;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.preference.DialogPreference.a;

/* compiled from: PreferenceDialogFragmentCompat */
public abstract class o extends C0361c implements OnClickListener {
    private DialogPreference a;
    private CharSequence b;
    private CharSequence c;
    private CharSequence d;
    private CharSequence e;
    private int f;
    private BitmapDrawable g;
    private int h;

    private void a(Dialog dialog) {
        dialog.getWindow().setSoftInputMode(5);
    }

    public DialogPreference Qb() {
        if (this.a == null) {
            this.a = (DialogPreference) ((a) getTargetFragment()).findPreference(getArguments().getString("key"));
        }
        return this.a;
    }

    /* access modifiers changed from: protected */
    public boolean Rb() {
        return false;
    }

    /* access modifiers changed from: protected */
    public void a(C0325l.a aVar) {
    }

    public abstract void f(boolean z);

    public void onClick(DialogInterface dialogInterface, int i) {
        this.h = i;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Fragment targetFragment = getTargetFragment();
        if (targetFragment instanceof a) {
            a aVar = (a) targetFragment;
            String string = getArguments().getString("key");
            if (bundle == null) {
                this.a = (DialogPreference) aVar.findPreference(string);
                this.b = this.a.fa();
                this.c = this.a.ha();
                this.d = this.a.ga();
                this.e = this.a.ea();
                this.f = this.a.da();
                Drawable ca = this.a.ca();
                if (ca == null || (ca instanceof BitmapDrawable)) {
                    this.g = (BitmapDrawable) ca;
                    return;
                }
                Bitmap createBitmap = Bitmap.createBitmap(ca.getIntrinsicWidth(), ca.getIntrinsicHeight(), Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                ca.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                ca.draw(canvas);
                this.g = new BitmapDrawable(getResources(), createBitmap);
                return;
            }
            this.b = bundle.getCharSequence("PreferenceDialogFragment.title");
            this.c = bundle.getCharSequence("PreferenceDialogFragment.positiveText");
            this.d = bundle.getCharSequence("PreferenceDialogFragment.negativeText");
            this.e = bundle.getCharSequence("PreferenceDialogFragment.message");
            this.f = bundle.getInt("PreferenceDialogFragment.layout", 0);
            Bitmap bitmap = (Bitmap) bundle.getParcelable("PreferenceDialogFragment.icon");
            if (bitmap != null) {
                this.g = new BitmapDrawable(getResources(), bitmap);
                return;
            }
            return;
        }
        throw new IllegalStateException("Target fragment must implement TargetFragment interface");
    }

    public Dialog onCreateDialog(Bundle bundle) {
        FragmentActivity activity = getActivity();
        this.h = -2;
        C0325l.a aVar = new C0325l.a(activity);
        aVar.b(this.b);
        aVar.a((Drawable) this.g);
        aVar.c(this.c, (OnClickListener) this);
        aVar.a(this.d, (OnClickListener) this);
        View a2 = a((Context) activity);
        if (a2 != null) {
            a(a2);
            aVar.b(a2);
        } else {
            aVar.a(this.e);
        }
        a(aVar);
        C0325l a3 = aVar.a();
        if (Rb()) {
            a((Dialog) a3);
        }
        return a3;
    }

    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        f(this.h == -1);
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putCharSequence("PreferenceDialogFragment.title", this.b);
        bundle.putCharSequence("PreferenceDialogFragment.positiveText", this.c);
        bundle.putCharSequence("PreferenceDialogFragment.negativeText", this.d);
        bundle.putCharSequence("PreferenceDialogFragment.message", this.e);
        bundle.putInt("PreferenceDialogFragment.layout", this.f);
        BitmapDrawable bitmapDrawable = this.g;
        if (bitmapDrawable != null) {
            bundle.putParcelable("PreferenceDialogFragment.icon", bitmapDrawable.getBitmap());
        }
    }

    /* access modifiers changed from: protected */
    public View a(Context context) {
        int i = this.f;
        if (i == 0) {
            return null;
        }
        return LayoutInflater.from(context).inflate(i, null);
    }

    /* access modifiers changed from: protected */
    public void a(View view) {
        View findViewById = view.findViewById(16908299);
        if (findViewById != null) {
            CharSequence charSequence = this.e;
            int i = 8;
            if (!TextUtils.isEmpty(charSequence)) {
                if (findViewById instanceof TextView) {
                    ((TextView) findViewById).setText(charSequence);
                }
                i = 0;
            }
            if (findViewById.getVisibility() != i) {
                findViewById.setVisibility(i);
            }
        }
    }
}
