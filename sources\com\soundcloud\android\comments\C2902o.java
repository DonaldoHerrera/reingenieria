package com.soundcloud.android.comments;

import android.app.Activity;
import android.content.res.Resources;
import android.text.Editable;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.soundcloud.android.comments.C2872ab.i;
import com.soundcloud.android.image.C3721b;
import com.soundcloud.android.image.N;
import com.soundcloud.android.view.SendButton;
import com.soundcloud.android.view.customfontviews.CustomFontEditText;
import com.soundcloud.android.view.customfontviews.CustomFontTextView;

@EVa(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001/B\u001f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0012\u0010\u001c\u001a\u00020\u00192\b\u0010\u001d\u001a\u0004\u0018\u00010\u0002H\u0016J\u0018\u0010\u001e\u001a\u00020\u00192\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u001f\u001a\u00020 J\u0012\u0010!\u001a\u00020\u00192\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0002J\u0006\u0010\"\u001a\u00020\u0019J\u0006\u0010#\u001a\u00020\u0019J\u0006\u0010$\u001a\u00020\u0019J\u0006\u0010%\u001a\u00020\u0019J\u0006\u0010&\u001a\u00020\u0019J\u0006\u0010'\u001a\u00020\u0019J\b\u0010(\u001a\u00020\u0019H\u0002J\u000e\u0010)\u001a\u00020\u00192\u0006\u0010*\u001a\u00020+J\u000e\u0010,\u001a\u00020\u00192\u0006\u0010-\u001a\u00020.R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u000e¢\u0006\u0004\n\u0002\u0010\u0015R\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u000fX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\b\u0018\u00010\u001bR\u00020\u0000X\u000e¢\u0006\u0002\n\u0000¨\u00060"}, d2 = {"Lcom/soundcloud/android/comments/CommentInputRenderer;", "Lio/reactivex/functions/Consumer;", "Lcom/soundcloud/android/comments/CommentsPage;", "imageOperations", "Lcom/soundcloud/android/image/ImageOperations;", "keyboardHelper", "Lcom/soundcloud/android/utils/KeyboardHelper;", "resources", "Landroid/content/res/Resources;", "(Lcom/soundcloud/android/image/ImageOperations;Lcom/soundcloud/android/utils/KeyboardHelper;Landroid/content/res/Resources;)V", "activity", "Landroid/app/Activity;", "disposable", "Lio/reactivex/disposables/Disposable;", "makeComment", "Lio/reactivex/subjects/PublishSubject;", "Lcom/soundcloud/android/comments/NewCommentParams;", "getMakeComment", "()Lio/reactivex/subjects/PublishSubject;", "originalSoftInputMode", "", "Ljava/lang/Integer;", "pendingComment", "getPendingComment", "sendButtonClicked", "", "viewHolder", "Lcom/soundcloud/android/comments/CommentInputRenderer$CommentInputViewHolder;", "accept", "data", "attach", "view", "Landroid/view/View;", "cacheAndSetSoftInputMode", "clearCommentInputFocus", "detach", "focusCommentInput", "hideCommentInput", "resetCommentInput", "resetCommentInputToSendState", "resetSoftInputMode", "setCommentInputText", "comment", "Lcom/soundcloud/android/comments/CommentViewModel$CommentItem;", "toggleSendCommentButton", "enabled", "", "CommentInputViewHolder", "track-comments_release"}, mv = {1, 1, 15})
/* renamed from: com.soundcloud.android.comments.o reason: case insensitive filesystem */
/* compiled from: CommentInputRenderer.kt */
public final class C2902o implements C6776kQa<T> {
    private a a;
    private Activity b;
    private Integer c;
    private VPa d = C4881Eua.b();
    private final C6781kVa<Pa> e;
    private final C6781kVa<Pa> f;
    /* access modifiers changed from: private */
    public final C6781kVa<RVa> g;
    /* access modifiers changed from: private */
    public final N h;
    /* access modifiers changed from: private */
    public final C4801CHa i;
    /* access modifiers changed from: private */
    public final Resources j;

    /* renamed from: com.soundcloud.android.comments.o$a */
    /* compiled from: CommentInputRenderer.kt */
    private final class a {
        private final TextView a;
        private final ViewGroup b;
        private final CustomFontEditText c;
        private final View d;
        private final SendButton e;
        private final ImageView f;
        final /* synthetic */ C2902o g;

        public a(C2902o oVar, View view) {
            C7471uYa.b(view, "view");
            this.g = oVar;
            CustomFontTextView customFontTextView = (CustomFontTextView) view.findViewById(i.commentTimestampTv);
            C7471uYa.a((Object) customFontTextView, "view.commentTimestampTv");
            this.a = customFontTextView;
            RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(i.commentInputContainer);
            C7471uYa.a((Object) relativeLayout, "view.commentInputContainer");
            this.b = relativeLayout;
            CustomFontEditText customFontEditText = (CustomFontEditText) view.findViewById(i.commentInput);
            C7471uYa.a((Object) customFontEditText, "view.commentInput");
            this.c = customFontEditText;
            View findViewById = view.findViewById(i.commentInputContent);
            C7471uYa.a((Object) findViewById, "view.commentInputContent");
            this.d = findViewById;
            SendButton sendButton = (SendButton) view.findViewById(i.commentSendBtn);
            C7471uYa.a((Object) sendButton, "view.commentSendBtn");
            this.e = sendButton;
            ImageView imageView = (ImageView) view.findViewById(i.userProfileImv);
            C7471uYa.a((Object) imageView, "view.userProfileImv");
            this.f = imageView;
            this.c.setOnFocusChangeListener(new C2894k(this));
        }

