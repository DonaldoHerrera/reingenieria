package com.soundcloud.android.view;

import android.content.Context;
import com.mattprecious.telescope.TelescopeLayout;
import com.mattprecious.telescope.c;
import com.soundcloud.android.ia.f;
import java.io.File;

@EVa(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\fB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\t\u001a\u00020\nH\u0014J\b\u0010\u000b\u001a\u00020\nH\u0014R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Lcom/soundcloud/android/view/CustomTelescopeLayout;", "Lcom/mattprecious/telescope/TelescopeLayout;", "context", "Landroid/content/Context;", "bugReporter", "Lcom/soundcloud/android/utils/BugReporter;", "(Landroid/content/Context;Lcom/soundcloud/android/utils/BugReporter;)V", "getBugReporter", "()Lcom/soundcloud/android/utils/BugReporter;", "onAttachedToWindow", "", "onDetachedFromWindow", "BugReportLens", "base_release"}, mv = {1, 1, 15})
/* renamed from: com.soundcloud.android.view.u reason: case insensitive filesystem */
/* compiled from: CustomTelescopeLayout.kt */
public final class C6231u extends TelescopeLayout {
    private final C5322TGa z;

    /* renamed from: com.soundcloud.android.view.u$a */
    /* compiled from: CustomTelescopeLayout.kt */
    public static final class a extends c {
        private final C5322TGa a;
        private final Context b;

        public a(C5322TGa tGa, Context context) {
            C7471uYa.b(tGa, "bugReporter");
            C7471uYa.b(context, "context");
            this.a = tGa;
            this.b = context;
        }

        public void a(File file) {
            this.a.a(this.b, file);
        }
    }

    public C6231u(Context context, C5322TGa tGa) {
        C7471uYa.b(context, "context");
        C7471uYa.b(tGa, "bugReporter");
        super(context);
        this.z = tGa;
    }

    public final C5322TGa getBugReporter() {
        return this.z;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C5322TGa tGa = this.z;
        Context context = getContext();
        C7471uYa.a((Object) context, "context");
        setLens(new a(tGa, context));
        setProgressColor(androidx.core.content.a.a(getContext(), f.sc_dark_orange));
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        TelescopeLayout.b(getContext());
    }
}
