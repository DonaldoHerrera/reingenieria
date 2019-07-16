package com.appboy.ui.widget;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.appboy.ui.R$drawable;
import com.appboy.ui.R$id;
import com.appboy.ui.R$layout;
import com.appboy.ui.actions.IAction;

public class TextAnnouncementCardView extends BaseCardView<C1752ug> {
    /* access modifiers changed from: private */
    public static final String TAG = Hg.a(TextAnnouncementCardView.class);
    /* access modifiers changed from: private */
    public IAction mCardAction;
    private final TextView mDescription;
    private final TextView mDomain;
    private final TextView mTitle;

    public TextAnnouncementCardView(Context context) {
        this(context, null);
    }

    /* access modifiers changed from: protected */
    public int getLayoutResource() {
        return R$layout.com_appboy_text_announcement_card;
    }

    public TextAnnouncementCardView(Context context, C1752ug ugVar) {
        super(context);
        this.mTitle = (TextView) findViewById(R$id.com_appboy_text_announcement_card_title);
        this.mDescription = (TextView) findViewById(R$id.com_appboy_text_announcement_card_description);
        this.mDomain = (TextView) findViewById(R$id.com_appboy_text_announcement_card_domain);
        if (ugVar != null) {
            setCard(ugVar);
        }
        safeSetBackground(getResources().getDrawable(R$drawable.com_appboy_card_background));
    }

    public void onSetCard(final C1752ug ugVar) {
        this.mTitle.setText(ugVar.q());
        this.mDescription.setText(ugVar.o());
        setOptionalTextView(this.mDomain, ugVar.p());
        this.mCardAction = BaseCardView.getUriActionForCard(ugVar);
        setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                TextAnnouncementCardView textAnnouncementCardView = TextAnnouncementCardView.this;
                BaseCardView.handleCardClick(textAnnouncementCardView.mContext, ugVar, textAnnouncementCardView.mCardAction, TextAnnouncementCardView.TAG);
            }
        });
    }
}
