package com.soundcloud.android.comments;

import android.view.View;
import com.soundcloud.android.comments.C2921y.b;
import com.soundcloud.android.ia.l;

@EVa(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0010\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001eB\u000f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0016J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0007H\u0016J\u001e\u0010\u0014\u001a\u00020\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u00172\u0006\u0010\u0013\u001a\u00020\u0007H\u0016J\u000e\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019H\u0016J\u0010\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u0007H\u0016J\u000e\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u000eH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0010\n\u0002\u0010\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u001f"}, d2 = {"Lcom/soundcloud/android/comments/CommentsAdapter;", "Lcom/soundcloud/android/uniflow/android/UniflowAdapter;", "Lcom/soundcloud/android/comments/CommentViewModel;", "commentRenderer", "Lcom/soundcloud/android/comments/CommentRenderer;", "(Lcom/soundcloud/android/comments/CommentRenderer;)V", "flashPosition", "", "getFlashPosition", "()Ljava/lang/Integer;", "setFlashPosition", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "commentLongClick", "Lio/reactivex/Observable;", "Lcom/soundcloud/android/comments/CommentActionsSheetParams;", "createProgressCellRenderer", "Lcom/soundcloud/android/uniflow/android/ProgressCellRenderer;", "getBasicItemViewType", "position", "onItemBound", "", "scViewHolder", "Lcom/soundcloud/android/uniflow/android/ScViewHolder;", "onItemClick", "Lio/reactivex/subjects/PublishSubject;", "Lcom/soundcloud/android/comments/SelectedCommentParams;", "setFlashOnBind", "userImageClick", "Lcom/soundcloud/android/comments/CommentAvatarParams;", "Factory", "track-comments_release"}, mv = {1, 1, 15})
/* compiled from: CommentsAdapter.kt */
public class A extends C5407WEa<C2921y> {
    private Integer g;
    private final r h;

    /* compiled from: CommentsAdapter.kt */
    public static final class a {
        public final A a(r rVar) {
            C7471uYa.b(rVar, "commentRenderer");
            return new A(rVar);
        }
    }

    public A(r rVar) {
        C7471uYa.b(rVar, "commentRenderer");
        super((C5693cFa<? extends T>[]) new C5693cFa[]{new C5693cFa(b.COMMENT.ordinal(), rVar)});
        this.h = rVar;
    }

    public void a(Integer num) {
        this.g = num;
    }

    public void b(C5378VEa<C2921y> vEa, int i) {
        C7471uYa.b(vEa, "scViewHolder");
        Integer k = k();
        String str = "scViewHolder.itemView";
        if (k != null && k.intValue() == i) {
            r rVar = this.h;
            View view = vEa.itemView;
            C7471uYa.a((Object) view, str);
            rVar.b(view);
            return;
        }
        r rVar2 = this.h;
        View view2 = vEa.itemView;
        C7471uYa.a((Object) view2, str);
        rVar2.a(view2);
    }

    public int f(int i) {
        return ((C2921y) g(i)).a().ordinal();
    }

    public C5109MEa g() {
        return new C4767BEa(l.comment_next_page_progress_bar);
    }

    public void i(int i) {
        a(Integer.valueOf(i));
    }

    public APa<C2890i> j() {
        return this.h.a();
    }

    public Integer k() {
        return this.g;
    }

    public C6781kVa<eb> l() {
        return this.h.b();
    }

    public APa<C2892j> m() {
        return this.h.c();
    }
}
