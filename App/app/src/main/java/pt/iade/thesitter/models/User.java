package pt.iade.thesitter.models;

import com.google.gson.annotations.JsonAdapter;
import pt.iade.thesitter.utilities.WebRequest;
import pt.iade.thesitter.utilities.DateJsonAdapter;
import java.net.URL;
import java.time.LocalDate;
import java.time.LocalDate;
import java.io.Serializable;
import android.util.Log;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;


public class User implements Serializable{

    private LocalDate userBdate;
    @JsonAdapter(DateJsonAdapter.class)

    private byte[]  userUpload;

    private String userAddress;

    private String userMobile;

    private String userEmail;

    private String userPassword;

    private String userGender;

    private int userId;

    private String userName;

    private int userPlaId;

    public User() {
    }

    public User(String userName, int userPlaId, int userId, String userGender, String userPassword, String userEmail, String userMobile, String userAddress, byte[] userUpload, LocalDate userBdate) {
        this.userName = userName;
        this.userPlaId = userPlaId;
        this.userId= userId;
        this.userGender=userGender;
        this.userPassword=userPassword;
        this.userEmail=userEmail;
        this.userMobile=userMobile;
        this.userAddress=userAddress;
        this.userUpload=userUpload;
        this.userBdate=userBdate;
    }


    public LocalDate getUserBdate() {
        return userBdate;
    }
    public void save(/*SaveResponse response*/) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try{
                    if (userId == 0) {
                        WebRequest request = new WebRequest(new URL(WebRequest.LOCALHOST+"/api/users"));
                        String resp = request.performPostRequest(User.this);

                        User user = new Gson().fromJson(resp, User.class);

                        userId= user.getUserId();
                       // response.response();

                    } else {
                        WebRequest request = new WebRequest(new URL(WebRequest.LOCALHOST+"/api/users/"+userId));
                        request.performPostRequest(User.this);

                        //response.response();
                    }
                } catch (Exception e){
                    Log.e("Save", e.toString());
                }

            }
        });
        thread.start();
    }

    public byte[] getUserUpload() {
        return userUpload;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public String getUserMobile() {
        return userMobile;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public String getUserGender() {
        return userGender;
    }

    public int getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public int getUserPlaId() {
        return userPlaId;
    }
}