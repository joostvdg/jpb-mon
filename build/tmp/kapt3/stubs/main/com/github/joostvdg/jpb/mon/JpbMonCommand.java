package com.github.joostvdg.jpb.mon;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0016R\u0012\u0010\u0003\u001a\u00020\u00048\u0002@\u0002X\u0083\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/github/joostvdg/jpb/mon/JpbMonCommand;", "Ljava/lang/Runnable;", "()V", "verbose", "", "run", "", "Companion", "jpb-mon"})
@picocli.CommandLine.Command(name = "jpb-mon", version = {"0.1.0"}, description = {"..."}, mixinStandardHelpOptions = true, subcommands = {com.github.joostvdg.jpb.mon.command.RetrievePipelineRunCommand.class})
public final class JpbMonCommand implements java.lang.Runnable {
    @picocli.CommandLine.Option(names = {"-v", "--verbose"}, description = {"..."})
    private boolean verbose;
    public static final com.github.joostvdg.jpb.mon.JpbMonCommand.Companion Companion = null;
    
    @java.lang.Override()
    public void run() {
    }
    
    public JpbMonCommand() {
        super();
    }
    
    public static final void main(@org.jetbrains.annotations.NotNull()
    java.lang.String[] args) {
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001b\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0007\u00a2\u0006\u0002\u0010\b\u00a8\u0006\t"}, d2 = {"Lcom/github/joostvdg/jpb/mon/JpbMonCommand$Companion;", "", "()V", "main", "", "args", "", "", "([Ljava/lang/String;)V", "jpb-mon"})
    public static final class Companion {
        
        public final void main(@org.jetbrains.annotations.NotNull()
        java.lang.String[] args) {
        }
        
        private Companion() {
            super();
        }
    }
}