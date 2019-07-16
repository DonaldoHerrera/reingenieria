package com.soundcloud.android.onboarding.auth;

@EVa(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0007\b\u0001¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\b"}, d2 = {"Lcom/soundcloud/android/onboarding/auth/AuthResultMapper;", "", "()V", "handleErrorResponse", "Lcom/soundcloud/android/onboarding/auth/tasks/AuthTaskResult;", "response", "Lcom/soundcloud/android/libs/api/ApiResponse;", "Companion", "base_release"}, mv = {1, 1, 15})
/* compiled from: AuthResultMapper.kt */
public class C {
    public static final a a = new a(null);

    /* compiled from: AuthResultMapper.kt */
    public static final class a {
        private a() {
        }

        private final Eka b(ifa ifa) {
            String a = ifa.a();
            if (a != null) {
                int hashCode = a.hashCode();
                if (hashCode != -2070485404) {
                    if (hashCode != -1595954846) {
                        if (hashCode == 2056933150 && a.equals("spamming")) {
                            Eka f = Eka.f(ifa);
                            C7471uYa.a((Object) f, "AuthTaskResult.spam(exception)");
                            return f;
                        }
                    } else if (a.equals("incorrect_credentials")) {
                        Eka d = Eka.d(ifa);
                        C7471uYa.a((Object) d, "AuthTaskResult.incorrectCredentials(exception)");
                        return d;
                    }
                } else if (a.equals("email_taken")) {
                    Eka c = Eka.c(ifa);
                    C7471uYa.a((Object) c, "AuthTaskResult.emailTaken(exception)");
                    return c;
                }
            }
            Eka a2 = Eka.a((Exception) ifa);
            C7471uYa.a((Object) a2, "AuthTaskResult.failure(exception)");
            return a2;
        }

        private final Eka c(ifa ifa) {
            String a = ifa.a();
            if (a != null) {
                int hashCode = a.hashCode();
                if (hashCode != -849802412) {
                    if (hashCode == 404852609 && a.equals("domain_blacklisted")) {
                        Eka a2 = Eka.a(ifa);
                        C7471uYa.a((Object) a2, "AuthTaskResult.denied(exception)");
                        return a2;
                    }
                } else if (a.equals("invalid_email")) {
                    Eka b = Eka.b(ifa);
                    C7471uYa.a((Object) b, "AuthTaskResult.emailInvalid(exception)");
                    return b;
                }
            }
            Eka a3 = Eka.a((Exception) ifa);
            C7471uYa.a((Object) a3, "AuthTaskResult.failure(exception)");
            return a3;
        }

        @NXa
        public final Eka a(ifa ifa) {
            C7471uYa.b(ifa, "exception");
            defpackage.ifa.a j = ifa.j();
            if (j != null) {
                switch (B.a[j.ordinal()]) {
                    case 1:
                        return b(ifa);
                    case 2:
                        Eka g = Eka.g(ifa);
                        C7471uYa.a((Object) g, "AuthTaskResult.unauthorized(exception)");
                        return g;
                    case 3:
                        Eka a = Eka.a(ifa.a(), ifa);
                        C7471uYa.a((Object) a, "validationError(exception.errorKey(), exception)");
                        return a;
                    case 4:
                        Throwable cause = ifa.getCause();
                        if (!(cause instanceof Exception)) {
                            cause = null;
                        }
                        Eka b = Eka.b((Exception) cause);
                        C7471uYa.a((Object) b, "AuthTaskResult.networkEr…ion.cause as? Exception?)");
                        return b;
                    case 5:
                        Eka e = Eka.e(ifa);
                        C7471uYa.a((Object) e, "AuthTaskResult.serverError(exception)");
                        return e;
                    case 6:
                        return c(ifa);
                    case 7:
                        Eka f = Eka.f(ifa);
                        C7471uYa.a((Object) f, "AuthTaskResult.spam(exception)");
                        return f;
                    case 8:
                        Eka a2 = Eka.a(ifa);
                        C7471uYa.a((Object) a2, "AuthTaskResult.denied(exception)");
                        return a2;
                }
            }
            Eka a3 = Eka.a((Exception) ifa);
            C7471uYa.a((Object) a3, "AuthTaskResult.failure(exception)");
            return a3;
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }
    }

    @NXa
    public static final Eka a(ifa ifa) {
        return a.a(ifa);
    }

    public Eka a(jfa jfa) {
        C7471uYa.b(jfa, "response");
        if (!jfa.g()) {
            ifa a2 = jfa.a();
            if (a2 == null) {
                throw new IllegalArgumentException("Response is not successful. There should be an exception");
            } else if (a2.j() != defpackage.ifa.a.BAD_REQUEST || !C7471uYa.a((Object) a2.a(), (Object) "age_restricted")) {
                return a.a(a2);
            } else {
                Eka u = Bka.u();
                C7471uYa.a((Object) u, "AgeRestrictionAuthResult.create()");
                return u;
            }
        } else {
            throw new IllegalArgumentException("Responses passed to this method should not be successful");
        }
    }
}
