package sdk_II_sdk;
import  java.io.*;
import java.net.*;
import java.net.InetAddress;
import java.lang.*;
class StartGaming
{
   public static void main (String[] args)throws IOException
   
   {    BufferedReader read = new BufferedReader (new InputStreamReader(System.in));
         System.out.println("Enter url");
        String url = read.readLine();
        ///InetAddress ippget = InetAddress.getLocalHost();  // for geting personal machin ip adress  // 
          ///  try{
       // InetAddress[]  inetAddresses = InetAddress.getAllByName(url);
            //   for(InetAddress ipadres: inetAddresses){
            //                System.out.println(ipadres);
            //   } 
      //       StringBuilder uri = new StringBuilder(url); 
      //       int FirstIndex = url.indexOf("//");
      //     // String NEWUrl =
      //      uri.delete(5, -1);
      //       System.out.println(uri);
      // System.out.println(InetAddress.getByName(url)); // this is for geting ip adress 
      //       // }
            //catch(UnknownHostException e){
            //   e.printStackTrace();
            //}
        URL aURL = new URL (url);
        //System.out.println ("protocal=" +aURL.getProtocol ());
        System.out.println("HOST=" + aURL.getHost());
        System.out.println("Athority=" + aURL.getAuthority());
        System.out.println("port=" + aURL.getDefaultPort());
        System.out.println("userINFo=" + aURL.getUserInfo());
        System.out.println("hashCode=" + aURL.hashCode());
        System.out.println("ref=" + aURL.getRef());
       // System.out.println("ip=" + ippget.getHostAddress().trim());

       
   
   }
}
