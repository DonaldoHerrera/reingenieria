package com.google.android.gms.cast;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.AbstractClientBuilder;
import com.google.android.gms.common.api.Api.ApiOptions.HasOptions;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.cast.C0704fa;
import com.google.android.gms.internal.cast.H;
import com.google.android.gms.internal.cast.N;
import java.io.IOException;

/* renamed from: com.google.android.gms.cast.a reason: case insensitive filesystem */
public final class C0627a {
    @VisibleForTesting
    private static final AbstractClientBuilder<N, c> a = new M();
    public static final Api<c> b = new Api<>("Cast.API", a, C0704fa.a);
    public static final b c = new C0037a();

    /* renamed from: com.google.android.gms.cast.a$a reason: collision with other inner class name */
    public interface C0036a extends Result {
        boolean f();

        String g();

        String getSessionId();

        ApplicationMetadata h();
    }

    @Deprecated
    /* renamed from: com.google.android.gms.cast.a$b */
    public interface b {

        /* renamed from: com.google.android.gms.cast.a$b$a reason: collision with other inner class name */
        public static final class C0037a implements b {
            public final PendingResult<C0036a> a(GoogleApiClient googleApiClient, String str, LaunchOptions launchOptions) {
                return googleApiClient.execute(new O(this, googleApiClient, str, launchOptions));
            }

            public final PendingResult<Status> b(GoogleApiClient googleApiClient, String str, String str2) {
                return googleApiClient.execute(new N(this, googleApiClient, str, str2));
            }

            @ShowFirstParty
            private final PendingResult<C0036a> a(GoogleApiClient googleApiClient, String str, String str2, zzah zzah) {
                P p = new P(this, googleApiClient, str, str2, null);
                return googleApiClient.execute(p);
            }

            public final PendingResult<Status> b(GoogleApiClient googleApiClient, String str) {
                return googleApiClient.execute(new Q(this, googleApiClient, str));
            }

            public final PendingResult<C0036a> a(GoogleApiClient googleApiClient, String str, String str2) {
                return a(googleApiClient, str, str2, null);
            }

            public final void a(GoogleApiClient googleApiClient, boolean z) throws IOException, IllegalStateException {
                try {
                    ((N) googleApiClient.getClient(C0704fa.a)).a(z);
                } catch (RemoteException unused) {
                    throw new IOException("service error");
                }
            }

            public final boolean a(GoogleApiClient googleApiClient) throws IllegalStateException {
                return ((N) googleApiClient.getClient(C0704fa.a)).b();
            }

            public final void a(GoogleApiClient googleApiClient, String str, e eVar) throws IOException, IllegalStateException {
                try {
                    ((N) googleApiClient.getClient(C0704fa.a)).a(str, eVar);
                } catch (RemoteException unused) {
                    throw new IOException("service error");
                }
            }

            public final void a(GoogleApiClient googleApiClient, String str) throws IOException, IllegalArgumentException {
                try {
                    ((N) googleApiClient.getClient(C0704fa.a)).a(str);
                } catch (RemoteException unused) {
                    throw new IOException("service error");
                }
            }
        }

        PendingResult<C0036a> a(GoogleApiClient googleApiClient, String str, LaunchOptions launchOptions);

        PendingResult<C0036a> a(GoogleApiClient googleApiClient, String str, String str2);

        void a(GoogleApiClient googleApiClient, String str) throws IOException, IllegalArgumentException;

        void a(GoogleApiClient googleApiClient, String str, e eVar) throws IOException, IllegalStateException;

        void a(GoogleApiClient googleApiClient, boolean z) throws IOException, IllegalStateException;

        boolean a(GoogleApiClient googleApiClient) throws IllegalStateException;

        PendingResult<Status> b(GoogleApiClient googleApiClient, String str);

        PendingResult<Status> b(GoogleApiClient googleApiClient, String str, String str2);
    }

    /* renamed from: com.google.android.gms.cast.a$c */
    public static final class c implements HasOptions {
        final CastDevice a;
        final d b;
        final Bundle c;
        /* access modifiers changed from: private */
        public final int d;

        /* renamed from: com.google.android.gms.cast.a$c$a reason: collision with other inner class name */
        public static final class C0038a {
            CastDevice a;
            d b;
            /* access modifiers changed from: private */
            public int c = 0;
            /* access modifiers changed from: private */
            public Bundle d;

            public C0038a(CastDevice castDevice, d dVar) {
                Preconditions.checkNotNull(castDevice, "CastDevice parameter cannot be null");
                Preconditions.checkNotNull(dVar, "CastListener parameter cannot be null");
                this.a = castDevice;
                this.b = dVar;
            }

            public final C0038a a(Bundle bundle) {
                this.d = bundle;
                return this;
            }

            public final c a() {
                return new c(this, null);
            }
        }

        private c(C0038a aVar) {
            this.a = aVar.a;
            this.b = aVar.b;
            this.d = aVar.c;
            this.c = aVar.d;
        }

        /* synthetic */ c(C0038a aVar, M m) {
            this(aVar);
        }
    }

    /* renamed from: com.google.android.gms.cast.a$d */
    public static class d {
        public void a() {
        }

        public void a(int i) {
        }

        public void a(ApplicationMetadata applicationMetadata) {
        }

        public void b() {
        }

        public void b(int i) {
        }

        public void c(int i) {
        }
    }

    /* renamed from: com.google.android.gms.cast.a$e */
    public interface e {
        void a(CastDevice castDevice, String str, String str2);
    }

    @VisibleForTesting
    /* renamed from: com.google.android.gms.cast.a$f */
    static abstract class f extends H<C0036a> {
        public f(GoogleApiClient googleApiClient) {
            super(googleApiClient);
        }

        public /* synthetic */ Result createFailedResult(Status status) {
            return new S(this, status);
        }
    }
}
