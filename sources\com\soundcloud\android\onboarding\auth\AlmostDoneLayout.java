package com.soundcloud.android.onboarding.auth;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.Toast;
import androidx.fragment.app.FragmentActivity;
import com.soundcloud.android.SoundCloudApplication;
import com.soundcloud.android.ia.h;
import com.soundcloud.android.ia.i;
import com.soundcloud.android.ia.p;
import com.soundcloud.android.image.r;
import com.soundcloud.android.view.customfontviews.CustomFontButton;
import com.soundcloud.android.view.customfontviews.CustomFontEditText;
import java.io.File;
import java.io.Serializable;
import java.util.HashMap;

@EVa(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 52\u00020\u0001:\u0003456B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\n\u0010\u001b\u001a\u0004\u0018\u00010\u0010H\u0003J\u0006\u0010\u001c\u001a\u00020\u001dJ\b\u0010\u001e\u001a\u00020\u001fH\u0014J\b\u0010 \u001a\u00020\u001fH\u0014J\u0018\u0010!\u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020\u00072\b\u0010#\u001a\u0004\u0018\u00010$J\u0018\u0010%\u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020\u00072\b\u0010#\u001a\u0004\u0018\u00010$J\u000e\u0010&\u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020\u0007J\u0006\u0010'\u001a\u00020\u001fJ\u000e\u0010(\u001a\u00020\u001f2\u0006\u0010)\u001a\u00020*J\b\u0010+\u001a\u00020\u001fH\u0002J\u0010\u0010,\u001a\u00020\u001f2\b\u0010-\u001a\u0004\u0018\u00010\u0010J\u0010\u0010.\u001a\u00020\u001f2\b\u0010/\u001a\u0004\u0018\u00010\u001dJ\u0010\u00100\u001a\u00020\u001f2\u0006\u0010)\u001a\u00020*H\u0002J\u0017\u00101\u001a\u00020\u001f2\f\u00102\u001a\b\u0012\u0004\u0012\u00020\u001f03H\bR\u001a\u0010\t\u001a\u00020\nX.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0015\u001a\u00020\u00168\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u00067"}, d2 = {"Lcom/soundcloud/android/onboarding/auth/AlmostDoneLayout;", "Landroid/widget/ScrollView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "almostDoneHandler", "Lcom/soundcloud/android/onboarding/auth/AlmostDoneLayout$AlmostDoneHandler;", "getAlmostDoneHandler", "()Lcom/soundcloud/android/onboarding/auth/AlmostDoneLayout$AlmostDoneHandler;", "setAlmostDoneHandler", "(Lcom/soundcloud/android/onboarding/auth/AlmostDoneLayout$AlmostDoneHandler;)V", "avatarFile", "Ljava/io/File;", "compositeDisposable", "Lio/reactivex/disposables/Disposable;", "hasAvatar", "", "imageLoader", "Lcom/soundcloud/android/image/ImageLoader;", "getImageLoader", "()Lcom/soundcloud/android/image/ImageLoader;", "setImageLoader", "(Lcom/soundcloud/android/image/ImageLoader;)V", "generateTempAvatarFile", "getStateBundle", "Landroid/os/Bundle;", "onDetachedFromWindow", "", "onFinishInflate", "onImageCrop", "resultCode", "result", "Landroid/content/Intent;", "onImagePick", "onImageTake", "onSave", "onStoragePermissionGranted", "activity", "Landroidx/fragment/app/FragmentActivity;", "resetAvatarFile", "setImage", "file", "setStateFromBundle", "bundle", "showImagePicker", "withNonNullAvatarFile", "function", "Lkotlin/Function0;", "AlmostDoneHandler", "Companion", "InvalidAvatarFileException", "base_release"}, mv = {1, 1, 15})
/* compiled from: AlmostDoneLayout.kt */
public final class AlmostDoneLayout extends ScrollView {
    public static final b a = new b(null);
    public r b;
    public a c;
    /* access modifiers changed from: private */
    public File d;
    /* access modifiers changed from: private */
    public boolean e;
    private VPa f;
    private HashMap g;

    /* compiled from: AlmostDoneLayout.kt */
    public interface a {
        void a(int i);

        void a(String str, File file);

        FragmentActivity e();
    }

    /* compiled from: AlmostDoneLayout.kt */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(C7264rYa rya) {
            this();
        }
    }

    /* compiled from: AlmostDoneLayout.kt */
    public static final class c extends Exception {
    }

    public AlmostDoneLayout(Context context) {
        this(context, null, 0, 6, null);
    }

    public AlmostDoneLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ AlmostDoneLayout(Context context, AttributeSet attributeSet, int i, int i2, C7264rYa rya) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }

    public View a(int i) {
        if (this.g == null) {
            this.g = new HashMap();
        }
        View view = (View) this.g.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.g.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final a getAlmostDoneHandler() {
        a aVar = this.c;
        if (aVar != null) {
            return aVar;
        }
        C7471uYa.b("almostDoneHandler");
        throw null;
    }

    public final r getImageLoader() {
        r rVar = this.b;
        if (rVar != null) {
            return rVar;
        }
        C7471uYa.b("imageLoader");
        throw null;
    }

    public final Bundle getStateBundle() {
        CustomFontEditText customFontEditText = (CustomFontEditText) a(i.almostDoneUsernameInput);
        C7471uYa.a((Object) customFontEditText, "almostDoneUsernameInput");
        Bundle a2 = C1687sb.a(NVa.a("BUNDLE_USERNAME", customFontEditText.getText()));
        if (this.e) {
            a2.putSerializable("BUNDLE_FILE", this.d);
        }
        return a2;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        this.f.dispose();
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        ((CustomFontButton) a(i.almostDoneContinueBtn)).setOnClickListener(new C4220s(this));
        ImageView imageView = (ImageView) a(i.almostDoneAvatar);
        imageView.setOnClickListener(new C4219q(imageView, this));
        imageView.setOnLongClickListener(new r(this));
        CustomFontEditText customFontEditText = (CustomFontEditText) a(i.almostDoneUsernameInput);
        C7471uYa.a((Object) customFontEditText, "almostDoneUsernameInput");
        CustomFontButton customFontButton = (CustomFontButton) a(i.almostDoneContinueBtn);
        C7471uYa.a((Object) customFontButton, "almostDoneContinueBtn");
        C7178qHa.a(customFontEditText, customFontButton, null, 2, null);
    }

    public final void setAlmostDoneHandler(a aVar) {
        C7471uYa.b(aVar, "<set-?>");
        this.c = aVar;
    }

    public final void setImage(File file) {
        if (file != null) {
            defpackage.SDb.b a2 = SDb.a(SoundCloudApplication.a);
            StringBuilder sb = new StringBuilder();
            sb.append("setImage(");
            sb.append(file);
            sb.append(')');
            a2.a(sb.toString(), new Object[0]);
            this.d = file;
            this.e = true;
            r rVar = this.b;
            if (rVar != null) {
                String uri = Uri.fromFile(file).toString();
                ImageView imageView = (ImageView) a(i.almostDoneAvatar);
                C7471uYa.a((Object) imageView, "almostDoneAvatar");
                GPa c2 = com.soundcloud.android.image.r.a.a(rVar, uri, imageView, true, androidx.core.content.a.c(getContext(), h.circular_placeholder), null, null, false, 112, null).c(new C4221t(this));
                C7471uYa.a((Object) c2, "imageLoader.legacyDispla…         }\n            })");
                this.f = (VPa) c2;
                return;
            }
            C7471uYa.b("imageLoader");
            throw null;
        }
    }

    public final void setImageLoader(r rVar) {
        C7471uYa.b(rVar, "<set-?>");
        this.b = rVar;
    }

    public final void setStateFromBundle(Bundle bundle) {
        if (bundle != null) {
            ((CustomFontEditText) a(i.almostDoneUsernameInput)).setText(bundle.getCharSequence("BUNDLE_USERNAME"));
            Serializable serializable = bundle.getSerializable("BUNDLE_FILE");
            if (!(serializable instanceof File)) {
                serializable = null;
            }
            setImage((File) serializable);
        }
    }

    public AlmostDoneLayout(Context context, AttributeSet attributeSet, int i) {
        C7471uYa.b(context, "context");
        super(context, attributeSet, i);
        this.f = C4881Eua.a();
        SoundCloudApplication.f().a(this);
    }

    /* access modifiers changed from: private */
    public final void c() {
        this.d = null;
        this.e = false;
        ((ImageView) a(i.almostDoneAvatar)).setImageResource(h.circular_placeholder);
    }

    public final void b(int i, Intent intent) {
        if (i == -1 && intent != null) {
            this.d = C4740AIa.a(getContext());
            if (this.d != null) {
                Context context = getContext();
                if (context != null) {
                    C4740AIa.a((Activity) context, intent.getData(), Uri.fromFile(this.d));
                    return;
                }
                throw new OVa("null cannot be cast to non-null type android.app.Activity");
            }
            C7316sHa.d(new c());
        }
    }

    public final void a(int i, Intent intent) {
        if (i == -1) {
            setImage(this.d);
        } else if (i == 404) {
            if (intent != null) {
                C7316sHa.a("error cropping image", com.soundcloud.android.crop.b.a(intent));
            }
            Toast.makeText(getContext(), p.crop_image_error, 0).show();
        }
    }

    @SuppressLint({"SetWorldWritable"})
    private final File b() {
        File a2 = C4740AIa.a(getContext());
        if (a2 == null || !a2.setWritable(true, false)) {
            return null;
        }
        return a2;
    }

    public final void a(FragmentActivity fragmentActivity) {
        C7471uYa.b(fragmentActivity, "activity");
        b(fragmentActivity);
    }

    public final void a() {
        a aVar = this.c;
        if (aVar != null) {
            CustomFontEditText customFontEditText = (CustomFontEditText) a(i.almostDoneUsernameInput);
            C7471uYa.a((Object) customFontEditText, "almostDoneUsernameInput");
            aVar.a(String.valueOf(customFontEditText.getText()), this.d);
            return;
        }
        C7471uYa.b("almostDoneHandler");
        throw null;
    }

    /* access modifiers changed from: private */
    public final void b(FragmentActivity fragmentActivity) {
        this.d = b();
        C4740AIa.a((Activity) fragmentActivity, this.d);
    }

    public final void b(int i) {
        if (this.d == null) {
            C7316sHa.d(new c());
        } else if (i == -1) {
            Context context = getContext();
            if (context != null) {
                C4740AIa.a((Activity) context, Uri.fromFile(this.d));
                return;
            }
            throw new OVa("null cannot be cast to non-null type android.app.Activity");
        } else {
            c();
        }
    }
}
