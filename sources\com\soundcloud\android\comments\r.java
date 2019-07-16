package com.soundcloud.android.comments;

import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.ImageView;
import com.soundcloud.android.comments.C2872ab.i;
import com.soundcloud.android.ia.g;
import com.soundcloud.android.ia.p;
import com.soundcloud.android.image.C3721b;
import com.soundcloud.android.image.N;
import com.soundcloud.android.view.customfontviews.CustomFontTextView;
import java.util.concurrent.TimeUnit;

@EVa(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\"B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0001\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ \u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0002H\u0016J\u0010\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u0010\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\u0018\u0010\u001f\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010 \u001a\u00020\u0002H\u0012J\u0010\u0010!\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0019H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u000bX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u000bX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000e¨\u0006#"}, d2 = {"Lcom/soundcloud/android/comments/CommentRenderer;", "Lcom/soundcloud/android/presentation/LegacyCellRenderer;", "Lcom/soundcloud/android/comments/CommentViewModel$CommentItem;", "resources", "Landroid/content/res/Resources;", "imageOperations", "Lcom/soundcloud/android/image/ImageOperations;", "commentLayoutResId", "", "(Landroid/content/res/Resources;Lcom/soundcloud/android/image/ImageOperations;I)V", "commentLongClick", "Lio/reactivex/subjects/PublishSubject;", "Lcom/soundcloud/android/comments/CommentActionsSheetParams;", "getCommentLongClick", "()Lio/reactivex/subjects/PublishSubject;", "onClick", "Lcom/soundcloud/android/comments/SelectedCommentParams;", "getOnClick", "userImageClick", "Lcom/soundcloud/android/comments/CommentAvatarParams;", "getUserImageClick", "bindItemView", "", "position", "itemView", "Landroid/view/View;", "item", "clearFlash", "createItemView", "parent", "Landroid/view/ViewGroup;", "showCommenter", "comment", "showFlash", "Factory", "track-comments_release"}, mv = {1, 1, 15})
/* compiled from: CommentRenderer.kt */
public class r extends C5541_ta<com.soundcloud.android.comments.C2921y.a> {
    private final C6781kVa<C2892j> a;
    private final C6781kVa<C2890i> b;
    private final C6781kVa<eb> c;
    private final Resources d;
    private final N e;
    private final int f;

    /* compiled from: CommentRenderer.kt */
    public static final class a {
        private final Resources a;
        private final N b;

        public a(Resources resources, N n) {
            C7471uYa.b(resources, "resources");
            C7471uYa.b(n, "imageOperations");
            this.a = resources;
            this.b = n;
        }

        public final r a(int i) {
            return new r(this.a, this.b, i);
        }
    }

    public r(Resources resources, N n, int i) {
        C7471uYa.b(resources, "resources");
        C7471uYa.b(n, "imageOperations");
        this.d = resources;
        this.e = n;
        this.f = i;
        C6781kVa<C2892j> s = C6781kVa.s();
        String str = "PublishSubject.create()";
        C7471uYa.a((Object) s, str);
        this.a = s;
        C6781kVa<C2890i> s2 = C6781kVa.s();
        C7471uYa.a((Object) s2, str);
        this.b = s2;
        C6781kVa<eb> s3 = C6781kVa.s();
        C7471uYa.a((Object) s3, str);
        this.c = s3;
    }

    public C6781kVa<eb> b() {
        return this.c;
    }

    public C6781kVa<C2892j> c() {
        return this.a;
    }

    public C6781kVa<C2890i> a() {
        return this.b;
    }

