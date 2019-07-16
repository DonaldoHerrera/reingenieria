package androidx.transition;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* compiled from: TransitionValues */
public class ha {
    public final Map<String, Object> a = new HashMap();
    public View b;
    final ArrayList<Transition> c = new ArrayList<>();

    public boolean equals(Object obj) {
        if (obj instanceof ha) {
            ha haVar = (ha) obj;
            if (this.b == haVar.b && this.a.equals(haVar.a)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("TransitionValues@");
        sb.append(Integer.toHexString(hashCode()));
        sb.append(":\n");
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(sb2);
        sb3.append("    view = ");
        sb3.append(this.b);
        String str = "\n";
        sb3.append(str);
        String sb4 = sb3.toString();
        StringBuilder sb5 = new StringBuilder();
        sb5.append(sb4);
        sb5.append("    values:");
        String sb6 = sb5.toString();
        for (String str2 : this.a.keySet()) {
            StringBuilder sb7 = new StringBuilder();
            sb7.append(sb6);
            sb7.append("    ");
            sb7.append(str2);
            sb7.append(": ");
            sb7.append(this.a.get(str2));
            sb7.append(str);
            sb6 = sb7.toString();
        }
        return sb6;
    }
}
