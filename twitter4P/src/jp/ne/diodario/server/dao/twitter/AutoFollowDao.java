package jp.ne.diodario.server.dao.twitter;

import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.User;

public class AutoFollowDao {
    
    private final Twitter twitter = TwitterFactory.getSingleton();

    public User followAUser(User user) throws TwitterException{
        User result = twitter.createFriendship(user.getId());
        return result;
    }
}
