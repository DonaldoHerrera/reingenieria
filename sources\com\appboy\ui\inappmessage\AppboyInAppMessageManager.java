package com.appboy.ui.inappmessage;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import com.appboy.h;
import com.appboy.ui.inappmessage.factories.AppboyFullViewFactory;
import com.appboy.ui.inappmessage.factories.AppboyHtmlFullViewFactory;
import com.appboy.ui.inappmessage.factories.AppboyInAppMessageAnimationFactory;
import com.appboy.ui.inappmessage.factories.AppboyModalViewFactory;
import com.appboy.ui.inappmessage.factories.AppboySlideupViewFactory;
import com.appboy.ui.inappmessage.listeners.AppboyDefaultHtmlInAppMessageActionListener;
import com.appboy.ui.inappmessage.listeners.AppboyDefaultInAppMessageManagerListener;
import com.appboy.ui.inappmessage.listeners.AppboyInAppMessageViewLifecycleListener;
import com.appboy.ui.inappmessage.listeners.AppboyInAppMessageWebViewClientListener;
import com.appboy.ui.inappmessage.listeners.IHtmlInAppMessageActionListener;
import com.appboy.ui.inappmessage.listeners.IInAppMessageManagerListener;
import com.appboy.ui.inappmessage.listeners.IInAppMessageViewLifecycleListener;
import com.appboy.ui.inappmessage.listeners.IInAppMessageWebViewClientListener;
import com.appboy.ui.support.ViewUtils;
import java.util.Stack;
import java.util.concurrent.atomic.AtomicBoolean;

public final class AppboyInAppMessageManager {
    private static final String TAG = Hg.a(AppboyInAppMessageManager.class);
    private static volatile AppboyInAppMessageManager sInstance = null;
    private Activity mActivity;
    private Context mApplicationContext;
    private C0522cg mCarryoverInAppMessage;
    private IHtmlInAppMessageActionListener mCustomHtmlInAppMessageActionListener;
    private IInAppMessageAnimationFactory mCustomInAppMessageAnimationFactory;
    private IInAppMessageManagerListener mCustomInAppMessageManagerListener;
    private IInAppMessageViewFactory mCustomInAppMessageViewFactory;
    private IHtmlInAppMessageActionListener mDefaultHtmlInAppMessageActionListener = new AppboyDefaultHtmlInAppMessageActionListener();
    private IInAppMessageManagerListener mDefaultInAppMessageManagerListener = new AppboyDefaultInAppMessageManagerListener();
    private AtomicBoolean mDisplayingInAppMessage = new AtomicBoolean(false);
    private IInAppMessageAnimationFactory mInAppMessageAnimationFactory = new AppboyInAppMessageAnimationFactory();
    private Yf<Zf> mInAppMessageEventSubscriber;
    private IInAppMessageViewFactory mInAppMessageFullViewFactory = new AppboyFullViewFactory();
    private IInAppMessageViewFactory mInAppMessageHtmlFullViewFactory = new AppboyHtmlFullViewFactory(this.mInAppMessageWebViewClientListener);
    private IInAppMessageViewFactory mInAppMessageModalViewFactory = new AppboyModalViewFactory();
    private IInAppMessageViewFactory mInAppMessageSlideupViewFactory = new AppboySlideupViewFactory();
    private final Stack<C0522cg> mInAppMessageStack = new Stack<>();
    private final IInAppMessageViewLifecycleListener mInAppMessageViewLifecycleListener = new AppboyInAppMessageViewLifecycleListener();
    private IInAppMessageViewWrapper mInAppMessageViewWrapper;
    private final IInAppMessageWebViewClientListener mInAppMessageWebViewClientListener = new AppboyInAppMessageWebViewClientListener();
    private Integer mOriginalOrientation;
    private C0522cg mUnRegisteredInAppMessage;

