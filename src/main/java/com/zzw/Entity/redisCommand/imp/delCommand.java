package com.zzw.Entity.redisCommand.imp;

import com.zzw.Entity.redisClient;
import com.zzw.Entity.redisCommand.redisCommand;

import static com.zzw.redis_constant.REDIS_REPLY_FAIL;
import static com.zzw.redis_constant.REDIS_REPLY_OK;

public class delCommand implements redisCommand {

    @Override
    public String execute(redisClient client) {
        String[] argv = client.getArgv();
        String key = argv[1];
        String remove = MAP.remove(key);
        System.out.println(remove);

        if(remove==null) return  "DEL_"+REDIS_REPLY_FAIL;

        return "DEL_"+REDIS_REPLY_OK;
    }
}