        private final void h() {
            this.c.setOnEditTextImeBackListener(new C2896l(this));
        }

        public final void a(boolean z) {
            this.b.setActivated(z);
        }

        public final void b(boolean z) {
            this.e.setVisibility(z ? 0 : 8);
            if (z) {
                this.e.setOnClickListener(new C2900n(this));
            } else {
                this.e.setOnClickListener(null);
            }
        }

        public final CustomFontEditText c() {
            return this.c;
        }

        public final SendButton d() {
            return this.e;
        }

        public final void e() {
            this.d.setVisibility(8);
        }

        public final void f() {
            this.e.setVisibility(8);
            Editable text = this.c.getText();
            if (text != null) {
                text.clear();
            }
            this.c.setEnabled(true);
        }

        public final void g() {
            a(true);
            this.c.setEnabled(true);
            b(true);
        }

        public final void a(com.soundcloud.android.comments.C2921y.a aVar) {
            C7471uYa.b(aVar, "comment");
            String i = aVar.i();
            StringBuilder sb = new StringBuilder();
            sb.append('@');
            sb.append(i);
            sb.append(' ');
            String sb2 = sb.toString();
            this.c.setText(sb2);
            this.c.setSelection(sb2.length());
        }

        public final void b() {
            this.c.requestFocus();
            this.g.i.b(this.c);
        }

        public final void a() {
            this.c.clearFocus();
            this.g.i.a(this.c);
        }

        private final void b(T t) {
            this.c.addTextChangedListener(new C2898m(this, t));
        }

        public final void a(T t) {
            if (t == null) {
                return;
            }
            if (t.b()) {
                this.d.setVisibility(0);
                a(t.g());
                b(t);
                C6781kVa e2 = this.g.e();
                Pa pa = new Pa(String.valueOf(this.c.getText()), t.d(), t.h(), t.f(), t.c());
                e2.a(pa);
                h();
                a(t.d());
                return;
            }
            e();
        }

        private final void a(C4954HFa hFa) {
            N a2 = this.g.h;
            C3508cda a3 = hFa.a();
            if (a3 != null) {
                C4928GKa b2 = hFa.b();
                C3721b b3 = C3721b.b(this.g.j);
                C7471uYa.a((Object) b3, "ApiImageSize.getFullImageSize(resources)");
                N.a(a2, a3, b2, b3, this.f, null, 16, null);
                return;
            }
            throw new IllegalArgumentException("Required value was null.");
        }

        private final void a(long j) {
            this.a.setText(C7179qIa.a(j));
        }
    }

    public C2902o(N n, C4801CHa cHa, Resources resources) {
        C7471uYa.b(n, "imageOperations");
        C7471uYa.b(cHa, "keyboardHelper");
        C7471uYa.b(resources, "resources");
        this.h = n;
        this.i = cHa;
        this.j = resources;
        C6781kVa<Pa> s = C6781kVa.s();
        String str = "PublishSubject.create()";
        C7471uYa.a((Object) s, str);
        this.e = s;
        C6781kVa<Pa> s2 = C6781kVa.s();
        C7471uYa.a((Object) s2, str);
        this.f = s2;
        C6781kVa<RVa> s3 = C6781kVa.s();
        C7471uYa.a((Object) s3, str);
        this.g = s3;
    }

    private final void i() {
        Integer num = this.c;
        if (num != null) {
            int intValue = num.intValue();
            Activity activity = this.b;
            if (activity != null) {
                Window window = activity.getWindow();
                if (window != null) {
                    window.setSoftInputMode(intValue);
                }
            }
        }
    }

    public final C6781kVa<Pa> e() {
        return this.e;
    }

    public final void f() {
        a aVar = this.a;
        if (aVar != null) {
            aVar.e();
            return;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public final void g() {
        a aVar = this.a;
        if (aVar != null) {
            aVar.f();
            return;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public final void h() {
        a aVar = this.a;
        if (aVar != null) {
            aVar.g();
            return;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public final void a(Activity activity, View view) {
        C7471uYa.b(view, "view");
        this.a = new a(this, view);
        this.b = activity;
        a(activity);
        VPa f2 = this.e.a((FPa<? super T, ? extends R>) new C5199PDa<Object,Object>(this.g)).f((C6776kQa<? super T>) new C2904p<Object>(this));
        C7471uYa.a((Object) f2, "pendingComment.compose(T… makeComment.onNext(it) }");
        this.d = f2;
    }

    public final void b() {
        a();
        this.d.dispose();
        this.a = null;
        this.b = null;
        i();
    }

    public final void c() {
        a aVar = this.a;
        if (aVar != null) {
            aVar.b();
            return;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public final C6781kVa<Pa> d() {
        return this.f;
    }

    /* renamed from: a */
    public void accept(T t) {
        a aVar = this.a;
        if (aVar != null) {
            aVar.a(t);
            return;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public final void a(boolean z) {
        a aVar = this.a;
        if (aVar != null) {
            aVar.b(z);
            return;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public final void a(com.soundcloud.android.comments.C2921y.a aVar) {
        C7471uYa.b(aVar, "comment");
        a aVar2 = this.a;
        if (aVar2 != null) {
            aVar2.a(aVar);
            return;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public final void a() {
        a aVar = this.a;
        if (aVar != null) {
            aVar.a();
            return;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    private final void a(Activity activity) {
        if (activity != null) {
            Window window = activity.getWindow();
            if (window != null) {
                LayoutParams attributes = window.getAttributes();
                this.c = attributes != null ? Integer.valueOf(attributes.softInputMode) : null;
                window.setSoftInputMode(32);
            }
        }
    }
}
