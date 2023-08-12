package org.rena.rena_util.TabCompleter;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class WjumpCompleter implements TabCompleter {
    @Override
    public List<String> onTabComplete(CommandSender commandSender, Command command, String s, String[] args) {
        if (args.length == 1) {
            if (args[0].isEmpty()) {
                return Arrays.asList("on", "off");
            } else {
                if ("on".startsWith(args[0]) && "off".startsWith(args[0])) {
                    return Arrays.asList("on", "off");
                } else if ("on".startsWith(args[0])) {
                    return Collections.singletonList("on");
                } else if ("off".startsWith(args[0])) {
                    return Collections.singletonList("off");
                }
            }
        }
        return null;
    }
}
