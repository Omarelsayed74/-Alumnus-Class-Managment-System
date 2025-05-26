/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dbms;



import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Arrays;
import java.util.Base64;
import java.util.Random;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import javax.swing.JOptionPane;


/**
 *
 * @author Yaseen
 */
public class Dbms {
    
    
    public class Item {
        private String name;
        private static int id = 0;
        public Item(String name) {
            id++;
            this.name = name;
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public int getId() {
            return id;
        }

        @Override
        public String toString() {
            return name;
        }
    }

    class PassBasedEnc   
    {  
        /* Declaration of variables */   
        private static final Random random = new SecureRandom();  
        private static final String characters = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";  
        private static final int iterations = 10000;  
        private static final int keylength = 256;  

        /* Method to generate the salt value. */  
        public static String getSaltvalue(int length)   
        {  
            StringBuilder finalval = new StringBuilder(length);  

            for (int i = 0; i < length; i++)   
            {  
                finalval.append(characters.charAt(random.nextInt(characters.length())));  
            }  

            return new String(finalval);  
        }     

        /* Method to generate the hash value */  
        public static byte[] hash(char[] password, byte[] salt)   
        {  
            PBEKeySpec spec = new PBEKeySpec(password, salt, iterations, keylength);  
            Arrays.fill(password, Character.MIN_VALUE);  
            try   
            {  
                SecretKeyFactory skf = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1");  
                return skf.generateSecret(spec).getEncoded();  
            }   
            catch (NoSuchAlgorithmException | InvalidKeySpecException e)   
            {  
                throw new AssertionError("Error while hashing a password: " + e.getMessage(), e);  
            }   
            finally   
            {  
                spec.clearPassword();  
            }  
        }  

        /* Method to encrypt the password using the original password and salt value. */  
        public static String generateSecurePassword(String password, String salt)   
        {  
            String finalval = null;  

            byte[] securePassword = hash(password.toCharArray(), salt.getBytes());  

            finalval = Base64.getEncoder().encodeToString(securePassword);  

            return finalval;  
        }  

        /* Method to verify if both password matches or not */  
        public static boolean verifyUserPassword(String providedPassword,  
                String securedPassword, String salt)  
        {  
            boolean finalval = false;  

            /* Generate New secure password with the same salt */  
            String newSecurePassword = generateSecurePassword(providedPassword, salt);  

            /* Check if two passwords are equal */  
            finalval = newSecurePassword.equalsIgnoreCase(securedPassword);  

            return finalval;  
        }  
    }
    
    class userData{
        
        private static String username = null;
        
        public static void setUser(String user){
            username = user;
        }
        public static String getUser(){
            return username;
        } 
    
    };
    class currentRoom{
        
        private static String room = null;
        private static String roomName = null;
        
        public static void setRoom(String user){
            room = user;
        }
        public static String getRoom(){
            return room;
        } 
        public static void setRoomName(String user){
            roomName = user;
        }
        public static String getRoomName(){
            return roomName;
        } 
    
    };
    class currentSession{
        
        private static String session = null;
        
        public static void setSession(String user){
            session = user;
        }
        public static String getSession(){
            return session;
        } 

    
    };

    public static Connection DBcon() {
        
        
        String dburl = "jdbc:postgresql://ep-aged-hill-388604.us-east-2.aws.neon.tech/neondb?user=yaseenashraf206&password=zO8JeFZyi4SQ";
        
        try{
            Connection c = DriverManager.getConnection(dburl);
            return c;
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
        
        return null;
    }
    

    
}
