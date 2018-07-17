package com.sso.server.service.impl;


import com.sso.server.entity.TokenSession;
import com.sso.server.service.RedisOperatorService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RedisOperatorServiceImplTest {
  @Autowired
  private RedisOperatorService redisOperatorService;

  @Test
  public void putTokenInfo() {
    String token = "06cdc619-d4e0-46f4-a9a4-4fec021f6f1e";
    TokenSession tokenSession = new TokenSession(token, "test");
    redisOperatorService.putTokenInfo(token, tokenSession);
  }

  @Test
  public void getTokenInfo() {
    TokenSession tokenInfo = redisOperatorService
        .getTokenInfo("06cdc619-d4e0-46f4-a9a4-4fec021f6f1e");
    System.out.println(tokenInfo.getToken());

  }
}
