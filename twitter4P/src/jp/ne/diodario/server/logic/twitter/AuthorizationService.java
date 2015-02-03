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
            // ���N�G�X�g�g�[�N���̐���
            RequestToken reqToken = twitter.getOAuthRequestToken();

            // �F�؉�ʂɃ��_�C���N�g���邽�߂�URL�𐶐�
            String strUrl = reqToken.getAuthorizationURL();
            return strUrl;
        }catch (TwitterException e){
            e.printStackTrace();
        }
        return null;
    }
}
