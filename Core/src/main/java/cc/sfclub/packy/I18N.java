package cc.sfclub.packy;

public class I18N {
    public Fails fails = new Fails();
    public ScriptExec scriptExecs = new ScriptExec();
    ;

    public static class Fails {
        public String Fail_to_Execute = "&cA exception occurred when executing the script";

    }

    public static class ScriptExec {
        public String ScriptExec_Type_Install = "Install";
        public String ScriptExec_Type_Uninstall = "Un-Install";
        public String ScriptExec_Type_PreInstall = "Pre-Install";
    }
}
