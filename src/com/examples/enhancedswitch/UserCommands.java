package com.examples.enhancedswitch;

enum COMMANDS {
    START, STOP, PAUSE, RESUME;
}
public class UserCommands {
    public static void main(String[] args) {
        String command = switch (COMMANDS.START) {
            case START -> "start command";
            case STOP -> "stop command";
            case PAUSE -> "pause command";
            case RESUME -> "resume command";
            default -> throw new IllegalArgumentException("invalid command");
        };

        System.out.println("command is: " +command);
    }
}
