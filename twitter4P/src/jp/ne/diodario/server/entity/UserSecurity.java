package jp.ne.diodario.server.entity;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

import com.google.appengine.api.datastore.Key;

@PersistenceCapable
public class UserSecurity {

     @PrimaryKey
     @Persistent( valueStrategy = IdGeneratorStrategy.IDENTITY )
     private Key key;
     
     @Persistent
     private long id;
     
     @Persistent
     private String accesstoken;
     
     @Persistent
     private String accessSecret;
     
     public UserSecurity( long useId, String accesstoken, String accessSecret ) {
          this.id = useId;
          this.accesstoken = accesstoken;
          this.accessSecret=accessSecret;
     }

     public Key getKey() {
          return this.key;
     }
     
     public long getId() {
          return this.id;
     }
     
     public String getAccessToken() {
          return this.accesstoken;
     }
     
     public String getAccessSecret(){
         return this.accessSecret;
     }

}
