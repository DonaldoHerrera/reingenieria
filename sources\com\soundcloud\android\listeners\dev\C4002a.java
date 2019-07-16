package com.soundcloud.android.listeners.dev;

import java.io.PrintStream;

/* renamed from: com.soundcloud.android.listeners.dev.a reason: case insensitive filesystem */
/* compiled from: DebugUtils */
public final class C4002a {
    private C4002a() {
    }

    public static void a() {
        System.out.println("\n=================> OOM test started..\n");
        int i = 20;
        for (int i2 = 1; i2 < 20; i2++) {
            PrintStream printStream = System.out;
            StringBuilder sb = new StringBuilder();
            sb.append("Iteration ");
            sb.append(i2);
            sb.append(" Free Mem: ");
            sb.append(Runtime.getRuntime().freeMemory());
            printStream.println(sb.toString());
            int i3 = 2;
            int[] iArr = new int[i];
            do {
                iArr[i3] = 0;
                i3--;
            } while (i3 > 0);
            i *= 5;
            PrintStream printStream2 = System.out;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("\nRequired Memory for next loop: ");
            sb2.append(i);
            printStream2.println(sb2.toString());
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
