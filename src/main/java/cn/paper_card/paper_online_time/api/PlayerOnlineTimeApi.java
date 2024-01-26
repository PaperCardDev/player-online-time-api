package cn.paper_card.paper_online_time.api;

import org.jetbrains.annotations.NotNull;

import java.util.UUID;

@SuppressWarnings("unused")
public interface PlayerOnlineTimeApi {

    // 查询玩家的总计在线时长和进入次数
    @NotNull OnlineTimeAndJoinCount queryTotal(@NotNull UUID uuid) throws Exception;

    @NotNull OnlineTimeAndJoinCount queryOneDay(@NotNull UUID uuid, long begin) throws Exception;

    // 增加玩家今天在线的时间
    boolean addOnlineTimeToday(@NotNull UUID player, long cur, long online) throws Exception;

    // 增加玩家的进入次数，加一
    boolean addJoinCountToday(@NotNull UUID player, long cur) throws Exception;
}