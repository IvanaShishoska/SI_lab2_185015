import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SILab2Test {
    User user1= null;
    User user2= new User("username","password", "email");
    User user3= new User("username","password", "email@");
    User user4= new User("username","password", "email.com");
    User user5= new User("user","password", "email@email.com");
    User user6= new User(null,"password", "email@email.com");
    User user7= new User("username","password", "");
    User user8= new User("username","password", null);
    private List<String> createUserList(String... elems){
        return new ArrayList<>(Arrays.asList(elems));
    }

    @Test
    void testEveryPath() {
        // A, K, END
        assertTrue(!SILab2.function(user1,null));

        // A, B, K, END
        assertTrue(!SILab2.function(user6,createUserList("user","username")));

        // A, B, C, D, Dcond, I, K, END //prazen string za email
        assertTrue(!SILab2.function(user7,createUserList("username","user")));

        // A, B, C, D, Dcond, E, F, G, H, Dmodif, Dcond, I, J, END
        assertTrue(SILab2.function(user5,createUserList("user","username")));

        // A, B, C, D, Dcond, E, F, G, Dmodif, Dcond, I, K, END
        assertTrue(!SILab2.function(user3,createUserList("user","username")));

        // A, B, C, D, Dcond, E, G, H, Dmodif, Dcond, I, K, END
        assertTrue(!SILab2.function(user4,createUserList("user","username")));

        // A, B, C, D, Dcond, E, G, Dmodif, Dcond, I, K, END
        assertTrue(!SILab2.function(user2,createUserList("user","username")));
    }

    @Test
    void testMultipleCondition(){
        //  if (user.getUsername()!=null && user.getEmail()!=null && allUsers.contains(user.getUsername()))
        // F && X && X => F username=null, email=null, list
        assertTrue(!SILab2.function(user1,createUserList("user","username")));

        // T && F && X => F username!=null, email=null list
        assertTrue(!SILab2.function(user8,createUserList("user","username")));

        // T && T && F => F username!=null, email!=null list doesnt contain
        assertTrue(!SILab2.function(user5,createUserList("username")));

        // T && T && T => T username!=null, email!=null list contains
        assertTrue(SILab2.function(user5,createUserList("user","username")));


    }
}