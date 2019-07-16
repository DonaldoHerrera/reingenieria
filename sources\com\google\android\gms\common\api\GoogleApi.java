package com.google.android.gms.common.api;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api.AnyClient;
import com.google.android.gms.common.api.Api.ApiOptions;
import com.google.android.gms.common.api.Api.ApiOptions.HasAccountOptions;
import com.google.android.gms.common.api.Api.ApiOptions.HasGoogleSignInAccountOptions;
import com.google.android.gms.common.api.Api.Client;
import com.google.android.gms.common.api.internal.ApiExceptionMapper;
import com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl;
import com.google.android.gms.common.api.internal.GoogleApiManager;
import com.google.android.gms.common.api.internal.GoogleApiManager.zaa;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey;
import com.google.android.gms.common.api.internal.ListenerHolders;
import com.google.android.gms.common.api.internal.RegisterListenerMethod;
import com.google.android.gms.common.api.internal.RegistrationMethods;
import com.google.android.gms.common.api.internal.StatusExceptionMapper;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.common.api.internal.UnregisterListenerMethod;
import com.google.android.gms.common.api.internal.zaae;
import com.google.android.gms.common.api.internal.zabp;
import com.google.android.gms.common.api.internal.zace;
import com.google.android.gms.common.api.internal.zai;
import com.google.android.gms.common.internal.ClientSettings.Builder;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Collections;
import java.util.Set;

@KeepForSdk
public class GoogleApi<O extends ApiOptions> {
    private final Api<O> mApi;
    private final Context mContext;
    private final int mId;
    private final O zabh;
    private final zai<O> zabi;
    private final Looper zabj;
    private final GoogleApiClient zabk;
    private final StatusExceptionMapper zabl;
    protected final GoogleApiManager zabm;

    @KeepForSdk
    public static class Settings {
        @KeepForSdk
        public static final Settings DEFAULT_SETTINGS = new Builder().build();
        public final StatusExceptionMapper zabn;
        public final Looper zabo;

        @KeepForSdk
        public static class Builder {
            private Looper zabj;
            private StatusExceptionMapper zabl;

            @KeepForSdk
            public Settings build() {
                if (this.zabl == null) {
                    this.zabl = new ApiExceptionMapper();
                }
                if (this.zabj == null) {
                    this.zabj = Looper.getMainLooper();
                }
                return new Settings(this.zabl, this.zabj);
            }

            @KeepForSdk
            public Builder setLooper(Looper looper) {
                Preconditions.checkNotNull(looper, "Looper must not be null.");
                this.zabj = looper;
                return this;
            }

            @KeepForSdk
            public Builder setMapper(StatusExceptionMapper statusExceptionMapper) {
                Preconditions.checkNotNull(statusExceptionMapper, "StatusExceptionMapper must not be null.");
                this.zabl = statusExceptionMapper;
                return this;
            }
        }

        @KeepForSdk
        private Settings(StatusExceptionMapper statusExceptionMapper, Account account, Looper looper) {
            this.zabn = statusExceptionMapper;
            this.zabo = looper;
        }
    }

    @KeepForSdk
    protected GoogleApi(Context context, Api<O> api, Looper looper) {
        Preconditions.checkNotNull(context, "Null context is not permitted.");
        Preconditions.checkNotNull(api, "Api must not be null.");
        Preconditions.checkNotNull(looper, "Looper must not be null.");
        this.mContext = context.getApplicationContext();
        this.mApi = api;
        this.zabh = null;
        this.zabj = looper;
        this.zabi = zai.zaa(api);
        this.zabk = new zabp(this);
        this.zabm = GoogleApiManager.zab(this.mContext);
        this.mId = this.zabm.zabd();
        this.zabl = new ApiExceptionMapper();
    }

    private final <A extends AnyClient, T extends ApiMethodImpl<? extends Result, A>> T zaa(int i, T t) {
        t.zau();
        this.zabm.zaa(this, i, (ApiMethodImpl<? extends Result, AnyClient>) t);
        return t;
    }

