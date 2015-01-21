package jp.ne.diodario.server.dao.twitter;

import java.util.List;

import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;

public class TweetSearchDao {
    
    public List<Status> searchByWord(String word) throws TwitterException{
        Twitter twitter = TwitterFactory.getSingleton();
        Query query = new Query(word);
        QueryResult result = twitter.search(query);
        return result.getTweets();
    }

}
