package com.appboy.ui;

import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.appboy.h;

public class AppboyFeedbackFragment extends Fragment {
    private Button mCancelButton;
    private OnClickListener mCancelListener;
    /* access modifiers changed from: private */
    public EditText mEmailEditText;
    /* access modifiers changed from: private */
    public boolean mErrorMessageShown;
    /* access modifiers changed from: private */
    public FeedbackFinishedListener mFeedbackFinishedListener;
    /* access modifiers changed from: private */
    public CheckBox mIsBugCheckBox;
    /* access modifiers changed from: private */
    public EditText mMessageEditText;
    private int mOriginalSoftInputMode;
    private Button mSendButton;
    private TextWatcher mSendButtonWatcher;
    private OnClickListener mSendListener;

    public interface FeedbackFinishedListener {
        String beforeFeedbackSubmitted(String str);

        void onFeedbackFinished(FeedbackResult feedbackResult);
    }

    public enum FeedbackResult {
        SENT,
        CANCELLED,
        ERROR
    }

    /* access modifiers changed from: private */
    public void clearData() {
        String str = "";
        this.mEmailEditText.setText(str);
        this.mMessageEditText.setText(str);
        this.mIsBugCheckBox.setChecked(false);
        this.mErrorMessageShown = false;
        this.mEmailEditText.setError(null);
        this.mMessageEditText.setError(null);
    }

    /* access modifiers changed from: private */
    public boolean ensureSendButton() {
        return validatedMessage() & validatedEmail();
    }

    /* access modifiers changed from: private */
    public void hideSoftKeyboard() {
        FragmentActivity activity = getActivity();
        activity.getWindow().setSoftInputMode(this.mOriginalSoftInputMode);
        if (activity.getCurrentFocus() != null) {
            ((InputMethodManager) activity.getSystemService("input_method")).hideSoftInputFromWindow(activity.getCurrentFocus().getWindowToken(), 0);
        }
    }

    private boolean validatedEmail() {
        boolean z = true;
        boolean z2 = this.mEmailEditText.getText() != null && !Ng.d(this.mEmailEditText.getText().toString()) && Og.b(this.mEmailEditText.getText().toString());
        if (this.mEmailEditText.getText() == null || !Ng.d(this.mEmailEditText.getText().toString())) {
            z = false;
        }
        if (z2) {
            this.mEmailEditText.setError(null);
        } else if (z) {
            this.mEmailEditText.setError(getResources().getString(R$string.com_appboy_feedback_form_empty_email));
        } else {
            this.mEmailEditText.setError(getResources().getString(R$string.com_appboy_feedback_form_invalid_email));
        }
        return z2;
    }

    private boolean validatedMessage() {
        boolean z = this.mMessageEditText.getText() != null && !Ng.d(this.mMessageEditText.getText().toString());
        if (z) {
            this.mMessageEditText.setError(null);
        } else {
            this.mMessageEditText.setError(getResources().getString(R$string.com_appboy_feedback_form_invalid_message));
        }
        return z;
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        this.mSendButtonWatcher = new TextWatcher() {
            public void afterTextChanged(Editable editable) {
                if (AppboyFeedbackFragment.this.mErrorMessageShown) {
                    AppboyFeedbackFragment.this.ensureSendButton();
                }
            }

            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }
        };
        this.mCancelListener = new OnClickListener() {
            public void onClick(View view) {
                AppboyFeedbackFragment.this.hideSoftKeyboard();
                if (AppboyFeedbackFragment.this.mFeedbackFinishedListener != null) {
                    AppboyFeedbackFragment.this.mFeedbackFinishedListener.onFeedbackFinished(FeedbackResult.CANCELLED);
                }
                AppboyFeedbackFragment.this.clearData();
            }
        };
        this.mSendListener = new OnClickListener() {
            public void onClick(View view) {
                if (AppboyFeedbackFragment.this.ensureSendButton()) {
                    AppboyFeedbackFragment.this.hideSoftKeyboard();
                    boolean isChecked = AppboyFeedbackFragment.this.mIsBugCheckBox.isChecked();
                    String obj = AppboyFeedbackFragment.this.mMessageEditText.getText().toString();
                    String obj2 = AppboyFeedbackFragment.this.mEmailEditText.getText().toString();
                    if (AppboyFeedbackFragment.this.mFeedbackFinishedListener != null) {
                        obj = AppboyFeedbackFragment.this.mFeedbackFinishedListener.beforeFeedbackSubmitted(obj);
                    }
                    boolean a = h.a((Context) AppboyFeedbackFragment.this.getActivity()).a(obj2, obj, isChecked);
                    if (AppboyFeedbackFragment.this.mFeedbackFinishedListener != null) {
                        AppboyFeedbackFragment.this.mFeedbackFinishedListener.onFeedbackFinished(a ? FeedbackResult.SENT : FeedbackResult.ERROR);
                    }
                    AppboyFeedbackFragment.this.clearData();
                    return;
                }
                AppboyFeedbackFragment.this.mErrorMessageShown = true;
            }
        };
        setRetainInstance(true);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R$layout.com_appboy_feedback, viewGroup, false);
        this.mCancelButton = (Button) inflate.findViewById(R$id.com_appboy_feedback_cancel);
        this.mSendButton = (Button) inflate.findViewById(R$id.com_appboy_feedback_send);
        this.mIsBugCheckBox = (CheckBox) inflate.findViewById(R$id.com_appboy_feedback_is_bug);
        this.mMessageEditText = (EditText) inflate.findViewById(R$id.com_appboy_feedback_message);
        this.mEmailEditText = (EditText) inflate.findViewById(R$id.com_appboy_feedback_email);
        this.mMessageEditText.addTextChangedListener(this.mSendButtonWatcher);
        this.mEmailEditText.addTextChangedListener(this.mSendButtonWatcher);
        this.mCancelButton.setOnClickListener(this.mCancelListener);
        this.mSendButton.setOnClickListener(this.mSendListener);
        return inflate;
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.mMessageEditText.removeTextChangedListener(this.mSendButtonWatcher);
        this.mEmailEditText.removeTextChangedListener(this.mSendButtonWatcher);
    }

    public void onResume() {
        super.onResume();
        h.a((Context) getActivity()).g();
        FragmentActivity activity = getActivity();
        Window window = activity.getWindow();
        this.mOriginalSoftInputMode = window.getAttributes().softInputMode;
        window.setSoftInputMode(16);
        h.a((Context) activity).g();
    }
}
