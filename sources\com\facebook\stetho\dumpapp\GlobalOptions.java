package com.facebook.stetho.dumpapp;

public class GlobalOptions {
    public final SAb optionHelp = new SAb("h", "help", false, "Print this help");
    public final SAb optionListPlugins = new SAb("l", "list", false, "List available plugins");
    public final SAb optionProcess = new SAb("p", "process", true, "Specify target process");
    public final VAb options = new VAb();

    public GlobalOptions() {
        this.options.a(this.optionHelp);
        this.options.a(this.optionListPlugins);
        this.options.a(this.optionProcess);
    }
}
