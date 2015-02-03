package jp.ne.diodario.server.dao.twitter.security;

import javax.jdo.PersistenceManager;

import jp.ne.diodario.server.entity.PMFWrapper;
import jp.ne.diodario.server.entity.UserSecurity;
import twitter4j.auth.AccessToken;

public class AccessTokenDao {

    public static void storeAccessToken(long useId, AccessToken accessToken){
        PersistenceManager pm = PMFWrapper.get().getPersistenceManager();
        UserSecurity sec = new UserSecurity(useId, accessToken.getToken(), accessToken.getTokenSecret());
        try {
            // オブジェクトの格納
            pm.makePersistent(sec);
        } finally {
            pm.close();
        }
    }    

}
