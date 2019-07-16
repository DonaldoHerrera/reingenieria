package defpackage;

import android.opengl.GLES20;
import android.opengl.GLU;

/* renamed from: Gq reason: default package */
/* compiled from: GlUtil */
public final class Gq {
    public static void a() {
        int i = 0;
        while (true) {
            int glGetError = GLES20.glGetError();
            if (glGetError != 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("glError ");
                sb.append(GLU.gluErrorString(i));
                Iq.b("GlUtil", sb.toString());
                i = glGetError;
            } else {
                return;
            }
        }
    }
}
