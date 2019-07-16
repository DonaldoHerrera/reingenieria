package com.soundcloud.android.image;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import com.soundcloud.android.image.ca.c;
import java.io.FileNotFoundException;
import java.util.Set;

@EVa(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\u0010\u0006J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016J\u0012\u0010\f\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0002J\u0010\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0010H\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, d2 = {"Lcom/soundcloud/android/image/FallbackImageConsumer;", "Lio/reactivex/functions/Consumer;", "Lcom/soundcloud/android/image/LoadingState;", "notFoundUris", "", "", "(Ljava/util/Set;)V", "getNotFoundUris", "()Ljava/util/Set;", "accept", "", "loadingState", "animatePlaceholder", "view", "Landroid/view/View;", "onLoadingFailed", "Lcom/soundcloud/android/image/LoadingState$Fail;", "Companion", "image_release"}, mv = {1, 1, 15})
/* renamed from: com.soundcloud.android.image.j reason: case insensitive filesystem */
/* compiled from: FallbackImageConsumer.kt */
public final class C3729j implements C6776kQa<ca> {
    public static final a a = new a(null);
    private final Set<String> b;

    /* renamed from: com.soundcloud.android.image.j$a */
    /* compiled from: FallbackImageConsumer.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }
    }

    public C3729j(Set<String> set) {
        C7471uYa.b(set, "notFoundUris");
        this.b = set;
    }

    /* renamed from: a */
    public void accept(ca caVar) {
        C7471uYa.b(caVar, "loadingState");
        if (caVar instanceof c) {
            a((c) caVar);
        }
    }

    private final void a(c cVar) {
        if ((cVar.a() instanceof FileNotFoundException) || (cVar.a() instanceof da)) {
            String b2 = cVar.b();
            if (b2 != null) {
                this.b.add(b2);
            }
        } else {
            b a2 = SDb.a("ImageLoader");
            StringBuilder sb = new StringBuilder();
            sb.append("Failed loading ");
            sb.append(cVar.b());
            sb.append("; reason: ");
            sb.append(cVar.a().getMessage());
            a2.b(sb.toString(), new Object[0]);
        }
        a(cVar.c());
    }

    private final void a(View view) {
        if (view != null && (view instanceof ImageView)) {
            Drawable drawable = ((ImageView) view).getDrawable();
            if (!(drawable instanceof ea)) {
                drawable = null;
            }
            ea eaVar = (ea) drawable;
            if (eaVar != null) {
                eaVar.startTransition(200);
            }
        }
    }
}
