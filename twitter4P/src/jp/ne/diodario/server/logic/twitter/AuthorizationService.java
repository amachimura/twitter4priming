package jp.ne.diodario.server.logic.twitter;

import jp.ne.diodario.server.common.util.TwitterConstants;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.auth.RequestToken;

public class AuthorizationService {
    public String getAuthUrl(){
        Twitter twitter = TwitterFactory.getSingleton();
        twitter.setOAuthConsumer(TwitterConstants.CONSUMER_KEY, 
            TwitterConstants.CONSUMER_SECRET);

        try{
            // リクエストトークンの生成
            RequestToken reqToken = twitter.getOAuthRequestToken();

            // 認証画面にリダイレクトするためのURLを生成
            String strUrl = reqToken.getAuthorizationURL();
            return strUrl;
        }catch (TwitterException e){
            e.printStackTrace();
        }
        return null;
    }
}
