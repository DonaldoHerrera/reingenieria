package com.soundcloud.android.main;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.A;
import androidx.fragment.app.C0370l;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.soundcloud.android.ia.i;
import com.soundcloud.android.main.da.b;
import com.soundcloud.android.main.da.c;
import com.soundcloud.android.playback.ui.C4451fb;
import com.soundcloud.android.properties.j;
import java.util.Iterator;

@EVa(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u0000 !2\u00020\u0001:\u0001!B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0012\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0005\u001a\u00020\u0006H\u0012J\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002¢\u0006\u0002\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0015H\u0012J\b\u0010\u0016\u001a\u00020\u000fH\u0016J\u0010\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u0019H\u0012J\u0010\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u001cH\u0012J\u0010\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u001cH\u0012J\u0010\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020 H\u0016R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lcom/soundcloud/android/main/PlayerNavController;", "Lcom/soundcloud/android/navigation/NavigationResultHandler;", "playerNavigationResolver", "Lcom/soundcloud/android/main/PlayerNavigationResolver;", "(Lcom/soundcloud/android/main/PlayerNavigationResolver;)V", "activity", "Landroidx/fragment/app/FragmentActivity;", "attach", "", "detach", "mainActivity", "Lcom/soundcloud/android/main/MainActivity;", "getPlayerFragmentManager", "Landroidx/fragment/app/FragmentManager;", "invoke", "", "p1", "Lcom/soundcloud/android/navigation/NavigationResult;", "(Lcom/soundcloud/android/navigation/NavigationResult;)Ljava/lang/Boolean;", "navigateTo", "result", "Lcom/soundcloud/android/main/PlayerNavigationResult;", "onBackPressed", "popFragment", "tag", "", "pushFragment", "fragment", "Landroidx/fragment/app/Fragment;", "requireFragmentTag", "resolveNavigation", "intent", "Landroid/content/Intent;", "Companion", "base_release"}, mv = {1, 1, 15})
/* compiled from: PlayerNavController.kt */
public class ba extends C4613mja {
    private static final int a = com.soundcloud.android.ia.a.ak_fade_in;
    private static final int b = com.soundcloud.android.ia.a.ak_fade_out;
    public static final a c = new a(null);
    private FragmentActivity d;
    private final ca e;

    /* compiled from: PlayerNavController.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }
    }

    public ba(ca caVar) {
        C7471uYa.b(caVar, "playerNavigationResolver");
        this.e = caVar;
    }

    private String b(Fragment fragment) {
        Bundle arguments = fragment.getArguments();
        if (arguments != null) {
            String string = arguments.getString("fragment_tag");
            if (string != null) {
                return string;
            }
        }
        throw new IllegalStateException("Fragments must have a tag");
    }

    public void a(FragmentActivity fragmentActivity) {
        C7471uYa.b(fragmentActivity, "activity");
        this.d = fragmentActivity;
    }

    private C0370l b(FragmentActivity fragmentActivity) {
        Fragment a2 = fragmentActivity.getSupportFragmentManager().a(i.player_root);
        if (a2 instanceof C4451fb) {
            return a2.requireFragmentManager();
        }
        return null;
    }

    public boolean a() {
        FragmentActivity fragmentActivity = this.d;
        boolean z = false;
        if (fragmentActivity != null) {
            if (fragmentActivity != null) {
                C0370l b2 = b(fragmentActivity);
                if (b2 != null) {
                    int c2 = b2.c();
                    Iterator it = C7265rZa.d(0, c2).iterator();
                    while (it.hasNext()) {
                        ((FWa) it).nextInt();
                        b2.g();
                    }
                    if (c2 > 0) {
                        z = true;
                    }
                }
                return z;
            }
            throw new IllegalArgumentException("Required value was null.");
        } else if (!j.e()) {
            return false;
        } else {
            throw new IllegalStateException("Handling back pressed with no activity. How is this happening??");
        }
    }

    /* renamed from: a */
    public Boolean invoke(C4605lja lja) {
        C4928GKa gKa;
        C7471uYa.b(lja, "p1");
        C4928GKa b2 = lja.b();
        if (b2.c()) {
            gKa = C4928GKa.b(Boolean.valueOf(a((Intent) b2.b())));
            C7471uYa.a((Object) gKa, "Optional.fromNullable(mapper(get()))");
        } else {
            gKa = C4928GKa.a();
            C7471uYa.a((Object) gKa, "Optional.absent()");
        }
        Object d2 = gKa.d(Boolean.valueOf(false));
        C7471uYa.a(d2, "p1.intent.map { resolveNavigation(it) }.or(false)");
        return (Boolean) d2;
    }

    public boolean a(Intent intent) {
        C7471uYa.b(intent, "intent");
        if (intent.getAction() == null) {
            return false;
        }
        da a2 = this.e.a(intent);
        if (a2 != null) {
            return a(a2);
        }
        return false;
    }

    private boolean a(da daVar) {
        if (daVar instanceof c) {
            return a(((c) daVar).a());
        }
        if (daVar instanceof b) {
            return a(((b) daVar).a());
        }
        throw new FVa();
    }

    private boolean a(Fragment fragment) {
        FragmentActivity fragmentActivity = this.d;
        if (fragmentActivity != null) {
            C0370l b2 = b(fragmentActivity);
            if (b2 == null) {
                return false;
            }
            String b3 = b(fragment);
            A a2 = b2.a();
            int i = a;
            int i2 = b;
            a2.a(i, i2, i, i2);
            a2.a(i.player_pager_holder, fragment, b3);
            a2.a((String) null);
            a2.b();
            return true;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    private boolean a(String str) {
        FragmentActivity fragmentActivity = this.d;
        if (fragmentActivity != null) {
            C0370l b2 = b(fragmentActivity);
            if (b2 != null) {
                Fragment a2 = b2.a(str);
                if (a2 != null) {
                    C7471uYa.a((Object) a2, "fragmentManager.findFrag…yTag(tag) ?: return false");
                    A a3 = b2.a();
                    a3.a(a, b);
                    a3.d(a2);
                    a3.b();
                    return true;
                }
            }
            return false;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public void a(MainActivity mainActivity) {
        C7471uYa.b(mainActivity, "mainActivity");
        if (this.d == mainActivity) {
            this.d = null;
        }
    }
}