    /* renamed from: com.appboy.ui.inappmessage.AppboyInAppMessageManager$3 reason: invalid class name */
    static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] $SwitchMap$com$appboy$ui$inappmessage$InAppMessageOperation = new int[InAppMessageOperation.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        static {
            $SwitchMap$com$appboy$ui$inappmessage$InAppMessageOperation[InAppMessageOperation.DISPLAY_NOW.ordinal()] = 1;
            $SwitchMap$com$appboy$ui$inappmessage$InAppMessageOperation[InAppMessageOperation.DISPLAY_LATER.ordinal()] = 2;
            try {
                $SwitchMap$com$appboy$ui$inappmessage$InAppMessageOperation[InAppMessageOperation.DISCARD.ordinal()] = 3;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    private Yf<Zf> createInAppMessageEventSubscriber() {
        return new Yf<Zf>() {
            public void trigger(Zf zf) {
                if (!AppboyInAppMessageManager.this.getInAppMessageManagerListener().onInAppMessageReceived(zf.a())) {
                    AppboyInAppMessageManager.this.addInAppMessage(zf.a());
                }
            }
        };
    }

    private boolean currentOrientationIsValid(int i, Uf uf) {
        if (i == 2 && uf == Uf.LANDSCAPE) {
            Hg.a(TAG, "Current and preferred orientation are landscape.");
            return true;
        } else if (i == 1 && uf == Uf.PORTRAIT) {
            Hg.a(TAG, "Current and preferred orientation are portrait.");
            return true;
        } else {
            String str = TAG;
            StringBuilder sb = new StringBuilder();
            sb.append("Current orientation ");
            sb.append(i);
            sb.append(" and preferred orientation ");
            sb.append(uf);
            sb.append(" don't match");
            Hg.a(str, sb.toString());
            return false;
        }
    }

    private IInAppMessageAnimationFactory getInAppMessageAnimationFactory() {
        IInAppMessageAnimationFactory iInAppMessageAnimationFactory = this.mCustomInAppMessageAnimationFactory;
        return iInAppMessageAnimationFactory != null ? iInAppMessageAnimationFactory : this.mInAppMessageAnimationFactory;
    }

    private IInAppMessageViewFactory getInAppMessageViewFactory(C0522cg cgVar) {
        IInAppMessageViewFactory iInAppMessageViewFactory = this.mCustomInAppMessageViewFactory;
        if (iInAppMessageViewFactory != null) {
            return iInAppMessageViewFactory;
        }
        if (cgVar instanceof C1510mg) {
            return this.mInAppMessageSlideupViewFactory;
        }
        if (cgVar instanceof C1479lg) {
            return this.mInAppMessageModalViewFactory;
        }
        if (cgVar instanceof C1356hg) {
            return this.mInAppMessageFullViewFactory;
        }
        if (cgVar instanceof C1417jg) {
            return this.mInAppMessageHtmlFullViewFactory;
        }
        return null;
    }

    public static AppboyInAppMessageManager getInstance() {
        if (sInstance == null) {
            synchronized (AppboyInAppMessageManager.class) {
                if (sInstance == null) {
                    sInstance = new AppboyInAppMessageManager();
                }
            }
        }
        return sInstance;
    }

    public void addInAppMessage(C0522cg cgVar) {
        this.mInAppMessageStack.push(cgVar);
        requestDisplayInAppMessage();
    }

    /* access modifiers changed from: 0000 */
    public boolean displayInAppMessage(C0522cg cgVar, boolean z) {
        if (!this.mDisplayingInAppMessage.compareAndSet(false, true)) {
            Hg.a(TAG, "A in-app message is currently being displayed. Adding in-app message back on the stack.");
            this.mInAppMessageStack.push(cgVar);
            return false;
        }
        try {
            if (this.mActivity != null) {
                if (!z) {
                    long expirationTimestamp = cgVar.getExpirationTimestamp();
                    if (expirationTimestamp > 0) {
                        long currentTimeMillis = System.currentTimeMillis();
                        if (currentTimeMillis > expirationTimestamp) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("In-app message is expired. Doing nothing. Expiration: $");
                            sb.append(expirationTimestamp);
                            sb.append(". Current time: ");
                            sb.append(currentTimeMillis);
                            throw new Exception(sb.toString());
                        }
                    } else {
                        Hg.a(TAG, "Expiration timestamp not defined. Continuing.");
                    }
                } else {
                    Hg.a(TAG, "Not checking expiration status for carry-over in-app message.");
                }
                if (verifyOrientationStatus(cgVar)) {
                    IInAppMessageViewFactory inAppMessageViewFactory = getInAppMessageViewFactory(cgVar);
                    if (inAppMessageViewFactory != null) {
                        View createInAppMessageView = inAppMessageViewFactory.createInAppMessageView(this.mActivity, cgVar);
                        if (createInAppMessageView == null) {
                            throw new Exception("The in-app message view returned from the IInAppMessageViewFactory was null. The in-app message will not be displayed and will not be put back on the stack.");
                        } else if (createInAppMessageView.getParent() == null) {
                            Animation openingAnimation = getInAppMessageAnimationFactory().getOpeningAnimation(cgVar);
                            Animation closingAnimation = getInAppMessageAnimationFactory().getClosingAnimation(cgVar);
                            if (createInAppMessageView instanceof IInAppMessageImmersiveView) {
                                Hg.a(TAG, "Creating view wrapper for immersive in-app message.");
                                IInAppMessageImmersiveView iInAppMessageImmersiveView = (IInAppMessageImmersiveView) createInAppMessageView;
                                InAppMessageViewWrapper inAppMessageViewWrapper = new InAppMessageViewWrapper(createInAppMessageView, cgVar, this.mInAppMessageViewLifecycleListener, openingAnimation, closingAnimation, iInAppMessageImmersiveView.getMessageClickableView(), iInAppMessageImmersiveView.getMessageButtonViews(), iInAppMessageImmersiveView.getMessageCloseButtonView());
                                this.mInAppMessageViewWrapper = inAppMessageViewWrapper;
                            } else if (createInAppMessageView instanceof IInAppMessageView) {
                                Hg.a(TAG, "Creating view wrapper for base in-app message.");
                                View view = createInAppMessageView;
                                C0522cg cgVar2 = cgVar;
                                InAppMessageViewWrapper inAppMessageViewWrapper2 = new InAppMessageViewWrapper(view, cgVar2, this.mInAppMessageViewLifecycleListener, openingAnimation, closingAnimation, ((IInAppMessageView) createInAppMessageView).getMessageClickableView());
                                this.mInAppMessageViewWrapper = inAppMessageViewWrapper2;
                            } else {
                                Hg.a(TAG, "Creating view wrapper for in-app message.");
                                InAppMessageViewWrapper inAppMessageViewWrapper3 = new InAppMessageViewWrapper(createInAppMessageView, cgVar, this.mInAppMessageViewLifecycleListener, openingAnimation, closingAnimation, createInAppMessageView);
                                this.mInAppMessageViewWrapper = inAppMessageViewWrapper3;
                            }
                            this.mInAppMessageViewWrapper.open(this.mActivity);
                            return true;
                        } else {
                            throw new Exception("The in-app message view returned from the IInAppMessageViewFactory already has a parent. This is a sign that the view is being reused. The IInAppMessageViewFactory method createInAppMessageViewmust return a new view without a parent. The in-app message will not be displayed and will not be put back on the stack.");
                        }
                    } else {
                        throw new Exception("ViewFactory from getInAppMessageViewFactory was null.");
                    }
                } else {
                    throw new Exception("Current orientation did not match specified orientation for in-app message. Doing nothing.");
                }
            } else {
                this.mCarryoverInAppMessage = cgVar;
                throw new Exception("No activity is currently registered to receive in-app messages. Registering in-app message as carry-over in-app message. It will automatically be displayed when the next activity registers to receive in-app messages.");
            }
        } catch (Exception e) {
            Hg.b(TAG, "Could not display in-app message", e);
            resetAfterInAppMessageClose();
            return false;
        }
    }

    public void ensureSubscribedToInAppMessageEvents(Context context) {
        if (this.mInAppMessageEventSubscriber == null) {
            Hg.a(TAG, "Subscribing in-app message event subscriber");
            this.mInAppMessageEventSubscriber = createInAppMessageEventSubscriber();
            h.a(context).b(this.mInAppMessageEventSubscriber);
        }
    }

    public Activity getActivity() {
        return this.mActivity;
    }

    public Context getApplicationContext() {
        return this.mApplicationContext;
    }

    public IHtmlInAppMessageActionListener getHtmlInAppMessageActionListener() {
        IHtmlInAppMessageActionListener iHtmlInAppMessageActionListener = this.mCustomHtmlInAppMessageActionListener;
        return iHtmlInAppMessageActionListener != null ? iHtmlInAppMessageActionListener : this.mDefaultHtmlInAppMessageActionListener;
    }

    public IInAppMessageManagerListener getInAppMessageManagerListener() {
        IInAppMessageManagerListener iInAppMessageManagerListener = this.mCustomInAppMessageManagerListener;
        return iInAppMessageManagerListener != null ? iInAppMessageManagerListener : this.mDefaultInAppMessageManagerListener;
    }

    public void hideCurrentlyDisplayingInAppMessage(boolean z) {
        IInAppMessageViewWrapper iInAppMessageViewWrapper = this.mInAppMessageViewWrapper;
        if (iInAppMessageViewWrapper != null) {
            if (z) {
                this.mInAppMessageViewLifecycleListener.onDismissed(iInAppMessageViewWrapper.getInAppMessageView(), iInAppMessageViewWrapper.getInAppMessage());
            }
            iInAppMessageViewWrapper.close();
        }
    }

    public void registerInAppMessageManager(Activity activity) {
        Hg.a(TAG, "registerInAppMessageManager called");
        this.mActivity = activity;
        Activity activity2 = this.mActivity;
        if (activity2 != null && this.mApplicationContext == null) {
            this.mApplicationContext = activity2.getApplicationContext();
        }
        if (this.mCarryoverInAppMessage != null) {
            Hg.a(TAG, "Requesting display of carryover in-app message.");
            this.mCarryoverInAppMessage.setAnimateIn(false);
            displayInAppMessage(this.mCarryoverInAppMessage, true);
            this.mCarryoverInAppMessage = null;
        } else if (this.mUnRegisteredInAppMessage != null) {
            Hg.a(TAG, "Adding previously unregistered in-app message.");
            addInAppMessage(this.mUnRegisteredInAppMessage);
            this.mUnRegisteredInAppMessage = null;
        }
        ensureSubscribedToInAppMessageEvents(this.mApplicationContext);
    }

    public boolean requestDisplayInAppMessage() {
        try {
            if (this.mActivity == null) {
                if (!this.mInAppMessageStack.empty()) {
                    Hg.e(TAG, "No activity is currently registered to receive in-app messages. Saving in-app message as unregistered in-app message. It will automatically be displayed when the next activity registers to receive in-app messages.");
                    this.mUnRegisteredInAppMessage = (C0522cg) this.mInAppMessageStack.pop();
                } else {
                    Hg.a(TAG, "No activity is currently registered to receive in-app messages and the in-app message stack is empty. Doing nothing.");
                }
                return false;
            } else if (this.mDisplayingInAppMessage.get()) {
                Hg.a(TAG, "A in-app message is currently being displayed. Ignoring request to display in-app message.");
                return false;
            } else if (this.mInAppMessageStack.isEmpty()) {
                Hg.a(TAG, "The in-app message stack is empty. No in-app message will be displayed.");
                return false;
            } else {
                final C0522cg cgVar = (C0522cg) this.mInAppMessageStack.pop();
                int i = AnonymousClass3.$SwitchMap$com$appboy$ui$inappmessage$InAppMessageOperation[getInAppMessageManagerListener().beforeInAppMessageDisplayed(cgVar).ordinal()];
                if (i == 1) {
                    Hg.a(TAG, "The IInAppMessageManagerListener method beforeInAppMessageDisplayed returned DISPLAY_NOW. The in-app message will be displayed.");
                    new Handler(this.mApplicationContext.getMainLooper()).post(new Runnable() {
                        public void run() {
                            new AppboyAsyncInAppMessageDisplayer().execute(new C0522cg[]{cgVar});
                        }
                    });
                    return true;
                } else if (i == 2) {
                    Hg.a(TAG, "The IInAppMessageManagerListener method beforeInAppMessageDisplayed returned DISPLAY_LATER. The in-app message will be pushed back onto the stack.");
                    this.mInAppMessageStack.push(cgVar);
                    return false;
                } else if (i != 3) {
                    Hg.b(TAG, "The IInAppMessageManagerListener method beforeInAppMessageDisplayed returned null instead of a InAppMessageOperation. Ignoring the in-app message. Please check the IInAppMessageStackBehaviour implementation.");
                    return false;
                } else {
                    Hg.a(TAG, "The IInAppMessageManagerListener method beforeInAppMessageDisplayed returned DISCARD. The in-app message will not be displayed and will not be put back on the stack.");
                    return false;
                }
            }
        } catch (Exception e) {
            Hg.b(TAG, "Error running requestDisplayInAppMessage", e);
            return false;
        }
    }

    public void resetAfterInAppMessageClose() {
        this.mInAppMessageViewWrapper = null;
        this.mDisplayingInAppMessage.set(false);
        Activity activity = this.mActivity;
        if (activity != null) {
            Integer num = this.mOriginalOrientation;
            if (num != null) {
                activity.setRequestedOrientation(num.intValue());
                String str = TAG;
                StringBuilder sb = new StringBuilder();
                sb.append("Setting requested orientation to original orientation ");
                sb.append(this.mOriginalOrientation);
                Hg.a(str, sb.toString());
                this.mOriginalOrientation = null;
            }
        }
    }

    public void setCustomInAppMessageManagerListener(IInAppMessageManagerListener iInAppMessageManagerListener) {
        Hg.a(TAG, "Custom InAppMessageManagerListener set");
        this.mCustomInAppMessageManagerListener = iInAppMessageManagerListener;
    }

    public void unregisterInAppMessageManager(Activity activity) {
        Hg.a(TAG, "unregisterInAppMessageManager called");
        IInAppMessageViewWrapper iInAppMessageViewWrapper = this.mInAppMessageViewWrapper;
        if (iInAppMessageViewWrapper != null) {
            ViewUtils.removeViewFromParent(iInAppMessageViewWrapper.getInAppMessageView());
            if (this.mInAppMessageViewWrapper.getIsAnimatingClose()) {
                this.mInAppMessageViewLifecycleListener.afterClosed(this.mInAppMessageViewWrapper.getInAppMessage());
                this.mCarryoverInAppMessage = null;
            } else {
                this.mCarryoverInAppMessage = this.mInAppMessageViewWrapper.getInAppMessage();
            }
            this.mInAppMessageViewWrapper = null;
        } else {
            this.mCarryoverInAppMessage = null;
        }
        this.mActivity = null;
        this.mDisplayingInAppMessage.set(false);
    }

    /* access modifiers changed from: 0000 */
    public boolean verifyOrientationStatus(C0522cg cgVar) {
        if (ViewUtils.isRunningOnTablet(this.mActivity)) {
            Hg.a(TAG, "Running on tablet. In-app message can be displayed in any orientation.");
            return true;
        }
        Uf orientation = cgVar.getOrientation();
        if (orientation == null) {
            Hg.a(TAG, "No orientation specified. In-app message can be displayed in any orientation.");
            return true;
        } else if (orientation == Uf.ANY) {
            Hg.a(TAG, "Any orientation specified. In-app message can be displayed in any orientation.");
            return true;
        } else if (!currentOrientationIsValid(this.mActivity.getResources().getConfiguration().orientation, orientation)) {
            return false;
        } else {
            if (this.mOriginalOrientation == null) {
                Hg.a(TAG, "Requesting orientation lock.");
                this.mOriginalOrientation = Integer.valueOf(this.mActivity.getRequestedOrientation());
                this.mActivity.setRequestedOrientation(14);
            }
            return true;
        }
    }
}
