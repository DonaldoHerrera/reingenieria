package defpackage;

import android.content.Intent;
import android.os.Bundle;
import com.soundcloud.android.comments.PlayerCommentsFragment;
import com.soundcloud.android.comments.Y;
import com.soundcloud.android.main.ca;
import com.soundcloud.android.main.da;
import com.soundcloud.android.main.da.b;
import com.soundcloud.android.main.da.c;

/* renamed from: iia reason: default package and case insensitive filesystem */
/* compiled from: RealPlayerNavigationResolver.kt */
public class C4580iia implements ca {
    private String b(Intent intent) {
        String stringExtra = intent.getStringExtra("fragment_tag");
        if (stringExtra != null) {
            return stringExtra;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public da a(Intent intent) {
        C7471uYa.b(intent, "intent");
        String action = intent.getAction();
        if (action != null) {
            int hashCode = action.hashCode();
            if (hashCode != -1575332791) {
                if (hashCode == 2044210299 && action.equals("CLOSE_COMMENTS")) {
                    return new b(b(intent));
                }
            } else if (action.equals("OPEN_COMMENTS")) {
                PlayerCommentsFragment a = new PlayerCommentsFragment.b().a(Y.a.a(intent));
                Bundle arguments = a.getArguments();
                if (arguments != null) {
                    arguments.putString("fragment_tag", "comments");
                    return new c(a);
                }
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        return null;
    }
}
