package org.rena.rena_util.Commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Fly implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        // 実行者がプレイヤーだった場合
        if (sender instanceof Player) {
            // Player型でコマンドを実行したユーザーをplayerとして定義
            Player player = (Player) sender;
            if (args[0].isEmpty()) {
                sender.sendMessage(ChatColor.RED + "構文エラーが発生しました。\"/help\"で詳細を表示します。");
            } else if (args[0].equals("on")) {
                if (player.isFlying()) {
                    sender.sendMessage(ChatColor.RED + "既に飛行が有効になっています");
                } else {
                    player.setAllowFlight(true);
                    player.setFlying(true);
                    sender.sendMessage(ChatColor.GREEN + "飛行を有効にしました");
                }
            } else if (args[0].equals("off")) {
                if (player.isFlying()) {
                    player.setFlying(false);
                    player.setAllowFlight(false);
                    sender.sendMessage(ChatColor.GREEN + "飛行を" + ChatColor.RED + "無効" + ChatColor.GREEN + "にしました");
                } else {
                    sender.sendMessage(ChatColor.RED + "既に飛行が無効になっています");
                }
            }
        }

//        if (sender instanceof Player) {
//            Player ply = (Player)sender;
//            if (ply.isFlying()) {
//                ply.setAllowFlight(false);
//                ply.setFlying(false);
//            } else {
//                ply.setAllowFlight(true);
//                ply.setFlying(true);
//            }
//        }
        return true;
    }
}