package com.soundcloud.android.comments;

import android.app.Dialog;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.soundcloud.android.SoundCloudApplication;
import com.soundcloud.android.ia.i;
import com.soundcloud.android.ia.l;
import com.soundcloud.android.ia.p;
import com.soundcloud.android.view.C6230t;
import com.soundcloud.android.view.customfontviews.CustomFontButton;
import com.soundcloud.android.view.customfontviews.CustomFontTextView;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

@EVa(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \"2\u00020\u0001:\u0002!\"B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0018\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0018\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0012\u0010\u0018\u001a\u00020\u00132\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\u0018\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\b\u0010\u001c\u001a\u00020\u0013H\u0002J\u0018\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\fH\u0016J\u0010\u0010\u001f\u001a\u00020 2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX.¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006#"}, d2 = {"Lcom/soundcloud/android/comments/CommentActionsSheetFragment;", "Lcom/soundcloud/android/view/CustomBottomSheetDialogFragment;", "()V", "appFeatures", "Lcom/soundcloud/android/properties/AppFeatures;", "getAppFeatures", "()Lcom/soundcloud/android/properties/AppFeatures;", "setAppFeatures", "(Lcom/soundcloud/android/properties/AppFeatures;)V", "commentActionListener", "Lcom/soundcloud/android/comments/CommentActionsSheetFragment$CommentActionListener;", "layoutId", "", "getLayoutId", "()I", "getCommentReportOptionText", "commentParams", "Lcom/soundcloud/android/comments/CommentActionsSheetParams;", "initDeleteCommentView", "", "dialog", "Landroid/app/Dialog;", "initOpenProfileView", "initReportCommentView", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "renderView", "setCommentActionListener", "setupDialog", "style", "title", "", "CommentActionListener", "Companion", "base_release"}, mv = {1, 1, 15})
/* renamed from: com.soundcloud.android.comments.c reason: case insensitive filesystem */
/* compiled from: CommentActionsSheetFragment.kt */
public final class C2876c extends C6230t {
    public static final b a = new b(null);
    public com.soundcloud.android.properties.a b;
    private a c;
    private final int d = l.comment_actions_sheet_view;
    private HashMap e;

    /* renamed from: com.soundcloud.android.comments.c$a */
    /* compiled from: CommentActionsSheetFragment.kt */
    public interface a {
        void a(Ma ma);

        void a(C2875bb bbVar);

        void a(C2892j jVar);
    }

    /* renamed from: com.soundcloud.android.comments.c$b */
    /* compiled from: CommentActionsSheetFragment.kt */
    public static final class b {
        private b() {
        }

        public final C2876c a(C2890i iVar) {
            C7471uYa.b(iVar, "commentParams");
            C2876c cVar = new C2876c();
            cVar.setArguments(C2890i.a.a(iVar));
            return cVar;
        }

        public /* synthetic */ b(C7264rYa rya) {
            this();
        }
    }

    public C2876c() {
        SoundCloudApplication.f().a(this);
    }

    private final void Sb() {
        Fragment targetFragment = getTargetFragment();
        if (!(targetFragment instanceof a)) {
            targetFragment = null;
        }
        a aVar = (a) targetFragment;
        if (aVar != null) {
            this.c = aVar;
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(String.valueOf(getTargetFragment()));
        sb.append(" must implement ");
        sb.append(a.class.getName());
        throw new ClassCastException(sb.toString());
    }

    public static final /* synthetic */ a a(C2876c cVar) {
        a aVar = cVar.c;
        if (aVar != null) {
            return aVar;
        }
        C7471uYa.b("commentActionListener");
        throw null;
    }

    private final void b(Dialog dialog, C2890i iVar) {
        ((CustomFontButton) dialog.findViewById(i.openProfileBtn)).setOnClickListener(new C2884f(this, iVar));
    }

    private final String c(C2890i iVar) {
        String string = getString(p.user_commented_at_timestamp, iVar.g(), C7315sGa.a(iVar.d(), TimeUnit.MILLISECONDS));
        C7471uYa.a((Object) string, "getString(\n        R.str…tamp, MILLISECONDS)\n    )");
        return string;
    }

    private final void d(Dialog dialog, C2890i iVar) {
        CustomFontTextView customFontTextView = (CustomFontTextView) dialog.findViewById(i.commentActionSheetTitle);
        C7471uYa.a((Object) customFontTextView, "dialog.commentActionSheetTitle");
        customFontTextView.setText(c(iVar));
        b(dialog, iVar);
        c(dialog, iVar);
        a(dialog, iVar);
    }

    public int Qb() {
        return this.d;
    }

    public void Rb() {
        HashMap hashMap = this.e;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Sb();
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        Rb();
    }

    public void setupDialog(Dialog dialog, int i) {
        C2890i iVar;
        C7471uYa.b(dialog, "dialog");
        super.setupDialog(dialog, i);
        Bundle arguments = getArguments();
        if (arguments != null) {
            com.soundcloud.android.comments.C2890i.a aVar = C2890i.a;
            C7471uYa.a((Object) arguments, "it");
            iVar = aVar.a(arguments);
        } else {
            iVar = null;
        }
        if (iVar != null) {
            d(dialog, iVar);
            return;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    private final void a(Dialog dialog, C2890i iVar) {
        CustomFontButton customFontButton = (CustomFontButton) dialog.findViewById(i.deleteCommentBtn);
        C7471uYa.a((Object) customFontButton, "dialog.deleteCommentBtn");
        customFontButton.setVisibility(iVar.a() ? 0 : 8);
        ((CustomFontButton) dialog.findViewById(i.deleteCommentBtn)).setOnClickListener(new C2882e(this, iVar));
    }

    private final int b(C2890i iVar) {
        int i = C2879d.a[iVar.c().ordinal()];
        if (i == 1) {
            return p.comments_sheet_report_and_delete_comment;
        }
        if (i == 2) {
            return p.comments_sheet_report_comment;
        }
        throw new IllegalStateException("Incorrect or unknown report option used");
    }

    private final void c(Dialog dialog, C2890i iVar) {
        if (iVar.c() != com.soundcloud.android.comments.C2890i.b.NO_REPORT) {
            CustomFontButton customFontButton = (CustomFontButton) dialog.findViewById(i.reportCommentBtn);
            String str = "dialog.reportCommentBtn";
            C7471uYa.a((Object) customFontButton, str);
            customFontButton.setVisibility(0);
            CustomFontButton customFontButton2 = (CustomFontButton) dialog.findViewById(i.reportCommentBtn);
            C7471uYa.a((Object) customFontButton2, str);
            customFontButton2.setText(getString(b(iVar)));
            ((CustomFontButton) dialog.findViewById(i.reportCommentBtn)).setOnClickListener(new C2886g(this, iVar));
        }
    }
}