    public View b(ViewGroup viewGroup) {
        C7471uYa.b(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(this.f, viewGroup, false);
        C7471uYa.a((Object) inflate, "inflate(commentLayoutResId, parent, false)");
        C7471uYa.a((Object) inflate, "with(LayoutInflater.from…sId, parent, false)\n    }");
        return inflate;
    }

    public void a(View view) {
        C7471uYa.b(view, "itemView");
        View findViewById = view.findViewById(i.comment_and_commenter_text_flash);
        findViewById.clearAnimation();
        findViewById.setVisibility(8);
    }

    public void b(View view) {
        C7471uYa.b(view, "itemView");
        View findViewById = view.findViewById(i.comment_and_commenter_text_flash);
        findViewById.animate().alpha(0.0f).setDuration(800).start();
        findViewById.setVisibility(0);
    }

    public void a(int i, View view, com.soundcloud.android.comments.C2921y.a aVar) {
        int i2 = i;
        View view2 = view;
        com.soundcloud.android.comments.C2921y.a aVar2 = aVar;
        C7471uYa.b(view2, "itemView");
        C7471uYa.b(aVar2, "item");
        view2.post(new C2915v(view2));
        view2.setSelected(aVar.m());
        ImageView imageView = (ImageView) view2.findViewById(i.user_image);
        String str = "itemView.user_image";
        C7471uYa.a((Object) imageView, str);
        int i3 = 0;
        imageView.setContentDescription(this.d.getString(p.accessibility_user_profile, new Object[]{aVar.k()}));
        ((ImageView) view2.findViewById(i.user_image)).setOnClickListener(new C2909s(aVar2, this, view2, i2));
        view2.setOnClickListener(new C2911t(aVar2, this, view2, i2));
        CustomFontTextView customFontTextView = (CustomFontTextView) view2.findViewById(i.comment_text);
        C7471uYa.a((Object) customFontTextView, "itemView.comment_text");
        customFontTextView.setText(aVar.d());
        N n = this.e;
        C3508cda j = aVar.j();
        C4928GKa f2 = aVar.f();
        C3721b b2 = C3721b.b(this.d);
        C7471uYa.a((Object) b2, "ApiImageSize.getFullImageSize(resources)");
        ImageView imageView2 = (ImageView) view2.findViewById(i.user_image);
        C7471uYa.a((Object) imageView2, str);
        N.a(n, j, f2, b2, imageView2, null, 16, null);
        a(view2, aVar2);
        ImageView imageView3 = (ImageView) view2.findViewById(i.user_image);
        C7471uYa.a((Object) imageView3, str);
        LayoutParams layoutParams = imageView3.getLayoutParams();
        if (layoutParams instanceof MarginLayoutParams) {
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
            if (aVar.l()) {
                i3 = this.d.getDimensionPixelOffset(g.comment_reply_margin_start);
            }
            marginLayoutParams.leftMargin = i3;
        }
        view2.setOnLongClickListener(new C2913u(aVar2, this, view2, i2));
    }

    private void a(View view, com.soundcloud.android.comments.C2921y.a aVar) {
        CustomFontTextView customFontTextView = (CustomFontTextView) view.findViewById(i.commenter_text);
        C7471uYa.a((Object) customFontTextView, "itemView.commenter_text");
        customFontTextView.setText(aVar.k());
        String str = "itemView.commenter_sub_text";
        if (!aVar.l()) {
            CustomFontTextView customFontTextView2 = (CustomFontTextView) view.findViewById(i.commenter_sub_text);
            C7471uYa.a((Object) customFontTextView2, str);
            customFontTextView2.setText(this.d.getString(p.commenter_sub_text_with_timestamp, new Object[]{C7315sGa.a(aVar.g(), TimeUnit.MILLISECONDS), C7315sGa.b.a(this.d, aVar.e())}));
            return;
        }
        CustomFontTextView customFontTextView3 = (CustomFontTextView) view.findViewById(i.commenter_sub_text);
        C7471uYa.a((Object) customFontTextView3, str);
        Resources resources = this.d;
        customFontTextView3.setText(resources.getString(p.commenter_sub_text, new Object[]{C7315sGa.b.a(resources, aVar.e())}));
        CustomFontTextView customFontTextView4 = (CustomFontTextView) view.findViewById(i.commenter_sub_text);
        C7471uYa.a((Object) customFontTextView4, str);
        customFontTextView4.setContentDescription(this.d.getString(p.commenter_sub_text_with_timestamp, new Object[]{C7315sGa.a(aVar.g(), TimeUnit.MILLISECONDS), C7315sGa.b.a(this.d, aVar.e())}));
    }
}
