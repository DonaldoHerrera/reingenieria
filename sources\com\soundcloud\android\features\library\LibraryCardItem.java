package com.soundcloud.android.features.library;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.soundcloud.android.ia.i;
import com.soundcloud.android.ia.l;

@EVa(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0013"}, d2 = {"Lcom/soundcloud/android/features/library/LibraryCardItem;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "closeButton", "Landroid/view/View;", "getCloseButton", "()Landroid/view/View;", "description", "Landroid/widget/TextView;", "getDescription", "()Landroid/widget/TextView;", "setDescription", "", "descriptionRes", "", "collections-ui_release"}, mv = {1, 1, 15})
/* compiled from: LibraryCardItem.kt */
public class LibraryCardItem extends LinearLayout {
    private final TextView a;
    private final View b;

    public LibraryCardItem(Context context, AttributeSet attributeSet) {
        C7471uYa.b(context, "context");
        C7471uYa.b(attributeSet, "attrs");
        super(context, attributeSet);
        View.inflate(context, l.collections_onboarding_item, this);
        View findViewById = findViewById(i.description);
        C7471uYa.a((Object) findViewById, "findViewById(R.id.description)");
        this.a = (TextView) findViewById;
        View findViewById2 = findViewById(i.close_button);
        C7471uYa.a((Object) findViewById2, "findViewById(R.id.close_button)");
        this.b = findViewById2;
    }

    public View getCloseButton() {
        return this.b;
    }

    public TextView getDescription() {
        return this.a;
    }

    public void setDescription(int i) {
        getDescription().setText(getContext().getString(i));
    }
}