    @KeepForSdk
    public GoogleApiClient asGoogleApiClient() {
        return this.zabk;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0030  */
    @KeepForSdk
    public Builder createClientSettingsBuilder() {
        Account account;
        O o;
        Set set;
        Builder builder = new Builder();
        O o2 = this.zabh;
        if (o2 instanceof HasGoogleSignInAccountOptions) {
            GoogleSignInAccount googleSignInAccount = ((HasGoogleSignInAccountOptions) o2).getGoogleSignInAccount();
            if (googleSignInAccount != null) {
                account = googleSignInAccount.getAccount();
                Builder account2 = builder.setAccount(account);
                o = this.zabh;
                if (o instanceof HasGoogleSignInAccountOptions) {
                    GoogleSignInAccount googleSignInAccount2 = ((HasGoogleSignInAccountOptions) o).getGoogleSignInAccount();
                    if (googleSignInAccount2 != null) {
                        set = googleSignInAccount2.Z();
                        return account2.addAllRequiredScopes(set).setRealClientClassName(this.mContext.getClass().getName()).setRealClientPackageName(this.mContext.getPackageName());
                    }
                }
                set = Collections.emptySet();
                return account2.addAllRequiredScopes(set).setRealClientClassName(this.mContext.getClass().getName()).setRealClientPackageName(this.mContext.getPackageName());
            }
        }
        O o3 = this.zabh;
        account = o3 instanceof HasAccountOptions ? ((HasAccountOptions) o3).getAccount() : null;
        Builder account22 = builder.setAccount(account);
        o = this.zabh;
        if (o instanceof HasGoogleSignInAccountOptions) {
        }
        set = Collections.emptySet();
        return account22.addAllRequiredScopes(set).setRealClientClassName(this.mContext.getClass().getName()).setRealClientPackageName(this.mContext.getPackageName());
    }

    /* access modifiers changed from: protected */
    @KeepForSdk
    public Wy<Boolean> disconnectService() {
        return this.zabm.zac(this);
    }

    @KeepForSdk
    public <A extends AnyClient, T extends ApiMethodImpl<? extends Result, A>> T doBestEffortWrite(T t) {
        zaa(2, t);
        return t;
    }

    @KeepForSdk
    public <A extends AnyClient, T extends ApiMethodImpl<? extends Result, A>> T doRead(T t) {
        zaa(0, t);
        return t;
    }

    @KeepForSdk
    @Deprecated
    public <A extends AnyClient, T extends RegisterListenerMethod<A, ?>, U extends UnregisterListenerMethod<A, ?>> Wy<Void> doRegisterEventListener(T t, U u) {
        Preconditions.checkNotNull(t);
        Preconditions.checkNotNull(u);
        String str = "Listener has already been released.";
        Preconditions.checkNotNull(t.getListenerKey(), str);
        Preconditions.checkNotNull(u.getListenerKey(), str);
        Preconditions.checkArgument(t.getListenerKey().equals(u.getListenerKey()), "Listener registration and unregistration methods must be constructed with the same ListenerHolder.");
        return this.zabm.zaa(this, (RegisterListenerMethod<AnyClient, ?>) t, (UnregisterListenerMethod<AnyClient, ?>) u);
    }

    @KeepForSdk
    public Wy<Boolean> doUnregisterEventListener(ListenerKey<?> listenerKey) {
        Preconditions.checkNotNull(listenerKey, "Listener key cannot be null.");
        return this.zabm.zaa(this, listenerKey);
    }

    @KeepForSdk
    public <A extends AnyClient, T extends ApiMethodImpl<? extends Result, A>> T doWrite(T t) {
        zaa(1, t);
        return t;
    }

    public final Api<O> getApi() {
        return this.mApi;
    }

    @KeepForSdk
    public O getApiOptions() {
        return this.zabh;
    }

    @KeepForSdk
    public Context getApplicationContext() {
        return this.mContext;
    }

    public final int getInstanceId() {
        return this.mId;
    }

    @KeepForSdk
    public Looper getLooper() {
        return this.zabj;
    }

    @KeepForSdk
    public <L> ListenerHolder<L> registerListener(L l, String str) {
        return ListenerHolders.createListenerHolder(l, this.zabj, str);
    }

    public final zai<O> zak() {
        return this.zabi;
    }

    @KeepForSdk
    public <TResult, A extends AnyClient> Wy<TResult> doBestEffortWrite(TaskApiCall<A, TResult> taskApiCall) {
        return zaa(2, taskApiCall);
    }

    @KeepForSdk
    public <TResult, A extends AnyClient> Wy<TResult> doRead(TaskApiCall<A, TResult> taskApiCall) {
        return zaa(0, taskApiCall);
    }

    @KeepForSdk
    public <TResult, A extends AnyClient> Wy<TResult> doWrite(TaskApiCall<A, TResult> taskApiCall) {
        return zaa(1, taskApiCall);
    }

    private final <TResult, A extends AnyClient> Wy<TResult> zaa(int i, TaskApiCall<A, TResult> taskApiCall) {
        Xy xy = new Xy();
        this.zabm.zaa(this, i, taskApiCall, xy, this.zabl);
        return xy.a();
    }

    public Client zaa(Looper looper, zaa<O> zaa) {
        return this.mApi.zai().buildClient(this.mContext, looper, createClientSettingsBuilder().build(), this.zabh, zaa, zaa);
    }

    public zace zaa(Context context, Handler handler) {
        return new zace(context, handler, createClientSettingsBuilder().build());
    }

    @KeepForSdk
    public <A extends AnyClient> Wy<Void> doRegisterEventListener(RegistrationMethods<A, ?> registrationMethods) {
        Preconditions.checkNotNull(registrationMethods);
        String str = "Listener has already been released.";
        Preconditions.checkNotNull(registrationMethods.zajz.getListenerKey(), str);
        Preconditions.checkNotNull(registrationMethods.zaka.getListenerKey(), str);
        return this.zabm.zaa(this, registrationMethods.zajz, registrationMethods.zaka);
    }

    @KeepForSdk
    @Deprecated
    public GoogleApi(Context context, Api<O> api, O o, Looper looper, StatusExceptionMapper statusExceptionMapper) {
        this(context, api, o, new Builder().setLooper(looper).setMapper(statusExceptionMapper).build());
    }

    @KeepForSdk
    public GoogleApi(Activity activity, Api<O> api, O o, Settings settings) {
        Preconditions.checkNotNull(activity, "Null activity is not permitted.");
        Preconditions.checkNotNull(api, "Api must not be null.");
        Preconditions.checkNotNull(settings, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        this.mContext = activity.getApplicationContext();
        this.mApi = api;
        this.zabh = o;
        this.zabj = settings.zabo;
        this.zabi = zai.zaa(this.mApi, this.zabh);
        this.zabk = new zabp(this);
        this.zabm = GoogleApiManager.zab(this.mContext);
        this.mId = this.zabm.zabd();
        this.zabl = settings.zabn;
        if (!(activity instanceof GoogleApiActivity)) {
            zaae.zaa(activity, this.zabm, this.zabi);
        }
        this.zabm.zaa(this);
    }

    @KeepForSdk
    public GoogleApi(Context context, Api<O> api, O o, Settings settings) {
        Preconditions.checkNotNull(context, "Null context is not permitted.");
        Preconditions.checkNotNull(api, "Api must not be null.");
        Preconditions.checkNotNull(settings, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        this.mContext = context.getApplicationContext();
        this.mApi = api;
        this.zabh = o;
        this.zabj = settings.zabo;
        this.zabi = zai.zaa(this.mApi, this.zabh);
        this.zabk = new zabp(this);
        this.zabm = GoogleApiManager.zab(this.mContext);
        this.mId = this.zabm.zabd();
        this.zabl = settings.zabn;
        this.zabm.zaa(this);
    }

    @KeepForSdk
    @Deprecated
    public GoogleApi(Activity activity, Api<O> api, O o, StatusExceptionMapper statusExceptionMapper) {
        this(activity, api, o, new Builder().setMapper(statusExceptionMapper).setLooper(activity.getMainLooper()).build());
    }

    @KeepForSdk
    @Deprecated
    public GoogleApi(Context context, Api<O> api, O o, StatusExceptionMapper statusExceptionMapper) {
        this(context, api, o, new Builder().setMapper(statusExceptionMapper).build());
    }
}
