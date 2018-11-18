# Rest Api With Ssl

<h3>How to add ssl certificate to RestApi?</h3>

 * The first thing to do is placing the keystore file inside the Spring Boot project. 
   You may want to put it in the resources folder or the root folder.
   
<h3>How to do config?</h3>

 * In application.properties file;
 
      * server.ssl.enabled=true (for active ssl is ture, for passive ssl is false)
      * server.ssl.key-store-type=PKCS12 (cerfiticate format)
      * server.ssl.key-store=ssl/certificate.p12 (certificate path)
      * server.ssl.key-store-password=000000 (password of cartificate)
      * server.ssl.key-alias=tomcat (alias)
      
<h3>How to create certificate?</h3>

 * First of all, you need to generate a pair of cryptographic keys, used them to produce an SSL certificate and store it in a keystore. The keytool documentation defines a keystore as a database of “cryptographic keys, X.509 certificate chains, and trusted certificates”.
 The two most common formats used for keystores are JKS, a proprietary format specific for Java, and PKCS12, an industry standard format. JKS used to be the default choice, but now Oracle recommends to adopt the PKCS12 format.
 
 * Open your Terminal prompt and write the following command to create a JKS keystore:
    * keytool -genkeypair -alias tomcat -keyalg RSA -keysize 2048 -keystore keystore.jks -validity 3650 
    
 * If you want to create a PKCS12 keystore, and you should, the command is the following:
    * keytool -genkeypair -alias tomcat -keyalg RSA -keysize 2048 -storetype PKCS12 -keystore keystore.p12 -validity 3650 
    
    
 * You then will be asked to enter a password for the keystore. It must have at least 6 characters.

    * Enter keystore password: 
    * Re-enter new password:
    
 * Finally, you will be asked to input some information, but you are free to skip all of it (just press Return to skip an option). In the place of the first and last name, you may want to insert the base name of your host (in my case it is localhost).

    * What is your first and last name?
      * '[Unknown]: localhost'
    * What is the name of your organizational unit?
      * '[Unknown]:'  
    * What is the name of your organization?
      * '[Unknown]:'  
    * What is the name of your City or Locality?
      * '[Unknown]:'  
    * What is the name of your State or Province?
      * '[Unknown]:'  
    * What is the two-letter country code for this unit?
      * '[Unknown]:'  
    * Is CN=localhost, OU=Unknown, O=Unknown, L=Unknown, ST=Unknown, C=Unknown correct?
      * '[no]:  yes'

    * Enter key password for <tomcat>
      * (RETURN if same as keystore password):
      
 *At the end of this operation, we’ll get a keystore containing a brand new SSL certificate.
 
<h3>Used Technologies</h3> 

 * Java 8
 
 * Spring Boot
 
 * Mongo Db
 
 * Gradle
 
 <h3>Used Resources</h3> 
 * https://www.thomasvitale.com/https-spring-boot-ssl-certificate/
