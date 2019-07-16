package com.soundcloud.android.creators.upload;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import com.soundcloud.android.features.record.Recording;
import com.soundcloud.android.ia.g;
import com.soundcloud.android.ia.i;
import com.soundcloud.android.ia.l;
import com.soundcloud.android.ia.p;
import java.io.File;

public class RecordingMetaDataLayout extends RelativeLayout {
    private Recording a;
    private Drawable b;
    private Fragment c;
    private EditText d;
    private ImageView e;

    public RecordingMetaDataLayout(Context context) {
        super(context);
        f();
    }

    private void d() {
        if (e()) {
            C4740AIa.a(this.e);
        }
        Drawable drawable = this.b;
        if (drawable != null) {
            setImage(drawable);
        }
    }

    private boolean e() {
        return this.e.getDrawable() instanceof BitmapDrawable;
    }

    private void f() {
        View inflate = LayoutInflater.from(getContext()).inflate(l.metadata, this);
        this.d = (EditText) inflate.findViewById(i.title);
        this.e = (ImageView) inflate.findViewById(i.artwork);
        inflate.findViewById(i.artwork_button).setOnClickListener(new e(this));
        this.e.setOnClickListener(new d(this));
        this.e.setOnLongClickListener(new c(this));
    }

    private void g() {
        if (C4739AHa.a(this.c)) {
            c();
        }
    }

    private void h() {
        if (e()) {
            Toast.makeText(getContext(), p.cloud_upload_clear_artwork, 1).show();
        } else if (C4739AHa.a(this.c)) {
            c();
        }
    }

    private boolean i() {
        this.a.a();
        d();
        return true;
    }

    public /* synthetic */ void a(View view) {
        g();
    }

    public /* synthetic */ void b(View view) {
        h();
    }

    public /* synthetic */ boolean c(View view) {
        return i();
    }

    public void setFragment(Fragment fragment) {
        this.c = fragment;
    }

    public void setImage(File file) {
        if (file != null) {
            C4740AIa.a(file, this.e, (int) getResources().getDimension(g.record_progress_icon_width), (int) getResources().getDimension(g.share_progress_icon_height));
            return;
        }
        d();
    }

    public void setPlaceholder(Drawable drawable) {
        this.b = drawable;
        setImage(this.b);
    }

    public void setTitle(String str) {
        if (str != null) {
            this.d.setTextKeepState(str);
        }
    }

    public void a(Recording recording, boolean z) {
        this.a = recording;
        if (z) {
            a(recording);
        }
        if (recording != null) {
            EditText editText = this.d;
            editText.setHint(recording.e(editText.getContext()));
            this.d.setText(recording.e);
            setImage(recording.m);
        }
    }

    public void b(Bundle bundle) {
        bundle.putString("createTitleValue", this.d.getText().toString());
        bundle.putParcelable("recording", this.a);
    }

    /* access modifiers changed from: 0000 */
    public void c() {
        C4740AIa.a((Activity) this.c.getActivity(), this.a.b(this.c.getContext()));
    }

    public RecordingMetaDataLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        f();
    }

    public void b(Recording recording) {
        recording.e = this.d.getText().toString();
    }

    public RecordingMetaDataLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        f();
    }

    public void b() {
        d();
    }

    public void setImage(Drawable drawable) {
        this.e.setImageDrawable(drawable);
    }

    public void a(Bundle bundle) {
        this.d.setText(bundle.getString("createTitleValue"));
        this.a = (Recording) bundle.getParcelable("recording");
        String str = "createArtworkPath";
        if (!TextUtils.isEmpty(bundle.getString(str))) {
            setImage(new File(bundle.getString(str)));
        }
    }

    public boolean a() {
        return this.b != null;
    }

    public void a(Recording recording) {
        setTitle(recording.e);
        setImage(recording.m);
    }
}
